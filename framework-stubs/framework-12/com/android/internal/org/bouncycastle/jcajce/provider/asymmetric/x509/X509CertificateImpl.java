package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509;

abstract class X509CertificateImpl extends java.security.cert.X509Certificate implements com.android.internal.org.bouncycastle.jcajce.interfaces.BCX509Certificate {
    protected com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper bcHelper;
    protected com.android.internal.org.bouncycastle.asn1.x509.Certificate c;
    protected com.android.internal.org.bouncycastle.asn1.x509.BasicConstraints basicConstraints;
    protected boolean[] keyUsage;
    protected java.lang.String sigAlgName;
    protected byte[] sigAlgParams;
    X509CertificateImpl(com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper p0, com.android.internal.org.bouncycastle.asn1.x509.Certificate p1, com.android.internal.org.bouncycastle.asn1.x509.BasicConstraints p2, boolean[] p3, java.lang.String p4, byte[] p5) { super(); }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getIssuerX500Name() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.TBSCertificate getTBSCertificateNative() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getSubjectX500Name() { return null; }
    public void checkValidity() throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {}
    public void checkValidity(java.util.Date p0) throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {}
    public int getVersion() { return 0; }
    public java.math.BigInteger getSerialNumber() { return null; }
    public java.security.Principal getIssuerDN() { return null; }
    public javax.security.auth.x500.X500Principal getIssuerX500Principal() { return null; }
    public java.security.Principal getSubjectDN() { return null; }
    public javax.security.auth.x500.X500Principal getSubjectX500Principal() { return null; }
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
    public java.util.List getExtendedKeyUsage() throws java.security.cert.CertificateParsingException { return null; }
    public int getBasicConstraints() { return 0; }
    public java.util.Collection getSubjectAlternativeNames() throws java.security.cert.CertificateParsingException { return null; }
    public java.util.Collection getIssuerAlternativeNames() throws java.security.cert.CertificateParsingException { return null; }
    public java.util.Set getCriticalExtensionOIDs() { return null; }
    public byte[] getExtensionValue(java.lang.String p0) { return null; }
    public java.util.Set getNonCriticalExtensionOIDs() { return null; }
    public boolean hasUnsupportedCriticalExtension() { return false; }
    public java.security.PublicKey getPublicKey() { return null; }
    public byte[] getEncoded() throws java.security.cert.CertificateEncodingException { return null; }
    public java.lang.String toString() { return null; }
    public final void verify(java.security.PublicKey p0) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {}
    public final void verify(java.security.PublicKey p0, java.lang.String p1) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {}
    public final void verify(java.security.PublicKey p0, java.security.Provider p1) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException {}
    private void doVerify(java.security.PublicKey p0, com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator p1) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException, java.security.NoSuchProviderException {}
    private void checkSignature(java.security.PublicKey p0, java.security.Signature p1, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p2, byte[] p3) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {}
    private boolean isAlgIdEqual(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1) { return false; }
    private static java.util.Collection getAlternativeNames(com.android.internal.org.bouncycastle.asn1.x509.Certificate p0, java.lang.String p1) throws java.security.cert.CertificateParsingException { return null; }
    protected static byte[] getExtensionOctets(com.android.internal.org.bouncycastle.asn1.x509.Certificate p0, java.lang.String p1) { return null; }
    protected static com.android.internal.org.bouncycastle.asn1.ASN1OctetString getExtensionValue(com.android.internal.org.bouncycastle.asn1.x509.Certificate p0, java.lang.String p1) { return null; }
}
