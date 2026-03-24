package com.android.internal.graphics.drawable;

public final class BackgroundBlurDrawable extends android.graphics.drawable.Drawable {
    private static final java.lang.String TAG = null;
    private static final boolean DEBUG = Boolean.valueOf(false);
    private final com.android.internal.graphics.drawable.BackgroundBlurDrawable.Aggregator mAggregator = null;
    private final android.graphics.RenderNode mRenderNode = null;
    private final android.graphics.Paint mPaint = null;
    private final android.graphics.Path mRectPath = null;
    private final float[] mTmpRadii = null;
    private boolean mVisible;
    private int mBlurRadius;
    private float mCornerRadiusTL;
    private float mCornerRadiusTR;
    private float mCornerRadiusBL;
    private float mCornerRadiusBR;
    private float mAlpha;
    private final android.graphics.Rect mRect = null;
    public final android.graphics.RenderNode.PositionUpdateListener mPositionUpdateListener = null;
    private BackgroundBlurDrawable(com.android.internal.graphics.drawable.BackgroundBlurDrawable.Aggregator p0) { super(); }
    public void draw(android.graphics.Canvas p0) {}
    public void setColor(int p0) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void setAlpha(int p0) {}
    public void setBlurRadius(int p0) {}
    public void setCornerRadius(float p0) {}
    public void setCornerRadius(float p0, float p1, float p2, float p3) {}
    public void setBounds(int p0, int p1, int p2, int p3) {}
    private void updatePath() {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public int getOpacity() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Aggregator {
        private final java.lang.Object mRtLock = null;
        private final android.util.ArraySet<com.android.internal.graphics.drawable.BackgroundBlurDrawable> mDrawables = null;
        private final android.util.LongSparseArray<android.util.ArraySet<java.lang.Runnable>> mFrameRtUpdates = null;
        private final android.view.ViewRootImpl mViewRoot = null;
        private com.android.internal.graphics.drawable.BackgroundBlurDrawable.BlurRegion[] mTmpBlurRegionsForFrame;
        private boolean mHasUiUpdates;
        public Aggregator(android.view.ViewRootImpl p0) {}
        public com.android.internal.graphics.drawable.BackgroundBlurDrawable createBackgroundBlurDrawable(android.content.Context p0) { return null; }
        void onBlurDrawableUpdated(com.android.internal.graphics.drawable.BackgroundBlurDrawable p0) {}
        void onRenderNodePositionChanged(long p0, java.lang.Runnable p1) {}
        public boolean hasUpdates() { return false; }
        public boolean hasRegions() { return false; }
        public com.android.internal.graphics.drawable.BackgroundBlurDrawable.BlurRegion[] getBlurRegionsCopyForRT() { return null; }
        public float[][] getBlurRegionsToDispatchToSf(long p0, com.android.internal.graphics.drawable.BackgroundBlurDrawable.BlurRegion[] p1, boolean p2) { return null; }
        public void dispatchBlurTransactionIfNeeded(long p0, com.android.internal.graphics.drawable.BackgroundBlurDrawable.BlurRegion[] p1, boolean p2) {}
    }

    public static final class BlurRegion {
        public final int blurRadius = 0;
        public final float cornerRadiusTL = 0.0f;
        public final float cornerRadiusTR = 0.0f;
        public final float cornerRadiusBL = 0.0f;
        public final float cornerRadiusBR = 0.0f;
        public final float alpha = 0.0f;
        public final android.graphics.Rect rect = null;
        BlurRegion(com.android.internal.graphics.drawable.BackgroundBlurDrawable p0) {}
        float[] toFloatArray() { return null; }
        public java.lang.String toString() { return null; }
    }
}
