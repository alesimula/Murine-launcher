package com.android.internal.telephony.euicc;

public interface IEuiccCardController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.euicc.IEuiccCardController";
    public void getAllProfiles(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetAllProfilesCallback p2) throws android.os.RemoteException;
    public void getProfile(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.euicc.IGetProfileCallback p3) throws android.os.RemoteException;
    public void getEnabledProfile(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IGetProfileCallback p3) throws android.os.RemoteException;
    public void disableProfile(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, com.android.internal.telephony.euicc.IDisableProfileCallback p4) throws android.os.RemoteException;
    public void switchToProfile(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4, com.android.internal.telephony.euicc.ISwitchToProfileCallback p5) throws android.os.RemoteException;
    public void setNickname(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, com.android.internal.telephony.euicc.ISetNicknameCallback p4) throws android.os.RemoteException;
    public void deleteProfile(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.euicc.IDeleteProfileCallback p3) throws android.os.RemoteException;
    public void resetMemory(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IResetMemoryCallback p3) throws android.os.RemoteException;
    public void getDefaultSmdpAddress(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetDefaultSmdpAddressCallback p2) throws android.os.RemoteException;
    public void getSmdsAddress(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetSmdsAddressCallback p2) throws android.os.RemoteException;
    public void setDefaultSmdpAddress(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.euicc.ISetDefaultSmdpAddressCallback p3) throws android.os.RemoteException;
    public void getRulesAuthTable(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetRulesAuthTableCallback p2) throws android.os.RemoteException;
    public void getEuiccChallenge(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetEuiccChallengeCallback p2) throws android.os.RemoteException;
    public void getEuiccInfo1(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetEuiccInfo1Callback p2) throws android.os.RemoteException;
    public void getEuiccInfo2(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetEuiccInfo2Callback p2) throws android.os.RemoteException;
    public void authenticateServer(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3, byte[] p4, byte[] p5, byte[] p6, com.android.internal.telephony.euicc.IAuthenticateServerCallback p7) throws android.os.RemoteException;
    public void prepareDownload(java.lang.String p0, java.lang.String p1, byte[] p2, byte[] p3, byte[] p4, byte[] p5, com.android.internal.telephony.euicc.IPrepareDownloadCallback p6) throws android.os.RemoteException;
    public void loadBoundProfilePackage(java.lang.String p0, java.lang.String p1, byte[] p2, com.android.internal.telephony.euicc.ILoadBoundProfilePackageCallback p3) throws android.os.RemoteException;
    public void cancelSession(java.lang.String p0, java.lang.String p1, byte[] p2, int p3, com.android.internal.telephony.euicc.ICancelSessionCallback p4) throws android.os.RemoteException;
    public void listNotifications(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IListNotificationsCallback p3) throws android.os.RemoteException;
    public void retrieveNotificationList(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IRetrieveNotificationListCallback p3) throws android.os.RemoteException;
    public void retrieveNotification(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IRetrieveNotificationCallback p3) throws android.os.RemoteException;
    public void removeNotificationFromList(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IRemoveNotificationFromListCallback p3) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.euicc.IEuiccCardController {
        public Default() {}
        public void getAllProfiles(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetAllProfilesCallback p2) throws android.os.RemoteException {}
        public void getProfile(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.euicc.IGetProfileCallback p3) throws android.os.RemoteException {}
        public void getEnabledProfile(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IGetProfileCallback p3) throws android.os.RemoteException {}
        public void disableProfile(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, com.android.internal.telephony.euicc.IDisableProfileCallback p4) throws android.os.RemoteException {}
        public void switchToProfile(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4, com.android.internal.telephony.euicc.ISwitchToProfileCallback p5) throws android.os.RemoteException {}
        public void setNickname(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, com.android.internal.telephony.euicc.ISetNicknameCallback p4) throws android.os.RemoteException {}
        public void deleteProfile(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.euicc.IDeleteProfileCallback p3) throws android.os.RemoteException {}
        public void resetMemory(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IResetMemoryCallback p3) throws android.os.RemoteException {}
        public void getDefaultSmdpAddress(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetDefaultSmdpAddressCallback p2) throws android.os.RemoteException {}
        public void getSmdsAddress(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetSmdsAddressCallback p2) throws android.os.RemoteException {}
        public void setDefaultSmdpAddress(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.euicc.ISetDefaultSmdpAddressCallback p3) throws android.os.RemoteException {}
        public void getRulesAuthTable(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetRulesAuthTableCallback p2) throws android.os.RemoteException {}
        public void getEuiccChallenge(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetEuiccChallengeCallback p2) throws android.os.RemoteException {}
        public void getEuiccInfo1(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetEuiccInfo1Callback p2) throws android.os.RemoteException {}
        public void getEuiccInfo2(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetEuiccInfo2Callback p2) throws android.os.RemoteException {}
        public void authenticateServer(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3, byte[] p4, byte[] p5, byte[] p6, com.android.internal.telephony.euicc.IAuthenticateServerCallback p7) throws android.os.RemoteException {}
        public void prepareDownload(java.lang.String p0, java.lang.String p1, byte[] p2, byte[] p3, byte[] p4, byte[] p5, com.android.internal.telephony.euicc.IPrepareDownloadCallback p6) throws android.os.RemoteException {}
        public void loadBoundProfilePackage(java.lang.String p0, java.lang.String p1, byte[] p2, com.android.internal.telephony.euicc.ILoadBoundProfilePackageCallback p3) throws android.os.RemoteException {}
        public void cancelSession(java.lang.String p0, java.lang.String p1, byte[] p2, int p3, com.android.internal.telephony.euicc.ICancelSessionCallback p4) throws android.os.RemoteException {}
        public void listNotifications(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IListNotificationsCallback p3) throws android.os.RemoteException {}
        public void retrieveNotificationList(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IRetrieveNotificationListCallback p3) throws android.os.RemoteException {}
        public void retrieveNotification(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IRetrieveNotificationCallback p3) throws android.os.RemoteException {}
        public void removeNotificationFromList(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IRemoveNotificationFromListCallback p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.euicc.IEuiccCardController {
        static final int TRANSACTION_getAllProfiles = 1;
        static final int TRANSACTION_getProfile = 2;
        static final int TRANSACTION_getEnabledProfile = 3;
        static final int TRANSACTION_disableProfile = 4;
        static final int TRANSACTION_switchToProfile = 5;
        static final int TRANSACTION_setNickname = 6;
        static final int TRANSACTION_deleteProfile = 7;
        static final int TRANSACTION_resetMemory = 8;
        static final int TRANSACTION_getDefaultSmdpAddress = 9;
        static final int TRANSACTION_getSmdsAddress = 10;
        static final int TRANSACTION_setDefaultSmdpAddress = 11;
        static final int TRANSACTION_getRulesAuthTable = 12;
        static final int TRANSACTION_getEuiccChallenge = 13;
        static final int TRANSACTION_getEuiccInfo1 = 14;
        static final int TRANSACTION_getEuiccInfo2 = 15;
        static final int TRANSACTION_authenticateServer = 16;
        static final int TRANSACTION_prepareDownload = 17;
        static final int TRANSACTION_loadBoundProfilePackage = 18;
        static final int TRANSACTION_cancelSession = 19;
        static final int TRANSACTION_listNotifications = 20;
        static final int TRANSACTION_retrieveNotificationList = 21;
        static final int TRANSACTION_retrieveNotification = 22;
        static final int TRANSACTION_removeNotificationFromList = 23;
        public Stub() { super(); }
        public static com.android.internal.telephony.euicc.IEuiccCardController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telephony.euicc.IEuiccCardController {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getAllProfiles(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetAllProfilesCallback p2) throws android.os.RemoteException {}
            public void getProfile(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.euicc.IGetProfileCallback p3) throws android.os.RemoteException {}
            public void getEnabledProfile(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IGetProfileCallback p3) throws android.os.RemoteException {}
            public void disableProfile(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, com.android.internal.telephony.euicc.IDisableProfileCallback p4) throws android.os.RemoteException {}
            public void switchToProfile(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4, com.android.internal.telephony.euicc.ISwitchToProfileCallback p5) throws android.os.RemoteException {}
            public void setNickname(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, com.android.internal.telephony.euicc.ISetNicknameCallback p4) throws android.os.RemoteException {}
            public void deleteProfile(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.euicc.IDeleteProfileCallback p3) throws android.os.RemoteException {}
            public void resetMemory(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IResetMemoryCallback p3) throws android.os.RemoteException {}
            public void getDefaultSmdpAddress(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetDefaultSmdpAddressCallback p2) throws android.os.RemoteException {}
            public void getSmdsAddress(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetSmdsAddressCallback p2) throws android.os.RemoteException {}
            public void setDefaultSmdpAddress(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.euicc.ISetDefaultSmdpAddressCallback p3) throws android.os.RemoteException {}
            public void getRulesAuthTable(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetRulesAuthTableCallback p2) throws android.os.RemoteException {}
            public void getEuiccChallenge(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetEuiccChallengeCallback p2) throws android.os.RemoteException {}
            public void getEuiccInfo1(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetEuiccInfo1Callback p2) throws android.os.RemoteException {}
            public void getEuiccInfo2(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.euicc.IGetEuiccInfo2Callback p2) throws android.os.RemoteException {}
            public void authenticateServer(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3, byte[] p4, byte[] p5, byte[] p6, com.android.internal.telephony.euicc.IAuthenticateServerCallback p7) throws android.os.RemoteException {}
            public void prepareDownload(java.lang.String p0, java.lang.String p1, byte[] p2, byte[] p3, byte[] p4, byte[] p5, com.android.internal.telephony.euicc.IPrepareDownloadCallback p6) throws android.os.RemoteException {}
            public void loadBoundProfilePackage(java.lang.String p0, java.lang.String p1, byte[] p2, com.android.internal.telephony.euicc.ILoadBoundProfilePackageCallback p3) throws android.os.RemoteException {}
            public void cancelSession(java.lang.String p0, java.lang.String p1, byte[] p2, int p3, com.android.internal.telephony.euicc.ICancelSessionCallback p4) throws android.os.RemoteException {}
            public void listNotifications(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IListNotificationsCallback p3) throws android.os.RemoteException {}
            public void retrieveNotificationList(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IRetrieveNotificationListCallback p3) throws android.os.RemoteException {}
            public void retrieveNotification(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IRetrieveNotificationCallback p3) throws android.os.RemoteException {}
            public void removeNotificationFromList(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.telephony.euicc.IRemoveNotificationFromListCallback p3) throws android.os.RemoteException {}
        }
    }
}
