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
    public static final java.lang.String EXTRA_TRANSPORT_REGISTRATION = "android.app.backup.extra.TRANSPORT_REGISTRATION";
    com.android.internal.backup.IBackupTransport mBinderImpl;
    public BackupTransport() {}
    public android.os.IBinder getBinder() { return null; }
    public java.lang.String name() { return null; }
    public android.content.Intent configurationIntent() { return null; }
    public java.lang.String currentDestinationString() { return null; }
    public android.content.Intent dataManagementIntent() { return null; }
    @java.lang.Deprecated
    public java.lang.String dataManagementLabel() { return null; }
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

    class TransportImpl extends com.android.internal.backup.IBackupTransport.Stub {
        TransportImpl(android.app.backup.BackupTransport p0) { super(); }
        public java.lang.String name() throws android.os.RemoteException { return null; }
        public android.content.Intent configurationIntent() throws android.os.RemoteException { return null; }
        public java.lang.String currentDestinationString() throws android.os.RemoteException { return null; }
        public android.content.Intent dataManagementIntent() { return null; }
        public java.lang.CharSequence dataManagementIntentLabel() { return null; }
        public java.lang.String transportDirName() throws android.os.RemoteException { return null; }
        public long requestBackupTime() throws android.os.RemoteException { return 0L; }
        public int initializeDevice() throws android.os.RemoteException { return 0; }
        public int performBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2) throws android.os.RemoteException { return 0; }
        public int clearBackupData(android.content.pm.PackageInfo p0) throws android.os.RemoteException { return 0; }
        public int finishBackup() throws android.os.RemoteException { return 0; }
        public android.app.backup.RestoreSet[] getAvailableRestoreSets() throws android.os.RemoteException { return null; }
        public long getCurrentRestoreSet() throws android.os.RemoteException { return 0L; }
        public int startRestore(long p0, android.content.pm.PackageInfo[] p1) throws android.os.RemoteException { return 0; }
        public android.app.backup.RestoreDescription nextRestorePackage() throws android.os.RemoteException { return null; }
        public int getRestoreData(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException { return 0; }
        public void finishRestore() throws android.os.RemoteException {}
        public long requestFullBackupTime() throws android.os.RemoteException { return 0L; }
        public int performFullBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2) throws android.os.RemoteException { return 0; }
        public int checkFullBackupSize(long p0) { return 0; }
        public int sendBackupData(int p0) throws android.os.RemoteException { return 0; }
        public void cancelFullBackup() throws android.os.RemoteException {}
        public boolean isAppEligibleForBackup(android.content.pm.PackageInfo p0, boolean p1) throws android.os.RemoteException { return false; }
        public long getBackupQuota(java.lang.String p0, boolean p1) { return 0L; }
        public int getTransportFlags() { return 0; }
        public int getNextFullRestoreDataChunk(android.os.ParcelFileDescriptor p0) { return 0; }
        public int abortFullRestore() { return 0; }
    }
}
