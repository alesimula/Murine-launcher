package android.net.http;

public class SslError {
    public static final int SSL_NOTYETVALID = 0;
    public static final int SSL_EXPIRED = 1;
    public static final int SSL_IDMISMATCH = 2;
    public static final int SSL_UNTRUSTED = 3;
    public static final int SSL_DATE_INVALID = 4;
    public static final int SSL_INVALID = 5;
    @java.lang.Deprecated
    public static final int SSL_MAX_ERROR = 6;
    int mErrors;
    final android.net.http.SslCertificate mCertificate = null;
    final java.lang.String mUrl = null;
    @java.lang.Deprecated
    public SslError(int p0, android.net.http.SslCertificate p1) {}
    @java.lang.Deprecated
    public SslError(int p0, java.security.cert.X509Certificate p1) {}
    public SslError(int p0, android.net.http.SslCertificate p1, java.lang.String p2) {}
    public SslError(int p0, java.security.cert.X509Certificate p1, java.lang.String p2) {}
    public static android.net.http.SslError SslErrorFromChromiumErrorCode(int p0, android.net.http.SslCertificate p1, java.lang.String p2) { return null; }
    public android.net.http.SslCertificate getCertificate() { return null; }
    public java.lang.String getUrl() { return null; }
    public boolean addError(int p0) { return false; }
    public boolean hasError(int p0) { return false; }
    public int getPrimaryError() { return 0; }
    public java.lang.String toString() { return null; }
}
