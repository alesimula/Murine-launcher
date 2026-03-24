package com.android.org.conscrypt;

abstract class NativeSslSession {
    NativeSslSession() {}
    static com.android.org.conscrypt.NativeSslSession newInstance(com.android.org.conscrypt.NativeRef.SSL_SESSION p0, com.android.org.conscrypt.ConscryptSession p1) throws javax.net.ssl.SSLPeerUnverifiedException { return null; }
    static com.android.org.conscrypt.NativeSslSession newInstance(com.android.org.conscrypt.AbstractSessionContext p0, byte[] p1, java.lang.String p2, int p3) { return null; }
    abstract byte[] getId();
    abstract boolean isValid();
    abstract boolean isSingleUse();
    abstract void offerToResume(com.android.org.conscrypt.NativeSsl p0) throws javax.net.ssl.SSLException;
    abstract java.lang.String getCipherSuite();
    abstract java.lang.String getProtocol();
    abstract java.lang.String getPeerHost();
    abstract int getPeerPort();
    abstract byte[] getPeerOcspStapledResponse();
    abstract byte[] getPeerSignedCertificateTimestamp();
    abstract byte[] toBytes();
    abstract javax.net.ssl.SSLSession toSSLSession();

    private static final class Impl extends com.android.org.conscrypt.NativeSslSession {
        byte[] getId() { return null; }
        boolean isValid() { return false; }
        boolean isSingleUse() { return false; }
        void offerToResume(com.android.org.conscrypt.NativeSsl p0) throws javax.net.ssl.SSLException {}
        java.lang.String getCipherSuite() { return null; }
        java.lang.String getProtocol() { return null; }
        java.lang.String getPeerHost() { return null; }
        int getPeerPort() { return 0; }
        byte[] getPeerOcspStapledResponse() { return null; }
        byte[] getPeerSignedCertificateTimestamp() { return null; }
        byte[] toBytes() { return null; }
        javax.net.ssl.SSLSession toSSLSession() { return null; }
    }
}
