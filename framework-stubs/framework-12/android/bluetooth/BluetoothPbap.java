package android.bluetooth;

@android.annotation.SystemApi
public class BluetoothPbap implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothPbap";
    private static final boolean DBG = false;
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("ActionValue")
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.pbap.profile.action.CONNECTION_STATE_CHANGED";
    private volatile android.bluetooth.IBluetoothPbap mService;
    private final android.content.Context mContext = null;
    private android.bluetooth.BluetoothProfile.ServiceListener mServiceListener;
    private final android.bluetooth.BluetoothAdapter mAdapter = null;
    private final android.content.AttributionSource mAttributionSource = null;
    public static final int RESULT_FAILURE = 0;
    public static final int RESULT_SUCCESS = 1;
    public static final int RESULT_CANCELED = 2;
    @android.annotation.SuppressLint("AndroidFrameworkBluetoothPermission")
    private final android.bluetooth.IBluetoothStateChangeCallback mBluetoothStateChangeCallback = null;
    @android.annotation.SuppressLint("AndroidFrameworkBluetoothPermission")
    private final android.content.ServiceConnection mConnection = null;
    public BluetoothPbap(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1, android.bluetooth.BluetoothAdapter p2) {}
    @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
    boolean doBind() { return false; }
    private void doUnbind() {}
    protected void finalize() throws java.lang.Throwable {}
    public synchronized void close() {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    private boolean isEnabled() { return false; }
    private boolean isValidDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    private static void log(java.lang.String p0) {}
}
