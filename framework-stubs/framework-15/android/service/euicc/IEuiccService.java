package android.service.euicc;

public interface IEuiccService extends android.os.IInterface {
    public void downloadSubscription(int p0, int p1, android.telephony.euicc.DownloadableSubscription p2, boolean p3, boolean p4, android.os.Bundle p5, android.service.euicc.IDownloadSubscriptionCallback p6) throws android.os.RemoteException;
    public void getDownloadableSubscriptionMetadata(int p0, int p1, android.telephony.euicc.DownloadableSubscription p2, boolean p3, boolean p4, android.service.euicc.IGetDownloadableSubscriptionMetadataCallback p5) throws android.os.RemoteException;
    public void getEid(int p0, android.service.euicc.IGetEidCallback p1) throws android.os.RemoteException;
    public void getOtaStatus(int p0, android.service.euicc.IGetOtaStatusCallback p1) throws android.os.RemoteException;
    public void startOtaIfNecessary(int p0, android.service.euicc.IOtaStatusChangedCallback p1) throws android.os.RemoteException;
    public void getEuiccProfileInfoList(int p0, android.service.euicc.IGetEuiccProfileInfoListCallback p1) throws android.os.RemoteException;
    public void getDefaultDownloadableSubscriptionList(int p0, boolean p1, android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback p2) throws android.os.RemoteException;
    public void getEuiccInfo(int p0, android.service.euicc.IGetEuiccInfoCallback p1) throws android.os.RemoteException;
    public void deleteSubscription(int p0, java.lang.String p1, android.service.euicc.IDeleteSubscriptionCallback p2) throws android.os.RemoteException;
    public void switchToSubscription(int p0, int p1, java.lang.String p2, boolean p3, android.service.euicc.ISwitchToSubscriptionCallback p4, boolean p5) throws android.os.RemoteException;
    public void updateSubscriptionNickname(int p0, java.lang.String p1, java.lang.String p2, android.service.euicc.IUpdateSubscriptionNicknameCallback p3) throws android.os.RemoteException;
    public void eraseSubscriptions(int p0, android.service.euicc.IEraseSubscriptionsCallback p1) throws android.os.RemoteException;
    public void eraseSubscriptionsWithOptions(int p0, int p1, android.service.euicc.IEraseSubscriptionsCallback p2) throws android.os.RemoteException;
    public void retainSubscriptionsForFactoryReset(int p0, android.service.euicc.IRetainSubscriptionsForFactoryResetCallback p1) throws android.os.RemoteException;
    public void dump(android.service.euicc.IEuiccServiceDumpResultCallback p0) throws android.os.RemoteException;
    public void getAvailableMemoryInBytes(int p0, android.service.euicc.IGetAvailableMemoryInBytesCallback p1) throws android.os.RemoteException;

    public static class Default implements android.service.euicc.IEuiccService {
        public Default() {}
        public void downloadSubscription(int p0, int p1, android.telephony.euicc.DownloadableSubscription p2, boolean p3, boolean p4, android.os.Bundle p5, android.service.euicc.IDownloadSubscriptionCallback p6) throws android.os.RemoteException {}
        public void getDownloadableSubscriptionMetadata(int p0, int p1, android.telephony.euicc.DownloadableSubscription p2, boolean p3, boolean p4, android.service.euicc.IGetDownloadableSubscriptionMetadataCallback p5) throws android.os.RemoteException {}
        public void getEid(int p0, android.service.euicc.IGetEidCallback p1) throws android.os.RemoteException {}
        public void getOtaStatus(int p0, android.service.euicc.IGetOtaStatusCallback p1) throws android.os.RemoteException {}
        public void startOtaIfNecessary(int p0, android.service.euicc.IOtaStatusChangedCallback p1) throws android.os.RemoteException {}
        public void getEuiccProfileInfoList(int p0, android.service.euicc.IGetEuiccProfileInfoListCallback p1) throws android.os.RemoteException {}
        public void getDefaultDownloadableSubscriptionList(int p0, boolean p1, android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback p2) throws android.os.RemoteException {}
        public void getEuiccInfo(int p0, android.service.euicc.IGetEuiccInfoCallback p1) throws android.os.RemoteException {}
        public void deleteSubscription(int p0, java.lang.String p1, android.service.euicc.IDeleteSubscriptionCallback p2) throws android.os.RemoteException {}
        public void switchToSubscription(int p0, int p1, java.lang.String p2, boolean p3, android.service.euicc.ISwitchToSubscriptionCallback p4, boolean p5) throws android.os.RemoteException {}
        public void updateSubscriptionNickname(int p0, java.lang.String p1, java.lang.String p2, android.service.euicc.IUpdateSubscriptionNicknameCallback p3) throws android.os.RemoteException {}
        public void eraseSubscriptions(int p0, android.service.euicc.IEraseSubscriptionsCallback p1) throws android.os.RemoteException {}
        public void eraseSubscriptionsWithOptions(int p0, int p1, android.service.euicc.IEraseSubscriptionsCallback p2) throws android.os.RemoteException {}
        public void retainSubscriptionsForFactoryReset(int p0, android.service.euicc.IRetainSubscriptionsForFactoryResetCallback p1) throws android.os.RemoteException {}
        public void dump(android.service.euicc.IEuiccServiceDumpResultCallback p0) throws android.os.RemoteException {}
        public void getAvailableMemoryInBytes(int p0, android.service.euicc.IGetAvailableMemoryInBytesCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.euicc.IEuiccService {
        public static final java.lang.String DESCRIPTOR = "android.service.euicc.IEuiccService";
        static final int TRANSACTION_downloadSubscription = 1;
        static final int TRANSACTION_getDownloadableSubscriptionMetadata = 2;
        static final int TRANSACTION_getEid = 3;
        static final int TRANSACTION_getOtaStatus = 4;
        static final int TRANSACTION_startOtaIfNecessary = 5;
        static final int TRANSACTION_getEuiccProfileInfoList = 6;
        static final int TRANSACTION_getDefaultDownloadableSubscriptionList = 7;
        static final int TRANSACTION_getEuiccInfo = 8;
        static final int TRANSACTION_deleteSubscription = 9;
        static final int TRANSACTION_switchToSubscription = 10;
        static final int TRANSACTION_updateSubscriptionNickname = 11;
        static final int TRANSACTION_eraseSubscriptions = 12;
        static final int TRANSACTION_eraseSubscriptionsWithOptions = 13;
        static final int TRANSACTION_retainSubscriptionsForFactoryReset = 14;
        static final int TRANSACTION_dump = 15;
        static final int TRANSACTION_getAvailableMemoryInBytes = 16;
        public Stub() { super(); }
        public static android.service.euicc.IEuiccService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.euicc.IEuiccService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void downloadSubscription(int p0, int p1, android.telephony.euicc.DownloadableSubscription p2, boolean p3, boolean p4, android.os.Bundle p5, android.service.euicc.IDownloadSubscriptionCallback p6) throws android.os.RemoteException {}
            public void getDownloadableSubscriptionMetadata(int p0, int p1, android.telephony.euicc.DownloadableSubscription p2, boolean p3, boolean p4, android.service.euicc.IGetDownloadableSubscriptionMetadataCallback p5) throws android.os.RemoteException {}
            public void getEid(int p0, android.service.euicc.IGetEidCallback p1) throws android.os.RemoteException {}
            public void getOtaStatus(int p0, android.service.euicc.IGetOtaStatusCallback p1) throws android.os.RemoteException {}
            public void startOtaIfNecessary(int p0, android.service.euicc.IOtaStatusChangedCallback p1) throws android.os.RemoteException {}
            public void getEuiccProfileInfoList(int p0, android.service.euicc.IGetEuiccProfileInfoListCallback p1) throws android.os.RemoteException {}
            public void getDefaultDownloadableSubscriptionList(int p0, boolean p1, android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback p2) throws android.os.RemoteException {}
            public void getEuiccInfo(int p0, android.service.euicc.IGetEuiccInfoCallback p1) throws android.os.RemoteException {}
            public void deleteSubscription(int p0, java.lang.String p1, android.service.euicc.IDeleteSubscriptionCallback p2) throws android.os.RemoteException {}
            public void switchToSubscription(int p0, int p1, java.lang.String p2, boolean p3, android.service.euicc.ISwitchToSubscriptionCallback p4, boolean p5) throws android.os.RemoteException {}
            public void updateSubscriptionNickname(int p0, java.lang.String p1, java.lang.String p2, android.service.euicc.IUpdateSubscriptionNicknameCallback p3) throws android.os.RemoteException {}
            public void eraseSubscriptions(int p0, android.service.euicc.IEraseSubscriptionsCallback p1) throws android.os.RemoteException {}
            public void eraseSubscriptionsWithOptions(int p0, int p1, android.service.euicc.IEraseSubscriptionsCallback p2) throws android.os.RemoteException {}
            public void retainSubscriptionsForFactoryReset(int p0, android.service.euicc.IRetainSubscriptionsForFactoryResetCallback p1) throws android.os.RemoteException {}
            public void dump(android.service.euicc.IEuiccServiceDumpResultCallback p0) throws android.os.RemoteException {}
            public void getAvailableMemoryInBytes(int p0, android.service.euicc.IGetAvailableMemoryInBytesCallback p1) throws android.os.RemoteException {}
        }
    }
}
