package android.telephony.euicc;

public class EuiccManager {
    public static final java.lang.String ACTION_MANAGE_EMBEDDED_SUBSCRIPTIONS = "android.telephony.euicc.action.MANAGE_EMBEDDED_SUBSCRIPTIONS";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_OTA_STATUS_CHANGED = "android.telephony.euicc.action.OTA_STATUS_CHANGED";
    public static final java.lang.String ACTION_NOTIFY_CARRIER_SETUP_INCOMPLETE = "android.telephony.euicc.action.NOTIFY_CARRIER_SETUP_INCOMPLETE";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_PROVISION_EMBEDDED_SUBSCRIPTION = "android.telephony.euicc.action.PROVISION_EMBEDDED_SUBSCRIPTION";
    public static final java.lang.String ACTION_RESOLVE_ERROR = "android.telephony.euicc.action.RESOLVE_ERROR";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_TOGGLE_SUBSCRIPTION_PRIVILEGED = "android.telephony.euicc.action.TOGGLE_SUBSCRIPTION_PRIVILEGED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_DELETE_SUBSCRIPTION_PRIVILEGED = "android.telephony.euicc.action.DELETE_SUBSCRIPTION_PRIVILEGED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_RENAME_SUBSCRIPTION_PRIVILEGED = "android.telephony.euicc.action.RENAME_SUBSCRIPTION_PRIVILEGED";
    public static final java.lang.String ACTION_START_EUICC_ACTIVATION = "android.telephony.euicc.action.START_EUICC_ACTIVATION";
    public static final int EMBEDDED_SUBSCRIPTION_RESULT_OK = 0;
    public static final int EMBEDDED_SUBSCRIPTION_RESULT_RESOLVABLE_ERROR = 1;
    public static final int EMBEDDED_SUBSCRIPTION_RESULT_ERROR = 2;
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ACTIVATION_TYPE = "android.telephony.euicc.extra.ACTIVATION_TYPE";
    public static final java.lang.String EXTRA_EMBEDDED_SUBSCRIPTION_DETAILED_CODE = "android.telephony.euicc.extra.EMBEDDED_SUBSCRIPTION_DETAILED_CODE";
    public static final java.lang.String EXTRA_EMBEDDED_SUBSCRIPTION_OPERATION_CODE = "android.telephony.euicc.extra.EMBEDDED_SUBSCRIPTION_OPERATION_CODE";
    public static final java.lang.String EXTRA_EMBEDDED_SUBSCRIPTION_ERROR_CODE = "android.telephony.euicc.extra.EMBEDDED_SUBSCRIPTION_ERROR_CODE";
    public static final java.lang.String EXTRA_EMBEDDED_SUBSCRIPTION_SMDX_SUBJECT_CODE = "android.telephony.euicc.extra.EMBEDDED_SUBSCRIPTION_SMDX_SUBJECT_CODE";
    public static final java.lang.String EXTRA_EMBEDDED_SUBSCRIPTION_SMDX_REASON_CODE = "android.telephony.euicc.extra.EMBEDDED_SUBSCRIPTION_SMDX_REASON_CODE";
    public static final java.lang.String EXTRA_EMBEDDED_SUBSCRIPTION_DOWNLOADABLE_SUBSCRIPTION = "android.telephony.euicc.extra.EMBEDDED_SUBSCRIPTION_DOWNLOADABLE_SUBSCRIPTION";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_EMBEDDED_SUBSCRIPTION_DOWNLOADABLE_SUBSCRIPTIONS = "android.telephony.euicc.extra.EMBEDDED_SUBSCRIPTION_DOWNLOADABLE_SUBSCRIPTIONS";
    public static final java.lang.String EXTRA_EMBEDDED_SUBSCRIPTION_RESOLUTION_INTENT = "android.telephony.euicc.extra.EMBEDDED_SUBSCRIPTION_RESOLUTION_INTENT";
    public static final java.lang.String EXTRA_EMBEDDED_SUBSCRIPTION_RESOLUTION_ACTION = "android.telephony.euicc.extra.EMBEDDED_SUBSCRIPTION_RESOLUTION_ACTION";
    public static final java.lang.String EXTRA_EMBEDDED_SUBSCRIPTION_RESOLUTION_CALLBACK_INTENT = "android.telephony.euicc.extra.EMBEDDED_SUBSCRIPTION_RESOLUTION_CALLBACK_INTENT";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_FORCE_PROVISION = "android.telephony.euicc.extra.FORCE_PROVISION";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_SUBSCRIPTION_ID = "android.telephony.euicc.extra.SUBSCRIPTION_ID";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ENABLE_SUBSCRIPTION = "android.telephony.euicc.extra.ENABLE_SUBSCRIPTION";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_SUBSCRIPTION_NICKNAME = "android.telephony.euicc.extra.SUBSCRIPTION_NICKNAME";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_FROM_SUBSCRIPTION_ID = "android.telephony.euicc.extra.FROM_SUBSCRIPTION_ID";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PHYSICAL_SLOT_ID = "android.telephony.euicc.extra.PHYSICAL_SLOT_ID";
    public static final java.lang.String EXTRA_USE_QR_SCANNER = "android.telephony.euicc.extra.USE_QR_SCANNER";
    public static final java.lang.String META_DATA_CARRIER_ICON = "android.telephony.euicc.carriericon";
    @android.annotation.SystemApi
    public static final int EUICC_ACTIVATION_TYPE_DEFAULT = 1;
    @android.annotation.SystemApi
    public static final int EUICC_ACTIVATION_TYPE_BACKUP = 2;
    @android.annotation.SystemApi
    public static final int EUICC_ACTIVATION_TYPE_TRANSFER = 3;
    @android.annotation.SystemApi
    public static final int EUICC_ACTIVATION_TYPE_ACCOUNT_REQUIRED = 4;
    @android.annotation.SystemApi
    public static final int EUICC_OTA_IN_PROGRESS = 1;
    @android.annotation.SystemApi
    public static final int EUICC_OTA_FAILED = 2;
    @android.annotation.SystemApi
    public static final int EUICC_OTA_SUCCEEDED = 3;
    @android.annotation.SystemApi
    public static final int EUICC_OTA_NOT_NEEDED = 4;
    @android.annotation.SystemApi
    public static final int EUICC_OTA_STATUS_UNAVAILABLE = 5;
    public static final int OPERATION_SYSTEM = 1;
    public static final int OPERATION_SIM_SLOT = 2;
    public static final int OPERATION_EUICC_CARD = 3;
    public static final int OPERATION_SWITCH = 4;
    public static final int OPERATION_DOWNLOAD = 5;
    public static final int OPERATION_METADATA = 6;
    public static final int OPERATION_EUICC_GSMA = 7;
    public static final int OPERATION_APDU = 8;
    public static final int OPERATION_SMDX = 9;
    public static final int OPERATION_SMDX_SUBJECT_REASON_CODE = 10;
    public static final int OPERATION_HTTP = 11;
    public static final int ERROR_CARRIER_LOCKED = 10000;
    public static final int ERROR_INVALID_ACTIVATION_CODE = 10001;
    public static final int ERROR_INVALID_CONFIRMATION_CODE = 10002;
    public static final int ERROR_INCOMPATIBLE_CARRIER = 10003;
    public static final int ERROR_EUICC_INSUFFICIENT_MEMORY = 10004;
    public static final int ERROR_TIME_OUT = 10005;
    public static final int ERROR_EUICC_MISSING = 10006;
    public static final int ERROR_UNSUPPORTED_VERSION = 10007;
    public static final int ERROR_SIM_MISSING = 10008;
    public static final int ERROR_INSTALL_PROFILE = 10009;
    public static final int ERROR_DISALLOWED_BY_PPR = 10010;
    public static final int ERROR_ADDRESS_MISSING = 10011;
    public static final int ERROR_CERTIFICATE_ERROR = 10012;
    public static final int ERROR_NO_PROFILES_AVAILABLE = 10013;
    public static final int ERROR_CONNECTION_ERROR = 10014;
    public static final int ERROR_INVALID_RESPONSE = 10015;
    public static final int ERROR_OPERATION_BUSY = 10016;
    private final android.content.Context mContext = null;
    private int mCardId;
    public EuiccManager(android.content.Context p0) {}
    private EuiccManager(android.content.Context p0, int p1) {}
    public android.telephony.euicc.EuiccManager createForCardId(int p0) { return null; }
    public boolean isEnabled() { return false; }
    public java.lang.String getEid() { return null; }
    @android.annotation.SystemApi
    public int getOtaStatus() { return 0; }
    public void downloadSubscription(android.telephony.euicc.DownloadableSubscription p0, boolean p1, android.app.PendingIntent p2) {}
    public void startResolutionActivity(android.app.Activity p0, int p1, android.content.Intent p2, android.app.PendingIntent p3) throws android.content.IntentSender.SendIntentException {}
    @android.annotation.SystemApi
    public void continueOperation(android.content.Intent p0, android.os.Bundle p1) {}
    @android.annotation.SystemApi
    public void getDownloadableSubscriptionMetadata(android.telephony.euicc.DownloadableSubscription p0, android.app.PendingIntent p1) {}
    @android.annotation.SystemApi
    public void getDefaultDownloadableSubscriptionList(android.app.PendingIntent p0) {}
    public android.telephony.euicc.EuiccInfo getEuiccInfo() { return null; }
    public void deleteSubscription(int p0, android.app.PendingIntent p1) {}
    public void switchToSubscription(int p0, android.app.PendingIntent p1) {}
    public void updateSubscriptionNickname(int p0, java.lang.String p1, android.app.PendingIntent p2) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void eraseSubscriptions(android.app.PendingIntent p0) {}
    @android.annotation.SystemApi
    public void eraseSubscriptions(int p0, android.app.PendingIntent p1) {}
    public void retainSubscriptionsForFactoryReset(android.app.PendingIntent p0) {}
    @android.annotation.SystemApi
    public void setSupportedCountries(java.util.List<java.lang.String> p0) {}
    @android.annotation.SystemApi
    public void setUnsupportedCountries(java.util.List<java.lang.String> p0) {}
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getSupportedCountries() { return null; }
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getUnsupportedCountries() { return null; }
    @android.annotation.SystemApi
    public boolean isSupportedCountry(java.lang.String p0) { return false; }
    private boolean refreshCardIdIfUninitialized() { return false; }
    private static void sendUnavailableError(android.app.PendingIntent p0) {}
    private static com.android.internal.telephony.euicc.IEuiccController getIEuiccController() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EuiccActivationType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OperationCode {
    }

    @android.annotation.SystemApi
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OtaStatus {
    }
}
