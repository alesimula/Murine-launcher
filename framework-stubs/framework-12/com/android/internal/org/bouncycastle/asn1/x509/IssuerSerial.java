package com.android.internal.org.bouncycastle.asn1.x509;

public class IssuerSerial extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    com.android.internal.org.bouncycastle.asn1.x509.GeneralNames issuer;
    com.android.internal.org.bouncycastle.asn1.ASN1Integer serial;
    com.android.internal.org.bouncycastle.asn1.DERBitString issuerUID;
    public static com.android.internal.org.bouncycastle.asn1.x509.IssuerSerial getInstance(java.lang.Object p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.IssuerSerial getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    private IssuerSerial(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public IssuerSerial(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0, java.math.BigInteger p1) { super(); }
    public IssuerSerial(com.android.internal.org.bouncycastle.asn1.x509.GeneralNames p0, java.math.BigInteger p1) { super(); }
    public IssuerSerial(com.android.internal.org.bouncycastle.asn1.x509.GeneralNames p0, com.android.internal.org.bouncycastle.asn1.ASN1Integer p1) { super(); }
    public com.android.internal.org.bouncycastle.asn1.x509.GeneralNames getIssuer() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getSerial() { return null; }
    public com.android.internal.org.bouncycastle.asn1.DERBitString getIssuerUID() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
