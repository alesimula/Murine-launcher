package android.security.net.config;

public final class SystemCertificateSource extends android.security.net.config.DirectoryCertificateSource {
    private final java.io.File mUserRemovedCaDir = null;
    private SystemCertificateSource() { super(null); }
    public static android.security.net.config.SystemCertificateSource getInstance() { return null; }
    protected boolean isCertMarkedAsRemoved(java.lang.String p0) { return false; }

    private static class NoPreloadHolder {
        private static final android.security.net.config.SystemCertificateSource INSTANCE = null;
        private NoPreloadHolder() {}
    }
}
