package com.android.internal.org.bouncycastle.x509;

public interface X509AttributeCertificate extends java.security.cert.X509Extension {
    public int getVersion();
    public java.math.BigInteger getSerialNumber();
    public java.util.Date getNotBefore();
    public java.util.Date getNotAfter();
    public com.android.internal.org.bouncycastle.x509.AttributeCertificateHolder getHolder();
    public com.android.internal.org.bouncycastle.x509.AttributeCertificateIssuer getIssuer();
    public com.android.internal.org.bouncycastle.x509.X509Attribute[] getAttributes();
    public com.android.internal.org.bouncycastle.x509.X509Attribute[] getAttributes(java.lang.String p0);
    public boolean[] getIssuerUniqueID();
    public void checkValidity() throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException;
    public void checkValidity(java.util.Date p0) throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException;
    public byte[] getSignature();
    public void verify(java.security.PublicKey p0, java.lang.String p1) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException;
    public byte[] getEncoded() throws java.io.IOException;
}
