package android.app.backup;

public class BackupManager {
    private static final java.lang.String TAG = "BackupManager";
    @android.annotation.SystemApi
    public static final int SUCCESS = 0;
    @android.annotation.SystemApi
    public static final int ERROR_BACKUP_NOT_ALLOWED = -2001;
    @android.annotation.SystemApi
    public static final int ERROR_PACKAGE_NOT_FOUND = -2002;
    @android.annotation.SystemApi
    public static final int ERROR_BACKUP_CANCELLED = -2003;
    @android.annotation.SystemApi
    public static final int ERROR_TRANSPORT_ABORTED = -1000;
    @android.annotation.SystemApi
    public static final int ERROR_TRANSPORT_PACKAGE_REJECTED = -1002;
    @android.annotation.SystemApi
    public static final int ERROR_TRANSPORT_QUOTA_EXCEEDED = -1005;
    @android.annotation.SystemApi
    public static final int ERROR_AGENT_FAILURE = -1003;
    public static final java.lang.String EXTRA_BACKUP_SERVICES_AVAILABLE = "backup_services_available";
    @android.annotation.SystemApi
    public static final int FLAG_NON_INCREMENTAL_BACKUP = 1;
    @android.annotation.SystemApi
    public static final java.lang.String PACKAGE_MANAGER_SENTINEL = "@pm@";
    @android.annotation.SystemApi
    public static final int ERROR_TRANSPORT_UNAVAILABLE = -1;
    @android.annotation.SystemApi
    public static final int ERROR_TRANSPORT_INVALID = -2;
    private android.content.Context mContext;
    private static android.app.backup.IBackupManager sService;
    private static void checkServiceBinder() {}
    public BackupManager(android.content.Context p0) {}
    public void dataChanged() {}
    public static void dataChanged(java.lang.String p0) {}
    @java.lang.Deprecated
    public int requestRestore(android.app.backup.RestoreObserver p0) { return 0; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public int requestRestore(android.app.backup.RestoreObserver p0, android.app.backup.BackupManagerMonitor p1) { return 0; }
    @android.annotation.SystemApi
    public android.app.backup.RestoreSession beginRestoreSession() { return null; }
    @android.annotation.SystemApi
    public void setBackupEnabled(boolean p0) {}
    @android.annotation.SystemApi
    public boolean isBackupEnabled() { return false; }
    @android.annotation.SystemApi
    public boolean isBackupServiceActive(android.os.UserHandle p0) { return false; }
    @android.annotation.SystemApi
    public void setAutoRestore(boolean p0) {}
    @android.annotation.SystemApi
    public java.lang.String getCurrentTransport() { return null; }
    @android.annotation.SystemApi
    public android.content.ComponentName getCurrentTransportComponent() { return null; }
    @android.annotation.SystemApi
    public java.lang.String[] listAllTransports() { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void updateTransportAttributes(android.content.ComponentName p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.content.Intent p4, java.lang.String p5) {}
    @android.annotation.SystemApi
    public void updateTransportAttributes(android.content.ComponentName p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.content.Intent p4, java.lang.CharSequence p5) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public java.lang.String selectBackupTransport(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public void selectBackupTransport(android.content.ComponentName p0, android.app.backup.SelectBackupTransportCallback p1) {}
    @android.annotation.SystemApi
    public void backupNow() {}
    @android.annotation.SystemApi
    public long getAvailableRestoreToken(java.lang.String p0) { return 0L; }
    @android.annotation.SystemApi
    public boolean isAppEligibleForBackup(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public int requestBackup(java.lang.String[] p0, android.app.backup.BackupObserver p1) { return 0; }
    @android.annotation.SystemApi
    public int requestBackup(java.lang.String[] p0, android.app.backup.BackupObserver p1, android.app.backup.BackupManagerMonitor p2, int p3) { return 0; }
    @android.annotation.SystemApi
    public void cancelBackups() {}
    public android.os.UserHandle getUserForAncestralSerialNumber(long p0) { return null; }
    @android.annotation.SystemApi
    public void setAncestralSerialNumber(long p0) {}
    @android.annotation.SystemApi
    public android.content.Intent getConfigurationIntent(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public java.lang.String getDestinationString(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public android.content.Intent getDataManagementIntent(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public java.lang.String getDataManagementLabel(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public java.lang.CharSequence getDataManagementIntentLabel(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public void excludeKeysFromRestore(java.lang.String p0, java.util.List<java.lang.String> p1) {}

    private class BackupManagerMonitorWrapper extends android.app.backup.IBackupManagerMonitor.Stub {
        final android.app.backup.BackupManagerMonitor mMonitor = null;
        BackupManagerMonitorWrapper(android.app.backup.BackupManager p0, android.app.backup.BackupManagerMonitor p1) { super(); }
        public void onEvent(android.os.Bundle p0) throws android.os.RemoteException {}
    }

    private class BackupObserverWrapper extends android.app.backup.IBackupObserver.Stub {
        final android.os.Handler mHandler = null;
        final android.app.backup.BackupObserver mObserver = null;
        static final int MSG_UPDATE = 1;
        static final int MSG_RESULT = 2;
        static final int MSG_FINISHED = 3;
        BackupObserverWrapper(android.app.backup.BackupManager p0, android.content.Context p1, android.app.backup.BackupObserver p2) { super(); }
        public void onUpdate(java.lang.String p0, android.app.backup.BackupProgress p1) {}
        public void onResult(java.lang.String p0, int p1) {}
        public void backupFinished(int p0) {}
    }

    private class SelectTransportListenerWrapper extends android.app.backup.ISelectBackupTransportCallback.Stub {
        private final android.os.Handler mHandler = null;
        private final android.app.backup.SelectBackupTransportCallback mListener = null;
        SelectTransportListenerWrapper(android.app.backup.BackupManager p0, android.content.Context p1, android.app.backup.SelectBackupTransportCallback p2) { super(); }
        public void onSuccess(java.lang.String p0) {}
        public void onFailure(int p0) {}
    }
}
