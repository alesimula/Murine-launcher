package com.android.org.conscrypt;

public final class OpenSSLX509Certificate extends java.security.cert.X509Certificate {
    OpenSSLX509Certificate(long p0) throws com.android.org.conscrypt.OpenSSLX509CertificateFactory.ParsingException { super(); }
    public static com.android.org.conscrypt.OpenSSLX509Certificate fromX509DerInputStream(java.io.InputStream p0) throws com.android.org.conscrypt.OpenSSLX509CertificateFactory.ParsingException { return null; }
    public static com.android.org.conscrypt.OpenSSLX509Certificate fromX509Der(byte[] p0) throws java.security.cert.CertificateEncodingException { return null; }
    public static java.util.List<com.android.org.conscrypt.OpenSSLX509Certificate> fromPkcs7DerInputStream(java.io.InputStream p0) throws com.android.org.conscrypt.OpenSSLX509CertificateFactory.ParsingException { return null; }
    public static com.android.org.conscrypt.OpenSSLX509Certificate fromX509PemInputStream(java.io.InputStream p0) throws com.android.org.conscrypt.OpenSSLX509CertificateFactory.ParsingException { return null; }
    public static java.util.List<com.android.org.conscrypt.OpenSSLX509Certificate> fromPkcs7PemInputStream(java.io.InputStream p0) throws com.android.org.conscrypt.OpenSSLX509CertificateFactory.ParsingException { return null; }
    public static com.android.org.conscrypt.OpenSSLX509Certificate fromCertificate(java.security.cert.Certificate p0) throws java.security.cert.CertificateEncodingException { return null; }
    public java.util.Set<java.lang.String> getCriticalExtensionOIDs() { return null; }
    public byte[] getExtensionValue(java.lang.String p0) { return null; }
    public java.util.Set<java.lang.String> getNonCriticalExtensionOIDs() { return null; }
    public boolean hasUnsupportedCriticalExtension() { return false; }
    public void checkValidity() throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {}
    public void checkValidity(java.util.Date p0) throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {}
    public int getVersion() { return 0; }
    public java.math.BigInteger getSerialNumber() { return null; }
    public java.security.Principal getIssuerDN() { return null; }
    public java.security.Principal getSubjectDN() { return null; }
    public java.util.Date getNotBefore() { return null; }
    public java.util.Date getNotAfter() { return null; }
    public byte[] getTBSCertificate() throws java.security.cert.CertificateEncodingException { return null; }
    public byte[] getSignature() { return null; }
    public java.lang.String getSigAlgName() { return null; }
    public java.lang.String getSigAlgOID() { return null; }
    public byte[] getSigAlgParams() { return null; }
    public boolean[] getIssuerUniqueID() { return null; }
    public boolean[] getSubjectUniqueID() { return null; }
    public boolean[] getKeyUsage() { return null; }
    public int getBasicConstraints() { return 0; }
    public byte[] getEncoded() throws java.security.cert.CertificateEncodingException { return null; }
    public void verify(java.security.PublicKey p0) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {}
    public void verify(java.security.PublicKey p0, java.lang.String p1) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {}
    public void verify(java.security.PublicKey p0, java.security.Provider p1) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException {}
    public java.lang.String toString() { return null; }
    public java.security.PublicKey getPublicKey() { return null; }
    public javax.security.auth.x500.X500Principal getIssuerX500Principal() { return null; }
    public javax.security.auth.x500.X500Principal getSubjectX500Principal() { return null; }
    public java.util.List<java.lang.String> getExtendedKeyUsage() { return null; }
    public java.util.Collection<java.util.List<?>> getSubjectAlternativeNames() throws java.security.cert.CertificateParsingException { return null; }
    public java.util.Collection<java.util.List<?>> getIssuerAlternativeNames() throws java.security.cert.CertificateParsingException { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public long getContext() { return 0L; }
    public byte[] getTBSCertificateWithoutExtension(java.lang.String p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}
}
