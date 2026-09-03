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
import android.content.Intent
import android.os.Bundle
import androidx.annotation.AnyThread
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Interface provides preference metadata (title, summary, icon, etc.).
 *
 * Besides the existing APIs, subclass could integrate with following interface to provide more
 * information:
 * - [PreferenceTitleProvider]: provide dynamic title content
 * - [PreferenceSummaryProvider]: provide dynamic summary content (e.g. based on preference value)
 * - [PreferenceIconProvider]: provide dynamic icon content (e.g. based on flag)
 * - [PreferenceIndexableProvider]: provide if it is indexable dynamically
 * - [PreferenceAvailabilityProvider]: provide preference availability (e.g. based on flag)
 * - [PreferenceLifecycleProvider]: provide the lifecycle callbacks and notify state change
 *
 * Notes:
 * - UI framework support:
 *     - This class does not involve any UI logic, it is the data layer.
 *     - Subclass could integrate with datastore and UI widget to provide UI layer. For instance,
 *       `PreferenceBinding` supports Jetpack Preference binding.
 * - Datastore:
 *     - Subclass should implement the [PersistentPreference] to note that current preference is
 *       persistent in datastore.
 *     - It is always recommended to support back up preference value changed by user. Typically,
 *       the back up and restore happen within datastore, the [allowBackup] API is to mark if
 *       current preference value should be backed up (backup allowed by default).
 * - Preference indexing for search:
 *     - Override [isIndexable] API to mark if preference is indexable (enabled by default).
 *     - If [isIndexable] returns true, preference title and summary will be indexed with cache.
 *       More indexing data could be provided through [keywords].
 *     - Settings search will cache the preference title/summary/keywords for indexing. The cache is
 *       invalidated when system locale changed, app upgraded, etc.
 *     - Dynamic content is not suitable to be cached for indexing. Subclass that implements
 *       [PreferenceTitleProvider] / [PreferenceSummaryProvider] will not have its title / summary
 *       indexed.
 */
@AnyThread
interface PreferenceMetadata {

    /** Preference key. */
    val key: String

    /** Preference key when attached to preference hierarchy. */
    val bindingKey: String
        get() = key

    /**
     * Preference title resource id.
     *
     * Implement [PreferenceTitleProvider] if title is generated dynamically.
     */
    val title: Int
        @StringRes get() = 0

    /**
     * Preference summary resource id.
     *
     * Implement [PreferenceSummaryProvider] if summary is generated dynamically (e.g. summary is
     * provided per preference value)
     */
    val summary: Int
        @StringRes get() = 0

    /** Icon of the preference. */
    val icon: Int
        @DrawableRes get() = 0

    /**
     * Returns if preference is indexable for settings search.
     *
     * The override should return constant value `true` / `false` only, and implement
     * [PreferenceIndexableProvider] if the result is determined dynamically.
     *
     * Note: If [indexable] of a [PreferenceScreenMetadata] returns `false`, all the preferences on
     * the screen are not indexable.
     */
    val indexable: Boolean
        get() = true

    /** Additional keywords for indexing. */
    val keywords: Int
        @StringRes get() = 0

    /**
     * Return the extras Bundle object associated with this preference.
     *
     * It is used to provide more *internal* information for metadata. External app is not expected
     * to use this information as it could be changed in future. Consider [tags] for external usage.
     */
    fun extras(context: Context): Bundle? = null

    /**
     * Returns the tags associated with this preference.
     *
     * Unlike [extras], tags are exposed for external usage. The returned tag list must be constants
     * and **append only**. Do not edit/delete existing tag strings as it can cause backward
     * compatibility issue.
     *
     * Use cases:
     * - identify a specific preference
     * - identify a group of preferences related to network settings
     */
    fun tags(context: Context): Array<String> = arrayOf()

    /**
     * Returns if the preference is available on condition, which indicates its availability could
     * be changed at runtime and should not be cached (e.g. for indexing).
     *
     * [PreferenceAvailabilityProvider] subclass returns `true` by default. For [PreferenceMetadata]
     * that are generated programmatically should also return `true` even it does not implement
     * [PreferenceAvailabilityProvider].
     */
    val isAvailableOnCondition: Boolean
        get() = this is PreferenceAvailabilityProvider

    /**
     * Returns if preference is enabled.
     *
     * UI framework normally does not allow user to interact with the preference widget when it is
     * disabled.
     *
     * If [PreferenceScreenMetadata.isEnabled] is override and `false` value is returned
     * potentially, [PreferenceIndexableProvider] should be implemented to indicate that the screen
     * might not be accessible and thus no indexable.
     */
    fun isEnabled(context: Context): Boolean = true

    /**
     * Returns the keys of depended preferences.
     *
     * Keep in mind that the dependency is effective only on the same screen. For cross screen
     * dependency, especially for preference screen entry point, add observer (e.g. on the depended
     * preference's data store) explicitly to update the preference with
     * [PreferenceLifecycleProvider].
     */
    fun dependencies(context: Context): Array<String> = arrayOf()

    /** Returns if the preference is persistent in datastore. */
    fun isPersistent(context: Context): Boolean = false

    /**
     * Returns if preference value backup is allowed (by default returns `true` if preference is
     * persistent).
     */
    fun allowBackup(context: Context): Boolean = isPersistent(context)

    /** Returns preference intent. */
    fun intent(context: Context): Intent? = null
}

/** Metadata of preference group. */
@AnyThread
interface PreferenceGroup : PreferenceMetadata {

    override val indexable
        get() = title != 0
}

/** Metadata of preference category. */
@AnyThread
open class PreferenceCategory(override val key: String, override val title: Int) : PreferenceGroup
