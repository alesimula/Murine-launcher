package com.android.internal.graphics.drawable;

public final class BackgroundBlurDrawable extends android.graphics.drawable.Drawable {
    public final android.graphics.RenderNode.PositionUpdateListener mPositionUpdateListener = null;
    public void draw(android.graphics.Canvas p0) {}
    public void setColor(int p0) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void setAlpha(int p0) {}
    public void setBlurRadius(int p0) {}
    public void setCornerRadius(float p0) {}
    public void setCornerRadius(float p0, float p1, float p2, float p3) {}
    public void setBounds(int p0, int p1, int p2, int p3) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public int getOpacity() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Aggregator {
        public Aggregator(android.view.ViewRootImpl p0) {}
        public com.android.internal.graphics.drawable.BackgroundBlurDrawable createBackgroundBlurDrawable(android.content.Context p0) { return null; }
        void onBlurDrawableUpdated(com.android.internal.graphics.drawable.BackgroundBlurDrawable p0) {}
        void onRenderNodePositionChanged(long p0, java.lang.Runnable p1) {}
        public boolean hasUpdates() { return false; }
        public boolean hasRegions() { return false; }
        public com.android.internal.graphics.drawable.BackgroundBlurDrawable.BlurRegion[] getBlurRegionsCopyForRT() { return null; }
        public float[][] getBlurRegionsForFrameLocked(long p0, com.android.internal.graphics.drawable.BackgroundBlurDrawable.BlurRegion[] p1, boolean p2) { return null; }
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
