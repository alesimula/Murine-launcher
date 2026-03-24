package android.media.tv.ad;

public interface ITvAdManagerCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.ad.ITvAdManagerCallback";
    public void onAdServiceAdded(java.lang.String p0) throws android.os.RemoteException;
    public void onAdServiceRemoved(java.lang.String p0) throws android.os.RemoteException;
    public void onAdServiceUpdated(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.ad.ITvAdManagerCallback {
        public Default() {}
        public void onAdServiceAdded(java.lang.String p0) throws android.os.RemoteException {}
        public void onAdServiceRemoved(java.lang.String p0) throws android.os.RemoteException {}
        public void onAdServiceUpdated(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ad.ITvAdManagerCallback {
        static final int TRANSACTION_onAdServiceAdded = 1;
        static final int TRANSACTION_onAdServiceRemoved = 2;
        static final int TRANSACTION_onAdServiceUpdated = 3;
        public Stub() { super(); }
        public static android.media.tv.ad.ITvAdManagerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.ad.ITvAdManagerCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAdServiceAdded(java.lang.String p0) throws android.os.RemoteException {}
            public void onAdServiceRemoved(java.lang.String p0) throws android.os.RemoteException {}
            public void onAdServiceUpdated(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
