package android.media;

public final class AmrInputStream extends java.io.InputStream {
    android.media.MediaCodec mCodec;
    android.media.MediaCodec.BufferInfo mInfo;
    boolean mSawOutputEOS;
    boolean mSawInputEOS;
    public AmrInputStream(java.io.InputStream p0) { super(); }
    public int read() throws java.io.IOException { return 0; }
    public int read(byte[] p0) throws java.io.IOException { return 0; }
    public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
    public void close() throws java.io.IOException {}
    protected void finalize() throws java.lang.Throwable {}
}
