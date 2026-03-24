package android.security;

public final class KeyChain {
    public static final java.lang.String ACCOUNT_TYPE = "com.android.keychain";
    private static final java.lang.String KEYCHAIN_PACKAGE = "com.android.keychain";
    private static final java.lang.String ACTION_CHOOSER = "com.android.keychain.CHOOSER";
    private static final java.lang.String CERT_INSTALLER_PACKAGE = "com.android.certinstaller";
    public static final java.lang.String EXTRA_RESPONSE = "response";
    public static final java.lang.String EXTRA_URI = "uri";
    public static final java.lang.String EXTRA_ALIAS = "alias";
    public static final java.lang.String EXTRA_SENDER = "sender";
    public static final java.lang.String EXTRA_KEY_TYPES = "key_types";
    public static final java.lang.String EXTRA_ISSUERS = "issuers";
    private static final java.lang.String ACTION_INSTALL = "android.credentials.INSTALL";
    public static final java.lang.String EXTRA_NAME = "name";
    public static final java.lang.String EXTRA_CERTIFICATE = "CERT";
    public static final java.lang.String EXTRA_PKCS12 = "PKCS12";
    public static final java.lang.String ACTION_STORAGE_CHANGED = "android.security.STORAGE_CHANGED";
    public static final java.lang.String ACTION_KEYCHAIN_CHANGED = "android.security.action.KEYCHAIN_CHANGED";
    public static final java.lang.String ACTION_TRUST_STORE_CHANGED = "android.security.action.TRUST_STORE_CHANGED";
    public static final java.lang.String ACTION_KEY_ACCESS_CHANGED = "android.security.action.KEY_ACCESS_CHANGED";
    public static final java.lang.String EXTRA_KEY_ALIAS = "android.security.extra.KEY_ALIAS";
    public static final java.lang.String EXTRA_KEY_ACCESSIBLE = "android.security.extra.KEY_ACCESSIBLE";
    public static final int KEY_GEN_SUCCESS = 0;
    public static final int KEY_GEN_MISSING_ALIAS = 1;
    public static final int KEY_GEN_SUPERFLUOUS_ATTESTATION_CHALLENGE = 2;
    public static final int KEY_GEN_NO_SUCH_ALGORITHM = 3;
    public static final int KEY_GEN_INVALID_ALGORITHM_PARAMETERS = 4;
    public static final int KEY_GEN_NO_KEYSTORE_PROVIDER = 5;
    public static final int KEY_GEN_STRONGBOX_UNAVAILABLE = 6;
    public static final int KEY_GEN_FAILURE = 7;
    public static final int KEY_ATTESTATION_SUCCESS = 0;
    public static final int KEY_ATTESTATION_MISSING_CHALLENGE = 1;
    public static final int KEY_ATTESTATION_CANNOT_COLLECT_DATA = 2;
    public static final int KEY_ATTESTATION_CANNOT_ATTEST_IDS = 3;
    public static final int KEY_ATTESTATION_FAILURE = 4;
    public KeyChain() {}
    public static android.content.Intent createInstallIntent() { return null; }
    public static void choosePrivateKeyAlias(android.app.Activity p0, android.security.KeyChainAliasCallback p1, java.lang.String[] p2, java.security.Principal[] p3, java.lang.String p4, int p5, java.lang.String p6) {}
    public static void choosePrivateKeyAlias(android.app.Activity p0, android.security.KeyChainAliasCallback p1, java.lang.String[] p2, java.security.Principal[] p3, android.net.Uri p4, java.lang.String p5) {}
    public static java.security.PrivateKey getPrivateKey(android.content.Context p0, java.lang.String p1) throws android.security.KeyChainException, java.lang.InterruptedException { return null; }
    public static java.security.KeyPair getKeyPair(android.content.Context p0, java.lang.String p1) throws android.security.KeyChainException, java.lang.InterruptedException { return null; }
    public static java.security.cert.X509Certificate[] getCertificateChain(android.content.Context p0, java.lang.String p1) throws android.security.KeyChainException, java.lang.InterruptedException { return null; }
    public static boolean isKeyAlgorithmSupported(java.lang.String p0) { return false; }
    @java.lang.Deprecated
    public static boolean isBoundKeyAlgorithm(java.lang.String p0) { return false; }
    public static java.security.cert.X509Certificate toCertificate(byte[] p0) { return null; }
    public static java.util.Collection<java.security.cert.X509Certificate> toCertificates(byte[] p0) { return null; }
    public static android.security.KeyChain.KeyChainConnection bind(android.content.Context p0) throws java.lang.InterruptedException { return null; }
    public static android.security.KeyChain.KeyChainConnection bindAsUser(android.content.Context p0, android.os.UserHandle p1) throws java.lang.InterruptedException { return null; }
    private static void ensureNotOnMainThread(android.content.Context p0) {}

    public static class KeyChainConnection implements java.io.Closeable {
        private final android.content.Context context = null;
        private final android.content.ServiceConnection serviceConnection = null;
        private final android.security.IKeyChainService service = null;
        protected KeyChainConnection(android.content.Context p0, android.content.ServiceConnection p1, android.security.IKeyChainService p2) {}
        public void close() {}
        public android.security.IKeyChainService getService() { return null; }
    }

    private static class AliasResponse extends android.security.IKeyChainAliasCallback.Stub {
        private final android.security.KeyChainAliasCallback keyChainAliasResponse = null;
        private AliasResponse(android.security.KeyChainAliasCallback p0) { super(); }
        public void alias(java.lang.String p0) {}
    }
}
