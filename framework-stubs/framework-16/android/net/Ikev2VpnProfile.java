package android.net;

public final class Ikev2VpnProfile extends android.net.PlatformVpnProfile {
    public static final java.lang.String PREFIX_KEYSTORE_ALIAS = "KEYSTORE_ALIAS:";
    public static final java.lang.String PREFIX_INLINE = "INLINE:";
    public static final java.util.List<java.lang.String> DEFAULT_ALGORITHMS = null;
    Ikev2VpnProfile() { super(0, false, false); }
    public static boolean hasAeadAlgorithms(java.util.List<java.lang.String> p0) { return false; }
    public static boolean hasNormalModeAlgorithms(java.util.List<java.lang.String> p0) { return false; }
    @android.annotation.NonNull
    public java.lang.String getServerAddr() { return null; }
    @android.annotation.NonNull
    public java.lang.String getUserIdentity() { return null; }
    @android.annotation.Nullable
    public byte[] getPresharedKey() { return null; }
    @android.annotation.Nullable
    public java.security.cert.X509Certificate getServerRootCaCert() { return null; }
    @android.annotation.Nullable
    public java.lang.String getUsername() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPassword() { return null; }
    @android.annotation.Nullable
    public java.security.PrivateKey getRsaPrivateKey() { return null; }
    @android.annotation.Nullable
    public java.security.cert.X509Certificate getUserCert() { return null; }
    @android.annotation.Nullable
    public android.net.ProxyInfo getProxyInfo() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getAllowedAlgorithms() { return null; }
    public boolean isBypassable() { return false; }
    public boolean isMetered() { return false; }
    public int getMaxMtu() { return 0; }
    @android.annotation.Nullable
    public android.net.ipsec.ike.IkeTunnelConnectionParams getIkeTunnelConnectionParams() { return null; }
    public boolean isRestrictedToTestNetworks() { return false; }
    public boolean isAutomaticNattKeepaliveTimerEnabled() { return false; }
    public boolean isAutomaticIpVersionSelectionEnabled() { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    @android.annotation.NonNull
    public com.android.internal.net.VpnProfile toVpnProfile() throws java.io.IOException, java.security.GeneralSecurityException { return null; }
    @android.annotation.NonNull
    public static android.net.Ikev2VpnProfile fromVpnProfile(com.android.internal.net.VpnProfile p0) throws java.security.GeneralSecurityException { return null; }
    public static boolean isValidVpnProfile(com.android.internal.net.VpnProfile p0) { return false; }
    @android.annotation.NonNull
    public static java.lang.String certificateToPemString(java.security.cert.X509Certificate p0) throws java.io.IOException, java.security.cert.CertificateEncodingException { return null; }
    @android.annotation.NonNull
    public static java.lang.String encodeForIpsecSecret(byte[] p0) { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1) {}
        public Builder(android.net.ipsec.ike.IkeTunnelConnectionParams p0) {}
        @android.annotation.NonNull
        public android.net.Ikev2VpnProfile.Builder setAuthUsernamePassword(java.lang.String p0, java.lang.String p1, java.security.cert.X509Certificate p2) { return null; }
        @android.annotation.NonNull
        public android.net.Ikev2VpnProfile.Builder setAuthDigitalSignature(java.security.cert.X509Certificate p0, java.security.PrivateKey p1, java.security.cert.X509Certificate p2) { return null; }
        @android.annotation.NonNull
        public android.net.Ikev2VpnProfile.Builder setAuthPsk(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.Ikev2VpnProfile.Builder setBypassable(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.Ikev2VpnProfile.Builder setProxy(android.net.ProxyInfo p0) { return null; }
        @android.annotation.NonNull
        public android.net.Ikev2VpnProfile.Builder setMaxMtu(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.Ikev2VpnProfile.Builder setRequiresInternetValidation(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.Ikev2VpnProfile.Builder setMetered(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.Ikev2VpnProfile.Builder setAllowedAlgorithms(java.util.List<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.net.Ikev2VpnProfile.Builder restrictToTestNetworks() { return null; }
        @android.annotation.NonNull
        public android.net.Ikev2VpnProfile.Builder setAutomaticNattKeepaliveTimerEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.Ikev2VpnProfile.Builder setAutomaticIpVersionSelectionEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.Ikev2VpnProfile.Builder setLocalRoutesExcluded(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.Ikev2VpnProfile build() { return null; }
    }
}
