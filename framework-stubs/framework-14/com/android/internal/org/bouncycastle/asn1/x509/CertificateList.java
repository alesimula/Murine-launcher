package com.android.internal.org.bouncycastle.asn1.x509;

public class CertificateList extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    com.android.internal.org.bouncycastle.asn1.x509.TBSCertList tbsCertList;
    com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier sigAlgId;
    com.android.internal.org.bouncycastle.asn1.DERBitString sig;
    boolean isHashCodeSet;
    int hashCodeValue;
    public static com.android.internal.org.bouncycastle.asn1.x509.CertificateList getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.CertificateList getInstance(java.lang.Object p0) { return null; }
    public CertificateList(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public com.android.internal.org.bouncycastle.asn1.x509.TBSCertList getTBSCertList() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.TBSCertList.CRLEntry[] getRevokedCertificates() { return null; }
    public java.util.Enumeration getRevokedCertificateEnumeration() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() { return null; }
    public com.android.internal.org.bouncycastle.asn1.DERBitString getSignature() { return null; }
    public int getVersionNumber() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getIssuer() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Time getThisUpdate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Time getNextUpdate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
    public int hashCode() { return 0; }
}
