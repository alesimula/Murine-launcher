package android.bluetooth;

@android.annotation.SystemApi
public class BluetoothPbap implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothPbap";
    private static final boolean DBG = false;
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.pbap.profile.action.CONNECTION_STATE_CHANGED";
    private volatile android.bluetooth.IBluetoothPbap mService;
    private final android.content.Context mContext = null;
    private android.bluetooth.BluetoothProfile.ServiceListener mServiceListener;
    private android.bluetooth.BluetoothAdapter mAdapter;
    public static final int RESULT_FAILURE = 0;
    public static final int RESULT_SUCCESS = 1;
    public static final int RESULT_CANCELED = 2;
    private final android.bluetooth.IBluetoothStateChangeCallback mBluetoothStateChangeCallback = null;
    private final android.content.ServiceConnection mConnection = null;
    public BluetoothPbap(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1) {}
    boolean doBind() { return false; }
    private void doUnbind() {}
    protected void finalize() throws java.lang.Throwable {}
    public synchronized void close() {}
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.SystemApi
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    @android.annotation.SystemApi
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    private boolean isEnabled() { return false; }
    private boolean isValidDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    private static void log(java.lang.String p0) {}
}
