package org.apache.http.conn.ssl;

@java.lang.Deprecated
public abstract class AbstractVerifier implements org.apache.http.conn.ssl.X509HostnameVerifier {
    private static final java.util.regex.Pattern IPV4_PATTERN = null;
    private static final java.lang.String[] BAD_COUNTRY_2LDS = null;
    public AbstractVerifier() {}
    public final void verify(java.lang.String p0, javax.net.ssl.SSLSocket p1) throws java.io.IOException {}
    public final boolean verify(java.lang.String p0, javax.net.ssl.SSLSession p1) { return false; }
    public final void verify(java.lang.String p0, java.security.cert.X509Certificate p1) throws javax.net.ssl.SSLException {}
    public final void verify(java.lang.String p0, java.lang.String[] p1, java.lang.String[] p2, boolean p3) throws javax.net.ssl.SSLException {}
    public static boolean acceptableCountryWildcard(java.lang.String p0) { return false; }
    public static java.lang.String[] getCNs(java.security.cert.X509Certificate p0) { return null; }
    public static java.lang.String[] getDNSSubjectAlts(java.security.cert.X509Certificate p0) { return null; }
    public static int countDots(java.lang.String p0) { return 0; }
    private static boolean isIPv4Address(java.lang.String p0) { return false; }
}
