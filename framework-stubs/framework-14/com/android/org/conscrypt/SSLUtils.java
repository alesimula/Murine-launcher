package com.android.org.conscrypt;

final class SSLUtils {
    static final boolean USE_ENGINE_SOCKET_BY_DEFAULT = Boolean.valueOf(false);
    static java.security.cert.X509Certificate[] decodeX509CertificateChain(byte[][] p0) throws java.security.cert.CertificateException { return null; }
    static java.lang.String getServerX509KeyType(long p0) { return null; }
    static java.lang.String getClientKeyType(byte p0) { return null; }
    static java.lang.String getClientKeyTypeFromSignatureAlg(int p0) { return null; }
    static java.util.Set<java.lang.String> getSupportedClientKeyTypes(byte[] p0, int[] p1) { return null; }
    static byte[][] encodeSubjectX509Principals(java.security.cert.X509Certificate[] p0) throws java.security.cert.CertificateEncodingException { return null; }
    static javax.security.cert.X509Certificate[] toCertificateChain(java.security.cert.X509Certificate[] p0) throws javax.net.ssl.SSLPeerUnverifiedException { return null; }
    static int calculateOutNetBufSize(int p0) { return 0; }
    static javax.net.ssl.SSLHandshakeException toSSLHandshakeException(java.lang.Throwable p0) { return null; }
    static javax.net.ssl.SSLException toSSLException(java.lang.Throwable p0) { return null; }
    static java.lang.String toProtocolString(byte[] p0) { return null; }
    static byte[] toProtocolBytes(java.lang.String p0) { return null; }
    static java.lang.String[] decodeProtocols(byte[] p0) { return null; }
    static byte[] encodeProtocols(java.lang.String[] p0) { return null; }
    static int getEncryptedPacketLength(java.nio.ByteBuffer[] p0, int p1) { return 0; }
    static java.lang.String[] concat(java.lang.String[]... p0) { return null; }

    static final class EngineStates {
        static final int STATE_NEW = 0;
        static final int STATE_MODE_SET = 1;
        static final int STATE_HANDSHAKE_STARTED = 2;
        static final int STATE_HANDSHAKE_COMPLETED = 3;
        static final int STATE_READY_HANDSHAKE_CUT_THROUGH = 4;
        static final int STATE_READY = 5;
        static final int STATE_CLOSED_INBOUND = 6;
        static final int STATE_CLOSED_OUTBOUND = 7;
        static final int STATE_CLOSED = 8;
    }

    static enum SessionType {
        OPEN_SSL,
        OPEN_SSL_WITH_OCSP,
        OPEN_SSL_WITH_TLS_SCT;
        final int value = 0;
        static boolean isSupportedType(int p0) { return false; }
    }
}
