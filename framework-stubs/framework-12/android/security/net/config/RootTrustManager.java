package android.security.net.config;

public class RootTrustManager extends javax.net.ssl.X509ExtendedTrustManager {
    private final android.security.net.config.ApplicationConfig mConfig = null;
    public RootTrustManager(android.security.net.config.ApplicationConfig p0) { super(); }
    public void checkClientTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1) throws java.security.cert.CertificateException {}
    public void checkClientTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, java.net.Socket p2) throws java.security.cert.CertificateException {}
    public void checkClientTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, javax.net.ssl.SSLEngine p2) throws java.security.cert.CertificateException {}
    public void checkServerTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, java.net.Socket p2) throws java.security.cert.CertificateException {}
    public void checkServerTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, javax.net.ssl.SSLEngine p2) throws java.security.cert.CertificateException {}
    public void checkServerTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1) throws java.security.cert.CertificateException {}
    public java.util.List<java.security.cert.X509Certificate> checkServerTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, java.lang.String p2) throws java.security.cert.CertificateException { return null; }
    public java.security.cert.X509Certificate[] getAcceptedIssuers() { return null; }
    public boolean isSameTrustConfiguration(java.lang.String p0, java.lang.String p1) { return false; }
}
