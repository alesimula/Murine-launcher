package android.util;

public class Base64InputStream extends java.io.FilterInputStream {
    private final android.util.Base64.Coder coder = null;
    private static byte[] EMPTY;
    private static final int BUFFER_SIZE = 2048;
    private boolean eof;
    private byte[] inputBuffer;
    private int outputStart;
    private int outputEnd;
    public Base64InputStream(java.io.InputStream p0, int p1) { super((java.io.InputStream)null); }
    public Base64InputStream(java.io.InputStream p0, int p1, boolean p2) { super((java.io.InputStream)null); }
    public boolean markSupported() { return false; }
    public void mark(int p0) {}
    public void reset() {}
    public void close() throws java.io.IOException {}
    public int available() { return 0; }
    public long skip(long p0) throws java.io.IOException { return 0L; }
    public int read() throws java.io.IOException { return 0; }
    public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
    private void refill() throws java.io.IOException {}
}
