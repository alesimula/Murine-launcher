package android.net.sip;

@java.lang.Deprecated
public final class SipSession {
    SipSession() {}
    @java.lang.Deprecated
    public java.lang.String getLocalIp() { return null; }
    @java.lang.Deprecated
    public android.net.sip.SipProfile getLocalProfile() { return null; }
    @java.lang.Deprecated
    public android.net.sip.SipProfile getPeerProfile() { return null; }
    @java.lang.Deprecated
    public int getState() { return 0; }
    @java.lang.Deprecated
    public boolean isInCall() { return false; }
    @java.lang.Deprecated
    public java.lang.String getCallId() { return null; }
    @java.lang.Deprecated
    public void setListener(android.net.sip.SipSession.Listener p0) {}
    @java.lang.Deprecated
    public void register(int p0) {}
    @java.lang.Deprecated
    public void unregister() {}
    @java.lang.Deprecated
    public void makeCall(android.net.sip.SipProfile p0, java.lang.String p1, int p2) {}
    @java.lang.Deprecated
    public void answerCall(java.lang.String p0, int p1) {}
    @java.lang.Deprecated
    public void endCall() {}
    @java.lang.Deprecated
    public void changeCall(java.lang.String p0, int p1) {}

    @java.lang.Deprecated
    public static class Listener {
        @java.lang.Deprecated
        public Listener() {}
        @java.lang.Deprecated
        public void onCalling(android.net.sip.SipSession p0) {}
        @java.lang.Deprecated
        public void onRinging(android.net.sip.SipSession p0, android.net.sip.SipProfile p1, java.lang.String p2) {}
        @java.lang.Deprecated
        public void onRingingBack(android.net.sip.SipSession p0) {}
        @java.lang.Deprecated
        public void onCallEstablished(android.net.sip.SipSession p0, java.lang.String p1) {}
        @java.lang.Deprecated
        public void onCallEnded(android.net.sip.SipSession p0) {}
        @java.lang.Deprecated
        public void onCallBusy(android.net.sip.SipSession p0) {}
        @java.lang.Deprecated
        public void onError(android.net.sip.SipSession p0, int p1, java.lang.String p2) {}
        @java.lang.Deprecated
        public void onCallChangeFailed(android.net.sip.SipSession p0, int p1, java.lang.String p2) {}
        @java.lang.Deprecated
        public void onRegistering(android.net.sip.SipSession p0) {}
        @java.lang.Deprecated
        public void onRegistrationDone(android.net.sip.SipSession p0, int p1) {}
        @java.lang.Deprecated
        public void onRegistrationFailed(android.net.sip.SipSession p0, int p1, java.lang.String p2) {}
        @java.lang.Deprecated
        public void onRegistrationTimeout(android.net.sip.SipSession p0) {}
    }

    @java.lang.Deprecated
    public static class State {
        @java.lang.Deprecated
        public static final int DEREGISTERING = 2;
        @java.lang.Deprecated
        public static final int INCOMING_CALL = 3;
        @java.lang.Deprecated
        public static final int INCOMING_CALL_ANSWERING = 4;
        @java.lang.Deprecated
        public static final int IN_CALL = 8;
        @java.lang.Deprecated
        public static final int NOT_DEFINED = 101;
        @java.lang.Deprecated
        public static final int OUTGOING_CALL = 5;
        @java.lang.Deprecated
        public static final int OUTGOING_CALL_CANCELING = 7;
        @java.lang.Deprecated
        public static final int OUTGOING_CALL_RING_BACK = 6;
        @java.lang.Deprecated
        public static final int PINGING = 9;
        @java.lang.Deprecated
        public static final int READY_TO_CALL = 0;
        @java.lang.Deprecated
        public static final int REGISTERING = 1;
        private State() {}
        @java.lang.Deprecated
        public static java.lang.String toString(int p0) { return null; }
    }
}
