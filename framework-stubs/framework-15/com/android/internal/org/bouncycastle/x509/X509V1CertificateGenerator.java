package com.android.internal.org.bouncycastle.x509;

public class X509V1CertificateGenerator {
    public X509V1CertificateGenerator() {}
    public void reset() {}
    public void setSerialNumber(java.math.BigInteger p0) {}
    public void setIssuerDN(javax.security.auth.x500.X500Principal p0) {}
    public void setIssuerDN(com.android.internal.org.bouncycastle.asn1.x509.X509Name p0) {}
    public void setNotBefore(java.util.Date p0) {}
    public void setNotAfter(java.util.Date p0) {}
    public void setSubjectDN(javax.security.auth.x500.X500Principal p0) {}
    public void setSubjectDN(com.android.internal.org.bouncycastle.asn1.x509.X509Name p0) {}
    public void setPublicKey(java.security.PublicKey p0) {}
    public void setSignatureAlgorithm(java.lang.String p0) {}
    public java.security.cert.X509Certificate generateX509Certificate(java.security.PrivateKey p0) throws java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException { return null; }
    public java.security.cert.X509Certificate generateX509Certificate(java.security.PrivateKey p0, java.security.SecureRandom p1) throws java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException { return null; }
    public java.security.cert.X509Certificate generateX509Certificate(java.security.PrivateKey p0, java.lang.String p1) throws java.security.NoSuchProviderException, java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException { return null; }
    public java.security.cert.X509Certificate generateX509Certificate(java.security.PrivateKey p0, java.lang.String p1, java.security.SecureRandom p2) throws java.security.NoSuchProviderException, java.lang.SecurityException, java.security.SignatureException, java.security.InvalidKeyException { return null; }
    public java.security.cert.X509Certificate generate(java.security.PrivateKey p0) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException { return null; }
    public java.security.cert.X509Certificate generate(java.security.PrivateKey p0, java.security.SecureRandom p1) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException { return null; }
    public java.security.cert.X509Certificate generate(java.security.PrivateKey p0, java.lang.String p1) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException { return null; }
    public java.security.cert.X509Certificate generate(java.security.PrivateKey p0, java.lang.String p1, java.security.SecureRandom p2) throws java.security.cert.CertificateEncodingException, java.lang.IllegalStateException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException { return null; }
    public java.util.Iterator getSignatureAlgNames() { return null; }
}
