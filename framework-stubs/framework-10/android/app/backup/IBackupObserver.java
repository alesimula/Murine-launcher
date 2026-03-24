package android.app.backup;

public interface IBackupObserver extends android.os.IInterface {
    public void onUpdate(java.lang.String p0, android.app.backup.BackupProgress p1) throws android.os.RemoteException;
    public void onResult(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void backupFinished(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.backup.IBackupObserver {
        private static final java.lang.String DESCRIPTOR = "android.app.backup.IBackupObserver";
        static final int TRANSACTION_onUpdate = 1;
        static final int TRANSACTION_onResult = 2;
        static final int TRANSACTION_backupFinished = 3;
        public Stub() { super(); }
        public static android.app.backup.IBackupObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.backup.IBackupObserver p0) { return false; }
        public static android.app.backup.IBackupObserver getDefaultImpl() { return null; }

        private static class Proxy implements android.app.backup.IBackupObserver {
            private android.os.IBinder mRemote;
            public static android.app.backup.IBackupObserver sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onUpdate(java.lang.String p0, android.app.backup.BackupProgress p1) throws android.os.RemoteException {}
            public void onResult(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void backupFinished(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.app.backup.IBackupObserver {
        public Default() {}
        public void onUpdate(java.lang.String p0, android.app.backup.BackupProgress p1) throws android.os.RemoteException {}
        public void onResult(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void backupFinished(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
