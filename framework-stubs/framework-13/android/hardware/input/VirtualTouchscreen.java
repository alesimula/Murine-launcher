package android.hardware.input;

@android.annotation.SystemApi
public class VirtualTouchscreen implements java.io.Closeable {
    public VirtualTouchscreen(android.companion.virtual.IVirtualDevice p0, android.os.IBinder p1) {}
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void close() {}
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void sendTouchEvent(android.hardware.input.VirtualTouchEvent p0) {}
}
