package android.app.backup;

public abstract class BackupAgent extends android.content.ContextWrapper {
    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_ERROR = -1;
    public static final int TYPE_EOF = 0;
    public static final int TYPE_FILE = 1;
    public static final int TYPE_DIRECTORY = 2;
    public static final int TYPE_SYMLINK = 3;
    public static final int FLAG_CLIENT_SIDE_ENCRYPTION_ENABLED = 1;
    public static final int FLAG_DEVICE_TO_DEVICE_TRANSFER = 2;
    public static final int FLAG_SKIP_RESTORE_FOR_LAUNCHED_APPS = 4;
    public static final int FLAG_FAKE_CLIENT_SIDE_ENCRYPTION_ENABLED = -2147483648;
    android.os.Handler mHandler;
    android.os.Handler getHandler() { return null; }
    @android.annotation.Nullable
    public android.app.backup.BackupRestoreEventLogger getBackupRestoreEventLogger() { return null; }
    public BackupAgent() { super(null); }
    public void onCreate() {}
    public void onCreate(android.os.UserHandle p0) {}
    @java.lang.Deprecated
    public void onCreate(android.os.UserHandle p0, int p1) {}
    public void onCreate(android.os.UserHandle p0, int p1, int p2) {}
    public void onDestroy() {}
    public abstract void onBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2) throws java.io.IOException;
    public abstract void onRestore(android.app.backup.BackupDataInput p0, int p1, android.os.ParcelFileDescriptor p2) throws java.io.IOException;
    public void onRestore(android.app.backup.BackupDataInput p0, long p1, android.os.ParcelFileDescriptor p2) throws java.io.IOException {}
    public void onRestore(android.app.backup.BackupDataInput p0, long p1, android.os.ParcelFileDescriptor p2, java.util.Set<java.lang.String> p3) throws java.io.IOException {}
    public void onFullBackup(android.app.backup.FullBackupDataOutput p0) throws java.io.IOException {}
    public android.app.backup.BackupAgent.IncludeExcludeRules getIncludeExcludeRules(android.app.backup.FullBackup.BackupScheme p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    public void onQuotaExceeded(long p0, long p1) {}
    public final void fullBackupFile(java.io.File p0, android.app.backup.FullBackupDataOutput p1) {}
    protected final void fullBackupFileTree(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags> p3, android.util.ArraySet<java.lang.String> p4, android.app.backup.FullBackupDataOutput p5) {}
    public void onRestoreFile(android.os.ParcelFileDescriptor p0, long p1, java.io.File p2, int p3, long p4, long p5) throws java.io.IOException {}
    protected void onRestoreFile(android.os.ParcelFileDescriptor p0, long p1, int p2, java.lang.String p3, java.lang.String p4, long p5, long p6) throws java.io.IOException {}
    public void onRestoreFinished() {}
    public final void clearBackupRestoreEventLogger() {}
    public final android.os.IBinder onBind() { return null; }
    public void attach(android.content.Context p0) {}

    private class BackupServiceBinder extends android.app.IBackupAgent.Stub {
        public void doBackup(android.os.ParcelFileDescriptor p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, long p3, android.app.backup.IBackupCallback p4, int p5) throws android.os.RemoteException {}
        public void doRestore(android.os.ParcelFileDescriptor p0, long p1, android.os.ParcelFileDescriptor p2, int p3, android.app.backup.IBackupManager p4) throws android.os.RemoteException {}
        public void doRestoreWithExcludedKeys(android.os.ParcelFileDescriptor p0, long p1, android.os.ParcelFileDescriptor p2, int p3, android.app.backup.IBackupManager p4, java.util.List<java.lang.String> p5) throws android.os.RemoteException {}
        public void doFullBackup(android.os.ParcelFileDescriptor p0, long p1, int p2, android.app.backup.IBackupManager p3, int p4) {}
        public void doMeasureFullBackup(long p0, int p1, android.app.backup.IBackupManager p2, int p3) {}
        public void doRestoreFile(android.os.ParcelFileDescriptor p0, long p1, int p2, java.lang.String p3, java.lang.String p4, long p5, long p6, int p7, android.app.backup.IBackupManager p8) throws android.os.RemoteException {}
        public void doRestoreFinished(int p0, android.app.backup.IBackupManager p1) {}
        public void fail(java.lang.String p0) {}
        public void doQuotaExceeded(long p0, long p1, android.app.backup.IBackupCallback p2) {}
        public void getLoggerResults(com.android.internal.infra.AndroidFuture<java.util.List<android.app.backup.BackupRestoreEventLogger.DataTypeResult>> p0) {}
        public void getOperationType(com.android.internal.infra.AndroidFuture<java.lang.Integer> p0) {}
        public void clearBackupRestoreEventLogger() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BackupTransportFlags {
    }

    static class FailRunnable implements java.lang.Runnable {
        FailRunnable(java.lang.String p0) {}
        public void run() {}
    }

    public static class IncludeExcludeRules {
        public IncludeExcludeRules(java.util.Map<java.lang.String, java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags>> p0, java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags> p1) {}
        public static android.app.backup.BackupAgent.IncludeExcludeRules emptyRules() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    class SharedPrefsSynchronizer implements java.lang.Runnable {
        public final java.util.concurrent.CountDownLatch mLatch = null;
        SharedPrefsSynchronizer(android.app.backup.BackupAgent p0) {}
        public void run() {}
    }
}
