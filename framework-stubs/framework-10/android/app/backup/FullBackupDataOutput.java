package android.app.backup;

public class FullBackupDataOutput {
    @android.annotation.UnsupportedAppUsage
    private final android.app.backup.BackupDataOutput mData = null;
    private final long mQuota = 0L;
    private final int mTransportFlags = 0;
    private long mSize;
    public long getQuota() { return 0L; }
    public int getTransportFlags() { return 0; }
    public FullBackupDataOutput(long p0) {}
    public FullBackupDataOutput(long p0, int p1) {}
    public FullBackupDataOutput(android.os.ParcelFileDescriptor p0, long p1) {}
    public FullBackupDataOutput(android.os.ParcelFileDescriptor p0, long p1, int p2) {}
    @android.annotation.UnsupportedAppUsage
    public FullBackupDataOutput(android.os.ParcelFileDescriptor p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.app.backup.BackupDataOutput getData() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void addSize(long p0) {}
    public long getSize() { return 0L; }
}
