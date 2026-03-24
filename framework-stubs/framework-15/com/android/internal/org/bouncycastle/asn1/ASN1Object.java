package com.android.internal.org.bouncycastle.asn1;

public abstract class ASN1Object implements com.android.internal.org.bouncycastle.asn1.ASN1Encodable, com.android.internal.org.bouncycastle.util.Encodable {
    public ASN1Object() {}
    public void encodeTo(java.io.OutputStream p0) throws java.io.IOException {}
    public void encodeTo(java.io.OutputStream p0, java.lang.String p1) throws java.io.IOException {}
    public byte[] getEncoded() throws java.io.IOException { return null; }
    public byte[] getEncoded(java.lang.String p0) throws java.io.IOException { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Object() { return null; }
    protected static boolean hasEncodedTagValue(java.lang.Object p0, int p1) { return false; }
    public abstract com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive();
}
