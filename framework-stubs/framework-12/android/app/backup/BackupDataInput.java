package android.app.backup;

public class BackupDataInput {
    long mBackupReader;
    private android.app.backup.BackupDataInput.EntityHeader mHeader;
    private boolean mHeaderReady;
    @android.annotation.SystemApi
    public BackupDataInput(java.io.FileDescriptor p0) {}
    protected void finalize() throws java.lang.Throwable {}
    public boolean readNextHeader() throws java.io.IOException { return false; }
    public java.lang.String getKey() { return null; }
    public int getDataSize() { return 0; }
    public int readEntityData(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
    public void skipEntityData() throws java.io.IOException {}
    private static native long ctor(java.io.FileDescriptor p0);
    private static native void dtor(long p0);
    private native int readNextHeader_native(long p0, android.app.backup.BackupDataInput.EntityHeader p1);
    private native int readEntityData_native(long p0, byte[] p1, int p2, int p3);
    private native int skipEntityData_native(long p0);

    private static class EntityHeader {
        java.lang.String key;
        int dataSize;
        private EntityHeader() {}
    }
}
