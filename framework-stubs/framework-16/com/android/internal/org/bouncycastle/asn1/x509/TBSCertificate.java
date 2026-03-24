package com.android.internal.org.bouncycastle.asn1.x509;

public class TBSCertificate extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    com.android.internal.org.bouncycastle.asn1.ASN1Sequence seq;
    com.android.internal.org.bouncycastle.asn1.ASN1Integer version;
    com.android.internal.org.bouncycastle.asn1.ASN1Integer serialNumber;
    com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier signature;
    com.android.internal.org.bouncycastle.asn1.x500.X500Name issuer;
    com.android.internal.org.bouncycastle.asn1.x509.Time startDate;
    com.android.internal.org.bouncycastle.asn1.x509.Time endDate;
    com.android.internal.org.bouncycastle.asn1.x500.X500Name subject;
    com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo;
    com.android.internal.org.bouncycastle.asn1.ASN1BitString issuerUniqueId;
    com.android.internal.org.bouncycastle.asn1.ASN1BitString subjectUniqueId;
    com.android.internal.org.bouncycastle.asn1.x509.Extensions extensions;
    public static com.android.internal.org.bouncycastle.asn1.x509.TBSCertificate getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.TBSCertificate getInstance(java.lang.Object p0) { return null; }
    public int getVersionNumber() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getVersion() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getSerialNumber() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignature() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getIssuer() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Time getStartDate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Time getEndDate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getSubject() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getSubjectPublicKeyInfo() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1BitString getIssuerUniqueId() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1BitString getSubjectUniqueId() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extensions getExtensions() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
