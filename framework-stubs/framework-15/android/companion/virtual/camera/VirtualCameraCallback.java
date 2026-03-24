package android.companion.virtual.camera;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.companion.virtual.flags.virtual_camera")
public interface VirtualCameraCallback {
    public void onStreamConfigured(int p0, android.view.Surface p1, int p2, int p3, int p4);
    default public void onProcessCaptureRequest(int p0, long p1) {}
    public void onStreamClosed(int p0);
}
