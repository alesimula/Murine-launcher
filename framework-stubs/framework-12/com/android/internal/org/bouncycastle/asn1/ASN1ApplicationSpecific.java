package com.android.internal.org.bouncycastle.asn1;

public abstract class ASN1ApplicationSpecific extends com.android.internal.org.bouncycastle.asn1.ASN1Primitive {
    protected final boolean isConstructed = false;
    protected final int tag = 0;
    protected final byte[] octets = null;
    ASN1ApplicationSpecific(boolean p0, int p1, byte[] p2) { super(); }
    public static com.android.internal.org.bouncycastle.asn1.ASN1ApplicationSpecific getInstance(java.lang.Object p0) { return null; }
    protected static int getLengthOfHeader(byte[] p0) { return 0; }
    public boolean isConstructed() { return false; }
    public byte[] getContents() { return null; }
    public int getApplicationTag() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive getObject() throws java.io.IOException { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive getObject(int p0) throws java.io.IOException { return null; }
    int encodedLength() throws java.io.IOException { return 0; }
    void encode(com.android.internal.org.bouncycastle.asn1.ASN1OutputStream p0, boolean p1) throws java.io.IOException {}
    boolean asn1Equals(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) { return false; }
    public int hashCode() { return 0; }
    private byte[] replaceTagNumber(int p0, byte[] p1) throws java.io.IOException { return null; }
    public java.lang.String toString() { return null; }
}
