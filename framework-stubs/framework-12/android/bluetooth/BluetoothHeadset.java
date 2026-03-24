package android.bluetooth;

public final class BluetoothHeadset implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothHeadset";
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_AUDIO_STATE_CHANGED = "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_ACTIVE_DEVICE_CHANGED = "android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_VENDOR_SPECIFIC_HEADSET_EVENT = "android.bluetooth.headset.action.VENDOR_SPECIFIC_HEADSET_EVENT";
    public static final java.lang.String EXTRA_VENDOR_SPECIFIC_HEADSET_EVENT_CMD = "android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_CMD";
    public static final java.lang.String EXTRA_VENDOR_SPECIFIC_HEADSET_EVENT_CMD_TYPE = "android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_CMD_TYPE";
    public static final int AT_CMD_TYPE_READ = 0;
    public static final int AT_CMD_TYPE_TEST = 1;
    public static final int AT_CMD_TYPE_SET = 2;
    public static final int AT_CMD_TYPE_BASIC = 3;
    public static final int AT_CMD_TYPE_ACTION = 4;
    public static final java.lang.String EXTRA_VENDOR_SPECIFIC_HEADSET_EVENT_ARGS = "android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_ARGS";
    public static final java.lang.String VENDOR_SPECIFIC_HEADSET_EVENT_COMPANY_ID_CATEGORY = "android.bluetooth.headset.intent.category.companyid";
    public static final java.lang.String VENDOR_RESULT_CODE_COMMAND_ANDROID = "+ANDROID";
    public static final java.lang.String VENDOR_SPECIFIC_HEADSET_EVENT_XAPL = "+XAPL";
    public static final java.lang.String VENDOR_SPECIFIC_HEADSET_EVENT_IPHONEACCEV = "+IPHONEACCEV";
    public static final int VENDOR_SPECIFIC_HEADSET_EVENT_IPHONEACCEV_BATTERY_LEVEL = 1;
    public static final java.lang.String VENDOR_SPECIFIC_HEADSET_EVENT_XEVENT = "+XEVENT";
    public static final java.lang.String VENDOR_SPECIFIC_HEADSET_EVENT_XEVENT_BATTERY_LEVEL = "BATTERY";
    public static final int STATE_AUDIO_DISCONNECTED = 10;
    public static final int STATE_AUDIO_CONNECTING = 11;
    public static final int STATE_AUDIO_CONNECTED = 12;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_HF_INDICATORS_VALUE_CHANGED = "android.bluetooth.headset.action.HF_INDICATORS_VALUE_CHANGED";
    public static final java.lang.String EXTRA_HF_INDICATORS_IND_ID = "android.bluetooth.headset.extra.HF_INDICATORS_IND_ID";
    public static final java.lang.String EXTRA_HF_INDICATORS_IND_VALUE = "android.bluetooth.headset.extra.HF_INDICATORS_IND_VALUE";
    private static final int MESSAGE_HEADSET_SERVICE_CONNECTED = 100;
    private static final int MESSAGE_HEADSET_SERVICE_DISCONNECTED = 101;
    private final android.util.CloseGuard mCloseGuard = null;
    private android.content.Context mContext;
    private android.bluetooth.BluetoothProfile.ServiceListener mServiceListener;
    private volatile android.bluetooth.IBluetoothHeadset mService;
    private final android.bluetooth.BluetoothAdapter mAdapter = null;
    private final android.content.AttributionSource mAttributionSource = null;
    @android.annotation.SuppressLint("AndroidFrameworkBluetoothPermission")
    private final android.bluetooth.IBluetoothStateChangeCallback mBluetoothStateChangeCallback = null;
    @android.annotation.SuppressLint("AndroidFrameworkBluetoothPermission")
    private final android.bluetooth.IBluetoothProfileServiceConnection mConnection = null;
    @android.annotation.SuppressLint("AndroidFrameworkBluetoothPermission")
    private final android.os.Handler mHandler = null;
    BluetoothHeadset(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1, android.bluetooth.BluetoothAdapter p2) {}
    private boolean doBind() { return false; }
    private void doUnbind() {}
    void close() {}
    protected void finalize() throws java.lang.Throwable {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.MODIFY_PHONE_STATE"})
    public boolean connect(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.MODIFY_PHONE_STATE"})
    public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED", "android.permission.MODIFY_PHONE_STATE"})
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getPriority(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isNoiseReductionSupported(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isVoiceRecognitionSupported(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.MODIFY_PHONE_STATE"})
    public boolean startVoiceRecognition(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean stopVoiceRecognition(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isAudioConnected(android.bluetooth.BluetoothDevice p0) { return false; }
    public static boolean isBluetoothVoiceDialingEnabled(android.content.Context p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getAudioState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void setAudioRouteAllowed(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean getAudioRouteAllowed() { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void setForceScoAudio(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isAudioOn() { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean connectAudio() { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disconnectAudio() { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.MODIFY_PHONE_STATE"})
    public boolean startScoUsingVirtualVoiceCall() { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.MODIFY_PHONE_STATE"})
    public boolean stopScoUsingVirtualVoiceCall() { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.MODIFY_PHONE_STATE"})
    public void phoneStateChanged(int p0, int p1, int p2, java.lang.String p3, int p4, java.lang.String p5) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.MODIFY_PHONE_STATE"})
    public void clccResponse(int p0, int p1, int p2, int p3, boolean p4, java.lang.String p5, int p6) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean sendVendorSpecificResultCode(android.bluetooth.BluetoothDevice p0, java.lang.String p1, java.lang.String p2) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.MODIFY_PHONE_STATE"})
    public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothDevice getActiveDevice() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isInbandRingingEnabled() { return false; }
    public static boolean isInbandRingingSupported(android.content.Context p0) { return false; }
    private boolean isEnabled() { return false; }
    private boolean isDisabled() { return false; }
    private static boolean isValidDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    private static void log(java.lang.String p0) {}
}
