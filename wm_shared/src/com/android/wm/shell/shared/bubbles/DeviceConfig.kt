/*
 * Copyright (C) 2023 The Android Open Source Project
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

package com.android.wm.shell.shared.bubbles

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.content.res.Configuration
import android.content.res.Configuration.ORIENTATION_LANDSCAPE
import android.graphics.Rect
import android.os.Build
import android.view.View.LAYOUT_DIRECTION_RTL
import android.view.WindowInsets
import android.view.WindowManager
import androidx.core.graphics.Insets
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.max

import com.android.wm.shell.shared.ShellSharedConstants.SMALL_TABLET_MAX_EDGE_DP

/** Contains device configuration used for positioning bubbles on the screen. */
data class DeviceConfig(
        val isLargeScreen: Boolean,
        val isSmallTablet: Boolean,
        val isLandscape: Boolean,
        val isRtl: Boolean,
        val windowBounds: Rect,
        val insets: Insets
) {
    companion object {

        private const val LARGE_SCREEN_MIN_EDGE_DP = 600

        @JvmStatic
        fun create(context: Context, windowManager: WindowManager): DeviceConfig {
            val config: Configuration = context.resources.configuration
            val isLandscape = config.orientation == ORIENTATION_LANDSCAPE
            val isRtl = config.layoutDirection == LAYOUT_DIRECTION_RTL

            val windowBounds = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                windowManager.currentWindowMetrics.bounds
            } else {
                val displayMetrics = context.resources.displayMetrics
                Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels)
            }


            val finalInsets: androidx.core.graphics.Insets = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                val metricInsets = windowManager.currentWindowMetrics.windowInsets
                val platformInsets = metricInsets.getInsetsIgnoringVisibility(
                    WindowInsets.Type.navigationBars() or
                            WindowInsets.Type.statusBars() or
                            WindowInsets.Type.displayCutout()
                )
                androidx.core.graphics.Insets.of(platformInsets.left, platformInsets.top, platformInsets.right, platformInsets.bottom)
            } else {
                val compatInsets = getLegacyInsets(context)
                compatInsets.getInsets(
                    WindowInsetsCompat.Type.navigationBars() or
                            WindowInsetsCompat.Type.statusBars() or
                            WindowInsetsCompat.Type.displayCutout()
                )
            }

            return DeviceConfig(
                isLargeScreen = isLargeScreen(config),
                isSmallTablet = isSmallTablet(context),
                isLandscape = isLandscape,
                isRtl = isRtl,
                windowBounds = windowBounds,
                insets = finalInsets // This is now a unified Insets object
            )
        }

        private fun getLegacyInsets(context: Context): WindowInsetsCompat {
            val activity = context as? Activity
                ?: (context as? ContextWrapper)?.baseContext as? Activity
            val decorView = activity?.window?.decorView

            return if (decorView != null) {
                ViewCompat.getRootWindowInsets(decorView) ?: WindowInsetsCompat.CONSUMED
            } else {
                // If we really have no View, we return an empty builder
                WindowInsetsCompat.Builder().build()
            }
        }

        @JvmStatic
        fun isSmallTablet(context: Context): Boolean {
            val config: Configuration = context.resources.configuration
            if (!isLargeScreen(config)) {
                return false
            }
            val largestEdgeDp = max(config.screenWidthDp, config.screenHeightDp)
            return largestEdgeDp < SMALL_TABLET_MAX_EDGE_DP
        }

        private fun isLargeScreen(config: Configuration) =
            config.smallestScreenWidthDp >= LARGE_SCREEN_MIN_EDGE_DP
    }
}
