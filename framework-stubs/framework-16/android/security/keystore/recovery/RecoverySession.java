package android.security.keystore.recovery;

@android.annotation.SystemApi
public class RecoverySession implements java.lang.AutoCloseable {
    @android.annotation.RequiresPermission("android.permission.RECOVER_KEYSTORE")
    @android.annotation.NonNull
    static android.security.keystore.recovery.RecoverySession newInstance(android.security.keystore.recovery.RecoveryController p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.RECOVER_KEYSTORE")
    @android.annotation.NonNull
    public byte[] start(java.lang.String p0, java.security.cert.CertPath p1, byte[] p2, byte[] p3, java.util.List<android.security.keystore.recovery.KeyChainProtectionParams> p4) throws java.security.cert.CertificateException, android.security.keystore.recovery.InternalRecoveryServiceException { return null; }
    @android.annotation.RequiresPermission("android.permission.RECOVER_KEYSTORE")
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.security.Key> recoverKeyChainSnapshot(byte[] p0, java.util.List<android.security.keystore.recovery.WrappedApplicationKey> p1) throws android.security.keystore.recovery.SessionExpiredException, android.security.keystore.recovery.DecryptionFailedException, android.security.keystore.recovery.InternalRecoveryServiceException { return null; }
    @android.annotation.NonNull
    java.lang.String getSessionId() { return null; }
    @android.annotation.RequiresPermission("android.permission.RECOVER_KEYSTORE")
    public void close() {}
}
