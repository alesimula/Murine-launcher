package android.net.http;

public class SslCertificate {
    public static android.os.Bundle saveState(android.net.http.SslCertificate p0) { return null; }
    public static android.net.http.SslCertificate restoreState(android.os.Bundle p0) { return null; }
    @java.lang.Deprecated
    public SslCertificate(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    @java.lang.Deprecated
    public SslCertificate(java.lang.String p0, java.lang.String p1, java.util.Date p2, java.util.Date p3) {}
    public SslCertificate(java.security.cert.X509Certificate p0) {}
    public java.util.Date getValidNotBeforeDate() { return null; }
    @java.lang.Deprecated
    public java.lang.String getValidNotBefore() { return null; }
    public java.util.Date getValidNotAfterDate() { return null; }
    @java.lang.Deprecated
    public java.lang.String getValidNotAfter() { return null; }
    public android.net.http.SslCertificate.DName getIssuedTo() { return null; }
    public android.net.http.SslCertificate.DName getIssuedBy() { return null; }
    @android.annotation.Nullable
    public java.security.cert.X509Certificate getX509Certificate() { return null; }
    public java.lang.String toString() { return null; }
    public android.view.View inflateCertificateView(android.content.Context p0) { return null; }

    public class DName {
        public DName(android.net.http.SslCertificate p0, java.lang.String p1) {}
        public java.lang.String getDName() { return null; }
        public java.lang.String getCName() { return null; }
        public java.lang.String getOName() { return null; }
        public java.lang.String getUName() { return null; }
    }
}
