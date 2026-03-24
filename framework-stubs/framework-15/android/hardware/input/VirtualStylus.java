package android.hardware.input;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.companion.virtual.flags.virtual_stylus")
public class VirtualStylus extends android.hardware.input.VirtualInputDevice {
    public VirtualStylus(android.hardware.input.VirtualStylusConfig p0, android.companion.virtual.IVirtualDevice p1, android.os.IBinder p2) { super(null, null, null); }
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void sendMotionEvent(android.hardware.input.VirtualStylusMotionEvent p0) {}
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void sendButtonEvent(android.hardware.input.VirtualStylusButtonEvent p0) {}
}
