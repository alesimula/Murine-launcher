package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509;

class X509CertificateObject extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl implements com.android.internal.org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    X509CertificateObject(com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper p0, com.android.internal.org.bouncycastle.asn1.x509.Certificate p1) throws java.security.cert.CertificateParsingException { super(null, null, null, null, null, null); }
    public void checkValidity(java.util.Date p0) throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {}
    public javax.security.auth.x500.X500Principal getIssuerX500Principal() { return null; }
    public java.security.PublicKey getPublicKey() { return null; }
    public javax.security.auth.x500.X500Principal getSubjectX500Principal() { return null; }
    public long[] getValidityValues() { return null; }
    public byte[] getEncoded() throws java.security.cert.CertificateEncodingException { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int originalHashCode() { return 0; }
    public void setBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p1) {}
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public java.util.Enumeration getBagAttributeKeys() { return null; }
}
