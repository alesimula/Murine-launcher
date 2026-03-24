package com.android.internal.telephony;

public class GsmCdmaCallTracker extends com.android.internal.telephony.CallTracker {
    public static final int MAX_CONNECTIONS_GSM = 19;
    public com.android.internal.telephony.GsmCdmaConnection[] mConnections;
    public com.android.internal.telephony.GsmCdmaCall mRingingCall;
    public com.android.internal.telephony.GsmCdmaCall mForegroundCall;
    public com.android.internal.telephony.GsmCdmaCall mBackgroundCall;
    public com.android.internal.telephony.PhoneConstants.State mState;
    public GsmCdmaCallTracker(com.android.internal.telephony.GsmCdmaPhone p0) { super(); }
    public void updatePhoneType() {}
    protected void finalize() {}
    public void registerForVoiceCallStarted(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForVoiceCallStarted(android.os.Handler p0) {}
    public void registerForVoiceCallEnded(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForVoiceCallEnded(android.os.Handler p0) {}
    public void registerForCallWaiting(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForCallWaiting(android.os.Handler p0) {}
    public synchronized com.android.internal.telephony.Connection dialGsm(java.lang.String p0, com.android.internal.telephony.PhoneInternalInterface.DialArgs p1) throws com.android.internal.telephony.CallStateException { return null; }
    public void setIsInEmergencyCall() {}
    public com.android.internal.telephony.Connection dial(java.lang.String p0, com.android.internal.telephony.PhoneInternalInterface.DialArgs p1) throws com.android.internal.telephony.CallStateException { return null; }
    public com.android.internal.telephony.Connection dialGsm(java.lang.String p0, com.android.internal.telephony.UUSInfo p1, android.os.Bundle p2) throws com.android.internal.telephony.CallStateException { return null; }
    public com.android.internal.telephony.Connection dialGsm(java.lang.String p0, int p1, com.android.internal.telephony.UUSInfo p2, android.os.Bundle p3) throws com.android.internal.telephony.CallStateException { return null; }
    public void acceptCall() throws com.android.internal.telephony.CallStateException {}
    public void rejectCall() throws com.android.internal.telephony.CallStateException {}
    public void switchWaitingOrHoldingAndActive() throws com.android.internal.telephony.CallStateException {}
    public void conference() {}
    public void explicitCallTransfer() {}
    public void clearDisconnected() {}
    public boolean canConference() { return false; }
    public void checkForDialIssues(boolean p0) throws com.android.internal.telephony.CallStateException {}
    public boolean canTransfer() { return false; }
    protected synchronized void handlePollCalls(android.os.AsyncResult p0) {}
    public void hangup(com.android.internal.telephony.GsmCdmaConnection p0) throws com.android.internal.telephony.CallStateException {}
    public void separate(com.android.internal.telephony.GsmCdmaConnection p0) throws com.android.internal.telephony.CallStateException {}
    public void setMute(boolean p0) {}
    public boolean getMute() { return false; }
    public void hangup(com.android.internal.telephony.GsmCdmaCall p0) throws com.android.internal.telephony.CallStateException {}
    public void hangupWaitingOrBackground() {}
    public void hangupForegroundResumeBackground() {}
    public void hangupConnectionByIndex(com.android.internal.telephony.GsmCdmaCall p0, int p1) throws com.android.internal.telephony.CallStateException {}
    public void hangupAllConnections(com.android.internal.telephony.GsmCdmaCall p0) {}
    public com.android.internal.telephony.GsmCdmaConnection getConnectionByIndex(com.android.internal.telephony.GsmCdmaCall p0, int p1) throws com.android.internal.telephony.CallStateException { return null; }
    public void handleMessage(android.os.Message p0) {}
    public void dispatchCsCallRadioTech(int p0) {}
    public boolean isInEmergencyCall() { return false; }
    public boolean isInOtaspCall() { return false; }
    public com.android.internal.telephony.GsmCdmaPhone getPhone() { return null; }
    protected void log(java.lang.String p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public com.android.internal.telephony.PhoneConstants.State getState() { return null; }
    public int getMaxConnectionsPerCall() { return 0; }
    public void cleanupCalls() {}
}
