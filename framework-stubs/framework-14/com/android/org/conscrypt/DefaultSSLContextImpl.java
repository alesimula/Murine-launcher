package com.android.org.conscrypt;

public class DefaultSSLContextImpl extends com.android.org.conscrypt.OpenSSLContextImpl {
    DefaultSSLContextImpl() { super((java.lang.String[])null); }
    javax.net.ssl.KeyManager[] getKeyManagers() throws java.security.GeneralSecurityException, java.io.IOException { return null; }
    javax.net.ssl.TrustManager[] getTrustManagers() throws java.security.GeneralSecurityException, java.io.IOException { return null; }
    public void engineInit(javax.net.ssl.KeyManager[] p0, javax.net.ssl.TrustManager[] p1, java.security.SecureRandom p2) throws java.security.KeyManagementException {}

    public static final class TLSv12 extends com.android.org.conscrypt.DefaultSSLContextImpl {
        public TLSv12() throws java.security.GeneralSecurityException, java.io.IOException { super(); }
    }

    public static final class TLSv13 extends com.android.org.conscrypt.DefaultSSLContextImpl {
        public TLSv13() throws java.security.GeneralSecurityException, java.io.IOException { super(); }
    }
}
