package android.util;

public class AtomicFile {
    private static final java.lang.String LOG_TAG = "AtomicFile";
    private final java.io.File mBaseName = null;
    private final java.io.File mNewName = null;
    private final java.io.File mLegacyBackupName = null;
    private android.util.SystemConfigFileCommitEventLogger mCommitEventLogger;
    public AtomicFile(java.io.File p0) {}
    public AtomicFile(java.io.File p0, java.lang.String p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.SuppressLint("StreamFiles")
    public AtomicFile(java.io.File p0, android.util.SystemConfigFileCommitEventLogger p1) {}
    public java.io.File getBaseFile() { return null; }
    public void delete() {}
    public java.io.FileOutputStream startWrite() throws java.io.IOException { return null; }
    @java.lang.Deprecated
    public java.io.FileOutputStream startWrite(long p0) throws java.io.IOException { return null; }
    public void finishWrite(java.io.FileOutputStream p0) {}
    public void failWrite(java.io.FileOutputStream p0) {}
    @java.lang.Deprecated
    public void truncate() throws java.io.IOException {}
    @java.lang.Deprecated
    public java.io.FileOutputStream openAppend() throws java.io.IOException { return null; }
    public java.io.FileInputStream openRead() throws java.io.FileNotFoundException { return null; }
    public boolean exists() { return false; }
    public long getLastModifiedTime() { return 0L; }
    public byte[] readFully() throws java.io.IOException { return null; }
    public void write(java.util.function.Consumer<java.io.FileOutputStream> p0) {}
    private static void rename(java.io.File p0, java.io.File p1) {}
}
