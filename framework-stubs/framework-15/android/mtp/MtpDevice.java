package android.mtp;

public final class MtpDevice {
    public MtpDevice(android.hardware.usb.UsbDevice p0) {}
    public boolean open(android.hardware.usb.UsbDeviceConnection p0) { return false; }
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    @android.annotation.NonNull
    public java.lang.String getDeviceName() { return null; }
    public int getDeviceId() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.Nullable
    public android.mtp.MtpDeviceInfo getDeviceInfo() { return null; }
    public int setDevicePropertyInitVersion(java.lang.String p0) { return 0; }
    @android.annotation.Nullable
    public int[] getStorageIds() { return null; }
    @android.annotation.Nullable
    public int[] getObjectHandles(int p0, int p1, int p2) { return null; }
    @android.annotation.Nullable
    public byte[] getObject(int p0, int p1) { return null; }
    public long getPartialObject(int p0, long p1, long p2, byte[] p3) throws java.io.IOException { return 0L; }
    public long getPartialObject64(int p0, long p1, long p2, byte[] p3) throws java.io.IOException { return 0L; }
    @android.annotation.Nullable
    public byte[] getThumbnail(int p0) { return null; }
    @android.annotation.Nullable
    public android.mtp.MtpStorageInfo getStorageInfo(int p0) { return null; }
    @android.annotation.Nullable
    public android.mtp.MtpObjectInfo getObjectInfo(int p0) { return null; }
    public boolean deleteObject(int p0) { return false; }
    public long getParent(int p0) { return 0L; }
    public long getStorageId(int p0) { return 0L; }
    public boolean importFile(int p0, java.lang.String p1) { return false; }
    public boolean importFile(int p0, android.os.ParcelFileDescriptor p1) { return false; }
    public boolean sendObject(int p0, long p1, android.os.ParcelFileDescriptor p2) { return false; }
    @android.annotation.Nullable
    public android.mtp.MtpObjectInfo sendObjectInfo(android.mtp.MtpObjectInfo p0) { return null; }
    @android.annotation.NonNull
    public android.mtp.MtpEvent readEvent(android.os.CancellationSignal p0) throws java.io.IOException { return null; }
    public long getObjectSizeLong(int p0, int p1) throws java.io.IOException { return 0L; }
}
