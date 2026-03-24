package com.android.org.conscrypt;

public abstract class OpenSSLContextImpl extends javax.net.ssl.SSLContextSpi {
    com.android.org.conscrypt.SSLParametersImpl sslParameters;
    static com.android.org.conscrypt.OpenSSLContextImpl getPreferred() { return null; }
    OpenSSLContextImpl(java.lang.String[] p0) { super(); }
    OpenSSLContextImpl(java.lang.String[] p0, boolean p1) throws java.security.GeneralSecurityException, java.io.IOException { super(); }
    public void engineInit(javax.net.ssl.KeyManager[] p0, javax.net.ssl.TrustManager[] p1, java.security.SecureRandom p2) throws java.security.KeyManagementException {}
    public javax.net.ssl.SSLSocketFactory engineGetSocketFactory() { return null; }
    public javax.net.ssl.SSLServerSocketFactory engineGetServerSocketFactory() { return null; }
    public javax.net.ssl.SSLEngine engineCreateSSLEngine(java.lang.String p0, int p1) { return null; }
    public javax.net.ssl.SSLEngine engineCreateSSLEngine() { return null; }
    public javax.net.ssl.SSLSessionContext engineGetServerSessionContext() { return null; }
    public javax.net.ssl.SSLSessionContext engineGetClientSessionContext() { return null; }

    public static final class TLSv1 extends com.android.org.conscrypt.OpenSSLContextImpl {
        public TLSv1() { super((java.lang.String[])null); }
    }

    public static final class TLSv11 extends com.android.org.conscrypt.OpenSSLContextImpl {
        public TLSv11() { super((java.lang.String[])null); }
    }

    public static final class TLSv12 extends com.android.org.conscrypt.OpenSSLContextImpl {
        public TLSv12() { super((java.lang.String[])null); }
    }

    public static final class TLSv13 extends com.android.org.conscrypt.OpenSSLContextImpl {
        public TLSv13() { super((java.lang.String[])null); }
    }
}
