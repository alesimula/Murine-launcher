package android.net;

public final class Ikev2VpnProfile extends android.net.PlatformVpnProfile {
    public static final java.lang.String PREFIX_KEYSTORE_ALIAS = "KEYSTORE_ALIAS:";
    public static final java.lang.String PREFIX_INLINE = "INLINE:";
    private static final java.lang.String ANDROID_KEYSTORE_PROVIDER = "AndroidKeyStore";
    private static final java.lang.String MISSING_PARAM_MSG_TMPL = "Required parameter was not provided: %s";
    private static final java.lang.String EMPTY_CERT = "";
    public static final java.util.List<java.lang.String> DEFAULT_ALGORITHMS = null;
    private final java.lang.String mServerAddr = null;
    private final java.lang.String mUserIdentity = null;
    private final byte[] mPresharedKey = null;
    private final java.security.cert.X509Certificate mServerRootCaCert = null;
    private final java.lang.String mUsername = null;
    private final java.lang.String mPassword = null;
    private final java.security.PrivateKey mRsaPrivateKey = null;
    private final java.security.cert.X509Certificate mUserCert = null;
    private final android.net.ProxyInfo mProxyInfo = null;
    private final java.util.List<java.lang.String> mAllowedAlgorithms = null;
    private final boolean mIsBypassable = false;
    private final boolean mIsMetered = false;
    private final int mMaxMtu = 0;
    private final boolean mIsRestrictedToTestNetworks = false;
    private static void addAlgorithmIfSupported(java.util.List<java.lang.String> p0, java.lang.String p1) {}
    private Ikev2VpnProfile(int p0, java.lang.String p1, java.lang.String p2, byte[] p3, java.security.cert.X509Certificate p4, java.lang.String p5, java.lang.String p6, java.security.PrivateKey p7, java.security.cert.X509Certificate p8, android.net.ProxyInfo p9, java.util.List<java.lang.String> p10, boolean p11, boolean p12, int p13, boolean p14) { super(0); }
    private void validate() {}
    private static void validateAllowedAlgorithms(java.util.List<java.lang.String> p0) {}
    public static boolean hasAeadAlgorithms(java.util.List<java.lang.String> p0) { return false; }
    public static boolean hasNormalModeAlgorithms(java.util.List<java.lang.String> p0) { return false; }
    public java.lang.String getServerAddr() { return null; }
    public java.lang.String getUserIdentity() { return null; }
    public byte[] getPresharedKey() { return null; }
    public java.security.cert.X509Certificate getServerRootCaCert() { return null; }
    public java.lang.String getUsername() { return null; }
    public java.lang.String getPassword() { return null; }
    public java.security.PrivateKey getRsaPrivateKey() { return null; }
    public java.security.cert.X509Certificate getUserCert() { return null; }
    public android.net.ProxyInfo getProxyInfo() { return null; }
    public java.util.List<java.lang.String> getAllowedAlgorithms() { return null; }
    public boolean isBypassable() { return false; }
    public boolean isMetered() { return false; }
    public int getMaxMtu() { return 0; }
    public boolean isRestrictedToTestNetworks() { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public com.android.internal.net.VpnProfile toVpnProfile() throws java.io.IOException, java.security.GeneralSecurityException { return null; }
    private static java.security.PrivateKey getPrivateKeyFromAndroidKeystore(java.lang.String p0) { return null; }
    public static android.net.Ikev2VpnProfile fromVpnProfile(com.android.internal.net.VpnProfile p0) throws java.security.GeneralSecurityException { return null; }
    public static boolean isValidVpnProfile(com.android.internal.net.VpnProfile p0) { return false; }
    public static java.lang.String certificateToPemString(java.security.cert.X509Certificate p0) throws java.io.IOException, java.security.cert.CertificateEncodingException { return null; }
    private static java.security.cert.X509Certificate certificateFromPemString(java.lang.String p0) throws java.security.cert.CertificateException { return null; }
    public static java.lang.String encodeForIpsecSecret(byte[] p0) { return null; }
    private static byte[] decodeFromIpsecSecret(java.lang.String p0) { return null; }
    private static java.security.PrivateKey getPrivateKey(java.lang.String p0) throws java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException { return null; }
    private static void checkCert(java.security.cert.X509Certificate p0) {}
    private static <T extends java.lang.Object> T checkNotNull(T p0, java.lang.String p1, java.lang.Object... p2) { return null; }

    public static final class Builder {
        private int mType;
        private final java.lang.String mServerAddr = null;
        private final java.lang.String mUserIdentity = null;
        private byte[] mPresharedKey;
        private java.security.cert.X509Certificate mServerRootCaCert;
        private java.lang.String mUsername;
        private java.lang.String mPassword;
        private java.security.PrivateKey mRsaPrivateKey;
        private java.security.cert.X509Certificate mUserCert;
        private android.net.ProxyInfo mProxyInfo;
        private java.util.List<java.lang.String> mAllowedAlgorithms;
        private boolean mIsBypassable;
        private boolean mIsMetered;
        private int mMaxMtu;
        private boolean mIsRestrictedToTestNetworks;
        public Builder(java.lang.String p0, java.lang.String p1) {}
        private void resetAuthParams() {}
        public android.net.Ikev2VpnProfile.Builder setAuthUsernamePassword(java.lang.String p0, java.lang.String p1, java.security.cert.X509Certificate p2) { return null; }
        public android.net.Ikev2VpnProfile.Builder setAuthDigitalSignature(java.security.cert.X509Certificate p0, java.security.PrivateKey p1, java.security.cert.X509Certificate p2) { return null; }
        public android.net.Ikev2VpnProfile.Builder setAuthPsk(byte[] p0) { return null; }
        public android.net.Ikev2VpnProfile.Builder setBypassable(boolean p0) { return null; }
        public android.net.Ikev2VpnProfile.Builder setProxy(android.net.ProxyInfo p0) { return null; }
        public android.net.Ikev2VpnProfile.Builder setMaxMtu(int p0) { return null; }
        public android.net.Ikev2VpnProfile.Builder setMetered(boolean p0) { return null; }
        public android.net.Ikev2VpnProfile.Builder setAllowedAlgorithms(java.util.List<java.lang.String> p0) { return null; }
        public android.net.Ikev2VpnProfile.Builder restrictToTestNetworks() { return null; }
        public android.net.Ikev2VpnProfile build() { return null; }
    }
}
