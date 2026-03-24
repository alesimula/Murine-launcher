package com.android.internal.org.bouncycastle.asn1.x509;

public class Certificate extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    com.android.internal.org.bouncycastle.asn1.ASN1Sequence seq;
    com.android.internal.org.bouncycastle.asn1.x509.TBSCertificate tbsCert;
    com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier sigAlgId;
    com.android.internal.org.bouncycastle.asn1.DERBitString sig;
    public static com.android.internal.org.bouncycastle.asn1.x509.Certificate getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.Certificate getInstance(java.lang.Object p0) { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.TBSCertificate getTBSCertificate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getVersion() { return null; }
    public int getVersionNumber() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getSerialNumber() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getIssuer() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Time getStartDate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Time getEndDate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getSubject() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getSubjectPublicKeyInfo() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() { return null; }
    public com.android.internal.org.bouncycastle.asn1.DERBitString getSignature() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
