package com.android.internal.telephony.euicc;

public class EuiccController extends com.android.internal.telephony.euicc.IEuiccController.Stub {
    static final java.lang.String EXTRA_OPERATION = "operation";
    public static com.android.internal.telephony.euicc.EuiccController init(android.content.Context p0) { return null; }
    public static com.android.internal.telephony.euicc.EuiccController get() { return null; }
    public EuiccController(android.content.Context p0, com.android.internal.telephony.euicc.EuiccConnector p1) { super(); }
    public void continueOperation(int p0, android.content.Intent p1, android.os.Bundle p2) {}
    public java.lang.String getEid(int p0, java.lang.String p1) { return null; }
    public int getOtaStatus(int p0) { return 0; }
    public void startOtaUpdatingIfNecessary() {}
    public void startOtaUpdatingIfNecessary(int p0) {}
    public void getDownloadableSubscriptionMetadata(int p0, android.telephony.euicc.DownloadableSubscription p1, java.lang.String p2, android.app.PendingIntent p3) {}
    public void setSupportedCountries(boolean p0, java.util.List<java.lang.String> p1) {}
    public java.util.List<java.lang.String> getSupportedCountries(boolean p0) { return null; }
    public boolean isSupportedCountry(java.lang.String p0) { return false; }
    void getDownloadableSubscriptionMetadata(int p0, android.telephony.euicc.DownloadableSubscription p1, boolean p2, java.lang.String p3, android.app.PendingIntent p4) {}
    public void downloadSubscription(int p0, android.telephony.euicc.DownloadableSubscription p1, boolean p2, java.lang.String p3, android.os.Bundle p4, android.app.PendingIntent p5) {}
    android.util.Pair<java.lang.String, java.lang.String> decodeSmdxSubjectAndReasonCode(int p0) { return null; }
    void downloadSubscription(int p0, int p1, android.telephony.euicc.DownloadableSubscription p2, boolean p3, java.lang.String p4, boolean p5, android.os.Bundle p6, android.app.PendingIntent p7) {}
    void downloadSubscriptionPrivilegedCheckMetadata(int p0, int p1, long p2, android.telephony.euicc.DownloadableSubscription p3, boolean p4, boolean p5, java.lang.String p6, android.os.Bundle p7, android.app.PendingIntent p8) {}
    void downloadSubscriptionPrivileged(int p0, int p1, long p2, android.telephony.euicc.DownloadableSubscription p3, boolean p4, boolean p5, java.lang.String p6, android.os.Bundle p7, android.app.PendingIntent p8) {}
    public android.service.euicc.GetEuiccProfileInfoListResult blockingGetEuiccProfileInfoList(int p0) { return null; }
    public void getDefaultDownloadableSubscriptionList(int p0, java.lang.String p1, android.app.PendingIntent p2) {}
    void getDefaultDownloadableSubscriptionList(int p0, boolean p1, java.lang.String p2, android.app.PendingIntent p3) {}
    public android.telephony.euicc.EuiccInfo getEuiccInfo(int p0) { return null; }
    public void deleteSubscription(int p0, int p1, java.lang.String p2, android.app.PendingIntent p3) {}
    void deleteSubscriptionPrivileged(int p0, java.lang.String p1, android.app.PendingIntent p2) {}
    public void switchToSubscription(int p0, int p1, java.lang.String p2, android.app.PendingIntent p3) {}
    public void switchToSubscriptionWithPort(int p0, int p1, int p2, java.lang.String p3, android.app.PendingIntent p4) {}
    void switchToSubscription(int p0, int p1, int p2, boolean p3, java.lang.String p4, android.app.PendingIntent p5, boolean p6) {}
    public int getResolvedPortIndexForDisableSubscription(int p0, java.lang.String p1, boolean p2) { return 0; }
    public int getResolvedPortIndexForSubscriptionSwitch(int p0) { return 0; }
    void switchToSubscriptionPrivileged(int p0, int p1, long p2, int p3, boolean p4, java.lang.String p5, android.app.PendingIntent p6, boolean p7) {}
    void switchToSubscriptionPrivileged(int p0, int p1, long p2, int p3, java.lang.String p4, boolean p5, java.lang.String p6, android.app.PendingIntent p7, boolean p8) {}
    public void updateSubscriptionNickname(int p0, int p1, java.lang.String p2, java.lang.String p3, android.app.PendingIntent p4) {}
    public void eraseSubscriptions(int p0, android.app.PendingIntent p1) {}
    public void eraseSubscriptionsWithOptions(int p0, int p1, android.app.PendingIntent p2) {}
    public void retainSubscriptionsForFactoryReset(int p0, android.app.PendingIntent p1) {}
    public void refreshSubscriptionsAndSendResult(android.app.PendingIntent p0, int p1, android.content.Intent p2) {}
    public void sendResult(android.app.PendingIntent p0, int p1, android.content.Intent p2) {}
    public void addResolutionIntentWithPort(android.content.Intent p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4, com.android.internal.telephony.euicc.EuiccOperation p5, int p6, int p7, boolean p8) {}
    public void addResolutionIntent(android.content.Intent p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4, com.android.internal.telephony.euicc.EuiccOperation p5, int p6, int p7, boolean p8, int p9) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public void sendOtaStatusChangedBroadcast() {}
    public boolean isSimPortAvailable(int p0, int p1, java.lang.String p2) { return false; }
    public boolean hasCarrierPrivilegesForPackageOnAnyPhone(java.lang.String p0) { return false; }
    public boolean isCompatChangeEnabled(java.lang.String p0, long p1) { return false; }

    class DownloadSubscriptionGetMetadataCommandCallback extends com.android.internal.telephony.euicc.EuiccController.GetMetadataCommandCallback {
        DownloadSubscriptionGetMetadataCommandCallback(com.android.internal.telephony.euicc.EuiccController p0, long p1, android.telephony.euicc.DownloadableSubscription p2, boolean p3, java.lang.String p4, boolean p5, android.app.PendingIntent p6, boolean p7, int p8) { super(null, 0L, null, null, null); }
        public void onGetMetadataComplete(int p0, android.service.euicc.GetDownloadableSubscriptionMetadataResult p1) {}
    }

    class GetDefaultListCommandCallback implements com.android.internal.telephony.euicc.EuiccConnector.GetDefaultListCommandCallback {
        final long mCallingToken = 0L;
        final java.lang.String mCallingPackage = null;
        final android.app.PendingIntent mCallbackIntent = null;
        GetDefaultListCommandCallback(com.android.internal.telephony.euicc.EuiccController p0, long p1, java.lang.String p2, android.app.PendingIntent p3) {}
        public void onGetDefaultListComplete(int p0, android.service.euicc.GetDefaultDownloadableSubscriptionListResult p1) {}
        public void onEuiccServiceUnavailable() {}
    }

    class GetMetadataCommandCallback implements com.android.internal.telephony.euicc.EuiccConnector.GetMetadataCommandCallback {
        protected final long mCallingToken = 0L;
        protected final android.telephony.euicc.DownloadableSubscription mSubscription = null;
        protected final java.lang.String mCallingPackage = null;
        protected final android.app.PendingIntent mCallbackIntent = null;
        GetMetadataCommandCallback(com.android.internal.telephony.euicc.EuiccController p0, long p1, android.telephony.euicc.DownloadableSubscription p2, java.lang.String p3, android.app.PendingIntent p4) {}
        public void onGetMetadataComplete(int p0, android.service.euicc.GetDownloadableSubscriptionMetadataResult p1) {}
        public void onEuiccServiceUnavailable() {}
        protected com.android.internal.telephony.euicc.EuiccOperation getOperationForDeactivateSim() { return null; }
    }
}
