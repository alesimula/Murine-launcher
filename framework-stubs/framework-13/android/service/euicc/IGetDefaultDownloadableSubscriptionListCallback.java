package android.service.euicc;

public interface IGetDefaultDownloadableSubscriptionListCallback extends android.os.IInterface {
    public void onComplete(android.service.euicc.GetDefaultDownloadableSubscriptionListResult p0) throws android.os.RemoteException;

    public static class Default implements android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback {
        public Default() {}
        public void onComplete(android.service.euicc.GetDefaultDownloadableSubscriptionListResult p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback {
        public static final java.lang.String DESCRIPTOR = "android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback";
        static final int TRANSACTION_onComplete = 1;
        public Stub() { super(); }
        public static android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.euicc.IGetDefaultDownloadableSubscriptionListCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onComplete(android.service.euicc.GetDefaultDownloadableSubscriptionListResult p0) throws android.os.RemoteException {}
        }
    }
}
