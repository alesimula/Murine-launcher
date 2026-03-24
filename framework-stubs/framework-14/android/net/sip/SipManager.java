package android.net.sip;

@java.lang.Deprecated
public class SipManager {
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_CALL_ID = "android:sipCallID";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_OFFER_SD = "android:sipOfferSD";
    @java.lang.Deprecated
    public static final int INCOMING_CALL_RESULT_CODE = 101;
    SipManager() {}
    @java.lang.Deprecated
    public static android.net.sip.SipManager newInstance(android.content.Context p0) { return null; }
    @java.lang.Deprecated
    public static boolean isApiSupported(android.content.Context p0) { return false; }
    @java.lang.Deprecated
    public static boolean isVoipSupported(android.content.Context p0) { return false; }
    @java.lang.Deprecated
    public static boolean isSipWifiOnly(android.content.Context p0) { return false; }
    @java.lang.Deprecated
    public void open(android.net.sip.SipProfile p0) throws android.net.sip.SipException {}
    @java.lang.Deprecated
    public void open(android.net.sip.SipProfile p0, android.app.PendingIntent p1, android.net.sip.SipRegistrationListener p2) throws android.net.sip.SipException {}
    @java.lang.Deprecated
    public void setRegistrationListener(java.lang.String p0, android.net.sip.SipRegistrationListener p1) throws android.net.sip.SipException {}
    @java.lang.Deprecated
    public void close(java.lang.String p0) throws android.net.sip.SipException {}
    @java.lang.Deprecated
    public boolean isOpened(java.lang.String p0) throws android.net.sip.SipException { return false; }
    @java.lang.Deprecated
    public boolean isRegistered(java.lang.String p0) throws android.net.sip.SipException { return false; }
    @java.lang.Deprecated
    public android.net.sip.SipAudioCall makeAudioCall(android.net.sip.SipProfile p0, android.net.sip.SipProfile p1, android.net.sip.SipAudioCall.Listener p2, int p3) throws android.net.sip.SipException { return null; }
    @java.lang.Deprecated
    public android.net.sip.SipAudioCall makeAudioCall(java.lang.String p0, java.lang.String p1, android.net.sip.SipAudioCall.Listener p2, int p3) throws android.net.sip.SipException { return null; }
    @java.lang.Deprecated
    public android.net.sip.SipAudioCall takeAudioCall(android.content.Intent p0, android.net.sip.SipAudioCall.Listener p1) throws android.net.sip.SipException { return null; }
    @java.lang.Deprecated
    public static boolean isIncomingCallIntent(android.content.Intent p0) { return false; }
    @java.lang.Deprecated
    public static java.lang.String getCallId(android.content.Intent p0) { return null; }
    @java.lang.Deprecated
    public static java.lang.String getOfferSessionDescription(android.content.Intent p0) { return null; }
    @java.lang.Deprecated
    public void register(android.net.sip.SipProfile p0, int p1, android.net.sip.SipRegistrationListener p2) throws android.net.sip.SipException {}
    @java.lang.Deprecated
    public void unregister(android.net.sip.SipProfile p0, android.net.sip.SipRegistrationListener p1) throws android.net.sip.SipException {}
    @java.lang.Deprecated
    public android.net.sip.SipSession getSessionFor(android.content.Intent p0) throws android.net.sip.SipException { return null; }
    @java.lang.Deprecated
    public android.net.sip.SipSession createSipSession(android.net.sip.SipProfile p0, android.net.sip.SipSession.Listener p1) throws android.net.sip.SipException { return null; }
}
