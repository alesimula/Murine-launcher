package android.hardware.usb;

public class UsbRequest {
    private static final java.lang.String TAG = "UsbRequest";
    static final int MAX_USBFS_BUFFER_SIZE = 16384;
    @android.annotation.UnsupportedAppUsage
    private long mNativeContext;
    private android.hardware.usb.UsbEndpoint mEndpoint;
    @android.annotation.UnsupportedAppUsage
    private java.nio.ByteBuffer mBuffer;
    @android.annotation.UnsupportedAppUsage
    private int mLength;
    private java.lang.Object mClientData;
    private android.hardware.usb.UsbDeviceConnection mConnection;
    private boolean mIsUsingNewQueue;
    private java.nio.ByteBuffer mTempBuffer;
    private final java.lang.Object mLock = null;
    public UsbRequest() {}
    public boolean initialize(android.hardware.usb.UsbDeviceConnection p0, android.hardware.usb.UsbEndpoint p1) { return false; }
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public android.hardware.usb.UsbEndpoint getEndpoint() { return null; }
    public java.lang.Object getClientData() { return null; }
    public void setClientData(java.lang.Object p0) {}
    @java.lang.Deprecated
    public boolean queue(java.nio.ByteBuffer p0, int p1) { return false; }
    public boolean queue(java.nio.ByteBuffer p0) { return false; }
    void dequeue(boolean p0) {}
    public boolean cancel() { return false; }
    private native boolean native_init(android.hardware.usb.UsbDeviceConnection p0, int p1, int p2, int p3, int p4);
    private native void native_close();
    private native boolean native_queue(java.nio.ByteBuffer p0, int p1, int p2);
    private native boolean native_queue_array(byte[] p0, int p1, boolean p2);
    private native int native_dequeue_array(byte[] p0, int p1, boolean p2);
    private native boolean native_queue_direct(java.nio.ByteBuffer p0, int p1, boolean p2);
    private native int native_dequeue_direct();
    private native boolean native_cancel();
}
