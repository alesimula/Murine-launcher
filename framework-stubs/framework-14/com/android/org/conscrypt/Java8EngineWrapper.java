package com.android.org.conscrypt;

final class Java8EngineWrapper extends com.android.org.conscrypt.AbstractConscryptEngine {
    Java8EngineWrapper(com.android.org.conscrypt.ConscryptEngine p0) { super(); }
    static javax.net.ssl.SSLEngine getDelegate(javax.net.ssl.SSLEngine p0) { return null; }
    public javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer[] p0, java.nio.ByteBuffer p1) throws javax.net.ssl.SSLException { return null; }
    public javax.net.ssl.SSLParameters getSSLParameters() { return null; }
    public void setSSLParameters(javax.net.ssl.SSLParameters p0) {}
    void setBufferAllocator(com.android.org.conscrypt.BufferAllocator p0) {}
    int maxSealOverhead() { return 0; }
    void setChannelIdEnabled(boolean p0) {}
    byte[] getChannelId() throws javax.net.ssl.SSLException { return null; }
    void setChannelIdPrivateKey(java.security.PrivateKey p0) {}
    void setHandshakeListener(com.android.org.conscrypt.HandshakeListener p0) {}
    void setHostname(java.lang.String p0) {}
    java.lang.String getHostname() { return null; }
    public java.lang.String getPeerHost() { return null; }
    public int getPeerPort() { return 0; }
    public void beginHandshake() throws javax.net.ssl.SSLException {}
    public void closeInbound() throws javax.net.ssl.SSLException {}
    public void closeOutbound() {}
    public java.lang.Runnable getDelegatedTask() { return null; }
    public java.lang.String[] getEnabledCipherSuites() { return null; }
    public java.lang.String[] getEnabledProtocols() { return null; }
    public boolean getEnableSessionCreation() { return false; }
    public javax.net.ssl.SSLEngineResult.HandshakeStatus getHandshakeStatus() { return null; }
    public boolean getNeedClientAuth() { return false; }
    javax.net.ssl.SSLSession handshakeSession() { return null; }
    public javax.net.ssl.SSLSession getSession() { return null; }
    public java.lang.String[] getSupportedCipherSuites() { return null; }
    public java.lang.String[] getSupportedProtocols() { return null; }
    public boolean getUseClientMode() { return false; }
    public boolean getWantClientAuth() { return false; }
    public boolean isInboundDone() { return false; }
    public boolean isOutboundDone() { return false; }
    public void setEnabledCipherSuites(java.lang.String[] p0) {}
    public void setEnabledProtocols(java.lang.String[] p0) {}
    public void setEnableSessionCreation(boolean p0) {}
    public void setNeedClientAuth(boolean p0) {}
    public void setUseClientMode(boolean p0) {}
    public void setWantClientAuth(boolean p0) {}
    public javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1) throws javax.net.ssl.SSLException { return null; }
    public javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer p0, java.nio.ByteBuffer[] p1) throws javax.net.ssl.SSLException { return null; }
    public javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer p0, java.nio.ByteBuffer[] p1, int p2, int p3) throws javax.net.ssl.SSLException { return null; }
    javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer[] p0, java.nio.ByteBuffer[] p1) throws javax.net.ssl.SSLException { return null; }
    javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer[] p0, int p1, int p2, java.nio.ByteBuffer[] p3, int p4, int p5) throws javax.net.ssl.SSLException { return null; }
    public javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1) throws javax.net.ssl.SSLException { return null; }
    public javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer[] p0, int p1, int p2, java.nio.ByteBuffer p3) throws javax.net.ssl.SSLException { return null; }
    void setUseSessionTickets(boolean p0) {}
    void setApplicationProtocols(java.lang.String[] p0) {}
    java.lang.String[] getApplicationProtocols() { return null; }
    public java.lang.String getApplicationProtocol() { return null; }
    void setApplicationProtocolSelector(com.android.org.conscrypt.ApplicationProtocolSelector p0) {}
    byte[] getTlsUnique() { return null; }
    byte[] exportKeyingMaterial(java.lang.String p0, byte[] p1, int p2) throws javax.net.ssl.SSLException { return null; }
    public java.lang.String getHandshakeApplicationProtocol() { return null; }
    public void setHandshakeApplicationProtocolSelector(java.util.function.BiFunction<javax.net.ssl.SSLEngine, java.util.List<java.lang.String>, java.lang.String> p0) {}
    public java.util.function.BiFunction<javax.net.ssl.SSLEngine, java.util.List<java.lang.String>, java.lang.String> getHandshakeApplicationProtocolSelector() { return null; }
}
