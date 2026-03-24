package android.app.backup;

public class BackupDataOutput {
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
}
