package com.android.internal.view;

public class ListViewCaptureHelper implements com.android.internal.view.ScrollCaptureViewHelper<android.widget.ListView> {
    private static final java.lang.String TAG = "LVCaptureHelper";
    private int mScrollDelta;
    private boolean mScrollBarWasEnabled;
    private int mOverScrollMode;
    public ListViewCaptureHelper() {}
    public void onPrepareForStart(android.widget.ListView p0, android.graphics.Rect p1) {}
    public com.android.internal.view.ScrollCaptureViewHelper.ScrollResult onScrollRequested(android.widget.ListView p0, android.graphics.Rect p1, android.graphics.Rect p2) { return null; }
    public void onPrepareForEnd(android.widget.ListView p0) {}
}
