package android.app.backup;

public class BackupDataOutput {
    private final long mQuota = 0L;
    private final int mTransportFlags = 0;
    long mBackupWriter;
    @android.annotation.SystemApi
    public BackupDataOutput(java.io.FileDescriptor p0) {}
    @android.annotation.SystemApi
    public BackupDataOutput(java.io.FileDescriptor p0, long p1) {}
    public BackupDataOutput(java.io.FileDescriptor p0, long p1, int p2) {}
    public long getQuota() { return 0L; }
    public int getTransportFlags() { return 0; }
    public int writeEntityHeader(java.lang.String p0, int p1) throws java.io.IOException { return 0; }
    public int writeEntityData(byte[] p0, int p1) throws java.io.IOException { return 0; }
    public void setKeyPrefix(java.lang.String p0) {}
    protected void finalize() throws java.lang.Throwable {}
    private static native long ctor(java.io.FileDescriptor p0);
    private static native void dtor(long p0);
    private static native int writeEntityHeader_native(long p0, java.lang.String p1, int p2);
    private static native int writeEntityData_native(long p0, byte[] p1, int p2);
    private static native void setKeyPrefix_native(long p0, java.lang.String p1);
}
