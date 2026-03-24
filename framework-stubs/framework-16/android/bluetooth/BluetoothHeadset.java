package android.bluetooth;

public final class BluetoothHeadset implements android.bluetooth.BluetoothProfile {
    public static final java.lang.String ACTION_ACTIVE_DEVICE_CHANGED = "android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED";
    public static final java.lang.String ACTION_AUDIO_STATE_CHANGED = "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED";
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED";
    public static final java.lang.String ACTION_VENDOR_SPECIFIC_HEADSET_EVENT = "android.bluetooth.headset.action.VENDOR_SPECIFIC_HEADSET_EVENT";
    public static final int AT_CMD_TYPE_ACTION = 4;
    public static final int AT_CMD_TYPE_BASIC = 3;
    public static final int AT_CMD_TYPE_READ = 0;
    public static final int AT_CMD_TYPE_SET = 2;
    public static final int AT_CMD_TYPE_TEST = 1;
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.hfp_connection_failures_api")
    public static final int DISCONNECTED_REASON_INSUFFICIENT_RESOURCES = 3;
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.hfp_connection_failures_api")
    public static final int DISCONNECTED_REASON_RFCOMM_CONNECTION_FAILED = 2;
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.hfp_connection_failures_api")
    public static final int DISCONNECTED_REASON_SDP_DISCOVERY_FAILED = 1;
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.hfp_connection_failures_api")
    public static final int DISCONNECTED_REASON_UNKNOWN = 0;
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.hfp_connection_failures_api")
    public static final java.lang.String EXTRA_DISCONNECTED_REASON = "android.bluetooth.extra.DISCONNECTED_REASON";
    public static final java.lang.String EXTRA_VENDOR_SPECIFIC_HEADSET_EVENT_ARGS = "android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_ARGS";
    public static final java.lang.String EXTRA_VENDOR_SPECIFIC_HEADSET_EVENT_CMD = "android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_CMD";
    public static final java.lang.String EXTRA_VENDOR_SPECIFIC_HEADSET_EVENT_CMD_TYPE = "android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_CMD_TYPE";
    public static final int STATE_AUDIO_CONNECTED = 12;
    public static final int STATE_AUDIO_CONNECTING = 11;
    public static final int STATE_AUDIO_DISCONNECTED = 10;
    public static final java.lang.String VENDOR_RESULT_CODE_COMMAND_ANDROID = "+ANDROID";
    public static final java.lang.String VENDOR_SPECIFIC_HEADSET_EVENT_COMPANY_ID_CATEGORY = "android.bluetooth.headset.intent.category.companyid";
    BluetoothHeadset() {}
    public boolean connect(android.bluetooth.BluetoothDevice p0) { return false; }
    public int connectAudio() { return 0; }
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    public int disconnectAudio() { return 0; }
    public int getAudioRouteAllowed() { return 0; }
    public int getAudioState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public boolean isAudioConnected(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean isInbandRingingEnabled() { return false; }
    public boolean isNoiseReductionSupported(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean isVoiceRecognitionSupported(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean sendVendorSpecificResultCode(android.bluetooth.BluetoothDevice p0, java.lang.String p1, java.lang.String p2) { return false; }
    public int setAudioRouteAllowed(boolean p0) { return 0; }
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public boolean startScoUsingVirtualVoiceCall() { return false; }
    public boolean startVoiceRecognition(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean stopScoUsingVirtualVoiceCall() { return false; }
    public boolean stopVoiceRecognition(android.bluetooth.BluetoothDevice p0) { return false; }
}
