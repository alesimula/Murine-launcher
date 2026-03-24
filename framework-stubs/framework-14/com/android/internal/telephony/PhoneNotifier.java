package com.android.internal.telephony;

public interface PhoneNotifier {
    public void notifyPhoneState(com.android.internal.telephony.Phone p0);
    public void notifyServiceState(com.android.internal.telephony.Phone p0);
    public void notifyServiceStateForSubId(com.android.internal.telephony.Phone p0, android.telephony.ServiceState p1, int p2);
    public void notifyCellLocation(com.android.internal.telephony.Phone p0, android.telephony.CellIdentity p1);
    public void notifySignalStrength(com.android.internal.telephony.Phone p0);
    public void notifyMessageWaitingChanged(com.android.internal.telephony.Phone p0);
    public void notifyCallForwardingChanged(com.android.internal.telephony.Phone p0);
    public void notifyDataConnection(com.android.internal.telephony.Phone p0, android.telephony.PreciseDataConnectionState p1);
    public void notifyDataActivity(com.android.internal.telephony.Phone p0);
    public void notifyCellInfo(com.android.internal.telephony.Phone p0, java.util.List<android.telephony.CellInfo> p1);
    public void notifyPreciseCallState(com.android.internal.telephony.Phone p0, java.lang.String[] p1, int[] p2, int[] p3);
    public void notifyDisconnectCause(com.android.internal.telephony.Phone p0, int p1, int p2);
    public void notifyImsDisconnectCause(com.android.internal.telephony.Phone p0, android.telephony.ims.ImsReasonInfo p1);
    public void notifySrvccStateChanged(com.android.internal.telephony.Phone p0, int p1);
    public void notifyVoiceActivationStateChanged(com.android.internal.telephony.Phone p0, int p1);
    public void notifyDataActivationStateChanged(com.android.internal.telephony.Phone p0, int p1);
    public void notifyUserMobileDataStateChanged(com.android.internal.telephony.Phone p0, boolean p1);
    public void notifyDisplayInfoChanged(com.android.internal.telephony.Phone p0, android.telephony.TelephonyDisplayInfo p1);
    public void notifyPhoneCapabilityChanged(android.telephony.PhoneCapability p0);
    public void notifyRadioPowerStateChanged(com.android.internal.telephony.Phone p0, int p1);
    public void notifyEmergencyNumberList(com.android.internal.telephony.Phone p0);
    public void notifyOutgoingEmergencySms(com.android.internal.telephony.Phone p0, android.telephony.emergency.EmergencyNumber p1);
    public void notifyCallQualityChanged(com.android.internal.telephony.Phone p0, android.telephony.CallQuality p1, int p2);
    public void notifyMediaQualityStatusChanged(com.android.internal.telephony.Phone p0, android.telephony.ims.MediaQualityStatus p1);
    public void notifyRegistrationFailed(com.android.internal.telephony.Phone p0, android.telephony.CellIdentity p1, java.lang.String p2, int p3, int p4, int p5);
    public void notifyBarringInfoChanged(com.android.internal.telephony.Phone p0, android.telephony.BarringInfo p1);
    public void notifyPhysicalChannelConfig(com.android.internal.telephony.Phone p0, java.util.List<android.telephony.PhysicalChannelConfig> p1);
    public void notifyDataEnabled(com.android.internal.telephony.Phone p0, boolean p1, int p2);
    public void notifyAllowedNetworkTypesChanged(com.android.internal.telephony.Phone p0, int p1, long p2);
    public void notifyLinkCapacityEstimateChanged(com.android.internal.telephony.Phone p0, java.util.List<android.telephony.LinkCapacityEstimate> p1);
    public void notifyCallbackModeStarted(com.android.internal.telephony.Phone p0, int p1);
    public void notifyCallbackModeStopped(com.android.internal.telephony.Phone p0, int p1, int p2);
}
