package com.android.internal.org.bouncycastle.jce.provider;

public class X509CRLObject extends java.security.cert.X509CRL {
    private com.android.internal.org.bouncycastle.asn1.x509.CertificateList c;
    private java.lang.String sigAlgName;
    private byte[] sigAlgParams;
    private boolean isIndirect;
    private boolean isHashCodeSet;
    private int hashCodeValue;
    public static boolean isIndirectCRL(java.security.cert.X509CRL p0) throws java.security.cert.CRLException { return false; }
    public X509CRLObject(com.android.internal.org.bouncycastle.asn1.x509.CertificateList p0) throws java.security.cert.CRLException { super(); }
    public boolean hasUnsupportedCriticalExtension() { return false; }
    private java.util.Set getExtensionOIDs(boolean p0) { return null; }
    public java.util.Set getCriticalExtensionOIDs() { return null; }
    public java.util.Set getNonCriticalExtensionOIDs() { return null; }
    public byte[] getExtensionValue(java.lang.String p0) { return null; }
    public byte[] getEncoded() throws java.security.cert.CRLException { return null; }
    public void verify(java.security.PublicKey p0) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {}
    public void verify(java.security.PublicKey p0, java.lang.String p1) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {}
    public void verify(java.security.PublicKey p0, java.security.Provider p1) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException {}
    private void doVerify(java.security.PublicKey p0, java.security.Signature p1) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException {}
    public int getVersion() { return 0; }
    public java.security.Principal getIssuerDN() { return null; }
    public javax.security.auth.x500.X500Principal getIssuerX500Principal() { return null; }
    public java.util.Date getThisUpdate() { return null; }
    public java.util.Date getNextUpdate() { return null; }
    private java.util.Set loadCRLEntries() { return null; }
    public java.security.cert.X509CRLEntry getRevokedCertificate(java.math.BigInteger p0) { return null; }
    public java.util.Set getRevokedCertificates() { return null; }
    public byte[] getTBSCertList() throws java.security.cert.CRLException { return null; }
    public byte[] getSignature() { return null; }
    public java.lang.String getSigAlgName() { return null; }
    public java.lang.String getSigAlgOID() { return null; }
    public byte[] getSigAlgParams() { return null; }
    public java.lang.String toString() { return null; }
    public boolean isRevoked(java.security.cert.Certificate p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
