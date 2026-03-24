package android.mtp;

public final class MtpDevice {
    private static final java.lang.String TAG = "MtpDevice";
    private final android.hardware.usb.UsbDevice mDevice = null;
    private android.hardware.usb.UsbDeviceConnection mConnection;
    private final java.lang.Object mLock = null;
    private long mNativeContext;
    public MtpDevice(android.hardware.usb.UsbDevice p0) {}
    public boolean open(android.hardware.usb.UsbDeviceConnection p0) { return false; }
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public java.lang.String getDeviceName() { return null; }
    public int getDeviceId() { return 0; }
    public java.lang.String toString() { return null; }
    public android.mtp.MtpDeviceInfo getDeviceInfo() { return null; }
    public int setDevicePropertyInitVersion(java.lang.String p0) { return 0; }
    public int[] getStorageIds() { return null; }
    public int[] getObjectHandles(int p0, int p1, int p2) { return null; }
    public byte[] getObject(int p0, int p1) { return null; }
    public long getPartialObject(int p0, long p1, long p2, byte[] p3) throws java.io.IOException { return 0L; }
    public long getPartialObject64(int p0, long p1, long p2, byte[] p3) throws java.io.IOException { return 0L; }
    public byte[] getThumbnail(int p0) { return null; }
    public android.mtp.MtpStorageInfo getStorageInfo(int p0) { return null; }
    public android.mtp.MtpObjectInfo getObjectInfo(int p0) { return null; }
    public boolean deleteObject(int p0) { return false; }
    public long getParent(int p0) { return 0L; }
    public long getStorageId(int p0) { return 0L; }
    public boolean importFile(int p0, java.lang.String p1) { return false; }
    public boolean importFile(int p0, android.os.ParcelFileDescriptor p1) { return false; }
    public boolean sendObject(int p0, long p1, android.os.ParcelFileDescriptor p2) { return false; }
    public android.mtp.MtpObjectInfo sendObjectInfo(android.mtp.MtpObjectInfo p0) { return null; }
    public android.mtp.MtpEvent readEvent(android.os.CancellationSignal p0) throws java.io.IOException { return null; }
    public long getObjectSizeLong(int p0, int p1) throws java.io.IOException { return 0L; }
    private native boolean native_open(java.lang.String p0, int p1);
    private native void native_close();
    private native android.mtp.MtpDeviceInfo native_get_device_info();
    private native int native_set_device_property_init_version(java.lang.String p0);
    private native int[] native_get_storage_ids();
    private native android.mtp.MtpStorageInfo native_get_storage_info(int p0);
    private native int[] native_get_object_handles(int p0, int p1, int p2);
    private native android.mtp.MtpObjectInfo native_get_object_info(int p0);
    private native byte[] native_get_object(int p0, long p1);
    private native long native_get_partial_object(int p0, long p1, long p2, byte[] p3) throws java.io.IOException;
    private native int native_get_partial_object_64(int p0, long p1, long p2, byte[] p3) throws java.io.IOException;
    private native byte[] native_get_thumbnail(int p0);
    private native boolean native_delete_object(int p0);
    private native int native_get_parent(int p0);
    private native int native_get_storage_id(int p0);
    private native boolean native_import_file(int p0, java.lang.String p1);
    private native boolean native_import_file(int p0, int p1);
    private native boolean native_send_object(int p0, long p1, int p2);
    private native android.mtp.MtpObjectInfo native_send_object_info(android.mtp.MtpObjectInfo p0);
    private native int native_submit_event_request() throws java.io.IOException;
    private native android.mtp.MtpEvent native_reap_event_request(int p0) throws java.io.IOException;
    private native void native_discard_event_request(int p0);
    private native long native_get_object_size_long(int p0, int p1) throws java.io.IOException;
}
