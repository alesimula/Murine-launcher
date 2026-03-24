package android.security.keystore.recovery;

@android.annotation.SystemApi
public class RecoverySession implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "RecoverySession";
    private static final int SESSION_ID_LENGTH_BYTES = 16;
    private final java.lang.String mSessionId = null;
    private final android.security.keystore.recovery.RecoveryController mRecoveryController = null;
    private RecoverySession(android.security.keystore.recovery.RecoveryController p0, java.lang.String p1) {}
    @android.annotation.RequiresPermission("android.permission.RECOVER_KEYSTORE")
    static android.security.keystore.recovery.RecoverySession newInstance(android.security.keystore.recovery.RecoveryController p0) { return null; }
    private static java.lang.String newSessionId() { return null; }
    @android.annotation.RequiresPermission("android.permission.RECOVER_KEYSTORE")
    public byte[] start(java.lang.String p0, java.security.cert.CertPath p1, byte[] p2, byte[] p3, java.util.List<android.security.keystore.recovery.KeyChainProtectionParams> p4) throws java.security.cert.CertificateException, android.security.keystore.recovery.InternalRecoveryServiceException { return null; }
    @android.annotation.RequiresPermission("android.permission.RECOVER_KEYSTORE")
    public java.util.Map<java.lang.String, java.security.Key> recoverKeyChainSnapshot(byte[] p0, java.util.List<android.security.keystore.recovery.WrappedApplicationKey> p1) throws android.security.keystore.recovery.SessionExpiredException, android.security.keystore.recovery.DecryptionFailedException, android.security.keystore.recovery.InternalRecoveryServiceException { return null; }
    private java.util.Map<java.lang.String, java.security.Key> getKeysFromGrants(java.util.Map<java.lang.String, java.lang.String> p0) throws android.security.keystore.recovery.InternalRecoveryServiceException { return null; }
    java.lang.String getSessionId() { return null; }
    @android.annotation.RequiresPermission("android.permission.RECOVER_KEYSTORE")
    public void close() {}
}
