package android.media;

public final class ResampleInputStream extends java.io.InputStream {
    private static final java.lang.String TAG = "ResampleInputStream";
    private java.io.InputStream mInputStream;
    private final int mRateIn = 0;
    private final int mRateOut = 0;
    private byte[] mBuf;
    private int mBufCount;
    private static final int mFirLength = 29;
    private final byte[] mOneByte = null;
    public ResampleInputStream(java.io.InputStream p0, int p1, int p2) { super(); }
    public int read() throws java.io.IOException { return 0; }
    public int read(byte[] p0) throws java.io.IOException { return 0; }
    public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
    public void close() throws java.io.IOException {}
    protected void finalize() throws java.lang.Throwable {}
    private static native void fir21(byte[] p0, int p1, byte[] p2, int p3, int p4);
}
