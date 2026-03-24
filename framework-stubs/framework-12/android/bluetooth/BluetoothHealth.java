package android.bluetooth;

@java.lang.Deprecated
public final class BluetoothHealth implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothHealth";
    @java.lang.Deprecated
    public static final int SOURCE_ROLE = 1;
    @java.lang.Deprecated
    public static final int SINK_ROLE = 2;
    @java.lang.Deprecated
    public static final int CHANNEL_TYPE_RELIABLE = 10;
    @java.lang.Deprecated
    public static final int CHANNEL_TYPE_STREAMING = 11;
    @java.lang.Deprecated
    public static final int STATE_CHANNEL_DISCONNECTED = 0;
    @java.lang.Deprecated
    public static final int STATE_CHANNEL_CONNECTING = 1;
    @java.lang.Deprecated
    public static final int STATE_CHANNEL_CONNECTED = 2;
    @java.lang.Deprecated
    public static final int STATE_CHANNEL_DISCONNECTING = 3;
    @java.lang.Deprecated
    public static final int APP_CONFIG_REGISTRATION_SUCCESS = 0;
    @java.lang.Deprecated
    public static final int APP_CONFIG_REGISTRATION_FAILURE = 1;
    @java.lang.Deprecated
    public static final int APP_CONFIG_UNREGISTRATION_SUCCESS = 2;
    @java.lang.Deprecated
    public static final int APP_CONFIG_UNREGISTRATION_FAILURE = 3;
    BluetoothHealth() {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
    public boolean registerSinkAppConfiguration(java.lang.String p0, int p1, android.bluetooth.BluetoothHealthCallback p2) { return false; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
    public boolean unregisterAppConfiguration(android.bluetooth.BluetoothHealthAppConfiguration p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
    public boolean connectChannelToSource(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothHealthAppConfiguration p1) { return false; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
    public boolean disconnectChannel(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothHealthAppConfiguration p1, int p2) { return false; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
    public android.os.ParcelFileDescriptor getMainChannelFd(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothHealthAppConfiguration p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
}
