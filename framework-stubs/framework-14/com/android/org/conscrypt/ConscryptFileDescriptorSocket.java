package com.android.org.conscrypt;

class ConscryptFileDescriptorSocket extends com.android.org.conscrypt.OpenSSLSocketImpl implements com.android.org.conscrypt.NativeCrypto.SSLHandshakeCallbacks, com.android.org.conscrypt.SSLParametersImpl.PSKCallbacks, com.android.org.conscrypt.SSLParametersImpl.AliasChooser {
    ConscryptFileDescriptorSocket(com.android.org.conscrypt.SSLParametersImpl p0) throws java.io.IOException { super(); }
    ConscryptFileDescriptorSocket(java.lang.String p0, int p1, com.android.org.conscrypt.SSLParametersImpl p2) throws java.io.IOException { super(); }
    ConscryptFileDescriptorSocket(java.net.InetAddress p0, int p1, com.android.org.conscrypt.SSLParametersImpl p2) throws java.io.IOException { super(); }
    ConscryptFileDescriptorSocket(java.lang.String p0, int p1, java.net.InetAddress p2, int p3, com.android.org.conscrypt.SSLParametersImpl p4) throws java.io.IOException { super(); }
    ConscryptFileDescriptorSocket(java.net.InetAddress p0, int p1, java.net.InetAddress p2, int p3, com.android.org.conscrypt.SSLParametersImpl p4) throws java.io.IOException { super(); }
    ConscryptFileDescriptorSocket(java.net.Socket p0, java.lang.String p1, int p2, boolean p3, com.android.org.conscrypt.SSLParametersImpl p4) throws java.io.IOException { super(); }
    public final void startHandshake() throws java.io.IOException {}
    public final void clientCertificateRequested(byte[] p0, int[] p1, byte[][] p2) throws java.security.cert.CertificateEncodingException, javax.net.ssl.SSLException {}
    public final int clientPSKKeyRequested(java.lang.String p0, byte[] p1, byte[] p2) { return 0; }
    public final int serverPSKKeyRequested(java.lang.String p0, java.lang.String p1, byte[] p2) { return 0; }
    public final void onSSLStateChange(int p0, int p1) {}
    public final void onNewSessionEstablished(long p0) {}
    public final long serverSessionRequested(byte[] p0) { return 0L; }
    public final void serverCertificateRequested() throws java.io.IOException {}
    public final void verifyCertificateChain(byte[][] p0, java.lang.String p1) throws java.security.cert.CertificateException {}
    public final java.io.InputStream getInputStream() throws java.io.IOException { return null; }
    public final java.io.OutputStream getOutputStream() throws java.io.IOException { return null; }
    public final javax.net.ssl.SSLSession getSession() { return null; }
    final javax.net.ssl.SSLSession getActiveSession() { return null; }
    public final javax.net.ssl.SSLSession getHandshakeSession() { return null; }
    public final boolean getEnableSessionCreation() { return false; }
    public final void setEnableSessionCreation(boolean p0) {}
    public final java.lang.String[] getSupportedCipherSuites() { return null; }
    public final java.lang.String[] getEnabledCipherSuites() { return null; }
    public final void setEnabledCipherSuites(java.lang.String[] p0) {}
    public final java.lang.String[] getSupportedProtocols() { return null; }
    public final java.lang.String[] getEnabledProtocols() { return null; }
    public final void setEnabledProtocols(java.lang.String[] p0) {}
    public final void setUseSessionTickets(boolean p0) {}
    public final void setHostname(java.lang.String p0) {}
    public final void setChannelIdEnabled(boolean p0) {}
    public final byte[] getChannelId() throws javax.net.ssl.SSLException { return null; }
    public final void setChannelIdPrivateKey(java.security.PrivateKey p0) {}
    byte[] getTlsUnique() { return null; }
    byte[] exportKeyingMaterial(java.lang.String p0, byte[] p1, int p2) throws javax.net.ssl.SSLException { return null; }
    public final boolean getUseClientMode() { return false; }
    public final void setUseClientMode(boolean p0) {}
    public final boolean getWantClientAuth() { return false; }
    public final boolean getNeedClientAuth() { return false; }
    public final void setNeedClientAuth(boolean p0) {}
    public final void setWantClientAuth(boolean p0) {}
    public final void setSoWriteTimeout(int p0) throws java.net.SocketException {}
    public final int getSoWriteTimeout() { return 0; }
    public final void setHandshakeTimeout(int p0) throws java.net.SocketException {}
    public final void close() throws java.io.IOException {}
    protected final void finalize() throws java.lang.Throwable {}
    public final void setApplicationProtocolSelector(com.android.org.conscrypt.ApplicationProtocolSelector p0) {}
    final void setApplicationProtocolSelector(com.android.org.conscrypt.ApplicationProtocolSelectorAdapter p0) {}
    public int selectApplicationProtocol(byte[] p0) { return 0; }
    final void setApplicationProtocols(java.lang.String[] p0) {}
    final java.lang.String[] getApplicationProtocols() { return null; }
    public final java.lang.String getApplicationProtocol() { return null; }
    public final java.lang.String getHandshakeApplicationProtocol() { return null; }
    public final javax.net.ssl.SSLParameters getSSLParameters() { return null; }
    public final void setSSLParameters(javax.net.ssl.SSLParameters p0) {}
    public final java.lang.String chooseServerPSKIdentityHint(com.android.org.conscrypt.PSKKeyManager p0) { return null; }
    public final java.lang.String chooseClientPSKIdentity(com.android.org.conscrypt.PSKKeyManager p0, java.lang.String p1) { return null; }
    public final javax.crypto.SecretKey getPSKKey(com.android.org.conscrypt.PSKKeyManager p0, java.lang.String p1, java.lang.String p2) { return null; }
    public final java.lang.String chooseServerAlias(javax.net.ssl.X509KeyManager p0, java.lang.String p1) { return null; }
    public final java.lang.String chooseClientAlias(javax.net.ssl.X509KeyManager p0, javax.security.auth.x500.X500Principal[] p1, java.lang.String[] p2) { return null; }

    private class SSLInputStream extends java.io.InputStream {
        SSLInputStream(com.android.org.conscrypt.ConscryptFileDescriptorSocket p0) { super(); }
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
        public int available() { return 0; }
        void awaitPendingOps() {}
    }

    private class SSLOutputStream extends java.io.OutputStream {
        SSLOutputStream(com.android.org.conscrypt.ConscryptFileDescriptorSocket p0) { super(); }
        public void write(int p0) throws java.io.IOException {}
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
        void awaitPendingOps() {}
    }
}
