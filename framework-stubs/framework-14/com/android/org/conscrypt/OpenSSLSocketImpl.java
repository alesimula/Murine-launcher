package com.android.org.conscrypt;

public abstract class OpenSSLSocketImpl extends com.android.org.conscrypt.AbstractConscryptSocket {
    OpenSSLSocketImpl() throws java.io.IOException { super(); }
    OpenSSLSocketImpl(java.lang.String p0, int p1) throws java.io.IOException { super(); }
    OpenSSLSocketImpl(java.net.InetAddress p0, int p1) throws java.io.IOException { super(); }
    OpenSSLSocketImpl(java.lang.String p0, int p1, java.net.InetAddress p2, int p3) throws java.io.IOException { super(); }
    OpenSSLSocketImpl(java.net.InetAddress p0, int p1, java.net.InetAddress p2, int p3) throws java.io.IOException { super(); }
    OpenSSLSocketImpl(java.net.Socket p0, java.lang.String p1, int p2, boolean p3) throws java.io.IOException { super(); }
    public java.lang.String getHostname() { return null; }
    public void setHostname(java.lang.String p0) {}
    public java.lang.String getHostnameOrIP() { return null; }
    public java.io.FileDescriptor getFileDescriptor$() { return null; }
    public void setSoWriteTimeout(int p0) throws java.net.SocketException {}
    public int getSoWriteTimeout() throws java.net.SocketException { return 0; }
    public void setHandshakeTimeout(int p0) throws java.net.SocketException {}
    public abstract javax.net.ssl.SSLSession getHandshakeSession();
    public abstract void setUseSessionTickets(boolean p0);
    public abstract void setChannelIdEnabled(boolean p0);
    public abstract byte[] getChannelId() throws javax.net.ssl.SSLException;
    public abstract void setChannelIdPrivateKey(java.security.PrivateKey p0);
    @java.lang.Deprecated
    public final byte[] getNpnSelectedProtocol() { return null; }
    @java.lang.Deprecated
    public final void setNpnProtocols(byte[] p0) {}
    @java.lang.Deprecated
    public final void setAlpnProtocols(java.lang.String[] p0) {}
    @java.lang.Deprecated
    public final byte[] getAlpnSelectedProtocol() { return null; }
    @java.lang.Deprecated
    public final void setAlpnProtocols(byte[] p0) {}
}
