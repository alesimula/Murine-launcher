package android.telephony.euicc;

@android.annotation.SystemApi
public class EuiccCardManager {
    private static final java.lang.String TAG = "EuiccCardManager";
    public static final int CANCEL_REASON_END_USER_REJECTED = 0;
    public static final int CANCEL_REASON_POSTPONED = 1;
    public static final int CANCEL_REASON_TIMEOUT = 2;
    public static final int CANCEL_REASON_PPR_NOT_ALLOWED = 3;
    public static final int RESET_OPTION_DELETE_OPERATIONAL_PROFILES = 1;
    public static final int RESET_OPTION_DELETE_FIELD_LOADED_TEST_PROFILES = 2;
    public static final int RESET_OPTION_RESET_DEFAULT_SMDP_ADDRESS = 4;
    public static final int RESULT_OK = 0;
    public static final int RESULT_UNKNOWN_ERROR = -1;
    public static final int RESULT_EUICC_NOT_FOUND = -2;
    public static final int RESULT_CALLER_NOT_ALLOWED = -3;
    private final android.content.Context mContext = null;
    public EuiccCardManager(android.content.Context p0) {}
    private com.android.internal.telephony.euicc.IEuiccCardController getIEuiccCardController() { return null; }
    public void requestAllProfiles(java.lang.String p0, java.util.concurrent.Executor p1, android.telephony.euicc.EuiccCardManager.ResultCallback<android.service.euicc.EuiccProfileInfo[]> p2) {}
    public void requestProfile(java.lang.String p0, java.lang.String p1, java.util.concurrent.Executor p2, android.telephony.euicc.EuiccCardManager.ResultCallback<android.service.euicc.EuiccProfileInfo> p3) {}
    public void disableProfile(java.lang.String p0, java.lang.String p1, boolean p2, java.util.concurrent.Executor p3, android.telephony.euicc.EuiccCardManager.ResultCallback<java.lang.Void> p4) {}
    public void switchToProfile(java.lang.String p0, java.lang.String p1, boolean p2, java.util.concurrent.Executor p3, android.telephony.euicc.EuiccCardManager.ResultCallback<android.service.euicc.EuiccProfileInfo> p4) {}
    public void setNickname(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.concurrent.Executor p3, android.telephony.euicc.EuiccCardManager.ResultCallback<java.lang.Void> p4) {}
    public void deleteProfile(java.lang.String p0, java.lang.String p1, java.util.concurrent.Executor p2, android.telephony.euicc.EuiccCardManager.ResultCallback<java.lang.Void> p3) {}
    public void resetMemory(java.lang.String p0, int p1, java.util.concurrent.Executor p2, android.telephony.euicc.EuiccCardManager.ResultCallback<java.lang.Void> p3) {}
    public void requestDefaultSmdpAddress(java.lang.String p0, java.util.concurrent.Executor p1, android.telephony.euicc.EuiccCardManager.ResultCallback<java.lang.String> p2) {}
    public void requestSmdsAddress(java.lang.String p0, java.util.concurrent.Executor p1, android.telephony.euicc.EuiccCardManager.ResultCallback<java.lang.String> p2) {}
    public void setDefaultSmdpAddress(java.lang.String p0, java.lang.String p1, java.util.concurrent.Executor p2, android.telephony.euicc.EuiccCardManager.ResultCallback<java.lang.Void> p3) {}
    public void requestRulesAuthTable(java.lang.String p0, java.util.concurrent.Executor p1, android.telephony.euicc.EuiccCardManager.ResultCallback<android.telephony.euicc.EuiccRulesAuthTable> p2) {}
    public void requestEuiccChallenge(java.lang.String p0, java.util.concurrent.Executor p1, android.telephony.euicc.EuiccCardManager.ResultCallback<byte[]> p2) {}
    public void requestEuiccInfo1(java.lang.String p0, java.util.concurrent.Executor p1, android.telephony.euicc.EuiccCardManager.ResultCallback<byte[]> p2) {}
    public void requestEuiccInfo2(java.lang.String p0, java.util.concurrent.Executor p1, android.telephony.euicc.EuiccCardManager.ResultCallback<byte[]> p2) {}
    public void authenticateServer(java.lang.String p0, java.lang.String p1, byte[] p2, byte[] p3, byte[] p4, byte[] p5, java.util.concurrent.Executor p6, android.telephony.euicc.EuiccCardManager.ResultCallback<byte[]> p7) {}
    public void prepareDownload(java.lang.String p0, byte[] p1, byte[] p2, byte[] p3, byte[] p4, java.util.concurrent.Executor p5, android.telephony.euicc.EuiccCardManager.ResultCallback<byte[]> p6) {}
    public void loadBoundProfilePackage(java.lang.String p0, byte[] p1, java.util.concurrent.Executor p2, android.telephony.euicc.EuiccCardManager.ResultCallback<byte[]> p3) {}
    public void cancelSession(java.lang.String p0, byte[] p1, int p2, java.util.concurrent.Executor p3, android.telephony.euicc.EuiccCardManager.ResultCallback<byte[]> p4) {}
    public void listNotifications(java.lang.String p0, int p1, java.util.concurrent.Executor p2, android.telephony.euicc.EuiccCardManager.ResultCallback<android.telephony.euicc.EuiccNotification[]> p3) {}
    public void retrieveNotificationList(java.lang.String p0, int p1, java.util.concurrent.Executor p2, android.telephony.euicc.EuiccCardManager.ResultCallback<android.telephony.euicc.EuiccNotification[]> p3) {}
    public void retrieveNotification(java.lang.String p0, int p1, java.util.concurrent.Executor p2, android.telephony.euicc.EuiccCardManager.ResultCallback<android.telephony.euicc.EuiccNotification> p3) {}
    public void removeNotificationFromList(java.lang.String p0, int p1, java.util.concurrent.Executor p2, android.telephony.euicc.EuiccCardManager.ResultCallback<java.lang.Void> p3) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CancelReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResetOption {
    }

    public static interface ResultCallback<T extends java.lang.Object> {
        public void onComplete(int p0, T p1);
    }
}
