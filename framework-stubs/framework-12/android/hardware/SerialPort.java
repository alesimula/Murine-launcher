package android.hardware;

public class SerialPort {
    private static final java.lang.String TAG = "SerialPort";
    private int mNativeContext;
    private final java.lang.String mName = null;
    private android.os.ParcelFileDescriptor mFileDescriptor;
    public SerialPort(java.lang.String p0) {}
    public void open(android.os.ParcelFileDescriptor p0, int p1) throws java.io.IOException {}
    public void close() throws java.io.IOException {}
    public java.lang.String getName() { return null; }
    public int read(java.nio.ByteBuffer p0) throws java.io.IOException { return 0; }
    public void write(java.nio.ByteBuffer p0, int p1) throws java.io.IOException {}
    public void sendBreak() {}
    private native void native_open(java.io.FileDescriptor p0, int p1) throws java.io.IOException;
    private native void native_close();
    private native int native_read_array(byte[] p0, int p1) throws java.io.IOException;
    private native int native_read_direct(java.nio.ByteBuffer p0, int p1) throws java.io.IOException;
    private native void native_write_array(byte[] p0, int p1) throws java.io.IOException;
    private native void native_write_direct(java.nio.ByteBuffer p0, int p1) throws java.io.IOException;
    private native void native_send_break();
}
