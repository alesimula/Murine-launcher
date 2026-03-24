package android.app.backup;

public abstract class BlobBackupHelper extends android.app.backup.BackupHelperWithLogger {
    public BlobBackupHelper(int p0, java.lang.String... p1) { super(); }
    protected abstract byte[] getBackupPayload(java.lang.String p0);
    protected abstract void applyRestoredPayload(java.lang.String p0, byte[] p1);
    public void performBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2) {}
    public void restoreEntity(android.app.backup.BackupDataInputStream p0) {}
    public void writeNewStateDescription(android.os.ParcelFileDescriptor p0) {}
}
