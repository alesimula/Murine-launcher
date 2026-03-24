package android.window;

public interface ISurfaceSyncGroup extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.ISurfaceSyncGroup";
    public boolean onAddedToSyncGroup(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public boolean addToSync(android.window.ISurfaceSyncGroup p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.window.ISurfaceSyncGroup {
        public Default() {}
        public boolean onAddedToSyncGroup(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean addToSync(android.window.ISurfaceSyncGroup p0, boolean p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.ISurfaceSyncGroup {
        static final int TRANSACTION_onAddedToSyncGroup = 1;
        static final int TRANSACTION_addToSync = 2;
        public Stub() { super(); }
        public static android.window.ISurfaceSyncGroup asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.window.ISurfaceSyncGroup {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean onAddedToSyncGroup(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean addToSync(android.window.ISurfaceSyncGroup p0, boolean p1) throws android.os.RemoteException { return false; }
        }
    }
}
