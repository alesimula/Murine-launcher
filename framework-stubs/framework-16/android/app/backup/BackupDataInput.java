package android.app.backup;

public class BackupDataInput {
    long mBackupReader;
    @android.annotation.SystemApi
    public BackupDataInput(java.io.FileDescriptor p0) {}
    protected void finalize() throws java.lang.Throwable {}
    public boolean readNextHeader() throws java.io.IOException { return false; }
    public java.lang.String getKey() { return null; }
    public int getDataSize() { return 0; }
    public int readEntityData(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
    public void skipEntityData() throws java.io.IOException {}

    private static class EntityHeader {
        java.lang.String key;
        int dataSize;
    }
}
