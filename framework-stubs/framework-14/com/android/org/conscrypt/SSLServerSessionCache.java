package com.android.org.conscrypt;

public interface SSLServerSessionCache {
    public byte[] getSessionData(byte[] p0);
    public void putSessionData(javax.net.ssl.SSLSession p0, byte[] p1);
}
