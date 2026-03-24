package android.content.rollback;

public interface IRollbackManager extends android.os.IInterface {
    public android.content.pm.ParceledListSlice getAvailableRollbacks() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getRecentlyExecutedRollbacks() throws android.os.RemoteException;
    public void commitRollback(int p0, android.content.pm.ParceledListSlice p1, java.lang.String p2, android.content.IntentSender p3) throws android.os.RemoteException;
    public void snapshotAndRestoreUserData(java.lang.String p0, int[] p1, int p2, long p3, java.lang.String p4, int p5) throws android.os.RemoteException;
    public void reloadPersistedData() throws android.os.RemoteException;
    public void expireRollbackForPackage(java.lang.String p0) throws android.os.RemoteException;
    public boolean notifyStagedSession(int p0) throws android.os.RemoteException;
    public void notifyStagedApkSession(int p0, int p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.content.rollback.IRollbackManager {
        private static final java.lang.String DESCRIPTOR = "android.content.rollback.IRollbackManager";
        static final int TRANSACTION_getAvailableRollbacks = 1;
        static final int TRANSACTION_getRecentlyExecutedRollbacks = 2;
        static final int TRANSACTION_commitRollback = 3;
        static final int TRANSACTION_snapshotAndRestoreUserData = 4;
        static final int TRANSACTION_reloadPersistedData = 5;
        static final int TRANSACTION_expireRollbackForPackage = 6;
        static final int TRANSACTION_notifyStagedSession = 7;
        static final int TRANSACTION_notifyStagedApkSession = 8;
        public Stub() { super(); }
        public static android.content.rollback.IRollbackManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.rollback.IRollbackManager p0) { return false; }
        public static android.content.rollback.IRollbackManager getDefaultImpl() { return null; }

        private static class Proxy implements android.content.rollback.IRollbackManager {
            private android.os.IBinder mRemote;
            public static android.content.rollback.IRollbackManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.content.pm.ParceledListSlice getAvailableRollbacks() throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getRecentlyExecutedRollbacks() throws android.os.RemoteException { return null; }
            public void commitRollback(int p0, android.content.pm.ParceledListSlice p1, java.lang.String p2, android.content.IntentSender p3) throws android.os.RemoteException {}
            public void snapshotAndRestoreUserData(java.lang.String p0, int[] p1, int p2, long p3, java.lang.String p4, int p5) throws android.os.RemoteException {}
            public void reloadPersistedData() throws android.os.RemoteException {}
            public void expireRollbackForPackage(java.lang.String p0) throws android.os.RemoteException {}
            public boolean notifyStagedSession(int p0) throws android.os.RemoteException { return false; }
            public void notifyStagedApkSession(int p0, int p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.content.rollback.IRollbackManager {
        public Default() {}
        public android.content.pm.ParceledListSlice getAvailableRollbacks() throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getRecentlyExecutedRollbacks() throws android.os.RemoteException { return null; }
        public void commitRollback(int p0, android.content.pm.ParceledListSlice p1, java.lang.String p2, android.content.IntentSender p3) throws android.os.RemoteException {}
        public void snapshotAndRestoreUserData(java.lang.String p0, int[] p1, int p2, long p3, java.lang.String p4, int p5) throws android.os.RemoteException {}
        public void reloadPersistedData() throws android.os.RemoteException {}
        public void expireRollbackForPackage(java.lang.String p0) throws android.os.RemoteException {}
        public boolean notifyStagedSession(int p0) throws android.os.RemoteException { return false; }
        public void notifyStagedApkSession(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
