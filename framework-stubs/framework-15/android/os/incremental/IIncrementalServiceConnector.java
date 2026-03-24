package android.os.incremental;

public interface IIncrementalServiceConnector extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.incremental.IIncrementalServiceConnector";
    public int setStorageParams(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.os.incremental.IIncrementalServiceConnector {
        public Default() {}
        public int setStorageParams(boolean p0) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.incremental.IIncrementalServiceConnector {
        static final int TRANSACTION_setStorageParams = 1;
        public Stub() { super(); }
        public static android.os.incremental.IIncrementalServiceConnector asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.incremental.IIncrementalServiceConnector {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int setStorageParams(boolean p0) throws android.os.RemoteException { return 0; }
        }
    }
}
