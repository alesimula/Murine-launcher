package android.app.backup;

public class FullBackup {
    static final java.lang.String TAG = "FullBackup";
    static final java.lang.String TAG_XML_PARSER = "BackupXmlParserLogging";
    public static final java.lang.String APK_TREE_TOKEN = "a";
    public static final java.lang.String OBB_TREE_TOKEN = "obb";
    public static final java.lang.String KEY_VALUE_DATA_TOKEN = "k";
    public static final java.lang.String ROOT_TREE_TOKEN = "r";
    public static final java.lang.String FILES_TREE_TOKEN = "f";
    public static final java.lang.String NO_BACKUP_TREE_TOKEN = "nb";
    public static final java.lang.String DATABASE_TREE_TOKEN = "db";
    public static final java.lang.String SHAREDPREFS_TREE_TOKEN = "sp";
    public static final java.lang.String CACHE_TREE_TOKEN = "c";
    public static final java.lang.String DEVICE_ROOT_TREE_TOKEN = "d_r";
    public static final java.lang.String DEVICE_FILES_TREE_TOKEN = "d_f";
    public static final java.lang.String DEVICE_NO_BACKUP_TREE_TOKEN = "d_nb";
    public static final java.lang.String DEVICE_DATABASE_TREE_TOKEN = "d_db";
    public static final java.lang.String DEVICE_SHAREDPREFS_TREE_TOKEN = "d_sp";
    public static final java.lang.String DEVICE_CACHE_TREE_TOKEN = "d_c";
    public static final java.lang.String MANAGED_EXTERNAL_TREE_TOKEN = "ef";
    public static final java.lang.String SHARED_STORAGE_TOKEN = "shared";
    public static final java.lang.String APPS_PREFIX = "apps/";
    public static final java.lang.String SHARED_PREFIX = "shared/";
    public static final java.lang.String FULL_BACKUP_INTENT_ACTION = "fullback";
    public static final java.lang.String FULL_RESTORE_INTENT_ACTION = "fullrest";
    public static final java.lang.String CONF_TOKEN_INTENT_EXTRA = "conftoken";
    public static final java.lang.String FLAG_REQUIRED_CLIENT_SIDE_ENCRYPTION = "clientSideEncryption";
    public static final java.lang.String FLAG_REQUIRED_DEVICE_TO_DEVICE_TRANSFER = "deviceToDeviceTransfer";
    public static final java.lang.String FLAG_REQUIRED_FAKE_CLIENT_SIDE_ENCRYPTION = "fakeClientSideEncryption";
    public FullBackup() {}
    public static native int backupToTar(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, android.app.backup.FullBackupDataOutput p5);
    static synchronized android.app.backup.FullBackup.BackupScheme getBackupScheme(android.content.Context p0, int p1) { return null; }
    public static android.app.backup.FullBackup.BackupScheme getBackupSchemeForTest(android.content.Context p0) { return null; }
    public static void restoreFile(android.os.ParcelFileDescriptor p0, long p1, int p2, long p3, long p4, java.io.File p5) throws java.io.IOException {}

    public static class BackupScheme {
        final int mDataExtractionRules = 0;
        final int mFullBackupContent = 0;
        final int mOperationType = 0;
        final android.content.pm.PackageManager mPackageManager = null;
        final android.os.storage.StorageManager mStorageManager = null;
        final java.lang.String mPackageName = null;
        java.util.Map<java.lang.String, java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags>> mIncludes;
        android.util.ArraySet<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags> mExcludes;
        java.lang.String tokenToDirectoryPath(java.lang.String p0) { return null; }
        BackupScheme(android.content.Context p0, int p1) {}
        boolean isFullBackupEnabled(int p0) { return false; }
        boolean isFullRestoreEnabled() { return false; }
        boolean isFullBackupContentEnabled() { return false; }
        public synchronized java.util.Map<java.lang.String, java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags>> maybeParseAndGetCanonicalIncludePaths() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
        public synchronized android.util.ArraySet<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags> maybeParseAndGetCanonicalExcludePaths() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
        public synchronized int getRequiredTransportFlags() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return 0; }
        public boolean parseNewBackupSchemeFromXmlLocked(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags> p2, java.util.Map<java.lang.String, java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags>> p3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return false; }
        public void parseBackupSchemeFromXmlLocked(org.xmlpull.v1.XmlPullParser p0, java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags> p1, java.util.Map<java.lang.String, java.util.Set<android.app.backup.FullBackup.BackupScheme.PathWithRequiredFlags>> p2) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}

        public static class PathWithRequiredFlags {
            public PathWithRequiredFlags(java.lang.String p0, int p1) {}
            public java.lang.String getPath() { return null; }
            public int getRequiredFlags() { return 0; }
        }
    }

    private static class BackupSchemeId {
        final java.lang.String mPackageName = null;
        final int mOperationType = 0;
        BackupSchemeId(java.lang.String p0, int p1) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    static @interface ConfigSection {
        public static final java.lang.String CLOUD_BACKUP = "cloud-backup";
        public static final java.lang.String DEVICE_TRANSFER = "device-transfer";
    }
}
