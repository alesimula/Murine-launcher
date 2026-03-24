package com.android.internal.telephony;

public interface IPhoneStateListener extends android.os.IInterface {
    public void onServiceStateChanged(android.telephony.ServiceState p0) throws android.os.RemoteException;
    public void onSignalStrengthChanged(int p0) throws android.os.RemoteException;
    public void onMessageWaitingIndicatorChanged(boolean p0) throws android.os.RemoteException;
    public void onCallForwardingIndicatorChanged(boolean p0) throws android.os.RemoteException;
    public void onCellLocationChanged(android.telephony.CellIdentity p0) throws android.os.RemoteException;
    public void onLegacyCallStateChanged(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onCallStateChanged(int p0) throws android.os.RemoteException;
    public void onDataConnectionStateChanged(int p0, int p1) throws android.os.RemoteException;
    public void onDataActivity(int p0) throws android.os.RemoteException;
    public void onSignalStrengthsChanged(android.telephony.SignalStrength p0) throws android.os.RemoteException;
    public void onCellInfoChanged(java.util.List<android.telephony.CellInfo> p0) throws android.os.RemoteException;
    public void onPreciseCallStateChanged(android.telephony.PreciseCallState p0) throws android.os.RemoteException;
    public void onPreciseDataConnectionStateChanged(android.telephony.PreciseDataConnectionState p0) throws android.os.RemoteException;
    public void onDataConnectionRealTimeInfoChanged(android.telephony.DataConnectionRealTimeInfo p0) throws android.os.RemoteException;
    public void onSrvccStateChanged(int p0) throws android.os.RemoteException;
    public void onVoiceActivationStateChanged(int p0) throws android.os.RemoteException;
    public void onDataActivationStateChanged(int p0) throws android.os.RemoteException;
    public void onOemHookRawEvent(byte[] p0) throws android.os.RemoteException;
    public void onCarrierNetworkChange(boolean p0) throws android.os.RemoteException;
    public void onUserMobileDataStateChanged(boolean p0) throws android.os.RemoteException;
    public void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo p0) throws android.os.RemoteException;
    public void onPhoneCapabilityChanged(android.telephony.PhoneCapability p0) throws android.os.RemoteException;
    public void onActiveDataSubIdChanged(int p0) throws android.os.RemoteException;
    public void onRadioPowerStateChanged(int p0) throws android.os.RemoteException;
    public void onCallStatesChanged(java.util.List<android.telephony.CallState> p0) throws android.os.RemoteException;
    public void onEmergencyNumberListChanged(java.util.Map p0) throws android.os.RemoteException;
    public void onOutgoingEmergencyCall(android.telephony.emergency.EmergencyNumber p0, int p1) throws android.os.RemoteException;
    public void onOutgoingEmergencySms(android.telephony.emergency.EmergencyNumber p0, int p1) throws android.os.RemoteException;
    public void onCallDisconnectCauseChanged(int p0, int p1) throws android.os.RemoteException;
    public void onImsCallDisconnectCauseChanged(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException;
    public void onRegistrationFailed(android.telephony.CellIdentity p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void onBarringInfoChanged(android.telephony.BarringInfo p0) throws android.os.RemoteException;
    public void onPhysicalChannelConfigChanged(java.util.List<android.telephony.PhysicalChannelConfig> p0) throws android.os.RemoteException;
    public void onDataEnabledChanged(boolean p0, int p1) throws android.os.RemoteException;
    public void onAllowedNetworkTypesChanged(int p0, long p1) throws android.os.RemoteException;
    public void onLinkCapacityEstimateChanged(java.util.List<android.telephony.LinkCapacityEstimate> p0) throws android.os.RemoteException;
    public void onMediaQualityStatusChanged(android.telephony.ims.MediaQualityStatus p0) throws android.os.RemoteException;
    public void onCallBackModeStarted(int p0) throws android.os.RemoteException;
    public void onCallBackModeStopped(int p0, int p1) throws android.os.RemoteException;
    public void onSimultaneousCallingStateChanged(int[] p0) throws android.os.RemoteException;
    public void onCarrierRoamingNtnModeChanged(boolean p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.IPhoneStateListener {
        public Default() {}
        public void onServiceStateChanged(android.telephony.ServiceState p0) throws android.os.RemoteException {}
        public void onSignalStrengthChanged(int p0) throws android.os.RemoteException {}
        public void onMessageWaitingIndicatorChanged(boolean p0) throws android.os.RemoteException {}
        public void onCallForwardingIndicatorChanged(boolean p0) throws android.os.RemoteException {}
        public void onCellLocationChanged(android.telephony.CellIdentity p0) throws android.os.RemoteException {}
        public void onLegacyCallStateChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onCallStateChanged(int p0) throws android.os.RemoteException {}
        public void onDataConnectionStateChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onDataActivity(int p0) throws android.os.RemoteException {}
        public void onSignalStrengthsChanged(android.telephony.SignalStrength p0) throws android.os.RemoteException {}
        public void onCellInfoChanged(java.util.List<android.telephony.CellInfo> p0) throws android.os.RemoteException {}
        public void onPreciseCallStateChanged(android.telephony.PreciseCallState p0) throws android.os.RemoteException {}
        public void onPreciseDataConnectionStateChanged(android.telephony.PreciseDataConnectionState p0) throws android.os.RemoteException {}
        public void onDataConnectionRealTimeInfoChanged(android.telephony.DataConnectionRealTimeInfo p0) throws android.os.RemoteException {}
        public void onSrvccStateChanged(int p0) throws android.os.RemoteException {}
        public void onVoiceActivationStateChanged(int p0) throws android.os.RemoteException {}
        public void onDataActivationStateChanged(int p0) throws android.os.RemoteException {}
        public void onOemHookRawEvent(byte[] p0) throws android.os.RemoteException {}
        public void onCarrierNetworkChange(boolean p0) throws android.os.RemoteException {}
        public void onUserMobileDataStateChanged(boolean p0) throws android.os.RemoteException {}
        public void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo p0) throws android.os.RemoteException {}
        public void onPhoneCapabilityChanged(android.telephony.PhoneCapability p0) throws android.os.RemoteException {}
        public void onActiveDataSubIdChanged(int p0) throws android.os.RemoteException {}
        public void onRadioPowerStateChanged(int p0) throws android.os.RemoteException {}
        public void onCallStatesChanged(java.util.List<android.telephony.CallState> p0) throws android.os.RemoteException {}
        public void onEmergencyNumberListChanged(java.util.Map p0) throws android.os.RemoteException {}
        public void onOutgoingEmergencyCall(android.telephony.emergency.EmergencyNumber p0, int p1) throws android.os.RemoteException {}
        public void onOutgoingEmergencySms(android.telephony.emergency.EmergencyNumber p0, int p1) throws android.os.RemoteException {}
        public void onCallDisconnectCauseChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onImsCallDisconnectCauseChanged(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
        public void onRegistrationFailed(android.telephony.CellIdentity p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void onBarringInfoChanged(android.telephony.BarringInfo p0) throws android.os.RemoteException {}
        public void onPhysicalChannelConfigChanged(java.util.List<android.telephony.PhysicalChannelConfig> p0) throws android.os.RemoteException {}
        public void onDataEnabledChanged(boolean p0, int p1) throws android.os.RemoteException {}
        public void onAllowedNetworkTypesChanged(int p0, long p1) throws android.os.RemoteException {}
        public void onLinkCapacityEstimateChanged(java.util.List<android.telephony.LinkCapacityEstimate> p0) throws android.os.RemoteException {}
        public void onMediaQualityStatusChanged(android.telephony.ims.MediaQualityStatus p0) throws android.os.RemoteException {}
        public void onCallBackModeStarted(int p0) throws android.os.RemoteException {}
        public void onCallBackModeStopped(int p0, int p1) throws android.os.RemoteException {}
        public void onSimultaneousCallingStateChanged(int[] p0) throws android.os.RemoteException {}
        public void onCarrierRoamingNtnModeChanged(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.IPhoneStateListener {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.IPhoneStateListener";
        static final int TRANSACTION_onServiceStateChanged = 1;
        static final int TRANSACTION_onSignalStrengthChanged = 2;
        static final int TRANSACTION_onMessageWaitingIndicatorChanged = 3;
        static final int TRANSACTION_onCallForwardingIndicatorChanged = 4;
        static final int TRANSACTION_onCellLocationChanged = 5;
        static final int TRANSACTION_onLegacyCallStateChanged = 6;
        static final int TRANSACTION_onCallStateChanged = 7;
        static final int TRANSACTION_onDataConnectionStateChanged = 8;
        static final int TRANSACTION_onDataActivity = 9;
        static final int TRANSACTION_onSignalStrengthsChanged = 10;
        static final int TRANSACTION_onCellInfoChanged = 11;
        static final int TRANSACTION_onPreciseCallStateChanged = 12;
        static final int TRANSACTION_onPreciseDataConnectionStateChanged = 13;
        static final int TRANSACTION_onDataConnectionRealTimeInfoChanged = 14;
        static final int TRANSACTION_onSrvccStateChanged = 15;
        static final int TRANSACTION_onVoiceActivationStateChanged = 16;
        static final int TRANSACTION_onDataActivationStateChanged = 17;
        static final int TRANSACTION_onOemHookRawEvent = 18;
        static final int TRANSACTION_onCarrierNetworkChange = 19;
        static final int TRANSACTION_onUserMobileDataStateChanged = 20;
        static final int TRANSACTION_onDisplayInfoChanged = 21;
        static final int TRANSACTION_onPhoneCapabilityChanged = 22;
        static final int TRANSACTION_onActiveDataSubIdChanged = 23;
        static final int TRANSACTION_onRadioPowerStateChanged = 24;
        static final int TRANSACTION_onCallStatesChanged = 25;
        static final int TRANSACTION_onEmergencyNumberListChanged = 26;
        static final int TRANSACTION_onOutgoingEmergencyCall = 27;
        static final int TRANSACTION_onOutgoingEmergencySms = 28;
        static final int TRANSACTION_onCallDisconnectCauseChanged = 29;
        static final int TRANSACTION_onImsCallDisconnectCauseChanged = 30;
        static final int TRANSACTION_onRegistrationFailed = 31;
        static final int TRANSACTION_onBarringInfoChanged = 32;
        static final int TRANSACTION_onPhysicalChannelConfigChanged = 33;
        static final int TRANSACTION_onDataEnabledChanged = 34;
        static final int TRANSACTION_onAllowedNetworkTypesChanged = 35;
        static final int TRANSACTION_onLinkCapacityEstimateChanged = 36;
        static final int TRANSACTION_onMediaQualityStatusChanged = 37;
        static final int TRANSACTION_onCallBackModeStarted = 38;
        static final int TRANSACTION_onCallBackModeStopped = 39;
        static final int TRANSACTION_onSimultaneousCallingStateChanged = 40;
        static final int TRANSACTION_onCarrierRoamingNtnModeChanged = 41;
        public Stub() { super(); }
        public static com.android.internal.telephony.IPhoneStateListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telephony.IPhoneStateListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onServiceStateChanged(android.telephony.ServiceState p0) throws android.os.RemoteException {}
            public void onSignalStrengthChanged(int p0) throws android.os.RemoteException {}
            public void onMessageWaitingIndicatorChanged(boolean p0) throws android.os.RemoteException {}
            public void onCallForwardingIndicatorChanged(boolean p0) throws android.os.RemoteException {}
            public void onCellLocationChanged(android.telephony.CellIdentity p0) throws android.os.RemoteException {}
            public void onLegacyCallStateChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onCallStateChanged(int p0) throws android.os.RemoteException {}
            public void onDataConnectionStateChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onDataActivity(int p0) throws android.os.RemoteException {}
            public void onSignalStrengthsChanged(android.telephony.SignalStrength p0) throws android.os.RemoteException {}
            public void onCellInfoChanged(java.util.List<android.telephony.CellInfo> p0) throws android.os.RemoteException {}
            public void onPreciseCallStateChanged(android.telephony.PreciseCallState p0) throws android.os.RemoteException {}
            public void onPreciseDataConnectionStateChanged(android.telephony.PreciseDataConnectionState p0) throws android.os.RemoteException {}
            public void onDataConnectionRealTimeInfoChanged(android.telephony.DataConnectionRealTimeInfo p0) throws android.os.RemoteException {}
            public void onSrvccStateChanged(int p0) throws android.os.RemoteException {}
            public void onVoiceActivationStateChanged(int p0) throws android.os.RemoteException {}
            public void onDataActivationStateChanged(int p0) throws android.os.RemoteException {}
            public void onOemHookRawEvent(byte[] p0) throws android.os.RemoteException {}
            public void onCarrierNetworkChange(boolean p0) throws android.os.RemoteException {}
            public void onUserMobileDataStateChanged(boolean p0) throws android.os.RemoteException {}
            public void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo p0) throws android.os.RemoteException {}
            public void onPhoneCapabilityChanged(android.telephony.PhoneCapability p0) throws android.os.RemoteException {}
            public void onActiveDataSubIdChanged(int p0) throws android.os.RemoteException {}
            public void onRadioPowerStateChanged(int p0) throws android.os.RemoteException {}
            public void onCallStatesChanged(java.util.List<android.telephony.CallState> p0) throws android.os.RemoteException {}
            public void onEmergencyNumberListChanged(java.util.Map p0) throws android.os.RemoteException {}
            public void onOutgoingEmergencyCall(android.telephony.emergency.EmergencyNumber p0, int p1) throws android.os.RemoteException {}
            public void onOutgoingEmergencySms(android.telephony.emergency.EmergencyNumber p0, int p1) throws android.os.RemoteException {}
            public void onCallDisconnectCauseChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onImsCallDisconnectCauseChanged(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
            public void onRegistrationFailed(android.telephony.CellIdentity p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void onBarringInfoChanged(android.telephony.BarringInfo p0) throws android.os.RemoteException {}
            public void onPhysicalChannelConfigChanged(java.util.List<android.telephony.PhysicalChannelConfig> p0) throws android.os.RemoteException {}
            public void onDataEnabledChanged(boolean p0, int p1) throws android.os.RemoteException {}
            public void onAllowedNetworkTypesChanged(int p0, long p1) throws android.os.RemoteException {}
            public void onLinkCapacityEstimateChanged(java.util.List<android.telephony.LinkCapacityEstimate> p0) throws android.os.RemoteException {}
            public void onMediaQualityStatusChanged(android.telephony.ims.MediaQualityStatus p0) throws android.os.RemoteException {}
            public void onCallBackModeStarted(int p0) throws android.os.RemoteException {}
            public void onCallBackModeStopped(int p0, int p1) throws android.os.RemoteException {}
            public void onSimultaneousCallingStateChanged(int[] p0) throws android.os.RemoteException {}
            public void onCarrierRoamingNtnModeChanged(boolean p0) throws android.os.RemoteException {}
        }
    }
}
