package org.apache.http.conn.ssl;

@java.lang.Deprecated
public class SSLSocketFactory implements org.apache.http.conn.scheme.LayeredSocketFactory {
    public static final java.lang.String TLS = "TLS";
    public static final java.lang.String SSL = "SSL";
    public static final java.lang.String SSLV2 = "SSLv2";
    public static final org.apache.http.conn.ssl.X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER = null;
    public static final org.apache.http.conn.ssl.X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = null;
    public static final org.apache.http.conn.ssl.X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = null;
    @android.annotation.UnsupportedAppUsage
    private final javax.net.ssl.SSLContext sslcontext = null;
    @android.annotation.UnsupportedAppUsage
    private final javax.net.ssl.SSLSocketFactory socketfactory = null;
    @android.annotation.UnsupportedAppUsage
    private final org.apache.http.conn.scheme.HostNameResolver nameResolver = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private org.apache.http.conn.ssl.X509HostnameVerifier hostnameVerifier;
    public static org.apache.http.conn.ssl.SSLSocketFactory getSocketFactory() { return null; }
    public SSLSocketFactory(java.lang.String p0, java.security.KeyStore p1, java.lang.String p2, java.security.KeyStore p3, java.security.SecureRandom p4, org.apache.http.conn.scheme.HostNameResolver p5) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException {}
    public SSLSocketFactory(java.security.KeyStore p0, java.lang.String p1, java.security.KeyStore p2) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException {}
    public SSLSocketFactory(java.security.KeyStore p0, java.lang.String p1) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException {}
    public SSLSocketFactory(java.security.KeyStore p0) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException {}
    @android.annotation.UnsupportedAppUsage
    public SSLSocketFactory(javax.net.ssl.SSLSocketFactory p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private SSLSocketFactory() {}
    @android.annotation.UnsupportedAppUsage
    private static javax.net.ssl.KeyManager[] createKeyManagers(java.security.KeyStore p0, java.lang.String p1) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException { return null; }
    @android.annotation.UnsupportedAppUsage
    private static javax.net.ssl.TrustManager[] createTrustManagers(java.security.KeyStore p0) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException { return null; }
    public java.net.Socket createSocket() throws java.io.IOException { return null; }
    public java.net.Socket connectSocket(java.net.Socket p0, java.lang.String p1, int p2, java.net.InetAddress p3, int p4, org.apache.http.params.HttpParams p5) throws java.io.IOException { return null; }
    public boolean isSecure(java.net.Socket p0) throws java.lang.IllegalArgumentException { return false; }
    public java.net.Socket createSocket(java.net.Socket p0, java.lang.String p1, int p2, boolean p3) throws java.io.IOException, java.net.UnknownHostException { return null; }
    public void setHostnameVerifier(org.apache.http.conn.ssl.X509HostnameVerifier p0) {}
    public org.apache.http.conn.ssl.X509HostnameVerifier getHostnameVerifier() { return null; }

    private static class NoPreloadHolder {
        private static final org.apache.http.conn.ssl.SSLSocketFactory DEFAULT_FACTORY = null;
        private NoPreloadHolder() {}
    }
}
