package com.android.internal.view;

public interface ScrollCaptureViewHelper<V extends android.view.View> {
    public static final int UP = -1;
    public static final int DOWN = 1;
    public boolean onAcceptSession(V p0);
    @android.annotation.NonNull
    default public android.graphics.Rect onComputeScrollBounds(V p0) { return null; }
    public void onPrepareForStart(V p0, android.graphics.Rect p1);
    @android.annotation.NonNull
    public void onScrollRequested(V p0, android.graphics.Rect p1, android.graphics.Rect p2, android.os.CancellationSignal p3, java.util.function.Consumer<com.android.internal.view.ScrollCaptureViewHelper.ScrollResult> p4);
    public void onPrepareForEnd(V p0);

    public static class ScrollResult {
        public android.graphics.Rect requestedArea;
        public android.graphics.Rect availableArea;
        public int scrollDelta;
        public ScrollResult() {}
        public java.lang.String toString() { return null; }
    }
}
