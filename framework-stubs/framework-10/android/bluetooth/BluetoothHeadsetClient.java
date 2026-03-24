package android.bluetooth;

public final class BluetoothHeadsetClient implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothHeadsetClient";
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.headsetclient.profile.action.CONNECTION_STATE_CHANGED";
    public static final java.lang.String ACTION_AUDIO_STATE_CHANGED = "android.bluetooth.headsetclient.profile.action.AUDIO_STATE_CHANGED";
    public static final java.lang.String ACTION_AG_EVENT = "android.bluetooth.headsetclient.profile.action.AG_EVENT";
    public static final java.lang.String ACTION_CALL_CHANGED = "android.bluetooth.headsetclient.profile.action.AG_CALL_CHANGED";
    public static final java.lang.String ACTION_RESULT = "android.bluetooth.headsetclient.profile.action.RESULT";
    public static final java.lang.String ACTION_LAST_VTAG = "android.bluetooth.headsetclient.profile.action.LAST_VTAG";
    public static final int STATE_AUDIO_DISCONNECTED = 0;
    public static final int STATE_AUDIO_CONNECTING = 1;
    public static final int STATE_AUDIO_CONNECTED = 2;
    public static final java.lang.String EXTRA_AUDIO_WBS = "android.bluetooth.headsetclient.extra.AUDIO_WBS";
    public static final java.lang.String EXTRA_NETWORK_STATUS = "android.bluetooth.headsetclient.extra.NETWORK_STATUS";
    public static final java.lang.String EXTRA_NETWORK_SIGNAL_STRENGTH = "android.bluetooth.headsetclient.extra.NETWORK_SIGNAL_STRENGTH";
    public static final java.lang.String EXTRA_NETWORK_ROAMING = "android.bluetooth.headsetclient.extra.NETWORK_ROAMING";
    public static final java.lang.String EXTRA_BATTERY_LEVEL = "android.bluetooth.headsetclient.extra.BATTERY_LEVEL";
    public static final java.lang.String EXTRA_OPERATOR_NAME = "android.bluetooth.headsetclient.extra.OPERATOR_NAME";
    public static final java.lang.String EXTRA_VOICE_RECOGNITION = "android.bluetooth.headsetclient.extra.VOICE_RECOGNITION";
    public static final java.lang.String EXTRA_IN_BAND_RING = "android.bluetooth.headsetclient.extra.IN_BAND_RING";
    public static final java.lang.String EXTRA_SUBSCRIBER_INFO = "android.bluetooth.headsetclient.extra.SUBSCRIBER_INFO";
    public static final java.lang.String EXTRA_CALL = "android.bluetooth.headsetclient.extra.CALL";
    public static final java.lang.String EXTRA_NUMBER = "android.bluetooth.headsetclient.extra.NUMBER";
    public static final java.lang.String EXTRA_RESULT_CODE = "android.bluetooth.headsetclient.extra.RESULT_CODE";
    public static final java.lang.String EXTRA_CME_CODE = "android.bluetooth.headsetclient.extra.CME_CODE";
    public static final java.lang.String EXTRA_AG_FEATURE_3WAY_CALLING = "android.bluetooth.headsetclient.extra.EXTRA_AG_FEATURE_3WAY_CALLING";
    public static final java.lang.String EXTRA_AG_FEATURE_VOICE_RECOGNITION = "android.bluetooth.headsetclient.extra.EXTRA_AG_FEATURE_VOICE_RECOGNITION";
    public static final java.lang.String EXTRA_AG_FEATURE_ATTACH_NUMBER_TO_VT = "android.bluetooth.headsetclient.extra.EXTRA_AG_FEATURE_ATTACH_NUMBER_TO_VT";
    public static final java.lang.String EXTRA_AG_FEATURE_REJECT_CALL = "android.bluetooth.headsetclient.extra.EXTRA_AG_FEATURE_REJECT_CALL";
    public static final java.lang.String EXTRA_AG_FEATURE_ECC = "android.bluetooth.headsetclient.extra.EXTRA_AG_FEATURE_ECC";
    public static final java.lang.String EXTRA_AG_FEATURE_RESPONSE_AND_HOLD = "android.bluetooth.headsetclient.extra.EXTRA_AG_FEATURE_RESPONSE_AND_HOLD";
    public static final java.lang.String EXTRA_AG_FEATURE_ACCEPT_HELD_OR_WAITING_CALL = "android.bluetooth.headsetclient.extra.EXTRA_AG_FEATURE_ACCEPT_HELD_OR_WAITING_CALL";
    public static final java.lang.String EXTRA_AG_FEATURE_RELEASE_HELD_OR_WAITING_CALL = "android.bluetooth.headsetclient.extra.EXTRA_AG_FEATURE_RELEASE_HELD_OR_WAITING_CALL";
    public static final java.lang.String EXTRA_AG_FEATURE_RELEASE_AND_ACCEPT = "android.bluetooth.headsetclient.extra.EXTRA_AG_FEATURE_RELEASE_AND_ACCEPT";
    public static final java.lang.String EXTRA_AG_FEATURE_MERGE = "android.bluetooth.headsetclient.extra.EXTRA_AG_FEATURE_MERGE";
    public static final java.lang.String EXTRA_AG_FEATURE_MERGE_AND_DETACH = "android.bluetooth.headsetclient.extra.EXTRA_AG_FEATURE_MERGE_AND_DETACH";
    public static final int ACTION_RESULT_OK = 0;
    public static final int ACTION_RESULT_ERROR = 1;
    public static final int ACTION_RESULT_ERROR_NO_CARRIER = 2;
    public static final int ACTION_RESULT_ERROR_BUSY = 3;
    public static final int ACTION_RESULT_ERROR_NO_ANSWER = 4;
    public static final int ACTION_RESULT_ERROR_DELAYED = 5;
    public static final int ACTION_RESULT_ERROR_BLACKLISTED = 6;
    public static final int ACTION_RESULT_ERROR_CME = 7;
    public static final int CME_PHONE_FAILURE = 0;
    public static final int CME_NO_CONNECTION_TO_PHONE = 1;
    public static final int CME_OPERATION_NOT_ALLOWED = 3;
    public static final int CME_OPERATION_NOT_SUPPORTED = 4;
    public static final int CME_PHSIM_PIN_REQUIRED = 5;
    public static final int CME_PHFSIM_PIN_REQUIRED = 6;
    public static final int CME_PHFSIM_PUK_REQUIRED = 7;
    public static final int CME_SIM_NOT_INSERTED = 10;
    public static final int CME_SIM_PIN_REQUIRED = 11;
    public static final int CME_SIM_PUK_REQUIRED = 12;
    public static final int CME_SIM_FAILURE = 13;
    public static final int CME_SIM_BUSY = 14;
    public static final int CME_SIM_WRONG = 15;
    public static final int CME_INCORRECT_PASSWORD = 16;
    public static final int CME_SIM_PIN2_REQUIRED = 17;
    public static final int CME_SIM_PUK2_REQUIRED = 18;
    public static final int CME_MEMORY_FULL = 20;
    public static final int CME_INVALID_INDEX = 21;
    public static final int CME_NOT_FOUND = 22;
    public static final int CME_MEMORY_FAILURE = 23;
    public static final int CME_TEXT_STRING_TOO_LONG = 24;
    public static final int CME_INVALID_CHARACTER_IN_TEXT_STRING = 25;
    public static final int CME_DIAL_STRING_TOO_LONG = 26;
    public static final int CME_INVALID_CHARACTER_IN_DIAL_STRING = 27;
    public static final int CME_NO_NETWORK_SERVICE = 30;
    public static final int CME_NETWORK_TIMEOUT = 31;
    public static final int CME_EMERGENCY_SERVICE_ONLY = 32;
    public static final int CME_NO_SIMULTANOUS_VOIP_CS_CALLS = 33;
    public static final int CME_NOT_SUPPORTED_FOR_VOIP = 34;
    public static final int CME_SIP_RESPONSE_CODE = 35;
    public static final int CME_NETWORK_PERSONALIZATION_PIN_REQUIRED = 40;
    public static final int CME_NETWORK_PERSONALIZATION_PUK_REQUIRED = 41;
    public static final int CME_NETWORK_SUBSET_PERSONALIZATION_PIN_REQUIRED = 42;
    public static final int CME_NETWORK_SUBSET_PERSONALIZATION_PUK_REQUIRED = 43;
    public static final int CME_SERVICE_PROVIDER_PERSONALIZATION_PIN_REQUIRED = 44;
    public static final int CME_SERVICE_PROVIDER_PERSONALIZATION_PUK_REQUIRED = 45;
    public static final int CME_CORPORATE_PERSONALIZATION_PIN_REQUIRED = 46;
    public static final int CME_CORPORATE_PERSONALIZATION_PUK_REQUIRED = 47;
    public static final int CME_HIDDEN_KEY_REQUIRED = 48;
    public static final int CME_EAP_NOT_SUPPORTED = 49;
    public static final int CME_INCORRECT_PARAMETERS = 50;
    public static final int CALL_ACCEPT_NONE = 0;
    public static final int CALL_ACCEPT_HOLD = 1;
    public static final int CALL_ACCEPT_TERMINATE = 2;
    private android.bluetooth.BluetoothAdapter mAdapter;
    private final android.bluetooth.BluetoothProfileConnector<android.bluetooth.IBluetoothHeadsetClient> mProfileConnector = null;
    BluetoothHeadsetClient(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1) {}
    void close() {}
    private android.bluetooth.IBluetoothHeadsetClient getService() { return null; }
    @android.annotation.UnsupportedAppUsage
    public boolean connect(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public int getPriority(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean startVoiceRecognition(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean stopVoiceRecognition(android.bluetooth.BluetoothDevice p0) { return false; }
    public java.util.List<android.bluetooth.BluetoothHeadsetClientCall> getCurrentCalls(android.bluetooth.BluetoothDevice p0) { return null; }
    public android.os.Bundle getCurrentAgEvents(android.bluetooth.BluetoothDevice p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public boolean acceptCall(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public boolean holdCall(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean rejectCall(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean terminateCall(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothHeadsetClientCall p1) { return false; }
    public boolean enterPrivateMode(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public boolean explicitCallTransfer(android.bluetooth.BluetoothDevice p0) { return false; }
    public android.bluetooth.BluetoothHeadsetClientCall dial(android.bluetooth.BluetoothDevice p0, java.lang.String p1) { return null; }
    public boolean sendDTMF(android.bluetooth.BluetoothDevice p0, byte p1) { return false; }
    public boolean getLastVoiceTagNumber(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public int getAudioState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public void setAudioRouteAllowed(android.bluetooth.BluetoothDevice p0, boolean p1) {}
    public boolean getAudioRouteAllowed(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean connectAudio(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean disconnectAudio(android.bluetooth.BluetoothDevice p0) { return false; }
    public android.os.Bundle getCurrentAgFeatures(android.bluetooth.BluetoothDevice p0) { return null; }
    private boolean isEnabled() { return false; }
    private static boolean isValidDevice(android.bluetooth.BluetoothDevice p0) { return false; }
    private static void log(java.lang.String p0) {}
}
