package com.android.org.conscrypt;

final class NativeSsl {
    static com.android.org.conscrypt.NativeSsl newInstance(com.android.org.conscrypt.SSLParametersImpl p0, com.android.org.conscrypt.NativeCrypto.SSLHandshakeCallbacks p1, com.android.org.conscrypt.SSLParametersImpl.AliasChooser p2, com.android.org.conscrypt.SSLParametersImpl.PSKCallbacks p3) throws javax.net.ssl.SSLException { return null; }
    com.android.org.conscrypt.NativeSsl.BioWrapper newBio() { return null; }
    void offerToResumeSession(long p0) throws javax.net.ssl.SSLException {}
    byte[] getSessionId() { return null; }
    long getTime() { return 0L; }
    long getTimeout() { return 0L; }
    void setTimeout(long p0) {}
    java.lang.String getCipherSuite() { return null; }
    java.security.cert.X509Certificate[] getPeerCertificates() throws java.security.cert.CertificateException { return null; }
    java.security.cert.X509Certificate[] getLocalCertificates() { return null; }
    byte[] getPeerCertificateOcspData() { return null; }
    byte[] getTlsUnique() { return null; }
    byte[] exportKeyingMaterial(java.lang.String p0, byte[] p1, int p2) throws javax.net.ssl.SSLException { return null; }
    byte[] getPeerTlsSctData() { return null; }
    int clientPSKKeyRequested(java.lang.String p0, byte[] p1, byte[] p2) { return 0; }
    int serverPSKKeyRequested(java.lang.String p0, java.lang.String p1, byte[] p2) { return 0; }
    void chooseClientCertificate(byte[] p0, int[] p1, byte[][] p2) throws javax.net.ssl.SSLException, java.security.cert.CertificateEncodingException {}
    java.lang.String getVersion() { return null; }
    java.lang.String getRequestedServerName() { return null; }
    byte[] getTlsChannelId() throws javax.net.ssl.SSLException { return null; }
    void initialize(java.lang.String p0, com.android.org.conscrypt.OpenSSLKey p1) throws java.io.IOException {}
    void configureServerCertificate() throws java.io.IOException {}
    void doHandshake(java.io.FileDescriptor p0, int p1) throws java.security.cert.CertificateException, java.io.IOException {}
    int doHandshake() throws java.io.IOException { return 0; }
    int read(java.io.FileDescriptor p0, byte[] p1, int p2, int p3, int p4) throws java.io.IOException { return 0; }
    void write(java.io.FileDescriptor p0, byte[] p1, int p2, int p3, int p4) throws java.io.IOException {}
    void interrupt() {}
    void shutdown(java.io.FileDescriptor p0) throws java.io.IOException {}
    void shutdown() throws java.io.IOException {}
    boolean wasShutdownReceived() { return false; }
    boolean wasShutdownSent() { return false; }
    int readDirectByteBuffer(long p0, int p1) throws java.io.IOException, java.security.cert.CertificateException { return 0; }
    int writeDirectByteBuffer(long p0, int p1) throws java.io.IOException { return 0; }
    void forceRead() throws java.io.IOException {}
    int getPendingReadableBytes() { return 0; }
    int getMaxSealOverhead() { return 0; }
    void close() {}
    boolean isClosed() { return false; }
    int getError(int p0) { return 0; }
    byte[] getApplicationProtocol() { return null; }
    protected final void finalize() throws java.lang.Throwable {}

    final class BioWrapper {
        int getPendingWrittenBytes() { return 0; }
        int writeDirectByteBuffer(long p0, int p1) throws java.io.IOException { return 0; }
        int readDirectByteBuffer(long p0, int p1) throws java.io.IOException { return 0; }
        void close() {}
    }
}
