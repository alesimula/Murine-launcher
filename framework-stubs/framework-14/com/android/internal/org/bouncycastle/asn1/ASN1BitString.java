package com.android.internal.org.bouncycastle.asn1;

public abstract class ASN1BitString extends com.android.internal.org.bouncycastle.asn1.ASN1Primitive implements com.android.internal.org.bouncycastle.asn1.ASN1String {
    protected final byte[] data = null;
    protected final int padBits = 0;
    protected static int getPadBits(int p0) { return 0; }
    protected static byte[] getBytes(int p0) { return null; }
    protected ASN1BitString(byte p0, int p1) { super(); }
    public ASN1BitString(byte[] p0, int p1) { super(); }
    public java.lang.String getString() { return null; }
    public int intValue() { return 0; }
    public byte[] getOctets() { return null; }
    public byte[] getBytes() { return null; }
    public int getPadBits() { return 0; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    boolean asn1Equals(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) { return false; }
    static com.android.internal.org.bouncycastle.asn1.ASN1BitString fromInputStream(int p0, java.io.InputStream p1) throws java.io.IOException { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive getLoadedObject() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDERObject() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDLObject() { return null; }
    abstract void encode(com.android.internal.org.bouncycastle.asn1.ASN1OutputStream p0, boolean p1) throws java.io.IOException;
}
