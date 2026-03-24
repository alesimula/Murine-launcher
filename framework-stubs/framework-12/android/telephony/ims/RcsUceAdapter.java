package android.telephony.ims;

public class RcsUceAdapter {
    private static final java.lang.String TAG = "RcsUceAdapter";
    public static final int CAPABILITY_TYPE_OPTIONS_UCE = 1;
    @android.annotation.SystemApi
    public static final int CAPABILITY_TYPE_PRESENCE_UCE = 2;
    @android.annotation.SystemApi
    public static final int ERROR_GENERIC_FAILURE = 1;
    @android.annotation.SystemApi
    public static final int ERROR_NOT_ENABLED = 2;
    @android.annotation.SystemApi
    public static final int ERROR_NOT_AVAILABLE = 3;
    @android.annotation.SystemApi
    public static final int ERROR_NOT_REGISTERED = 4;
    @android.annotation.SystemApi
    public static final int ERROR_NOT_AUTHORIZED = 5;
    @android.annotation.SystemApi
    public static final int ERROR_FORBIDDEN = 6;
    @android.annotation.SystemApi
    public static final int ERROR_NOT_FOUND = 7;
    @android.annotation.SystemApi
    public static final int ERROR_REQUEST_TOO_LARGE = 8;
    @android.annotation.SystemApi
    public static final int ERROR_REQUEST_TIMEOUT = 9;
    @android.annotation.SystemApi
    public static final int ERROR_INSUFFICIENT_MEMORY = 10;
    @android.annotation.SystemApi
    public static final int ERROR_LOST_NETWORK = 11;
    @android.annotation.SystemApi
    public static final int ERROR_SERVER_UNAVAILABLE = 12;
    @android.annotation.SystemApi
    public static final int CAPABILITY_UPDATE_TRIGGER_UNKNOWN = 0;
    @android.annotation.SystemApi
    public static final int CAPABILITY_UPDATE_TRIGGER_ETAG_EXPIRED = 1;
    @android.annotation.SystemApi
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_LTE_VOPS_DISABLED = 2;
    @android.annotation.SystemApi
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_LTE_VOPS_ENABLED = 3;
    @android.annotation.SystemApi
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_EHRPD = 4;
    @android.annotation.SystemApi
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_HSPAPLUS = 5;
    @android.annotation.SystemApi
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_3G = 6;
    @android.annotation.SystemApi
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_2G = 7;
    @android.annotation.SystemApi
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_WLAN = 8;
    @android.annotation.SystemApi
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_IWLAN = 9;
    @android.annotation.SystemApi
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_NR5G_VOPS_DISABLED = 10;
    @android.annotation.SystemApi
    public static final int CAPABILITY_UPDATE_TRIGGER_MOVE_TO_NR5G_VOPS_ENABLED = 11;
    @android.annotation.SystemApi
    public static final int PUBLISH_STATE_OK = 1;
    @android.annotation.SystemApi
    public static final int PUBLISH_STATE_NOT_PUBLISHED = 2;
    @android.annotation.SystemApi
    public static final int PUBLISH_STATE_VOICE_PROVISION_ERROR = 3;
    @android.annotation.SystemApi
    public static final int PUBLISH_STATE_RCS_PROVISION_ERROR = 4;
    @android.annotation.SystemApi
    public static final int PUBLISH_STATE_REQUEST_TIMEOUT = 5;
    @android.annotation.SystemApi
    public static final int PUBLISH_STATE_OTHER_ERROR = 6;
    private final android.content.Context mContext = null;
    private final int mSubId = 0;
    private final java.util.Map<android.telephony.ims.RcsUceAdapter.OnPublishStateChangedListener, android.telephony.ims.RcsUceAdapter.PublishStateCallbackAdapter> mPublishStateCallbacks = null;
    RcsUceAdapter(android.content.Context p0, int p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.ACCESS_RCS_USER_CAPABILITY_EXCHANGE", "android.permission.READ_CONTACTS"})
    public void requestCapabilities(java.util.Collection<android.net.Uri> p0, java.util.concurrent.Executor p1, android.telephony.ims.RcsUceAdapter.CapabilitiesCallback p2) throws android.telephony.ims.ImsException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.ACCESS_RCS_USER_CAPABILITY_EXCHANGE", "android.permission.READ_CONTACTS"})
    public void requestAvailability(android.net.Uri p0, java.util.concurrent.Executor p1, android.telephony.ims.RcsUceAdapter.CapabilitiesCallback p2) throws android.telephony.ims.ImsException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public int getUcePublishState() throws android.telephony.ims.ImsException { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void addOnPublishStateChangedListener(java.util.concurrent.Executor p0, android.telephony.ims.RcsUceAdapter.OnPublishStateChangedListener p1) throws android.telephony.ims.ImsException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void removeOnPublishStateChangedListener(android.telephony.ims.RcsUceAdapter.OnPublishStateChangedListener p0) throws android.telephony.ims.ImsException {}
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public boolean isUceSettingEnabled() throws android.telephony.ims.ImsException { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void setUceSettingEnabled(boolean p0) throws android.telephony.ims.ImsException {}
    private android.telephony.ims.RcsUceAdapter.PublishStateCallbackAdapter addPublishStateCallback(java.util.concurrent.Executor p0, android.telephony.ims.RcsUceAdapter.OnPublishStateChangedListener p1) { return null; }
    private android.telephony.ims.RcsUceAdapter.PublishStateCallbackAdapter removePublishStateCallback(android.telephony.ims.RcsUceAdapter.OnPublishStateChangedListener p0) { return null; }
    private android.telephony.ims.aidl.IImsRcsController getIImsRcsController() { return null; }

    @android.annotation.SystemApi
    public static interface CapabilitiesCallback {
        public void onCapabilitiesReceived(java.util.List<android.telephony.ims.RcsContactUceCapability> p0);
        public void onComplete();
        public void onError(int p0, long p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }

    @android.annotation.SystemApi
    public static interface OnPublishStateChangedListener {
        public void onPublishStateChange(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PublishState {
    }

    public static class PublishStateCallbackAdapter {
        private final android.telephony.ims.RcsUceAdapter.PublishStateCallbackAdapter.PublishStateBinder mBinder = null;
        public PublishStateCallbackAdapter(java.util.concurrent.Executor p0, android.telephony.ims.RcsUceAdapter.OnPublishStateChangedListener p1) {}
        public final android.telephony.ims.aidl.IRcsUcePublishStateCallback getBinder() { return null; }

        private static class PublishStateBinder extends android.telephony.ims.aidl.IRcsUcePublishStateCallback.Stub {
            private final android.telephony.ims.RcsUceAdapter.OnPublishStateChangedListener mPublishStateChangeListener = null;
            private final java.util.concurrent.Executor mExecutor = null;
            PublishStateBinder(java.util.concurrent.Executor p0, android.telephony.ims.RcsUceAdapter.OnPublishStateChangedListener p1) { super(); }
            public void onPublishStateChanged(int p0) {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RcsImsCapabilityFlag {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StackPublishTriggerType {
    }
}
