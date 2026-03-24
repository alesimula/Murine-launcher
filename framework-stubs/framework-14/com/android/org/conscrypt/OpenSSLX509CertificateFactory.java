package com.android.org.conscrypt;

public class OpenSSLX509CertificateFactory extends java.security.cert.CertificateFactorySpi {
    public OpenSSLX509CertificateFactory() { super(); }
    public java.security.cert.Certificate engineGenerateCertificate(java.io.InputStream p0) throws java.security.cert.CertificateException { return null; }
    public java.util.Collection<? extends java.security.cert.Certificate> engineGenerateCertificates(java.io.InputStream p0) throws java.security.cert.CertificateException { return null; }
    public java.security.cert.CRL engineGenerateCRL(java.io.InputStream p0) throws java.security.cert.CRLException { return null; }
    public java.util.Collection<? extends java.security.cert.CRL> engineGenerateCRLs(java.io.InputStream p0) throws java.security.cert.CRLException { return null; }
    public java.util.Iterator<java.lang.String> engineGetCertPathEncodings() { return null; }
    public java.security.cert.CertPath engineGenerateCertPath(java.io.InputStream p0) throws java.security.cert.CertificateException { return null; }
    public java.security.cert.CertPath engineGenerateCertPath(java.io.InputStream p0, java.lang.String p1) throws java.security.cert.CertificateException { return null; }
    public java.security.cert.CertPath engineGenerateCertPath(java.util.List<? extends java.security.cert.Certificate> p0) throws java.security.cert.CertificateException { return null; }

    private static abstract class Parser<T extends java.lang.Object> {
        T generateItem(java.io.InputStream p0) throws com.android.org.conscrypt.OpenSSLX509CertificateFactory.ParsingException { return null; }
        java.util.Collection<? extends T> generateItems(java.io.InputStream p0) throws com.android.org.conscrypt.OpenSSLX509CertificateFactory.ParsingException { return null; }
        protected abstract T fromX509PemInputStream(java.io.InputStream p0) throws com.android.org.conscrypt.OpenSSLX509CertificateFactory.ParsingException;
        protected abstract T fromX509DerInputStream(java.io.InputStream p0) throws com.android.org.conscrypt.OpenSSLX509CertificateFactory.ParsingException;
        protected abstract java.util.List<? extends T> fromPkcs7PemInputStream(java.io.InputStream p0) throws com.android.org.conscrypt.OpenSSLX509CertificateFactory.ParsingException;
        protected abstract java.util.List<? extends T> fromPkcs7DerInputStream(java.io.InputStream p0) throws com.android.org.conscrypt.OpenSSLX509CertificateFactory.ParsingException;
    }

    static class ParsingException extends java.lang.Exception {
        ParsingException(java.lang.String p0) { super(); }
        ParsingException(java.lang.Exception p0) { super(); }
        ParsingException(java.lang.String p0, java.lang.Exception p1) { super(); }
    }
}
