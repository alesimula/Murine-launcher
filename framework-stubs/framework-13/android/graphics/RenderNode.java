package android.graphics;

public final class RenderNode {
    public final long mNativeRenderNode = 0L;
    public static final int USAGE_UNKNOWN = 0;
    public static final int USAGE_BACKGROUND = 1;
    public RenderNode(java.lang.String p0) {}
    public static android.graphics.RenderNode create(java.lang.String p0, android.graphics.RenderNode.AnimationHost p1) { return null; }
    public static android.graphics.RenderNode adopt(long p0) { return null; }
    public void addPositionUpdateListener(android.graphics.RenderNode.PositionUpdateListener p0) {}
    public void removePositionUpdateListener(android.graphics.RenderNode.PositionUpdateListener p0) {}
    public android.graphics.RecordingCanvas beginRecording(int p0, int p1) { return null; }
    public android.graphics.RecordingCanvas beginRecording() { return null; }
    public void endRecording() {}
    @java.lang.Deprecated
    public android.graphics.RecordingCanvas start(int p0, int p1) { return null; }
    @java.lang.Deprecated
    public void end(android.graphics.RecordingCanvas p0) {}
    public void discardDisplayList() {}
    public boolean hasDisplayList() { return false; }
    public boolean hasIdentityMatrix() { return false; }
    public void getMatrix(android.graphics.Matrix p0) {}
    public void getInverseMatrix(android.graphics.Matrix p0) {}
    @java.lang.Deprecated
    public boolean setLayerType(int p0) { return false; }
    @java.lang.Deprecated
    public boolean setLayerPaint(android.graphics.Paint p0) { return false; }
    public boolean setUseCompositingLayer(boolean p0, android.graphics.Paint p1) { return false; }
    public boolean getUseCompositingLayer() { return false; }
    public boolean setClipRect(android.graphics.Rect p0) { return false; }
    public boolean setClipToBounds(boolean p0) { return false; }
    public boolean getClipToBounds() { return false; }
    public boolean setProjectBackwards(boolean p0) { return false; }
    public boolean setProjectionReceiver(boolean p0) { return false; }
    public boolean setOutline(android.graphics.Outline p0) { return false; }
    public boolean clearStretch() { return false; }
    public boolean stretch(float p0, float p1, float p2, float p3) { return false; }
    public boolean hasShadow() { return false; }
    public boolean setSpotShadowColor(int p0) { return false; }
    public int getSpotShadowColor() { return 0; }
    public boolean setAmbientShadowColor(int p0) { return false; }
    public int getAmbientShadowColor() { return 0; }
    public boolean setClipToOutline(boolean p0) { return false; }
    public boolean getClipToOutline() { return false; }
    public boolean setRevealClip(boolean p0, float p1, float p2, float p3) { return false; }
    public boolean setStaticMatrix(android.graphics.Matrix p0) { return false; }
    public boolean setAnimationMatrix(android.graphics.Matrix p0) { return false; }
    public android.graphics.Matrix getAnimationMatrix() { return null; }
    public boolean setAlpha(float p0) { return false; }
    public boolean setRenderEffect(android.graphics.RenderEffect p0) { return false; }
    public float getAlpha() { return 0.0f; }
    public boolean setHasOverlappingRendering(boolean p0) { return false; }
    public void setUsageHint(int p0) {}
    public boolean hasOverlappingRendering() { return false; }
    public boolean setElevation(float p0) { return false; }
    public float getElevation() { return 0.0f; }
    public boolean setTranslationX(float p0) { return false; }
    public float getTranslationX() { return 0.0f; }
    public boolean setTranslationY(float p0) { return false; }
    public float getTranslationY() { return 0.0f; }
    public boolean setTranslationZ(float p0) { return false; }
    public float getTranslationZ() { return 0.0f; }
    public boolean setRotationZ(float p0) { return false; }
    public float getRotationZ() { return 0.0f; }
    public boolean setRotationX(float p0) { return false; }
    public float getRotationX() { return 0.0f; }
    public boolean setRotationY(float p0) { return false; }
    public float getRotationY() { return 0.0f; }
    public boolean setScaleX(float p0) { return false; }
    public float getScaleX() { return 0.0f; }
    public boolean setScaleY(float p0) { return false; }
    public float getScaleY() { return 0.0f; }
    public boolean setPivotX(float p0) { return false; }
    public float getPivotX() { return 0.0f; }
    public boolean setPivotY(float p0) { return false; }
    public float getPivotY() { return 0.0f; }
    public boolean isPivotExplicitlySet() { return false; }
    public boolean resetPivot() { return false; }
    public boolean setCameraDistance(float p0) { return false; }
    public float getCameraDistance() { return 0.0f; }
    public boolean setLeft(int p0) { return false; }
    public boolean setTop(int p0) { return false; }
    public boolean setRight(int p0) { return false; }
    public boolean setBottom(int p0) { return false; }
    public int getLeft() { return 0; }
    public int getTop() { return 0; }
    public int getRight() { return 0; }
    public int getBottom() { return 0; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public boolean setLeftTopRightBottom(int p0, int p1, int p2, int p3) { return false; }
    public boolean setPosition(int p0, int p1, int p2, int p3) { return false; }
    public boolean setPosition(android.graphics.Rect p0) { return false; }
    public boolean offsetLeftAndRight(int p0) { return false; }
    public boolean offsetTopAndBottom(int p0) { return false; }
    public void output() {}
    public long computeApproximateMemoryUsage() { return 0L; }
    public long computeApproximateMemoryAllocated() { return 0L; }
    public boolean setForceDarkAllowed(boolean p0) { return false; }
    public boolean isForceDarkAllowed() { return false; }
    public long getUniqueId() { return 0L; }
    public void addAnimator(android.graphics.animation.RenderNodeAnimator p0) {}
    public boolean isAttached() { return false; }
    public void registerVectorDrawableAnimator(android.view.NativeVectorDrawableAnimator p0) {}
    public void endAllAnimators() {}
    public void forceEndAnimators() {}

    public static interface AnimationHost {
        public void registerAnimatingRenderNode(android.graphics.RenderNode p0);
        public void registerVectorDrawableAnimator(android.view.NativeVectorDrawableAnimator p0);
        public boolean isAttached();
    }

    private static final class CompositePositionUpdateListener implements android.graphics.RenderNode.PositionUpdateListener {
        CompositePositionUpdateListener(android.graphics.RenderNode.PositionUpdateListener... p0) {}
        public android.graphics.RenderNode.CompositePositionUpdateListener with(android.graphics.RenderNode.PositionUpdateListener p0) { return null; }
        public android.graphics.RenderNode.CompositePositionUpdateListener without(android.graphics.RenderNode.PositionUpdateListener p0) { return null; }
        public void positionChanged(long p0, int p1, int p2, int p3, int p4) {}
        public void positionLost(long p0) {}
        public void applyStretch(long p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10) {}
    }

    private static class NoImagePreloadHolder {
    }

    public static interface PositionUpdateListener {
        public void positionChanged(long p0, int p1, int p2, int p3, int p4);
        public static boolean callPositionChanged(java.lang.ref.WeakReference<android.graphics.RenderNode.PositionUpdateListener> p0, long p1, int p2, int p3, int p4, int p5) { return false; }
        default public void applyStretch(long p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10) {}
        public static boolean callApplyStretch(java.lang.ref.WeakReference<android.graphics.RenderNode.PositionUpdateListener> p0, long p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10, float p11) { return false; }
        public void positionLost(long p0);
        public static boolean callPositionLost(java.lang.ref.WeakReference<android.graphics.RenderNode.PositionUpdateListener> p0, long p1) { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UsageHint {
    }
}
