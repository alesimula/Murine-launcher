package com.android.org.conscrypt;

abstract class PeerInfoProvider {
    PeerInfoProvider() {}
    abstract java.lang.String getHostname();
    abstract java.lang.String getHostnameOrIP();
    abstract int getPort();
    static com.android.org.conscrypt.PeerInfoProvider nullProvider() { return null; }
    static com.android.org.conscrypt.PeerInfoProvider forHostAndPort(java.lang.String p0, int p1) { return null; }
}
