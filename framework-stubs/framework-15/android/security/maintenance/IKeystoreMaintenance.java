package android.security.maintenance;

public interface IKeystoreMaintenance extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.maintenance.IKeystoreMaintenance";
    public void onUserAdded(int p0) throws android.os.RemoteException;
    public void initUserSuperKeys(int p0, byte[] p1, boolean p2) throws android.os.RemoteException;
    public void onUserRemoved(int p0) throws android.os.RemoteException;
    public void onUserLskfRemoved(int p0) throws android.os.RemoteException;
    public void onUserPasswordChanged(int p0, byte[] p1) throws android.os.RemoteException;
    public void clearNamespace(int p0, long p1) throws android.os.RemoteException;
    public void earlyBootEnded() throws android.os.RemoteException;
    public void migrateKeyNamespace(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1) throws android.os.RemoteException;
    public void deleteAllKeys() throws android.os.RemoteException;
    public long[] getAppUidsAffectedBySid(int p0, long p1) throws android.os.RemoteException;

    public static class Default implements android.security.maintenance.IKeystoreMaintenance {
        public Default() {}
        public void onUserAdded(int p0) throws android.os.RemoteException {}
        public void initUserSuperKeys(int p0, byte[] p1, boolean p2) throws android.os.RemoteException {}
        public void onUserRemoved(int p0) throws android.os.RemoteException {}
        public void onUserLskfRemoved(int p0) throws android.os.RemoteException {}
        public void onUserPasswordChanged(int p0, byte[] p1) throws android.os.RemoteException {}
        public void clearNamespace(int p0, long p1) throws android.os.RemoteException {}
        public void earlyBootEnded() throws android.os.RemoteException {}
        public void migrateKeyNamespace(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1) throws android.os.RemoteException {}
        public void deleteAllKeys() throws android.os.RemoteException {}
        public long[] getAppUidsAffectedBySid(int p0, long p1) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.maintenance.IKeystoreMaintenance {
        static final int TRANSACTION_onUserAdded = 1;
        static final int TRANSACTION_initUserSuperKeys = 2;
        static final int TRANSACTION_onUserRemoved = 3;
        static final int TRANSACTION_onUserLskfRemoved = 4;
        static final int TRANSACTION_onUserPasswordChanged = 5;
        static final int TRANSACTION_clearNamespace = 6;
        static final int TRANSACTION_earlyBootEnded = 7;
        static final int TRANSACTION_migrateKeyNamespace = 8;
        static final int TRANSACTION_deleteAllKeys = 9;
        static final int TRANSACTION_getAppUidsAffectedBySid = 10;
        public Stub() { super(); }
        public static android.security.maintenance.IKeystoreMaintenance asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.maintenance.IKeystoreMaintenance {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onUserAdded(int p0) throws android.os.RemoteException {}
            public void initUserSuperKeys(int p0, byte[] p1, boolean p2) throws android.os.RemoteException {}
            public void onUserRemoved(int p0) throws android.os.RemoteException {}
            public void onUserLskfRemoved(int p0) throws android.os.RemoteException {}
            public void onUserPasswordChanged(int p0, byte[] p1) throws android.os.RemoteException {}
            public void clearNamespace(int p0, long p1) throws android.os.RemoteException {}
            public void earlyBootEnded() throws android.os.RemoteException {}
            public void migrateKeyNamespace(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1) throws android.os.RemoteException {}
            public void deleteAllKeys() throws android.os.RemoteException {}
            public long[] getAppUidsAffectedBySid(int p0, long p1) throws android.os.RemoteException { return null; }
        }
    }
}
