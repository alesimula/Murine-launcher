package com.android.org.conscrypt;

final class SSLNullSession implements com.android.org.conscrypt.ConscryptSession, java.lang.Cloneable {
    static final java.lang.String INVALID_CIPHER = "SSL_NULL_WITH_NULL_NULL";
    static com.android.org.conscrypt.ConscryptSession getNullSession() { return null; }
    public java.lang.String getRequestedServerName() { return null; }
    public java.util.List<byte[]> getStatusResponses() { return null; }
    public byte[] getPeerSignedCertificateTimestamp() { return null; }
    public int getApplicationBufferSize() { return 0; }
    public java.lang.String getApplicationProtocol() { return null; }
    public java.lang.String getCipherSuite() { return null; }
    public long getCreationTime() { return 0L; }
    public byte[] getId() { return null; }
    public long getLastAccessedTime() { return 0L; }
    public java.security.cert.Certificate[] getLocalCertificates() { return null; }
    public java.security.Principal getLocalPrincipal() { return null; }
    public int getPacketBufferSize() { return 0; }
    public javax.security.cert.X509Certificate[] getPeerCertificateChain() throws javax.net.ssl.SSLPeerUnverifiedException { return null; }
    public java.security.cert.X509Certificate[] getPeerCertificates() throws javax.net.ssl.SSLPeerUnverifiedException { return null; }
    public java.lang.String getPeerHost() { return null; }
    public int getPeerPort() { return 0; }
    public java.security.Principal getPeerPrincipal() throws javax.net.ssl.SSLPeerUnverifiedException { return null; }
    public java.lang.String getProtocol() { return null; }
    public javax.net.ssl.SSLSessionContext getSessionContext() { return null; }
    public java.lang.Object getValue(java.lang.String p0) { return null; }
    public java.lang.String[] getValueNames() { return null; }
    public void invalidate() {}
    public boolean isValid() { return false; }
    public void putValue(java.lang.String p0, java.lang.Object p1) {}
    public void removeValue(java.lang.String p0) {}

    private static class DefaultHolder {
        static final com.android.org.conscrypt.SSLNullSession NULL_SESSION = null;
    }
}
