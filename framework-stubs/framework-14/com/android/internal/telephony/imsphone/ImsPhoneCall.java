package com.android.internal.telephony.imsphone;

public class ImsPhoneCall extends com.android.internal.telephony.Call {
    public static final java.lang.String CONTEXT_UNKNOWN = "UK";
    public static final java.lang.String CONTEXT_RINGING = "RG";
    public static final java.lang.String CONTEXT_FOREGROUND = "FG";
    public static final java.lang.String CONTEXT_BACKGROUND = "BG";
    public static final java.lang.String CONTEXT_HANDOVER = "HO";
    com.android.internal.telephony.imsphone.ImsPhoneCallTracker mOwner;
    ImsPhoneCall() { super(); }
    public ImsPhoneCall(com.android.internal.telephony.imsphone.ImsPhoneCallTracker p0, java.lang.String p1) { super(); }
    public void dispose() {}
    public java.util.ArrayList<com.android.internal.telephony.Connection> getConnections() { return null; }
    public com.android.internal.telephony.Phone getPhone() { return null; }
    public boolean isMultiparty() { return false; }
    public void hangup() throws com.android.internal.telephony.CallStateException {}
    public void hangup(int p0) throws com.android.internal.telephony.CallStateException {}
    public java.lang.String toString() { return null; }
    public java.util.List<com.android.ims.internal.ConferenceParticipant> getConferenceParticipants() { return null; }
    public void attach(com.android.internal.telephony.Connection p0) {}
    public void attach(com.android.internal.telephony.Connection p0, com.android.internal.telephony.Call.State p1) {}
    public void attachFake(com.android.internal.telephony.Connection p0, com.android.internal.telephony.Call.State p1) {}
    public boolean connectionDisconnected(com.android.internal.telephony.imsphone.ImsPhoneConnection p0) { return false; }
    public void detach(com.android.internal.telephony.imsphone.ImsPhoneConnection p0) {}
    boolean isFull() { return false; }
    public void onHangupLocal() {}
    public com.android.internal.telephony.imsphone.ImsPhoneConnection getFirstConnection() { return null; }
    public void setMute(boolean p0) {}
    void merge(com.android.internal.telephony.imsphone.ImsPhoneCall p0, com.android.internal.telephony.Call.State p1) {}
    public com.android.ims.ImsCall getImsCall() { return null; }
    public java.lang.String getCallSessionId() { return null; }
    public int getServiceType() { return 0; }
    public int getCallType() { return 0; }
    static boolean isLocalTone(com.android.ims.ImsCall p0) { return false; }
    public boolean update(com.android.internal.telephony.imsphone.ImsPhoneConnection p0, com.android.ims.ImsCall p1, com.android.internal.telephony.Call.State p2) { return false; }
    public void maybeChangeRingbackState(com.android.ims.ImsCall p0) {}
    com.android.internal.telephony.imsphone.ImsPhoneConnection getHandoverConnection() { return null; }
    public void switchWith(com.android.internal.telephony.imsphone.ImsPhoneCall p0) {}
    public void maybeStopRingback() {}
    public boolean isRingbackTonePlaying() { return false; }
    public void maybeClearRemotelyHeldStatus() {}
}
