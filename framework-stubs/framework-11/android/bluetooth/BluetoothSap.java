package android.bluetooth;

public final class BluetoothSap implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothSap";
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.sap.profile.action.CONNECTION_STATE_CHANGED";
    public static final int STATE_ERROR = -1;
    public static final int RESULT_SUCCESS = 1;
    public static final int RESULT_CANCELED = 2;
    private android.bluetooth.BluetoothAdapter mAdapter;
    private final android.bluetooth.BluetoothProfileConnector<android.bluetooth.IBluetoothSap> mProfileConnector = null;
    BluetoothSap(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1) {}
    protected void finalize() throws java.lang.Throwable {}
    public synchronized void close() {}
    private android.bluetooth.IBluetoothSap getService() { return null; }
    public int getState() { return 0; }
    public android.bluetooth.BluetoothDevice getClient() { return null; }
    public boolean isConnected(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean connect(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.SystemApi
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public int getPriority(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.SystemApi
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    private static void log(java.lang.String p0) {}
    private boolean isEnabled() { return false; }
    private static boolean isValidDevice(android.bluetooth.BluetoothDevice p0) { return false; }
}
