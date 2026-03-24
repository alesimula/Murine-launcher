package com.android.internal.org.bouncycastle.cert.ocsp;

public class CertificateID {
    public static final com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier HASH_SHA1 = null;
    public CertificateID(com.android.internal.org.bouncycastle.asn1.ocsp.CertID p0) {}
    public CertificateID(com.android.internal.org.bouncycastle.operator.DigestCalculator p0, com.android.internal.org.bouncycastle.cert.X509CertificateHolder p1, java.math.BigInteger p2) throws com.android.internal.org.bouncycastle.cert.ocsp.OCSPException {}
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getHashAlgOID() { return null; }
    public byte[] getIssuerNameHash() { return null; }
    public byte[] getIssuerKeyHash() { return null; }
    public java.math.BigInteger getSerialNumber() { return null; }
    public boolean matchesIssuer(com.android.internal.org.bouncycastle.cert.X509CertificateHolder p0, com.android.internal.org.bouncycastle.operator.DigestCalculatorProvider p1) throws com.android.internal.org.bouncycastle.cert.ocsp.OCSPException { return false; }
    public com.android.internal.org.bouncycastle.asn1.ocsp.CertID toASN1Primitive() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public static com.android.internal.org.bouncycastle.cert.ocsp.CertificateID deriveCertificateID(com.android.internal.org.bouncycastle.cert.ocsp.CertificateID p0, java.math.BigInteger p1) { return null; }
}
