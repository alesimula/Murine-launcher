package com.android.internal.org.bouncycastle.crypto.io;

public class MacInputStream extends java.io.FilterInputStream {
    protected com.android.internal.org.bouncycastle.crypto.Mac mac;
    public MacInputStream(java.io.InputStream p0, com.android.internal.org.bouncycastle.crypto.Mac p1) { super(null); }
    public int read() throws java.io.IOException { return 0; }
    public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
    public com.android.internal.org.bouncycastle.crypto.Mac getMac() { return null; }
}
