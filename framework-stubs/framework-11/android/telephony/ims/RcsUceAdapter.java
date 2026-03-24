package android.telephony.ims;

public class RcsUceAdapter {
    private static final java.lang.String TAG = "RcsUceAdapter";
    public static final int ERROR_GENERIC_FAILURE = 1;
    public static final int ERROR_NOT_ENABLED = 2;
    public static final int ERROR_NOT_AVAILABLE = 3;
    public static final int ERROR_NOT_REGISTERED = 4;
    public static final int ERROR_NOT_AUTHORIZED = 5;
    public static final int ERROR_FORBIDDEN = 6;
    public static final int ERROR_NOT_FOUND = 7;
    public static final int ERROR_REQUEST_TOO_LARGE = 8;
    public static final int ERROR_REQUEST_TIMEOUT = 10;
    public static final int ERROR_INSUFFICIENT_MEMORY = 11;
    public static final int ERROR_LOST_NETWORK = 12;
    public static final int ERROR_ALREADY_IN_QUEUE = 13;
    public static final int PUBLISH_STATE_OK = 1;
    public static final int PUBLISH_STATE_NOT_PUBLISHED = 2;
    public static final int PUBLISH_STATE_VOLTE_PROVISION_ERROR = 3;
    public static final int PUBLISH_STATE_RCS_PROVISION_ERROR = 4;
    public static final int PUBLISH_STATE_REQUEST_TIMEOUT = 5;
    public static final int PUBLISH_STATE_OTHER_ERROR = 6;
    private final android.content.Context mContext = null;
    private final int mSubId = 0;
    RcsUceAdapter(android.content.Context p0, int p1) {}
    public void requestCapabilities(java.util.concurrent.Executor p0, java.util.List<android.net.Uri> p1, android.telephony.ims.RcsUceAdapter.CapabilitiesCallback p2) throws android.telephony.ims.ImsException {}
    public int getUcePublishState() throws android.telephony.ims.ImsException { return 0; }
    public boolean isUceSettingEnabled() throws android.telephony.ims.ImsException { return false; }
    @android.annotation.SystemApi
    public void setUceSettingEnabled(boolean p0) throws android.telephony.ims.ImsException {}
    private android.telephony.ims.aidl.IImsRcsController getIImsRcsController() { return null; }

    public static class CapabilitiesCallback {
        public CapabilitiesCallback() {}
        public void onCapabilitiesReceived(java.util.List<android.telephony.ims.RcsContactUceCapability> p0) {}
        public void onError(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PublishState {
    }
}
