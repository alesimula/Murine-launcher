/*
 * Copyright (C) 2026 The Android Open Source Project
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
package app.murinelauncher.icons

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import androidx.core.graphics.ColorUtils
import com.android.launcher3.icons.DotRenderer
import com.android.launcher3.icons.ShadowGenerator
import kotlin.math.max
import kotlin.math.min

/**
 * Draws notification counts using the same anchor and color as notification dots;
 * Adapted from VoltageOS's implementation.
 */
class NotificationBadgeCounter {
    private val mBackgroundPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val mTextPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val mBadgeBounds = RectF()
    private var mBackgroundWithShadow: Bitmap? = null
    private var mShadowWidth = 0
    private var mShadowHeight = 0
    private var mBitmapOffset = 0f

    fun draw(canvas: Canvas, renderer: DotRenderer?, params: DotRenderer.DrawParams?, dotColor: Int, count: Int) {
        if (renderer == null || params == null || count <= 0 || params.scale <= 0) return

        val countText = if (count > MAX_DISPLAY_COUNT) MAX_DISPLAY_COUNT.toString() + "+" else count.toString()
        val iconBounds = params.iconBounds
        val dotPosition = if (params.leftAlign) renderer.getLeftDotPosition() else renderer.getRightDotPosition()
        val dotCenterX = iconBounds.left + iconBounds.width() * dotPosition[0]
        val dotCenterY = iconBounds.top + iconBounds.height() * dotPosition[1]

        val badgeHeight: Int = max(1, Math.round(SIZE_PERCENTAGE * iconBounds.width()))
        mTextPaint.setTextAlign(Paint.Align.CENTER)
        mTextPaint.setFakeBoldText(true)
        mTextPaint.setTextSize(badgeHeight * TEXT_SIZE_PERCENTAGE)
        mTextPaint.setColor(getTextColor(dotColor))

        val badgeWidth: Int = max(badgeHeight,
            Math.round(mTextPaint.measureText(countText) + badgeHeight * HORIZONTAL_PADDING_PERCENTAGE * 2))
        val backgroundWithShadow = getBackgroundWithShadow(badgeWidth, badgeHeight)
        val shadowRadius = backgroundWithShadow.getWidth() / 2f

        val canvasBounds = canvas.getClipBounds()
        val offsetX = if (params.leftAlign) max(0f, canvasBounds.left - (dotCenterX - shadowRadius)) else
            min(0f, canvasBounds.right - (dotCenterX + shadowRadius))
        val offsetY = max(0f, canvasBounds.top - (dotCenterY - shadowRadius))

        canvas.save()
        canvas.translate(dotCenterX + offsetX, dotCenterY + offsetY)
        canvas.scale(params.scale, params.scale)

        canvas.drawBitmap(backgroundWithShadow, mBitmapOffset, mBitmapOffset, mBackgroundPaint)

        mBackgroundPaint.setColor(dotColor)
        mBadgeBounds.set(
            -badgeWidth / 2f, -badgeHeight / 2f,
            badgeWidth / 2f, badgeHeight / 2f
        )
        canvas.drawRoundRect(mBadgeBounds, badgeHeight / 2f, badgeHeight / 2f, mBackgroundPaint)

        val fontMetrics = mTextPaint.getFontMetrics()
        val textBaseline = -(fontMetrics.ascent + fontMetrics.descent) / 2
        canvas.drawText(countText, 0f, textBaseline, mTextPaint)
        canvas.restore()
    }

    private fun getBackgroundWithShadow(width: Int, height: Int): Bitmap {
        if (mBackgroundWithShadow == null || mShadowWidth != width || mShadowHeight != height) {
            val builder = ShadowGenerator.Builder(Color.TRANSPARENT)
            builder.ambientShadowAlpha = DotRenderer.AMBIENT_SHADOW_ALPHA
            mBackgroundWithShadow = builder.setupBlurForSize(height).createPill(width, height)
            mBitmapOffset = -mBackgroundWithShadow!!.getHeight() * 0.5f
            mShadowWidth = width
            mShadowHeight = height
        }
        return mBackgroundWithShadow!!
    }

    companion object {
        private const val SIZE_PERCENTAGE = 0.26f
        private const val TEXT_SIZE_PERCENTAGE = 0.70f
        private const val HORIZONTAL_PADDING_PERCENTAGE = 0.32f
        private const val MIN_TEXT_CONTRAST = 4.5
        private const val MAX_DISPLAY_COUNT = 99

        private fun getTextColor(backgroundColor: Int) =
            if (ColorUtils.calculateContrast(Color.WHITE, backgroundColor) >= MIN_TEXT_CONTRAST) Color.WHITE else Color.BLACK
    }
}
