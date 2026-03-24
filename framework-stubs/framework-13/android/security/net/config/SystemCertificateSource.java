package android.security.net.config;

public final class SystemCertificateSource extends android.security.net.config.DirectoryCertificateSource {
    SystemCertificateSource() { super(null); }
    public static android.security.net.config.SystemCertificateSource getInstance() { return null; }
    protected boolean isCertMarkedAsRemoved(java.lang.String p0) { return false; }

    private static class NoPreloadHolder {
    }
}
