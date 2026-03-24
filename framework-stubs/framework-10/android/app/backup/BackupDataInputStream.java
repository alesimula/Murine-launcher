package android.app.backup;

public class BackupDataInputStream extends java.io.InputStream {
    @android.annotation.UnsupportedAppUsage
    java.lang.String key;
    @android.annotation.UnsupportedAppUsage
    int dataSize;
    android.app.backup.BackupDataInput mData;
    byte[] mOneByte;
    BackupDataInputStream(android.app.backup.BackupDataInput p0) { super(); }
    public int read() throws java.io.IOException { return 0; }
    public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
    public int read(byte[] p0) throws java.io.IOException { return 0; }
    public java.lang.String getKey() { return null; }
    public int size() { return 0; }
}
