package android.app.backup;

public class FileBackupHelper extends android.app.backup.FileBackupHelperBase implements android.app.backup.BackupHelper {
    private static final java.lang.String TAG = "FileBackupHelper";
    private static final boolean DEBUG = false;
    android.content.Context mContext;
    java.io.File mFilesDir;
    java.lang.String[] mFiles;
    public FileBackupHelper(android.content.Context p0, java.lang.String... p1) { super(null); }
    public void performBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2) {}
    public void restoreEntity(android.app.backup.BackupDataInputStream p0) {}
}
