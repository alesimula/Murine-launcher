package android.security.maintenance;

public interface IKeystoreMaintenance extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public void onUserAdded(int p0) throws android.os.RemoteException;
    public void onUserRemoved(int p0) throws android.os.RemoteException;
    public void onUserPasswordChanged(int p0, byte[] p1) throws android.os.RemoteException;
    public void clearNamespace(int p0, long p1) throws android.os.RemoteException;
    public int getState(int p0) throws android.os.RemoteException;
    public void earlyBootEnded() throws android.os.RemoteException;
    public void onDeviceOffBody() throws android.os.RemoteException;
    public void migrateKeyNamespace(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1) throws android.os.RemoteException;
    public void deleteAllKeys() throws android.os.RemoteException;

    public static class Default implements android.security.maintenance.IKeystoreMaintenance {
        public Default() {}
        public void onUserAdded(int p0) throws android.os.RemoteException {}
        public void onUserRemoved(int p0) throws android.os.RemoteException {}
        public void onUserPasswordChanged(int p0, byte[] p1) throws android.os.RemoteException {}
        public void clearNamespace(int p0, long p1) throws android.os.RemoteException {}
        public int getState(int p0) throws android.os.RemoteException { return 0; }
        public void earlyBootEnded() throws android.os.RemoteException {}
        public void onDeviceOffBody() throws android.os.RemoteException {}
        public void migrateKeyNamespace(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1) throws android.os.RemoteException {}
        public void deleteAllKeys() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.maintenance.IKeystoreMaintenance {
        static final int TRANSACTION_onUserAdded = 1;
        static final int TRANSACTION_onUserRemoved = 2;
        static final int TRANSACTION_onUserPasswordChanged = 3;
        static final int TRANSACTION_clearNamespace = 4;
        static final int TRANSACTION_getState = 5;
        static final int TRANSACTION_earlyBootEnded = 6;
        static final int TRANSACTION_onDeviceOffBody = 7;
        static final int TRANSACTION_migrateKeyNamespace = 8;
        static final int TRANSACTION_deleteAllKeys = 9;
        public Stub() { super(); }
        public static android.security.maintenance.IKeystoreMaintenance asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.security.maintenance.IKeystoreMaintenance p0) { return false; }
        public static android.security.maintenance.IKeystoreMaintenance getDefaultImpl() { return null; }

        private static class Proxy implements android.security.maintenance.IKeystoreMaintenance {
            private android.os.IBinder mRemote;
            public static android.security.maintenance.IKeystoreMaintenance sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onUserAdded(int p0) throws android.os.RemoteException {}
            public void onUserRemoved(int p0) throws android.os.RemoteException {}
            public void onUserPasswordChanged(int p0, byte[] p1) throws android.os.RemoteException {}
            public void clearNamespace(int p0, long p1) throws android.os.RemoteException {}
            public int getState(int p0) throws android.os.RemoteException { return 0; }
            public void earlyBootEnded() throws android.os.RemoteException {}
            public void onDeviceOffBody() throws android.os.RemoteException {}
            public void migrateKeyNamespace(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1) throws android.os.RemoteException {}
            public void deleteAllKeys() throws android.os.RemoteException {}
        }
    }
}
