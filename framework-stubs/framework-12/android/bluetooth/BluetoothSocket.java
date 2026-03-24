package android.bluetooth;

public final class BluetoothSocket implements java.io.Closeable {
    private static final java.lang.String TAG = "BluetoothSocket";
    private static final boolean DBG = Boolean.valueOf(false);
    private static final boolean VDBG = Boolean.valueOf(false);
    public static final int MAX_RFCOMM_CHANNEL = 30;
    static final int MAX_L2CAP_PACKAGE_SIZE = 65535;
    public static final int TYPE_RFCOMM = 1;
    public static final int TYPE_SCO = 2;
    public static final int TYPE_L2CAP = 3;
    public static final int TYPE_L2CAP_BREDR = 3;
    public static final int TYPE_L2CAP_LE = 4;
    static final int EBADFD = 77;
    static final int EADDRINUSE = 98;
    static final int SEC_FLAG_ENCRYPT = 1;
    static final int SEC_FLAG_AUTH = 2;
    static final int BTSOCK_FLAG_NO_SDP = 4;
    static final int SEC_FLAG_AUTH_MITM = 8;
    static final int SEC_FLAG_AUTH_16_DIGIT = 16;
    private final int mType = 0;
    private android.bluetooth.BluetoothDevice mDevice;
    private java.lang.String mAddress;
    private final boolean mAuth = false;
    private final boolean mEncrypt = false;
    private final android.bluetooth.BluetoothInputStream mInputStream = null;
    private final android.bluetooth.BluetoothOutputStream mOutputStream = null;
    private final android.os.ParcelUuid mUuid = null;
    private boolean mExcludeSdp;
    private boolean mAuthMitm;
    private boolean mMin16DigitPin;
    private android.os.ParcelFileDescriptor mPfd;
    private android.net.LocalSocket mSocket;
    private java.io.InputStream mSocketIS;
    private java.io.OutputStream mSocketOS;
    private int mPort;
    private int mFd;
    private java.lang.String mServiceName;
    private static final int PROXY_CONNECTION_TIMEOUT = 5000;
    private static final int SOCK_SIGNAL_SIZE = 20;
    private java.nio.ByteBuffer mL2capBuffer;
    private int mMaxTxPacketSize;
    private int mMaxRxPacketSize;
    private volatile android.bluetooth.BluetoothSocket.SocketState mSocketState;
    BluetoothSocket(int p0, int p1, boolean p2, boolean p3, android.bluetooth.BluetoothDevice p4, int p5, android.os.ParcelUuid p6) throws java.io.IOException {}
    BluetoothSocket(int p0, int p1, boolean p2, boolean p3, android.bluetooth.BluetoothDevice p4, int p5, android.os.ParcelUuid p6, boolean p7, boolean p8) throws java.io.IOException {}
    private BluetoothSocket(android.bluetooth.BluetoothSocket p0) {}
    private android.bluetooth.BluetoothSocket acceptSocket(java.lang.String p0) throws java.io.IOException { return null; }
    private BluetoothSocket(int p0, int p1, boolean p2, boolean p3, java.lang.String p4, int p5) throws java.io.IOException {}
    protected void finalize() throws java.lang.Throwable {}
    private int getSecurityFlags() { return 0; }
    @android.annotation.RequiresNoPermission
    public android.bluetooth.BluetoothDevice getRemoteDevice() { return null; }
    @android.annotation.RequiresNoPermission
    public java.io.InputStream getInputStream() throws java.io.IOException { return null; }
    @android.annotation.RequiresNoPermission
    public java.io.OutputStream getOutputStream() throws java.io.IOException { return null; }
    @android.annotation.RequiresNoPermission
    public boolean isConnected() { return false; }
    void setServiceName(java.lang.String p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void connect() throws java.io.IOException {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    int bindListen() { return 0; }
    android.bluetooth.BluetoothSocket accept(int p0) throws java.io.IOException { return null; }
    int available() throws java.io.IOException { return 0; }
    int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
    int write(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
    public void close() throws java.io.IOException {}
    void removeChannel() {}
    int getPort() { return 0; }
    @android.annotation.RequiresNoPermission
    public int getMaxTransmitPacketSize() { return 0; }
    @android.annotation.RequiresNoPermission
    public int getMaxReceivePacketSize() { return 0; }
    @android.annotation.RequiresNoPermission
    public int getConnectionType() { return 0; }
    @android.annotation.RequiresNoPermission
    public void setExcludeSdp(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void requestMaximumTxDataLength() throws java.io.IOException {}
    private java.lang.String convertAddr(byte[] p0) { return null; }
    private java.lang.String waitSocketSignal(java.io.InputStream p0) throws java.io.IOException { return null; }
    private void createL2capRxBuffer() {}
    private int readAll(java.io.InputStream p0, byte[] p1) throws java.io.IOException { return 0; }
    private int readInt(java.io.InputStream p0) throws java.io.IOException { return 0; }
    private int fillL2capRxBuffer() throws java.io.IOException { return 0; }

    private static enum SocketState {
        INIT,
        CONNECTED,
        LISTENING,
        CLOSED;
        private SocketState() {}
    }
}
