package android.bluetooth;

public class BluetoothPbap implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothPbap";
    private static final boolean DBG = false;
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.pbap.profile.action.CONNECTION_STATE_CHANGED";
    private volatile android.bluetooth.IBluetoothPbap mService;
    private final android.content.Context mContext = null;
    private android.bluetooth.BluetoothPbap.ServiceListener mServiceListener;
    private android.bluetooth.BluetoothAdapter mAdapter;
    public static final int RESULT_FAILURE = 0;
    public static final int RESULT_SUCCESS = 1;
    public static final int RESULT_CANCELED = 2;
    private final android.bluetooth.IBluetoothStateChangeCallback mBluetoothStateChangeCallback = null;
    private final android.content.ServiceConnection mConnection = null;
    public BluetoothPbap(android.content.Context p0, android.bluetooth.BluetoothPbap.ServiceListener p1) {}
    boolean doBind() { return false; }
    private void doUnbind() {}
    protected void finalize() throws java.lang.Throwable {}
    public synchronized void close() {}
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public boolean isConnected(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    private static void log(java.lang.String p0) {}

    public static interface ServiceListener {
        public void onServiceConnected(android.bluetooth.BluetoothPbap p0);
        public void onServiceDisconnected();
    }
}
