/*
 * Copyright 2026 r4l.launcher contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.RippleDrawable
import android.widget.ImageButton
import android.widget.ImageView
import androidx.core.graphics.ColorUtils
import com.android.launcher3.R

/** Search sits beside the category bar, so it never reads as another selected category. */
// Programmatic-only view: construction requires the search callback.
@SuppressLint("ViewConstructor")
class DrawerSearchAction(context: Context, onSearch: () -> Unit) : ImageButton(context) {
    init {
        id = R.id.drawer_category_search
        setImageResource(R.drawable.ic_allapps_search)
        scaleType = ImageView.ScaleType.FIT_CENTER
        val inset = ((SIZE_DP - ICON_DP) / 2 * resources.displayMetrics.density).toInt()
        setPadding(inset, inset, inset, inset)
        contentDescription = context.getString(R.string.all_apps_search_bar_hint)
        tooltipText = contentDescription
        setOnClickListener { onSearch() }
        refreshSurface()
    }

    /** Picks up a changed drawer type; the context must be M3 themed. */
    fun refreshSurface() {
        val icon = DrawerCategoryTheme.searchActionIcon(context)
        imageTintList = ColorStateList.valueOf(icon)
        val shape = DrawerCategoryTheme.searchAction(context)
        background = RippleDrawable(ColorStateList.valueOf(ColorUtils.setAlphaComponent(icon, 0x33)),
            shape, null)
    }

    companion object {
        const val SIZE_DP = 60
        const val GAP_DP = 8
        private const val ICON_DP = 28
    }
}
