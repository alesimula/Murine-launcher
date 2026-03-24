package android.app.backup;

public interface IFullBackupRestoreObserver extends android.os.IInterface {
    public void onStartBackup() throws android.os.RemoteException;
    public void onBackupPackage(java.lang.String p0) throws android.os.RemoteException;
    public void onEndBackup() throws android.os.RemoteException;
    public void onStartRestore() throws android.os.RemoteException;
    public void onRestorePackage(java.lang.String p0) throws android.os.RemoteException;
    public void onEndRestore() throws android.os.RemoteException;
    public void onTimeout() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.backup.IFullBackupRestoreObserver {
        private static final java.lang.String DESCRIPTOR = "android.app.backup.IFullBackupRestoreObserver";
        static final int TRANSACTION_onStartBackup = 1;
        static final int TRANSACTION_onBackupPackage = 2;
        static final int TRANSACTION_onEndBackup = 3;
        static final int TRANSACTION_onStartRestore = 4;
        static final int TRANSACTION_onRestorePackage = 5;
        static final int TRANSACTION_onEndRestore = 6;
        static final int TRANSACTION_onTimeout = 7;
        public Stub() { super(); }
        public static android.app.backup.IFullBackupRestoreObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.backup.IFullBackupRestoreObserver p0) { return false; }
        public static android.app.backup.IFullBackupRestoreObserver getDefaultImpl() { return null; }

        private static class Proxy implements android.app.backup.IFullBackupRestoreObserver {
            private android.os.IBinder mRemote;
            public static android.app.backup.IFullBackupRestoreObserver sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStartBackup() throws android.os.RemoteException {}
            public void onBackupPackage(java.lang.String p0) throws android.os.RemoteException {}
            public void onEndBackup() throws android.os.RemoteException {}
            public void onStartRestore() throws android.os.RemoteException {}
            public void onRestorePackage(java.lang.String p0) throws android.os.RemoteException {}
            public void onEndRestore() throws android.os.RemoteException {}
            public void onTimeout() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.app.backup.IFullBackupRestoreObserver {
        public Default() {}
        public void onStartBackup() throws android.os.RemoteException {}
        public void onBackupPackage(java.lang.String p0) throws android.os.RemoteException {}
        public void onEndBackup() throws android.os.RemoteException {}
        public void onStartRestore() throws android.os.RemoteException {}
        public void onRestorePackage(java.lang.String p0) throws android.os.RemoteException {}
        public void onEndRestore() throws android.os.RemoteException {}
        public void onTimeout() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
