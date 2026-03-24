package android.hardware.input;

@android.annotation.SystemApi
public class VirtualTouchscreen extends android.hardware.input.VirtualInputDevice {
    public VirtualTouchscreen(android.companion.virtual.IVirtualDevice p0, android.os.IBinder p1) { super(null, null); }
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void sendTouchEvent(android.hardware.input.VirtualTouchEvent p0) {}
}
