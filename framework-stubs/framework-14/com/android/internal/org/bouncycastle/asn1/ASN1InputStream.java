package com.android.internal.org.bouncycastle.asn1;

public class ASN1InputStream extends java.io.FilterInputStream implements com.android.internal.org.bouncycastle.asn1.BERTags {
    public ASN1InputStream(java.io.InputStream p0) { super(null); }
    public ASN1InputStream(byte[] p0) { super(null); }
    public ASN1InputStream(byte[] p0, boolean p1) { super(null); }
    public ASN1InputStream(java.io.InputStream p0, int p1) { super(null); }
    public ASN1InputStream(java.io.InputStream p0, boolean p1) { super(null); }
    public ASN1InputStream(java.io.InputStream p0, int p1, boolean p2) { super(null); }
    int getLimit() { return 0; }
    protected int readLength() throws java.io.IOException { return 0; }
    protected void readFully(byte[] p0) throws java.io.IOException {}
    protected com.android.internal.org.bouncycastle.asn1.ASN1Primitive buildObject(int p0, int p1, int p2) throws java.io.IOException { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1EncodableVector readVector(com.android.internal.org.bouncycastle.asn1.DefiniteLengthInputStream p0) throws java.io.IOException { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive readObject() throws java.io.IOException { return null; }
    static int readTagNumber(java.io.InputStream p0, int p1) throws java.io.IOException { return 0; }
    static int readLength(java.io.InputStream p0, int p1, boolean p2) throws java.io.IOException { return 0; }
    static com.android.internal.org.bouncycastle.asn1.ASN1Primitive createPrimitiveDERObject(int p0, com.android.internal.org.bouncycastle.asn1.DefiniteLengthInputStream p1, byte[][] p2) throws java.io.IOException { return null; }
}
