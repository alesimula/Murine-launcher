package com.android.internal.app;

@java.lang.Deprecated
public class SimpleIconFactory {
    private static final android.util.Pools.SynchronizedPool<com.android.internal.app.SimpleIconFactory> sPool = null;
    private static final int DEFAULT_WRAPPER_BACKGROUND = -1;
    private static final float BLUR_FACTOR = 0.010416666977107525f;
    private android.content.Context mContext;
    private android.graphics.Canvas mCanvas;
    private android.content.pm.PackageManager mPm;
    private int mFillResIconDpi;
    private int mIconBitmapSize;
    private int mBadgeBitmapSize;
    private int mWrapperBackgroundColor;
    private android.graphics.drawable.Drawable mWrapperIcon;
    private final android.graphics.Rect mOldBounds = null;
    private static final float SCALE_NOT_INITIALIZED = 0.0f;
    private static final float MAX_SQUARE_AREA_FACTOR = 0.6510416865348816f;
    private static final float MAX_CIRCLE_AREA_FACTOR = 0.6597222089767456f;
    private static final float CIRCLE_AREA_BY_RECT = 0.7853981852531433f;
    private static final float LINEAR_SCALE_SLOPE = 0.040449436753988266f;
    private static final int MIN_VISIBLE_ALPHA = 40;
    private float mAdaptiveIconScale;
    private final android.graphics.Rect mAdaptiveIconBounds = null;
    private final android.graphics.Rect mBounds = null;
    private final int mMaxSize = 0;
    private final byte[] mPixels = null;
    private final float[] mLeftBorder = null;
    private final float[] mRightBorder = null;
    private final android.graphics.Bitmap mBitmap = null;
    private final android.graphics.Canvas mScaleCheckCanvas = null;
    private static final float KEY_SHADOW_DISTANCE = 0.02083333395421505f;
    private static final int KEY_SHADOW_ALPHA = 61;
    private static final int AMBIENT_SHADOW_ALPHA = 30;
    private android.graphics.Paint mBlurPaint;
    private android.graphics.Paint mDrawPaint;
    private android.graphics.BlurMaskFilter mDefaultBlurMaskFilter;
    @java.lang.Deprecated
    public static com.android.internal.app.SimpleIconFactory obtain(android.content.Context p0) { return null; }
    @java.lang.Deprecated
    public void recycle() {}
    @java.lang.Deprecated
    private SimpleIconFactory(android.content.Context p0, int p1, int p2, int p3) {}
    @java.lang.Deprecated
    void setWrapperBackgroundColor(int p0) {}
    @java.lang.Deprecated
    android.graphics.Bitmap createUserBadgedIconBitmap(android.graphics.drawable.Drawable p0, android.os.UserHandle p1) { return null; }
    @java.lang.Deprecated
    android.graphics.Bitmap createAppBadgedIconBitmap(android.graphics.drawable.Drawable p0, android.graphics.Bitmap p1) { return null; }
    private android.graphics.Bitmap maskBitmapToCircle(android.graphics.Bitmap p0) { return null; }
    private static android.graphics.drawable.Drawable getFullResDefaultActivityIcon(int p0) { return null; }
    private android.graphics.Bitmap createIconBitmap(android.graphics.drawable.Drawable p0, float p1) { return null; }
    private android.graphics.Bitmap createIconBitmap(android.graphics.drawable.Drawable p0, float p1, int p2) { return null; }
    private android.graphics.drawable.Drawable normalizeAndWrapToAdaptiveIcon(android.graphics.drawable.Drawable p0, android.graphics.RectF p1, float[] p2) { return null; }
    private synchronized float getScale(android.graphics.drawable.Drawable p0, android.graphics.RectF p1) { return 0.0f; }
    private static void convertToConvexArray(float[] p0, int p1, int p2, int p3) {}
    private synchronized void recreateIcon(android.graphics.Bitmap p0, android.graphics.Canvas p1) {}
    private synchronized void recreateIcon(android.graphics.Bitmap p0, android.graphics.BlurMaskFilter p1, int p2, int p3, android.graphics.Canvas p4) {}

    private static class FixedSizeBitmapDrawable extends android.graphics.drawable.BitmapDrawable {
        FixedSizeBitmapDrawable(android.graphics.Bitmap p0) { super(); }
        public int getIntrinsicHeight() { return 0; }
        public int getIntrinsicWidth() { return 0; }
    }

    public static class FixedScaleDrawable extends android.graphics.drawable.DrawableWrapper {
        private static final float LEGACY_ICON_SCALE = 0.4666900038719177f;
        private float mScaleX;
        private float mScaleY;
        public FixedScaleDrawable() { super((android.graphics.drawable.Drawable)null); }
        public void draw(android.graphics.Canvas p0) {}
        public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2) {}
        public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) {}
        public void setScale(float p0) {}
    }
}
