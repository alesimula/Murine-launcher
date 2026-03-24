package com.android.org.conscrypt;

class ConscryptEngineSocket extends com.android.org.conscrypt.OpenSSLSocketImpl implements com.android.org.conscrypt.SSLParametersImpl.AliasChooser {
    ConscryptEngineSocket(com.android.org.conscrypt.SSLParametersImpl p0) throws java.io.IOException { super(); }
    ConscryptEngineSocket(java.lang.String p0, int p1, com.android.org.conscrypt.SSLParametersImpl p2) throws java.io.IOException { super(); }
    ConscryptEngineSocket(java.net.InetAddress p0, int p1, com.android.org.conscrypt.SSLParametersImpl p2) throws java.io.IOException { super(); }
    ConscryptEngineSocket(java.lang.String p0, int p1, java.net.InetAddress p2, int p3, com.android.org.conscrypt.SSLParametersImpl p4) throws java.io.IOException { super(); }
    ConscryptEngineSocket(java.net.InetAddress p0, int p1, java.net.InetAddress p2, int p3, com.android.org.conscrypt.SSLParametersImpl p4) throws java.io.IOException { super(); }
    ConscryptEngineSocket(java.net.Socket p0, java.lang.String p1, int p2, boolean p3, com.android.org.conscrypt.SSLParametersImpl p4) throws java.io.IOException { super(); }
    public final javax.net.ssl.SSLParameters getSSLParameters() { return null; }
    public final void setSSLParameters(javax.net.ssl.SSLParameters p0) {}
    public final void startHandshake() throws java.io.IOException {}
    public final java.io.InputStream getInputStream() throws java.io.IOException { return null; }
    public final java.io.OutputStream getOutputStream() throws java.io.IOException { return null; }
    public final javax.net.ssl.SSLSession getHandshakeSession() { return null; }
    public final javax.net.ssl.SSLSession getSession() { return null; }
    final javax.net.ssl.SSLSession getActiveSession() { return null; }
    public final boolean getEnableSessionCreation() { return false; }
    public final void setEnableSessionCreation(boolean p0) {}
    public final java.lang.String[] getSupportedCipherSuites() { return null; }
    public final java.lang.String[] getEnabledCipherSuites() { return null; }
    public final void setEnabledCipherSuites(java.lang.String[] p0) {}
    public final java.lang.String[] getSupportedProtocols() { return null; }
    public final java.lang.String[] getEnabledProtocols() { return null; }
    public final void setEnabledProtocols(java.lang.String[] p0) {}
    public final void setHostname(java.lang.String p0) {}
    public final void setUseSessionTickets(boolean p0) {}
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
    public final void close() throws java.io.IOException {}
    public void setHandshakeTimeout(int p0) throws java.net.SocketException {}
    final void setApplicationProtocols(java.lang.String[] p0) {}
    final java.lang.String[] getApplicationProtocols() { return null; }
    public final java.lang.String getApplicationProtocol() { return null; }
    public final java.lang.String getHandshakeApplicationProtocol() { return null; }
    public final void setApplicationProtocolSelector(com.android.org.conscrypt.ApplicationProtocolSelector p0) {}
    final void setApplicationProtocolSelector(com.android.org.conscrypt.ApplicationProtocolSelectorAdapter p0) {}
    void setBufferAllocator(com.android.org.conscrypt.BufferAllocator p0) {}
    public final java.lang.String chooseServerAlias(javax.net.ssl.X509KeyManager p0, java.lang.String p1) { return null; }
    public final java.lang.String chooseClientAlias(javax.net.ssl.X509KeyManager p0, javax.security.auth.x500.X500Principal[] p1, java.lang.String[] p2) { return null; }

    private final class SSLInputStream extends java.io.InputStream {
        SSLInputStream(com.android.org.conscrypt.ConscryptEngineSocket p0) { super(); }
        public void close() throws java.io.IOException {}
        void release() {}
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0) throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
        public int available() throws java.io.IOException { return 0; }
    }

    private final class SSLOutputStream extends java.io.OutputStream {
        SSLOutputStream(com.android.org.conscrypt.ConscryptEngineSocket p0) { super(); }
        public void close() throws java.io.IOException {}
        public void write(int p0) throws java.io.IOException {}
        public void write(byte[] p0) throws java.io.IOException {}
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void flush() throws java.io.IOException {}
    }
}
