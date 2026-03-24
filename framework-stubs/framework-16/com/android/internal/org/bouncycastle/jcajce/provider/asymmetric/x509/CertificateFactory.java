package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509;

public class CertificateFactory extends java.security.cert.CertificateFactorySpi {
    public CertificateFactory() { super(); }
    protected java.security.cert.CRL createCRL(com.android.internal.org.bouncycastle.asn1.x509.CertificateList p0) throws java.security.cert.CRLException { return null; }
    public java.security.cert.Certificate engineGenerateCertificate(java.io.InputStream p0) throws java.security.cert.CertificateException { return null; }
    public java.util.Collection engineGenerateCertificates(java.io.InputStream p0) throws java.security.cert.CertificateException { return null; }
    public java.security.cert.CRL engineGenerateCRL(java.io.InputStream p0) throws java.security.cert.CRLException { return null; }
    public java.util.Collection engineGenerateCRLs(java.io.InputStream p0) throws java.security.cert.CRLException { return null; }
    public java.util.Iterator engineGetCertPathEncodings() { return null; }
    public java.security.cert.CertPath engineGenerateCertPath(java.io.InputStream p0) throws java.security.cert.CertificateException { return null; }
    public java.security.cert.CertPath engineGenerateCertPath(java.io.InputStream p0, java.lang.String p1) throws java.security.cert.CertificateException { return null; }
    public java.security.cert.CertPath engineGenerateCertPath(java.util.List p0) throws java.security.cert.CertificateException { return null; }

    private static class ExCertificateException extends java.security.cert.CertificateException {
        public ExCertificateException(java.lang.Throwable p0) { super(); }
        public ExCertificateException(java.lang.String p0, java.lang.Throwable p1) { super(); }
        public java.lang.Throwable getCause() { return null; }
    }
}
