package android.hardware.input;

@android.annotation.SystemApi
public class VirtualMouse extends android.hardware.input.VirtualInputDevice {
    public VirtualMouse(android.hardware.input.VirtualMouseConfig p0, android.companion.virtual.IVirtualDevice p1, android.os.IBinder p2) { super(null, null, null); }
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void sendButtonEvent(android.hardware.input.VirtualMouseButtonEvent p0) {}
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void sendScrollEvent(android.hardware.input.VirtualMouseScrollEvent p0) {}
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void sendRelativeEvent(android.hardware.input.VirtualMouseRelativeEvent p0) {}
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    @android.annotation.NonNull
    public android.graphics.PointF getCursorPosition() { return null; }
}
