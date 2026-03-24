package com.android.org.conscrypt;

public final class OkHostnameVerifier implements com.android.org.conscrypt.ConscryptHostnameVerifier {
    public static final com.android.org.conscrypt.OkHostnameVerifier INSTANCE = null;
    public static com.android.org.conscrypt.OkHostnameVerifier strictInstance() { return null; }
    public boolean verify(java.security.cert.X509Certificate[] p0, java.lang.String p1, javax.net.ssl.SSLSession p2) { return false; }
    public boolean verify(java.lang.String p0, java.security.cert.X509Certificate p1) { return false; }
    static boolean verifyAsIpAddress(java.lang.String p0) { return false; }
    public static java.util.List<java.lang.String> allSubjectAltNames(java.security.cert.X509Certificate p0) { return null; }
}
