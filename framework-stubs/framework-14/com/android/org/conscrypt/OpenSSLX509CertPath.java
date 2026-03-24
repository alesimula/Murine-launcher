package com.android.org.conscrypt;

final class OpenSSLX509CertPath extends java.security.cert.CertPath {
    static java.util.Iterator<java.lang.String> getEncodingsIterator() { return null; }
    OpenSSLX509CertPath(java.util.List<? extends java.security.cert.X509Certificate> p0) { super(null); }
    public java.util.List<? extends java.security.cert.Certificate> getCertificates() { return null; }
    public byte[] getEncoded() throws java.security.cert.CertificateEncodingException { return null; }
    public byte[] getEncoded(java.lang.String p0) throws java.security.cert.CertificateEncodingException { return null; }
    public java.util.Iterator<java.lang.String> getEncodings() { return null; }
    static java.security.cert.CertPath fromEncoding(java.io.InputStream p0, java.lang.String p1) throws java.security.cert.CertificateException { return null; }
    static java.security.cert.CertPath fromEncoding(java.io.InputStream p0) throws java.security.cert.CertificateException { return null; }

    private static enum Encoding {
        PKI_PATH,
        PKCS7;
        static com.android.org.conscrypt.OpenSSLX509CertPath.Encoding findByApiName(java.lang.String p0) throws java.security.cert.CertificateEncodingException { return null; }
    }
}
