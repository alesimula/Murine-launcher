package android.app.backup;

class FileBackupHelperBase {
    private static final java.lang.String TAG = "FileBackupHelperBase";
    long mPtr;
    android.content.Context mContext;
    boolean mExceptionLogged;
    FileBackupHelperBase(android.content.Context p0) {}
    protected void finalize() throws java.lang.Throwable {}
    static void performBackup_checked(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2, java.lang.String[] p3, java.lang.String[] p4) {}
    boolean writeFile(java.io.File p0, android.app.backup.BackupDataInputStream p1) { return false; }
    public void writeNewStateDescription(android.os.ParcelFileDescriptor p0) {}
    boolean isKeyInList(java.lang.String p0, java.lang.String[] p1) { return false; }
    private static native long ctor();
    private static native void dtor(long p0);
    private static native int performBackup_native(java.io.FileDescriptor p0, long p1, java.io.FileDescriptor p2, java.lang.String[] p3, java.lang.String[] p4);
    private static native int writeFile_native(long p0, java.lang.String p1, long p2);
    private static native int writeSnapshot_native(long p0, java.io.FileDescriptor p1);
}
