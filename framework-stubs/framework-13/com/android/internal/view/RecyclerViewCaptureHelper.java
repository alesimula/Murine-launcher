package com.android.internal.view;

public class RecyclerViewCaptureHelper implements com.android.internal.view.ScrollCaptureViewHelper<android.view.ViewGroup> {
    public RecyclerViewCaptureHelper() {}
    public boolean onAcceptSession(android.view.ViewGroup p0) { return false; }
    public void onPrepareForStart(android.view.ViewGroup p0, android.graphics.Rect p1) {}
    public void onScrollRequested(android.view.ViewGroup p0, android.graphics.Rect p1, android.graphics.Rect p2, android.os.CancellationSignal p3, java.util.function.Consumer<com.android.internal.view.ScrollCaptureViewHelper.ScrollResult> p4) {}
    static android.view.View findChildNearestTarget(android.view.ViewGroup p0, android.graphics.Rect p1) { return null; }
    public void onPrepareForEnd(android.view.ViewGroup p0) {}
}
