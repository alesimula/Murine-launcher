package android.content.pm;

public interface IDataLoaderManager extends android.os.IInterface {
    public boolean bindToDataLoader(int p0, android.content.pm.DataLoaderParamsParcel p1, android.content.pm.IDataLoaderStatusListener p2) throws android.os.RemoteException;
    public android.content.pm.IDataLoader getDataLoader(int p0) throws android.os.RemoteException;
    public void unbindFromDataLoader(int p0) throws android.os.RemoteException;

    public static class Default implements android.content.pm.IDataLoaderManager {
        public Default() {}
        public boolean bindToDataLoader(int p0, android.content.pm.DataLoaderParamsParcel p1, android.content.pm.IDataLoaderStatusListener p2) throws android.os.RemoteException { return false; }
        public android.content.pm.IDataLoader getDataLoader(int p0) throws android.os.RemoteException { return null; }
        public void unbindFromDataLoader(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IDataLoaderManager {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.IDataLoaderManager";
        static final int TRANSACTION_bindToDataLoader = 1;
        static final int TRANSACTION_getDataLoader = 2;
        static final int TRANSACTION_unbindFromDataLoader = 3;
        public Stub() { super(); }
        public static android.content.pm.IDataLoaderManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IDataLoaderManager p0) { return false; }
        public static android.content.pm.IDataLoaderManager getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IDataLoaderManager {
            private android.os.IBinder mRemote;
            public static android.content.pm.IDataLoaderManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean bindToDataLoader(int p0, android.content.pm.DataLoaderParamsParcel p1, android.content.pm.IDataLoaderStatusListener p2) throws android.os.RemoteException { return false; }
            public android.content.pm.IDataLoader getDataLoader(int p0) throws android.os.RemoteException { return null; }
            public void unbindFromDataLoader(int p0) throws android.os.RemoteException {}
        }
    }
}
