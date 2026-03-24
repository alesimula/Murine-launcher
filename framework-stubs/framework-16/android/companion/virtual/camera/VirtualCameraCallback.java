package android.companion.virtual.camera;

@android.annotation.SystemApi
public interface VirtualCameraCallback {
    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.virtual_camera_on_open")
    default public void onOpenCamera() {}
    public void onStreamConfigured(int p0, android.view.Surface p1, int p2, int p3, int p4);
    default public void onProcessCaptureRequest(int p0, long p1) {}
    public void onStreamClosed(int p0);
}
