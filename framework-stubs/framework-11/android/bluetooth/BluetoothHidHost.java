package android.bluetooth;

@android.annotation.SystemApi
public final class BluetoothHidHost implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothHidHost";
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.input.profile.action.CONNECTION_STATE_CHANGED";
    public static final java.lang.String ACTION_PROTOCOL_MODE_CHANGED = "android.bluetooth.input.profile.action.PROTOCOL_MODE_CHANGED";
    public static final java.lang.String ACTION_HANDSHAKE = "android.bluetooth.input.profile.action.HANDSHAKE";
    public static final java.lang.String ACTION_REPORT = "android.bluetooth.input.profile.action.REPORT";
    public static final java.lang.String ACTION_VIRTUAL_UNPLUG_STATUS = "android.bluetooth.input.profile.action.VIRTUAL_UNPLUG_STATUS";
    public static final java.lang.String ACTION_IDLE_TIME_CHANGED = "android.bluetooth.input.profile.action.IDLE_TIME_CHANGED";
    public static final int INPUT_DISCONNECT_FAILED_NOT_CONNECTED = 5000;
    public static final int INPUT_CONNECT_FAILED_ALREADY_CONNECTED = 5001;
    public static final int INPUT_CONNECT_FAILED_ATTEMPT_FAILED = 5002;
    public static final int INPUT_OPERATION_GENERIC_FAILURE = 5003;
    public static final int INPUT_OPERATION_SUCCESS = 5004;
    public static final int PROTOCOL_REPORT_MODE = 0;
    public static final int PROTOCOL_BOOT_MODE = 1;
    public static final int PROTOCOL_UNSUPPORTED_MODE = 255;
    public static final byte REPORT_TYPE_INPUT = 1;
    public static final byte REPORT_TYPE_OUTPUT = 2;
    public static final byte REPORT_TYPE_FEATURE = 3;
    public static final int VIRTUAL_UNPLUG_STATUS_SUCCESS = 0;
    public static final int VIRTUAL_UNPLUG_STATUS_FAIL = 1;
    public static final java.lang.String EXTRA_PROTOCOL_MODE = "android.bluetooth.BluetoothHidHost.extra.PROTOCOL_MODE";
    public static final java.lang.String EXTRA_REPORT_TYPE = "android.bluetooth.BluetoothHidHost.extra.REPORT_TYPE";
    public static final java.lang.String EXTRA_REPORT_ID = "android.bluetooth.BluetoothHidHost.extra.REPORT_ID";
    public static final java.lang.String EXTRA_REPORT_BUFFER_SIZE = "android.bluetooth.BluetoothHidHost.extra.REPORT_BUFFER_SIZE";
    public static final java.lang.String EXTRA_REPORT = "android.bluetooth.BluetoothHidHost.extra.REPORT";
    public static final java.lang.String EXTRA_STATUS = "android.bluetooth.BluetoothHidHost.extra.STATUS";
    public static final java.lang.String EXTRA_VIRTUAL_UNPLUG_STATUS = "android.bluetooth.BluetoothHidHost.extra.VIRTUAL_UNPLUG_STATUS";
    public static final java.lang.String EXTRA_IDLE_TIME = "android.bluetooth.BluetoothHidHost.extra.IDLE_TIME";
    private android.bluetooth.BluetoothAdapter mAdapter;
    private final android.bluetooth.BluetoothProfileConnector<android.bluetooth.IBluetoothHidHost> mProfileConnector = null;
    BluetoothHidHost(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1) {}
    void close() {}
    private android.bluetooth.IBluetoothHidHost getService() { return null; }
    public boolean connect(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.SystemApi
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    @android.annotation.SystemApi
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.SystemApi
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public int getPriority(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.SystemApi
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    private boolean isEnabled() { return false; }
    private static boolean isValidDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean virtualUnplug(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean getProtocolMode(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean setProtocolMode(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public boolean getReport(android.bluetooth.BluetoothDevice p0, byte p1, byte p2, int p3) { return false; }
    public boolean setReport(android.bluetooth.BluetoothDevice p0, byte p1, java.lang.String p2) { return false; }
    public boolean sendData(android.bluetooth.BluetoothDevice p0, java.lang.String p1) { return false; }
    public boolean getIdleTime(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean setIdleTime(android.bluetooth.BluetoothDevice p0, byte p1) { return false; }
    private static void log(java.lang.String p0) {}
}
