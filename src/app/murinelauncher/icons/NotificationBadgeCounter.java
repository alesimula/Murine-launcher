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
package app.murinelauncher.icons;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

import androidx.core.graphics.ColorUtils;

import com.android.launcher3.icons.DotRenderer;
import com.android.launcher3.icons.ShadowGenerator;

/**
 * Draws notification counts using the same anchor and color as notification dots;
 * Adapted from VoltageOS's implementation.
 */
public class NotificationBadgeCounter {

    private static final float SIZE_PERCENTAGE = 0.26f;
    private static final float TEXT_SIZE_PERCENTAGE = 0.70f;
    private static final float HORIZONTAL_PADDING_PERCENTAGE = 0.32f;
    private static final double MIN_TEXT_CONTRAST = 4.5;
    private static final int MAX_DISPLAY_COUNT = 99;

    private final Paint mBackgroundPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final Paint mTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final RectF mBadgeBounds = new RectF();
    private Bitmap mBackgroundWithShadow;
    private int mShadowWidth;
    private int mShadowHeight;
    private float mBitmapOffset;

    public void draw(Canvas canvas, DotRenderer renderer, DotRenderer.DrawParams params,
            int dotColor, int count) {
        if (renderer == null || params == null || count <= 0 || params.scale <= 0) {
            return;
        }

        String countText = count > MAX_DISPLAY_COUNT
                ? MAX_DISPLAY_COUNT + "+"
                : String.valueOf(count);
        Rect iconBounds = params.iconBounds;
        float[] dotPosition = params.leftAlign
                ? renderer.getLeftDotPosition()
                : renderer.getRightDotPosition();
        float dotCenterX = iconBounds.left + iconBounds.width() * dotPosition[0];
        float dotCenterY = iconBounds.top + iconBounds.height() * dotPosition[1];

        int badgeHeight = Math.max(1, Math.round(SIZE_PERCENTAGE * iconBounds.width()));
        mTextPaint.setTextAlign(Paint.Align.CENTER);
        mTextPaint.setFakeBoldText(true);
        mTextPaint.setTextSize(badgeHeight * TEXT_SIZE_PERCENTAGE);
        mTextPaint.setColor(getTextColor(dotColor));

        int badgeWidth = Math.max(badgeHeight, Math.round(mTextPaint.measureText(countText)
                + badgeHeight * HORIZONTAL_PADDING_PERCENTAGE * 2));
        Bitmap backgroundWithShadow = getBackgroundWithShadow(badgeWidth, badgeHeight);
        float shadowRadius = backgroundWithShadow.getWidth() / 2f;

        Rect canvasBounds = canvas.getClipBounds();
        float offsetX = params.leftAlign
                ? Math.max(0, canvasBounds.left - (dotCenterX - shadowRadius))
                : Math.min(0, canvasBounds.right - (dotCenterX + shadowRadius));
        float offsetY = Math.max(0, canvasBounds.top - (dotCenterY - shadowRadius));

        canvas.save();
        canvas.translate(dotCenterX + offsetX, dotCenterY + offsetY);
        canvas.scale(params.scale, params.scale);

        canvas.drawBitmap(backgroundWithShadow, mBitmapOffset, mBitmapOffset, mBackgroundPaint);

        mBackgroundPaint.setColor(dotColor);
        mBadgeBounds.set(-badgeWidth / 2f, -badgeHeight / 2f,
                badgeWidth / 2f, badgeHeight / 2f);
        canvas.drawRoundRect(mBadgeBounds, badgeHeight / 2f, badgeHeight / 2f, mBackgroundPaint);

        Paint.FontMetrics fontMetrics = mTextPaint.getFontMetrics();
        float textBaseline = -(fontMetrics.ascent + fontMetrics.descent) / 2;
        canvas.drawText(countText, 0, textBaseline, mTextPaint);
        canvas.restore();
    }

    private static int getTextColor(int backgroundColor) {
        return ColorUtils.calculateContrast(Color.WHITE, backgroundColor) >= MIN_TEXT_CONTRAST
                ? Color.WHITE
                : Color.BLACK;
    }

    private Bitmap getBackgroundWithShadow(int width, int height) {
        if (mBackgroundWithShadow == null || mShadowWidth != width || mShadowHeight != height) {
            ShadowGenerator.Builder builder = new ShadowGenerator.Builder(Color.TRANSPARENT);
            builder.ambientShadowAlpha = DotRenderer.AMBIENT_SHADOW_ALPHA;
            mBackgroundWithShadow = builder.setupBlurForSize(height).createPill(width, height);
            mBitmapOffset = -mBackgroundWithShadow.getHeight() * 0.5f;
            mShadowWidth = width;
            mShadowHeight = height;
        }
        return mBackgroundWithShadow;
    }
}
