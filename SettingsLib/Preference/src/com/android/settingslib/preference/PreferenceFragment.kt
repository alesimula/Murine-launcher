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

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Looper
import android.util.Log
import androidx.annotation.XmlRes
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.preference.PreferenceDataStore
import androidx.preference.PreferenceScreen
import com.android.settingslib.datastore.KeyValueStore
import com.android.settingslib.metadata.EXTRA_BINDING_SCREEN_ARGS
import com.android.settingslib.metadata.EXTRA_BINDING_SCREEN_KEY
import com.android.settingslib.metadata.PreferenceHierarchy
import com.android.settingslib.metadata.PreferenceHierarchyGenerator
import com.android.settingslib.metadata.PreferenceScreenBindingKeyProvider
import com.android.settingslib.metadata.PreferenceScreenMetadata
import com.android.settingslib.metadata.PreferenceScreenRegistry
import com.android.settingslib.preference.PreferenceScreenBindingHelper.Companion.bindRecursively
import com.android.settingslib.widget.SettingsBasePreferenceFragment
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.job

/**
 * Fragment to display a preference screen for [PreferenceScreenMetadata].
 *
 * If the associated [PreferenceScreenMetadata] is [PreferenceHierarchyGenerator], subclass must
 * override [onSaveHierarchyType] and [onRestoreHierarchyType] to manage current preference
 * hierarchy type. This is necessary to support configuration changes.
 */
open class PreferenceFragment :
    SettingsBasePreferenceFragment(), PreferenceScreenProvider, PreferenceScreenBindingKeyProvider {

    private var preferenceScreenCreator: PreferenceScreenCreator? = null
    private var preferenceScreenCreatorInitialized = false

    protected var preferenceScreenBindingHelper: PreferenceScreenBindingHelper? = null
        private set

    /**
     * Current preference hierarchy type.
     *
     * This is used when the associated [PreferenceScreenMetadata] is
     * [PreferenceHierarchyGenerator]. Subclass could invoke [switchPreferenceHierarchy] to switch
     * preference hierarchy.
     */
    var preferenceHierarchyType: Any? = null
        internal set

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        preferenceScreen = createPreferenceScreen()
    }

    override fun setPreferenceScreen(preferenceScreen: PreferenceScreen?) {
        super.setPreferenceScreen(preferenceScreen)
        updateActivityTitle()
    }

    fun createPreferenceScreen(): PreferenceScreen? =
        createPreferenceScreen(PreferenceScreenFactory(this), newCoroutineScope())

    /**
     * Creates a new [CoroutineScope] for given preference hierarchy type.
     *
     * If a preference screen has multiple hierarchies for different types (see
     * [PreferenceHierarchyGenerator]), we need to cancel the old one and create a new
     * [CoroutineScope] when switch preference hierarchy.
     */
    internal fun newCoroutineScope(): CoroutineScope {
        val coroutineContext = lifecycleScope.coroutineContext
        val type = preferenceHierarchyType?.let { "($it)" } ?: ""
        val coroutineExceptionHandler = CoroutineExceptionHandler { context, exception ->
            Log.e(TAG, "Failed on ${preferenceScreenCreator?.bindingKey} with $context", exception)
        }
        return CoroutineScope(
            coroutineExceptionHandler +
                coroutineContext + // MUST put coroutineContext before SupervisorJob
                SupervisorJob(coroutineContext.job) +
                CoroutineName("CatalystFragmentScope$type")
        )
    }

    override fun createPreferenceScreen(
        factory: PreferenceScreenFactory,
        coroutineScope: CoroutineScope,
    ): PreferenceScreen? {
        val isUiThread = Looper.getMainLooper().thread === Thread.currentThread()
        if (isUiThread) {
            preferenceScreenBindingHelper?.onDestroy()
            preferenceScreenBindingHelper = null
        }

        val context = factory.context
        fun createPreferenceScreenFromResource() =
            factory.inflate(getPreferenceScreenResId(context))?.also {
                Log.i(TAG, "Load screen " + it.key + " from resource")
                onPreferenceScreenCreatedFromResource(it)
            }

        val screenCreator =
            getPreferenceScreenCreator(context) ?: return createPreferenceScreenFromResource()
        val preferenceBindingFactory = screenCreator.preferenceBindingFactory
        val preferenceHierarchy = newPreferenceHierarchy(context, coroutineScope)
        var storages = mutableMapOf<KeyValueStore, PreferenceDataStore>()
        val preferenceScreen =
            if (screenCreator.hasCompleteHierarchy()) {
                Log.i(TAG, "Load screen " + screenCreator.bindingKey + " from hierarchy")
                factory.getOrCreatePreferenceScreen().apply {
                    inflatePreferenceHierarchy(
                        preferenceBindingFactory,
                        preferenceHierarchy,
                        storages,
                    )
                }
            } else {
                Log.i(TAG, "Screen " + screenCreator.bindingKey + " is hybrid")
                createPreferenceScreenFromResource()?.also {
                    bindRecursively(it, preferenceBindingFactory, preferenceHierarchy, storages)
                } ?: return null
            }

        if (isUiThread) {
            preferenceScreenBindingHelper =
                PreferenceScreenBindingHelper(
                    this,
                    coroutineScope,
                    preferenceBindingFactory,
                    preferenceScreen,
                    preferenceHierarchy,
                    storages,
                )
        }
        return preferenceScreen
    }

    /** Callbacks when the [PreferenceScreen] is just created from XML resource by catalyst. */
    protected open fun onPreferenceScreenCreatedFromResource(preferenceScreen: PreferenceScreen) {}

    internal fun newPreferenceHierarchy(
        context: Context,
        coroutineScope: CoroutineScope,
    ): PreferenceHierarchy {
        val screenCreator = preferenceScreenCreator ?: throw IllegalStateException()
        val type = preferenceHierarchyType
        @Suppress("UNCHECKED_CAST")
        return if (type != null && (screenCreator as? PreferenceHierarchyGenerator<Any>) != null) {
            screenCreator.generatePreferenceHierarchy(context, coroutineScope, type)
        } else {
            screenCreator.getPreferenceHierarchy(context, coroutineScope)
        }
    }

    internal fun ensureHasCompleteHierarchy() {
        if (preferenceScreenCreator?.hasCompleteHierarchy() == false) throw IllegalStateException()
    }

    /** Returns the xml resource to create preference screen. */
    @XmlRes protected open fun getPreferenceScreenResId(context: Context): Int = 0

    protected fun getPreferenceScreenCreator(context: Context): PreferenceScreenCreator? {
        if (preferenceScreenCreatorInitialized) return preferenceScreenCreator
        preferenceScreenCreatorInitialized = true
        val screenCreator =
            (PreferenceScreenRegistry.create(
                    context,
                    getPreferenceScreenBindingKey(context),
                    getPreferenceScreenBindingArgs(context),
                ) as? PreferenceScreenCreator)
                ?.run { if (isFlagEnabled(context)) this else null }
        preferenceScreenCreator = screenCreator
        return screenCreator
    }

    override fun getPreferenceScreenBindingKey(context: Context): String? =
        arguments?.getString(EXTRA_BINDING_SCREEN_KEY)

    override fun getPreferenceScreenBindingArgs(context: Context): Bundle? =
        arguments?.getBundle(EXTRA_BINDING_SCREEN_ARGS)

    /**
     * Switches to given preference hierarchy type.
     *
     * The associated preference screen metadata must be [PreferenceHierarchyGenerator] and its
     * [PreferenceScreenMetadata.hasCompleteHierarchy] must return true.
     */
    protected fun switchPreferenceHierarchy(type: Any?) =
        preferenceScreenBindingHelper?.preferenceLifecycleContext?.switchPreferenceHierarchy(type)

    override fun onCreate(savedInstanceState: Bundle?) {
        preferenceHierarchyType = onRestoreHierarchyType(savedInstanceState)
        super.onCreate(savedInstanceState)
        preferenceScreenBindingHelper?.onCreate()
    }

    /** Restores preference hierarchy type from saved state. */
    open fun onRestoreHierarchyType(savedInstanceState: Bundle?): Any? = null

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        preferenceHierarchyType?.let { onSaveHierarchyType(outState, it) }
    }

    /** Saves preference hierarchy type to state. */
    open fun onSaveHierarchyType(outState: Bundle, hierarchyType: Any) {}

    override fun onStart() {
        super.onStart()
        preferenceScreenBindingHelper?.onStart()
    }

    override fun onResume() {
        super.onResume()
        // Even when activity has several fragments with preference screen, this will keep activity
        // title in sync when fragment manager pops back stack.
        updateActivityTitle()
        preferenceScreenBindingHelper?.onResume()
    }

    internal fun updateActivityTitle() {
        if (!lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)) return
        val activity = activity ?: return
        val title = preferenceScreen?.title ?: return
        if (activity.title != title) activity.title = title
    }

    override fun onPause() {
        preferenceScreenBindingHelper?.onPause()
        super.onPause()
    }

    override fun onStop() {
        preferenceScreenBindingHelper?.onStop()
        super.onStop()
    }

    override fun onDestroy() {
        preferenceScreenBindingHelper?.onDestroy()
        preferenceScreenBindingHelper = null
        super.onDestroy()
    }

    @Suppress("DEPRECATION")
    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        preferenceScreenBindingHelper?.onActivityResult(requestCode, resultCode, data)
    }

    /**
     * Returns the preference keys in the catalyst preference hierarchy.
     *
     * Note: async hierarchy is not included, subclass should override to add async preference keys.
     */
    protected open fun getPreferenceKeysInHierarchy(): MutableSet<String> =
        preferenceScreenBindingHelper?.let {
            mutableSetOf<String>().apply { it.forEachRecursively { add(it.metadata.bindingKey) } }
        } ?: mutableSetOf()

    companion object {
        private const val TAG = "PreferenceFragment"
    }
}
