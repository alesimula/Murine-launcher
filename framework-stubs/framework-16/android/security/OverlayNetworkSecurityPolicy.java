package android.security;

public class OverlayNetworkSecurityPolicy {
    public OverlayNetworkSecurityPolicy(libcore.net.NetworkSecurityPolicy p0, boolean p1) {}
    public boolean isCleartextTrafficPermitted() { return false; }
    public boolean isCleartextTrafficPermitted(java.lang.String p0) { return false; }
    public boolean isCertificateTransparencyVerificationRequired(java.lang.String p0) { return false; }
}
