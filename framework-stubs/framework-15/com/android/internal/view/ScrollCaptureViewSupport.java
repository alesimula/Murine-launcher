package com.android.internal.view;

public class ScrollCaptureViewSupport<V extends android.view.View> implements android.view.ScrollCaptureCallback {
    ScrollCaptureViewSupport(V p0, com.android.internal.view.ScrollCaptureViewHelper<V> p1) {}
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
        ViewRenderer() {}
        public void setSurface(android.view.Surface p0) {}
        public int renderView(android.view.View p0, android.graphics.Rect p1) { return 0; }
        public void trimMemory() {}
        public void destroy() {}
        public void setColorMode(int p0) {}
    }
}
