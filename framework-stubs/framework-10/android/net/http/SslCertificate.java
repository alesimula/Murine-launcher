package android.net.http;

public class SslCertificate {
    private static java.lang.String ISO_8601_DATE_FORMAT;
    private final android.net.http.SslCertificate.DName mIssuedTo = null;
    private final android.net.http.SslCertificate.DName mIssuedBy = null;
    private final java.util.Date mValidNotBefore = null;
    private final java.util.Date mValidNotAfter = null;
    @android.annotation.UnsupportedAppUsage
    private final java.security.cert.X509Certificate mX509Certificate = null;
    private static final java.lang.String ISSUED_TO = "issued-to";
    private static final java.lang.String ISSUED_BY = "issued-by";
    private static final java.lang.String VALID_NOT_BEFORE = "valid-not-before";
    private static final java.lang.String VALID_NOT_AFTER = "valid-not-after";
    private static final java.lang.String X509_CERTIFICATE = "x509-certificate";
    public static android.os.Bundle saveState(android.net.http.SslCertificate p0) { return null; }
    public static android.net.http.SslCertificate restoreState(android.os.Bundle p0) { return null; }
    @java.lang.Deprecated
    public SslCertificate(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    @java.lang.Deprecated
    public SslCertificate(java.lang.String p0, java.lang.String p1, java.util.Date p2, java.util.Date p3) {}
    public SslCertificate(java.security.cert.X509Certificate p0) {}
    private SslCertificate(java.lang.String p0, java.lang.String p1, java.util.Date p2, java.util.Date p3, java.security.cert.X509Certificate p4) {}
    public java.util.Date getValidNotBeforeDate() { return null; }
    @java.lang.Deprecated
    public java.lang.String getValidNotBefore() { return null; }
    public java.util.Date getValidNotAfterDate() { return null; }
    @java.lang.Deprecated
    public java.lang.String getValidNotAfter() { return null; }
    public android.net.http.SslCertificate.DName getIssuedTo() { return null; }
    public android.net.http.SslCertificate.DName getIssuedBy() { return null; }
    public java.security.cert.X509Certificate getX509Certificate() { return null; }
    @android.annotation.UnsupportedAppUsage
    private static java.lang.String getSerialNumber(java.security.cert.X509Certificate p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    private static java.lang.String getDigest(java.security.cert.X509Certificate p0, java.lang.String p1) { return null; }
    private static final java.lang.String fingerprint(byte[] p0) { return null; }
    public java.lang.String toString() { return null; }
    private static java.util.Date parseDate(java.lang.String p0) { return null; }
    private static java.lang.String formatDate(java.util.Date p0) { return null; }
    private static java.util.Date cloneDate(java.util.Date p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.view.View inflateCertificateView(android.content.Context p0) { return null; }
    private java.lang.String formatCertificateDate(android.content.Context p0, java.util.Date p1) { return null; }

    public class DName {
        private java.lang.String mDName;
        private java.lang.String mCName;
        private java.lang.String mOName;
        private java.lang.String mUName;
        public DName(android.net.http.SslCertificate p0, java.lang.String p1) {}
        public java.lang.String getDName() { return null; }
        public java.lang.String getCName() { return null; }
        public java.lang.String getOName() { return null; }
        public java.lang.String getUName() { return null; }
    }
}
