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
import android.util.AttributeSet
import android.view.ViewGroup
import androidx.core.content.res.TypedArrayUtils
import androidx.core.content.withStyledAttributes
import androidx.preference.Preference
import androidx.preference.PreferenceViewHolder
import com.android.settingslib.widget.theme.R

/**
 * A blank preference that has a specified height by android:layout_height. It can be used to fine
 * tune screens that combine custom layouts and standard preferences.
 */
class SpacePreference
@JvmOverloads
constructor(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int =
        TypedArrayUtils.getAttr(context, androidx.preference.R.attr.preferenceStyle, android.R.attr.preferenceStyle),
    defStyleRes: Int = 0,
) : Preference(context, attrs, defStyleAttr, defStyleRes) {
    private var mHeight: Int = 0

    init {
        layoutResource = R.layout.settingslib_space_preference

        context.withStyledAttributes(
            attrs,
            intArrayOf(android.R.attr.layout_height),
            defStyleAttr,
            defStyleRes,
        ) {
            mHeight = getDimensionPixelSize(0, 0)
        }
    }

    fun setHeight(height: Int) {
        mHeight = height
    }

    override fun onBindViewHolder(view: PreferenceViewHolder) {
        super.onBindViewHolder(view)
        view.isDividerAllowedAbove = false
        view.isDividerAllowedBelow = false
        val params = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, mHeight)
        view.itemView.layoutParams = params
    }
}

