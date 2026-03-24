package com.android.internal.view;

public class ScrollCaptureViewSupport<V extends android.view.View> implements android.view.ScrollCaptureCallback {
    private static final java.lang.String TAG = "ScrollCaptureViewSupport";
    private static final java.lang.String SETTING_CAPTURE_DELAY = "screenshot.scroll_capture_delay";
    private static final long SETTING_CAPTURE_DELAY_DEFAULT = 60L;
    private final java.lang.ref.WeakReference<V> mWeakView = null;
    private final com.android.internal.view.ScrollCaptureViewHelper<V> mViewHelper = null;
    private final com.android.internal.view.ScrollCaptureViewSupport.ViewRenderer mRenderer = null;
    private final long mPostScrollDelayMillis = 0L;
    private boolean mStarted;
    private boolean mEnded;
    ScrollCaptureViewSupport(V p0, com.android.internal.view.ScrollCaptureViewHelper<V> p1) {}
    private static int getColorMode(android.view.View p0) { return 0; }
    public static android.graphics.Rect transformFromRequestToContainer(int p0, android.graphics.Rect p1, android.graphics.Rect p2) { return null; }
    public static android.graphics.Rect transformFromContainerToRequest(int p0, android.graphics.Rect p1, android.graphics.Rect p2) { return null; }
    public static int computeScrollAmount(android.graphics.Rect p0, android.graphics.Rect p1) { return 0; }
    public static android.view.View findScrollingReferenceView(android.view.ViewGroup p0, int p1) { return null; }
    public final void onScrollCaptureSearch(android.os.CancellationSignal p0, java.util.function.Consumer<android.graphics.Rect> p1) {}
    public final void onScrollCaptureStart(android.view.ScrollCaptureSession p0, android.os.CancellationSignal p1, java.lang.Runnable p2) {}
    public final void onScrollCaptureImageRequest(android.view.ScrollCaptureSession p0, android.os.CancellationSignal p1, android.graphics.Rect p2, java.util.function.Consumer<android.graphics.Rect> p3) {}
    public final void onScrollCaptureEnd(java.lang.Runnable p0) {}
    public java.lang.String toString() { return null; }

    static final class ViewRenderer {
        private static final float AMBIENT_SHADOW_ALPHA = 0.039000000804662704f;
        private static final float SPOT_SHADOW_ALPHA = 0.039000000804662704f;
        private static final float LIGHT_Z_DP = 400.0f;
        private static final float LIGHT_RADIUS_DP = 800.0f;
        private static final java.lang.String TAG = "ViewRenderer";
        private final android.graphics.HardwareRenderer mRenderer = null;
        private final android.graphics.RenderNode mCaptureRenderNode = null;
        private final android.graphics.Rect mTempRect = null;
        private final int[] mTempLocation = null;
        private long mLastRenderedSourceDrawingId;
        private android.view.Surface mSurface;
        ViewRenderer() {}
        public void setSurface(android.view.Surface p0) {}
        private boolean updateForView(android.view.View p0) { return false; }
        private void setupLighting(android.view.View p0) {}
        private void updateRootNode(android.view.View p0, android.graphics.Rect p1) {}
        public void renderView(android.view.View p0, android.graphics.Rect p1) {}
        public void trimMemory() {}
        public void destroy() {}
        private void transformToRoot(android.view.View p0, android.graphics.Rect p1, android.graphics.Rect p2) {}
        public void setColorMode(int p0) {}
    }
}
