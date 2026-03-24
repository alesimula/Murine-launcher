package android.hardware.usb;

public class UsbDeviceConnection {
    public UsbDeviceConnection(android.hardware.usb.UsbDevice p0) {}
    boolean open(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.content.Context p2) { return false; }
    boolean isOpen() { return false; }
    @android.annotation.Nullable
    public android.content.Context getContext() { return null; }
    boolean cancelRequest(android.hardware.usb.UsbRequest p0) { return false; }
    boolean queueRequest(android.hardware.usb.UsbRequest p0, java.nio.ByteBuffer p1, int p2) { return false; }
    boolean queueRequest(android.hardware.usb.UsbRequest p0, java.nio.ByteBuffer p1) { return false; }
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
    @android.annotation.SuppressLint("RequiresPermission")
    public boolean resetDevice() { return false; }
    public android.hardware.usb.UsbRequest requestWait() { return null; }
    public android.hardware.usb.UsbRequest requestWait(long p0) throws java.util.concurrent.TimeoutException { return null; }
    public java.lang.String getSerial() { return null; }
    protected void finalize() throws java.lang.Throwable {}
}
