package android.hardware.input;

abstract class VirtualInputDevice implements java.io.Closeable {
    protected final android.companion.virtual.IVirtualDevice mVirtualDevice = null;
    protected final android.os.IBinder mToken = null;
    VirtualInputDevice(android.companion.virtual.IVirtualDevice p0, android.os.IBinder p1) {}
    public int getInputDeviceId() { return 0; }
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void close() {}
}
