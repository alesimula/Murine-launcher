package com.android.internal.org.bouncycastle.x509;

public class X509V2AttributeCertificate implements com.android.internal.org.bouncycastle.x509.X509AttributeCertificate {
    private com.android.internal.org.bouncycastle.asn1.x509.AttributeCertificate cert;
    private java.util.Date notBefore;
    private java.util.Date notAfter;
    private static com.android.internal.org.bouncycastle.asn1.x509.AttributeCertificate getObject(java.io.InputStream p0) throws java.io.IOException { return null; }
    public X509V2AttributeCertificate(java.io.InputStream p0) throws java.io.IOException {}
    public X509V2AttributeCertificate(byte[] p0) throws java.io.IOException {}
    X509V2AttributeCertificate(com.android.internal.org.bouncycastle.asn1.x509.AttributeCertificate p0) throws java.io.IOException {}
    public int getVersion() { return 0; }
    public java.math.BigInteger getSerialNumber() { return null; }
    public com.android.internal.org.bouncycastle.x509.AttributeCertificateHolder getHolder() { return null; }
    public com.android.internal.org.bouncycastle.x509.AttributeCertificateIssuer getIssuer() { return null; }
    public java.util.Date getNotBefore() { return null; }
    public java.util.Date getNotAfter() { return null; }
    public boolean[] getIssuerUniqueID() { return null; }
    public void checkValidity() throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {}
    public void checkValidity(java.util.Date p0) throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {}
    public byte[] getSignature() { return null; }
    public final void verify(java.security.PublicKey p0, java.lang.String p1) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {}
    public byte[] getEncoded() throws java.io.IOException { return null; }
    public byte[] getExtensionValue(java.lang.String p0) { return null; }
    private java.util.Set getExtensionOIDs(boolean p0) { return null; }
    public java.util.Set getNonCriticalExtensionOIDs() { return null; }
    public java.util.Set getCriticalExtensionOIDs() { return null; }
    public boolean hasUnsupportedCriticalExtension() { return false; }
    public com.android.internal.org.bouncycastle.x509.X509Attribute[] getAttributes() { return null; }
    public com.android.internal.org.bouncycastle.x509.X509Attribute[] getAttributes(java.lang.String p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
