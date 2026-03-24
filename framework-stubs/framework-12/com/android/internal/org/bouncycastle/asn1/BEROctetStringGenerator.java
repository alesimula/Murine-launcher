package com.android.internal.org.bouncycastle.asn1;

public class BEROctetStringGenerator extends com.android.internal.org.bouncycastle.asn1.BERGenerator {
    public BEROctetStringGenerator(java.io.OutputStream p0) throws java.io.IOException { super((java.io.OutputStream)null); }
    public BEROctetStringGenerator(java.io.OutputStream p0, int p1, boolean p2) throws java.io.IOException { super((java.io.OutputStream)null); }
    public java.io.OutputStream getOctetOutputStream() { return null; }
    public java.io.OutputStream getOctetOutputStream(byte[] p0) { return null; }

    private class BufferedBEROctetStream extends java.io.OutputStream {
        private byte[] _buf;
        private int _off;
        private com.android.internal.org.bouncycastle.asn1.DEROutputStream _derOut;
        BufferedBEROctetStream(com.android.internal.org.bouncycastle.asn1.BEROctetStringGenerator p0, byte[] p1) { super(); }
        public void write(int p0) throws java.io.IOException {}
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void close() throws java.io.IOException {}
    }
}
