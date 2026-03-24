package android.util;

public class Base64OutputStream extends java.io.FilterOutputStream {
    private final android.util.Base64.Coder coder = null;
    private final int flags = 0;
    private byte[] buffer;
    private int bpos;
    private static byte[] EMPTY;
    public Base64OutputStream(java.io.OutputStream p0, int p1) { super((java.io.OutputStream)null); }
    @android.annotation.UnsupportedAppUsage
    public Base64OutputStream(java.io.OutputStream p0, int p1, boolean p2) { super((java.io.OutputStream)null); }
    public void write(int p0) throws java.io.IOException {}
    private void flushBuffer() throws java.io.IOException {}
    public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
    public void close() throws java.io.IOException {}
    private void internalWrite(byte[] p0, int p1, int p2, boolean p3) throws java.io.IOException {}
    private byte[] embiggen(byte[] p0, int p1) { return null; }
}
