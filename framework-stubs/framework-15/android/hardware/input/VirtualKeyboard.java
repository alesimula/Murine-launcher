package android.hardware.input;

@android.annotation.SystemApi
public class VirtualKeyboard extends android.hardware.input.VirtualInputDevice {
    public VirtualKeyboard(android.hardware.input.VirtualKeyboardConfig p0, android.companion.virtual.IVirtualDevice p1, android.os.IBinder p2) { super(null, null, null); }
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void sendKeyEvent(android.hardware.input.VirtualKeyEvent p0) {}
    @android.annotation.SuppressLint("UnflaggedApi")
    public int getInputDeviceId() { return 0; }
}
