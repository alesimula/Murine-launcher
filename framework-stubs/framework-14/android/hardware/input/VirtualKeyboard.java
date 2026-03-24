package android.hardware.input;

@android.annotation.SystemApi
public class VirtualKeyboard extends android.hardware.input.VirtualInputDevice {
    public VirtualKeyboard(android.companion.virtual.IVirtualDevice p0, android.os.IBinder p1) { super(null, null); }
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void sendKeyEvent(android.hardware.input.VirtualKeyEvent p0) {}
}
