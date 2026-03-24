package android.widget;

public final class Magnifier {
    public static final int SOURCE_BOUND_MAX_IN_SURFACE = 0;
    public static final int SOURCE_BOUND_MAX_VISIBLE = 1;
    @java.lang.Deprecated
    public Magnifier(android.view.View p0) {}
    static android.widget.Magnifier.Builder createBuilderWithOldMagnifierDefaults(android.view.View p0) { return null; }
    public void show(float p0, float p1) {}
    void setDrawCursor(boolean p0, android.graphics.drawable.Drawable p1) {}
    public void show(float p0, float p1, float p2, float p3) {}
    public void dismiss() {}
    public void update() {}
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public int getSourceWidth() { return 0; }
    public int getSourceHeight() { return 0; }
    public void setZoom(float p0) {}
    void updateSourceFactors(int p0, float p1) {}
    public float getZoom() { return 0.0f; }
    public float getElevation() { return 0.0f; }
    public float getCornerRadius() { return 0.0f; }
    public int getDefaultHorizontalSourceToMagnifierOffset() { return 0; }
    public int getDefaultVerticalSourceToMagnifierOffset() { return 0; }
    public android.graphics.drawable.Drawable getOverlay() { return null; }
    public boolean isClippingEnabled() { return false; }
    public android.graphics.Point getPosition() { return null; }
    public android.graphics.Point getSourcePosition() { return null; }
    public void setOnOperationCompleteCallback(android.widget.Magnifier.Callback p0) {}
    public android.graphics.Bitmap getContent() { return null; }
    public android.graphics.Bitmap getOriginalContent() { return null; }
    public static android.graphics.PointF getMagnifierDefaultSize() { return null; }

    public static final class Builder {
        public Builder(android.view.View p0) {}
        public android.widget.Magnifier.Builder setSize(int p0, int p1) { return null; }
        public android.widget.Magnifier.Builder setInitialZoom(float p0) { return null; }
        public android.widget.Magnifier.Builder setElevation(float p0) { return null; }
        public android.widget.Magnifier.Builder setCornerRadius(float p0) { return null; }
        public android.widget.Magnifier.Builder setOverlay(android.graphics.drawable.Drawable p0) { return null; }
        public android.widget.Magnifier.Builder setDefaultSourceToMagnifierOffset(int p0, int p1) { return null; }
        public android.widget.Magnifier.Builder setClippingEnabled(boolean p0) { return null; }
        public android.widget.Magnifier.Builder setSourceBounds(int p0, int p1, int p2, int p3) { return null; }
        android.widget.Magnifier.Builder setSourceSize(int p0, int p1) { return null; }
        android.widget.Magnifier.Builder setFishEyeStyle() { return null; }
        public android.widget.Magnifier build() { return null; }
    }

    public static interface Callback {
        public void onOperationComplete();
    }

    private static class InternalPopupWindow {
        InternalPopupWindow(android.content.Context p0, android.view.Display p1, android.view.SurfaceControl p2, int p3, int p4, float p5, int p6, float p7, float p8, android.graphics.drawable.Drawable p9, android.os.Handler p10, java.lang.Object p11, android.widget.Magnifier.Callback p12, boolean p13) {}
        public void setContentPositionForNextDraw(int p0, int p1) {}
        public void updateContent(android.graphics.Bitmap p0) {}
        public void destroy() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SourceBound {
    }

    private static class SurfaceInfo {
        public static final android.widget.Magnifier.SurfaceInfo NULL = null;
        SurfaceInfo(android.view.SurfaceControl p0, android.view.Surface p1, int p2, int p3, android.graphics.Rect p4, boolean p5) {}
    }
}
