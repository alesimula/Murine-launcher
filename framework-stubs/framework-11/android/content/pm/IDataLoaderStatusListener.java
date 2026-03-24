package android.content.pm;

public interface IDataLoaderStatusListener extends android.os.IInterface {
    public static final int DATA_LOADER_DESTROYED = 0;
    public static final int DATA_LOADER_BOUND = 1;
    public static final int DATA_LOADER_CREATED = 2;
    public static final int DATA_LOADER_STARTED = 3;
    public static final int DATA_LOADER_STOPPED = 4;
    public static final int DATA_LOADER_IMAGE_READY = 5;
    public static final int DATA_LOADER_IMAGE_NOT_READY = 6;
    public static final int DATA_LOADER_UNAVAILABLE = 7;
    public static final int DATA_LOADER_UNRECOVERABLE = 8;
    public void onStatusChanged(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.content.pm.IDataLoaderStatusListener {
        public Default() {}
        public void onStatusChanged(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IDataLoaderStatusListener {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.IDataLoaderStatusListener";
        static final int TRANSACTION_onStatusChanged = 1;
        public Stub() { super(); }
        public static android.content.pm.IDataLoaderStatusListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IDataLoaderStatusListener p0) { return false; }
        public static android.content.pm.IDataLoaderStatusListener getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IDataLoaderStatusListener {
            private android.os.IBinder mRemote;
            public static android.content.pm.IDataLoaderStatusListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStatusChanged(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}
