/*
 * Copyright (C) 2025 The Android Open Source Project
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

package com.android.settingslib.widget

import android.content.Context
import androidx.preference.Preference
import com.android.settingslib.metadata.IntRangeValuePreference
import com.android.settingslib.metadata.PreferenceMetadata
import com.android.settingslib.preference.PreferenceBinding

/** [PreferenceBinding] for [SliderPreference]. */
interface SliderPreferenceBinding : PreferenceBinding {

    override fun createWidget(context: Context) = SliderPreference(context)

    override fun bind(preference: Preference, metadata: PreferenceMetadata) {
        super.bind(preference, metadata)
        metadata as IntRangeValuePreference
        (preference as SliderPreference).apply {
            // set min/max before set value
            min = metadata.getMinValue(context)
            max = metadata.getMaxValue(context)
            sliderIncrement = metadata.getIncrementStep(context)

            // MUST suppress persistent when initializing the value, otherwise:
            //   1. default value is written to datastore if not set
            //   2. redundant read issued to the datastore
            val suppressPersistent = isPersistent
            if (suppressPersistent) isPersistent = false
            // "0" is kind of placeholder, metadata datastore should provide the default value
            value = preferenceDataStore!!.getInt(key, 0)
            if (suppressPersistent) isPersistent = true
        }
    }
}
