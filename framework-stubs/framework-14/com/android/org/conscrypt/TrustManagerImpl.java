package com.android.org.conscrypt;

public final class TrustManagerImpl extends javax.net.ssl.X509ExtendedTrustManager {
    public TrustManagerImpl(java.security.KeyStore p0) { super(); }
    public TrustManagerImpl(java.security.KeyStore p0, com.android.org.conscrypt.CertPinManager p1) { super(); }
    public TrustManagerImpl(java.security.KeyStore p0, com.android.org.conscrypt.CertPinManager p1, com.android.org.conscrypt.ConscryptCertStore p2) { super(); }
    public TrustManagerImpl(java.security.KeyStore p0, com.android.org.conscrypt.CertPinManager p1, com.android.org.conscrypt.ConscryptCertStore p2, com.android.org.conscrypt.CertBlocklist p3) { super(); }
    public TrustManagerImpl(java.security.KeyStore p0, com.android.org.conscrypt.CertPinManager p1, com.android.org.conscrypt.ConscryptCertStore p2, com.android.org.conscrypt.CertBlocklist p3, com.android.org.conscrypt.ct.CTLogStore p4, com.android.org.conscrypt.ct.CTVerifier p5, com.android.org.conscrypt.ct.CTPolicy p6) { super(); }
    public void checkClientTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1) throws java.security.cert.CertificateException {}
    public java.util.List<java.security.cert.X509Certificate> checkClientTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, java.lang.String p2) throws java.security.cert.CertificateException { return null; }
    public void checkClientTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, java.net.Socket p2) throws java.security.cert.CertificateException {}
    public void checkClientTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, javax.net.ssl.SSLEngine p2) throws java.security.cert.CertificateException {}
    public void checkServerTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1) throws java.security.cert.CertificateException {}
    public java.util.List<java.security.cert.X509Certificate> checkServerTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, java.lang.String p2) throws java.security.cert.CertificateException { return null; }
    public java.util.List<java.security.cert.X509Certificate> getTrustedChainForServer(java.security.cert.X509Certificate[] p0, java.lang.String p1, java.net.Socket p2) throws java.security.cert.CertificateException { return null; }
    public java.util.List<java.security.cert.X509Certificate> getTrustedChainForServer(java.security.cert.X509Certificate[] p0, java.lang.String p1, javax.net.ssl.SSLEngine p2) throws java.security.cert.CertificateException { return null; }
    public void checkServerTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, java.net.Socket p2) throws java.security.cert.CertificateException {}
    public void checkServerTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, javax.net.ssl.SSLEngine p2) throws java.security.cert.CertificateException {}
    public java.util.List<java.security.cert.X509Certificate> checkServerTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, javax.net.ssl.SSLSession p2) throws java.security.cert.CertificateException { return null; }
    public void handleTrustStorageUpdate() {}
    public java.security.cert.X509Certificate[] getAcceptedIssuers() { return null; }
    static synchronized void setDefaultHostnameVerifier(com.android.org.conscrypt.ConscryptHostnameVerifier p0) {}
    static synchronized com.android.org.conscrypt.ConscryptHostnameVerifier getDefaultHostnameVerifier() { return null; }
    void setHostnameVerifier(com.android.org.conscrypt.ConscryptHostnameVerifier p0) {}
    com.android.org.conscrypt.ConscryptHostnameVerifier getHostnameVerifier() { return null; }
    public void setCTEnabledOverride(boolean p0) {}
    public void setCTVerifier(com.android.org.conscrypt.ct.CTVerifier p0) {}
    public void setCTPolicy(com.android.org.conscrypt.ct.CTPolicy p0) {}

    private static class ExtendedKeyUsagePKIXCertPathChecker extends java.security.cert.PKIXCertPathChecker {
        public void init(boolean p0) throws java.security.cert.CertPathValidatorException {}
        public boolean isForwardCheckingSupported() { return false; }
        public java.util.Set<java.lang.String> getSupportedExtensions() { return null; }
        public void check(java.security.cert.Certificate p0, java.util.Collection<java.lang.String> p1) throws java.security.cert.CertPathValidatorException {}
    }

    private static abstract class TrustAnchorComparator implements java.util.Comparator<java.security.cert.TrustAnchor> {
        public int compare(java.security.cert.TrustAnchor p0, java.security.cert.TrustAnchor p1) { return 0; }
    }
}
