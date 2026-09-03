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
import androidx.preference.Preference
import androidx.preference.PreferenceCategory
import androidx.preference.SwitchPreferenceCompat
import androidx.preference.TwoStatePreference
import com.android.settingslib.metadata.PreferenceMetadata

/** Binding of preference category associated with [PreferenceCategory]. */
interface PreferenceCategoryBinding : PreferenceBinding {

    override fun createWidget(context: Context) = PreferenceCategory(context)

    companion object {
        @JvmStatic val INSTANCE = object : PreferenceCategoryBinding {}
    }
}

/** A boolean value type preference associated with the abstract [TwoStatePreference]. */
interface BooleanValuePreferenceBinding : PreferenceBinding {

    override fun bind(preference: Preference, metadata: PreferenceMetadata) {
        super.bind(preference, metadata)
        (preference as TwoStatePreference).apply {
            // MUST suppress persistent when initializing the checked state:
            //   1. default value is written to datastore if not set (b/396260949)
            //   2. avoid redundant read to the datastore
            val suppressPersistent = isPersistent
            if (suppressPersistent) isPersistent = false
            // "false" is kind of placeholder, metadata datastore should provide the default value
            isChecked = preferenceDataStore!!.getBoolean(key, false)
            if (suppressPersistent) isPersistent = true
        }
    }
}

/** A boolean value type preference associated with [SwitchPreferenceCompat]. */
interface SwitchPreferenceBinding : BooleanValuePreferenceBinding {

    override fun createWidget(context: Context): Preference = SwitchPreferenceCompat(context)

    companion object {
        @JvmStatic val INSTANCE = object : SwitchPreferenceBinding {}
    }
}
