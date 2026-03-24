package com.android.internal.view;

interface ScrollCaptureViewHelper<V extends android.view.View> {
    public static final int UP = -1;
    public static final int DOWN = 1;
    default public boolean onAcceptSession(V p0) { return false; }
    default public android.graphics.Rect onComputeScrollBounds(V p0) { return null; }
    public void onPrepareForStart(V p0, android.graphics.Rect p1);
    public android.graphics.Rect onScrollRequested(V p0, android.graphics.Rect p1, android.graphics.Rect p2);
    public void onPrepareForEnd(V p0);
}
