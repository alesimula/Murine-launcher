package android.view;

public interface WindowCallbacks {
    public void onWindowSizeIsChanging(android.graphics.Rect p0, boolean p1, android.graphics.Rect p2, android.graphics.Rect p3);
    public void onWindowDragResizeStart(android.graphics.Rect p0, boolean p1, android.graphics.Rect p2, android.graphics.Rect p3);
    public void onWindowDragResizeEnd();
    public boolean onContentDrawn(int p0, int p1, int p2, int p3);
    public void onRequestDraw(boolean p0);
    public void onPostDraw(android.graphics.RecordingCanvas p0);
}
