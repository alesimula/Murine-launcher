package com.android.org.conscrypt;

final class ExternalSession implements com.android.org.conscrypt.ConscryptSession {
    public ExternalSession(com.android.org.conscrypt.ExternalSession.Provider p0) {}
    public java.lang.String getRequestedServerName() { return null; }
    public java.util.List<byte[]> getStatusResponses() { return null; }
    public byte[] getPeerSignedCertificateTimestamp() { return null; }
    public byte[] getId() { return null; }
    public javax.net.ssl.SSLSessionContext getSessionContext() { return null; }
    public long getCreationTime() { return 0L; }
    public long getLastAccessedTime() { return 0L; }
    public void invalidate() {}
    public boolean isValid() { return false; }
    public java.security.cert.X509Certificate[] getPeerCertificates() throws javax.net.ssl.SSLPeerUnverifiedException { return null; }
    public java.security.cert.Certificate[] getLocalCertificates() { return null; }
    public javax.security.cert.X509Certificate[] getPeerCertificateChain() throws javax.net.ssl.SSLPeerUnverifiedException { return null; }
    public java.security.Principal getPeerPrincipal() throws javax.net.ssl.SSLPeerUnverifiedException { return null; }
    public java.security.Principal getLocalPrincipal() { return null; }
    public java.lang.String getCipherSuite() { return null; }
    public java.lang.String getProtocol() { return null; }
    public java.lang.String getPeerHost() { return null; }
    public int getPeerPort() { return 0; }
    public int getPacketBufferSize() { return 0; }
    public int getApplicationBufferSize() { return 0; }
    public java.lang.String getApplicationProtocol() { return null; }
    public java.lang.Object getValue(java.lang.String p0) { return null; }
    public java.lang.String[] getValueNames() { return null; }
    public void putValue(java.lang.String p0, java.lang.Object p1) {}
    void putValue(javax.net.ssl.SSLSession p0, java.lang.String p1, java.lang.Object p2) {}
    public void removeValue(java.lang.String p0) {}
    void removeValue(javax.net.ssl.SSLSession p0, java.lang.String p1) {}

    static interface Provider {
        public com.android.org.conscrypt.ConscryptSession provideSession();
    }
}
