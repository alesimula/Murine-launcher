package com.android.internal.telephony.imsphone;

public class ImsPhoneConnection extends com.android.internal.telephony.Connection {
    static final int PAUSE_DELAY_MILLIS = 3000;
    public ImsPhoneConnection(com.android.internal.telephony.Phone p0, com.android.ims.ImsCall p1, com.android.internal.telephony.imsphone.ImsPhoneCallTracker p2, com.android.internal.telephony.imsphone.ImsPhoneCall p3, boolean p4) { super(0); }
    public ImsPhoneConnection(com.android.internal.telephony.Phone p0, java.lang.String p1, com.android.internal.telephony.imsphone.ImsPhoneCallTracker p2, com.android.internal.telephony.imsphone.ImsPhoneCall p3, boolean p4, boolean p5, com.android.internal.telephony.imsphone.ImsPhone.ImsDialArgs p6) { super(0); }
    public ImsPhoneConnection(com.android.internal.telephony.Phone p0, java.lang.String[] p1, com.android.internal.telephony.imsphone.ImsPhoneCallTracker p2, com.android.internal.telephony.imsphone.ImsPhoneCall p3, boolean p4) { super(0); }
    public void setTelephonyMetrics(com.android.internal.telephony.metrics.TelephonyMetrics p0) {}
    public void dispose() {}
    static boolean equalsHandlesNulls(java.lang.Object p0, java.lang.Object p1) { return false; }
    static boolean equalsBaseDialString(java.lang.String p0, java.lang.String p1) { return false; }
    public java.lang.String getOrigDialString() { return null; }
    public com.android.internal.telephony.imsphone.ImsPhoneCall getCall() { return null; }
    public long getDisconnectTime() { return 0L; }
    public long getHoldingStartTime() { return 0L; }
    public long getHoldDurationMillis() { return 0L; }
    public void setDisconnectCause(int p0) {}
    public int getDisconnectCause() { return 0; }
    public boolean isIncomingCallAutoRejected() { return false; }
    public java.lang.String getVendorDisconnectCause() { return null; }
    public com.android.internal.telephony.imsphone.ImsPhoneCallTracker getOwner() { return null; }
    public com.android.internal.telephony.Call.State getState() { return null; }
    public void deflect(java.lang.String p0) throws com.android.internal.telephony.CallStateException {}
    public void transfer(java.lang.String p0, boolean p1) throws com.android.internal.telephony.CallStateException {}
    public void consultativeTransfer(com.android.internal.telephony.Connection p0) throws com.android.internal.telephony.CallStateException {}
    public void hangup() throws com.android.internal.telephony.CallStateException {}
    public void separate() throws com.android.internal.telephony.CallStateException {}
    public void proceedAfterWaitChar() {}
    public void proceedAfterWildChar(java.lang.String p0) {}
    public void cancelPostDial() {}
    public void onHangupLocal() {}
    public boolean onDisconnect(int p0) { return false; }
    public boolean onDisconnect() { return false; }
    void onConnectedInOrOut() {}
    void onStartedHolding() {}
    protected void finalize() {}
    void releaseWakeLock() {}
    public int getNumberPresentation() { return 0; }
    public com.android.internal.telephony.UUSInfo getUUSInfo() { return null; }
    public com.android.internal.telephony.Connection getOrigConnection() { return null; }
    public synchronized boolean isMultiparty() { return false; }
    public synchronized boolean isConferenceHost() { return false; }
    public boolean isMemberOfPeerConference() { return false; }
    public synchronized com.android.ims.ImsCall getImsCall() { return null; }
    public synchronized void setImsCall(com.android.ims.ImsCall p0) {}
    public void changeParent(com.android.internal.telephony.imsphone.ImsPhoneCall p0) {}
    public boolean update(com.android.ims.ImsCall p0, com.android.internal.telephony.Call.State p1) { return false; }
    public void maybeChangeRingbackState() {}
    public int getPreciseDisconnectCause() { return 0; }
    public void setPreciseDisconnectCause(int p0) {}
    public void onDisconnectConferenceParticipant(android.net.Uri p0) {}
    public void setConferenceConnectTime(long p0) {}
    public long getConferenceConnectTime() { return 0L; }
    public boolean updateAddressDisplay(com.android.ims.ImsCall p0) { return false; }
    public boolean updateMediaCapabilities(com.android.ims.ImsCall p0) { return false; }
    public void startRtt(android.telecom.Connection.RttTextStream p0) {}
    public void stopRtt() {}
    public void sendRttModifyResponse(android.telecom.Connection.RttTextStream p0) {}
    public void onRttMessageReceived(java.lang.String p0) {}
    public void onRttAudioIndicatorChanged(android.telephony.ims.ImsStreamMediaProfile p0) {}
    public void setCurrentRttTextStream(android.telecom.Connection.RttTextStream p0) {}
    public com.android.internal.telephony.emergency.EmergencyNumberTracker getEmergencyNumberTracker() { return null; }
    public boolean hasRttTextStream() { return false; }
    public boolean isRttEnabledForCall() { return false; }
    public void startRttTextProcessing() {}
    boolean updateExtras(com.android.ims.ImsCall p0) { return false; }
    public java.lang.String toString() { return null; }
    public void setVideoProvider(android.telecom.Connection.VideoProvider p0) {}
    protected boolean isEmergency() { return false; }
    protected boolean isWpsCall() { return false; }
    public boolean isCrossSimCall() { return false; }
    public void onReceiveSessionModifyResponse(int p0, android.telecom.VideoProfile p1, android.telecom.VideoProfile p2) {}
    public void pauseVideo(int p0) {}
    public void resumeVideo(int p0) {}
    public boolean wasVideoPausedFromSource(int p0) { return false; }
    public void handleMergeStart() {}
    public void handleMergeComplete() {}
    public void setRemotelyHeld() {}
    public void setRemotelyUnheld() {}
    public boolean isHeldByRemote() { return false; }
    public void changeToPausedState() {}
    public void changeToUnPausedState() {}
    public void setLocalVideoCapable(boolean p0) {}
    public void sendRtpHeaderExtensions(java.util.Set<android.telephony.ims.RtpHeaderExtension> p0) {}
    public java.util.Set<android.telephony.ims.RtpHeaderExtensionType> getAcceptedRtpHeaderExtensions() { return null; }
    public void setImsReasonInfo(android.telephony.ims.ImsReasonInfo p0) {}
    public android.telephony.ims.ImsReasonInfo getImsReasonInfo() { return null; }
    public static int toTelecomVerificationStatus(int p0) { return 0; }
    protected int getCallPriority() { return 0; }

    class MyHandler extends android.os.Handler {
        MyHandler(com.android.internal.telephony.imsphone.ImsPhoneConnection p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
