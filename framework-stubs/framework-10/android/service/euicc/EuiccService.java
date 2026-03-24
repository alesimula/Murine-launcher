package android.service.euicc;

@android.annotation.SystemApi
public abstract class EuiccService extends android.app.Service {
    private static final java.lang.String TAG = "EuiccService";
    public static final java.lang.String EUICC_SERVICE_INTERFACE = "android.service.euicc.EuiccService";
    public static final java.lang.String CATEGORY_EUICC_UI = "android.service.euicc.category.EUICC_UI";
    public static final java.lang.String ACTION_BIND_CARRIER_PROVISIONING_SERVICE = "android.service.euicc.action.BIND_CARRIER_PROVISIONING_SERVICE";
    public static final java.lang.String ACTION_MANAGE_EMBEDDED_SUBSCRIPTIONS = "android.service.euicc.action.MANAGE_EMBEDDED_SUBSCRIPTIONS";
    public static final java.lang.String ACTION_PROVISION_EMBEDDED_SUBSCRIPTION = "android.service.euicc.action.PROVISION_EMBEDDED_SUBSCRIPTION";
    public static final java.lang.String ACTION_TOGGLE_SUBSCRIPTION_PRIVILEGED = "android.service.euicc.action.TOGGLE_SUBSCRIPTION_PRIVILEGED";
    public static final java.lang.String ACTION_DELETE_SUBSCRIPTION_PRIVILEGED = "android.service.euicc.action.DELETE_SUBSCRIPTION_PRIVILEGED";
    public static final java.lang.String ACTION_RENAME_SUBSCRIPTION_PRIVILEGED = "android.service.euicc.action.RENAME_SUBSCRIPTION_PRIVILEGED";
    public static final java.lang.String ACTION_RESOLVE_DEACTIVATE_SIM = "android.service.euicc.action.RESOLVE_DEACTIVATE_SIM";
    public static final java.lang.String ACTION_RESOLVE_NO_PRIVILEGES = "android.service.euicc.action.RESOLVE_NO_PRIVILEGES";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_RESOLVE_CONFIRMATION_CODE = "android.service.euicc.action.RESOLVE_CONFIRMATION_CODE";
    public static final java.lang.String ACTION_RESOLVE_RESOLVABLE_ERRORS = "android.service.euicc.action.RESOLVE_RESOLVABLE_ERRORS";
    public static final int RESOLVABLE_ERROR_CONFIRMATION_CODE = 1;
    public static final int RESOLVABLE_ERROR_POLICY_RULES = 2;
    public static final java.lang.String EXTRA_RESOLUTION_CALLING_PACKAGE = "android.service.euicc.extra.RESOLUTION_CALLING_PACKAGE";
    public static final java.lang.String EXTRA_RESOLVABLE_ERRORS = "android.service.euicc.extra.RESOLVABLE_ERRORS";
    public static final java.lang.String EXTRA_RESOLUTION_CONFIRMATION_CODE_RETRIED = "android.service.euicc.extra.RESOLUTION_CONFIRMATION_CODE_RETRIED";
    public static final java.lang.String EXTRA_RESOLUTION_CARD_ID = "android.service.euicc.extra.RESOLUTION_CARD_ID";
    public static final int RESULT_OK = 0;
    public static final int RESULT_MUST_DEACTIVATE_SIM = -1;
    public static final int RESULT_RESOLVABLE_ERRORS = -2;
    @java.lang.Deprecated
    public static final int RESULT_NEED_CONFIRMATION_CODE = -2;
    public static final int RESULT_FIRST_USER = 1;
    public static final android.util.ArraySet<java.lang.String> RESOLUTION_ACTIONS = null;
    public static final java.lang.String EXTRA_RESOLUTION_CONSENT = "android.service.euicc.extra.RESOLUTION_CONSENT";
    public static final java.lang.String EXTRA_RESOLUTION_CONFIRMATION_CODE = "android.service.euicc.extra.RESOLUTION_CONFIRMATION_CODE";
    public static final java.lang.String EXTRA_RESOLUTION_ALLOW_POLICY_RULES = "android.service.euicc.extra.RESOLUTION_ALLOW_POLICY_RULES";
    private final android.service.euicc.IEuiccService.Stub mStubWrapper = null;
    private java.util.concurrent.ThreadPoolExecutor mExecutor;
    public EuiccService() { super(); }
    public void onCreate() {}
    public void onDestroy() {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract java.lang.String onGetEid(int p0);
    public abstract int onGetOtaStatus(int p0);
    public abstract void onStartOtaIfNecessary(int p0, android.service.euicc.EuiccService.OtaStatusChangedCallback p1);
    public abstract android.service.euicc.GetDownloadableSubscriptionMetadataResult onGetDownloadableSubscriptionMetadata(int p0, android.telephony.euicc.DownloadableSubscription p1, boolean p2);
    public abstract android.service.euicc.GetDefaultDownloadableSubscriptionListResult onGetDefaultDownloadableSubscriptionList(int p0, boolean p1);
    public android.service.euicc.DownloadSubscriptionResult onDownloadSubscription(int p0, android.telephony.euicc.DownloadableSubscription p1, boolean p2, boolean p3, android.os.Bundle p4) { return null; }
    @java.lang.Deprecated
    public int onDownloadSubscription(int p0, android.telephony.euicc.DownloadableSubscription p1, boolean p2, boolean p3) { return 0; }
    public abstract android.service.euicc.GetEuiccProfileInfoListResult onGetEuiccProfileInfoList(int p0);
    public abstract android.telephony.euicc.EuiccInfo onGetEuiccInfo(int p0);
    public abstract int onDeleteSubscription(int p0, java.lang.String p1);
    public abstract int onSwitchToSubscription(int p0, java.lang.String p1, boolean p2);
    public abstract int onUpdateSubscriptionNickname(int p0, java.lang.String p1, java.lang.String p2);
    public abstract int onEraseSubscriptions(int p0);
    public abstract int onRetainSubscriptionsForFactoryReset(int p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Result {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResolvableError {
    }

    public static abstract class OtaStatusChangedCallback {
        public OtaStatusChangedCallback() {}
        public abstract void onOtaStatusChanged(int p0);
    }

    private class IEuiccServiceWrapper extends android.service.euicc.IEuiccService.Stub {
        private IEuiccServiceWrapper(android.service.euicc.EuiccService p0) { super(); }
        public void downloadSubscription(int p0, android.telephony.euicc.DownloadableSubscription p1, boolean p2, boolean p3, android.os.Bundle p4, android.service.euicc.IDownloadSubscriptionCallback p5) {}
        public void getEid(int p0, android.service.euicc.IGetEidCallback p1) {}
        public void startOtaIfNecessary(int p0, android.service.euicc.IOtaStatusChangedCallback p1) {}
        public void getOtaStatus(int p0, android.service.euicc.IGetOtaStatusCallback p1) {}
        public void getDownloadableSubscriptionMetadata(int p0, android.telephony.euicc.DownloadableSubscription p1, boolean p2, android.service.euicc.IGetDownloadableSubscriptionMetadataCallback p3) {}
        public void getDefaultDownloadableSubscriptionList(int p0, boolean p1, android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback p2) {}
        public void getEuiccProfileInfoList(int p0, android.service.euicc.IGetEuiccProfileInfoListCallback p1) {}
        public void getEuiccInfo(int p0, android.service.euicc.IGetEuiccInfoCallback p1) {}
        public void deleteSubscription(int p0, java.lang.String p1, android.service.euicc.IDeleteSubscriptionCallback p2) {}
        public void switchToSubscription(int p0, java.lang.String p1, boolean p2, android.service.euicc.ISwitchToSubscriptionCallback p3) {}
        public void updateSubscriptionNickname(int p0, java.lang.String p1, java.lang.String p2, android.service.euicc.IUpdateSubscriptionNicknameCallback p3) {}
        public void eraseSubscriptions(int p0, android.service.euicc.IEraseSubscriptionsCallback p1) {}
        public void retainSubscriptionsForFactoryReset(int p0, android.service.euicc.IRetainSubscriptionsForFactoryResetCallback p1) {}
    }
}
