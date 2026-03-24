package com.android.org.conscrypt;

final class ConscryptServerSocket extends javax.net.ssl.SSLServerSocket {
    ConscryptServerSocket(com.android.org.conscrypt.SSLParametersImpl p0) throws java.io.IOException { super(); }
    ConscryptServerSocket(int p0, com.android.org.conscrypt.SSLParametersImpl p1) throws java.io.IOException { super(); }
    ConscryptServerSocket(int p0, int p1, com.android.org.conscrypt.SSLParametersImpl p2) throws java.io.IOException { super(); }
    ConscryptServerSocket(int p0, int p1, java.net.InetAddress p2, com.android.org.conscrypt.SSLParametersImpl p3) throws java.io.IOException { super(); }
    com.android.org.conscrypt.ConscryptServerSocket setUseEngineSocket(boolean p0) { return null; }
    public boolean getEnableSessionCreation() { return false; }
    public void setEnableSessionCreation(boolean p0) {}
    public java.lang.String[] getSupportedProtocols() { return null; }
    public java.lang.String[] getEnabledProtocols() { return null; }
    public void setEnabledProtocols(java.lang.String[] p0) {}
    public java.lang.String[] getSupportedCipherSuites() { return null; }
    public java.lang.String[] getEnabledCipherSuites() { return null; }
    void setChannelIdEnabled(boolean p0) {}
    boolean isChannelIdEnabled() { return false; }
    public void setEnabledCipherSuites(java.lang.String[] p0) {}
    public boolean getWantClientAuth() { return false; }
    public void setWantClientAuth(boolean p0) {}
    public boolean getNeedClientAuth() { return false; }
    public void setNeedClientAuth(boolean p0) {}
    public void setUseClientMode(boolean p0) {}
    public boolean getUseClientMode() { return false; }
    public java.net.Socket accept() throws java.io.IOException { return null; }
}
