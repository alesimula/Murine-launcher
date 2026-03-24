package android.view;

public interface ScrollCaptureCallback {
    public void onScrollCaptureSearch(java.util.function.Consumer<android.graphics.Rect> p0);
    public void onScrollCaptureStart(android.view.ScrollCaptureSession p0, java.lang.Runnable p1);
    public void onScrollCaptureImageRequest(android.view.ScrollCaptureSession p0, android.graphics.Rect p1);
    public void onScrollCaptureEnd(java.lang.Runnable p0);
}
