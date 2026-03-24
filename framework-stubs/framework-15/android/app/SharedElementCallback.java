package android.app;

public abstract class SharedElementCallback {
    static final android.app.SharedElementCallback NULL_CALLBACK = null;
    public SharedElementCallback() {}
    public void onSharedElementStart(java.util.List<java.lang.String> p0, java.util.List<android.view.View> p1, java.util.List<android.view.View> p2) {}
    public void onSharedElementEnd(java.util.List<java.lang.String> p0, java.util.List<android.view.View> p1, java.util.List<android.view.View> p2) {}
    public void onRejectSharedElements(java.util.List<android.view.View> p0) {}
    public void onMapSharedElements(java.util.List<java.lang.String> p0, java.util.Map<java.lang.String, android.view.View> p1) {}
    public android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View p0, android.graphics.Matrix p1, android.graphics.RectF p2) { return null; }
    public android.view.View onCreateSnapshotView(android.content.Context p0, android.os.Parcelable p1) { return null; }
    public void onSharedElementsArrived(java.util.List<java.lang.String> p0, java.util.List<android.view.View> p1, android.app.SharedElementCallback.OnSharedElementsReadyListener p2) {}

    public static interface OnSharedElementsReadyListener {
        public void onSharedElementsReady();
    }
}
