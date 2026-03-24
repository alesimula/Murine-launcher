package com.android.internal.telephony.metrics;

public class TelephonyMetrics {
    public TelephonyMetrics() {}
    public static synchronized com.android.internal.telephony.metrics.TelephonyMetrics getInstance() { return null; }
    public void setContext(android.content.Context p0) {}
    public synchronized void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public void updateSimState(int p0, int p1) {}
    public synchronized void updateActiveSubscriptionInfoList(java.util.List<android.telephony.SubscriptionInfo> p0) {}
    public void updateEnabledModemBitmap(int p0) {}
    static int roundSessionStart(long p0) { return 0; }
    public void writeCarrierKeyEvent(int p0, int p1, boolean p2) {}
    static int toPrivacyFuzzedTimeInterval(long p0, long p1) { return 0; }
    public synchronized void writeServiceStateChanged(int p0, android.telephony.ServiceState p1) {}
    public void writeDataStallEvent(int p0, int p1) {}
    public void writeSignalStrengthEvent(int p0, int p1) {}
    public synchronized void writeImsSetFeatureValue(int p0, int p1, int p2, int p3) {}
    public synchronized void writeSetPreferredNetworkType(int p0, int p1) {}
    public synchronized void writeOnImsConnectionState(int p0, int p1, android.telephony.ims.ImsReasonInfo p2) {}
    public synchronized void writeOnImsCapabilities(int p0, int p1, android.telephony.ims.feature.MmTelFeature.MmTelCapabilities p2) {}
    public void writeSetupDataCall(int p0, int p1, int p2, java.lang.String p3, int p4) {}
    public void writeRilDeactivateDataCall(int p0, int p1, int p2, int p3) {}
    public void writeRilDataCallEvent(int p0, int p1, int p2, int p3) {}
    public void writeRilCallList(int p0, java.util.ArrayList<com.android.internal.telephony.GsmCdmaConnection> p1, java.lang.String p2) {}
    public void writeRilDial(int p0, com.android.internal.telephony.GsmCdmaConnection p1, int p2, com.android.internal.telephony.UUSInfo p3) {}
    public void writeRilCallRing(int p0, char[] p1) {}
    public void writeRilHangup(int p0, com.android.internal.telephony.GsmCdmaConnection p1, int p2, java.lang.String p3) {}
    public void writeRilAnswer(int p0, int p1) {}
    public void writeRilSrvcc(int p0, int p1) {}
    public synchronized void writeOnImsServiceSmsSolicitedResponse(int p0, int p1, int p2, long p3) {}
    public void writeOnRilSolicitedResponse(int p0, int p1, int p2, int p3, java.lang.Object p4) {}
    public void writeNetworkValidate(int p0) {}
    public void writeDataSwitch(int p0, com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.DataSwitch p1) {}
    public void writeOnDemandDataSwitch(com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.OnDemandDataSwitch p0) {}
    public void writePhoneState(int p0, com.android.internal.telephony.PhoneConstants.State p1) {}
    public void writeImsCallState(int p0, android.telephony.ims.ImsCallSession p1, com.android.internal.telephony.Call.State p2) {}
    public void writeOnImsCallStart(int p0, android.telephony.ims.ImsCallSession p1) {}
    public void writeOnImsCallReceive(int p0, android.telephony.ims.ImsCallSession p1) {}
    public void writeOnImsCommand(int p0, android.telephony.ims.ImsCallSession p1, int p2) {}
    public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQuality toCallQualityProto(android.telephony.CallQuality p0) { return null; }
    public void writeOnImsCallTerminated(int p0, android.telephony.ims.ImsCallSession p1, android.telephony.ims.ImsReasonInfo p2, com.android.internal.telephony.metrics.CallQualityMetrics p3, android.telephony.emergency.EmergencyNumber p4, java.lang.String p5, int p6) {}
    public void writeOnImsCallHandoverEvent(int p0, int p1, android.telephony.ims.ImsCallSession p2, int p3, int p4, android.telephony.ims.ImsReasonInfo p5) {}
    public synchronized void writeRilSendSms(int p0, int p1, int p2, int p3, long p4) {}
    public synchronized void writeImsServiceSendSms(int p0, java.lang.String p1, int p2, long p3) {}
    public synchronized void writeNewCBSms(int p0, int p1, int p2, boolean p3, boolean p4, int p5, int p6, long p7) {}
    public void writeDroppedIncomingMultipartSms(int p0, java.lang.String p1, int p2, int p3) {}
    public void writeIncomingSMSPP(int p0, java.lang.String p1, boolean p2) {}
    public void writeIncomingVoiceMailSms(int p0, java.lang.String p1) {}
    public void writeIncomingSmsTypeZero(int p0, java.lang.String p1) {}
    public void writeIncomingWapPush(int p0, int p1, java.lang.String p2, long[] p3, boolean p4, long p5) {}
    public void writeIncomingSmsSession(int p0, int p1, java.lang.String p2, long[] p3, boolean p4, long p5) {}
    public void writeIncomingSmsError(int p0, boolean p1, int p2, int p3) {}
    public void writeNITZEvent(int p0, long p1) {}
    public void writeModemRestartEvent(int p0, java.lang.String p1) {}
    public void writeCarrierIdMatchingEvent(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4, com.android.internal.telephony.CarrierResolver.CarrierMatchingRule p5) {}
    public void writeEmergencyNumberUpdateEvent(int p0, android.telephony.emergency.EmergencyNumber p1, int p2) {}
    public void writeNetworkCapabilitiesChangedEvent(int p0, android.net.NetworkCapabilities p1) {}
    public void writeRadioState(int p0, int p1) {}
    public void writeAudioCodecIms(int p0, android.telephony.ims.ImsCallSession p1) {}
    public void writeAudioCodecGsmCdma(int p0, int p1) {}
    public void writeOnImsCallInitiating(int p0, android.telephony.ims.ImsCallSession p1) {}
    public void writeOnImsCallProgressing(int p0, android.telephony.ims.ImsCallSession p1) {}
    public void writeOnImsCallStarted(int p0, android.telephony.ims.ImsCallSession p1) {}
    public void writeOnImsCallStartFailed(int p0, android.telephony.ims.ImsCallSession p1, android.telephony.ims.ImsReasonInfo p2) {}
    public void writeOnImsCallHeld(int p0, android.telephony.ims.ImsCallSession p1) {}
    public void writeOnImsCallHoldReceived(int p0, android.telephony.ims.ImsCallSession p1) {}
    public void writeOnImsCallHoldFailed(int p0, android.telephony.ims.ImsCallSession p1, android.telephony.ims.ImsReasonInfo p2) {}
    public void writeOnImsCallResumed(int p0, android.telephony.ims.ImsCallSession p1) {}
    public void writeOnImsCallResumeReceived(int p0, android.telephony.ims.ImsCallSession p1) {}
    public void writeOnImsCallResumeFailed(int p0, android.telephony.ims.ImsCallSession p1, android.telephony.ims.ImsReasonInfo p2) {}
    public void writeOnRilTimeoutResponse(int p0, int p1, int p2) {}
    public synchronized void writeBandwidthStats(int p0, int p1, int p2, int p3, int p4, int p5, int p6) {}

    private static class BwEstimationStats {
        final int mRadioTechnology = 0;
        final int mNrMode = 0;
        final long[] mBwEstErrorAcc = null;
        final long[] mStaticBwErrorAcc = null;
        final long[] mBwAccKbps = null;
        final int[] mCount = null;
        BwEstimationStats(int p0, int p1) {}
        public java.lang.String toString() { return null; }
    }
}
