package com.android.internal.org.bouncycastle.x509;

public class AttributeCertificateHolder implements java.security.cert.CertSelector, com.android.internal.org.bouncycastle.util.Selector {
    final com.android.internal.org.bouncycastle.asn1.x509.Holder holder = null;
    AttributeCertificateHolder(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) {}
    public AttributeCertificateHolder(com.android.internal.org.bouncycastle.jce.X509Principal p0, java.math.BigInteger p1) {}
    public AttributeCertificateHolder(javax.security.auth.x500.X500Principal p0, java.math.BigInteger p1) {}
    public AttributeCertificateHolder(java.security.cert.X509Certificate p0) throws java.security.cert.CertificateParsingException {}
    public AttributeCertificateHolder(com.android.internal.org.bouncycastle.jce.X509Principal p0) {}
    public AttributeCertificateHolder(javax.security.auth.x500.X500Principal p0) {}
    public AttributeCertificateHolder(int p0, java.lang.String p1, java.lang.String p2, byte[] p3) {}
    public int getDigestedObjectType() { return 0; }
    public java.lang.String getDigestAlgorithm() { return null; }
    public byte[] getObjectDigest() { return null; }
    public java.lang.String getOtherObjectTypeID() { return null; }
    public java.security.Principal[] getEntityNames() { return null; }
    public java.security.Principal[] getIssuer() { return null; }
    public java.math.BigInteger getSerialNumber() { return null; }
    public java.lang.Object clone() { return null; }
    public boolean match(java.security.cert.Certificate p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean match(java.lang.Object p0) { return false; }
}
