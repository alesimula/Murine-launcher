package com.android.internal.org.bouncycastle.asn1;

public abstract class ASN1BitString extends com.android.internal.org.bouncycastle.asn1.ASN1Primitive implements com.android.internal.org.bouncycastle.asn1.ASN1String, com.android.internal.org.bouncycastle.asn1.ASN1BitStringParser {
    static final com.android.internal.org.bouncycastle.asn1.ASN1UniversalType TYPE = null;
    final byte[] contents = null;
    public static com.android.internal.org.bouncycastle.asn1.ASN1BitString getInstance(java.lang.Object p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1BitString getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    protected static int getPadBits(int p0) { return 0; }
    protected static byte[] getBytes(int p0) { return null; }
    ASN1BitString(byte p0, int p1) { super(); }
    ASN1BitString(byte[] p0, int p1) { super(); }
    ASN1BitString(byte[] p0, boolean p1) { super(); }
    public java.io.InputStream getBitStream() throws java.io.IOException { return null; }
    public java.io.InputStream getOctetStream() throws java.io.IOException { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1BitStringParser parser() { return null; }
    public java.lang.String getString() { return null; }
    public int intValue() { return 0; }
    public byte[] getOctets() { return null; }
    public byte[] getBytes() { return null; }
    public int getPadBits() { return 0; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    boolean asn1Equals(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) { return false; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive getLoadedObject() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDERObject() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDLObject() { return null; }
    static com.android.internal.org.bouncycastle.asn1.ASN1BitString createPrimitive(byte[] p0) { return null; }
}
