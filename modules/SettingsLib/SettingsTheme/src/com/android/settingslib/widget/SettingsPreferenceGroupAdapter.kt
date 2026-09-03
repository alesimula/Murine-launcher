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

import android.annotation.SuppressLint
import android.graphics.Rect
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.util.TypedValue
import android.view.View
import androidx.annotation.DrawableRes
import androidx.preference.Preference
import androidx.preference.PreferenceCategory
import androidx.preference.PreferenceGroup
import androidx.preference.PreferenceGroupAdapter
import androidx.preference.PreferenceViewHolder
import com.android.settingslib.widget.theme.R

/**
 * This is an extension over [PreferenceGroupAdapter] that allows creating visual sections for
 * preferences. It sets the following drawable states on item views when they are a
 * [DrawableStateLayout]:
 * - [android.R.attr.state_single] if the item is the only one in a section
 * - [android.R.attr.state_first] if the item is the first one in a section
 * - [android.R.attr.state_middle] if the item is neither the first one or the last one in a section
 * - [android.R.attr.state_last] if the item is the last one in a section
 *
 * Note that [androidx.preference.PreferenceManager.PreferenceComparisonCallback] isn't supported
 * (yet).
 */
@SuppressLint("RestrictedApi")
open class SettingsPreferenceGroupAdapter(preferenceGroup: PreferenceGroup) :
    PreferenceGroupAdapter(preferenceGroup) {

    private val mPreferenceGroup = preferenceGroup
    private var mItemPositionStates = intArrayOf()

    private var mNormalPaddingStart = 0
    private var mGroupPaddingStart = 0
    private var mNormalPaddingEnd = 0
    private var mGroupPaddingEnd = 0
    @DrawableRes private var mLegacyBackgroundRes: Int

    private val mHandler = Handler(Looper.getMainLooper())

    private val syncRunnable = Runnable { updatePreferencesList() }

    init {
        val context = preferenceGroup.context
        mNormalPaddingStart =
            context.resources.getDimensionPixelSize(R.dimen.settingslib_expressive_space_small1)
        mGroupPaddingStart = mNormalPaddingStart * 2
        mNormalPaddingEnd =
            context.resources.getDimensionPixelSize(R.dimen.settingslib_expressive_space_small1)
        mGroupPaddingEnd = mNormalPaddingEnd * 2
        val outValue = TypedValue()
        context.theme.resolveAttribute(
            android.R.attr.selectableItemBackground,
            outValue,
            true, /* resolveRefs */
        )
        mLegacyBackgroundRes = outValue.resourceId
        updatePreferencesList()
    }

    override fun onPreferenceHierarchyChange(preference: Preference) {
        super.onPreferenceHierarchyChange(preference)

        if (SettingsThemeHelper.isExpressiveTheme(preference.context)) {
            // Post after super class has posted their sync runnable to update preferences.
            mHandler.removeCallbacks(syncRunnable)
            mHandler.post(syncRunnable)
        }
    }

    @SuppressLint("RestrictedApi")
    override fun onBindViewHolder(holder: PreferenceViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)

        if (SettingsThemeHelper.isExpressiveTheme(holder.itemView.context)) {
            updateBackground(holder, position)
        }
    }

    private fun updatePreferencesList() {
        if (!SettingsThemeHelper.isExpressiveTheme(mPreferenceGroup.context)) {
            return
        }

        val oldItemPositionStates = mItemPositionStates
        mItemPositionStates = buildItemPositionStates()
        if (!(mItemPositionStates contentEquals oldItemPositionStates)) {
            notifyOnlyChangedItems(oldItemPositionStates, mItemPositionStates)
        }
    }

    /** Notify any registered observers if the new list's items changed. */
    private fun notifyOnlyChangedItems(oldList: IntArray, newList: IntArray) {
        val minLength = minOf(oldList.size, newList.size)

        for (position in 0 until minLength) {
            if (oldList[position] != newList[position]) {
                notifyItemChanged(position)
            }
        }

        // If the remaining items are from the new list, notify about all of them
        val remainingItems = newList.size - minLength

        if (remainingItems > 0) {
            notifyItemRangeChanged(minLength, remainingItems)
        }
    }

    private fun buildItemPositionStates(): IntArray {
        val itemCount = itemCount
        val itemPositionStates = IntArray(itemCount)

        var prevItemIndex = -2
        var previousParent: Preference? = null
        var currentParent: Preference? = null
        for (i in 0..<itemCount) {
            val preference = getItem(i)!!
            // If the preference is a group divider, skip this index (resulting in new group)
            if (isGroupDivider(preference)) {
                itemPositionStates[i] = 0
                continue
            }

            // Start a new group if any of the following are true:
            //     - We're at the first index
            //     - We've skipped an index
            //     - We've hit an expanded Expandable parent
            //     - We've changed parent (except: if parent is null, or we hit an Expandable child)
            previousParent = currentParent
            currentParent = preference.parent
            val isExpandedParent = preference is Expandable && preference.isExpanded()
            val isExpandedChild = currentParent is Expandable && currentParent.isExpanded()
            val changedParent = previousParent != currentParent && currentParent != null
            if (prevItemIndex != i - 1 || isExpandedParent || (changedParent && !isExpandedChild)) {
                closeGroup(itemPositionStates, prevItemIndex)
                itemPositionStates[i] = android.R.attr.state_first
                prevItemIndex = i
            } else {
                // Otherwise, continue current group
                itemPositionStates[i] = android.R.attr.state_middle
                prevItemIndex = i
            }
        }
        // Close current group
        closeGroup(itemPositionStates, prevItemIndex)
        return itemPositionStates
    }

    private fun closeGroup(itemPositionStates: IntArray, i: Int) {
        if (i >= 0) {
            itemPositionStates[i] =
                when (itemPositionStates[i]) {
                    0 -> 0
                    android.R.attr.state_first -> android.R.attr.state_single
                    else -> android.R.attr.state_last
                }
        }
    }

    /** handle roundCorner background */
    private fun updateBackground(holder: PreferenceViewHolder, position: Int) {
        val v = holder.itemView
        val drawableStateLayout = holder.itemView as? DrawableStateLayout
        if (drawableStateLayout != null && mItemPositionStates[position] != 0) {
            if (v.background == null) {
                // Make sure the stateful drawable is set for expressive UI
                v.setBackgroundResource(R.drawable.settingslib_round_background_stateful)
            }

            val background = v.background
            if (background != null) {
                val backgroundPadding = Rect()
                background.getPadding(backgroundPadding)
                // We can't remove the padding set in XML because the same layout was also
                // used when expressive theme isn't enabled, or when expressive theme is enabled
                // but this adapter isn't used. Hence, we have to do setPaddingRelative() here
                // to apply the padding from the background.
                v.setPadding(
                    backgroundPadding.left,
                    backgroundPadding.top,
                    backgroundPadding.right,
                    backgroundPadding.bottom,
                )
            }
            val iconFrame =
                holder.findViewById(androidx.preference.R.id.icon_frame)
                    ?: holder.findViewById(android.R.id.icon_frame)
            val hasIconSpace = iconFrame != null && iconFrame.visibility != View.GONE
            drawableStateLayout.extraDrawableState =
                stateSetOf(mItemPositionStates[position], hasIconSpace)
        } else { // Handle the background of the preferences that are group divider
            val backgroundRes = getRoundCornerDrawableRes(position, isSelected = false)
            val (paddingStart, paddingEnd) = getStartEndPadding(position)
            v.setPaddingRelative(paddingStart, v.paddingTop, paddingEnd, v.paddingBottom)
            v.clipToOutline = backgroundRes != 0
            v.setBackgroundResource(backgroundRes)
        }
    }

    private fun getStartEndPadding(position: Int): Pair<Int, Int> {
        val item = getItem(position)
        if (position >= mItemPositionStates.size) {
            Log.e(TAG, "IndexOutOfBounds: ${item?.title} in $position")
            return 0 to 0
        }
        val positionState = mItemPositionStates[position]
        return when {
            // This item handles edge to edge itself
            item is NormalPaddingMixin && item is GroupSectionDividerMixin -> 0 to 0
            // Item is placed directly on screen needs to have extra padding
            item is OnScreenWidgetMixin -> {
                val extraPadding = item.context.resources.getDimensionPixelSize(
                    R.dimen.settingslib_expressive_space_extrasmall4)
                mNormalPaddingStart + extraPadding to mNormalPaddingEnd + extraPadding
            }

            // This item should have normal padding if either:
            // - this item's positionState == 0 (which denotes that it is a section divider item
            //   such as a GroupSectionDividerMixin or PreferenceCategory), or
            // - this preference is a NormalPaddingMixin.
            positionState == 0 || item is NormalPaddingMixin ->
                mNormalPaddingStart to mNormalPaddingEnd

            // Other items are suppose to have group padding.
            else -> mGroupPaddingStart to mGroupPaddingEnd
        }
    }

    @DrawableRes
    @JvmOverloads
    protected fun getRoundCornerDrawableRes(
        position: Int,
        isSelected: Boolean,
        isHighlighted: Boolean = false,
    ): Int {
        if (position !in mItemPositionStates.indices) {
            return 0
        }
        val positionState = mItemPositionStates[position]
        return when (positionState) {
            // preference is the first of the section
            android.R.attr.state_first -> {
                if (isSelected) R.drawable.settingslib_round_background_top_selected
                else if (isHighlighted) R.drawable.settingslib_round_background_top_highlighted
                else R.drawable.settingslib_round_background_top
            }
            // preference is in the center of the section
            android.R.attr.state_middle -> {
                if (isSelected) R.drawable.settingslib_round_background_center_selected
                else if (isHighlighted) R.drawable.settingslib_round_background_center_highlighted
                else R.drawable.settingslib_round_background_center
            }
            // preference is the last of the section
            android.R.attr.state_last -> {
                if (isSelected) R.drawable.settingslib_round_background_bottom_selected
                else if (isHighlighted) R.drawable.settingslib_round_background_bottom_highlighted
                else R.drawable.settingslib_round_background_bottom
            }
            // preference is the only one in the section
            android.R.attr.state_single -> {
                if (isSelected) R.drawable.settingslib_round_background_selected
                else if (isHighlighted) R.drawable.settingslib_round_background_highlighted
                else R.drawable.settingslib_round_background
            }
            // preference is not part of a section
            else -> 0
        }
    }

    protected fun isGroupDivider(preference: Preference) =
        preference is GroupSectionDividerMixin || preference is PreferenceCategory
                || preference is SpacePreference

    companion object {
        private val TAG = "SettingsPrefGroupAdapter"
        private val STATE_SET_NONE = intArrayOf()
        private val STATE_SET_SINGLE = intArrayOf(android.R.attr.state_single)
        private val STATE_SET_FIRST = intArrayOf(android.R.attr.state_first)
        private val STATE_SET_MIDDLE = intArrayOf(android.R.attr.state_middle)
        private val STATE_SET_LAST = intArrayOf(android.R.attr.state_last)
        private val STATE_SET_SINGLE_HAS_ICON_SPACE =
            intArrayOf(android.R.attr.state_single, R.attr.state_has_icon_space)
        private val STATE_SET_FIRST_HAS_ICON_SPACE =
            intArrayOf(android.R.attr.state_first, R.attr.state_has_icon_space)
        private val STATE_SET_MIDDLE_HAS_ICON_SPACE =
            intArrayOf(android.R.attr.state_middle, R.attr.state_has_icon_space)
        private val STATE_SET_LAST_HAS_ICON_SPACE =
            intArrayOf(android.R.attr.state_last, R.attr.state_has_icon_space)

        private fun stateSetOf(
            positionState: Int,
            hasIconSpace: Boolean
        ): IntArray =
            when {
                positionState == android.R.attr.state_single ->
                    if (hasIconSpace) STATE_SET_SINGLE_HAS_ICON_SPACE else STATE_SET_SINGLE
                positionState == android.R.attr.state_first ->
                    if (hasIconSpace) STATE_SET_FIRST_HAS_ICON_SPACE else STATE_SET_FIRST
                positionState == android.R.attr.state_middle ->
                    if (hasIconSpace) STATE_SET_MIDDLE_HAS_ICON_SPACE else STATE_SET_MIDDLE
                positionState == android.R.attr.state_last ->
                    if (hasIconSpace) STATE_SET_LAST_HAS_ICON_SPACE else STATE_SET_LAST
                else -> error(positionState)
            }
    }
}
