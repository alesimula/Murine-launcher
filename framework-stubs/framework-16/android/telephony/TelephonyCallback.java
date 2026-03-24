package android.telephony;

public class TelephonyCallback {
    public static final java.lang.String FLAG_PER_PID_REGISTRATION_LIMIT = "phone_state_listener_per_pid_registration_limit";
    public static final int DEFAULT_PER_PID_REGISTRATION_LIMIT = 50;
    public static final long PHONE_STATE_LISTENER_LIMIT_CHANGE_ID = 150880553L;
    @android.annotation.SystemApi
    public static final int EVENT_SERVICE_STATE_CHANGED = 1;
    @android.annotation.SystemApi
    public static final int EVENT_SIGNAL_STRENGTH_CHANGED = 2;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public static final int EVENT_MESSAGE_WAITING_INDICATOR_CHANGED = 3;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public static final int EVENT_CALL_FORWARDING_INDICATOR_CHANGED = 4;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static final int EVENT_CELL_LOCATION_CHANGED = 5;
    @android.annotation.SystemApi
    public static final int EVENT_CALL_STATE_CHANGED = 6;
    @android.annotation.SystemApi
    public static final int EVENT_DATA_CONNECTION_STATE_CHANGED = 7;
    @android.annotation.SystemApi
    public static final int EVENT_DATA_ACTIVITY_CHANGED = 8;
    @android.annotation.SystemApi
    public static final int EVENT_SIGNAL_STRENGTHS_CHANGED = 9;
    @android.annotation.SystemApi
    public static final int EVENT_ALWAYS_REPORTED_SIGNAL_STRENGTH_CHANGED = 10;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION"})
    public static final int EVENT_CELL_INFO_CHANGED = 11;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public static final int EVENT_PRECISE_CALL_STATE_CHANGED = 12;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public static final int EVENT_PRECISE_DATA_CONNECTION_STATE_CHANGED = 13;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public static final int EVENT_DATA_CONNECTION_REAL_TIME_INFO_CHANGED = 14;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public static final int EVENT_OEM_HOOK_RAW = 15;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public static final int EVENT_SRVCC_STATE_CHANGED = 16;
    @android.annotation.SystemApi
    public static final int EVENT_CARRIER_NETWORK_CHANGED = 17;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public static final int EVENT_VOICE_ACTIVATION_STATE_CHANGED = 18;
    @android.annotation.SystemApi
    public static final int EVENT_DATA_ACTIVATION_STATE_CHANGED = 19;
    @android.annotation.SystemApi
    public static final int EVENT_USER_MOBILE_DATA_STATE_CHANGED = 20;
    @android.annotation.SystemApi
    public static final int EVENT_DISPLAY_INFO_CHANGED = 21;
    @android.annotation.SystemApi
    public static final int EVENT_PHONE_CAPABILITY_CHANGED = 22;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public static final int EVENT_ACTIVE_DATA_SUBSCRIPTION_ID_CHANGED = 23;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public static final int EVENT_RADIO_POWER_STATE_CHANGED = 24;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public static final int EVENT_EMERGENCY_NUMBER_LIST_CHANGED = 25;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public static final int EVENT_CALL_DISCONNECT_CAUSE_CHANGED = 26;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public static final int EVENT_CALL_ATTRIBUTES_CHANGED = 27;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public static final int EVENT_IMS_CALL_DISCONNECT_CAUSE_CHANGED = 28;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_ACTIVE_EMERGENCY_SESSION")
    public static final int EVENT_OUTGOING_EMERGENCY_CALL = 29;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_ACTIVE_EMERGENCY_SESSION")
    public static final int EVENT_OUTGOING_EMERGENCY_SMS = 30;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_PRECISE_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION"})
    public static final int EVENT_REGISTRATION_FAILURE = 31;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_PRECISE_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION"})
    public static final int EVENT_BARRING_INFO_CHANGED = 32;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public static final int EVENT_PHYSICAL_CHANNEL_CONFIG_CHANGED = 33;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public static final int EVENT_DATA_ENABLED_CHANGED = 34;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public static final int EVENT_ALLOWED_NETWORK_TYPE_LIST_CHANGED = 35;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_CALL_LOG")
    public static final int EVENT_LEGACY_CALL_STATE_CHANGED = 36;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public static final int EVENT_LINK_CAPACITY_ESTIMATE_CHANGED = 37;
    public static final int EVENT_TRIGGER_NOTIFY_ANBR = 38;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
    public static final int EVENT_MEDIA_QUALITY_STATUS_CHANGED = 39;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.emergency_callback_mode_notification")
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public static final int EVENT_EMERGENCY_CALLBACK_MODE_CHANGED = 40;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.simultaneous_calling_indications")
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public static final int EVENT_SIMULTANEOUS_CELLULAR_CALLING_SUBSCRIPTIONS_CHANGED = 41;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public static final int EVENT_CARRIER_ROAMING_NTN_MODE_CHANGED = 42;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public static final int EVENT_CARRIER_ROAMING_NTN_ELIGIBLE_STATE_CHANGED = 43;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public static final int EVENT_CARRIER_ROAMING_NTN_AVAILABLE_SERVICES_CHANGED = 44;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public static final int EVENT_CARRIER_ROAMING_NTN_SIGNAL_STRENGTH_CHANGED = 45;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.cellular_identifier_disclosure_indications")
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public static final int EVENT_SECURITY_ALGORITHMS_CHANGED = 46;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.cellular_identifier_disclosure_indications")
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public static final int EVENT_CELLULAR_IDENTIFIER_DISCLOSED_CHANGED = 47;
    public com.android.internal.telephony.IPhoneStateListener callback;
    public TelephonyCallback() {}
    public void init(java.util.concurrent.Executor p0) {}

    public static interface ActiveDataSubscriptionIdListener {
        @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
        public void onActiveDataSubscriptionIdChanged(int p0);
    }

    @android.annotation.SystemApi
    public static interface AllowedNetworkTypesListener {
        @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
        public void onAllowedNetworkTypesChanged(int p0, long p1);
    }

    public static interface BarringInfoListener {
        @android.annotation.RequiresPermission(allOf={"android.permission.READ_PRECISE_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION"})
        public void onBarringInfoChanged(android.telephony.BarringInfo p0);
    }

    @android.annotation.SystemApi
    public static interface CallAttributesListener {
        @java.lang.Deprecated
        @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
        default public void onCallAttributesChanged(android.telephony.CallAttributes p0) {}
        @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
        default public void onCallStatesChanged(java.util.List<android.telephony.CallState> p0) {}
    }

    public static interface CallDisconnectCauseListener {
        @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
        public void onCallDisconnectCauseChanged(int p0, int p1);
    }

    public static interface CallForwardingIndicatorListener {
        @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
        public void onCallForwardingIndicatorChanged(boolean p0);
    }

    public static interface CallStateListener {
        @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
        public void onCallStateChanged(int p0);
    }

    public static interface CarrierNetworkListener {
        public void onCarrierNetworkChange(boolean p0);
    }

    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static interface CarrierRoamingNtnListener {
        public void onCarrierRoamingNtnModeChanged(boolean p0);
        default public void onCarrierRoamingNtnEligibleStateChanged(boolean p0) {}
        default public void onCarrierRoamingNtnAvailableServicesChanged(int[] p0) {}
        default public void onCarrierRoamingNtnSignalStrengthChanged(android.telephony.satellite.NtnSignalStrength p0) {}
    }

    public static interface CellInfoListener {
        @android.annotation.RequiresPermission(allOf={"android.permission.READ_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION"})
        public void onCellInfoChanged(java.util.List<android.telephony.CellInfo> p0);
    }

    public static interface CellLocationListener {
        @android.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        public void onCellLocationChanged(android.telephony.CellLocation p0);
    }

    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.cellular_identifier_disclosure_indications")
    public static interface CellularIdentifierDisclosedListener {
        public void onCellularIdentifierDisclosedChanged(android.telephony.CellularIdentifierDisclosure p0);
    }

    public static interface DataActivationStateListener {
        public void onDataActivationStateChanged(int p0);
    }

    public static interface DataActivityListener {
        public void onDataActivity(int p0);
    }

    public static interface DataConnectionStateListener {
        public void onDataConnectionStateChanged(int p0, int p1);
    }

    @android.annotation.SystemApi
    public static interface DataEnabledListener {
        @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
        public void onDataEnabledChanged(boolean p0, int p1);
    }

    public static interface DisplayInfoListener {
        public void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo p0);
    }

    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.emergency_callback_mode_notification")
    public static interface EmergencyCallbackModeListener {
        public void onCallbackModeStarted(int p0, java.time.Duration p1, int p2);
        public void onCallbackModeRestarted(int p0, java.time.Duration p1, int p2);
        public void onCallbackModeStopped(int p0, int p1, int p2);
    }

    public static interface EmergencyNumberListListener {
        @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
        public void onEmergencyNumberListChanged(java.util.Map<java.lang.Integer, java.util.List<android.telephony.emergency.EmergencyNumber>> p0);
    }

    private static class IPhoneStateListenerStub extends com.android.internal.telephony.IPhoneStateListener.Stub {
        IPhoneStateListenerStub(android.telephony.TelephonyCallback p0, java.util.concurrent.Executor p1) { super(); }
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
        public void onSimultaneousCallingStateChanged(int[] p0) {}
        public void onLinkCapacityEstimateChanged(java.util.List<android.telephony.LinkCapacityEstimate> p0) {}
        public void onMediaQualityStatusChanged(android.telephony.ims.MediaQualityStatus p0) {}
        @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
        public void onCallbackModeStarted(int p0, long p1, int p2) {}
        @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
        public void onCallbackModeRestarted(int p0, long p1, int p2) {}
        @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
        public void onCallbackModeStopped(int p0, int p1, int p2) {}
        public void onCarrierRoamingNtnModeChanged(boolean p0) {}
        public void onCarrierRoamingNtnEligibleStateChanged(boolean p0) {}
        public void onCarrierRoamingNtnAvailableServicesChanged(int[] p0) {}
        public void onCarrierRoamingNtnSignalStrengthChanged(android.telephony.satellite.NtnSignalStrength p0) {}
        public void onSecurityAlgorithmsChanged(android.telephony.SecurityAlgorithmUpdate p0) {}
        public void onCellularIdentifierDisclosedChanged(android.telephony.CellularIdentifierDisclosure p0) {}
    }

    public static interface ImsCallDisconnectCauseListener {
        @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
        public void onImsCallDisconnectCauseChanged(android.telephony.ims.ImsReasonInfo p0);
    }

    @android.annotation.SystemApi
    public static interface LinkCapacityEstimateChangedListener {
        @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
        public void onLinkCapacityEstimateChanged(java.util.List<android.telephony.LinkCapacityEstimate> p0);
    }

    @android.annotation.SystemApi
    public static interface MediaQualityStatusChangedListener {
        @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
        public void onMediaQualityStatusChanged(android.telephony.ims.MediaQualityStatus p0);
    }

    public static interface MessageWaitingIndicatorListener {
        @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
        public void onMessageWaitingIndicatorChanged(boolean p0);
    }

    @android.annotation.SystemApi
    public static interface OutgoingEmergencyCallListener {
        @android.annotation.RequiresPermission("android.permission.READ_ACTIVE_EMERGENCY_SESSION")
        public void onOutgoingEmergencyCall(android.telephony.emergency.EmergencyNumber p0, int p1);
    }

    @android.annotation.SystemApi
    public static interface OutgoingEmergencySmsListener {
        @android.annotation.RequiresPermission("android.permission.READ_ACTIVE_EMERGENCY_SESSION")
        public void onOutgoingEmergencySms(android.telephony.emergency.EmergencyNumber p0, int p1);
    }

    @android.annotation.SystemApi
    public static interface PhoneCapabilityListener {
        public void onPhoneCapabilityChanged(android.telephony.PhoneCapability p0);
    }

    public static interface PhysicalChannelConfigListener {
        @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
        public void onPhysicalChannelConfigChanged(java.util.List<android.telephony.PhysicalChannelConfig> p0);
    }

    @android.annotation.SystemApi
    public static interface PreciseCallStateListener {
        @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
        public void onPreciseCallStateChanged(android.telephony.PreciseCallState p0);
    }

    public static interface PreciseDataConnectionStateListener {
        @android.annotation.RequiresPermission("android.permission.READ_PRECISE_PHONE_STATE")
        public void onPreciseDataConnectionStateChanged(android.telephony.PreciseDataConnectionState p0);
    }

    @android.annotation.SystemApi
    public static interface RadioPowerStateListener {
        @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
        public void onRadioPowerStateChanged(int p0);
    }

    public static interface RegistrationFailedListener {
        @android.annotation.RequiresPermission(allOf={"android.permission.READ_PRECISE_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION"})
        public void onRegistrationFailed(android.telephony.CellIdentity p0, java.lang.String p1, int p2, int p3, int p4);
    }

    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.security_algorithms_update_indications")
    public static interface SecurityAlgorithmsListener {
        public void onSecurityAlgorithmsChanged(android.telephony.SecurityAlgorithmUpdate p0);
    }

    public static interface ServiceStateListener {
        public void onServiceStateChanged(android.telephony.ServiceState p0);
    }

    public static interface SignalStrengthsListener {
        public void onSignalStrengthsChanged(android.telephony.SignalStrength p0);
    }

    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.simultaneous_calling_indications")
    public static interface SimultaneousCellularCallingSupportListener {
        @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
        public void onSimultaneousCellularCallingSubscriptionsChanged(java.util.Set<java.lang.Integer> p0);
    }

    @android.annotation.SystemApi
    public static interface SrvccStateListener {
        @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
        public void onSrvccStateChanged(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TelephonyEvent {
    }

    public static interface UserMobileDataStateListener {
        public void onUserMobileDataStateChanged(boolean p0);
    }

    @android.annotation.SystemApi
    public static interface VoiceActivationStateListener {
        @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
        public void onVoiceActivationStateChanged(int p0);
    }
}
