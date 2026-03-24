package com.android.org.conscrypt;

abstract class AbstractSessionContext implements javax.net.ssl.SSLSessionContext {
    final long sslCtxNativePointer = 0L;
    AbstractSessionContext(int p0) {}
    public final java.util.Enumeration<byte[]> getIds() { return null; }
    public final javax.net.ssl.SSLSession getSession(byte[] p0) { return null; }
    public final int getSessionCacheSize() { return 0; }
    public final int getSessionTimeout() { return 0; }
    public final void setSessionTimeout(int p0) throws java.lang.IllegalArgumentException {}
    public final void setSessionCacheSize(int p0) throws java.lang.IllegalArgumentException {}
    protected void finalize() throws java.lang.Throwable {}
    final void cacheSession(com.android.org.conscrypt.NativeSslSession p0) {}
    final void removeSession(com.android.org.conscrypt.NativeSslSession p0) {}
    final com.android.org.conscrypt.NativeSslSession getSessionFromCache(byte[] p0) { return null; }
    abstract void onBeforeAddSession(com.android.org.conscrypt.NativeSslSession p0);
    abstract void onBeforeRemoveSession(com.android.org.conscrypt.NativeSslSession p0);
    abstract com.android.org.conscrypt.NativeSslSession getSessionFromPersistentCache(byte[] p0);
}
