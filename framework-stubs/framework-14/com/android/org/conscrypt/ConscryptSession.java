package com.android.org.conscrypt;

interface ConscryptSession extends javax.net.ssl.SSLSession {
    public java.lang.String getRequestedServerName();
    public java.util.List<byte[]> getStatusResponses();
    public byte[] getPeerSignedCertificateTimestamp();
    public java.security.cert.X509Certificate[] getPeerCertificates() throws javax.net.ssl.SSLPeerUnverifiedException;
    public java.lang.String getApplicationProtocol();
}
