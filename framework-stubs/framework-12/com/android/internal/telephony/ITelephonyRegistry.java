package com.android.internal.telephony;

public interface ITelephonyRegistry extends android.os.IInterface {
    public void addOnSubscriptionsChangedListener(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.IOnSubscriptionsChangedListener p2) throws android.os.RemoteException;
    public void addOnOpportunisticSubscriptionsChangedListener(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.IOnSubscriptionsChangedListener p2) throws android.os.RemoteException;
    public void removeOnSubscriptionsChangedListener(java.lang.String p0, com.android.internal.telephony.IOnSubscriptionsChangedListener p1) throws android.os.RemoteException;
    public void listenWithEventList(int p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.IPhoneStateListener p3, int[] p4, boolean p5) throws android.os.RemoteException;
    public void notifyCallStateForAllSubs(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void notifyCallState(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void notifyServiceStateForPhoneId(int p0, int p1, android.telephony.ServiceState p2) throws android.os.RemoteException;
    public void notifySignalStrengthForPhoneId(int p0, int p1, android.telephony.SignalStrength p2) throws android.os.RemoteException;
    public void notifyMessageWaitingChangedForPhoneId(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void notifyCallForwardingChanged(boolean p0) throws android.os.RemoteException;
    public void notifyCallForwardingChangedForSubscriber(int p0, boolean p1) throws android.os.RemoteException;
    public void notifyDataActivity(int p0) throws android.os.RemoteException;
    public void notifyDataActivityForSubscriber(int p0, int p1) throws android.os.RemoteException;
    public void notifyDataConnectionForSubscriber(int p0, int p1, android.telephony.PreciseDataConnectionState p2) throws android.os.RemoteException;
    public void notifyCellLocationForSubscriber(int p0, android.telephony.CellIdentity p1) throws android.os.RemoteException;
    public void notifyCellInfo(java.util.List<android.telephony.CellInfo> p0) throws android.os.RemoteException;
    public void notifyPreciseCallState(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void notifyDisconnectCause(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void notifyCellInfoForSubscriber(int p0, java.util.List<android.telephony.CellInfo> p1) throws android.os.RemoteException;
    public void notifySrvccStateChanged(int p0, int p1) throws android.os.RemoteException;
    public void notifySimActivationStateChangedForPhoneId(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void notifyOemHookRawEventForSubscriber(int p0, int p1, byte[] p2) throws android.os.RemoteException;
    public void notifySubscriptionInfoChanged() throws android.os.RemoteException;
    public void notifyOpportunisticSubscriptionInfoChanged() throws android.os.RemoteException;
    public void notifyCarrierNetworkChange(boolean p0) throws android.os.RemoteException;
    public void notifyUserMobileDataStateChangedForPhoneId(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void notifyDisplayInfoChanged(int p0, int p1, android.telephony.TelephonyDisplayInfo p2) throws android.os.RemoteException;
    public void notifyPhoneCapabilityChanged(android.telephony.PhoneCapability p0) throws android.os.RemoteException;
    public void notifyActiveDataSubIdChanged(int p0) throws android.os.RemoteException;
    public void notifyRadioPowerStateChanged(int p0, int p1, int p2) throws android.os.RemoteException;
    public void notifyEmergencyNumberList(int p0, int p1) throws android.os.RemoteException;
    public void notifyOutgoingEmergencyCall(int p0, int p1, android.telephony.emergency.EmergencyNumber p2) throws android.os.RemoteException;
    public void notifyOutgoingEmergencySms(int p0, int p1, android.telephony.emergency.EmergencyNumber p2) throws android.os.RemoteException;
    public void notifyCallQualityChanged(android.telephony.CallQuality p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void notifyImsDisconnectCause(int p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException;
    public void notifyRegistrationFailed(int p0, int p1, android.telephony.CellIdentity p2, java.lang.String p3, int p4, int p5, int p6) throws android.os.RemoteException;
    public void notifyBarringInfoChanged(int p0, int p1, android.telephony.BarringInfo p2) throws android.os.RemoteException;
    public void notifyPhysicalChannelConfigForSubscriber(int p0, int p1, java.util.List<android.telephony.PhysicalChannelConfig> p2) throws android.os.RemoteException;
    public void notifyDataEnabled(int p0, int p1, boolean p2, int p3) throws android.os.RemoteException;
    public void notifyAllowedNetworkTypesChanged(int p0, int p1, int p2, long p3) throws android.os.RemoteException;
    public void notifyLinkCapacityEstimateChanged(int p0, int p1, java.util.List<android.telephony.LinkCapacityEstimate> p2) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.ITelephonyRegistry {
        public Default() {}
        public void addOnSubscriptionsChangedListener(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.IOnSubscriptionsChangedListener p2) throws android.os.RemoteException {}
        public void addOnOpportunisticSubscriptionsChangedListener(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.IOnSubscriptionsChangedListener p2) throws android.os.RemoteException {}
        public void removeOnSubscriptionsChangedListener(java.lang.String p0, com.android.internal.telephony.IOnSubscriptionsChangedListener p1) throws android.os.RemoteException {}
        public void listenWithEventList(int p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.IPhoneStateListener p3, int[] p4, boolean p5) throws android.os.RemoteException {}
        public void notifyCallStateForAllSubs(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void notifyCallState(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void notifyServiceStateForPhoneId(int p0, int p1, android.telephony.ServiceState p2) throws android.os.RemoteException {}
        public void notifySignalStrengthForPhoneId(int p0, int p1, android.telephony.SignalStrength p2) throws android.os.RemoteException {}
        public void notifyMessageWaitingChangedForPhoneId(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void notifyCallForwardingChanged(boolean p0) throws android.os.RemoteException {}
        public void notifyCallForwardingChangedForSubscriber(int p0, boolean p1) throws android.os.RemoteException {}
        public void notifyDataActivity(int p0) throws android.os.RemoteException {}
        public void notifyDataActivityForSubscriber(int p0, int p1) throws android.os.RemoteException {}
        public void notifyDataConnectionForSubscriber(int p0, int p1, android.telephony.PreciseDataConnectionState p2) throws android.os.RemoteException {}
        public void notifyCellLocationForSubscriber(int p0, android.telephony.CellIdentity p1) throws android.os.RemoteException {}
        public void notifyCellInfo(java.util.List<android.telephony.CellInfo> p0) throws android.os.RemoteException {}
        public void notifyPreciseCallState(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void notifyDisconnectCause(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void notifyCellInfoForSubscriber(int p0, java.util.List<android.telephony.CellInfo> p1) throws android.os.RemoteException {}
        public void notifySrvccStateChanged(int p0, int p1) throws android.os.RemoteException {}
        public void notifySimActivationStateChangedForPhoneId(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void notifyOemHookRawEventForSubscriber(int p0, int p1, byte[] p2) throws android.os.RemoteException {}
        public void notifySubscriptionInfoChanged() throws android.os.RemoteException {}
        public void notifyOpportunisticSubscriptionInfoChanged() throws android.os.RemoteException {}
        public void notifyCarrierNetworkChange(boolean p0) throws android.os.RemoteException {}
        public void notifyUserMobileDataStateChangedForPhoneId(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void notifyDisplayInfoChanged(int p0, int p1, android.telephony.TelephonyDisplayInfo p2) throws android.os.RemoteException {}
        public void notifyPhoneCapabilityChanged(android.telephony.PhoneCapability p0) throws android.os.RemoteException {}
        public void notifyActiveDataSubIdChanged(int p0) throws android.os.RemoteException {}
        public void notifyRadioPowerStateChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void notifyEmergencyNumberList(int p0, int p1) throws android.os.RemoteException {}
        public void notifyOutgoingEmergencyCall(int p0, int p1, android.telephony.emergency.EmergencyNumber p2) throws android.os.RemoteException {}
        public void notifyOutgoingEmergencySms(int p0, int p1, android.telephony.emergency.EmergencyNumber p2) throws android.os.RemoteException {}
        public void notifyCallQualityChanged(android.telephony.CallQuality p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void notifyImsDisconnectCause(int p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
        public void notifyRegistrationFailed(int p0, int p1, android.telephony.CellIdentity p2, java.lang.String p3, int p4, int p5, int p6) throws android.os.RemoteException {}
        public void notifyBarringInfoChanged(int p0, int p1, android.telephony.BarringInfo p2) throws android.os.RemoteException {}
        public void notifyPhysicalChannelConfigForSubscriber(int p0, int p1, java.util.List<android.telephony.PhysicalChannelConfig> p2) throws android.os.RemoteException {}
        public void notifyDataEnabled(int p0, int p1, boolean p2, int p3) throws android.os.RemoteException {}
        public void notifyAllowedNetworkTypesChanged(int p0, int p1, int p2, long p3) throws android.os.RemoteException {}
        public void notifyLinkCapacityEstimateChanged(int p0, int p1, java.util.List<android.telephony.LinkCapacityEstimate> p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ITelephonyRegistry {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ITelephonyRegistry";
        static final int TRANSACTION_addOnSubscriptionsChangedListener = 1;
        static final int TRANSACTION_addOnOpportunisticSubscriptionsChangedListener = 2;
        static final int TRANSACTION_removeOnSubscriptionsChangedListener = 3;
        static final int TRANSACTION_listenWithEventList = 4;
        static final int TRANSACTION_notifyCallStateForAllSubs = 5;
        static final int TRANSACTION_notifyCallState = 6;
        static final int TRANSACTION_notifyServiceStateForPhoneId = 7;
        static final int TRANSACTION_notifySignalStrengthForPhoneId = 8;
        static final int TRANSACTION_notifyMessageWaitingChangedForPhoneId = 9;
        static final int TRANSACTION_notifyCallForwardingChanged = 10;
        static final int TRANSACTION_notifyCallForwardingChangedForSubscriber = 11;
        static final int TRANSACTION_notifyDataActivity = 12;
        static final int TRANSACTION_notifyDataActivityForSubscriber = 13;
        static final int TRANSACTION_notifyDataConnectionForSubscriber = 14;
        static final int TRANSACTION_notifyCellLocationForSubscriber = 15;
        static final int TRANSACTION_notifyCellInfo = 16;
        static final int TRANSACTION_notifyPreciseCallState = 17;
        static final int TRANSACTION_notifyDisconnectCause = 18;
        static final int TRANSACTION_notifyCellInfoForSubscriber = 19;
        static final int TRANSACTION_notifySrvccStateChanged = 20;
        static final int TRANSACTION_notifySimActivationStateChangedForPhoneId = 21;
        static final int TRANSACTION_notifyOemHookRawEventForSubscriber = 22;
        static final int TRANSACTION_notifySubscriptionInfoChanged = 23;
        static final int TRANSACTION_notifyOpportunisticSubscriptionInfoChanged = 24;
        static final int TRANSACTION_notifyCarrierNetworkChange = 25;
        static final int TRANSACTION_notifyUserMobileDataStateChangedForPhoneId = 26;
        static final int TRANSACTION_notifyDisplayInfoChanged = 27;
        static final int TRANSACTION_notifyPhoneCapabilityChanged = 28;
        static final int TRANSACTION_notifyActiveDataSubIdChanged = 29;
        static final int TRANSACTION_notifyRadioPowerStateChanged = 30;
        static final int TRANSACTION_notifyEmergencyNumberList = 31;
        static final int TRANSACTION_notifyOutgoingEmergencyCall = 32;
        static final int TRANSACTION_notifyOutgoingEmergencySms = 33;
        static final int TRANSACTION_notifyCallQualityChanged = 34;
        static final int TRANSACTION_notifyImsDisconnectCause = 35;
        static final int TRANSACTION_notifyRegistrationFailed = 36;
        static final int TRANSACTION_notifyBarringInfoChanged = 37;
        static final int TRANSACTION_notifyPhysicalChannelConfigForSubscriber = 38;
        static final int TRANSACTION_notifyDataEnabled = 39;
        static final int TRANSACTION_notifyAllowedNetworkTypesChanged = 40;
        static final int TRANSACTION_notifyLinkCapacityEstimateChanged = 41;
        public Stub() { super(); }
        public static com.android.internal.telephony.ITelephonyRegistry asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.telephony.ITelephonyRegistry p0) { return false; }
        public static com.android.internal.telephony.ITelephonyRegistry getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.telephony.ITelephonyRegistry {
            private android.os.IBinder mRemote;
            public static com.android.internal.telephony.ITelephonyRegistry sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addOnSubscriptionsChangedListener(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.IOnSubscriptionsChangedListener p2) throws android.os.RemoteException {}
            public void addOnOpportunisticSubscriptionsChangedListener(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.IOnSubscriptionsChangedListener p2) throws android.os.RemoteException {}
            public void removeOnSubscriptionsChangedListener(java.lang.String p0, com.android.internal.telephony.IOnSubscriptionsChangedListener p1) throws android.os.RemoteException {}
            public void listenWithEventList(int p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.IPhoneStateListener p3, int[] p4, boolean p5) throws android.os.RemoteException {}
            public void notifyCallStateForAllSubs(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void notifyCallState(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void notifyServiceStateForPhoneId(int p0, int p1, android.telephony.ServiceState p2) throws android.os.RemoteException {}
            public void notifySignalStrengthForPhoneId(int p0, int p1, android.telephony.SignalStrength p2) throws android.os.RemoteException {}
            public void notifyMessageWaitingChangedForPhoneId(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void notifyCallForwardingChanged(boolean p0) throws android.os.RemoteException {}
            public void notifyCallForwardingChangedForSubscriber(int p0, boolean p1) throws android.os.RemoteException {}
            public void notifyDataActivity(int p0) throws android.os.RemoteException {}
            public void notifyDataActivityForSubscriber(int p0, int p1) throws android.os.RemoteException {}
            public void notifyDataConnectionForSubscriber(int p0, int p1, android.telephony.PreciseDataConnectionState p2) throws android.os.RemoteException {}
            public void notifyCellLocationForSubscriber(int p0, android.telephony.CellIdentity p1) throws android.os.RemoteException {}
            public void notifyCellInfo(java.util.List<android.telephony.CellInfo> p0) throws android.os.RemoteException {}
            public void notifyPreciseCallState(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void notifyDisconnectCause(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void notifyCellInfoForSubscriber(int p0, java.util.List<android.telephony.CellInfo> p1) throws android.os.RemoteException {}
            public void notifySrvccStateChanged(int p0, int p1) throws android.os.RemoteException {}
            public void notifySimActivationStateChangedForPhoneId(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void notifyOemHookRawEventForSubscriber(int p0, int p1, byte[] p2) throws android.os.RemoteException {}
            public void notifySubscriptionInfoChanged() throws android.os.RemoteException {}
            public void notifyOpportunisticSubscriptionInfoChanged() throws android.os.RemoteException {}
            public void notifyCarrierNetworkChange(boolean p0) throws android.os.RemoteException {}
            public void notifyUserMobileDataStateChangedForPhoneId(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void notifyDisplayInfoChanged(int p0, int p1, android.telephony.TelephonyDisplayInfo p2) throws android.os.RemoteException {}
            public void notifyPhoneCapabilityChanged(android.telephony.PhoneCapability p0) throws android.os.RemoteException {}
            public void notifyActiveDataSubIdChanged(int p0) throws android.os.RemoteException {}
            public void notifyRadioPowerStateChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void notifyEmergencyNumberList(int p0, int p1) throws android.os.RemoteException {}
            public void notifyOutgoingEmergencyCall(int p0, int p1, android.telephony.emergency.EmergencyNumber p2) throws android.os.RemoteException {}
            public void notifyOutgoingEmergencySms(int p0, int p1, android.telephony.emergency.EmergencyNumber p2) throws android.os.RemoteException {}
            public void notifyCallQualityChanged(android.telephony.CallQuality p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void notifyImsDisconnectCause(int p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
            public void notifyRegistrationFailed(int p0, int p1, android.telephony.CellIdentity p2, java.lang.String p3, int p4, int p5, int p6) throws android.os.RemoteException {}
            public void notifyBarringInfoChanged(int p0, int p1, android.telephony.BarringInfo p2) throws android.os.RemoteException {}
            public void notifyPhysicalChannelConfigForSubscriber(int p0, int p1, java.util.List<android.telephony.PhysicalChannelConfig> p2) throws android.os.RemoteException {}
            public void notifyDataEnabled(int p0, int p1, boolean p2, int p3) throws android.os.RemoteException {}
            public void notifyAllowedNetworkTypesChanged(int p0, int p1, int p2, long p3) throws android.os.RemoteException {}
            public void notifyLinkCapacityEstimateChanged(int p0, int p1, java.util.List<android.telephony.LinkCapacityEstimate> p2) throws android.os.RemoteException {}
        }
    }
}
