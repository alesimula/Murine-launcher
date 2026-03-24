package android.security;

public final class KeyChain {
    public static final java.lang.String LOG = "KeyChain";
    public static final java.lang.String ACCOUNT_TYPE = "com.android.keychain";
    public static final java.lang.String EXTRA_RESPONSE = "response";
    public static final java.lang.String EXTRA_URI = "uri";
    public static final java.lang.String EXTRA_ALIAS = "alias";
    public static final java.lang.String EXTRA_SENDER = "sender";
    public static final java.lang.String EXTRA_KEY_TYPES = "key_types";
    public static final java.lang.String EXTRA_ISSUERS = "issuers";
    public static final java.lang.String EXTRA_NAME = "name";
    public static final java.lang.String EXTRA_CERTIFICATE = "CERT";
    public static final java.lang.String EXTRA_PKCS12 = "PKCS12";
    public static final java.lang.String EXTRA_AUTHENTICATION_POLICY = "android.security.extra.AUTHENTICATION_POLICY";
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
    public static final java.lang.String KEY_ALIAS_SELECTION_DENIED = "android:alias-selection-denied";
    public static final java.lang.String GRANT_ALIAS_PREFIX = "ks2_keychain_grant_id:";
    public KeyChain() {}
    public static android.content.Intent createInstallIntent() { return null; }
    public static android.content.Intent createManageCredentialsIntent(android.security.AppUriAuthenticationPolicy p0) { return null; }
    public static void choosePrivateKeyAlias(android.app.Activity p0, android.security.KeyChainAliasCallback p1, java.lang.String[] p2, java.security.Principal[] p3, java.lang.String p4, int p5, java.lang.String p6) {}
    public static void choosePrivateKeyAlias(android.app.Activity p0, android.security.KeyChainAliasCallback p1, java.lang.String[] p2, java.security.Principal[] p3, android.net.Uri p4, java.lang.String p5) {}
    public static boolean isCredentialManagementApp(android.content.Context p0) { return false; }
    public static android.security.AppUriAuthenticationPolicy getCredentialManagementAppPolicy(android.content.Context p0) throws java.lang.SecurityException { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_CREDENTIAL_MANAGEMENT_APP")
    public static boolean setCredentialManagementApp(android.content.Context p0, java.lang.String p1, android.security.AppUriAuthenticationPolicy p2) { return false; }
    @android.annotation.RequiresPermission(value="android.permission.MANAGE_CREDENTIAL_MANAGEMENT_APP", conditional=true)
    public static boolean removeCredentialManagementApp(android.content.Context p0) { return false; }
    public static java.security.PrivateKey getPrivateKey(android.content.Context p0, java.lang.String p1) throws android.security.KeyChainException, java.lang.InterruptedException { return null; }
    public static java.lang.String getGrantString(android.system.keystore2.KeyDescriptor p0) { return null; }
    public static java.security.KeyPair getKeyPair(android.content.Context p0, java.lang.String p1) throws android.security.KeyChainException, java.lang.InterruptedException { return null; }
    public static java.security.cert.X509Certificate[] getCertificateChain(android.content.Context p0, java.lang.String p1) throws android.security.KeyChainException, java.lang.InterruptedException { return null; }
    public static boolean isKeyAlgorithmSupported(java.lang.String p0) { return false; }
    @java.lang.Deprecated
    public static boolean isBoundKeyAlgorithm(java.lang.String p0) { return false; }
    public static java.security.cert.X509Certificate toCertificate(byte[] p0) { return null; }
    public static java.util.Collection<java.security.cert.X509Certificate> toCertificates(byte[] p0) { return null; }
    public static android.security.KeyChain.KeyChainConnection bind(android.content.Context p0) throws java.lang.InterruptedException { return null; }
    public static android.security.KeyChain.KeyChainConnection bindAsUser(android.content.Context p0, android.os.UserHandle p1) throws java.lang.InterruptedException { return null; }
    @android.annotation.SystemApi
    public static java.lang.String getWifiKeyGrantAsUser(android.content.Context p0, android.os.UserHandle p1, java.lang.String p2) { return null; }
    @android.annotation.SystemApi
    public static boolean hasWifiKeyGrantAsUser(android.content.Context p0, android.os.UserHandle p1, java.lang.String p2) { return false; }
    public static android.security.KeyChain.KeyChainConnection bindAsUser(android.content.Context p0, android.os.Handler p1, android.os.UserHandle p2) throws java.lang.InterruptedException { return null; }

    private static class AliasResponse extends android.security.IKeyChainAliasCallback.Stub {
        public void alias(java.lang.String p0) {}
    }

    public static class KeyChainConnection implements java.io.Closeable {
        protected KeyChainConnection(android.content.Context p0, android.content.ServiceConnection p1, android.security.IKeyChainService p2) {}
        public void close() {}
        public android.security.IKeyChainService getService() { return null; }
    }
}
