package com.android.org.conscrypt;

public interface ConscryptHostnameVerifier {
    public boolean verify(java.security.cert.X509Certificate[] p0, java.lang.String p1, javax.net.ssl.SSLSession p2);
}
