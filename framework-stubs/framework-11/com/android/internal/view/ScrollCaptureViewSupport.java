package com.android.internal.view;

public class ScrollCaptureViewSupport<V extends android.view.View> implements android.view.ScrollCaptureCallback {
    private final java.lang.ref.WeakReference<V> mWeakView = null;
    private final com.android.internal.view.ScrollCaptureViewHelper<V> mViewHelper = null;
    private com.android.internal.view.ScrollCaptureViewSupport.ViewRenderer mRenderer;
    private android.os.Handler mUiHandler;
    private boolean mStarted;
    private boolean mEnded;
    static <V extends android.view.View> android.view.ScrollCaptureCallback createCallback(V p0, com.android.internal.view.ScrollCaptureViewHelper<V> p1) { return null; }
    ScrollCaptureViewSupport(V p0, com.android.internal.view.ScrollCaptureViewHelper<V> p1) {}
    public final void onScrollCaptureSearch(java.util.function.Consumer<android.graphics.Rect> p0) {}
    public final void onScrollCaptureStart(android.view.ScrollCaptureSession p0, java.lang.Runnable p1) {}
    public final void onScrollCaptureImageRequest(android.view.ScrollCaptureSession p0, android.graphics.Rect p1) {}
    public final void onScrollCaptureEnd(java.lang.Runnable p0) {}

    static final class ViewRenderer {
        private static final float AMBIENT_SHADOW_ALPHA = 0.039000000804662704f;
        private static final float SPOT_SHADOW_ALPHA = 0.039000000804662704f;
        private static final float LIGHT_Z_DP = 400.0f;
        private static final float LIGHT_RADIUS_DP = 800.0f;
        private static final java.lang.String TAG = "ViewRenderer";
        private android.graphics.HardwareRenderer mRenderer;
        private android.graphics.RenderNode mRootRenderNode;
        private final android.graphics.RectF mTempRectF = null;
        private final android.graphics.Rect mSourceRect = null;
        private final android.graphics.Rect mTempRect = null;
        private final android.graphics.Matrix mTempMatrix = null;
        private final int[] mTempLocation = null;
        private long mLastRenderedSourceDrawingId;
        ViewRenderer() {}
        public void setSurface(android.view.Surface p0) {}
        private boolean updateForView(android.view.View p0) { return false; }
        private void setupLighting(android.view.View p0) {}
        public void renderFrame(android.view.View p0, android.graphics.Rect p1, android.os.Handler p2, java.lang.Runnable p3) {}
        public void trimMemory() {}
        public void destroy() {}
        private void transformToRoot(android.view.View p0, android.graphics.Rect p1, android.graphics.Rect p2) {}
        private void buildRootDisplayList(android.view.View p0, android.graphics.Rect p1) {}
    }
}
