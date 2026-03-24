package android.telephony;

@java.lang.Deprecated
public class PhoneStateListener {
    public static final int LISTEN_NONE = 0;
    @java.lang.Deprecated
    public static final int LISTEN_SERVICE_STATE = 1;
    @java.lang.Deprecated
    public static final int LISTEN_SIGNAL_STRENGTH = 2;
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public static final int LISTEN_MESSAGE_WAITING_INDICATOR = 4;
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public static final int LISTEN_CALL_FORWARDING_INDICATOR = 8;
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static final int LISTEN_CELL_LOCATION = 16;
    @java.lang.Deprecated
    public static final int LISTEN_CALL_STATE = 32;
    @java.lang.Deprecated
    public static final int LISTEN_DATA_CONNECTION_STATE = 64;
    @java.lang.Deprecated
    public static final int LISTEN_DATA_ACTIVITY = 128;
    @java.lang.Deprecated
    public static final int LISTEN_SIGNAL_STRENGTHS = 256;
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION"})
    public static final int LISTEN_CELL_INFO = 1024;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public static final int LISTEN_PRECISE_CALL_STATE = 2048;
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public static final int LISTEN_PRECISE_DATA_CONNECTION_STATE = 4096;
    @java.lang.Deprecated
    public static final int LISTEN_DATA_CONNECTION_REAL_TIME_INFO = 8192;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public static final int LISTEN_SRVCC_STATE_CHANGED = 16384;
    @java.lang.Deprecated
    public static final int LISTEN_OEM_HOOK_RAW_EVENT = 32768;
    @java.lang.Deprecated
    public static final int LISTEN_CARRIER_NETWORK_CHANGE = 65536;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public static final int LISTEN_VOICE_ACTIVATION_STATE = 131072;
    @java.lang.Deprecated
    public static final int LISTEN_DATA_ACTIVATION_STATE = 262144;
    @java.lang.Deprecated
    public static final int LISTEN_USER_MOBILE_DATA_STATE = 524288;
    @java.lang.Deprecated
    public static final int LISTEN_DISPLAY_INFO_CHANGED = 1048576;
    @java.lang.Deprecated
    public static final int LISTEN_PHONE_CAPABILITY_CHANGE = 2097152;
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public static final int LISTEN_ACTIVE_DATA_SUBSCRIPTION_ID_CHANGE = 4194304;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public static final int LISTEN_RADIO_POWER_STATE_CHANGED = 8388608;
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public static final int LISTEN_EMERGENCY_NUMBER_LIST = 16777216;
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public static final int LISTEN_CALL_DISCONNECT_CAUSES = 33554432;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public static final int LISTEN_CALL_ATTRIBUTES_CHANGED = 67108864;
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public static final int LISTEN_IMS_CALL_DISCONNECT_CAUSES = 134217728;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_ACTIVE_EMERGENCY_SESSION")
    public static final int LISTEN_OUTGOING_EMERGENCY_CALL = 268435456;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_ACTIVE_EMERGENCY_SESSION")
    public static final int LISTEN_OUTGOING_EMERGENCY_SMS = 536870912;
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_PRECISE_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION"})
    public static final int LISTEN_REGISTRATION_FAILURE = 1073741824;
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_PRECISE_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION"})
    public static final int LISTEN_BARRING_INFO = -2147483648;
    protected java.lang.Integer mSubId;
    public final com.android.internal.telephony.IPhoneStateListener callback = null;
    public PhoneStateListener() {}
    public PhoneStateListener(android.os.Looper p0) {}
    public PhoneStateListener(java.lang.Integer p0) {}
    public PhoneStateListener(java.lang.Integer p0, android.os.Looper p1) {}
    @java.lang.Deprecated
    public PhoneStateListener(java.util.concurrent.Executor p0) {}
    @java.lang.Deprecated
    public void onServiceStateChanged(android.telephony.ServiceState p0) {}
    @java.lang.Deprecated
    public void onSignalStrengthChanged(int p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public void onMessageWaitingIndicatorChanged(boolean p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public void onCallForwardingIndicatorChanged(boolean p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public void onCellLocationChanged(android.telephony.CellLocation p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(value="android.permission.READ_PHONE_STATE", conditional=true)
    public void onCallStateChanged(int p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void onDataConnectionStateChanged(int p0) {}
    @java.lang.Deprecated
    public void onDataConnectionStateChanged(int p0, int p1) {}
    @java.lang.Deprecated
    public void onDataActivity(int p0) {}
    @java.lang.Deprecated
    public void onSignalStrengthsChanged(android.telephony.SignalStrength p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION"})
    public void onCellInfoChanged(java.util.List<android.telephony.CellInfo> p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public void onPreciseCallStateChanged(android.telephony.PreciseCallState p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public void onCallDisconnectCauseChanged(int p0, int p1) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public void onImsCallDisconnectCauseChanged(android.telephony.ims.ImsReasonInfo p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public void onPreciseDataConnectionStateChanged(android.telephony.PreciseDataConnectionState p0) {}
    @java.lang.Deprecated
    public void onDataConnectionRealTimeInfoChanged(android.telephony.DataConnectionRealTimeInfo p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void onSrvccStateChanged(int p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void onVoiceActivationStateChanged(int p0) {}
    @java.lang.Deprecated
    public void onDataActivationStateChanged(int p0) {}
    @java.lang.Deprecated
    public void onUserMobileDataStateChanged(boolean p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public void onEmergencyNumberListChanged(java.util.Map<java.lang.Integer, java.util.List<android.telephony.emergency.EmergencyNumber>> p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_ACTIVE_EMERGENCY_SESSION")
    public void onOutgoingEmergencyCall(android.telephony.emergency.EmergencyNumber p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_ACTIVE_EMERGENCY_SESSION")
    public void onOutgoingEmergencyCall(android.telephony.emergency.EmergencyNumber p0, int p1) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_ACTIVE_EMERGENCY_SESSION")
    public void onOutgoingEmergencySms(android.telephony.emergency.EmergencyNumber p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void onOutgoingEmergencySms(android.telephony.emergency.EmergencyNumber p0, int p1) {}
    @java.lang.Deprecated
    public void onOemHookRawEvent(byte[] p0) {}
    @java.lang.Deprecated
    public void onPhoneCapabilityChanged(android.telephony.PhoneCapability p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public void onActiveDataSubscriptionIdChanged(int p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public void onCallAttributesChanged(android.telephony.CallAttributes p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void onRadioPowerStateChanged(int p0) {}
    @java.lang.Deprecated
    public void onCarrierNetworkChange(boolean p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_PRECISE_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION"})
    public void onRegistrationFailed(android.telephony.CellIdentity p0, java.lang.String p1, int p2, int p3, int p4) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_PRECISE_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION"})
    public void onBarringInfoChanged(android.telephony.BarringInfo p0) {}

    private static class IPhoneStateListenerStub extends com.android.internal.telephony.IPhoneStateListener.Stub {
        IPhoneStateListenerStub(android.telephony.PhoneStateListener p0, java.util.concurrent.Executor p1) { super(); }
        public void onServiceStateChanged(android.telephony.ServiceState p0) {}
        public void onSignalStrengthChanged(int p0) {}
        public void onMessageWaitingIndicatorChanged(boolean p0) {}
        public void onCallForwardingIndicatorChanged(boolean p0) {}
        public void onCellLocationChanged(android.telephony.CellIdentity p0) {}
        public void onLegacyCallStateChanged(int p0, java.lang.String p1) {}
        public void onCallStateChanged(int p0) {}
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
        public void onOutgoingEmergencyCall(android.telephony.emergency.EmergencyNumber p0, int p1) {}
        public void onOutgoingEmergencySms(android.telephony.emergency.EmergencyNumber p0, int p1) {}
        public void onPhoneCapabilityChanged(android.telephony.PhoneCapability p0) {}
        public void onRadioPowerStateChanged(int p0) {}
        public void onCallStatesChanged(java.util.List<android.telephony.CallState> p0) {}
        public void onActiveDataSubIdChanged(int p0) {}
        public void onImsCallDisconnectCauseChanged(android.telephony.ims.ImsReasonInfo p0) {}
        public void onRegistrationFailed(android.telephony.CellIdentity p0, java.lang.String p1, int p2, int p3, int p4) {}
        public void onBarringInfoChanged(android.telephony.BarringInfo p0) {}
        public void onPhysicalChannelConfigChanged(java.util.List<android.telephony.PhysicalChannelConfig> p0) {}
        public void onDataEnabledChanged(boolean p0, int p1) {}
        public void onAllowedNetworkTypesChanged(int p0, long p1) {}
        public void onLinkCapacityEstimateChanged(java.util.List<android.telephony.LinkCapacityEstimate> p0) {}
        public final void onMediaQualityStatusChanged(android.telephony.ims.MediaQualityStatus p0) {}
        public final void onCallBackModeStarted(int p0) {}
        public final void onCallBackModeStopped(int p0, int p1) {}
        public final void onSimultaneousCallingStateChanged(int[] p0) {}
        public final void onCarrierRoamingNtnModeChanged(boolean p0) {}
    }
}
