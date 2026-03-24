package android.os.incremental;

public interface IStorageHealthListener extends android.os.IInterface {
    public static final int HEALTH_STATUS_OK = 0;
    public static final int HEALTH_STATUS_READS_PENDING = 1;
    public static final int HEALTH_STATUS_BLOCKED = 2;
    public static final int HEALTH_STATUS_UNHEALTHY = 3;
    public void onHealthStatus(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.os.incremental.IStorageHealthListener {
        public Default() {}
        public void onHealthStatus(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.incremental.IStorageHealthListener {
        private static final java.lang.String DESCRIPTOR = "android.os.incremental.IStorageHealthListener";
        static final int TRANSACTION_onHealthStatus = 1;
        public Stub() { super(); }
        public static android.os.incremental.IStorageHealthListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.incremental.IStorageHealthListener p0) { return false; }
        public static android.os.incremental.IStorageHealthListener getDefaultImpl() { return null; }

        private static class Proxy implements android.os.incremental.IStorageHealthListener {
            private android.os.IBinder mRemote;
            public static android.os.incremental.IStorageHealthListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onHealthStatus(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}
