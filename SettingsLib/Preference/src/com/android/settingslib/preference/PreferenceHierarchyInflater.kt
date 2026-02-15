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

import androidx.preference.Preference
import androidx.preference.PreferenceDataStore
import androidx.preference.PreferenceGroup
import androidx.preference.PreferenceScreen
import com.android.settingslib.datastore.KeyValueStore
import com.android.settingslib.metadata.PersistentPreference
import com.android.settingslib.metadata.PreferenceHierarchy
import com.android.settingslib.metadata.PreferenceMetadata
import com.android.settingslib.metadata.PreferenceScreenMetadata

/** Inflates [PreferenceHierarchy] into given [PreferenceGroup] recursively. */
fun PreferenceScreen.inflatePreferenceHierarchy(
    preferenceBindingFactory: PreferenceBindingFactory,
    hierarchy: PreferenceHierarchy,
    storages: MutableMap<KeyValueStore, PreferenceDataStore>,
) =
    inflatePreferenceHierarchy(
        hierarchy.metadata as PreferenceScreenMetadata,
        preferenceBindingFactory,
        hierarchy,
        storages,
    )

/** Inflates [PreferenceHierarchy] into given [PreferenceGroup] recursively. */
private fun PreferenceGroup.inflatePreferenceHierarchy(
    preferenceScreenMetadata: PreferenceScreenMetadata,
    preferenceBindingFactory: PreferenceBindingFactory,
    hierarchy: PreferenceHierarchy,
    storages: MutableMap<KeyValueStore, PreferenceDataStore>,
) {
    preferenceBindingFactory.bind(this, hierarchy)
    hierarchy.forEach {
        val metadata = it.metadata
        val preferenceBinding =
            preferenceBindingFactory.getPreferenceBinding(metadata) ?: return@forEach
        val preference = preferenceBinding.createWidget(context)
        if (it is PreferenceHierarchy) {
            val preferenceGroup = preference as PreferenceGroup
            // MUST add preference before binding, otherwise exception is raised when add child
            addPreference(preferenceGroup)
            preferenceGroup.inflatePreferenceHierarchy(
                preferenceScreenMetadata,
                preferenceBindingFactory,
                it,
                storages,
            )
        } else {
            preference.setPreferenceDataStore(metadata, preferenceScreenMetadata, storages)
            preferenceBindingFactory.bind(preference, it, preferenceBinding)
            // MUST add preference after binding for persistent preference to get initial value
            // (preference key is set within bind method)
            addPreference(preference)
        }
    }
}

internal fun Preference.setPreferenceDataStore(
    metadata: PreferenceMetadata,
    screenMetadata: PreferenceScreenMetadata,
    storages: MutableMap<KeyValueStore, PreferenceDataStore>,
) {
    (metadata as? PersistentPreference<*>)?.storage(context)?.let { storage ->
        preferenceDataStore =
            storages.getOrPut(storage) { storage.toPreferenceDataStore(screenMetadata, metadata) }
    }
}
