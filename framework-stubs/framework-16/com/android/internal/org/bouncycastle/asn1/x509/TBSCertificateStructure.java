package com.android.internal.org.bouncycastle.asn1.x509;

public class TBSCertificateStructure extends com.android.internal.org.bouncycastle.asn1.ASN1Object implements com.android.internal.org.bouncycastle.asn1.x509.X509ObjectIdentifiers, com.android.internal.org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers {
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
    com.android.internal.org.bouncycastle.asn1.x509.X509Extensions extensions;
    public static com.android.internal.org.bouncycastle.asn1.x509.TBSCertificateStructure getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.TBSCertificateStructure getInstance(java.lang.Object p0) { return null; }
    public TBSCertificateStructure(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public int getVersion() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getVersionNumber() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getSerialNumber() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignature() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getIssuer() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Time getStartDate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Time getEndDate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getSubject() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getSubjectPublicKeyInfo() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1BitString getIssuerUniqueId() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1BitString getSubjectUniqueId() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.X509Extensions getExtensions() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
