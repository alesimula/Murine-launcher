package android.os.incremental;

public interface IStorageLoadingProgressListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.incremental.IStorageLoadingProgressListener";
    public void onStorageLoadingProgressChanged(int p0, float p1) throws android.os.RemoteException;

    public static class Default implements android.os.incremental.IStorageLoadingProgressListener {
        public Default() {}
        public void onStorageLoadingProgressChanged(int p0, float p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.incremental.IStorageLoadingProgressListener {
        static final int TRANSACTION_onStorageLoadingProgressChanged = 1;
        public Stub() { super(); }
        public static android.os.incremental.IStorageLoadingProgressListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.incremental.IStorageLoadingProgressListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStorageLoadingProgressChanged(int p0, float p1) throws android.os.RemoteException {}
        }
    }
}
