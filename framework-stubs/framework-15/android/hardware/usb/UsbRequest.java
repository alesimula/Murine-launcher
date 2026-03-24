package android.hardware.usb;

public class UsbRequest {
    static final int MAX_USBFS_BUFFER_SIZE = 16384;
    public UsbRequest() {}
    public boolean initialize(android.hardware.usb.UsbDeviceConnection p0, android.hardware.usb.UsbEndpoint p1) { return false; }
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public android.hardware.usb.UsbEndpoint getEndpoint() { return null; }
    public java.lang.Object getClientData() { return null; }
    public void setClientData(java.lang.Object p0) {}
    @java.lang.Deprecated
    public boolean queue(java.nio.ByteBuffer p0, int p1) { return false; }
    boolean queueIfConnectionOpen(java.nio.ByteBuffer p0, int p1) { return false; }
    public boolean queue(java.nio.ByteBuffer p0) { return false; }
    boolean queueIfConnectionOpen(java.nio.ByteBuffer p0) { return false; }
    void dequeue(boolean p0) {}
    public boolean cancel() { return false; }
    boolean cancelIfOpen() { return false; }
}
