package com.android.internal.org.bouncycastle.asn1.ocsp;

public class BasicOCSPResponse extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    private com.android.internal.org.bouncycastle.asn1.ocsp.ResponseData tbsResponseData;
    private com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier signatureAlgorithm;
    private com.android.internal.org.bouncycastle.asn1.DERBitString signature;
    private com.android.internal.org.bouncycastle.asn1.ASN1Sequence certs;
    public BasicOCSPResponse(com.android.internal.org.bouncycastle.asn1.ocsp.ResponseData p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1, com.android.internal.org.bouncycastle.asn1.DERBitString p2, com.android.internal.org.bouncycastle.asn1.ASN1Sequence p3) { super(); }
    private BasicOCSPResponse(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public static com.android.internal.org.bouncycastle.asn1.ocsp.BasicOCSPResponse getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ocsp.BasicOCSPResponse getInstance(java.lang.Object p0) { return null; }
    public com.android.internal.org.bouncycastle.asn1.ocsp.ResponseData getTbsResponseData() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() { return null; }
    public com.android.internal.org.bouncycastle.asn1.DERBitString getSignature() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Sequence getCerts() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
