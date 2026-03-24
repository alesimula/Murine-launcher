package com.android.internal.telephony.test;

public interface SimulatedRadioControl {
    public void triggerRing(java.lang.String p0);
    public void progressConnectingCallState();
    public void progressConnectingToActive();
    public void setAutoProgressConnectingCall(boolean p0);
    public void setNextDialFailImmediately(boolean p0);
    public void setNextCallFailCause(int p0);
    public void triggerHangupForeground();
    public void triggerHangupBackground();
    public void triggerHangupAll();
    public void triggerIncomingSMS(java.lang.String p0);
    public void shutdown();
    public void pauseResponses();
    public void resumeResponses();
    public void triggerSsn(int p0, int p1);
    public void triggerIncomingUssd(java.lang.String p0, java.lang.String p1);
}
