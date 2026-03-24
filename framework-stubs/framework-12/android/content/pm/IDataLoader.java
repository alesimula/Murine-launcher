package android.content.pm;

public interface IDataLoader extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.content.pm.IDataLoader";
    public void create(int p0, android.content.pm.DataLoaderParamsParcel p1, android.content.pm.FileSystemControlParcel p2, android.content.pm.IDataLoaderStatusListener p3) throws android.os.RemoteException;
    public void start(int p0) throws android.os.RemoteException;
    public void stop(int p0) throws android.os.RemoteException;
    public void destroy(int p0) throws android.os.RemoteException;
    public void prepareImage(int p0, android.content.pm.InstallationFileParcel[] p1, java.lang.String[] p2) throws android.os.RemoteException;

    public static class Default implements android.content.pm.IDataLoader {
        public Default() {}
        public void create(int p0, android.content.pm.DataLoaderParamsParcel p1, android.content.pm.FileSystemControlParcel p2, android.content.pm.IDataLoaderStatusListener p3) throws android.os.RemoteException {}
        public void start(int p0) throws android.os.RemoteException {}
        public void stop(int p0) throws android.os.RemoteException {}
        public void destroy(int p0) throws android.os.RemoteException {}
        public void prepareImage(int p0, android.content.pm.InstallationFileParcel[] p1, java.lang.String[] p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IDataLoader {
        static final int TRANSACTION_create = 1;
        static final int TRANSACTION_start = 2;
        static final int TRANSACTION_stop = 3;
        static final int TRANSACTION_destroy = 4;
        static final int TRANSACTION_prepareImage = 5;
        public Stub() { super(); }
        public static android.content.pm.IDataLoader asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IDataLoader p0) { return false; }
        public static android.content.pm.IDataLoader getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IDataLoader {
            private android.os.IBinder mRemote;
            public static android.content.pm.IDataLoader sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void create(int p0, android.content.pm.DataLoaderParamsParcel p1, android.content.pm.FileSystemControlParcel p2, android.content.pm.IDataLoaderStatusListener p3) throws android.os.RemoteException {}
            public void start(int p0) throws android.os.RemoteException {}
            public void stop(int p0) throws android.os.RemoteException {}
            public void destroy(int p0) throws android.os.RemoteException {}
            public void prepareImage(int p0, android.content.pm.InstallationFileParcel[] p1, java.lang.String[] p2) throws android.os.RemoteException {}
        }
    }
}
