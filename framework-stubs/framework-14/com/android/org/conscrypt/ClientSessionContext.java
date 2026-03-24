package com.android.org.conscrypt;

public final class ClientSessionContext extends com.android.org.conscrypt.AbstractSessionContext {
    ClientSessionContext() { super(0); }
    public void setPersistentCache(com.android.org.conscrypt.SSLClientSessionCache p0) {}
    synchronized com.android.org.conscrypt.NativeSslSession getCachedSession(java.lang.String p0, int p1, com.android.org.conscrypt.SSLParametersImpl p2) { return null; }
    int size() { return 0; }
    void onBeforeAddSession(com.android.org.conscrypt.NativeSslSession p0) {}
    void onBeforeRemoveSession(com.android.org.conscrypt.NativeSslSession p0) {}
    com.android.org.conscrypt.NativeSslSession getSessionFromPersistentCache(byte[] p0) { return null; }

    private static final class HostAndPort {
        final java.lang.String host = null;
        final int port = 0;
        HostAndPort(java.lang.String p0, int p1) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }
}
