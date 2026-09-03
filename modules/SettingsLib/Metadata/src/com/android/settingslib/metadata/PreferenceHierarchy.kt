/*
 * Copyright (C) 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settingslib.metadata

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.annotation.VisibleForTesting
import java.util.concurrent.CancellationException
import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.selects.select

/** A node in preference hierarchy that is associated with [PreferenceMetadata]. */
open class PreferenceHierarchyNode internal constructor(val metadata: PreferenceMetadata) {
    /**
     * Preference order in the hierarchy.
     *
     * When a preference appears on different screens, different order values could be specified.
     */
    var order: Int? = null
        internal set
}

/**
 * Preference hierarchy describes the structure of preferences recursively. Async sub-hierarchy is
 * supported (see [addAsync]).
 *
 * A root hierarchy represents a preference screen. A sub-hierarchy represents a preference group.
 */
class PreferenceHierarchy : PreferenceHierarchyNode {
    private val context: Context

    /**
     * Children of the hierarchy.
     *
     * Each item is either [PreferenceHierarchyNode], [PreferenceHierarchy] or [Deferred] (async sub
     * hierarchy).
     */
    @VisibleForTesting internal val children = mutableListOf<Any>()

    internal constructor(context: Context, group: PreferenceGroup) : super(group) {
        this.context = context
    }

    private constructor(context: Context) : super(AsyncPreferenceMetadata) {
        this.context = context
    }

    /** Adds a preference to the hierarchy. */
    operator fun PreferenceMetadata.unaryPlus() = +PreferenceHierarchyNode(this)

    /**
     * Adds preference screen with given key (as a placeholder) to the hierarchy.
     *
     * This is mainly to support Android Settings overlays. OEMs might want to custom some of the
     * screens. In resource-based hierarchy, it leverages the resource overlay. In terms of DSL or
     * programmatic hierarchy, it will be a problem to specify concrete screen metadata objects.
     * Instead, use preference screen key as a placeholder in the hierarchy and screen metadata will
     * be looked up from [PreferenceScreenRegistry] lazily at runtime.
     *
     * @throws NullPointerException if screen is not registered to [PreferenceScreenRegistry]
     */
    operator fun String.unaryPlus() = addPreferenceScreen(this, null)

    /** Removes preference with given key from the hierarchy. */
    operator fun String.unaryMinus() {
        val (hierarchy, index) = findPreference(this) ?: return
        hierarchy.children.removeAt(index)
    }

    /**
     * Adds parameterized preference screen with given key (as a placeholder) to the hierarchy.
     *
     * @see String.unaryPlus
     */
    infix fun String.args(args: Bundle) = createPreferenceScreenHierarchy(this, args)

    operator fun PreferenceHierarchyNode.unaryPlus() = also { children.add(it) }

    /** Specifies preference order in the hierarchy. */
    infix fun PreferenceHierarchyNode.order(order: Int) = apply { this.order = order }

    /** Specifies preference order in the hierarchy for group. */
    infix fun PreferenceHierarchy.order(order: Int) = apply { this.order = order }

    /** Adds a preference to the hierarchy. */
    @JvmOverloads
    fun add(metadata: PreferenceMetadata, order: Int? = null) {
        PreferenceHierarchyNode(metadata).also {
            it.order = order
            children.add(it)
        }
    }

    /**
     * Adds a sub hierarchy with coroutine.
     *
     * Notes:
     * - As it is async, coroutine could be finished anytime. Consider specify an order explicitly
     *   to achieve deterministic hierarchy.
     * - The sub hierarchy is flattened into current hierarchy.
     * - Recursive async hierarchy is supported.
     * - Use API that ends with `Async` (e.g. [forEachAsync], [forEachRecursivelyAsync]) to access
     *   the sub async hierarchy.
     *
     * @param coroutineScope parent coroutine scope to build the structure concurrency, so that
     *   cancel the [coroutineScope] should cancel all the pending tasks
     * @param coroutineContext context to run the coroutine, e.g. `Dispatchers.IO`
     * @param block coroutine code to provide the sub hierarchy
     */
    fun addAsync(
        coroutineScope: CoroutineScope,
        coroutineContext: CoroutineContext,
        block: suspend PreferenceHierarchy.() -> Unit,
    ) {
        val deferred =
            coroutineScope.async(coroutineContext, CoroutineStart.DEFAULT) {
                PreferenceHierarchy(context).apply { block() }
            }
        children.add(deferred)
    }

    /** Adds a preference to the hierarchy before given key. */
    fun addBefore(key: String, metadata: PreferenceMetadata) {
        val (hierarchy, index) = findPreference(key) ?: (this to children.size)
        hierarchy.children.add(index, PreferenceHierarchyNode(metadata))
    }

    /** Adds a preference group to the hierarchy before given key. */
    fun addGroupBefore(key: String, group: PreferenceGroup): PreferenceHierarchy {
        val (hierarchy, index) = findPreference(key) ?: (this to children.size)
        return PreferenceHierarchy(context, group).also { hierarchy.children.add(index, it) }
    }

    /** Adds a preference to the hierarchy after given key. */
    fun addAfter(key: String, metadata: PreferenceMetadata) {
        val (hierarchy, index) = findPreference(key) ?: (this to children.size - 1)
        hierarchy.children.add(index + 1, PreferenceHierarchyNode(metadata))
    }

    /** Adds a preference group to the hierarchy after given key. */
    fun addGroupAfter(key: String, group: PreferenceGroup): PreferenceHierarchy {
        val (hierarchy, index) = findPreference(key) ?: (this to children.size - 1)
        return PreferenceHierarchy(context, group).also { hierarchy.children.add(index + 1, it) }
    }

    /** Manipulates hierarchy on a preference group with given key. */
    fun onGroup(key: String, init: PreferenceHierarchy.() -> Unit) =
        findPreference(key)!!.apply { init(first.children[second] as PreferenceHierarchy) }

    private fun findPreference(key: String): Pair<PreferenceHierarchy, Int>? {
        children.forEachIndexed { index, node ->
            if (node !is PreferenceHierarchyNode) return@forEachIndexed
            if (node.metadata.bindingKey == key) return this to index
            if (node is PreferenceHierarchy) {
                val result = node.findPreference(key)
                if (result != null) return result
            }
        }
        return null
    }

    /** Adds a preference group to the hierarchy. */
    operator fun PreferenceGroup.unaryPlus() =
        PreferenceHierarchy(context, this).also { children.add(it) }

    /** Adds a preference group and returns its preference hierarchy. */
    @JvmOverloads
    fun addGroup(group: PreferenceGroup, order: Int? = null): PreferenceHierarchy =
        PreferenceHierarchy(context, group).also {
            it.order = order
            children.add(it)
        }

    /**
     * Adds parameterized preference screen with given key (as a placeholder) to the hierarchy.
     *
     * @see addPreferenceScreen
     */
    fun addParameterizedScreen(screenKey: String, args: Bundle) =
        addPreferenceScreen(screenKey, args)

    /**
     * Adds preference screen with given key (as a placeholder) to the hierarchy.
     *
     * This is mainly to support Android Settings overlays. OEMs might want to custom some of the
     * screens. In resource-based hierarchy, it leverages the resource overlay. In terms of DSL or
     * programmatic hierarchy, it will be a problem to specify concrete screen metadata objects.
     * Instead, use preference screen key as a placeholder in the hierarchy and screen metadata will
     * be looked up from [PreferenceScreenRegistry] lazily at runtime.
     *
     * @throws NullPointerException if screen is not registered to [PreferenceScreenRegistry]
     */
    fun addPreferenceScreen(screenKey: String) = addPreferenceScreen(screenKey, null)

    private fun addPreferenceScreen(screenKey: String, args: Bundle?): PreferenceHierarchyNode =
        createPreferenceScreenHierarchy(screenKey, args).also { children.add(it) }

    private fun createPreferenceScreenHierarchy(screenKey: String, args: Bundle?) =
        PreferenceHierarchyNode(PreferenceScreenRegistry.create(context, screenKey, args)!!)

    /** Extensions to add more preferences to the hierarchy. */
    operator fun PreferenceHierarchy.plusAssign(init: PreferenceHierarchy.() -> Unit) = init(this)

    /**
     * Traversals preference hierarchy and applies given action.
     *
     * NOTE: Async sub hierarchy is NOT included.
     */
    fun forEach(action: (PreferenceHierarchyNode) -> Unit) {
        for (child in children) {
            if (child is PreferenceHierarchyNode) action(child)
        }
    }

    /**
     * Traversals preference hierarchy and applies given action.
     *
     * NOTE: Async sub hierarchy is inflated and included to the action.
     */
    suspend fun forEachAsync(action: suspend (PreferenceHierarchyNode) -> Unit) {
        for (child in children) {
            when (child) {
                is PreferenceHierarchyNode -> action(child)
                is Deferred<*> -> child.awaitPreferenceHierarchy()?.forEachAsync(action)
            }
        }
    }

    /**
     * Traversals preference hierarchy recursively and applies given action.
     *
     * NOTE: Async sub hierarchy is NOT included.
     */
    fun forEachRecursively(action: (PreferenceHierarchyNode) -> Unit) {
        action(this)
        for (child in children) {
            if (child is PreferenceHierarchy) {
                child.forEachRecursively(action)
            } else if (child is PreferenceHierarchyNode) {
                action(child)
            }
        }
    }

    /**
     * Traversals preference hierarchy recursively and applies given action.
     *
     * NOTE: Async sub hierarchy is inflated and included to the action.
     */
    suspend fun forEachRecursivelyAsync(action: suspend (PreferenceHierarchyNode) -> Unit) {
        action(this)
        // async hierarchy is included by forEachAsync
        forEachAsync {
            when (it) {
                is PreferenceHierarchy -> it.forEachRecursivelyAsync(action)
                else -> action(it)
            }
        }
    }

    /** Await until any child is available to be processed immediately. */
    suspend fun awaitAnyChild() {
        if (children.isEmpty()) return
        for (child in children) if (child !is Deferred<*>) return
        select<Unit> {
            for (child in children) {
                if (child is Deferred<*>) child.onAwait { it }
            }
        }
    }

    /**
     * Traversals preference hierarchy recursively.
     *
     * @param action action to perform on the static nodes (provided synchronously)
     * @param coroutineScope coroutine scope to run the [asyncAction]
     * @param asyncAction action to perform on the async nodes (provided via [addAsync])
     */
    fun forEachRecursivelyAsync(
        action: (PreferenceHierarchyNode) -> Unit,
        coroutineScope: CoroutineScope,
        asyncAction: suspend (PreferenceHierarchy, PreferenceHierarchyNode) -> Unit,
    ) {
        fun Any.handleDeferred(parent: PreferenceHierarchy) {
            @Suppress("UNCHECKED_CAST") val deferred = this as Deferred<PreferenceHierarchy>
            deferred.invokeOnCompletion {
                if (it != null) {
                    if (it !is CancellationException) {
                        Log.w(TAG, "$deferred completed with exception", it)
                    }
                    return@invokeOnCompletion
                }
                coroutineScope.launch {
                    suspend fun Any.handleAsyncNode(parent: PreferenceHierarchy) {
                        if (this is PreferenceHierarchyNode) {
                            asyncAction(parent, this)
                            if (this is PreferenceHierarchy) {
                                for (node in children) node.handleAsyncNode(this)
                            }
                        } else {
                            handleDeferred(parent)
                        }
                    }
                    val hierarchy = deferred.awaitPreferenceHierarchy()
                    if (hierarchy != null) {
                        for (node in hierarchy.children) node.handleAsyncNode(parent)
                    }
                }
            }
        }
        action(this)
        for (child in children) {
            when (child) {
                is PreferenceHierarchy ->
                    child.forEachRecursivelyAsync(action, coroutineScope, asyncAction)
                is PreferenceHierarchyNode -> action(child)
                else -> child.handleDeferred(this)
            }
        }
    }

    /**
     * Finds the [PreferenceMetadata] associated with given key in the hierarchy.
     *
     * Note: sub async hierarchy will not be searched, use [findAsync] if needed.
     */
    fun find(key: String): PreferenceMetadata? {
        if (metadata.bindingKey == key) return metadata
        for (child in children) {
            if (child is Deferred<*>) continue
            if (child is PreferenceHierarchy) {
                val result = child.find(key)
                if (result != null) return result
            } else {
                child as PreferenceHierarchyNode
                if (child.metadata.bindingKey == key) return child.metadata
            }
        }
        return null
    }

    /**
     * Finds the [PreferenceMetadata] associated with given key in the whole hierarchy (including
     * sub async hierarchy).
     */
    suspend fun findAsync(key: String): PreferenceMetadata? = find(key) ?: findAsyncHierarchy(key)

    private suspend fun findAsyncHierarchy(key: String): PreferenceMetadata? {
        for (child in children) {
            val result = (child as? Deferred<*>)?.awaitPreferenceHierarchy()?.findAsync(key)
            if (result != null) return result
        }
        return null
    }

    @Suppress("UNCHECKED_CAST")
    private suspend fun Deferred<*>.awaitPreferenceHierarchy(): PreferenceHierarchy? =
        try {
            // maybe support timeout in future
            await() as PreferenceHierarchy
        } catch (e: Exception) {
            val coroutineContext = currentCoroutineContext()
            when (e) {
                is CancellationException -> coroutineContext.ensureActive()
                else -> Log.w(TAG, "fail to await hierarchy $coroutineContext", e)
            }
            null
        }

    companion object {
        private const val TAG = "PreferenceHierarchy"
    }
}

/** A dummy [PreferenceMetadata] for async hierarchy. */
private object AsyncPreferenceMetadata : PreferenceMetadata {
    override val key: String
        get() = ""
}

/**
 * Builder function to create [PreferenceHierarchy] in
 * [DSL](https://kotlinlang.org/docs/type-safe-builders.html) manner.
 */
fun PreferenceScreenMetadata.preferenceHierarchy(
    context: Context,
    init: PreferenceHierarchy.() -> Unit,
) = PreferenceHierarchy(context, this).also(init)
