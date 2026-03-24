package android.net;

@java.lang.Deprecated
public class SSLCertificateSocketFactory extends javax.net.ssl.SSLSocketFactory {
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private static final java.lang.String TAG = "SSLCertificateSocketFactory";
    @android.annotation.UnsupportedAppUsage
    private static final javax.net.ssl.TrustManager[] INSECURE_TRUST_MANAGER = null;
    @android.annotation.UnsupportedAppUsage
    private javax.net.ssl.SSLSocketFactory mInsecureFactory;
    @android.annotation.UnsupportedAppUsage
    private javax.net.ssl.SSLSocketFactory mSecureFactory;
    @android.annotation.UnsupportedAppUsage
    private javax.net.ssl.TrustManager[] mTrustManagers;
    @android.annotation.UnsupportedAppUsage
    private javax.net.ssl.KeyManager[] mKeyManagers;
    @android.annotation.UnsupportedAppUsage
    private byte[] mNpnProtocols;
    @android.annotation.UnsupportedAppUsage
    private byte[] mAlpnProtocols;
    @android.annotation.UnsupportedAppUsage
    private java.security.PrivateKey mChannelIdPrivateKey;
    @android.annotation.UnsupportedAppUsage
    private final int mHandshakeTimeoutMillis = 0;
    @android.annotation.UnsupportedAppUsage
    private final boolean mSecure = false;
    @java.lang.Deprecated
    public SSLCertificateSocketFactory(int p0) { super(); }
    @android.annotation.UnsupportedAppUsage
    private SSLCertificateSocketFactory(int p0, android.net.SSLSessionCache p1, boolean p2) { super(); }
    public static javax.net.SocketFactory getDefault(int p0) { return null; }
    public static javax.net.ssl.SSLSocketFactory getDefault(int p0, android.net.SSLSessionCache p1) { return null; }
    public static javax.net.ssl.SSLSocketFactory getInsecure(int p0, android.net.SSLSessionCache p1) { return null; }
    @java.lang.Deprecated
    public static org.apache.http.conn.ssl.SSLSocketFactory getHttpSocketFactory(int p0, android.net.SSLSessionCache p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static void verifyHostname(java.net.Socket p0, java.lang.String p1) throws java.io.IOException {}
    @android.annotation.UnsupportedAppUsage
    private javax.net.ssl.SSLSocketFactory makeSocketFactory(javax.net.ssl.KeyManager[] p0, javax.net.ssl.TrustManager[] p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    private static boolean isSslCheckRelaxed() { return false; }
    @android.annotation.UnsupportedAppUsage
    private synchronized javax.net.ssl.SSLSocketFactory getDelegate() { return null; }
    public void setTrustManagers(javax.net.ssl.TrustManager[] p0) {}
    public void setNpnProtocols(byte[][] p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setAlpnProtocols(byte[][] p0) {}
    public static byte[] toLengthPrefixedList(byte[]... p0) { return null; }
    public byte[] getNpnSelectedProtocol(java.net.Socket p0) { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public byte[] getAlpnSelectedProtocol(java.net.Socket p0) { return null; }
    public void setKeyManagers(javax.net.ssl.KeyManager[] p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void setChannelIdPrivateKey(java.security.PrivateKey p0) {}
    public void setUseSessionTickets(java.net.Socket p0, boolean p1) {}
    public void setHostname(java.net.Socket p0, java.lang.String p1) {}
    @android.annotation.UnsupportedAppUsage
    public void setSoWriteTimeout(java.net.Socket p0, int p1) throws java.net.SocketException {}
    @android.annotation.UnsupportedAppUsage
    private static com.android.org.conscrypt.OpenSSLSocketImpl castToOpenSSLSocket(java.net.Socket p0) { return null; }
    public java.net.Socket createSocket(java.net.Socket p0, java.lang.String p1, int p2, boolean p3) throws java.io.IOException { return null; }
    public java.net.Socket createSocket() throws java.io.IOException { return null; }
    public java.net.Socket createSocket(java.net.InetAddress p0, int p1, java.net.InetAddress p2, int p3) throws java.io.IOException { return null; }
    public java.net.Socket createSocket(java.net.InetAddress p0, int p1) throws java.io.IOException { return null; }
    public java.net.Socket createSocket(java.lang.String p0, int p1, java.net.InetAddress p2, int p3) throws java.io.IOException { return null; }
    public java.net.Socket createSocket(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    public java.lang.String[] getDefaultCipherSuites() { return null; }
    public java.lang.String[] getSupportedCipherSuites() { return null; }
}
