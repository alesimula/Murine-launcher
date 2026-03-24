package org.apache.http.conn.ssl;

@java.lang.Deprecated
public interface X509HostnameVerifier extends javax.net.ssl.HostnameVerifier {
    public boolean verify(java.lang.String p0, javax.net.ssl.SSLSession p1);
    public void verify(java.lang.String p0, javax.net.ssl.SSLSocket p1) throws java.io.IOException;
    public void verify(java.lang.String p0, java.security.cert.X509Certificate p1) throws javax.net.ssl.SSLException;
    public void verify(java.lang.String p0, java.lang.String[] p1, java.lang.String[] p2) throws javax.net.ssl.SSLException;
}
