package com.android.internal.telephony.euicc;

public class EuiccCardController extends com.android.internal.telephony.euicc.IEuiccCardController.Stub {
    public static com.android.internal.telephony.euicc.EuiccCardController init(android.content.Context p0) { return null; }
    public static com.android.internal.telephony.euicc.EuiccCardController get() { return null; }
    public EuiccCardController(android.content.Context p0, android.os.Handler p1, com.android.internal.telephony.euicc.EuiccController p2, com.android.internal.telephony.uicc.UiccController p3) { super(); }
    public static boolean isBootUp(android.content.Context p0) { return false; }
    public boolean isEmbeddedSlotActivated() { return false; }
    public boolean isEmbeddedCardPresent() { return false; }
    public void getAllProfiles(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetAllProfilesCallback p2) {}
    public void getProfile(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.euicc.IGetProfileCallback p3) {}
    public void getEnabledProfile(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IGetProfileCallback p3) {}
    public void disableProfile(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, com.android.internal.telephony.euicc.IDisableProfileCallback p4) {}
    public void switchToProfile(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4, com.android.internal.telephony.euicc.ISwitchToProfileCallback p5) {}
    public void setNickname(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, com.android.internal.telephony.euicc.ISetNicknameCallback p4) {}
    public void deleteProfile(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.euicc.IDeleteProfileCallback p3) {}
    public void resetMemory(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IResetMemoryCallback p3) {}
    public void getDefaultSmdpAddress(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetDefaultSmdpAddressCallback p2) {}
    public void getSmdsAddress(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetSmdsAddressCallback p2) {}
    public void setDefaultSmdpAddress(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.euicc.ISetDefaultSmdpAddressCallback p3) {}
    public void getRulesAuthTable(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetRulesAuthTableCallback p2) {}
    public void getEuiccChallenge(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetEuiccChallengeCallback p2) {}
    public void getEuiccInfo1(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetEuiccInfo1Callback p2) {}
    public void getEuiccInfo2(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetEuiccInfo2Callback p2) {}
    public void authenticateServer(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3, byte[] p4, byte[] p5, byte[] p6, com.android.internal.telephony.euicc.IAuthenticateServerCallback p7) {}
    public void prepareDownload(java.lang.String p0, java.lang.String p1, byte[] p2, byte[] p3, byte[] p4, byte[] p5, com.android.internal.telephony.euicc.IPrepareDownloadCallback p6) {}
    public void loadBoundProfilePackage(java.lang.String p0, java.lang.String p1, byte[] p2, com.android.internal.telephony.euicc.ILoadBoundProfilePackageCallback p3) {}
    public void cancelSession(java.lang.String p0, java.lang.String p1, byte[] p2, int p3, com.android.internal.telephony.euicc.ICancelSessionCallback p4) {}
    public void listNotifications(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IListNotificationsCallback p3) {}
    public void retrieveNotificationList(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IRetrieveNotificationListCallback p3) {}
    public void retrieveNotification(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IRetrieveNotificationCallback p3) {}
    public void removeNotificationFromList(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IRemoveNotificationFromListCallback p3) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    private class SimSlotStatusChangedBroadcastReceiver extends android.content.BroadcastReceiver {
        public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    }
}
