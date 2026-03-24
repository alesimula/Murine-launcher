package com.android.internal.org.bouncycastle.asn1;

public class BERGenerator extends com.android.internal.org.bouncycastle.asn1.ASN1Generator {
    private boolean _tagged;
    private boolean _isExplicit;
    private int _tagNo;
    protected BERGenerator(java.io.OutputStream p0) { super(null); }
    protected BERGenerator(java.io.OutputStream p0, int p1, boolean p2) { super(null); }
    public java.io.OutputStream getRawOutputStream() { return null; }
    private void writeHdr(int p0) throws java.io.IOException {}
    protected void writeBERHeader(int p0) throws java.io.IOException {}
    protected void writeBEREnd() throws java.io.IOException {}
}
