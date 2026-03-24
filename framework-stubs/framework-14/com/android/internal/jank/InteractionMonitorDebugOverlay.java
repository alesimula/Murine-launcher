package com.android.internal.jank;

class InteractionMonitorDebugOverlay implements android.view.WindowCallbacks {
    InteractionMonitorDebugOverlay(java.lang.Object p0, int p1, double p2) {}
    void dispose() {}
    void onTrackerRemoved(int p0, int p1, android.util.SparseArray<com.android.internal.jank.FrameTracker> p2) {}
    void onTrackerAdded(int p0, com.android.internal.jank.FrameTracker p1) {}
    public void onWindowSizeIsChanging(android.graphics.Rect p0, boolean p1, android.graphics.Rect p2, android.graphics.Rect p3) {}
    public void onWindowDragResizeStart(android.graphics.Rect p0, boolean p1, android.graphics.Rect p2, android.graphics.Rect p3) {}
    public void onWindowDragResizeEnd() {}
    public boolean onContentDrawn(int p0, int p1, int p2, int p3) { return false; }
    public void onRequestDraw(boolean p0) {}
    public void onPostDraw(android.graphics.RecordingCanvas p0) {}
}
