package com.android.internal.telephony.euicc;

public interface IEuiccController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.euicc.IEuiccController";
    public void continueOperation(int p0, android.content.Intent p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void getDownloadableSubscriptionMetadata(int p0, android.telephony.euicc.DownloadableSubscription p1, java.lang.String p2, android.app.PendingIntent p3) throws android.os.RemoteException;
    public void getDefaultDownloadableSubscriptionList(int p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException;
    public java.lang.String getEid(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getOtaStatus(int p0) throws android.os.RemoteException;
    public void downloadSubscription(int p0, android.telephony.euicc.DownloadableSubscription p1, boolean p2, java.lang.String p3, android.os.Bundle p4, android.app.PendingIntent p5) throws android.os.RemoteException;
    public android.telephony.euicc.EuiccInfo getEuiccInfo(int p0) throws android.os.RemoteException;
    public void deleteSubscription(int p0, int p1, java.lang.String p2, android.app.PendingIntent p3) throws android.os.RemoteException;
    public void switchToSubscription(int p0, int p1, java.lang.String p2, android.app.PendingIntent p3) throws android.os.RemoteException;
    public void switchToSubscriptionWithPort(int p0, int p1, int p2, java.lang.String p3, android.app.PendingIntent p4) throws android.os.RemoteException;
    public void updateSubscriptionNickname(int p0, int p1, java.lang.String p2, java.lang.String p3, android.app.PendingIntent p4) throws android.os.RemoteException;
    public void eraseSubscriptions(int p0, android.app.PendingIntent p1) throws android.os.RemoteException;
    public void eraseSubscriptionsWithOptions(int p0, int p1, android.app.PendingIntent p2) throws android.os.RemoteException;
    public void retainSubscriptionsForFactoryReset(int p0, android.app.PendingIntent p1) throws android.os.RemoteException;
    public void setSupportedCountries(boolean p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getSupportedCountries(boolean p0) throws android.os.RemoteException;
    public boolean isSupportedCountry(java.lang.String p0) throws android.os.RemoteException;
    public boolean isSimPortAvailable(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean hasCarrierPrivilegesForPackageOnAnyPhone(java.lang.String p0) throws android.os.RemoteException;
    public boolean isCompatChangeEnabled(java.lang.String p0, long p1) throws android.os.RemoteException;
    public void setPsimConversionSupportedCarriers(int[] p0) throws android.os.RemoteException;
    public boolean isPsimConversionSupported(int p0) throws android.os.RemoteException;
    public long getAvailableMemoryInBytes(int p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.euicc.IEuiccController {
        public Default() {}
        public void continueOperation(int p0, android.content.Intent p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void getDownloadableSubscriptionMetadata(int p0, android.telephony.euicc.DownloadableSubscription p1, java.lang.String p2, android.app.PendingIntent p3) throws android.os.RemoteException {}
        public void getDefaultDownloadableSubscriptionList(int p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException {}
        public java.lang.String getEid(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int getOtaStatus(int p0) throws android.os.RemoteException { return 0; }
        public void downloadSubscription(int p0, android.telephony.euicc.DownloadableSubscription p1, boolean p2, java.lang.String p3, android.os.Bundle p4, android.app.PendingIntent p5) throws android.os.RemoteException {}
        public android.telephony.euicc.EuiccInfo getEuiccInfo(int p0) throws android.os.RemoteException { return null; }
        public void deleteSubscription(int p0, int p1, java.lang.String p2, android.app.PendingIntent p3) throws android.os.RemoteException {}
        public void switchToSubscription(int p0, int p1, java.lang.String p2, android.app.PendingIntent p3) throws android.os.RemoteException {}
        public void switchToSubscriptionWithPort(int p0, int p1, int p2, java.lang.String p3, android.app.PendingIntent p4) throws android.os.RemoteException {}
        public void updateSubscriptionNickname(int p0, int p1, java.lang.String p2, java.lang.String p3, android.app.PendingIntent p4) throws android.os.RemoteException {}
        public void eraseSubscriptions(int p0, android.app.PendingIntent p1) throws android.os.RemoteException {}
        public void eraseSubscriptionsWithOptions(int p0, int p1, android.app.PendingIntent p2) throws android.os.RemoteException {}
        public void retainSubscriptionsForFactoryReset(int p0, android.app.PendingIntent p1) throws android.os.RemoteException {}
        public void setSupportedCountries(boolean p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getSupportedCountries(boolean p0) throws android.os.RemoteException { return null; }
        public boolean isSupportedCountry(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isSimPortAvailable(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean hasCarrierPrivilegesForPackageOnAnyPhone(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isCompatChangeEnabled(java.lang.String p0, long p1) throws android.os.RemoteException { return false; }
        public void setPsimConversionSupportedCarriers(int[] p0) throws android.os.RemoteException {}
        public boolean isPsimConversionSupported(int p0) throws android.os.RemoteException { return false; }
        public long getAvailableMemoryInBytes(int p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.euicc.IEuiccController {
        static final int TRANSACTION_continueOperation = 1;
        static final int TRANSACTION_getDownloadableSubscriptionMetadata = 2;
        static final int TRANSACTION_getDefaultDownloadableSubscriptionList = 3;
        static final int TRANSACTION_getEid = 4;
        static final int TRANSACTION_getOtaStatus = 5;
        static final int TRANSACTION_downloadSubscription = 6;
        static final int TRANSACTION_getEuiccInfo = 7;
        static final int TRANSACTION_deleteSubscription = 8;
        static final int TRANSACTION_switchToSubscription = 9;
        static final int TRANSACTION_switchToSubscriptionWithPort = 10;
        static final int TRANSACTION_updateSubscriptionNickname = 11;
        static final int TRANSACTION_eraseSubscriptions = 12;
        static final int TRANSACTION_eraseSubscriptionsWithOptions = 13;
        static final int TRANSACTION_retainSubscriptionsForFactoryReset = 14;
        static final int TRANSACTION_setSupportedCountries = 15;
        static final int TRANSACTION_getSupportedCountries = 16;
        static final int TRANSACTION_isSupportedCountry = 17;
        static final int TRANSACTION_isSimPortAvailable = 18;
        static final int TRANSACTION_hasCarrierPrivilegesForPackageOnAnyPhone = 19;
        static final int TRANSACTION_isCompatChangeEnabled = 20;
        static final int TRANSACTION_setPsimConversionSupportedCarriers = 21;
        static final int TRANSACTION_isPsimConversionSupported = 22;
        static final int TRANSACTION_getAvailableMemoryInBytes = 23;
        public Stub() { super(); }
        public static com.android.internal.telephony.euicc.IEuiccController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telephony.euicc.IEuiccController {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void continueOperation(int p0, android.content.Intent p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void getDownloadableSubscriptionMetadata(int p0, android.telephony.euicc.DownloadableSubscription p1, java.lang.String p2, android.app.PendingIntent p3) throws android.os.RemoteException {}
            public void getDefaultDownloadableSubscriptionList(int p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException {}
            public java.lang.String getEid(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int getOtaStatus(int p0) throws android.os.RemoteException { return 0; }
            public void downloadSubscription(int p0, android.telephony.euicc.DownloadableSubscription p1, boolean p2, java.lang.String p3, android.os.Bundle p4, android.app.PendingIntent p5) throws android.os.RemoteException {}
            public android.telephony.euicc.EuiccInfo getEuiccInfo(int p0) throws android.os.RemoteException { return null; }
            public void deleteSubscription(int p0, int p1, java.lang.String p2, android.app.PendingIntent p3) throws android.os.RemoteException {}
            public void switchToSubscription(int p0, int p1, java.lang.String p2, android.app.PendingIntent p3) throws android.os.RemoteException {}
            public void switchToSubscriptionWithPort(int p0, int p1, int p2, java.lang.String p3, android.app.PendingIntent p4) throws android.os.RemoteException {}
            public void updateSubscriptionNickname(int p0, int p1, java.lang.String p2, java.lang.String p3, android.app.PendingIntent p4) throws android.os.RemoteException {}
            public void eraseSubscriptions(int p0, android.app.PendingIntent p1) throws android.os.RemoteException {}
            public void eraseSubscriptionsWithOptions(int p0, int p1, android.app.PendingIntent p2) throws android.os.RemoteException {}
            public void retainSubscriptionsForFactoryReset(int p0, android.app.PendingIntent p1) throws android.os.RemoteException {}
            public void setSupportedCountries(boolean p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getSupportedCountries(boolean p0) throws android.os.RemoteException { return null; }
            public boolean isSupportedCountry(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isSimPortAvailable(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean hasCarrierPrivilegesForPackageOnAnyPhone(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isCompatChangeEnabled(java.lang.String p0, long p1) throws android.os.RemoteException { return false; }
            public void setPsimConversionSupportedCarriers(int[] p0) throws android.os.RemoteException {}
            public boolean isPsimConversionSupported(int p0) throws android.os.RemoteException { return false; }
            public long getAvailableMemoryInBytes(int p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
        }
    }
}
