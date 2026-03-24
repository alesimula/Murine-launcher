package android.app.backup;

public class BackupHelperDispatcher {
    java.util.TreeMap<java.lang.String, android.app.backup.BackupHelper> mHelpers;
    public BackupHelperDispatcher() {}
    public void addHelper(java.lang.String p0, android.app.backup.BackupHelper p1) {}
    public void performBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2) throws java.io.IOException {}
    public void performRestore(android.app.backup.BackupDataInput p0, int p1, android.os.ParcelFileDescriptor p2) throws java.io.IOException {}

    private static class Header {
        int chunkSize;
        java.lang.String keyPrefix;
    }
}
