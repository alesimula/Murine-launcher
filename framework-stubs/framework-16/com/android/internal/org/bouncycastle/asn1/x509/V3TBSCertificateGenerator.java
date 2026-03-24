package com.android.internal.org.bouncycastle.asn1.x509;

public class V3TBSCertificateGenerator {
    com.android.internal.org.bouncycastle.asn1.DERTaggedObject version;
    com.android.internal.org.bouncycastle.asn1.ASN1Integer serialNumber;
    com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier signature;
    com.android.internal.org.bouncycastle.asn1.x500.X500Name issuer;
    com.android.internal.org.bouncycastle.asn1.x509.Time startDate;
    com.android.internal.org.bouncycastle.asn1.x509.Time endDate;
    com.android.internal.org.bouncycastle.asn1.x500.X500Name subject;
    com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo;
    com.android.internal.org.bouncycastle.asn1.x509.Extensions extensions;
    public V3TBSCertificateGenerator() {}
    public void setSerialNumber(com.android.internal.org.bouncycastle.asn1.ASN1Integer p0) {}
    public void setSignature(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) {}
    public void setIssuer(com.android.internal.org.bouncycastle.asn1.x509.X509Name p0) {}
    public void setIssuer(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0) {}
    public void setStartDate(com.android.internal.org.bouncycastle.asn1.ASN1UTCTime p0) {}
    public void setStartDate(com.android.internal.org.bouncycastle.asn1.x509.Time p0) {}
    public void setEndDate(com.android.internal.org.bouncycastle.asn1.ASN1UTCTime p0) {}
    public void setEndDate(com.android.internal.org.bouncycastle.asn1.x509.Time p0) {}
    public void setSubject(com.android.internal.org.bouncycastle.asn1.x509.X509Name p0) {}
    public void setSubject(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0) {}
    public void setIssuerUniqueID(com.android.internal.org.bouncycastle.asn1.DERBitString p0) {}
    public void setSubjectUniqueID(com.android.internal.org.bouncycastle.asn1.DERBitString p0) {}
    public void setSubjectPublicKeyInfo(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) {}
    public void setExtensions(com.android.internal.org.bouncycastle.asn1.x509.X509Extensions p0) {}
    public void setExtensions(com.android.internal.org.bouncycastle.asn1.x509.Extensions p0) {}
    public com.android.internal.org.bouncycastle.asn1.ASN1Sequence generatePreTBSCertificate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.TBSCertificate generateTBSCertificate() { return null; }
}
