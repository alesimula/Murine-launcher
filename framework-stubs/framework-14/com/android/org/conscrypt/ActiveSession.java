package com.android.org.conscrypt;

final class ActiveSession implements com.android.org.conscrypt.ConscryptSession {
    ActiveSession(com.android.org.conscrypt.NativeSsl p0, com.android.org.conscrypt.AbstractSessionContext p1) {}
    public byte[] getId() { return null; }
    public javax.net.ssl.SSLSessionContext getSessionContext() { return null; }
    public long getCreationTime() { return 0L; }
    public long getLastAccessedTime() { return 0L; }
    void setLastAccessedTime(long p0) {}
    public java.util.List<byte[]> getStatusResponses() { return null; }
    public byte[] getPeerSignedCertificateTimestamp() { return null; }
    public java.lang.String getRequestedServerName() { return null; }
    public void invalidate() {}
    public boolean isValid() { return false; }
    public void putValue(java.lang.String p0, java.lang.Object p1) {}
    public java.lang.Object getValue(java.lang.String p0) { return null; }
    public void removeValue(java.lang.String p0) {}
    public java.lang.String[] getValueNames() { return null; }
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
    void onPeerCertificatesReceived(java.lang.String p0, int p1, java.security.cert.X509Certificate[] p2) {}
    void onPeerCertificateAvailable(java.lang.String p0, int p1) throws java.security.cert.CertificateException {}
}
