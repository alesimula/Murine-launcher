package android.bluetooth;

@android.annotation.SystemApi
public final class BluetoothPan implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothPan";
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    @android.annotation.SuppressLint("ActionValue")
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.pan.profile.action.CONNECTION_STATE_CHANGED";
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String EXTRA_LOCAL_ROLE = "android.bluetooth.pan.extra.LOCAL_ROLE";
    public static final java.lang.String ACTION_TETHERING_STATE_CHANGED = "android.bluetooth.action.TETHERING_STATE_CHANGED";
    public static final java.lang.String EXTRA_TETHERING_STATE = "android.bluetooth.extra.TETHERING_STATE";
    public static final int PAN_ROLE_NONE = 0;
    public static final int LOCAL_NAP_ROLE = 1;
    public static final int LOCAL_PANU_ROLE = 2;
    public static final int REMOTE_NAP_ROLE = 1;
    public static final int REMOTE_PANU_ROLE = 2;
    public static final int TETHERING_STATE_OFF = 1;
    public static final int TETHERING_STATE_ON = 2;
    public static final int PAN_DISCONNECT_FAILED_NOT_CONNECTED = 1000;
    public static final int PAN_CONNECT_FAILED_ALREADY_CONNECTED = 1001;
    public static final int PAN_CONNECT_FAILED_ATTEMPT_FAILED = 1002;
    public static final int PAN_OPERATION_GENERIC_FAILURE = 1003;
    public static final int PAN_OPERATION_SUCCESS = 1004;
    private final android.content.Context mContext = null;
    private final android.bluetooth.BluetoothAdapter mAdapter = null;
    private final android.content.AttributionSource mAttributionSource = null;
    private final android.bluetooth.BluetoothProfileConnector<android.bluetooth.IBluetoothPan> mProfileConnector = null;
    BluetoothPan(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1, android.bluetooth.BluetoothAdapter p2) {}
    void close() {}
    private android.bluetooth.IBluetoothPan getService() { return null; }
    protected void finalize() {}
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean connect(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED", "android.permission.TETHER_PRIVILEGED"})
    public void setBluetoothTethering(boolean p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isTetheringOn() { return false; }
    private boolean isEnabled() { return false; }
    private static boolean isValidDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    private static void log(java.lang.String p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LocalPanRole {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RemotePanRole {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TetheringState {
    }
}
