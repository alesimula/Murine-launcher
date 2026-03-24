package android.service.euicc;

public interface IDownloadSubscriptionCallback extends android.os.IInterface {
    public void onComplete(android.service.euicc.DownloadSubscriptionResult p0) throws android.os.RemoteException;

    public static class Default implements android.service.euicc.IDownloadSubscriptionCallback {
        public Default() {}
        public void onComplete(android.service.euicc.DownloadSubscriptionResult p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.euicc.IDownloadSubscriptionCallback {
        public static final java.lang.String DESCRIPTOR = "android.service.euicc.IDownloadSubscriptionCallback";
        static final int TRANSACTION_onComplete = 1;
        public Stub() { super(); }
        public static android.service.euicc.IDownloadSubscriptionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.euicc.IDownloadSubscriptionCallback p0) { return false; }
        public static android.service.euicc.IDownloadSubscriptionCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.service.euicc.IDownloadSubscriptionCallback {
            private android.os.IBinder mRemote;
            public static android.service.euicc.IDownloadSubscriptionCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onComplete(android.service.euicc.DownloadSubscriptionResult p0) throws android.os.RemoteException {}
        }
    }
}
