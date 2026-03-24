package com.android.org.conscrypt;

abstract class AbstractConscryptSocket extends javax.net.ssl.SSLSocket {
    final java.net.Socket socket = null;
    AbstractConscryptSocket() throws java.io.IOException { super(); }
    AbstractConscryptSocket(java.lang.String p0, int p1) throws java.io.IOException { super(); }
    AbstractConscryptSocket(java.net.InetAddress p0, int p1) throws java.io.IOException { super(); }
    AbstractConscryptSocket(java.lang.String p0, int p1, java.net.InetAddress p2, int p3) throws java.io.IOException { super(); }
    AbstractConscryptSocket(java.net.InetAddress p0, int p1, java.net.InetAddress p2, int p3) throws java.io.IOException { super(); }
    AbstractConscryptSocket(java.net.Socket p0, java.lang.String p1, int p2, boolean p3) throws java.io.IOException { super(); }
    public final void connect(java.net.SocketAddress p0) throws java.io.IOException {}
    public final void connect(java.net.SocketAddress p0, int p1) throws java.io.IOException {}
    public void bind(java.net.SocketAddress p0) throws java.io.IOException {}
    public void close() throws java.io.IOException {}
    public java.net.InetAddress getInetAddress() { return null; }
    public java.net.InetAddress getLocalAddress() { return null; }
    public int getLocalPort() { return 0; }
    public java.net.SocketAddress getRemoteSocketAddress() { return null; }
    public java.net.SocketAddress getLocalSocketAddress() { return null; }
    public final int getPort() { return 0; }
    public void addHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener p0) {}
    public void removeHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener p0) {}
    public java.io.FileDescriptor getFileDescriptor$() { return null; }
    public final void setSoTimeout(int p0) throws java.net.SocketException {}
    public final int getSoTimeout() throws java.net.SocketException { return 0; }
    public final void sendUrgentData(int p0) throws java.io.IOException {}
    public final void setOOBInline(boolean p0) throws java.net.SocketException {}
    public boolean getOOBInline() throws java.net.SocketException { return false; }
    public java.nio.channels.SocketChannel getChannel() { return null; }
    public java.io.InputStream getInputStream() throws java.io.IOException { return null; }
    public java.io.OutputStream getOutputStream() throws java.io.IOException { return null; }
    public void setTcpNoDelay(boolean p0) throws java.net.SocketException {}
    public boolean getTcpNoDelay() throws java.net.SocketException { return false; }
    public void setSoLinger(boolean p0, int p1) throws java.net.SocketException {}
    public int getSoLinger() throws java.net.SocketException { return 0; }
    public void setSendBufferSize(int p0) throws java.net.SocketException {}
    public int getSendBufferSize() throws java.net.SocketException { return 0; }
    public void setReceiveBufferSize(int p0) throws java.net.SocketException {}
    public int getReceiveBufferSize() throws java.net.SocketException { return 0; }
    public void setKeepAlive(boolean p0) throws java.net.SocketException {}
    public boolean getKeepAlive() throws java.net.SocketException { return false; }
    public void setTrafficClass(int p0) throws java.net.SocketException {}
    public int getTrafficClass() throws java.net.SocketException { return 0; }
    public void setReuseAddress(boolean p0) throws java.net.SocketException {}
    public boolean getReuseAddress() throws java.net.SocketException { return false; }
    public void shutdownInput() throws java.io.IOException {}
    public void shutdownOutput() throws java.io.IOException {}
    public boolean isConnected() { return false; }
    public boolean isBound() { return false; }
    public boolean isClosed() { return false; }
    public boolean isInputShutdown() { return false; }
    public boolean isOutputShutdown() { return false; }
    public void setPerformancePreferences(int p0, int p1, int p2) {}
    public java.lang.String toString() { return null; }
    java.lang.String getHostname() { return null; }
    void setHostname(java.lang.String p0) {}
    java.lang.String getHostnameOrIP() { return null; }
    void setSoWriteTimeout(int p0) throws java.net.SocketException {}
    int getSoWriteTimeout() throws java.net.SocketException { return 0; }
    void setHandshakeTimeout(int p0) throws java.net.SocketException {}
    final void checkOpen() throws java.net.SocketException {}
    final com.android.org.conscrypt.PeerInfoProvider peerInfoProvider() { return null; }
    abstract javax.net.ssl.SSLSession getActiveSession();
    abstract void setApplicationProtocolSelector(com.android.org.conscrypt.ApplicationProtocolSelectorAdapter p0);
    final void notifyHandshakeCompletedListeners() {}
    public abstract javax.net.ssl.SSLSession getHandshakeSession();
    abstract void setUseSessionTickets(boolean p0);
    abstract void setChannelIdEnabled(boolean p0);
    abstract byte[] getChannelId() throws javax.net.ssl.SSLException;
    abstract void setChannelIdPrivateKey(java.security.PrivateKey p0);
    @java.lang.Deprecated
    byte[] getNpnSelectedProtocol() { return null; }
    @java.lang.Deprecated
    void setNpnProtocols(byte[] p0) {}
    @java.lang.Deprecated
    abstract byte[] getAlpnSelectedProtocol();
    @java.lang.Deprecated
    abstract void setAlpnProtocols(java.lang.String[] p0);
    @java.lang.Deprecated
    abstract void setAlpnProtocols(byte[] p0);
    abstract void setApplicationProtocols(java.lang.String[] p0);
    abstract java.lang.String[] getApplicationProtocols();
    public abstract java.lang.String getApplicationProtocol();
    public abstract java.lang.String getHandshakeApplicationProtocol();
    abstract void setApplicationProtocolSelector(com.android.org.conscrypt.ApplicationProtocolSelector p0);
    abstract byte[] getTlsUnique();
    abstract byte[] exportKeyingMaterial(java.lang.String p0, byte[] p1, int p2) throws javax.net.ssl.SSLException;
}
