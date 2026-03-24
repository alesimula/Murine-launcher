package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509;

public class CertificateFactory extends java.security.cert.CertificateFactorySpi {
    private final com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper bcHelper = null;
    private static final com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil PEM_CERT_PARSER = null;
    private static final com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil PEM_CRL_PARSER = null;
    private static final com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil PEM_PKCS7_PARSER = null;
    private com.android.internal.org.bouncycastle.asn1.ASN1Set sData;
    private int sDataObjectCount;
    private java.io.InputStream currentStream;
    private com.android.internal.org.bouncycastle.asn1.ASN1Set sCrlData;
    private int sCrlDataObjectCount;
    private java.io.InputStream currentCrlStream;
    public CertificateFactory() { super(); }
    private java.security.cert.Certificate readDERCertificate(com.android.internal.org.bouncycastle.asn1.ASN1InputStream p0) throws java.io.IOException, java.security.cert.CertificateParsingException { return null; }
    private java.security.cert.Certificate readPEMCertificate(java.io.InputStream p0) throws java.io.IOException, java.security.cert.CertificateParsingException { return null; }
    private java.security.cert.Certificate getCertificate(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) throws java.security.cert.CertificateParsingException { return null; }
    private java.security.cert.Certificate getCertificate() throws java.security.cert.CertificateParsingException { return null; }
    protected java.security.cert.CRL createCRL(com.android.internal.org.bouncycastle.asn1.x509.CertificateList p0) throws java.security.cert.CRLException { return null; }
    private java.security.cert.CRL readPEMCRL(java.io.InputStream p0) throws java.io.IOException, java.security.cert.CRLException { return null; }
    private java.security.cert.CRL readDERCRL(com.android.internal.org.bouncycastle.asn1.ASN1InputStream p0) throws java.io.IOException, java.security.cert.CRLException { return null; }
    private java.security.cert.CRL getCRL(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) throws java.security.cert.CRLException { return null; }
    private java.security.cert.CRL getCRL() throws java.security.cert.CRLException { return null; }
    public java.security.cert.Certificate engineGenerateCertificate(java.io.InputStream p0) throws java.security.cert.CertificateException { return null; }
    public java.util.Collection engineGenerateCertificates(java.io.InputStream p0) throws java.security.cert.CertificateException { return null; }
    public java.security.cert.CRL engineGenerateCRL(java.io.InputStream p0) throws java.security.cert.CRLException { return null; }
    public java.util.Collection engineGenerateCRLs(java.io.InputStream p0) throws java.security.cert.CRLException { return null; }
    public java.util.Iterator engineGetCertPathEncodings() { return null; }
    public java.security.cert.CertPath engineGenerateCertPath(java.io.InputStream p0) throws java.security.cert.CertificateException { return null; }
    public java.security.cert.CertPath engineGenerateCertPath(java.io.InputStream p0, java.lang.String p1) throws java.security.cert.CertificateException { return null; }
    public java.security.cert.CertPath engineGenerateCertPath(java.util.List p0) throws java.security.cert.CertificateException { return null; }

    private class ExCertificateException extends java.security.cert.CertificateException {
        private java.lang.Throwable cause;
        public ExCertificateException(com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory p0, java.lang.Throwable p1) { super(); }
        public ExCertificateException(com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory p0, java.lang.String p1, java.lang.Throwable p2) { super(); }
        public java.lang.Throwable getCause() { return null; }
    }
}
