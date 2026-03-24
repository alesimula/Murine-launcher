package com.android.internal.colorextraction.drawable;

public class ScrimDrawable extends android.graphics.drawable.Drawable {
    private static final java.lang.String TAG = "ScrimDrawable";
    private static final long COLOR_ANIMATION_DURATION = 2000L;
    private final android.graphics.Paint mPaint = null;
    private int mAlpha;
    private int mMainColor;
    private android.animation.ValueAnimator mColorAnimation;
    private int mMainColorTo;
    public ScrimDrawable() { super(); }
    public void setColor(int p0, boolean p1) {}
    public void setAlpha(int p0) {}
    public int getAlpha() { return 0; }
    public void setXfermode(android.graphics.Xfermode p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public int getOpacity() { return 0; }
    public void draw(android.graphics.Canvas p0) {}
    public int getMainColor() { return 0; }
}
