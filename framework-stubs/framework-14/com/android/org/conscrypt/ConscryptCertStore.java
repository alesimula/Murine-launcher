package com.android.org.conscrypt;

public interface ConscryptCertStore {
    public java.security.cert.X509Certificate getTrustAnchor(java.security.cert.X509Certificate p0);
    public java.util.Set<java.security.cert.X509Certificate> findAllIssuers(java.security.cert.X509Certificate p0);
}
