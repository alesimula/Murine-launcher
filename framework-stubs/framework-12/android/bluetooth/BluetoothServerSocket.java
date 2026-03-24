package android.bluetooth;

@android.annotation.SuppressLint("AndroidFrameworkBluetoothPermission")
public final class BluetoothServerSocket implements java.io.Closeable {
    private static final java.lang.String TAG = "BluetoothServerSocket";
    private static final boolean DBG = false;
    final android.bluetooth.BluetoothSocket mSocket = null;
    private android.os.Handler mHandler;
    private int mMessage;
    private int mChannel;
    BluetoothServerSocket(int p0, boolean p1, boolean p2, int p3) throws java.io.IOException {}
    BluetoothServerSocket(int p0, boolean p1, boolean p2, int p3, boolean p4, boolean p5) throws java.io.IOException {}
    BluetoothServerSocket(int p0, boolean p1, boolean p2, android.os.ParcelUuid p3) throws java.io.IOException {}
    public android.bluetooth.BluetoothSocket accept() throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothSocket accept(int p0) throws java.io.IOException { return null; }
    public void close() throws java.io.IOException {}
    synchronized void setCloseHandler(android.os.Handler p0, int p1) {}
    void setServiceName(java.lang.String p0) {}
    public int getChannel() { return 0; }
    public int getPsm() { return 0; }
    void setChannel(int p0) {}
    public java.lang.String toString() { return null; }
}
