package android.hardware.usb;

public class UsbDeviceConnection {
    private static final java.lang.String TAG = "UsbDeviceConnection";
    private final android.hardware.usb.UsbDevice mDevice = null;
    private android.content.Context mContext;
    @android.annotation.UnsupportedAppUsage
    private long mNativeContext;
    public UsbDeviceConnection(android.hardware.usb.UsbDevice p0) {}
    boolean open(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.content.Context p2) { return false; }
    public android.content.Context getContext() { return null; }
    public void close() {}
    public int getFileDescriptor() { return 0; }
    public byte[] getRawDescriptors() { return null; }
    public boolean claimInterface(android.hardware.usb.UsbInterface p0, boolean p1) { return false; }
    public boolean releaseInterface(android.hardware.usb.UsbInterface p0) { return false; }
    public boolean setInterface(android.hardware.usb.UsbInterface p0) { return false; }
    public boolean setConfiguration(android.hardware.usb.UsbConfiguration p0) { return false; }
    public int controlTransfer(int p0, int p1, int p2, int p3, byte[] p4, int p5, int p6) { return 0; }
    public int controlTransfer(int p0, int p1, int p2, int p3, byte[] p4, int p5, int p6, int p7) { return 0; }
    public int bulkTransfer(android.hardware.usb.UsbEndpoint p0, byte[] p1, int p2, int p3) { return 0; }
    public int bulkTransfer(android.hardware.usb.UsbEndpoint p0, byte[] p1, int p2, int p3, int p4) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public boolean resetDevice() { return false; }
    public android.hardware.usb.UsbRequest requestWait() { return null; }
    public android.hardware.usb.UsbRequest requestWait(long p0) throws java.util.concurrent.TimeoutException { return null; }
    public java.lang.String getSerial() { return null; }
    private static void checkBounds(byte[] p0, int p1, int p2) {}
    protected void finalize() throws java.lang.Throwable {}
    private native boolean native_open(java.lang.String p0, java.io.FileDescriptor p1);
    private native void native_close();
    private native int native_get_fd();
    private native byte[] native_get_desc();
    private native boolean native_claim_interface(int p0, boolean p1);
    private native boolean native_release_interface(int p0);
    private native boolean native_set_interface(int p0, int p1);
    private native boolean native_set_configuration(int p0);
    private native int native_control_request(int p0, int p1, int p2, int p3, byte[] p4, int p5, int p6, int p7);
    private native int native_bulk_request(int p0, byte[] p1, int p2, int p3, int p4);
    private native android.hardware.usb.UsbRequest native_request_wait(long p0) throws java.util.concurrent.TimeoutException;
    private native java.lang.String native_get_serial();
    private native boolean native_reset_device();
}
