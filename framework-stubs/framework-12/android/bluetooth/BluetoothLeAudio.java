package android.bluetooth;

public final class BluetoothLeAudio implements android.bluetooth.BluetoothProfile, java.lang.AutoCloseable {
    private static final java.lang.String TAG = "BluetoothLeAudio";
    private static final boolean DBG = false;
    private static final boolean VDBG = false;
    private android.util.CloseGuard mCloseGuard;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_LE_AUDIO_CONNECTION_STATE_CHANGED = "android.bluetooth.action.LE_AUDIO_CONNECTION_STATE_CHANGED";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_LE_AUDIO_ACTIVE_DEVICE_CHANGED = "android.bluetooth.action.LE_AUDIO_ACTIVE_DEVICE_CHANGED";
    public static final int GROUP_ID_INVALID = -1;
    private final android.bluetooth.BluetoothAdapter mAdapter = null;
    private final android.content.AttributionSource mAttributionSource = null;
    private final android.bluetooth.BluetoothProfileConnector<android.bluetooth.IBluetoothLeAudio> mProfileConnector = null;
    BluetoothLeAudio(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1, android.bluetooth.BluetoothAdapter p2) {}
    public void close() {}
    private android.bluetooth.IBluetoothLeAudio getService() { return null; }
    protected void finalize() {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean connect(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getActiveDevices() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getGroupId(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    public static java.lang.String stateToString(int p0) { return null; }
    private boolean isValidDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    private static void log(java.lang.String p0) {}
}
