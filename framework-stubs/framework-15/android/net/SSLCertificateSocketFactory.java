package android.net;

@java.lang.Deprecated
public class SSLCertificateSocketFactory extends javax.net.ssl.SSLSocketFactory {
    @java.lang.Deprecated
    public SSLCertificateSocketFactory(int p0) { super(); }
    public static javax.net.SocketFactory getDefault(int p0) { return null; }
    public static javax.net.ssl.SSLSocketFactory getDefault(int p0, android.net.SSLSessionCache p1) { return null; }
    public static javax.net.ssl.SSLSocketFactory getInsecure(int p0, android.net.SSLSessionCache p1) { return null; }
    @java.lang.Deprecated
    public static org.apache.http.conn.ssl.SSLSocketFactory getHttpSocketFactory(int p0, android.net.SSLSessionCache p1) { return null; }
    public static void verifyHostname(java.net.Socket p0, java.lang.String p1) throws java.io.IOException {}
    public void setTrustManagers(javax.net.ssl.TrustManager[] p0) {}
    public void setNpnProtocols(byte[][] p0) {}
    public void setAlpnProtocols(byte[][] p0) {}
    public static byte[] toLengthPrefixedList(byte[]... p0) { return null; }
    public byte[] getNpnSelectedProtocol(java.net.Socket p0) { return null; }
    public byte[] getAlpnSelectedProtocol(java.net.Socket p0) { return null; }
    public void setKeyManagers(javax.net.ssl.KeyManager[] p0) {}
    public void setChannelIdPrivateKey(java.security.PrivateKey p0) {}
    public void setUseSessionTickets(java.net.Socket p0, boolean p1) {}
    public void setHostname(java.net.Socket p0, java.lang.String p1) {}
    public void setSoWriteTimeout(java.net.Socket p0, int p1) throws java.net.SocketException {}
    public java.net.Socket createSocket(java.net.Socket p0, java.lang.String p1, int p2, boolean p3) throws java.io.IOException { return null; }
    public java.net.Socket createSocket() throws java.io.IOException { return null; }
    public java.net.Socket createSocket(java.net.InetAddress p0, int p1, java.net.InetAddress p2, int p3) throws java.io.IOException { return null; }
    public java.net.Socket createSocket(java.net.InetAddress p0, int p1) throws java.io.IOException { return null; }
    public java.net.Socket createSocket(java.lang.String p0, int p1, java.net.InetAddress p2, int p3) throws java.io.IOException { return null; }
    public java.net.Socket createSocket(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    public java.lang.String[] getDefaultCipherSuites() { return null; }
    public java.lang.String[] getSupportedCipherSuites() { return null; }
}
