package com.android.internal.org.bouncycastle.asn1.x509;

public class X509CertificateStructure extends com.android.internal.org.bouncycastle.asn1.ASN1Object implements com.android.internal.org.bouncycastle.asn1.x509.X509ObjectIdentifiers, com.android.internal.org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers {
    com.android.internal.org.bouncycastle.asn1.ASN1Sequence seq;
    com.android.internal.org.bouncycastle.asn1.x509.TBSCertificateStructure tbsCert;
    com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier sigAlgId;
    com.android.internal.org.bouncycastle.asn1.ASN1BitString sig;
    public static com.android.internal.org.bouncycastle.asn1.x509.X509CertificateStructure getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.X509CertificateStructure getInstance(java.lang.Object p0) { return null; }
    public X509CertificateStructure(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public com.android.internal.org.bouncycastle.asn1.x509.TBSCertificateStructure getTBSCertificate() { return null; }
    public int getVersion() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getSerialNumber() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getIssuer() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Time getStartDate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Time getEndDate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getSubject() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getSubjectPublicKeyInfo() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1BitString getSignature() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
