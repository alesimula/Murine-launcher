package android.telephony.ims.stub;

public class RcsPresenceExchangeImplBase extends android.telephony.ims.stub.RcsCapabilityExchange {
    private static final java.lang.String LOG_TAG = "RcsPresenceExchangeIB";
    public static final int RESPONSE_SUBSCRIBE_GENERIC_FAILURE = -1;
    public static final int RESPONSE_SUCCESS = 0;
    public static final int RESPONSE_NOT_REGISTERED = 1;
    public static final int RESPONSE_NOT_AUTHORIZED_FOR_PRESENCE = 2;
    public static final int RESPONSE_FORBIDDEN = 3;
    public static final int RESPONSE_NOT_FOUND = 4;
    public static final int RESPONSE_SIP_REQUEST_TIMEOUT = 5;
    public static final int RESPONSE_SUBSCRIBE_TOO_LARGE = 6;
    public static final int RESPONSE_SIP_INTERVAL_TOO_SHORT = 7;
    public static final int RESPONSE_SIP_SERVICE_UNAVAILABLE = 8;
    public static final int CAPABILITY_UPDATE_TRIGGER_ETAG_EXPIRED = 0;
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_LTE_VOPS_DISABLED = 1;
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_LTE_VOPS_ENABLED = 2;
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_EHRPD = 3;
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_HSPAPLUS = 4;
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_3G = 5;
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_2G = 6;
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_WLAN = 7;
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_IWLAN = 8;
    public static final int CAPABILITY_UPDATE_TRIGGER_UNKNOWN = 9;
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_NR5G_VOPS_DISABLED = 10;
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_NR5G_VOPS_ENABLED = 11;
    public RcsPresenceExchangeImplBase() { super(); }
    public final void onNetworkResponse(int p0, java.lang.String p1, int p2) throws android.telephony.ims.ImsException {}
    public final void onCapabilityRequestResponse(java.util.List<android.telephony.ims.RcsContactUceCapability> p0, int p1) throws android.telephony.ims.ImsException {}
    public final void onNotifyUpdateCapabilites(int p0) throws android.telephony.ims.ImsException {}
    public final void onUnpublish() throws android.telephony.ims.ImsException {}
    public void requestCapabilities(java.util.List<android.net.Uri> p0, int p1) {}
    public void updateCapabilities(android.telephony.ims.RcsContactUceCapability p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PresenceResponseCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StackPublishTriggerType {
    }
}
