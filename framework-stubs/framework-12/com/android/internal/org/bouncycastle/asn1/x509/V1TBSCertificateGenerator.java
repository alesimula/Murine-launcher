package com.android.internal.org.bouncycastle.asn1.x509;

public class V1TBSCertificateGenerator {
    com.android.internal.org.bouncycastle.asn1.DERTaggedObject version;
    com.android.internal.org.bouncycastle.asn1.ASN1Integer serialNumber;
    com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier signature;
    com.android.internal.org.bouncycastle.asn1.x500.X500Name issuer;
    com.android.internal.org.bouncycastle.asn1.x509.Time startDate;
    com.android.internal.org.bouncycastle.asn1.x509.Time endDate;
    com.android.internal.org.bouncycastle.asn1.x500.X500Name subject;
    com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo;
    public V1TBSCertificateGenerator() {}
    public void setSerialNumber(com.android.internal.org.bouncycastle.asn1.ASN1Integer p0) {}
    public void setSignature(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) {}
    public void setIssuer(com.android.internal.org.bouncycastle.asn1.x509.X509Name p0) {}
    public void setIssuer(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0) {}
    public void setStartDate(com.android.internal.org.bouncycastle.asn1.x509.Time p0) {}
    public void setStartDate(com.android.internal.org.bouncycastle.asn1.ASN1UTCTime p0) {}
    public void setEndDate(com.android.internal.org.bouncycastle.asn1.x509.Time p0) {}
    public void setEndDate(com.android.internal.org.bouncycastle.asn1.ASN1UTCTime p0) {}
    public void setSubject(com.android.internal.org.bouncycastle.asn1.x509.X509Name p0) {}
    public void setSubject(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0) {}
    public void setSubjectPublicKeyInfo(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) {}
    public com.android.internal.org.bouncycastle.asn1.x509.TBSCertificate generateTBSCertificate() { return null; }
}
