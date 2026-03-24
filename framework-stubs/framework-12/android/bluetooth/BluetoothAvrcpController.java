package android.bluetooth;

public final class BluetoothAvrcpController implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothAvrcpController";
    private static final boolean DBG = false;
    private static final boolean VDBG = false;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.avrcp-controller.profile.action.CONNECTION_STATE_CHANGED";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_PLAYER_SETTING = "android.bluetooth.avrcp-controller.profile.action.PLAYER_SETTING";
    public static final java.lang.String EXTRA_PLAYER_SETTING = "android.bluetooth.avrcp-controller.profile.extra.PLAYER_SETTING";
    private final android.bluetooth.BluetoothAdapter mAdapter = null;
    private final android.content.AttributionSource mAttributionSource = null;
    private final android.bluetooth.BluetoothProfileConnector<android.bluetooth.IBluetoothAvrcpController> mProfileConnector = null;
    BluetoothAvrcpController(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1, android.bluetooth.BluetoothAdapter p2) {}
    void close() {}
    private android.bluetooth.IBluetoothAvrcpController getService() { return null; }
    public void finalize() {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothAvrcpPlayerSettings getPlayerSettings(android.bluetooth.BluetoothDevice p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean setPlayerApplicationSetting(android.bluetooth.BluetoothAvrcpPlayerSettings p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void sendGroupNavigationCmd(android.bluetooth.BluetoothDevice p0, int p1, int p2) {}
    private boolean isEnabled() { return false; }
    private static boolean isValidDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    private static void log(java.lang.String p0) {}
}
