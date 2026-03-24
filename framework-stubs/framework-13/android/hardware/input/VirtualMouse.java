package android.hardware.input;

@android.annotation.SystemApi
public class VirtualMouse implements java.io.Closeable {
    public VirtualMouse(android.companion.virtual.IVirtualDevice p0, android.os.IBinder p1) {}
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void close() {}
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void sendButtonEvent(android.hardware.input.VirtualMouseButtonEvent p0) {}
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void sendScrollEvent(android.hardware.input.VirtualMouseScrollEvent p0) {}
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void sendRelativeEvent(android.hardware.input.VirtualMouseRelativeEvent p0) {}
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public android.graphics.PointF getCursorPosition() { return null; }
}
