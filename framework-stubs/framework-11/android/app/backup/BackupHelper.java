package android.app.backup;

public interface BackupHelper {
    public void performBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2);
    public void restoreEntity(android.app.backup.BackupDataInputStream p0);
    public void writeNewStateDescription(android.os.ParcelFileDescriptor p0);
}
