package android.net.http;

public class X509TrustManagerExtensions {
    public X509TrustManagerExtensions(javax.net.ssl.X509TrustManager p0) throws java.lang.IllegalArgumentException {}
    public java.util.List<java.security.cert.X509Certificate> checkServerTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, java.lang.String p2) throws java.security.cert.CertificateException { return null; }
    @android.annotation.FlaggedApi("android.security.certificate_transparency_configuration")
    @android.annotation.NonNull
    public java.util.List<java.security.cert.X509Certificate> checkServerTrusted(java.security.cert.X509Certificate[] p0, byte[] p1, byte[] p2, java.lang.String p3, java.lang.String p4) throws java.security.cert.CertificateException { return null; }
    public boolean isUserAddedCertificate(java.security.cert.X509Certificate p0) { return false; }
    public boolean isSameTrustConfiguration(java.lang.String p0, java.lang.String p1) { return false; }
}
