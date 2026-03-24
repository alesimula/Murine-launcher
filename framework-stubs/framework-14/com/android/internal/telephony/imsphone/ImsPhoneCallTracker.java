package com.android.internal.telephony.imsphone;

public class ImsPhoneCallTracker extends com.android.internal.telephony.CallTracker implements com.android.internal.telephony.imsphone.ImsPullCall {
    static final java.lang.String LOG_TAG = "ImsPhoneCallTracker";
    static final java.lang.String VERBOSE_STATE_TAG = "IPCTState";
    static final int MAX_CONNECTIONS = 7;
    static final int MAX_CONNECTIONS_PER_CALL = 5;
    public com.android.internal.telephony.imsphone.ImsPhoneCall mRingingCall;
    public com.android.internal.telephony.imsphone.ImsPhoneCall mForegroundCall;
    public com.android.internal.telephony.imsphone.ImsPhoneCall mBackgroundCall;
    public com.android.internal.telephony.imsphone.ImsPhoneCall mHandoverCall;
    com.android.internal.telephony.imsphone.ImsPhone mPhone;
    public ImsPhoneCallTracker(com.android.internal.telephony.imsphone.ImsPhone p0, com.android.internal.telephony.imsphone.ImsPhoneCallTracker.ConnectorFactory p1) { super(); }
    public ImsPhoneCallTracker(com.android.internal.telephony.imsphone.ImsPhone p0, com.android.internal.telephony.imsphone.ImsPhoneCallTracker.ConnectorFactory p1, java.util.concurrent.Executor p2) { super(); }
    public void setSharedPreferenceProxy(com.android.internal.telephony.imsphone.ImsPhoneCallTracker.SharedPreferenceProxy p0) {}
    public void startListeningForCalls(int p0) throws com.android.ims.ImsException {}
    public void setDeviceToDeviceForceEnabled(boolean p0) {}
    public void hangupAllOrphanedConnections(int p0) {}
    public void hangupAllConnections() {}
    public void dispose() {}
    protected void finalize() {}
    public void registerForVoiceCallStarted(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForVoiceCallStarted(android.os.Handler p0) {}
    public void registerForVoiceCallEnded(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForVoiceCallEnded(android.os.Handler p0) {}
    public int getClirMode() { return 0; }
    public com.android.internal.telephony.Connection startConference(java.lang.String[] p0, com.android.internal.telephony.imsphone.ImsPhone.ImsDialArgs p1) throws com.android.internal.telephony.CallStateException { return null; }
    public com.android.internal.telephony.Connection dial(java.lang.String p0, int p1, android.os.Bundle p2) throws com.android.internal.telephony.CallStateException { return null; }
    public synchronized com.android.internal.telephony.Connection dial(java.lang.String p0, com.android.internal.telephony.imsphone.ImsPhone.ImsDialArgs p1) throws com.android.internal.telephony.CallStateException { return null; }
    boolean isImsServiceReady() { return false; }
    public void updateCarrierConfigCache(android.os.PersistableBundle p0) {}
    public void acceptCall(int p0) throws com.android.internal.telephony.CallStateException {}
    public void rejectCall() throws com.android.internal.telephony.CallStateException {}
    public void holdActiveCall() throws com.android.internal.telephony.CallStateException {}
    public void holdActiveCallForWaitingCall() throws com.android.internal.telephony.CallStateException {}
    public void unholdHeldCall() throws com.android.internal.telephony.CallStateException {}
    public void conference() {}
    public void explicitCallTransfer() throws com.android.internal.telephony.CallStateException {}
    public void clearDisconnected() {}
    public boolean canConference() { return false; }
    public void checkForDialIssues() throws com.android.internal.telephony.CallStateException {}
    public boolean canTransfer() { return false; }
    public void setTtyMode(int p0) {}
    public void setUiTTYMode(int p0, android.os.Message p1) {}
    public void setMute(boolean p0) {}
    public boolean getMute() { return false; }
    public void sendDtmf(char p0, android.os.Message p1) {}
    public void startDtmf(char p0) {}
    public void stopDtmf() {}
    public void hangup(com.android.internal.telephony.imsphone.ImsPhoneConnection p0) throws com.android.internal.telephony.CallStateException {}
    public void hangup(com.android.internal.telephony.imsphone.ImsPhoneCall p0) throws com.android.internal.telephony.CallStateException {}
    public void hangup(com.android.internal.telephony.imsphone.ImsPhoneCall p0, int p1) throws com.android.internal.telephony.CallStateException {}
    void callEndCleanupHandOverCallIfAny() {}
    public void sendUSSD(java.lang.String p0, android.os.Message p1) {}
    public void cancelUSSD(android.os.Message p0) {}
    public synchronized void cleanupAndRemoveConnection(com.android.internal.telephony.imsphone.ImsPhoneConnection p0) {}
    public synchronized void removeConnection(com.android.internal.telephony.imsphone.ImsPhoneConnection p0) {}
    public void addReasonCodeRemapping(java.lang.Integer p0, java.lang.String p1, java.lang.Integer p2) {}
    public int maybeRemapReasonCode(android.telephony.ims.ImsReasonInfo p0) { return 0; }
    public int getDisconnectCauseFromReasonInfo(android.telephony.ims.ImsReasonInfo p0, com.android.internal.telephony.Call.State p1) { return 0; }
    public void sendCallStartFailedDisconnect(com.android.ims.ImsCall p0, android.telephony.ims.ImsReasonInfo p1) {}
    public com.android.ims.ImsUtInterface getUtInterface() throws com.android.ims.ImsException { return null; }
    public void notifySrvccState(int p0) {}
    public boolean isHoldOrSwapInProgress() { return false; }
    public void handleMessage(android.os.Message p0) {}
    public void updateVtDataUsage(com.android.ims.ImsCall p0, long p1) {}
    public java.lang.String getVtInterface() { return null; }
    protected void log(java.lang.String p0) {}
    protected void loge(java.lang.String p0) {}
    void logw(java.lang.String p0) {}
    void logi(java.lang.String p0) {}
    void logHoldSwapState(java.lang.String p0) {}
    void logState() {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    protected void handlePollCalls(android.os.AsyncResult p0) {}
    com.android.ims.ImsEcbm getEcbmInterface() throws com.android.ims.ImsException { return null; }
    public boolean isInEmergencyCall() { return false; }
    public boolean isImsCapabilityAvailable(int p0, int p1) throws com.android.ims.ImsException { return false; }
    public boolean isVoiceOverCellularImsEnabled() { return false; }
    public boolean isVowifiEnabled() { return false; }
    public boolean isVideoCallEnabled() { return false; }
    public com.android.internal.telephony.PhoneConstants.State getState() { return null; }
    public int getImsRegistrationTech() { return 0; }
    public void getImsRegistrationTech(java.util.function.Consumer<java.lang.Integer> p0) {}
    public boolean isUtEnabled() { return false; }
    public void pullExternalCall(java.lang.String p0, int p1, int p2) {}
    public void registerPhoneStateListener(com.android.internal.telephony.imsphone.ImsPhoneCallTracker.PhoneStateListener p0) {}
    public void unregisterPhoneStateListener(com.android.internal.telephony.imsphone.ImsPhoneCallTracker.PhoneStateListener p0) {}
    public boolean isViLteDataMetered() { return false; }
    public boolean isCarrierDowngradeOfVtCallSupported() { return false; }
    public void setDataEnabled(boolean p0) {}
    public void onCallHoldReceived(com.android.ims.ImsCall p0) {}
    public void setAlwaysPlayRemoteHoldTone(boolean p0) {}
    public com.android.internal.telephony.imsphone.ImsPhone getPhone() { return null; }
    public void setSupportCepOnPeer(boolean p0) {}
    public void injectTestConferenceState(android.telephony.ims.ImsConferenceState p0) {}
    public void setConferenceEventPackageEnabled(boolean p0) {}
    public boolean isConferenceEventPackageEnabled() { return false; }
    public com.android.ims.ImsCall.Listener getImsCallListener() { return null; }
    public java.util.ArrayList<com.android.internal.telephony.imsphone.ImsPhoneConnection> getConnections() { return null; }
    public com.android.internal.telephony.imsphone.ImsPhoneConnection getPendingMO() { return null; }
    public void setConfig(com.android.internal.telephony.imsphone.ImsPhoneCallTracker.Config p0) {}
    public void setTerminalBasedCallWaitingStatus(int p0) {}
    public void handleSrvccConnectionInfo(java.util.List<android.telephony.ims.SrvccCall> p0) {}
    public com.android.internal.telephony.SrvccConnection[] convertToSrvccConnectionInfo(java.util.List<android.telephony.ims.SrvccCall> p0) { return null; }
    public void handleSendAnbrQuery(int p0, int p1, int p2) {}
    public void triggerNotifyAnbr(int p0, int p1, int p2) {}
    public void triggerImsDeregistration(int p0) {}

    private static class CacheEntry {
        CacheEntry(long p0, long p1, long p2, int p3) {}
    }

    public static class Config {
        public boolean isD2DCommunicationSupported;
        public Config() {}
    }

    public static interface ConnectorFactory {
        public com.android.ims.FeatureConnector<com.android.ims.ImsManager> create(android.content.Context p0, int p1, java.lang.String p2, com.android.ims.FeatureConnector.Listener<com.android.ims.ImsManager> p3, java.util.concurrent.Executor p4);
    }

    private static enum HoldSwapState {
        INACTIVE,
        PENDING_SINGLE_CALL_HOLD,
        PENDING_SINGLE_CALL_UNHOLD,
        SWAPPING_ACTIVE_AND_HELD,
        HOLDING_TO_ANSWER_INCOMING,
        PENDING_RESUME_FOREGROUND_AFTER_FAILURE,
        HOLDING_TO_DIAL_OUTGOING,
        PENDING_RESUME_FOREGROUND_AFTER_HOLD;
    }

    private static class ImsReasonInfoKeyPair extends android.util.Pair<java.lang.Integer, java.lang.String> {
        ImsReasonInfoKeyPair() { super(null, null); }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static class ImsTrafficSession {
        ImsTrafficSession(int p0, int p1, android.telephony.ims.aidl.IImsTrafficSessionCallback p2) {}
    }

    private class MmTelFeatureListener extends android.telephony.ims.feature.MmTelFeature.Listener {
        public android.telephony.ims.aidl.IImsCallSessionListener onIncomingCall(com.android.ims.internal.IImsCallSession p0, java.lang.String p1, android.os.Bundle p2) { return null; }
        public void onVoiceMessageCountUpdate(int p0) {}
        public void onAudioModeIsVoipChanged(int p0) {}
        public void onTriggerEpsFallback(int p0) {}
        public void onStartImsTrafficSession(int p0, int p1, int p2, int p3, android.telephony.ims.aidl.IImsTrafficSessionCallback p4) {}
        public void onModifyImsTrafficSession(int p0, int p1) {}
        public void onStopImsTrafficSession(int p0) {}
        public void onMediaQualityStatusChanged(android.telephony.ims.MediaQualityStatus p0) {}
    }

    public static interface PhoneStateListener {
        public void onPhoneStateChanged(com.android.internal.telephony.PhoneConstants.State p0, com.android.internal.telephony.PhoneConstants.State p1);
    }

    public static interface SharedPreferenceProxy {
        public android.content.SharedPreferences getDefaultSharedPreferences(android.content.Context p0);
    }

    private class SrvccStartedCallback extends android.telephony.ims.aidl.ISrvccStartedCallback.Stub {
        public void onSrvccCallNotified(java.util.List<android.telephony.ims.SrvccCall> p0) {}
    }

    public class VtDataUsageProvider extends android.net.netstats.provider.NetworkStatsProvider {
        public VtDataUsageProvider(com.android.internal.telephony.imsphone.ImsPhoneCallTracker p0) { super(); }
        public void onRequestStatsUpdate(int p0) {}
        public void onSetLimit(java.lang.String p0, long p1) {}
        public void onSetAlert(long p0) {}
    }
}
