package com.android.internal.org.bouncycastle.asn1;

public abstract class ASN1OctetString extends com.android.internal.org.bouncycastle.asn1.ASN1Primitive implements com.android.internal.org.bouncycastle.asn1.ASN1OctetStringParser {
    byte[] string;
    public static com.android.internal.org.bouncycastle.asn1.ASN1OctetString getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1OctetString getInstance(java.lang.Object p0) { return null; }
    public ASN1OctetString(byte[] p0) { super(); }
    public java.io.InputStream getOctetStream() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1OctetStringParser parser() { return null; }
    public byte[] getOctets() { return null; }
    public int hashCode() { return 0; }
    boolean asn1Equals(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) { return false; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive getLoadedObject() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDERObject() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDLObject() { return null; }
    abstract void encode(com.android.internal.org.bouncycastle.asn1.ASN1OutputStream p0, boolean p1) throws java.io.IOException;
    public java.lang.String toString() { return null; }
}
