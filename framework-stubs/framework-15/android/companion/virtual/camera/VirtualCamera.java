package android.companion.virtual.camera;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.companion.virtual.flags.virtual_camera")
public final class VirtualCamera implements java.io.Closeable {
    public VirtualCamera(android.companion.virtual.IVirtualDevice p0, java.lang.String p1, android.companion.virtual.camera.VirtualCameraConfig p2) {}
    public android.companion.virtual.camera.VirtualCameraConfig getConfig() { return null; }
    @android.annotation.SuppressLint("UnflaggedApi")
    public java.lang.String getId() { return null; }
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void close() {}
}
