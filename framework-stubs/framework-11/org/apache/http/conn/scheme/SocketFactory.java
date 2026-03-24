package org.apache.http.conn.scheme;

@java.lang.Deprecated
public interface SocketFactory {
    public java.net.Socket createSocket() throws java.io.IOException;
    public java.net.Socket connectSocket(java.net.Socket p0, java.lang.String p1, int p2, java.net.InetAddress p3, int p4, org.apache.http.params.HttpParams p5) throws java.io.IOException, java.net.UnknownHostException, org.apache.http.conn.ConnectTimeoutException;
    public boolean isSecure(java.net.Socket p0) throws java.lang.IllegalArgumentException;
}
