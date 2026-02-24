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

package com.android.settingslib.widget

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.core.view.isGone
import androidx.preference.Preference
import androidx.preference.PreferenceViewHolder
import com.android.settingslib.widget.preference.segmentedbutton.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.button.MaterialButtonToggleGroup

class SegmentedButtonPreference @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : Preference(context, attrs, defStyleAttr, defStyleRes), GroupSectionDividerMixin {
    private var buttonGroup: MaterialButtonToggleGroup? = null
    private var buttonLabels: MutableList<TextView> = mutableListOf()
    private var buttonCheckedListener: MaterialButtonToggleGroup.OnButtonCheckedListener? = null

    // Data to be applied during onBindViewHolder
    private val buttonSetupData =
        mutableMapOf<Int, Pair<String, SegmentedButtonIcon>>() // (index, text, icon)
    private val buttonVisibilityData = mutableMapOf<Int, Boolean>() // (index, visibility)
    private val buttonEnableData = mutableMapOf<Int, Boolean>() // (index, enable)

    // Default checked button
    private var checkedIndex: Int = -1

    init {
        layoutResource = R.layout.settingslib_expressive_preference_segmentedbutton
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)
        holder.isDividerAllowedBelow = false
        holder.isDividerAllowedAbove = false

        buttonGroup = holder.findViewById(R.id.button_group) as MaterialButtonToggleGroup?
        buttonLabels.add(0, holder.findViewById(R.id.button_1_text) as TextView)
        buttonLabels.add(1, holder.findViewById(R.id.button_2_text) as TextView)
        buttonLabels.add(2, holder.findViewById(R.id.button_3_text) as TextView)
        buttonLabels.add(3, holder.findViewById(R.id.button_4_text) as TextView)

        // Apply stored data
        applyButtonSetupData()
        applyButtonVisibilityData()
        applyButtonEnableData()
        buttonGroup?.apply {
            clearOnButtonCheckedListeners()
            applyCheckIndex(checkedIndex)
            buttonCheckedListener?.let { listener ->
                addOnButtonCheckedListener(listener)
            }
        }
    }

    fun setUpButton(index: Int, text: String, @DrawableRes icon: Int) {
        buttonSetupData.put(index, Pair(text, SegmentedButtonIcon.ResourceIcon(icon)))
        notifyChanged()
    }

    fun setUpButton(index: Int, text: String, icon: Drawable) {
        buttonSetupData.put(index, Pair(text, SegmentedButtonIcon.DrawableIcon(icon)))
        notifyChanged()
    }

    fun setButtonVisibility(index: Int, visible: Boolean) {
        buttonVisibilityData.put(index, visible)
        notifyChanged()
    }

    fun setButtonEnabled(index: Int, enabled: Boolean) {
        buttonEnableData.put(index, enabled)
        notifyChanged()
    }

    fun setCheckedIndex(index: Int) {
        checkedIndex = index
        notifyChanged()
    }

    fun getCheckedIndex(): Int {
        val checkedButtonId = buttonGroup?.checkedButtonId ?: return -1
        return buttonGroup?.indexOfChild(buttonGroup?.findViewById(checkedButtonId)) ?: -1
    }

    fun setOnButtonClickListener(listener: MaterialButtonToggleGroup.OnButtonCheckedListener) {
        buttonCheckedListener = listener
        notifyChanged()
    }

    fun removeOnButtonClickListener() {
        buttonCheckedListener = null
        notifyChanged()
    }

    private fun applyButtonSetupData() {
        // The button group is default gone to avoid NullPointerException
        // if all children's visibility are GONE.
        if(buttonSetupData.isNotEmpty()) {
            buttonGroup?.isGone = false
        }
        for ((index, config) in buttonSetupData) {
            applyButtonSetupData(index, config.first, config.second)
        }
    }

    private fun applyButtonVisibilityData() {
        for ((index, visible) in buttonVisibilityData) {
            applyButtonVisibilityData(index, visible)
        }
    }

    private fun applyButtonEnableData() {
        for ((index, enable) in buttonEnableData) {
            applyButtonEnableData(index, enable)
        }
    }

    private fun applyButtonSetupData(index: Int, text: String, icon: SegmentedButtonIcon) {
        when (icon) {
            is SegmentedButtonIcon.ResourceIcon ->
                (buttonGroup?.getChildAt(index) as? MaterialButton)?.setIconResource(icon.resId)

            is SegmentedButtonIcon.DrawableIcon ->
                (buttonGroup?.getChildAt(index) as? MaterialButton)?.icon = icon.drawable
        }
        buttonLabels[index].text = text
    }

    private fun applyButtonVisibilityData(index: Int, visible: Boolean) {
        buttonGroup?.getChildAt(index)?.isGone = !visible
        buttonLabels[index].isGone = !visible
    }

    private fun applyButtonEnableData(index: Int, enabled: Boolean) {
        buttonGroup?.getChildAt(index)?.isEnabled = enabled
    }

    private fun applyCheckIndex(index: Int) {
        val button = buttonGroup?.getChildAt(index) ?: run {
            buttonGroup?.clearChecked()
            return
        }
        if (button.id == View.NO_ID || button.isGone) {
            buttonGroup?.clearChecked()
            return
        }

        buttonGroup?.check(button.id)
    }

    private sealed interface SegmentedButtonIcon {
        data class DrawableIcon(val drawable: Drawable) : SegmentedButtonIcon

        data class ResourceIcon(@DrawableRes val resId: Int) : SegmentedButtonIcon
    }
}
