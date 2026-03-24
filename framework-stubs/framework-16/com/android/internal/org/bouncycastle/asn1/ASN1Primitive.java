package com.android.internal.org.bouncycastle.asn1;

public abstract class ASN1Primitive extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    ASN1Primitive() { super(); }
    public void encodeTo(java.io.OutputStream p0) throws java.io.IOException {}
    public void encodeTo(java.io.OutputStream p0, java.lang.String p1) throws java.io.IOException {}
    public static com.android.internal.org.bouncycastle.asn1.ASN1Primitive fromByteArray(byte[] p0) throws java.io.IOException { return null; }
    public final boolean equals(java.lang.Object p0) { return false; }
    public final boolean equals(com.android.internal.org.bouncycastle.asn1.ASN1Encodable p0) { return false; }
    public final boolean equals(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) { return false; }
    public final com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDERObject() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDLObject() { return null; }
    public abstract int hashCode();
    abstract boolean encodeConstructed();
    abstract int encodedLength(boolean p0) throws java.io.IOException;
    abstract void encode(com.android.internal.org.bouncycastle.asn1.ASN1OutputStream p0, boolean p1) throws java.io.IOException;
    abstract boolean asn1Equals(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0);
}
