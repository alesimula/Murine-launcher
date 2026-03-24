package com.android.org.conscrypt;

public final class ServerSessionContext extends com.android.org.conscrypt.AbstractSessionContext {
    ServerSessionContext() { super(0); }
    public void setPersistentCache(com.android.org.conscrypt.SSLServerSessionCache p0) {}
    com.android.org.conscrypt.NativeSslSession getSessionFromPersistentCache(byte[] p0) { return null; }
    void onBeforeAddSession(com.android.org.conscrypt.NativeSslSession p0) {}
    void onBeforeRemoveSession(com.android.org.conscrypt.NativeSslSession p0) {}
}
