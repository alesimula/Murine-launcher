package com.android.org.conscrypt;

final class OpenSSLX509CRL extends java.security.cert.X509CRL {
    static java.util.Date toDate(long p0) throws com.android.org.conscrypt.OpenSSLX509CertificateFactory.ParsingException { return null; }
    static com.android.org.conscrypt.OpenSSLX509CRL fromX509DerInputStream(java.io.InputStream p0) throws com.android.org.conscrypt.OpenSSLX509CertificateFactory.ParsingException { return null; }
    static java.util.List<com.android.org.conscrypt.OpenSSLX509CRL> fromPkcs7DerInputStream(java.io.InputStream p0) throws com.android.org.conscrypt.OpenSSLX509CertificateFactory.ParsingException { return null; }
    static com.android.org.conscrypt.OpenSSLX509CRL fromX509PemInputStream(java.io.InputStream p0) throws com.android.org.conscrypt.OpenSSLX509CertificateFactory.ParsingException { return null; }
    static java.util.List<com.android.org.conscrypt.OpenSSLX509CRL> fromPkcs7PemInputStream(java.io.InputStream p0) throws com.android.org.conscrypt.OpenSSLX509CertificateFactory.ParsingException { return null; }
    public java.util.Set<java.lang.String> getCriticalExtensionOIDs() { return null; }
    public byte[] getExtensionValue(java.lang.String p0) { return null; }
    public java.util.Set<java.lang.String> getNonCriticalExtensionOIDs() { return null; }
    public boolean hasUnsupportedCriticalExtension() { return false; }
    public byte[] getEncoded() throws java.security.cert.CRLException { return null; }
    public void verify(java.security.PublicKey p0) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {}
    public void verify(java.security.PublicKey p0, java.lang.String p1) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {}
    public int getVersion() { return 0; }
    public java.security.Principal getIssuerDN() { return null; }
    public javax.security.auth.x500.X500Principal getIssuerX500Principal() { return null; }
    public java.util.Date getThisUpdate() { return null; }
    public java.util.Date getNextUpdate() { return null; }
    public java.security.cert.X509CRLEntry getRevokedCertificate(java.math.BigInteger p0) { return null; }
    public java.security.cert.X509CRLEntry getRevokedCertificate(java.security.cert.X509Certificate p0) { return null; }
    public java.util.Set<? extends java.security.cert.X509CRLEntry> getRevokedCertificates() { return null; }
    public byte[] getTBSCertList() { return null; }
    public byte[] getSignature() { return null; }
    public java.lang.String getSigAlgName() { return null; }
    public java.lang.String getSigAlgOID() { return null; }
    public byte[] getSigAlgParams() { return null; }
    public boolean isRevoked(java.security.cert.Certificate p0) { return false; }
    public java.lang.String toString() { return null; }
    protected void finalize() throws java.lang.Throwable {}
}
