package com.android.org.conscrypt;

public class TrustManagerImpl {
    public TrustManagerImpl(java.security.KeyStore p0, com.android.org.conscrypt.CertPinManager p1, com.android.org.conscrypt.ConscryptCertStore p2) {}
    public java.util.List checkServerTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, java.lang.String p2) { return null; }
    public void checkClientTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1) {}
    public void checkClientTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, java.net.Socket p2) {}
    public void checkClientTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, javax.net.ssl.SSLEngine p2) {}
    public java.util.List getTrustedChainForServer(java.security.cert.X509Certificate[] p0, java.lang.String p1, java.net.Socket p2) { return null; }
    public java.util.List getTrustedChainForServer(java.security.cert.X509Certificate[] p0, java.lang.String p1, javax.net.ssl.SSLEngine p2) { return null; }
    public void handleTrustStorageUpdate() {}
}
