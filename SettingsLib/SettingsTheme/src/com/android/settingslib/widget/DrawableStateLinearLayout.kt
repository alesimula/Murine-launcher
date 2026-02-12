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
import android.widget.LinearLayout
import androidx.annotation.AttrRes
import androidx.annotation.StyleRes

/** This is a simple wrapper for [LinearLayout] that allows setting an extra drawable state. */
class DrawableStateLinearLayout : LinearLayout, DrawableStateLayout {
    override var extraDrawableState: IntArray? = null
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(
        context: Context,
        attrs: AttributeSet?,
        @AttrRes defStyleAttr: Int
    ) : super(context, attrs, defStyleAttr)

    constructor(
        context: Context,
        attrs: AttributeSet?,
        @AttrRes defStyleAttr: Int,
        @StyleRes defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes)

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val extraDrawableState =
            extraDrawableState ?: return super.onCreateDrawableState(extraSpace)
        return mergeDrawableStates(
            super.onCreateDrawableState(extraSpace + extraDrawableState.size),
            extraDrawableState
        )
    }
}
