package android.telephony.ims.stub;

public class RcsSipOptionsImplBase extends android.telephony.ims.stub.RcsCapabilityExchange {
    private static final java.lang.String LOG_TAG = "RcsSipOptionsImplBase";
    public static final int RESPONSE_GENERIC_FAILURE = -1;
    public static final int RESPONSE_SUCCESS = 0;
    public static final int RESPONSE_TEMPORARILY_UNAVAILABLE = 1;
    public static final int RESPONSE_REQUEST_TIMEOUT = 2;
    public static final int RESPONSE_NOT_FOUND = 3;
    public static final int RESPONSE_DOES_NOT_EXIST_ANYWHERE = 4;
    public static final int RESPONSE_BAD_REQUEST = 5;
    public RcsSipOptionsImplBase() { super(); }
    public final void onCapabilityRequestResponse(int p0, java.lang.String p1, android.telephony.ims.RcsContactUceCapability p2, int p3) throws android.telephony.ims.ImsException {}
    public final void onRemoteCapabilityRequest(android.net.Uri p0, android.telephony.ims.RcsContactUceCapability p1, int p2) throws android.telephony.ims.ImsException {}
    public void sendCapabilityRequest(android.net.Uri p0, android.telephony.ims.RcsContactUceCapability p1, int p2) {}
    public void respondToCapabilityRequest(java.lang.String p0, android.telephony.ims.RcsContactUceCapability p1, int p2) {}
    public void respondToCapabilityRequestWithError(android.net.Uri p0, int p1, java.lang.String p2, int p3) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SipResponseCode {
    }
}
