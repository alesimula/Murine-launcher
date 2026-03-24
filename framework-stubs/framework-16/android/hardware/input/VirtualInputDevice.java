package android.hardware.input;

abstract class VirtualInputDevice implements java.io.Closeable {
    protected static final java.lang.String TAG = "VirtualInputDevice";
    protected final android.hardware.input.IVirtualInputDevice mVirtualInputDevice = null;
    protected final android.hardware.input.VirtualInputDeviceConfig mConfig = null;
    VirtualInputDevice(android.hardware.input.VirtualInputDeviceConfig p0, android.hardware.input.IVirtualInputDevice p1) {}
    public int getInputDeviceId() { return 0; }
    public void close() {}
    public java.lang.String toString() { return null; }
}
