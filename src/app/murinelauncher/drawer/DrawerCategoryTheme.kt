/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import android.content.Context
import android.view.ContextThemeWrapper
import androidx.core.graphics.ColorUtils
import com.android.launcher3.R
import com.google.android.material.R as MaterialR

/** A real M3 theme scoped to drawer controls; Launcher3 itself uses a platform theme. */
object DrawerCategoryTheme {
    fun wrap(context: Context): Context {
        val lightText = ColorUtils.calculateLuminance(
            context.getColor(R.color.all_apps_label_text_color),
        ) > 0.5
        return ContextThemeWrapper(context, if (lightText) {
            MaterialR.style.Theme_Material3_DynamicColors_Dark
        } else {
            MaterialR.style.Theme_Material3_DynamicColors_Light
        })
    }
}
