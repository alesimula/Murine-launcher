package android.app.backup;

@android.annotation.SystemApi
public class RestoreSession {
    static final java.lang.String TAG = "RestoreSession";
    final android.content.Context mContext = null;
    android.app.backup.IRestoreSession mBinder;
    android.app.backup.RestoreSession.RestoreObserverWrapper mObserver;
    public int getAvailableRestoreSets(android.app.backup.RestoreObserver p0, android.app.backup.BackupManagerMonitor p1) { return 0; }
    public int getAvailableRestoreSets(android.app.backup.RestoreObserver p0) { return 0; }
    public int restoreAll(long p0, android.app.backup.RestoreObserver p1, android.app.backup.BackupManagerMonitor p2) { return 0; }
    public int restoreAll(long p0, android.app.backup.RestoreObserver p1) { return 0; }
    public int restorePackages(long p0, android.app.backup.RestoreObserver p1, java.util.Set<java.lang.String> p2, android.app.backup.BackupManagerMonitor p3) { return 0; }
    public int restorePackages(long p0, android.app.backup.RestoreObserver p1, java.util.Set<java.lang.String> p2) { return 0; }
    @java.lang.Deprecated
    public int restoreSome(long p0, android.app.backup.RestoreObserver p1, android.app.backup.BackupManagerMonitor p2, java.lang.String[] p3) { return 0; }
    @java.lang.Deprecated
    public int restoreSome(long p0, android.app.backup.RestoreObserver p1, java.lang.String[] p2) { return 0; }
    public int restorePackage(java.lang.String p0, android.app.backup.RestoreObserver p1, android.app.backup.BackupManagerMonitor p2) { return 0; }
    public int restorePackage(java.lang.String p0, android.app.backup.RestoreObserver p1) { return 0; }
    public void endRestoreSession() {}
    RestoreSession(android.content.Context p0, android.app.backup.IRestoreSession p1) {}

    private class RestoreObserverWrapper extends android.app.backup.IRestoreObserver.Stub {
        final android.os.Handler mHandler = null;
        final android.app.backup.RestoreObserver mAppObserver = null;
        static final int MSG_RESTORE_STARTING = 1;
        static final int MSG_UPDATE = 2;
        static final int MSG_RESTORE_FINISHED = 3;
        static final int MSG_RESTORE_SETS_AVAILABLE = 4;
        RestoreObserverWrapper(android.app.backup.RestoreSession p0, android.content.Context p1, android.app.backup.RestoreObserver p2) { super(); }
        public void restoreSetsAvailable(android.app.backup.RestoreSet[] p0) {}
        public void restoreStarting(int p0) {}
        public void onUpdate(int p0, java.lang.String p1) {}
        public void restoreFinished(int p0) {}
    }

    private class BackupManagerMonitorWrapper extends android.app.backup.IBackupManagerMonitor.Stub {
        final android.app.backup.BackupManagerMonitor mMonitor = null;
        BackupManagerMonitorWrapper(android.app.backup.RestoreSession p0, android.app.backup.BackupManagerMonitor p1) { super(); }
        public void onEvent(android.os.Bundle p0) throws android.os.RemoteException {}
    }
}
