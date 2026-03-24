package android.app;

public abstract class SharedElementCallback {
    private android.graphics.Matrix mTempMatrix;
    private static final java.lang.String BUNDLE_SNAPSHOT_BITMAP = "sharedElement:snapshot:bitmap";
    private static final java.lang.String BUNDLE_SNAPSHOT_HARDWARE_BUFFER = "sharedElement:snapshot:hardwareBuffer";
    private static final java.lang.String BUNDLE_SNAPSHOT_COLOR_SPACE = "sharedElement:snapshot:colorSpace";
    private static final java.lang.String BUNDLE_SNAPSHOT_IMAGE_SCALETYPE = "sharedElement:snapshot:imageScaleType";
    private static final java.lang.String BUNDLE_SNAPSHOT_IMAGE_MATRIX = "sharedElement:snapshot:imageMatrix";
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
