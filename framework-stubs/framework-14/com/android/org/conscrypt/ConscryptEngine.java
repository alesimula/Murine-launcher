package com.android.org.conscrypt;

final class ConscryptEngine extends com.android.org.conscrypt.AbstractConscryptEngine implements com.android.org.conscrypt.NativeCrypto.SSLHandshakeCallbacks, com.android.org.conscrypt.SSLParametersImpl.AliasChooser, com.android.org.conscrypt.SSLParametersImpl.PSKCallbacks {
    ConscryptEngine(com.android.org.conscrypt.SSLParametersImpl p0) { super(); }
    ConscryptEngine(java.lang.String p0, int p1, com.android.org.conscrypt.SSLParametersImpl p2) { super(); }
    ConscryptEngine(com.android.org.conscrypt.SSLParametersImpl p0, com.android.org.conscrypt.PeerInfoProvider p1, com.android.org.conscrypt.SSLParametersImpl.AliasChooser p2) { super(); }
    static void setDefaultBufferAllocator(com.android.org.conscrypt.BufferAllocator p0) {}
    static com.android.org.conscrypt.BufferAllocator getDefaultBufferAllocator() { return null; }
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
    public void closeInbound() {}
    public void closeOutbound() {}
    public java.lang.Runnable getDelegatedTask() { return null; }
    public java.lang.String[] getEnabledCipherSuites() { return null; }
    public java.lang.String[] getEnabledProtocols() { return null; }
    public boolean getEnableSessionCreation() { return false; }
    public javax.net.ssl.SSLParameters getSSLParameters() { return null; }
    public void setSSLParameters(javax.net.ssl.SSLParameters p0) {}
    public javax.net.ssl.SSLEngineResult.HandshakeStatus getHandshakeStatus() { return null; }
    int pendingOutboundEncryptedBytes() { return 0; }
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
    public int clientPSKKeyRequested(java.lang.String p0, byte[] p1, byte[] p2) { return 0; }
    public int serverPSKKeyRequested(java.lang.String p0, java.lang.String p1, byte[] p2) { return 0; }
    public void onSSLStateChange(int p0, int p1) {}
    public void serverCertificateRequested() throws java.io.IOException {}
    public void onNewSessionEstablished(long p0) {}
    public long serverSessionRequested(byte[] p0) { return 0L; }
    public void verifyCertificateChain(byte[][] p0, java.lang.String p1) throws java.security.cert.CertificateException {}
    public void clientCertificateRequested(byte[] p0, int[] p1, byte[][] p2) throws java.security.cert.CertificateEncodingException, javax.net.ssl.SSLException {}
    protected void finalize() throws java.lang.Throwable {}
    public java.lang.String chooseServerAlias(javax.net.ssl.X509KeyManager p0, java.lang.String p1) { return null; }
    public java.lang.String chooseClientAlias(javax.net.ssl.X509KeyManager p0, javax.security.auth.x500.X500Principal[] p1, java.lang.String[] p2) { return null; }
    public java.lang.String chooseServerPSKIdentityHint(com.android.org.conscrypt.PSKKeyManager p0) { return null; }
    public java.lang.String chooseClientPSKIdentity(com.android.org.conscrypt.PSKKeyManager p0, java.lang.String p1) { return null; }
    public javax.crypto.SecretKey getPSKKey(com.android.org.conscrypt.PSKKeyManager p0, java.lang.String p1, java.lang.String p2) { return null; }
    void setUseSessionTickets(boolean p0) {}
    java.lang.String[] getApplicationProtocols() { return null; }
    void setApplicationProtocols(java.lang.String[] p0) {}
    void setApplicationProtocolSelector(com.android.org.conscrypt.ApplicationProtocolSelector p0) {}
    byte[] getTlsUnique() { return null; }
    byte[] exportKeyingMaterial(java.lang.String p0, byte[] p1, int p2) throws javax.net.ssl.SSLException { return null; }
    void setApplicationProtocolSelector(com.android.org.conscrypt.ApplicationProtocolSelectorAdapter p0) {}
    public int selectApplicationProtocol(byte[] p0) { return 0; }
    public java.lang.String getApplicationProtocol() { return null; }
    public java.lang.String getHandshakeApplicationProtocol() { return null; }
}
