package android.app.backup;

public class BackupHelperDispatcher {
    private static final java.lang.String TAG = "BackupHelperDispatcher";
    java.util.TreeMap<java.lang.String, android.app.backup.BackupHelper> mHelpers;
    public BackupHelperDispatcher() {}
    public void addHelper(java.lang.String p0, android.app.backup.BackupHelper p1) {}
    public void performBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2) throws java.io.IOException {}
    private void doOneBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2, android.app.backup.BackupHelperDispatcher.Header p3, android.app.backup.BackupHelper p4) throws java.io.IOException {}
    public void performRestore(android.app.backup.BackupDataInput p0, int p1, android.os.ParcelFileDescriptor p2) throws java.io.IOException {}
    private static native int readHeader_native(android.app.backup.BackupHelperDispatcher.Header p0, java.io.FileDescriptor p1);
    private static native int skipChunk_native(java.io.FileDescriptor p0, int p1);
    private static native int allocateHeader_native(android.app.backup.BackupHelperDispatcher.Header p0, java.io.FileDescriptor p1);
    private static native int writeHeader_native(android.app.backup.BackupHelperDispatcher.Header p0, java.io.FileDescriptor p1, int p2);

    private static class Header {
        @android.annotation.UnsupportedAppUsage
        int chunkSize;
        @android.annotation.UnsupportedAppUsage
        java.lang.String keyPrefix;
        private Header() {}
    }
}
