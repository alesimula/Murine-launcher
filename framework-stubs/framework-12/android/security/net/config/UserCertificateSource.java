package android.security.net.config;

public final class UserCertificateSource extends android.security.net.config.DirectoryCertificateSource {
    private UserCertificateSource() { super(null); }
    public static android.security.net.config.UserCertificateSource getInstance() { return null; }
    protected boolean isCertMarkedAsRemoved(java.lang.String p0) { return false; }

    private static class NoPreloadHolder {
        private static final android.security.net.config.UserCertificateSource INSTANCE = null;
        private NoPreloadHolder() {}
    }
}
