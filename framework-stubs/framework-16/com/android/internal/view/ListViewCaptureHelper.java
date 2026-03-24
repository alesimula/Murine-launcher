package com.android.internal.view;

public class ListViewCaptureHelper implements com.android.internal.view.ScrollCaptureViewHelper<android.widget.ListView> {
    public ListViewCaptureHelper() {}
    public boolean onAcceptSession(android.widget.ListView p0) { return false; }
    public void onPrepareForStart(android.widget.ListView p0, android.graphics.Rect p1) {}
    public void onScrollRequested(android.widget.ListView p0, android.graphics.Rect p1, android.graphics.Rect p2, android.os.CancellationSignal p3, java.util.function.Consumer<com.android.internal.view.ScrollCaptureViewHelper.ScrollResult> p4) {}
    public void onPrepareForEnd(android.widget.ListView p0) {}
}
