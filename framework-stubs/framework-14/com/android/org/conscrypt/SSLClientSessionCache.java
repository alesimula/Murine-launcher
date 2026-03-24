package com.android.org.conscrypt;

public interface SSLClientSessionCache {
    public byte[] getSessionData(java.lang.String p0, int p1);
    public void putSessionData(javax.net.ssl.SSLSession p0, byte[] p1);
}
