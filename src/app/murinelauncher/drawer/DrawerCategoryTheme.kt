/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import android.content.Context
import android.content.res.ColorStateList
import android.view.ContextThemeWrapper
import androidx.core.graphics.ColorUtils
import app.murinelauncher.graphics.WorkspaceBlurUtils
import app.murinelauncher.graphics.WorkspaceBlurUtils.DrawerBlurType
import com.google.android.material.color.MaterialColors
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.ShapeAppearanceModel
import com.android.launcher3.R
import com.google.android.material.R as MaterialR

/** A real M3 theme scoped to drawer controls; Launcher3 itself uses a platform theme. */
object DrawerCategoryTheme {
    /**
     * Search and categories share a 28 dp rounded surface whose material follows the drawer type:
     * a frosted pane with an edge highlight, an opaque wallpaper-tinted surface, or flat neutral.
     * Context must be M3 themed.
     */
    @JvmStatic
    fun surface(context: Context): MaterialShapeDrawable = MaterialShapeDrawable(
        ShapeAppearanceModel.builder().setAllCornerSizes(28 * context.resources.displayMetrics.density).build(),
    ).apply {
        when (WorkspaceBlurUtils.getDrawerBlur()) {
            DrawerBlurType.GLASS -> {
                fillColor = ColorStateList.valueOf(context.getColor(R.color.drawer_control_color_glass))
                setStroke(context.resources.displayMetrics.density,
                    context.getColor(R.color.drawer_control_stroke_glass))
            }
            DrawerBlurType.MICA -> fillColor = ColorStateList.valueOf(MaterialColors.getColor(context,
                MaterialR.attr.colorSurfaceContainerHigh, "DrawerCategoryTheme"))
            DrawerBlurType.NONE -> fillColor =
                ColorStateList.valueOf(context.getColor(R.color.drawer_control_color_none))
        }
    }

    /**
     * The detached search action is a high-emphasis rounded square in the same material: a frosted
     * primary pane with the edge highlight, an opaque wallpaper-tinted primary, or flat neutral that
     * inverts the Translucent controls. Context must be M3 themed.
     */
    @JvmStatic
    fun searchAction(context: Context): MaterialShapeDrawable = MaterialShapeDrawable(
        ShapeAppearanceModel.builder().setAllCornerSizes(SEARCH_ACTION_CORNER_DP *
            context.resources.displayMetrics.density).build(),
    ).apply {
        val primary = MaterialColors.getColor(context, androidx.appcompat.R.attr.colorPrimary,
            "DrawerCategoryTheme")
        when (WorkspaceBlurUtils.getDrawerBlur()) {
            DrawerBlurType.GLASS -> {
                fillColor = ColorStateList.valueOf(ColorUtils.setAlphaComponent(primary, 0xD9))
                setStroke(context.resources.displayMetrics.density,
                    context.getColor(R.color.drawer_control_stroke_glass))
            }
            DrawerBlurType.MICA -> fillColor = ColorStateList.valueOf(primary)
            DrawerBlurType.NONE -> fillColor =
                ColorStateList.valueOf(context.getColor(R.color.drawer_search_action_color_none))
        }
    }

    @JvmStatic
    fun searchActionIcon(context: Context): Int = when (WorkspaceBlurUtils.getDrawerBlur()) {
        DrawerBlurType.NONE -> context.getColor(R.color.drawer_search_action_icon_none)
        else -> MaterialColors.getColor(context, MaterialR.attr.colorOnPrimary, "DrawerCategoryTheme")
    }

    const val SEARCH_ACTION_CORNER_DP = 20f

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
