package com.android.internal.telephony.euicc;

public class EuiccConnector extends com.android.internal.telephony.StateMachine implements android.content.ServiceConnection {
    static final int BIND_TIMEOUT_MILLIS = 30000;
    static final int LINGER_TIMEOUT_MILLIS = 60000;
    public com.android.internal.telephony.euicc.EuiccConnector.UnavailableState mUnavailableState;
    public com.android.internal.telephony.euicc.EuiccConnector.AvailableState mAvailableState;
    public com.android.internal.telephony.euicc.EuiccConnector.BindingState mBindingState;
    public com.android.internal.telephony.euicc.EuiccConnector.DisconnectedState mDisconnectedState;
    public com.android.internal.telephony.euicc.EuiccConnector.ConnectedState mConnectedState;
    public static android.content.pm.ActivityInfo findBestActivity(android.content.pm.PackageManager p0, android.content.Intent p1) { return null; }
    public static android.content.pm.ComponentInfo findBestComponent(android.content.pm.PackageManager p0) { return null; }
    EuiccConnector(android.content.Context p0) { super((java.lang.String)null); }
    public EuiccConnector(android.content.Context p0, android.os.Looper p1) { super((java.lang.String)null); }
    public void onHalting() {}
    public void getEid(int p0, com.android.internal.telephony.euicc.EuiccConnector.GetEidCommandCallback p1) {}
    public void getOtaStatus(int p0, com.android.internal.telephony.euicc.EuiccConnector.GetOtaStatusCommandCallback p1) {}
    public void startOtaIfNecessary(int p0, com.android.internal.telephony.euicc.EuiccConnector.OtaStatusChangedCallback p1) {}
    public void getDownloadableSubscriptionMetadata(int p0, int p1, android.telephony.euicc.DownloadableSubscription p2, boolean p3, boolean p4, com.android.internal.telephony.euicc.EuiccConnector.GetMetadataCommandCallback p5) {}
    public void downloadSubscription(int p0, int p1, android.telephony.euicc.DownloadableSubscription p2, boolean p3, boolean p4, android.os.Bundle p5, com.android.internal.telephony.euicc.EuiccConnector.DownloadCommandCallback p6) {}
    void getEuiccProfileInfoList(int p0, com.android.internal.telephony.euicc.EuiccConnector.GetEuiccProfileInfoListCommandCallback p1) {}
    public void getDefaultDownloadableSubscriptionList(int p0, boolean p1, com.android.internal.telephony.euicc.EuiccConnector.GetDefaultListCommandCallback p2) {}
    public void getEuiccInfo(int p0, com.android.internal.telephony.euicc.EuiccConnector.GetEuiccInfoCommandCallback p1) {}
    public void deleteSubscription(int p0, java.lang.String p1, com.android.internal.telephony.euicc.EuiccConnector.DeleteCommandCallback p2) {}
    public void switchToSubscription(int p0, int p1, java.lang.String p2, boolean p3, com.android.internal.telephony.euicc.EuiccConnector.SwitchCommandCallback p4, boolean p5) {}
    public void updateSubscriptionNickname(int p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.euicc.EuiccConnector.UpdateNicknameCommandCallback p3) {}
    public void eraseSubscriptions(int p0, com.android.internal.telephony.euicc.EuiccConnector.EraseCommandCallback p1) {}
    public void eraseSubscriptionsWithOptions(int p0, int p1, com.android.internal.telephony.euicc.EuiccConnector.EraseCommandCallback p2) {}
    public void retainSubscriptions(int p0, com.android.internal.telephony.euicc.EuiccConnector.RetainSubscriptionsCommandCallback p1) {}
    public void dumpEuiccService(com.android.internal.telephony.euicc.EuiccConnector.DumpEuiccServiceCommandCallback p0) {}
    public final android.service.euicc.IEuiccService getBinder() { return null; }
    public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
    public void onServiceDisconnected(android.content.ComponentName p0) {}
    protected void unhandledMessage(android.os.Message p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    private class AvailableState extends com.android.internal.telephony.State {
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    public static interface BaseEuiccCommandCallback {
        public void onEuiccServiceUnavailable();
    }

    private class BindingState extends com.android.internal.telephony.State {
        public void enter() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    private class ConnectedState extends com.android.internal.telephony.State {
        public void enter() {}
        public boolean processMessage(android.os.Message p0) { return false; }
        public void exit() {}
    }

    public static interface DeleteCommandCallback extends com.android.internal.telephony.euicc.EuiccConnector.BaseEuiccCommandCallback {
        public void onDeleteComplete(int p0);
    }

    static class DeleteRequest {
        java.lang.String mIccid;
        com.android.internal.telephony.euicc.EuiccConnector.DeleteCommandCallback mCallback;
        DeleteRequest() {}
    }

    private class DisconnectedState extends com.android.internal.telephony.State {
        public void enter() {}
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    public static interface DownloadCommandCallback extends com.android.internal.telephony.euicc.EuiccConnector.BaseEuiccCommandCallback {
        public void onDownloadComplete(android.service.euicc.DownloadSubscriptionResult p0);
    }

    static class DownloadRequest {
        android.telephony.euicc.DownloadableSubscription mSubscription;
        boolean mSwitchAfterDownload;
        boolean mForceDeactivateSim;
        com.android.internal.telephony.euicc.EuiccConnector.DownloadCommandCallback mCallback;
        int mPortIndex;
        android.os.Bundle mResolvedBundle;
        DownloadRequest() {}
    }

    public static interface DumpEuiccServiceCommandCallback extends com.android.internal.telephony.euicc.EuiccConnector.BaseEuiccCommandCallback {
        public void onDumpEuiccServiceComplete(java.lang.String p0);
    }

    public static interface EraseCommandCallback extends com.android.internal.telephony.euicc.EuiccConnector.BaseEuiccCommandCallback {
        public void onEraseComplete(int p0);
    }

    private class EuiccPackageMonitor extends com.android.internal.telephony.PackageChangeReceiver {
        public void onPackageAdded(java.lang.String p0) {}
        public void onPackageRemoved(java.lang.String p0) {}
        public void onPackageUpdateFinished(java.lang.String p0) {}
        public void onPackageModified(java.lang.String p0) {}
        public void onHandleForceStop(java.lang.String[] p0, boolean p1) {}
    }

    public static interface GetDefaultListCommandCallback extends com.android.internal.telephony.euicc.EuiccConnector.BaseEuiccCommandCallback {
        public void onGetDefaultListComplete(int p0, android.service.euicc.GetDefaultDownloadableSubscriptionListResult p1);
    }

    static class GetDefaultListRequest {
        boolean mForceDeactivateSim;
        com.android.internal.telephony.euicc.EuiccConnector.GetDefaultListCommandCallback mCallback;
        GetDefaultListRequest() {}
    }

    public static interface GetEidCommandCallback extends com.android.internal.telephony.euicc.EuiccConnector.BaseEuiccCommandCallback {
        public void onGetEidComplete(java.lang.String p0);
    }

    public static interface GetEuiccInfoCommandCallback extends com.android.internal.telephony.euicc.EuiccConnector.BaseEuiccCommandCallback {
        public void onGetEuiccInfoComplete(android.telephony.euicc.EuiccInfo p0);
    }

    static interface GetEuiccProfileInfoListCommandCallback extends com.android.internal.telephony.euicc.EuiccConnector.BaseEuiccCommandCallback {
        public void onListComplete(android.service.euicc.GetEuiccProfileInfoListResult p0);
    }

    public static interface GetMetadataCommandCallback extends com.android.internal.telephony.euicc.EuiccConnector.BaseEuiccCommandCallback {
        public void onGetMetadataComplete(int p0, android.service.euicc.GetDownloadableSubscriptionMetadataResult p1);
    }

    static class GetMetadataRequest {
        android.telephony.euicc.DownloadableSubscription mSubscription;
        boolean mForceDeactivateSim;
        boolean mSwitchAfterDownload;
        int mPortIndex;
        com.android.internal.telephony.euicc.EuiccConnector.GetMetadataCommandCallback mCallback;
        GetMetadataRequest() {}
    }

    public static interface GetOtaStatusCommandCallback extends com.android.internal.telephony.euicc.EuiccConnector.BaseEuiccCommandCallback {
        public void onGetOtaStatusComplete(int p0);
    }

    public static interface OtaStatusChangedCallback extends com.android.internal.telephony.euicc.EuiccConnector.BaseEuiccCommandCallback {
        public void onOtaStatusChanged(int p0);
    }

    public static interface RetainSubscriptionsCommandCallback extends com.android.internal.telephony.euicc.EuiccConnector.BaseEuiccCommandCallback {
        public void onRetainSubscriptionsComplete(int p0);
    }

    public static interface SwitchCommandCallback extends com.android.internal.telephony.euicc.EuiccConnector.BaseEuiccCommandCallback {
        public void onSwitchComplete(int p0);
    }

    static class SwitchRequest {
        java.lang.String mIccid;
        boolean mForceDeactivateSim;
        com.android.internal.telephony.euicc.EuiccConnector.SwitchCommandCallback mCallback;
        boolean mUsePortIndex;
        SwitchRequest() {}
    }

    private class UnavailableState extends com.android.internal.telephony.State {
        public boolean processMessage(android.os.Message p0) { return false; }
    }

    public static interface UpdateNicknameCommandCallback extends com.android.internal.telephony.euicc.EuiccConnector.BaseEuiccCommandCallback {
        public void onUpdateNicknameComplete(int p0);
    }

    static class UpdateNicknameRequest {
        java.lang.String mIccid;
        java.lang.String mNickname;
        com.android.internal.telephony.euicc.EuiccConnector.UpdateNicknameCommandCallback mCallback;
        UpdateNicknameRequest() {}
    }
}
