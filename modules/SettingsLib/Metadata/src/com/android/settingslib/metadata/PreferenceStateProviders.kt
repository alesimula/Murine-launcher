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
import android.content.ContextWrapper
import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContract
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.LifecycleOwner
import com.android.settingslib.datastore.KeyValueStore
import kotlinx.coroutines.CoroutineScope

/**
 * Interface to provide dynamic preference title.
 *
 * Implement this interface implies that the preference title should not be cached for indexing.
 */
interface PreferenceTitleProvider {

    /** Provides preference title. */
    fun getTitle(context: Context): CharSequence?
}

/**
 * Provides preference title to be shown in search result.
 *
 * This is used to add more context to the title, and it is effective only when building indexable
 * data in [PreferenceSearchIndexablesProvider].
 */
interface PreferenceIndexableTitleProvider {

    /** Provides preference indexable title. */
    fun getIndexableTitle(context: Context): CharSequence?
}

/**
 * Interface to provide dynamic preference summary.
 *
 * Implement this interface implies that the preference summary should not be cached for indexing.
 */
interface PreferenceSummaryProvider {

    /** Provides preference summary. */
    fun getSummary(context: Context): CharSequence?
}

/**
 * Interface to provide dynamic preference icon.
 *
 * Implement this interface implies that the preference icon should not be cached for indexing.
 */
interface PreferenceIconProvider {

    /** Provides preference icon. */
    fun getIcon(context: Context): Int
}

/** Interface to provide information for settings search. */
interface PreferenceIndexableProvider {

    /**
     * Returns if preference is indexable for settings search.
     *
     * Return `false` only when the preference is unavailable for indexing on current device.
     *
     * Note:
     * - For [PreferenceScreenMetadata], all the preferences on the screen are not indexable if
     *   [isIndexable] returns `false`.
     * - If [PreferenceScreenMetadata.isEnabled] is implemented, it should also implement this
     *   interface to tell that the screen might be disabled and thus not accessible, in which case
     *   all the preferences on the screen are not indexable.
     * - Implement [PreferenceAvailabilityProvider] if it is available on condition but check
     *   [PreferenceAvailabilityProvider.isAvailable] inside [isIndexable] is optional. Unavailable
     *   preference is always non indexable no matter what [isIndexable] returns.
     */
    fun isIndexable(context: Context): Boolean
}

/** Interface to provide the state of preference availability. */
interface PreferenceAvailabilityProvider {

    /**
     * Returns if the preference is available.
     *
     * When unavailable (i.e. `false` returned),
     * - UI framework normally does not show the preference widget.
     * - If it is a preference screen, all children may be disabled (depends on UI framework
     *   implementation).
     */
    fun isAvailable(context: Context): Boolean
}

/**
 * Interface to provide the managed configuration state of the preference.
 *
 * See [Managed configurations](https://developer.android.com/work/managed-configurations) for the
 * Android Enterprise support.
 */
interface PreferenceRestrictionProvider {

    /** Returns if preference is restricted by managed configs. */
    fun isRestricted(context: Context): Boolean
}

/**
 * Preference lifecycle to deal with preference UI state.
 *
 * Implement this interface when preference depends on runtime conditions for UI update. Note that
 * [PreferenceMetadata] could be created for UI (shown in UI widget) or background (e.g. external
 * Get/Set), callbacks in this interface will ONLY be invoked when it is for UI.
 */
interface PreferenceLifecycleProvider {

    /**
     * Callbacks of preference fragment `onCreate`.
     *
     * Invoke [PreferenceLifecycleContext.notifyPreferenceChange] to update UI when any internal
     * state (e.g. availability, enabled state, title, summary) is changed.
     */
    fun onCreate(context: PreferenceLifecycleContext) {}

    /**
     * Callbacks of preference fragment `onStart`.
     *
     * Invoke [PreferenceLifecycleContext.notifyPreferenceChange] to update UI when any internal
     * state (e.g. availability, enabled state, title, summary) is changed.
     */
    fun onStart(context: PreferenceLifecycleContext) {}

    /**
     * Callbacks of preference fragment `onResume`.
     *
     * Invoke [PreferenceLifecycleContext.notifyPreferenceChange] to update UI when any internal
     * state (e.g. availability, enabled state, title, summary) is changed.
     */
    fun onResume(context: PreferenceLifecycleContext) {}

    /** Callbacks of preference fragment `onPause`. */
    fun onPause(context: PreferenceLifecycleContext) {}

    /** Callbacks of preference fragment `onStop`. */
    fun onStop(context: PreferenceLifecycleContext) {}

    /** Callbacks of preference fragment `onDestroy`. */
    fun onDestroy(context: PreferenceLifecycleContext) {}

    /**
     * Receives the result from a previous call of
     * [PreferenceLifecycleContext.startActivityForResult].
     *
     * @return true if the result is handled
     */
    fun onActivityResult(
        context: PreferenceLifecycleContext,
        requestCode: Int,
        resultCode: Int,
        data: Intent?,
    ): Boolean = false
}

/**
 * [Context] for preference lifecycle.
 *
 * A preference fragment is associated with a [PreferenceLifecycleContext] only.
 */
abstract class PreferenceLifecycleContext(context: Context) : ContextWrapper(context) {

    /** Returns the fragment [LifecycleOwner]. */
    abstract val lifecycleOwner: LifecycleOwner

    /**
     * [CoroutineScope] tied to the lifecycle, which is cancelled when the lifecycle is destroyed.
     *
     * @see [androidx.lifecycle.lifecycleScope]
     */
    abstract val lifecycleScope: CoroutineScope

    /**
     * Return the [FragmentManager] for interacting with fragments associated with current
     * fragment's activity.
     *
     * @see [androidx.fragment.app.Fragment.getParentFragmentManager]
     */
    abstract val fragmentManager: FragmentManager

    /**
     * Return a private `FragmentManager` for placing and managing Fragments inside of current
     * Fragment.
     *
     * @see [androidx.fragment.app.Fragment.getChildFragmentManager]
     */
    abstract val childFragmentManager: FragmentManager

    /** Returns the key of current preference screen. */
    abstract val preferenceScreenKey: String

    /** Returns the preference widget object associated with given key. */
    abstract fun <T> findPreference(key: String): T?

    /**
     * Returns the preference widget object associated with given key.
     *
     * @throws NullPointerException if preference is not found
     */
    open fun <T : Any> requirePreference(key: String): T = findPreference(key)!!

    /** Returns the [KeyValueStore] attached to the preference of given key *on the same screen*. */
    abstract fun getKeyValueStore(key: String): KeyValueStore?

    /** Notifies that preference state of given key is changed and updates preference widget UI. */
    abstract fun notifyPreferenceChange(key: String)

    /**
     * Switches to given preference hierarchy type for [PreferenceHierarchyGenerator].
     *
     * [PreferenceScreenMetadata.hasCompleteHierarchy] must return true.
     */
    abstract fun switchPreferenceHierarchy(hierarchyType: Any?)

    /**
     * Regenerates preference hierarchy.
     *
     * A new [PreferenceHierarchy] will be generated and applied to the preference screen. This is
     * to support the case that dynamic preference hierarchy is changed at runtime (e.g. app list
     * needs to be updated if new app is installed).
     *
     * [PreferenceScreenMetadata.hasCompleteHierarchy] must return true.
     */
    abstract fun regeneratePreferenceHierarchy()

    /**
     * Starts activity for result, see [android.app.Activity.startActivityForResult].
     *
     * This API can be invoked by any preference, the caller must ensure the request code is unique
     * on the preference screen.
     */
    abstract fun startActivityForResult(intent: Intent, requestCode: Int, options: Bundle?)

    /**
     * Register a request to start an activity, see [androidx.activity.result.ActivityResultCaller].
     *
     * Because this must be called unconditionally as part of the initialization path of the
     * Fragment, this API can only be invoked by a preference during
     * [PreferenceLifecycleProvider.onCreate].
     */
    abstract fun <I, O> registerForActivityResult(
        contract: ActivityResultContract<I, O>,
        callback: ActivityResultCallback<O>,
    ): ActivityResultLauncher<I>
}
