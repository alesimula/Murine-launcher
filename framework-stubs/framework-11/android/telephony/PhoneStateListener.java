package android.telephony;

public class PhoneStateListener {
    private static final java.lang.String LOG_TAG = "PhoneStateListener";
    private static final boolean DBG = false;
    public static final java.lang.String FLAG_PER_PID_REGISTRATION_LIMIT = "phone_state_listener_per_pid_registration_limit";
    public static final int DEFAULT_PER_PID_REGISTRATION_LIMIT = 50;
    public static final long PHONE_STATE_LISTENER_LIMIT_CHANGE_ID = 150880553L;
    public static final int LISTEN_NONE = 0;
    public static final int LISTEN_SERVICE_STATE = 1;
    @java.lang.Deprecated
    public static final int LISTEN_SIGNAL_STRENGTH = 2;
    public static final int LISTEN_MESSAGE_WAITING_INDICATOR = 4;
    public static final int LISTEN_CALL_FORWARDING_INDICATOR = 8;
    public static final int LISTEN_CELL_LOCATION = 16;
    public static final int LISTEN_CALL_STATE = 32;
    public static final int LISTEN_DATA_CONNECTION_STATE = 64;
    public static final int LISTEN_DATA_ACTIVITY = 128;
    public static final int LISTEN_SIGNAL_STRENGTHS = 256;
    public static final int LISTEN_ALWAYS_REPORTED_SIGNAL_STRENGTH = 512;
    public static final int LISTEN_CELL_INFO = 1024;
    @android.annotation.SystemApi
    public static final int LISTEN_PRECISE_CALL_STATE = 2048;
    public static final int LISTEN_PRECISE_DATA_CONNECTION_STATE = 4096;
    @java.lang.Deprecated
    public static final int LISTEN_DATA_CONNECTION_REAL_TIME_INFO = 8192;
    @android.annotation.SystemApi
    public static final int LISTEN_SRVCC_STATE_CHANGED = 16384;
    @java.lang.Deprecated
    public static final int LISTEN_OEM_HOOK_RAW_EVENT = 32768;
    public static final int LISTEN_CARRIER_NETWORK_CHANGE = 65536;
    @android.annotation.SystemApi
    public static final int LISTEN_VOICE_ACTIVATION_STATE = 131072;
    public static final int LISTEN_DATA_ACTIVATION_STATE = 262144;
    public static final int LISTEN_USER_MOBILE_DATA_STATE = 524288;
    public static final int LISTEN_DISPLAY_INFO_CHANGED = 1048576;
    public static final int LISTEN_PHONE_CAPABILITY_CHANGE = 2097152;
    public static final int LISTEN_ACTIVE_DATA_SUBSCRIPTION_ID_CHANGE = 4194304;
    @android.annotation.SystemApi
    public static final int LISTEN_RADIO_POWER_STATE_CHANGED = 8388608;
    public static final int LISTEN_EMERGENCY_NUMBER_LIST = 16777216;
    public static final int LISTEN_CALL_DISCONNECT_CAUSES = 33554432;
    @android.annotation.SystemApi
    public static final int LISTEN_CALL_ATTRIBUTES_CHANGED = 67108864;
    public static final int LISTEN_IMS_CALL_DISCONNECT_CAUSES = 134217728;
    @android.annotation.SystemApi
    public static final int LISTEN_OUTGOING_EMERGENCY_CALL = 268435456;
    @android.annotation.SystemApi
    public static final int LISTEN_OUTGOING_EMERGENCY_SMS = 536870912;
    public static final int LISTEN_REGISTRATION_FAILURE = 1073741824;
    public static final int LISTEN_BARRING_INFO = -2147483648;
    protected java.lang.Integer mSubId;
    public final com.android.internal.telephony.IPhoneStateListener callback = null;
    public PhoneStateListener() {}
    public PhoneStateListener(android.os.Looper p0) {}
    public PhoneStateListener(java.lang.Integer p0) {}
    public PhoneStateListener(java.lang.Integer p0, android.os.Looper p1) {}
    public PhoneStateListener(java.util.concurrent.Executor p0) {}
    private PhoneStateListener(java.lang.Integer p0, java.util.concurrent.Executor p1) {}
    public void onServiceStateChanged(android.telephony.ServiceState p0) {}
    @java.lang.Deprecated
    public void onSignalStrengthChanged(int p0) {}
    public void onMessageWaitingIndicatorChanged(boolean p0) {}
    public void onCallForwardingIndicatorChanged(boolean p0) {}
    public void onCellLocationChanged(android.telephony.CellLocation p0) {}
    public void onCallStateChanged(int p0, java.lang.String p1) {}
    public void onDataConnectionStateChanged(int p0) {}
    public void onDataConnectionStateChanged(int p0, int p1) {}
    public void onDataActivity(int p0) {}
    public void onSignalStrengthsChanged(android.telephony.SignalStrength p0) {}
    public void onCellInfoChanged(java.util.List<android.telephony.CellInfo> p0) {}
    @android.annotation.SystemApi
    public void onPreciseCallStateChanged(android.telephony.PreciseCallState p0) {}
    public void onCallDisconnectCauseChanged(int p0, int p1) {}
    public void onImsCallDisconnectCauseChanged(android.telephony.ims.ImsReasonInfo p0) {}
    public void onPreciseDataConnectionStateChanged(android.telephony.PreciseDataConnectionState p0) {}
    public void onDataConnectionRealTimeInfoChanged(android.telephony.DataConnectionRealTimeInfo p0) {}
    @android.annotation.SystemApi
    public void onSrvccStateChanged(int p0) {}
    @android.annotation.SystemApi
    public void onVoiceActivationStateChanged(int p0) {}
    public void onDataActivationStateChanged(int p0) {}
    public void onUserMobileDataStateChanged(boolean p0) {}
    public void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo p0) {}
    public void onEmergencyNumberListChanged(java.util.Map<java.lang.Integer, java.util.List<android.telephony.emergency.EmergencyNumber>> p0) {}
    @android.annotation.SystemApi
    public void onOutgoingEmergencyCall(android.telephony.emergency.EmergencyNumber p0) {}
    @android.annotation.SystemApi
    public void onOutgoingEmergencySms(android.telephony.emergency.EmergencyNumber p0) {}
    public void onOemHookRawEvent(byte[] p0) {}
    public void onPhoneCapabilityChanged(android.telephony.PhoneCapability p0) {}
    public void onActiveDataSubscriptionIdChanged(int p0) {}
    @android.annotation.SystemApi
    public void onCallAttributesChanged(android.telephony.CallAttributes p0) {}
    @android.annotation.SystemApi
    public void onRadioPowerStateChanged(int p0) {}
    public void onCarrierNetworkChange(boolean p0) {}
    public void onRegistrationFailed(android.telephony.CellIdentity p0, java.lang.String p1, int p2, int p3, int p4) {}
    public void onBarringInfoChanged(android.telephony.BarringInfo p0) {}
    private void log(java.lang.String p0) {}

    private static class IPhoneStateListenerStub extends com.android.internal.telephony.IPhoneStateListener.Stub {
        private java.lang.ref.WeakReference<android.telephony.PhoneStateListener> mPhoneStateListenerWeakRef;
        private java.util.concurrent.Executor mExecutor;
        IPhoneStateListenerStub(android.telephony.PhoneStateListener p0, java.util.concurrent.Executor p1) { super(); }
        public void onServiceStateChanged(android.telephony.ServiceState p0) {}
        public void onSignalStrengthChanged(int p0) {}
        public void onMessageWaitingIndicatorChanged(boolean p0) {}
        public void onCallForwardingIndicatorChanged(boolean p0) {}
        public void onCellLocationChanged(android.telephony.CellIdentity p0) {}
        public void onCallStateChanged(int p0, java.lang.String p1) {}
        public void onDataConnectionStateChanged(int p0, int p1) {}
        public void onDataActivity(int p0) {}
        public void onSignalStrengthsChanged(android.telephony.SignalStrength p0) {}
        public void onCellInfoChanged(java.util.List<android.telephony.CellInfo> p0) {}
        public void onPreciseCallStateChanged(android.telephony.PreciseCallState p0) {}
        public void onCallDisconnectCauseChanged(int p0, int p1) {}
        public void onPreciseDataConnectionStateChanged(android.telephony.PreciseDataConnectionState p0) {}
        public void onDataConnectionRealTimeInfoChanged(android.telephony.DataConnectionRealTimeInfo p0) {}
        public void onSrvccStateChanged(int p0) {}
        public void onVoiceActivationStateChanged(int p0) {}
        public void onDataActivationStateChanged(int p0) {}
        public void onUserMobileDataStateChanged(boolean p0) {}
        public void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo p0) {}
        public void onOemHookRawEvent(byte[] p0) {}
        public void onCarrierNetworkChange(boolean p0) {}
        public void onEmergencyNumberListChanged(java.util.Map p0) {}
        public void onOutgoingEmergencyCall(android.telephony.emergency.EmergencyNumber p0) {}
        public void onOutgoingEmergencySms(android.telephony.emergency.EmergencyNumber p0) {}
        public void onPhoneCapabilityChanged(android.telephony.PhoneCapability p0) {}
        public void onRadioPowerStateChanged(int p0) {}
        public void onCallAttributesChanged(android.telephony.CallAttributes p0) {}
        public void onActiveDataSubIdChanged(int p0) {}
        public void onImsCallDisconnectCauseChanged(android.telephony.ims.ImsReasonInfo p0) {}
        public void onRegistrationFailed(android.telephony.CellIdentity p0, java.lang.String p1, int p2, int p3, int p4) {}
        public void onBarringInfoChanged(android.telephony.BarringInfo p0) {}
    }
}
