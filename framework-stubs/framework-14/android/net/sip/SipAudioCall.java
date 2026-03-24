package android.net.sip;

@java.lang.Deprecated
public class SipAudioCall {
    @java.lang.Deprecated
    public SipAudioCall(android.content.Context p0, android.net.sip.SipProfile p1) {}
    @java.lang.Deprecated
    public void setListener(android.net.sip.SipAudioCall.Listener p0) {}
    @java.lang.Deprecated
    public void setListener(android.net.sip.SipAudioCall.Listener p0, boolean p1) {}
    @java.lang.Deprecated
    public boolean isInCall() { return false; }
    @java.lang.Deprecated
    public boolean isOnHold() { return false; }
    @java.lang.Deprecated
    public void close() {}
    @java.lang.Deprecated
    public android.net.sip.SipProfile getLocalProfile() { return null; }
    @java.lang.Deprecated
    public android.net.sip.SipProfile getPeerProfile() { return null; }
    @java.lang.Deprecated
    public int getState() { return 0; }
    @java.lang.Deprecated
    public void attachCall(android.net.sip.SipSession p0, java.lang.String p1) throws android.net.sip.SipException {}
    @java.lang.Deprecated
    public void makeCall(android.net.sip.SipProfile p0, android.net.sip.SipSession p1, int p2) throws android.net.sip.SipException {}
    @java.lang.Deprecated
    public void endCall() throws android.net.sip.SipException {}
    @java.lang.Deprecated
    public void holdCall(int p0) throws android.net.sip.SipException {}
    @java.lang.Deprecated
    public void answerCall(int p0) throws android.net.sip.SipException {}
    @java.lang.Deprecated
    public void continueCall(int p0) throws android.net.sip.SipException {}
    @java.lang.Deprecated
    public void toggleMute() {}
    @java.lang.Deprecated
    public boolean isMuted() { return false; }
    @java.lang.Deprecated
    public void setSpeakerMode(boolean p0) {}
    @java.lang.Deprecated
    public void sendDtmf(int p0) {}
    @java.lang.Deprecated
    public void sendDtmf(int p0, android.os.Message p1) {}
    @java.lang.Deprecated
    public void startAudio() {}

    @java.lang.Deprecated
    public static class Listener {
        @java.lang.Deprecated
        public Listener() {}
        @java.lang.Deprecated
        public void onReadyToCall(android.net.sip.SipAudioCall p0) {}
        @java.lang.Deprecated
        public void onCalling(android.net.sip.SipAudioCall p0) {}
        @java.lang.Deprecated
        public void onRinging(android.net.sip.SipAudioCall p0, android.net.sip.SipProfile p1) {}
        @java.lang.Deprecated
        public void onRingingBack(android.net.sip.SipAudioCall p0) {}
        @java.lang.Deprecated
        public void onCallEstablished(android.net.sip.SipAudioCall p0) {}
        @java.lang.Deprecated
        public void onCallEnded(android.net.sip.SipAudioCall p0) {}
        @java.lang.Deprecated
        public void onCallBusy(android.net.sip.SipAudioCall p0) {}
        @java.lang.Deprecated
        public void onCallHeld(android.net.sip.SipAudioCall p0) {}
        @java.lang.Deprecated
        public void onError(android.net.sip.SipAudioCall p0, int p1, java.lang.String p2) {}
        @java.lang.Deprecated
        public void onChanged(android.net.sip.SipAudioCall p0) {}
    }
}
