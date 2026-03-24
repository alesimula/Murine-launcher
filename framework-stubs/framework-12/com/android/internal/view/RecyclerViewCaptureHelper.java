package com.android.internal.view;

public class RecyclerViewCaptureHelper implements com.android.internal.view.ScrollCaptureViewHelper<android.view.ViewGroup> {
    private static final java.lang.String TAG = "RVCaptureHelper";
    private int mScrollDelta;
    private boolean mScrollBarWasEnabled;
    private int mOverScrollMode;
    public RecyclerViewCaptureHelper() {}
    public void onPrepareForStart(android.view.ViewGroup p0, android.graphics.Rect p1) {}
    public com.android.internal.view.ScrollCaptureViewHelper.ScrollResult onScrollRequested(android.view.ViewGroup p0, android.graphics.Rect p1, android.graphics.Rect p2) { return null; }
    static android.view.View findChildNearestTarget(android.view.ViewGroup p0, android.graphics.Rect p1) { return null; }
    public void onPrepareForEnd(android.view.ViewGroup p0) {}
}
