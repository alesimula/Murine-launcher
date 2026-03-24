package android.bluetooth;

@android.annotation.SystemApi
public final class BluetoothA2dpSink implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothA2dpSink";
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("ActionValue")
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.a2dp-sink.profile.action.CONNECTION_STATE_CHANGED";
    private final android.bluetooth.BluetoothAdapter mAdapter = null;
    private final android.content.AttributionSource mAttributionSource = null;
    private final android.bluetooth.BluetoothProfileConnector<android.bluetooth.IBluetoothA2dpSink> mProfileConnector = null;
    BluetoothA2dpSink(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1, android.bluetooth.BluetoothAdapter p2) {}
    void close() {}
    private android.bluetooth.IBluetoothA2dpSink getService() { return null; }
    public void finalize() {}
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
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
    public android.bluetooth.BluetoothAudioConfig getAudioConfig(android.bluetooth.BluetoothDevice p0) { return null; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public int getPriority(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean isAudioPlaying(android.bluetooth.BluetoothDevice p0) { return false; }
    public static java.lang.String stateToString(int p0) { return null; }
    private boolean isEnabled() { return false; }
    private static boolean isValidDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    private static void log(java.lang.String p0) {}
}
