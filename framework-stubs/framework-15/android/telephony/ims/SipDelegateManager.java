package android.telephony.ims;

@android.annotation.SystemApi
public class SipDelegateManager {
    public static final int MESSAGE_FAILURE_REASON_UNKNOWN = 0;
    public static final int MESSAGE_FAILURE_REASON_DELEGATE_DEAD = 1;
    public static final int MESSAGE_FAILURE_REASON_DELEGATE_CLOSED = 2;
    public static final int MESSAGE_FAILURE_REASON_INVALID_START_LINE = 3;
    public static final int MESSAGE_FAILURE_REASON_INVALID_HEADER_FIELDS = 4;
    public static final int MESSAGE_FAILURE_REASON_INVALID_BODY_CONTENT = 5;
    public static final int MESSAGE_FAILURE_REASON_INVALID_FEATURE_TAG = 6;
    public static final int MESSAGE_FAILURE_REASON_TAG_NOT_ENABLED_FOR_DELEGATE = 7;
    public static final int MESSAGE_FAILURE_REASON_NETWORK_NOT_AVAILABLE = 8;
    public static final int MESSAGE_FAILURE_REASON_NOT_REGISTERED = 9;
    public static final int MESSAGE_FAILURE_REASON_STALE_IMS_CONFIGURATION = 10;
    public static final int MESSAGE_FAILURE_REASON_INTERNAL_DELEGATE_STATE_TRANSITION = 11;
    public static final android.util.ArrayMap<java.lang.Integer, java.lang.String> MESSAGE_FAILURE_REASON_STRING_MAP = null;
    public static final int DENIED_REASON_UNKNOWN = 0;
    public static final int DENIED_REASON_IN_USE_BY_ANOTHER_DELEGATE = 1;
    public static final int DENIED_REASON_NOT_ALLOWED = 2;
    public static final int DENIED_REASON_SINGLE_REGISTRATION_NOT_ALLOWED = 3;
    public static final int DENIED_REASON_INVALID = 4;
    public static final int SIP_DELEGATE_DESTROY_REASON_UNKNOWN = 0;
    public static final int SIP_DELEGATE_DESTROY_REASON_SERVICE_DEAD = 1;
    public static final int SIP_DELEGATE_DESTROY_REASON_REQUESTED_BY_APP = 2;
    public static final int SIP_DELEGATE_DESTROY_REASON_USER_DISABLED_RCS = 3;
    public static final int SIP_DELEGATE_DESTROY_REASON_SUBSCRIPTION_TORN_DOWN = 4;
    public SipDelegateManager(android.content.Context p0, int p1, android.telephony.BinderCacheManager<android.telephony.ims.aidl.IImsRcsController> p2, android.telephony.BinderCacheManager<com.android.internal.telephony.ITelephony> p3) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.PERFORM_IMS_SINGLE_REGISTRATION"})
    public boolean isSupported() throws android.telephony.ims.ImsException { return false; }
    @android.annotation.RequiresPermission("android.permission.PERFORM_IMS_SINGLE_REGISTRATION")
    public void createSipDelegate(android.telephony.ims.DelegateRequest p0, java.util.concurrent.Executor p1, android.telephony.ims.stub.DelegateConnectionStateCallback p2, android.telephony.ims.stub.DelegateConnectionMessageCallback p3) throws android.telephony.ims.ImsException {}
    @android.annotation.RequiresPermission("android.permission.PERFORM_IMS_SINGLE_REGISTRATION")
    public void destroySipDelegate(android.telephony.ims.SipDelegateConnection p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.PERFORM_IMS_SINGLE_REGISTRATION")
    public void triggerFullNetworkRegistration(android.telephony.ims.SipDelegateConnection p0, int p1, java.lang.String p2) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.PERFORM_IMS_SINGLE_REGISTRATION"})
    public void registerImsStateCallback(java.util.concurrent.Executor p0, android.telephony.ims.ImsStateCallback p1) throws android.telephony.ims.ImsException {}
    public void unregisterImsStateCallback(android.telephony.ims.ImsStateCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void registerSipDialogStateCallback(java.util.concurrent.Executor p0, android.telephony.ims.SipDialogStateCallback p1) throws android.telephony.ims.ImsException {}
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public void unregisterSipDialogStateCallback(android.telephony.ims.SipDialogStateCallback p0) throws android.telephony.ims.ImsException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeniedReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MessageFailureReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SipDelegateDestroyReason {
    }
}
