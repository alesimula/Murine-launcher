package android.hardware.input;

@android.annotation.SystemApi
public class VirtualKeyboard implements java.io.Closeable {
    public VirtualKeyboard(android.companion.virtual.IVirtualDevice p0, android.os.IBinder p1) {}
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void close() {}
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void sendKeyEvent(android.hardware.input.VirtualKeyEvent p0) {}
}
