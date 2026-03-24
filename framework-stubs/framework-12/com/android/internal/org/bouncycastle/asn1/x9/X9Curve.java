package com.android.internal.org.bouncycastle.asn1.x9;

public class X9Curve extends com.android.internal.org.bouncycastle.asn1.ASN1Object implements com.android.internal.org.bouncycastle.asn1.x9.X9ObjectIdentifiers {
    private com.android.internal.org.bouncycastle.math.ec.ECCurve curve;
    private byte[] seed;
    private com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier fieldIdentifier;
    public X9Curve(com.android.internal.org.bouncycastle.math.ec.ECCurve p0) { super(); }
    public X9Curve(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, byte[] p1) { super(); }
    public X9Curve(com.android.internal.org.bouncycastle.asn1.x9.X9FieldID p0, java.math.BigInteger p1, java.math.BigInteger p2, com.android.internal.org.bouncycastle.asn1.ASN1Sequence p3) { super(); }
    private void setFieldIdentifier() {}
    public com.android.internal.org.bouncycastle.math.ec.ECCurve getCurve() { return null; }
    public byte[] getSeed() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
