package com.android.org.conscrypt;

abstract class AbstractConscryptEngine extends javax.net.ssl.SSLEngine {
    AbstractConscryptEngine() { super(); }
    abstract void setBufferAllocator(com.android.org.conscrypt.BufferAllocator p0);
    abstract int maxSealOverhead();
    abstract void setChannelIdEnabled(boolean p0);
    abstract byte[] getChannelId() throws javax.net.ssl.SSLException;
    abstract void setChannelIdPrivateKey(java.security.PrivateKey p0);
    abstract void setHandshakeListener(com.android.org.conscrypt.HandshakeListener p0);
    abstract void setHostname(java.lang.String p0);
    abstract java.lang.String getHostname();
    public abstract java.lang.String getPeerHost();
    public abstract int getPeerPort();
    public final javax.net.ssl.SSLSession getHandshakeSession() { return null; }
    abstract javax.net.ssl.SSLSession handshakeSession();
    public abstract javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1) throws javax.net.ssl.SSLException;
    public abstract javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer p0, java.nio.ByteBuffer[] p1) throws javax.net.ssl.SSLException;
    public abstract javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer p0, java.nio.ByteBuffer[] p1, int p2, int p3) throws javax.net.ssl.SSLException;
    abstract javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer[] p0, java.nio.ByteBuffer[] p1) throws javax.net.ssl.SSLException;
    abstract javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer[] p0, int p1, int p2, java.nio.ByteBuffer[] p3, int p4, int p5) throws javax.net.ssl.SSLException;
    public abstract javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1) throws javax.net.ssl.SSLException;
    public abstract javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer[] p0, int p1, int p2, java.nio.ByteBuffer p3) throws javax.net.ssl.SSLException;
    abstract void setUseSessionTickets(boolean p0);
    abstract void setApplicationProtocols(java.lang.String[] p0);
    abstract java.lang.String[] getApplicationProtocols();
    public abstract java.lang.String getApplicationProtocol();
    public abstract java.lang.String getHandshakeApplicationProtocol();
    abstract void setApplicationProtocolSelector(com.android.org.conscrypt.ApplicationProtocolSelector p0);
    abstract byte[] getTlsUnique();
    abstract byte[] exportKeyingMaterial(java.lang.String p0, byte[] p1, int p2) throws javax.net.ssl.SSLException;
}
