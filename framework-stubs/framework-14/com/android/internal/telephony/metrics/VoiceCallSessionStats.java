package com.android.internal.telephony.metrics;

public class VoiceCallSessionStats {
    public VoiceCallSessionStats(int p0, com.android.internal.telephony.Phone p1) {}
    public synchronized void onRilAcceptCall(java.util.List<com.android.internal.telephony.Connection> p0) {}
    public synchronized void onRilDial(com.android.internal.telephony.Connection p0) {}
    public synchronized void onRilCallListChanged(java.util.List<com.android.internal.telephony.GsmCdmaConnection> p0) {}
    public synchronized void onImsDial(com.android.internal.telephony.imsphone.ImsPhoneConnection p0) {}
    public synchronized void onImsCallReceived(com.android.internal.telephony.imsphone.ImsPhoneConnection p0) {}
    public synchronized void onImsAcceptCall(java.util.List<com.android.internal.telephony.Connection> p0) {}
    public synchronized void onImsCallStartFailed(com.android.internal.telephony.imsphone.ImsPhoneConnection p0, android.telephony.ims.ImsReasonInfo p1) {}
    public synchronized void onImsCallTerminated(com.android.internal.telephony.imsphone.ImsPhoneConnection p0, android.telephony.ims.ImsReasonInfo p1) {}
    public synchronized void onRttStarted(com.android.internal.telephony.imsphone.ImsPhoneConnection p0) {}
    public synchronized void onAudioCodecChanged(com.android.internal.telephony.Connection p0, int p1) {}
    public synchronized void onVideoStateChange(com.android.internal.telephony.imsphone.ImsPhoneConnection p0, int p1) {}
    public synchronized void onMultipartyChange(com.android.internal.telephony.imsphone.ImsPhoneConnection p0, boolean p1) {}
    public synchronized void onCallStateChanged(com.android.internal.telephony.Call p0) {}
    public synchronized void onRilSrvccStateChanged(int p0) {}
    public synchronized void onServiceStateChanged(android.telephony.ServiceState p0) {}
    protected long getTimeMillis() { return 0L; }
}
