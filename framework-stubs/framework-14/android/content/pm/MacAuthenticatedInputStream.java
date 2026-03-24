package android.content.pm;

public class MacAuthenticatedInputStream extends java.io.FilterInputStream {
    public MacAuthenticatedInputStream(java.io.InputStream p0, javax.crypto.Mac p1) { super(null); }
    public boolean isTagEqual(byte[] p0) { return false; }
    public int read() throws java.io.IOException { return 0; }
    public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
}
