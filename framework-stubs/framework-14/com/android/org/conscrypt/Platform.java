package com.android.org.conscrypt;

final class Platform {
    public static void setup() {}
    public static java.lang.String getDefaultProviderName() { return null; }
    static boolean provideTrustManagerByDefault() { return false; }
    static java.io.FileDescriptor getFileDescriptor(java.net.Socket p0) { return null; }
    static java.io.FileDescriptor getFileDescriptorFromSSLSocket(com.android.org.conscrypt.AbstractConscryptSocket p0) { return null; }
    static java.lang.String getCurveName(java.security.spec.ECParameterSpec p0) { return null; }
    static void setCurveName(java.security.spec.ECParameterSpec p0, java.lang.String p1) {}
    static void setSocketWriteTimeout(java.net.Socket p0, long p1) throws java.net.SocketException {}
    static void setSSLParameters(javax.net.ssl.SSLParameters p0, com.android.org.conscrypt.SSLParametersImpl p1, com.android.org.conscrypt.AbstractConscryptSocket p2) {}
    static void getSSLParameters(javax.net.ssl.SSLParameters p0, com.android.org.conscrypt.SSLParametersImpl p1, com.android.org.conscrypt.AbstractConscryptSocket p2) {}
    static void setSSLParameters(javax.net.ssl.SSLParameters p0, com.android.org.conscrypt.SSLParametersImpl p1, com.android.org.conscrypt.ConscryptEngine p2) {}
    static void getSSLParameters(javax.net.ssl.SSLParameters p0, com.android.org.conscrypt.SSLParametersImpl p1, com.android.org.conscrypt.ConscryptEngine p2) {}
    static void checkClientTrusted(javax.net.ssl.X509TrustManager p0, java.security.cert.X509Certificate[] p1, java.lang.String p2, com.android.org.conscrypt.AbstractConscryptSocket p3) throws java.security.cert.CertificateException {}
    static void checkServerTrusted(javax.net.ssl.X509TrustManager p0, java.security.cert.X509Certificate[] p1, java.lang.String p2, com.android.org.conscrypt.AbstractConscryptSocket p3) throws java.security.cert.CertificateException {}
    static void checkClientTrusted(javax.net.ssl.X509TrustManager p0, java.security.cert.X509Certificate[] p1, java.lang.String p2, com.android.org.conscrypt.ConscryptEngine p3) throws java.security.cert.CertificateException {}
    static void checkServerTrusted(javax.net.ssl.X509TrustManager p0, java.security.cert.X509Certificate[] p1, java.lang.String p2, com.android.org.conscrypt.ConscryptEngine p3) throws java.security.cert.CertificateException {}
    static com.android.org.conscrypt.OpenSSLKey wrapRsaKey(java.security.PrivateKey p0) { return null; }
    static void logEvent(java.lang.String p0) {}
    static javax.net.ssl.SSLEngine wrapEngine(com.android.org.conscrypt.ConscryptEngine p0) { return null; }
    static javax.net.ssl.SSLEngine unwrapEngine(javax.net.ssl.SSLEngine p0) { return null; }
    static com.android.org.conscrypt.ConscryptEngineSocket createEngineSocket(com.android.org.conscrypt.SSLParametersImpl p0) throws java.io.IOException { return null; }
    static com.android.org.conscrypt.ConscryptEngineSocket createEngineSocket(java.lang.String p0, int p1, com.android.org.conscrypt.SSLParametersImpl p2) throws java.io.IOException { return null; }
    static com.android.org.conscrypt.ConscryptEngineSocket createEngineSocket(java.net.InetAddress p0, int p1, com.android.org.conscrypt.SSLParametersImpl p2) throws java.io.IOException { return null; }
    static com.android.org.conscrypt.ConscryptEngineSocket createEngineSocket(java.lang.String p0, int p1, java.net.InetAddress p2, int p3, com.android.org.conscrypt.SSLParametersImpl p4) throws java.io.IOException { return null; }
    static com.android.org.conscrypt.ConscryptEngineSocket createEngineSocket(java.net.InetAddress p0, int p1, java.net.InetAddress p2, int p3, com.android.org.conscrypt.SSLParametersImpl p4) throws java.io.IOException { return null; }
    static com.android.org.conscrypt.ConscryptEngineSocket createEngineSocket(java.net.Socket p0, java.lang.String p1, int p2, boolean p3, com.android.org.conscrypt.SSLParametersImpl p4) throws java.io.IOException { return null; }
    static com.android.org.conscrypt.ConscryptFileDescriptorSocket createFileDescriptorSocket(com.android.org.conscrypt.SSLParametersImpl p0) throws java.io.IOException { return null; }
    static com.android.org.conscrypt.ConscryptFileDescriptorSocket createFileDescriptorSocket(java.lang.String p0, int p1, com.android.org.conscrypt.SSLParametersImpl p2) throws java.io.IOException { return null; }
    static com.android.org.conscrypt.ConscryptFileDescriptorSocket createFileDescriptorSocket(java.net.InetAddress p0, int p1, com.android.org.conscrypt.SSLParametersImpl p2) throws java.io.IOException { return null; }
    static com.android.org.conscrypt.ConscryptFileDescriptorSocket createFileDescriptorSocket(java.lang.String p0, int p1, java.net.InetAddress p2, int p3, com.android.org.conscrypt.SSLParametersImpl p4) throws java.io.IOException { return null; }
    static com.android.org.conscrypt.ConscryptFileDescriptorSocket createFileDescriptorSocket(java.net.InetAddress p0, int p1, java.net.InetAddress p2, int p3, com.android.org.conscrypt.SSLParametersImpl p4) throws java.io.IOException { return null; }
    static com.android.org.conscrypt.ConscryptFileDescriptorSocket createFileDescriptorSocket(java.net.Socket p0, java.lang.String p1, int p2, boolean p3, com.android.org.conscrypt.SSLParametersImpl p4) throws java.io.IOException { return null; }
    static javax.net.ssl.SSLSocketFactory wrapSocketFactoryIfNeeded(com.android.org.conscrypt.OpenSSLSocketFactoryImpl p0) { return null; }
    static com.android.org.conscrypt.GCMParameters fromGCMParameterSpec(java.security.spec.AlgorithmParameterSpec p0) { return null; }
    static java.security.spec.AlgorithmParameterSpec fromGCMParameters(java.security.AlgorithmParameters p0) { return null; }
    static java.security.spec.AlgorithmParameterSpec toGCMParameterSpec(int p0, byte[] p1) { return null; }
    static dalvik.system.CloseGuard closeGuardGet() { return null; }
    static void closeGuardOpen(java.lang.Object p0, java.lang.String p1) {}
    static void closeGuardClose(java.lang.Object p0) {}
    static void closeGuardWarnIfOpen(java.lang.Object p0) {}
    static void blockGuardOnNetwork() {}
    static java.lang.String oidToAlgorithmName(java.lang.String p0) { return null; }
    static javax.net.ssl.SSLSession wrapSSLSession(com.android.org.conscrypt.ExternalSession p0) { return null; }
    public static java.lang.String getOriginalHostNameFromInetAddress(java.net.InetAddress p0) { return null; }
    static java.lang.String getHostStringFromInetSocketAddress(java.net.InetSocketAddress p0) { return null; }
    static boolean supportsX509ExtendedTrustManager() { return false; }
    static boolean isCTVerificationRequired(java.lang.String p0) { return false; }
    static boolean supportsConscryptCertStore() { return false; }
    static java.security.KeyStore getDefaultCertKeyStore() throws java.security.KeyStoreException { return null; }
    static com.android.org.conscrypt.ConscryptCertStore newDefaultCertStore() { return null; }
    static com.android.org.conscrypt.CertBlocklist newDefaultBlocklist() { return null; }
    static com.android.org.conscrypt.ct.CTLogStore newDefaultLogStore() { return null; }
    static com.android.org.conscrypt.ct.CTPolicy newDefaultPolicy(com.android.org.conscrypt.ct.CTLogStore p0) { return null; }
    static boolean serverNamePermitted(com.android.org.conscrypt.SSLParametersImpl p0, java.lang.String p1) { return false; }
    public static com.android.org.conscrypt.ConscryptHostnameVerifier getDefaultHostnameVerifier() { return null; }
    static long getMillisSinceBoot() { return 0L; }
    static void countTlsHandshake(boolean p0, java.lang.String p1, java.lang.String p2, long p3) {}
    public static boolean isJavaxCertificateSupported() { return false; }

    private static class NoPreloadHolder {
        public static final com.android.org.conscrypt.Platform MAPPER = null;
    }
}
