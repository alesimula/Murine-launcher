package android.view;

public interface ScrollCaptureCallback {
    public void onScrollCaptureSearch(android.os.CancellationSignal p0, java.util.function.Consumer<android.graphics.Rect> p1);
    public void onScrollCaptureStart(android.view.ScrollCaptureSession p0, android.os.CancellationSignal p1, java.lang.Runnable p2);
    public void onScrollCaptureImageRequest(android.view.ScrollCaptureSession p0, android.os.CancellationSignal p1, android.graphics.Rect p2, java.util.function.Consumer<android.graphics.Rect> p3);
    public void onScrollCaptureEnd(java.lang.Runnable p0);
}
