package android.bluetooth;

public final class BluetoothPbapClient implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothPbapClient";
    private static final boolean DBG = false;
    private static final boolean VDBG = false;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.pbapclient.profile.action.CONNECTION_STATE_CHANGED";
    public static final int STATE_ERROR = -1;
    public static final int RESULT_FAILURE = 0;
    public static final int RESULT_SUCCESS = 1;
    public static final int RESULT_CANCELED = 2;
    private final android.bluetooth.BluetoothAdapter mAdapter = null;
    private final android.content.AttributionSource mAttributionSource = null;
    private final android.bluetooth.BluetoothProfileConnector<android.bluetooth.IBluetoothPbapClient> mProfileConnector = null;
    BluetoothPbapClient(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1, android.bluetooth.BluetoothAdapter p2) {}
    protected void finalize() throws java.lang.Throwable {}
    public synchronized void close() {}
    private android.bluetooth.IBluetoothPbapClient getService() { return null; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean connect(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    private static void log(java.lang.String p0) {}
    private boolean isEnabled() { return false; }
    private static boolean isValidDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public int getPriority(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
}
