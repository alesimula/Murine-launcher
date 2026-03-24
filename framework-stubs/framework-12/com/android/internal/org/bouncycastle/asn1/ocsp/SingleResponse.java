package com.android.internal.org.bouncycastle.asn1.ocsp;

public class SingleResponse extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    private com.android.internal.org.bouncycastle.asn1.ocsp.CertID certID;
    private com.android.internal.org.bouncycastle.asn1.ocsp.CertStatus certStatus;
    private com.android.internal.org.bouncycastle.asn1.ASN1GeneralizedTime thisUpdate;
    private com.android.internal.org.bouncycastle.asn1.ASN1GeneralizedTime nextUpdate;
    private com.android.internal.org.bouncycastle.asn1.x509.Extensions singleExtensions;
    public SingleResponse(com.android.internal.org.bouncycastle.asn1.ocsp.CertID p0, com.android.internal.org.bouncycastle.asn1.ocsp.CertStatus p1, com.android.internal.org.bouncycastle.asn1.ASN1GeneralizedTime p2, com.android.internal.org.bouncycastle.asn1.ASN1GeneralizedTime p3, com.android.internal.org.bouncycastle.asn1.x509.X509Extensions p4) { super(); }
    public SingleResponse(com.android.internal.org.bouncycastle.asn1.ocsp.CertID p0, com.android.internal.org.bouncycastle.asn1.ocsp.CertStatus p1, com.android.internal.org.bouncycastle.asn1.ASN1GeneralizedTime p2, com.android.internal.org.bouncycastle.asn1.ASN1GeneralizedTime p3, com.android.internal.org.bouncycastle.asn1.x509.Extensions p4) { super(); }
    private SingleResponse(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public static com.android.internal.org.bouncycastle.asn1.ocsp.SingleResponse getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ocsp.SingleResponse getInstance(java.lang.Object p0) { return null; }
    public com.android.internal.org.bouncycastle.asn1.ocsp.CertID getCertID() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ocsp.CertStatus getCertStatus() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1GeneralizedTime getThisUpdate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1GeneralizedTime getNextUpdate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extensions getSingleExtensions() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
