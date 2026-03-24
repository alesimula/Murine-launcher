package com.android.org.conscrypt;

public abstract class ApplicationProtocolSelector {
    public ApplicationProtocolSelector() {}
    public abstract java.lang.String selectApplicationProtocol(javax.net.ssl.SSLEngine p0, java.util.List<java.lang.String> p1);
    public abstract java.lang.String selectApplicationProtocol(javax.net.ssl.SSLSocket p0, java.util.List<java.lang.String> p1);
}
