package android.hardware.input;

@android.annotation.SystemApi
public class VirtualTouchscreen extends android.hardware.input.VirtualInputDevice {
    public VirtualTouchscreen(android.hardware.input.VirtualTouchscreenConfig p0, android.companion.virtual.IVirtualDevice p1, android.os.IBinder p2) { super(null, null, null); }
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void sendTouchEvent(android.hardware.input.VirtualTouchEvent p0) {}
}
