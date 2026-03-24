package android.security.net.config;

public final class WfaCertificateSource extends android.security.net.config.DirectoryCertificateSource {
    private WfaCertificateSource() { super(null); }
    public static android.security.net.config.WfaCertificateSource getInstance() { return null; }
    protected boolean isCertMarkedAsRemoved(java.lang.String p0) { return false; }

    private static class NoPreloadHolder {
        private static final android.security.net.config.WfaCertificateSource INSTANCE = null;
        private NoPreloadHolder() {}
    }
}
