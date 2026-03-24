package android.app.backup;

@android.annotation.SystemApi
public class BackupTransport {
    public static final int TRANSPORT_OK = 0;
    public static final int NO_MORE_DATA = -1;
    public static final int TRANSPORT_ERROR = -1000;
    public static final int TRANSPORT_NOT_INITIALIZED = -1001;
    public static final int TRANSPORT_PACKAGE_REJECTED = -1002;
    public static final int AGENT_ERROR = -1003;
    public static final int AGENT_UNKNOWN = -1004;
    public static final int TRANSPORT_QUOTA_EXCEEDED = -1005;
    public static final int TRANSPORT_NON_INCREMENTAL_BACKUP_REQUIRED = -1006;
    public static final int FLAG_USER_INITIATED = 1;
    public static final int FLAG_INCREMENTAL = 2;
    public static final int FLAG_NON_INCREMENTAL = 4;
    public static final int FLAG_DATA_NOT_CHANGED = 8;
    public static final java.lang.String EXTRA_TRANSPORT_REGISTRATION = "android.app.backup.extra.TRANSPORT_REGISTRATION";
    com.android.internal.backup.IBackupTransport mBinderImpl;
    public BackupTransport() {}
    public android.os.IBinder getBinder() { return null; }
    public java.lang.String name() { return null; }
    public android.content.Intent configurationIntent() { return null; }
    public java.lang.String currentDestinationString() { return null; }
    public android.content.Intent dataManagementIntent() { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public java.lang.String dataManagementLabel() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence dataManagementIntentLabel() { return null; }
    public java.lang.String transportDirName() { return null; }
    public int initializeDevice() { return 0; }
    public int clearBackupData(android.content.pm.PackageInfo p0) { return 0; }
    public int finishBackup() { return 0; }
    public long requestBackupTime() { return 0L; }
    public int performBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2) { return 0; }
    public int performBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1) { return 0; }
    public android.app.backup.RestoreSet[] getAvailableRestoreSets() { return null; }
    public long getCurrentRestoreSet() { return 0L; }
    public int startRestore(long p0, android.content.pm.PackageInfo[] p1) { return 0; }
    public android.app.backup.RestoreDescription nextRestorePackage() { return null; }
    public int getRestoreData(android.os.ParcelFileDescriptor p0) { return 0; }
    public void finishRestore() {}
    public long requestFullBackupTime() { return 0L; }
    public int performFullBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2) { return 0; }
    public int performFullBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1) { return 0; }
    public int checkFullBackupSize(long p0) { return 0; }
    public int sendBackupData(int p0) { return 0; }
    public void cancelFullBackup() {}
    public boolean isAppEligibleForBackup(android.content.pm.PackageInfo p0, boolean p1) { return false; }
    public long getBackupQuota(java.lang.String p0, boolean p1) { return 0L; }
    public int getNextFullRestoreDataChunk(android.os.ParcelFileDescriptor p0) { return 0; }
    public int abortFullRestore() { return 0; }
    public int getTransportFlags() { return 0; }
    @android.annotation.Nullable
    public android.app.backup.BackupManagerMonitor getBackupManagerMonitor() { return null; }

    class TransportImpl extends com.android.internal.backup.IBackupTransport.Stub {
        TransportImpl(android.app.backup.BackupTransport p0) { super(); }
        public void name(com.android.internal.infra.AndroidFuture<java.lang.String> p0) throws android.os.RemoteException {}
        public void configurationIntent(com.android.internal.infra.AndroidFuture<android.content.Intent> p0) throws android.os.RemoteException {}
        public void currentDestinationString(com.android.internal.infra.AndroidFuture<java.lang.String> p0) throws android.os.RemoteException {}
        public void dataManagementIntent(com.android.internal.infra.AndroidFuture<android.content.Intent> p0) throws android.os.RemoteException {}
        public void dataManagementIntentLabel(com.android.internal.infra.AndroidFuture<java.lang.CharSequence> p0) throws android.os.RemoteException {}
        public void transportDirName(com.android.internal.infra.AndroidFuture<java.lang.String> p0) throws android.os.RemoteException {}
        public void requestBackupTime(com.android.internal.infra.AndroidFuture<java.lang.Long> p0) throws android.os.RemoteException {}
        public void initializeDevice(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException {}
        public void performBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2, com.android.internal.backup.ITransportStatusCallback p3) throws android.os.RemoteException {}
        public void clearBackupData(android.content.pm.PackageInfo p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException {}
        public void finishBackup(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException {}
        public void getAvailableRestoreSets(com.android.internal.infra.AndroidFuture<java.util.List<android.app.backup.RestoreSet>> p0) throws android.os.RemoteException {}
        public void getCurrentRestoreSet(com.android.internal.infra.AndroidFuture<java.lang.Long> p0) throws android.os.RemoteException {}
        public void startRestore(long p0, android.content.pm.PackageInfo[] p1, com.android.internal.backup.ITransportStatusCallback p2) throws android.os.RemoteException {}
        public void nextRestorePackage(com.android.internal.infra.AndroidFuture<android.app.backup.RestoreDescription> p0) throws android.os.RemoteException {}
        public void getRestoreData(android.os.ParcelFileDescriptor p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException {}
        public void finishRestore(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException {}
        public void requestFullBackupTime(com.android.internal.infra.AndroidFuture<java.lang.Long> p0) throws android.os.RemoteException {}
        public void performFullBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2, com.android.internal.backup.ITransportStatusCallback p3) throws android.os.RemoteException {}
        public void checkFullBackupSize(long p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException {}
        public void sendBackupData(int p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException {}
        public void cancelFullBackup(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException {}
        public void isAppEligibleForBackup(android.content.pm.PackageInfo p0, boolean p1, com.android.internal.infra.AndroidFuture<java.lang.Boolean> p2) throws android.os.RemoteException {}
        public void getBackupQuota(java.lang.String p0, boolean p1, com.android.internal.infra.AndroidFuture<java.lang.Long> p2) throws android.os.RemoteException {}
        public void getTransportFlags(com.android.internal.infra.AndroidFuture<java.lang.Integer> p0) throws android.os.RemoteException {}
        public void getNextFullRestoreDataChunk(android.os.ParcelFileDescriptor p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException {}
        public void abortFullRestore(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException {}
        public void getBackupManagerMonitor(com.android.internal.infra.AndroidFuture<android.app.backup.IBackupManagerMonitor> p0) {}
    }
}
