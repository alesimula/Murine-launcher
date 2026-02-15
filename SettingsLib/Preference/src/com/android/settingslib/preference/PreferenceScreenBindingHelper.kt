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

package com.android.settingslib.preference

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContract
import androidx.lifecycle.Lifecycle
import androidx.preference.Preference
import androidx.preference.PreferenceDataStore
import androidx.preference.PreferenceGroup
import androidx.preference.PreferenceScreen
import com.android.settingslib.datastore.DataChangeReason
import com.android.settingslib.datastore.HandlerExecutor
import com.android.settingslib.datastore.KeyValueStore
import com.android.settingslib.datastore.KeyedDataObservable
import com.android.settingslib.datastore.KeyedObservable
import com.android.settingslib.datastore.KeyedObserver
import com.android.settingslib.metadata.EXTRA_BINDING_SCREEN_ARGS
import com.android.settingslib.metadata.PreferenceChangeReason
import com.android.settingslib.metadata.PreferenceHierarchy
import com.android.settingslib.metadata.PreferenceHierarchyNode
import com.android.settingslib.metadata.PreferenceLifecycleContext
import com.android.settingslib.metadata.PreferenceLifecycleProvider
import com.android.settingslib.metadata.PreferenceMetadata
import com.android.settingslib.metadata.PreferenceScreenMetadata
import com.android.settingslib.metadata.PreferenceScreenRegistry
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withTimeoutOrNull

/**
 * Helper to bind preferences on given [preferenceScreen].
 *
 * When there is any preference change event detected (e.g. preference value changed, runtime
 * states, dependency is updated), this helper class will re-bind [PreferenceMetadata] to update
 * widget UI.
 */
class PreferenceScreenBindingHelper(
    private val fragment: PreferenceFragment,
    private var coroutineScope: CoroutineScope,
    private val preferenceBindingFactory: PreferenceBindingFactory,
    private val preferenceScreen: PreferenceScreen,
    private var preferenceHierarchy: PreferenceHierarchy,
    private val storages: MutableMap<KeyValueStore, PreferenceDataStore>,
) : KeyedDataObservable<String>() {
    private var lifecycleState: Lifecycle.State = Lifecycle.State.INITIALIZED

    internal val preferenceLifecycleContext =
        object : PreferenceLifecycleContext(fragment.requireContext()) {
            override val lifecycleOwner
                get() = fragment

            override val lifecycleScope
                get() = coroutineScope

            override val fragmentManager
                get() = fragment.parentFragmentManager

            override val childFragmentManager
                get() = fragment.childFragmentManager

            override val preferenceScreenKey
                get() = preferenceScreen.key

            override fun <T> findPreference(key: String) =
                preferenceScreen.findPreference(key) as T?

            override fun getKeyValueStore(key: String) =
                findPreference<Preference>(key)?.preferenceDataStore?.findKeyValueStore()

            override fun notifyPreferenceChange(key: String) =
                notifyChange(key, PreferenceChangeReason.STATE)

            override fun switchPreferenceHierarchy(hierarchyType: Any?) {
                val context = fragment.context ?: return
                fragment.ensureHasCompleteHierarchy()
                fragment.preferenceHierarchyType = hierarchyType
                coroutineScope.cancel()
                coroutineScope = fragment.newCoroutineScope()
                preferenceHierarchy = fragment.newPreferenceHierarchy(context, coroutineScope)
                // remove all preferences with thread switch will cause UI flicker, so wait for a
                // moment to alleviate the situation
                coroutineScope.launch {
                    withTimeoutOrNull(1000) { preferenceHierarchy.awaitAnyChild() }
                    val state = lifecycleState
                    // pretend the lifecycle is finished for cleanup
                    onPause()
                    onStop()
                    onDestroy()
                    storages.clear()
                    preferenceScreen.removeAll()
                    preferenceScreen.inflatePreferenceHierarchy(
                        preferenceBindingFactory,
                        preferenceHierarchy,
                        storages,
                    )
                    initialize()
                    // advance the lifecycle state
                    if (state.isAtLeast(Lifecycle.State.CREATED)) onCreate()
                    if (state.isAtLeast(Lifecycle.State.STARTED)) onStart()
                    if (state.isAtLeast(Lifecycle.State.RESUMED)) onResume()
                }
            }

            override fun regeneratePreferenceHierarchy() {
                switchPreferenceHierarchy(fragment.preferenceHierarchyType)
            }

            @Suppress("DEPRECATION")
            override fun startActivityForResult(
                intent: Intent,
                requestCode: Int,
                options: Bundle?,
            ) = fragment.startActivityForResult(intent, requestCode, options)

            override fun <I, O> registerForActivityResult(
                contract: ActivityResultContract<I, O>,
                callback: ActivityResultCallback<O>,
            ) = fragment.registerForActivityResult(contract, callback)
        }

    private val preferences = mutableMapOf<String, PreferenceHierarchyNode>()
    private val dependencies = mutableMapOf<String, MutableSet<String>>()
    private val lifecycleAwarePreferences = mutableListOf<PreferenceLifecycleProvider>()
    private val observables = mutableMapOf<String, KeyedObservable<String>>()

    /** Observer to update UI on preference change. */
    private val preferenceObserver =
        KeyedObserver<String?> { key, reason -> onPreferenceChange(key, reason) }

    /** Observer to update UI for screen entry points when it is updated across screens. */
    private val screenEntryPointObserver =
        KeyedObserver<String?> { key, reason ->
            // Current preference screen must not be notified to avoid infinite loop.
            // Rewrite the reason to STATE because this change comes from different screen.
            if (key != preferenceScreen.key) onPreferenceChange(key, PreferenceChangeReason.STATE)
        }

    private val observer =
        KeyedObserver<String> { key, reason ->
            if (DataChangeReason.isDataChange(reason)) {
                notifyChange(key, PreferenceChangeReason.VALUE)
            } else {
                notifyChange(key, PreferenceChangeReason.STATE)
            }
        }

    init {
        initialize()
    }

    private fun initialize() {
        preferenceHierarchy.forEachRecursivelyAsync(::addNode, coroutineScope, ::addAsyncNode)

        val executor = HandlerExecutor.main
        addObserver(preferenceObserver, executor)
        // register observer to update other screen entry points on current screen
        screenEntryPointObservable.addObserver(screenEntryPointObserver, executor)

        preferenceScreen.forEachRecursively { addObserver(it, preferences[it.key]) }
    }

    private fun addNode(node: PreferenceHierarchyNode) {
        val metadata = node.metadata
        val key = metadata.bindingKey
        preferences[key] = node
        for (dependency in metadata.dependencies(preferenceScreen.context)) {
            dependencies.getOrPut(dependency) { mutableSetOf() }.add(key)
        }
        if (metadata is PreferenceLifecycleProvider) lifecycleAwarePreferences.add(metadata)
    }

    private fun addAsyncNode(parent: PreferenceHierarchy, node: PreferenceHierarchyNode) {
        val metadata = node.metadata
        val preferenceBinding = preferenceBindingFactory.getPreferenceBinding(metadata)!!
        val preferenceGroup =
            preferenceScreen.findPreference<PreferenceGroup>(parent.metadata.bindingKey)!!
        val preference = preferenceBinding.createWidget(preferenceScreen.context)
        preference.setPreferenceDataStore(
            metadata,
            preferenceHierarchy.metadata as PreferenceScreenMetadata,
            storages,
        )
        preferenceBindingFactory.bind(preference, node, preferenceBinding)
        // TODO: What if the highlighted preference happens to be in the async hierarchy
        preferenceGroup.addPreference(preference)
        addNode(node)
        addObserver(preference, node)
        (metadata as? PreferenceLifecycleProvider)?.advanceState()
    }

    private fun PreferenceLifecycleProvider.advanceState() {
        if (lifecycleState.isAtLeast(Lifecycle.State.CREATED)) onCreate(preferenceLifecycleContext)
        if (lifecycleState.isAtLeast(Lifecycle.State.STARTED)) onStart(preferenceLifecycleContext)
        if (lifecycleState.isAtLeast(Lifecycle.State.RESUMED)) onResume(preferenceLifecycleContext)
    }

    fun addObserver(preference: Preference, node: PreferenceHierarchyNode?) {
        val key = preference.key ?: return
        @Suppress("UNCHECKED_CAST")
        val observable =
            preference.preferenceDataStore?.findKeyValueStore()
                ?: (node?.metadata as? KeyedObservable<String>)
                ?: return
        observables[key] = observable
        observable.addObserver(key, observer, HandlerExecutor.main)
    }

    private fun PreferenceDataStore.findKeyValueStore(): KeyValueStore? =
        when (this) {
            is PreferenceDataStoreAdapter -> keyValueStore
            is PreferenceDataStoreDelegate -> delegate.findKeyValueStore()
            else -> null
        }

    private fun onPreferenceChange(key: String?, reason: Int) {
        if (key == null) return

        // bind preference to update UI
        preferenceScreen.findPreference<Preference>(key)?.let {
            val node = preferences[key] ?: return@let
            preferenceBindingFactory.bind(it, node)
            if (it == preferenceScreen) {
                fragment.updateActivityTitle()
                // Current screen is updated, notify to update entry point on previous screen
                screenEntryPointObservable.notifyChange(key, reason)
            }
        }

        // check reason to avoid potential infinite loop
        if (reason != PreferenceChangeReason.DEPENDENT) {
            notifyDependents(key, mutableSetOf())
        }
    }

    /** Notifies dependents recursively. */
    private fun notifyDependents(key: String, notifiedKeys: MutableSet<String>) {
        if (!notifiedKeys.add(key)) return
        val dependencies = dependencies[key] ?: return
        for (dependency in dependencies) {
            notifyChange(dependency, PreferenceChangeReason.DEPENDENT)
            notifyDependents(dependency, notifiedKeys)
        }
    }

    /** See [PreferenceHierarchy.forEachRecursively]. */
    fun forEachRecursively(action: (PreferenceHierarchyNode) -> Unit) =
        preferenceHierarchy.forEachRecursively(action)

    /** See [PreferenceHierarchy.forEachRecursivelyAsync]. */
    fun forEachAsyncRecursively(
        action: (PreferenceHierarchyNode) -> Unit,
        coroutineScope: CoroutineScope,
        asyncNodeAction: suspend (PreferenceHierarchy, PreferenceHierarchyNode) -> Unit,
    ) = preferenceHierarchy.forEachRecursivelyAsync(action, coroutineScope, asyncNodeAction)

    fun onCreate() {
        if (lifecycleState != Lifecycle.State.INITIALIZED) return
        lifecycleState = Lifecycle.State.CREATED
        for (preference in lifecycleAwarePreferences) {
            preference.onCreate(preferenceLifecycleContext)
        }
    }

    fun onStart() {
        if (lifecycleState != Lifecycle.State.CREATED) return
        lifecycleState = Lifecycle.State.STARTED
        for (preference in lifecycleAwarePreferences) {
            preference.onStart(preferenceLifecycleContext)
        }
    }

    fun onResume() {
        if (lifecycleState != Lifecycle.State.STARTED) return
        lifecycleState = Lifecycle.State.RESUMED
        for (preference in lifecycleAwarePreferences) {
            preference.onResume(preferenceLifecycleContext)
        }
    }

    fun onPause() {
        if (lifecycleState != Lifecycle.State.RESUMED) return
        lifecycleState = Lifecycle.State.STARTED
        for (preference in lifecycleAwarePreferences) {
            preference.onPause(preferenceLifecycleContext)
        }
    }

    fun onStop() {
        if (lifecycleState != Lifecycle.State.STARTED) return
        lifecycleState = Lifecycle.State.CREATED
        for (preference in lifecycleAwarePreferences) {
            preference.onStop(preferenceLifecycleContext)
        }
    }

    fun onDestroy() {
        if (lifecycleState != Lifecycle.State.CREATED) return
        lifecycleState = Lifecycle.State.INITIALIZED
        removeObserver(preferenceObserver)
        screenEntryPointObservable.removeObserver(screenEntryPointObserver)
        for ((key, observable) in observables) observable.removeObserver(key, observer)
        for (preference in lifecycleAwarePreferences) {
            preference.onDestroy(preferenceLifecycleContext)
        }
        preferences.clear()
        observables.clear()
        dependencies.clear()
        lifecycleAwarePreferences.clear()
    }

    fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        lifecycleAwarePreferences.firstOrNull {
            it.onActivityResult(preferenceLifecycleContext, requestCode, resultCode, data)
        }
    }

    companion object {
        private const val TAG = "MetadataBindingHelper"

        /**
         * A global [KeyedObservable] to notify UI rebinding for screen entry points. This field
         * needs to be static as screens could be shown by different activities.
         *
         * Ideally the screen metadata should add observers to notify change and then this logic is
         * redundant. However, observer mechanism may not be available across screens, so introduce
         * this enhancement to avoid potential UI consistency issue.
         */
        private val screenEntryPointObservable: KeyedObservable<String> = KeyedDataObservable()

        /** Updates preference screen that has incomplete hierarchy. */
        @JvmStatic
        fun bind(preferenceScreen: PreferenceScreen, coroutineScope: CoroutineScope) {
            val context = preferenceScreen.context
            val args = preferenceScreen.peekExtras()?.getBundle(EXTRA_BINDING_SCREEN_ARGS)
            PreferenceScreenRegistry.create(context, preferenceScreen.key, args)?.run {
                if (!hasCompleteHierarchy()) {
                    val preferenceBindingFactory =
                        (this as? PreferenceScreenCreator)?.preferenceBindingFactory ?: return
                    bindRecursively(
                        preferenceScreen,
                        preferenceBindingFactory,
                        getPreferenceHierarchy(context, coroutineScope),
                        mutableMapOf(),
                    )
                }
            }
        }

        internal fun bindRecursively(
            preferenceScreen: PreferenceScreen,
            preferenceBindingFactory: PreferenceBindingFactory,
            preferenceHierarchy: PreferenceHierarchy,
            storages: MutableMap<KeyValueStore, PreferenceDataStore>,
        ) {
            val preferenceScreenMetadata = preferenceHierarchy.metadata as PreferenceScreenMetadata

            fun PreferenceHierarchy.bindRecursively(preferenceGroup: PreferenceGroup) {
                preferenceBindingFactory.bind(preferenceGroup, this)
                val preferences = mutableMapOf<String, PreferenceHierarchyNode>()
                forEach { preferences[it.metadata.bindingKey] = it }
                for (index in 0 until preferenceGroup.preferenceCount) {
                    val preference = preferenceGroup.getPreference(index)
                    val node = preferences.remove(preference.key) ?: continue
                    if (node is PreferenceHierarchy) {
                        node.bindRecursively(preference as PreferenceGroup)
                    } else {
                        preference.setPreferenceDataStore(
                            node.metadata,
                            preferenceScreenMetadata,
                            storages,
                        )
                        preferenceBindingFactory.bind(preference, node)
                    }
                }
                val iterator = preferences.iterator()
                while (iterator.hasNext()) {
                    val node = iterator.next().value
                    val metadata = node.metadata
                    val binding = preferenceBindingFactory.getPreferenceBinding(metadata)
                    if (binding !is PreferenceBindingPlaceholder) continue
                    iterator.remove()
                    val preference = binding.createWidget(preferenceGroup.context)
                    preference.setPreferenceDataStore(
                        node.metadata,
                        preferenceScreenMetadata,
                        storages,
                    )
                    preferenceBindingFactory.bind(preference, node, binding)
                    preferenceGroup.addPreference(preference)
                }
                if (preferences.isNotEmpty()) {
                    Log.w(TAG, "Metadata not bound: ${preferences.keys}")
                }
            }

            preferenceHierarchy.bindRecursively(preferenceScreen)
        }
    }
}
