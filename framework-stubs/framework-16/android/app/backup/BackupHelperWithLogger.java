package android.app.backup;

public abstract class BackupHelperWithLogger implements android.app.backup.BackupHelper {
    public BackupHelperWithLogger() {}
    public abstract void writeNewStateDescription(android.os.ParcelFileDescriptor p0);
    public abstract void restoreEntity(android.app.backup.BackupDataInputStream p0);
    public abstract void performBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2);
    public android.app.backup.BackupRestoreEventLogger getLogger() { return null; }
    public void setLogger(android.app.backup.BackupRestoreEventLogger p0) {}
    public boolean isLoggerSet() { return false; }
}
