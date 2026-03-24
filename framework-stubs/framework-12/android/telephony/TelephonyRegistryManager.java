package android.telephony;

public class TelephonyRegistryManager {
    private static final java.lang.String TAG = "TelephonyRegistryManager";
    private static com.android.internal.telephony.ITelephonyRegistry sRegistry;
    private final android.content.Context mContext = null;
    private final java.util.Map<android.telephony.SubscriptionManager.OnSubscriptionsChangedListener, com.android.internal.telephony.IOnSubscriptionsChangedListener> mSubscriptionChangedListenerMap = null;
    private final java.util.Map<android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener, com.android.internal.telephony.IOnSubscriptionsChangedListener> mOpportunisticSubscriptionChangedListenerMap = null;
    private static final long LISTEN_CODE_CHANGE = 147600208L;
    public static final int SIM_ACTIVATION_TYPE_VOICE = 0;
    public static final int SIM_ACTIVATION_TYPE_DATA = 1;
    public TelephonyRegistryManager(android.content.Context p0) {}
    public void addOnSubscriptionsChangedListener(android.telephony.SubscriptionManager.OnSubscriptionsChangedListener p0, java.util.concurrent.Executor p1) {}
    public void removeOnSubscriptionsChangedListener(android.telephony.SubscriptionManager.OnSubscriptionsChangedListener p0) {}
    public void addOnOpportunisticSubscriptionsChangedListener(android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener p0, java.util.concurrent.Executor p1) {}
    public void removeOnOpportunisticSubscriptionsChangedListener(android.telephony.SubscriptionManager.OnOpportunisticSubscriptionsChangedListener p0) {}
    public void listenFromListener(int p0, java.lang.String p1, java.lang.String p2, android.telephony.PhoneStateListener p3, int p4, boolean p5) {}
    private void listenFromCallback(int p0, java.lang.String p1, java.lang.String p2, android.telephony.TelephonyCallback p3, int[] p4, boolean p5) {}
    public void notifyCarrierNetworkChange(boolean p0) {}
    public void notifyCallStateChanged(int p0, int p1, int p2, java.lang.String p3) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void notifyCallStateChangedForAllSubscriptions(int p0, java.lang.String p1) {}
    public void notifySubscriptionInfoChanged() {}
    public void notifyOpportunisticSubscriptionInfoChanged() {}
    public void notifyServiceStateChanged(int p0, int p1, android.telephony.ServiceState p2) {}
    public void notifySignalStrengthChanged(int p0, int p1, android.telephony.SignalStrength p2) {}
    public void notifyMessageWaitingChanged(int p0, int p1, boolean p2) {}
    public void notifyCallForwardingChanged(int p0, boolean p1) {}
    public void notifyDataActivityChanged(int p0, int p1) {}
    public void notifyDataConnectionForSubscriber(int p0, int p1, android.telephony.PreciseDataConnectionState p2) {}
    public void notifyCallQualityChanged(int p0, int p1, android.telephony.CallQuality p2, int p3) {}
    public void notifyEmergencyNumberList(int p0, int p1) {}
    public void notifyOutgoingEmergencyCall(int p0, int p1, android.telephony.emergency.EmergencyNumber p2) {}
    public void notifyOutgoingEmergencySms(int p0, int p1, android.telephony.emergency.EmergencyNumber p2) {}
    public void notifyRadioPowerStateChanged(int p0, int p1, int p2) {}
    public void notifyPhoneCapabilityChanged(android.telephony.PhoneCapability p0) {}
    public void notifyDataActivationStateChanged(int p0, int p1, int p2) {}
    public void notifyVoiceActivationStateChanged(int p0, int p1, int p2) {}
    public void notifyUserMobileDataStateChanged(int p0, int p1, boolean p2) {}
    public void notifyDisplayInfoChanged(int p0, int p1, android.telephony.TelephonyDisplayInfo p2) {}
    public void notifyImsDisconnectCause(int p0, android.telephony.ims.ImsReasonInfo p1) {}
    public void notifySrvccStateChanged(int p0, int p1) {}
    public void notifyPreciseCallState(int p0, int p1, int p2, int p3, int p4) {}
    public void notifyDisconnectCause(int p0, int p1, int p2, int p3) {}
    public void notifyCellLocation(int p0, android.telephony.CellIdentity p1) {}
    public void notifyCellInfoChanged(int p0, java.util.List<android.telephony.CellInfo> p1) {}
    public void notifyActiveDataSubIdChanged(int p0) {}
    public void notifyRegistrationFailed(int p0, int p1, android.telephony.CellIdentity p2, java.lang.String p3, int p4, int p5, int p6) {}
    public void notifyBarringInfoChanged(int p0, int p1, android.telephony.BarringInfo p2) {}
    public void notifyPhysicalChannelConfigForSubscriber(int p0, int p1, java.util.List<android.telephony.PhysicalChannelConfig> p2) {}
    public void notifyDataEnabled(int p0, int p1, boolean p2, int p3) {}
    public void notifyAllowedNetworkTypesChanged(int p0, int p1, int p2, long p3) {}
    public void notifyLinkCapacityEstimateChanged(int p0, int p1, java.util.List<android.telephony.LinkCapacityEstimate> p2) {}
    public java.util.Set<java.lang.Integer> getEventsFromCallback(android.telephony.TelephonyCallback p0) { return null; }
    private java.util.Set<java.lang.Integer> getEventsFromBitmask(int p0) { return null; }
    public void registerTelephonyCallback(java.util.concurrent.Executor p0, int p1, java.lang.String p2, java.lang.String p3, android.telephony.TelephonyCallback p4, boolean p5) {}
    public void unregisterTelephonyCallback(int p0, java.lang.String p1, java.lang.String p2, android.telephony.TelephonyCallback p3, boolean p4) {}
}
