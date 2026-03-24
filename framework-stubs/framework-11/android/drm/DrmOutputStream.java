package android.drm;

@java.lang.Deprecated
public class DrmOutputStream extends java.io.OutputStream {
    private static final java.lang.String TAG = "DrmOutputStream";
    private final android.drm.DrmManagerClient mClient = null;
    private final android.os.ParcelFileDescriptor mPfd = null;
    private final java.io.FileDescriptor mFd = null;
    private int mSessionId;
    public DrmOutputStream(android.drm.DrmManagerClient p0, android.os.ParcelFileDescriptor p1, java.lang.String p2) throws java.io.IOException { super(); }
    public void finish() throws java.io.IOException {}
    public void close() throws java.io.IOException {}
    public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
    public void write(int p0) throws java.io.IOException {}
}
