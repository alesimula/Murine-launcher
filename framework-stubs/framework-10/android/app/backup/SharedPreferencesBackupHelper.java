package android.app.backup;

public class SharedPreferencesBackupHelper extends android.app.backup.FileBackupHelperBase implements android.app.backup.BackupHelper {
    private static final java.lang.String TAG = "SharedPreferencesBackupHelper";
    private static final boolean DEBUG = false;
    private android.content.Context mContext;
    private java.lang.String[] mPrefGroups;
    public SharedPreferencesBackupHelper(android.content.Context p0, java.lang.String... p1) { super(null); }
    public void performBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2) {}
    public void restoreEntity(android.app.backup.BackupDataInputStream p0) {}
}
