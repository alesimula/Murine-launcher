package android.bluetooth;

public final class BluetoothHidDevice implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = null;
    private static final boolean DBG = false;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.hiddevice.profile.action.CONNECTION_STATE_CHANGED";
    public static final byte SUBCLASS1_NONE = 0;
    public static final byte SUBCLASS1_KEYBOARD = 64;
    public static final byte SUBCLASS1_MOUSE = -128;
    public static final byte SUBCLASS1_COMBO = -64;
    public static final byte SUBCLASS2_UNCATEGORIZED = 0;
    public static final byte SUBCLASS2_JOYSTICK = 1;
    public static final byte SUBCLASS2_GAMEPAD = 2;
    public static final byte SUBCLASS2_REMOTE_CONTROL = 3;
    public static final byte SUBCLASS2_SENSING_DEVICE = 4;
    public static final byte SUBCLASS2_DIGITIZER_TABLET = 5;
    public static final byte SUBCLASS2_CARD_READER = 6;
    public static final byte REPORT_TYPE_INPUT = 1;
    public static final byte REPORT_TYPE_OUTPUT = 2;
    public static final byte REPORT_TYPE_FEATURE = 3;
    public static final byte ERROR_RSP_SUCCESS = 0;
    public static final byte ERROR_RSP_NOT_READY = 1;
    public static final byte ERROR_RSP_INVALID_RPT_ID = 2;
    public static final byte ERROR_RSP_UNSUPPORTED_REQ = 3;
    public static final byte ERROR_RSP_INVALID_PARAM = 4;
    public static final byte ERROR_RSP_UNKNOWN = 14;
    public static final byte PROTOCOL_BOOT_MODE = 0;
    public static final byte PROTOCOL_REPORT_MODE = 1;
    private final android.bluetooth.BluetoothAdapter mAdapter = null;
    private final android.content.AttributionSource mAttributionSource = null;
    private final android.bluetooth.BluetoothProfileConnector<android.bluetooth.IBluetoothHidDevice> mProfileConnector = null;
    BluetoothHidDevice(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1, android.bluetooth.BluetoothAdapter p2) {}
    void close() {}
    private android.bluetooth.IBluetoothHidDevice getService() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean registerApp(android.bluetooth.BluetoothHidDeviceAppSdpSettings p0, android.bluetooth.BluetoothHidDeviceAppQosSettings p1, android.bluetooth.BluetoothHidDeviceAppQosSettings p2, java.util.concurrent.Executor p3, android.bluetooth.BluetoothHidDevice.Callback p4) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean unregisterApp() { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean sendReport(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean replyReport(android.bluetooth.BluetoothDevice p0, byte p1, byte p2, byte[] p3) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean reportError(android.bluetooth.BluetoothDevice p0, byte p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.lang.String getUserAppName() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean connect(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    private boolean isEnabled() { return false; }
    private boolean isValidDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    private static void log(java.lang.String p0) {}

    public static abstract class Callback {
        private static final java.lang.String TAG = "BluetoothHidDevCallback";
        public Callback() {}
        public void onAppStatusChanged(android.bluetooth.BluetoothDevice p0, boolean p1) {}
        public void onConnectionStateChanged(android.bluetooth.BluetoothDevice p0, int p1) {}
        public void onGetReport(android.bluetooth.BluetoothDevice p0, byte p1, byte p2, int p3) {}
        public void onSetReport(android.bluetooth.BluetoothDevice p0, byte p1, byte p2, byte[] p3) {}
        public void onSetProtocol(android.bluetooth.BluetoothDevice p0, byte p1) {}
        public void onInterruptData(android.bluetooth.BluetoothDevice p0, byte p1, byte[] p2) {}
        public void onVirtualCableUnplug(android.bluetooth.BluetoothDevice p0) {}
    }

    private static class CallbackWrapper extends android.bluetooth.IBluetoothHidDeviceCallback.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.bluetooth.BluetoothHidDevice.Callback mCallback = null;
        private final android.content.AttributionSource mAttributionSource = null;
        CallbackWrapper(java.util.concurrent.Executor p0, android.bluetooth.BluetoothHidDevice.Callback p1, android.content.AttributionSource p2) { super(); }
        public void onAppStatusChanged(android.bluetooth.BluetoothDevice p0, boolean p1) {}
        public void onConnectionStateChanged(android.bluetooth.BluetoothDevice p0, int p1) {}
        public void onGetReport(android.bluetooth.BluetoothDevice p0, byte p1, byte p2, int p3) {}
        public void onSetReport(android.bluetooth.BluetoothDevice p0, byte p1, byte p2, byte[] p3) {}
        public void onSetProtocol(android.bluetooth.BluetoothDevice p0, byte p1) {}
        public void onInterruptData(android.bluetooth.BluetoothDevice p0, byte p1, byte[] p2) {}
        public void onVirtualCableUnplug(android.bluetooth.BluetoothDevice p0) {}
    }
}
