package com.android.internal.org.bouncycastle.asn1.ocsp;

public class Signature extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier signatureAlgorithm;
    com.android.internal.org.bouncycastle.asn1.DERBitString signature;
    com.android.internal.org.bouncycastle.asn1.ASN1Sequence certs;
    public Signature(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.asn1.DERBitString p1) { super(); }
    public Signature(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.asn1.DERBitString p1, com.android.internal.org.bouncycastle.asn1.ASN1Sequence p2) { super(); }
    public static com.android.internal.org.bouncycastle.asn1.ocsp.Signature getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ocsp.Signature getInstance(java.lang.Object p0) { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() { return null; }
    public com.android.internal.org.bouncycastle.asn1.DERBitString getSignature() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Sequence getCerts() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
