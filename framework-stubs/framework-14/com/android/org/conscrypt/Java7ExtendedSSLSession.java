package com.android.org.conscrypt;

class Java7ExtendedSSLSession extends javax.net.ssl.ExtendedSSLSession implements com.android.org.conscrypt.ConscryptSession {
    protected final com.android.org.conscrypt.ExternalSession delegate = null;
    Java7ExtendedSSLSession(com.android.org.conscrypt.ExternalSession p0) { super(); }
    public final java.lang.String[] getLocalSupportedSignatureAlgorithms() { return null; }
    public final java.lang.String[] getPeerSupportedSignatureAlgorithms() { return null; }
    public final java.lang.String getRequestedServerName() { return null; }
    public final java.util.List<byte[]> getStatusResponses() { return null; }
    public final byte[] getPeerSignedCertificateTimestamp() { return null; }
    public final byte[] getId() { return null; }
    public final javax.net.ssl.SSLSessionContext getSessionContext() { return null; }
    public final long getCreationTime() { return 0L; }
    public final long getLastAccessedTime() { return 0L; }
    public final void invalidate() {}
    public final boolean isValid() { return false; }
    public final void putValue(java.lang.String p0, java.lang.Object p1) {}
    public final java.lang.Object getValue(java.lang.String p0) { return null; }
    public final void removeValue(java.lang.String p0) {}
    public final java.lang.String[] getValueNames() { return null; }
    public java.security.cert.X509Certificate[] getPeerCertificates() throws javax.net.ssl.SSLPeerUnverifiedException { return null; }
    public final java.security.cert.Certificate[] getLocalCertificates() { return null; }
    public final javax.security.cert.X509Certificate[] getPeerCertificateChain() throws javax.net.ssl.SSLPeerUnverifiedException { return null; }
    public final java.security.Principal getPeerPrincipal() throws javax.net.ssl.SSLPeerUnverifiedException { return null; }
    public final java.security.Principal getLocalPrincipal() { return null; }
    public final java.lang.String getCipherSuite() { return null; }
    public final java.lang.String getProtocol() { return null; }
    public final java.lang.String getPeerHost() { return null; }
    public final int getPeerPort() { return 0; }
    public final int getPacketBufferSize() { return 0; }
    public final int getApplicationBufferSize() { return 0; }
    public java.lang.String getApplicationProtocol() { return null; }
}
