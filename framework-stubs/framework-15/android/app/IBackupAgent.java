package android.app;

public interface IBackupAgent extends android.os.IInterface {
    public void doBackup(android.os.ParcelFileDescriptor p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, long p3, android.app.backup.IBackupCallback p4, int p5) throws android.os.RemoteException;
    public void doRestore(android.os.ParcelFileDescriptor p0, long p1, android.os.ParcelFileDescriptor p2, int p3, android.app.backup.IBackupManager p4) throws android.os.RemoteException;
    public void doRestoreWithExcludedKeys(android.os.ParcelFileDescriptor p0, long p1, android.os.ParcelFileDescriptor p2, int p3, android.app.backup.IBackupManager p4, java.util.List<java.lang.String> p5) throws android.os.RemoteException;
    public void doFullBackup(android.os.ParcelFileDescriptor p0, long p1, int p2, android.app.backup.IBackupManager p3, int p4) throws android.os.RemoteException;
    public void doMeasureFullBackup(long p0, int p1, android.app.backup.IBackupManager p2, int p3) throws android.os.RemoteException;
    public void doQuotaExceeded(long p0, long p1, android.app.backup.IBackupCallback p2) throws android.os.RemoteException;
    public void doRestoreFile(android.os.ParcelFileDescriptor p0, long p1, int p2, java.lang.String p3, java.lang.String p4, long p5, long p6, int p7, android.app.backup.IBackupManager p8) throws android.os.RemoteException;
    public void doRestoreFinished(int p0, android.app.backup.IBackupManager p1) throws android.os.RemoteException;
    public void fail(java.lang.String p0) throws android.os.RemoteException;
    public void getLoggerResults(com.android.internal.infra.AndroidFuture<java.util.List<android.app.backup.BackupRestoreEventLogger.DataTypeResult>> p0) throws android.os.RemoteException;
    public void getOperationType(com.android.internal.infra.AndroidFuture<java.lang.Integer> p0) throws android.os.RemoteException;
    public void clearBackupRestoreEventLogger() throws android.os.RemoteException;

    public static class Default implements android.app.IBackupAgent {
        public Default() {}
        public void doBackup(android.os.ParcelFileDescriptor p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, long p3, android.app.backup.IBackupCallback p4, int p5) throws android.os.RemoteException {}
        public void doRestore(android.os.ParcelFileDescriptor p0, long p1, android.os.ParcelFileDescriptor p2, int p3, android.app.backup.IBackupManager p4) throws android.os.RemoteException {}
        public void doRestoreWithExcludedKeys(android.os.ParcelFileDescriptor p0, long p1, android.os.ParcelFileDescriptor p2, int p3, android.app.backup.IBackupManager p4, java.util.List<java.lang.String> p5) throws android.os.RemoteException {}
        public void doFullBackup(android.os.ParcelFileDescriptor p0, long p1, int p2, android.app.backup.IBackupManager p3, int p4) throws android.os.RemoteException {}
        public void doMeasureFullBackup(long p0, int p1, android.app.backup.IBackupManager p2, int p3) throws android.os.RemoteException {}
        public void doQuotaExceeded(long p0, long p1, android.app.backup.IBackupCallback p2) throws android.os.RemoteException {}
        public void doRestoreFile(android.os.ParcelFileDescriptor p0, long p1, int p2, java.lang.String p3, java.lang.String p4, long p5, long p6, int p7, android.app.backup.IBackupManager p8) throws android.os.RemoteException {}
        public void doRestoreFinished(int p0, android.app.backup.IBackupManager p1) throws android.os.RemoteException {}
        public void fail(java.lang.String p0) throws android.os.RemoteException {}
        public void getLoggerResults(com.android.internal.infra.AndroidFuture<java.util.List<android.app.backup.BackupRestoreEventLogger.DataTypeResult>> p0) throws android.os.RemoteException {}
        public void getOperationType(com.android.internal.infra.AndroidFuture<java.lang.Integer> p0) throws android.os.RemoteException {}
        public void clearBackupRestoreEventLogger() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IBackupAgent {
        public static final java.lang.String DESCRIPTOR = "android.app.IBackupAgent";
        static final int TRANSACTION_doBackup = 1;
        static final int TRANSACTION_doRestore = 2;
        static final int TRANSACTION_doRestoreWithExcludedKeys = 3;
        static final int TRANSACTION_doFullBackup = 4;
        static final int TRANSACTION_doMeasureFullBackup = 5;
        static final int TRANSACTION_doQuotaExceeded = 6;
        static final int TRANSACTION_doRestoreFile = 7;
        static final int TRANSACTION_doRestoreFinished = 8;
        static final int TRANSACTION_fail = 9;
        static final int TRANSACTION_getLoggerResults = 10;
        static final int TRANSACTION_getOperationType = 11;
        static final int TRANSACTION_clearBackupRestoreEventLogger = 12;
        public Stub() { super(); }
        public static android.app.IBackupAgent asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.IBackupAgent {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void doBackup(android.os.ParcelFileDescriptor p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, long p3, android.app.backup.IBackupCallback p4, int p5) throws android.os.RemoteException {}
            public void doRestore(android.os.ParcelFileDescriptor p0, long p1, android.os.ParcelFileDescriptor p2, int p3, android.app.backup.IBackupManager p4) throws android.os.RemoteException {}
            public void doRestoreWithExcludedKeys(android.os.ParcelFileDescriptor p0, long p1, android.os.ParcelFileDescriptor p2, int p3, android.app.backup.IBackupManager p4, java.util.List<java.lang.String> p5) throws android.os.RemoteException {}
            public void doFullBackup(android.os.ParcelFileDescriptor p0, long p1, int p2, android.app.backup.IBackupManager p3, int p4) throws android.os.RemoteException {}
            public void doMeasureFullBackup(long p0, int p1, android.app.backup.IBackupManager p2, int p3) throws android.os.RemoteException {}
            public void doQuotaExceeded(long p0, long p1, android.app.backup.IBackupCallback p2) throws android.os.RemoteException {}
            public void doRestoreFile(android.os.ParcelFileDescriptor p0, long p1, int p2, java.lang.String p3, java.lang.String p4, long p5, long p6, int p7, android.app.backup.IBackupManager p8) throws android.os.RemoteException {}
            public void doRestoreFinished(int p0, android.app.backup.IBackupManager p1) throws android.os.RemoteException {}
            public void fail(java.lang.String p0) throws android.os.RemoteException {}
            public void getLoggerResults(com.android.internal.infra.AndroidFuture<java.util.List<android.app.backup.BackupRestoreEventLogger.DataTypeResult>> p0) throws android.os.RemoteException {}
            public void getOperationType(com.android.internal.infra.AndroidFuture<java.lang.Integer> p0) throws android.os.RemoteException {}
            public void clearBackupRestoreEventLogger() throws android.os.RemoteException {}
        }
    }
}
