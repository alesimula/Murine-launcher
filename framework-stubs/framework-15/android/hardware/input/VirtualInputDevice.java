package android.hardware.input;

abstract class VirtualInputDevice implements java.io.Closeable {
    protected static final java.lang.String TAG = "VirtualInputDevice";
    protected final android.companion.virtual.IVirtualDevice mVirtualDevice = null;
    protected final android.os.IBinder mToken = null;
    protected final android.hardware.input.VirtualInputDeviceConfig mConfig = null;
    VirtualInputDevice(android.hardware.input.VirtualInputDeviceConfig p0, android.companion.virtual.IVirtualDevice p1, android.os.IBinder p2) {}
    public int getInputDeviceId() { return 0; }
    @android.annotation.RequiresPermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public void close() {}
    public java.lang.String toString() { return null; }
}
