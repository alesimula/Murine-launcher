package android.bluetooth;

public final class BluetoothGatt implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothGatt";
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    private android.bluetooth.IBluetoothGatt mService;
    private volatile android.bluetooth.BluetoothGattCallback mCallback;
    private android.os.Handler mHandler;
    private int mClientIf;
    private android.bluetooth.BluetoothDevice mDevice;
    private boolean mAutoConnect;
    private int mAuthRetryState;
    private int mConnState;
    private final java.lang.Object mStateLock = null;
    private final java.lang.Object mDeviceBusyLock = null;
    private java.lang.Boolean mDeviceBusy;
    private int mTransport;
    private int mPhy;
    private boolean mOpportunistic;
    private static final int AUTH_RETRY_STATE_IDLE = 0;
    private static final int AUTH_RETRY_STATE_NO_MITM = 1;
    private static final int AUTH_RETRY_STATE_MITM = 2;
    private static final int CONN_STATE_IDLE = 0;
    private static final int CONN_STATE_CONNECTING = 1;
    private static final int CONN_STATE_CONNECTED = 2;
    private static final int CONN_STATE_DISCONNECTING = 3;
    private static final int CONN_STATE_CLOSED = 4;
    private java.util.List<android.bluetooth.BluetoothGattService> mServices;
    public static final int GATT_SUCCESS = 0;
    public static final int GATT_READ_NOT_PERMITTED = 2;
    public static final int GATT_WRITE_NOT_PERMITTED = 3;
    public static final int GATT_INSUFFICIENT_AUTHENTICATION = 5;
    public static final int GATT_REQUEST_NOT_SUPPORTED = 6;
    public static final int GATT_INSUFFICIENT_ENCRYPTION = 15;
    public static final int GATT_INVALID_OFFSET = 7;
    public static final int GATT_INVALID_ATTRIBUTE_LENGTH = 13;
    public static final int GATT_CONNECTION_CONGESTED = 143;
    public static final int GATT_FAILURE = 257;
    public static final int CONNECTION_PRIORITY_BALANCED = 0;
    public static final int CONNECTION_PRIORITY_HIGH = 1;
    public static final int CONNECTION_PRIORITY_LOW_POWER = 2;
    static final int AUTHENTICATION_NONE = 0;
    static final int AUTHENTICATION_NO_MITM = 1;
    static final int AUTHENTICATION_MITM = 2;
    private final android.bluetooth.IBluetoothGattCallback mBluetoothGattCallback = null;
    BluetoothGatt(android.bluetooth.IBluetoothGatt p0, android.bluetooth.BluetoothDevice p1, int p2, boolean p3, int p4) {}
    public void close() {}
    android.bluetooth.BluetoothGattService getService(android.bluetooth.BluetoothDevice p0, java.util.UUID p1, int p2) { return null; }
    android.bluetooth.BluetoothGattCharacteristic getCharacteristicById(android.bluetooth.BluetoothDevice p0, int p1) { return null; }
    android.bluetooth.BluetoothGattDescriptor getDescriptorById(android.bluetooth.BluetoothDevice p0, int p1) { return null; }
    private void runOrQueueCallback(java.lang.Runnable p0) {}
    private boolean registerApp(android.bluetooth.BluetoothGattCallback p0, android.os.Handler p1) { return false; }
    private void unregisterApp() {}
    boolean connect(java.lang.Boolean p0, android.bluetooth.BluetoothGattCallback p1, android.os.Handler p2) { return false; }
    public void disconnect() {}
    public boolean connect() { return false; }
    public void setPreferredPhy(int p0, int p1, int p2) {}
    public void readPhy() {}
    public android.bluetooth.BluetoothDevice getDevice() { return null; }
    public boolean discoverServices() { return false; }
    public boolean discoverServiceByUuid(java.util.UUID p0) { return false; }
    public java.util.List<android.bluetooth.BluetoothGattService> getServices() { return null; }
    public android.bluetooth.BluetoothGattService getService(java.util.UUID p0) { return null; }
    public boolean readCharacteristic(android.bluetooth.BluetoothGattCharacteristic p0) { return false; }
    public boolean readUsingCharacteristicUuid(java.util.UUID p0, int p1, int p2) { return false; }
    public boolean writeCharacteristic(android.bluetooth.BluetoothGattCharacteristic p0) { return false; }
    public boolean readDescriptor(android.bluetooth.BluetoothGattDescriptor p0) { return false; }
    public boolean writeDescriptor(android.bluetooth.BluetoothGattDescriptor p0) { return false; }
    public boolean beginReliableWrite() { return false; }
    public boolean executeReliableWrite() { return false; }
    public void abortReliableWrite() {}
    @java.lang.Deprecated
    public void abortReliableWrite(android.bluetooth.BluetoothDevice p0) {}
    public boolean setCharacteristicNotification(android.bluetooth.BluetoothGattCharacteristic p0, boolean p1) { return false; }
    public boolean refresh() { return false; }
    public boolean readRemoteRssi() { return false; }
    public boolean requestMtu(int p0) { return false; }
    public boolean requestConnectionPriority(int p0) { return false; }
    public boolean requestLeConnectionUpdate(int p0, int p1, int p2, int p3, int p4, int p5) { return false; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
}
