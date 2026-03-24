package com.android.internal.org.bouncycastle.asn1.ocsp;

public class CertID extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier hashAlgorithm;
    com.android.internal.org.bouncycastle.asn1.ASN1OctetString issuerNameHash;
    com.android.internal.org.bouncycastle.asn1.ASN1OctetString issuerKeyHash;
    com.android.internal.org.bouncycastle.asn1.ASN1Integer serialNumber;
    public CertID(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.asn1.ASN1OctetString p1, com.android.internal.org.bouncycastle.asn1.ASN1OctetString p2, com.android.internal.org.bouncycastle.asn1.ASN1Integer p3) { super(); }
    public static com.android.internal.org.bouncycastle.asn1.ocsp.CertID getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ocsp.CertID getInstance(java.lang.Object p0) { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getHashAlgorithm() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1OctetString getIssuerNameHash() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1OctetString getIssuerKeyHash() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getSerialNumber() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
