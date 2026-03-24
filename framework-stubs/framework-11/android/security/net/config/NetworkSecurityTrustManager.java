package android.security.net.config;

public class NetworkSecurityTrustManager extends javax.net.ssl.X509ExtendedTrustManager {
    private final android.security.net.config.NetworkSecurityConfig mNetworkSecurityConfig = null;
    private final java.lang.Object mIssuersLock = null;
    private java.security.cert.X509Certificate[] mIssuers;
    public NetworkSecurityTrustManager(android.security.net.config.NetworkSecurityConfig p0) { super(); }
    public void checkClientTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1) throws java.security.cert.CertificateException {}
    public void checkClientTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, java.net.Socket p2) throws java.security.cert.CertificateException {}
    public void checkClientTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, javax.net.ssl.SSLEngine p2) throws java.security.cert.CertificateException {}
    public void checkServerTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1) throws java.security.cert.CertificateException {}
    public void checkServerTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, java.net.Socket p2) throws java.security.cert.CertificateException {}
    public void checkServerTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, javax.net.ssl.SSLEngine p2) throws java.security.cert.CertificateException {}
    public java.util.List<java.security.cert.X509Certificate> checkServerTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, java.lang.String p2) throws java.security.cert.CertificateException { return null; }
    private void checkPins(java.util.List<java.security.cert.X509Certificate> p0) throws java.security.cert.CertificateException {}
    private boolean isPinningEnforced(java.util.List<java.security.cert.X509Certificate> p0) throws java.security.cert.CertificateException { return false; }
    public java.security.cert.X509Certificate[] getAcceptedIssuers() { return null; }
    public void handleTrustStorageUpdate() {}
}
