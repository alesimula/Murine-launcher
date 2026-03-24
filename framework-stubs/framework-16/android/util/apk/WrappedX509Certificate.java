package android.util.apk;

class WrappedX509Certificate extends java.security.cert.X509Certificate {
    WrappedX509Certificate(java.security.cert.X509Certificate p0) { super(); }
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
    public java.lang.String toString() { return null; }
    public java.security.PublicKey getPublicKey() { return null; }
}
