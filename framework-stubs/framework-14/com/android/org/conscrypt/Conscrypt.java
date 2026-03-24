package com.android.org.conscrypt;

public final class Conscrypt {
    public static boolean isAvailable() { return false; }
    public static boolean isBoringSslFIPSBuild() { return false; }
    public static com.android.org.conscrypt.Conscrypt.Version version() { return null; }
    public static void checkAvailability() {}
    public static boolean isConscrypt(java.security.Provider p0) { return false; }
    public static java.security.Provider newProvider() { return null; }
    @java.lang.Deprecated
    public static java.security.Provider newProvider(java.lang.String p0) { return null; }
    public static com.android.org.conscrypt.Conscrypt.ProviderBuilder newProviderBuilder() { return null; }
    public static int maxEncryptedPacketLength() { return 0; }
    public static javax.net.ssl.X509TrustManager getDefaultX509TrustManager() throws java.security.KeyManagementException { return null; }
    public static boolean isConscrypt(javax.net.ssl.SSLContext p0) { return false; }
    public static javax.net.ssl.SSLContextSpi newPreferredSSLContextSpi() { return null; }
    public static void setClientSessionCache(javax.net.ssl.SSLContext p0, com.android.org.conscrypt.SSLClientSessionCache p1) {}
    public static void setServerSessionCache(javax.net.ssl.SSLContext p0, com.android.org.conscrypt.SSLServerSessionCache p1) {}
    public static boolean isConscrypt(javax.net.ssl.SSLSocketFactory p0) { return false; }
    public static void setUseEngineSocketByDefault(boolean p0) {}
    public static void setUseEngineSocket(javax.net.ssl.SSLSocketFactory p0, boolean p1) {}
    public static boolean isConscrypt(javax.net.ssl.SSLServerSocketFactory p0) { return false; }
    public static void setUseEngineSocket(javax.net.ssl.SSLServerSocketFactory p0, boolean p1) {}
    public static boolean isConscrypt(javax.net.ssl.SSLSocket p0) { return false; }
    public static void setHostname(javax.net.ssl.SSLSocket p0, java.lang.String p1) {}
    public static java.lang.String getHostname(javax.net.ssl.SSLSocket p0) { return null; }
    public static java.lang.String getHostnameOrIP(javax.net.ssl.SSLSocket p0) { return null; }
    public static void setUseSessionTickets(javax.net.ssl.SSLSocket p0, boolean p1) {}
    public static void setChannelIdEnabled(javax.net.ssl.SSLSocket p0, boolean p1) {}
    public static byte[] getChannelId(javax.net.ssl.SSLSocket p0) throws javax.net.ssl.SSLException { return null; }
    public static void setChannelIdPrivateKey(javax.net.ssl.SSLSocket p0, java.security.PrivateKey p1) {}
    public static java.lang.String getApplicationProtocol(javax.net.ssl.SSLSocket p0) { return null; }
    public static void setApplicationProtocolSelector(javax.net.ssl.SSLSocket p0, com.android.org.conscrypt.ApplicationProtocolSelector p1) {}
    public static void setApplicationProtocols(javax.net.ssl.SSLSocket p0, java.lang.String[] p1) {}
    public static java.lang.String[] getApplicationProtocols(javax.net.ssl.SSLSocket p0) { return null; }
    public static byte[] getTlsUnique(javax.net.ssl.SSLSocket p0) { return null; }
    public static byte[] exportKeyingMaterial(javax.net.ssl.SSLSocket p0, java.lang.String p1, byte[] p2, int p3) throws javax.net.ssl.SSLException { return null; }
    public static boolean isConscrypt(javax.net.ssl.SSLEngine p0) { return false; }
    public static void setBufferAllocator(javax.net.ssl.SSLEngine p0, com.android.org.conscrypt.BufferAllocator p1) {}
    public static void setBufferAllocator(javax.net.ssl.SSLSocket p0, com.android.org.conscrypt.BufferAllocator p1) {}
    public static void setDefaultBufferAllocator(com.android.org.conscrypt.BufferAllocator p0) {}
    public static void setHostname(javax.net.ssl.SSLEngine p0, java.lang.String p1) {}
    public static java.lang.String getHostname(javax.net.ssl.SSLEngine p0) { return null; }
    public static int maxSealOverhead(javax.net.ssl.SSLEngine p0) { return 0; }
    public static void setHandshakeListener(javax.net.ssl.SSLEngine p0, com.android.org.conscrypt.HandshakeListener p1) {}
    public static void setChannelIdEnabled(javax.net.ssl.SSLEngine p0, boolean p1) {}
    public static byte[] getChannelId(javax.net.ssl.SSLEngine p0) throws javax.net.ssl.SSLException { return null; }
    public static void setChannelIdPrivateKey(javax.net.ssl.SSLEngine p0, java.security.PrivateKey p1) {}
    public static javax.net.ssl.SSLEngineResult unwrap(javax.net.ssl.SSLEngine p0, java.nio.ByteBuffer[] p1, java.nio.ByteBuffer[] p2) throws javax.net.ssl.SSLException { return null; }
    public static javax.net.ssl.SSLEngineResult unwrap(javax.net.ssl.SSLEngine p0, java.nio.ByteBuffer[] p1, int p2, int p3, java.nio.ByteBuffer[] p4, int p5, int p6) throws javax.net.ssl.SSLException { return null; }
    public static void setUseSessionTickets(javax.net.ssl.SSLEngine p0, boolean p1) {}
    public static void setApplicationProtocols(javax.net.ssl.SSLEngine p0, java.lang.String[] p1) {}
    public static java.lang.String[] getApplicationProtocols(javax.net.ssl.SSLEngine p0) { return null; }
    public static void setApplicationProtocolSelector(javax.net.ssl.SSLEngine p0, com.android.org.conscrypt.ApplicationProtocolSelector p1) {}
    public static java.lang.String getApplicationProtocol(javax.net.ssl.SSLEngine p0) { return null; }
    public static byte[] getTlsUnique(javax.net.ssl.SSLEngine p0) { return null; }
    public static byte[] exportKeyingMaterial(javax.net.ssl.SSLEngine p0, java.lang.String p1, byte[] p2, int p3) throws javax.net.ssl.SSLException { return null; }
    public static boolean isConscrypt(javax.net.ssl.TrustManager p0) { return false; }
    public static synchronized void setDefaultHostnameVerifier(com.android.org.conscrypt.ConscryptHostnameVerifier p0) {}
    public static synchronized com.android.org.conscrypt.ConscryptHostnameVerifier getDefaultHostnameVerifier(javax.net.ssl.TrustManager p0) { return null; }
    public static void setHostnameVerifier(javax.net.ssl.TrustManager p0, com.android.org.conscrypt.ConscryptHostnameVerifier p1) {}
    public static com.android.org.conscrypt.ConscryptHostnameVerifier getHostnameVerifier(javax.net.ssl.TrustManager p0) { return null; }
    public static com.android.org.conscrypt.ConscryptHostnameVerifier wrapHostnameVerifier(javax.net.ssl.HostnameVerifier p0) { return null; }

    public static class ProviderBuilder {
        public com.android.org.conscrypt.Conscrypt.ProviderBuilder setName(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public com.android.org.conscrypt.Conscrypt.ProviderBuilder provideTrustManager() { return null; }
        public com.android.org.conscrypt.Conscrypt.ProviderBuilder provideTrustManager(boolean p0) { return null; }
        public com.android.org.conscrypt.Conscrypt.ProviderBuilder defaultTlsProtocol(java.lang.String p0) { return null; }
        public java.security.Provider build() { return null; }
    }

    public static class Version {
        public int major() { return 0; }
        public int minor() { return 0; }
        public int patch() { return 0; }
    }
}
