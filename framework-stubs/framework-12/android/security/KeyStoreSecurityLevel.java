package android.security;

public class KeyStoreSecurityLevel {
    private static final java.lang.String TAG = "KeyStoreSecurityLevel";
    private final android.system.keystore2.IKeystoreSecurityLevel mSecurityLevel = null;
    public KeyStoreSecurityLevel(android.system.keystore2.IKeystoreSecurityLevel p0) {}
    private <R extends java.lang.Object> R handleExceptions(android.security.CheckedRemoteRequest<R> p0) throws android.security.KeyStoreException { return null; }
    public android.security.KeyStoreOperation createOperation(android.system.keystore2.KeyDescriptor p0, java.util.Collection<android.hardware.security.keymint.KeyParameter> p1) throws android.security.KeyStoreException { return null; }
    public android.system.keystore2.KeyMetadata generateKey(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1, java.util.Collection<android.hardware.security.keymint.KeyParameter> p2, int p3, byte[] p4) throws android.security.KeyStoreException { return null; }
    public android.system.keystore2.KeyMetadata importKey(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1, java.util.Collection<android.hardware.security.keymint.KeyParameter> p2, int p3, byte[] p4) throws android.security.KeyStoreException { return null; }
    public android.system.keystore2.KeyMetadata importWrappedKey(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1, byte[] p2, byte[] p3, java.util.Collection<android.hardware.security.keymint.KeyParameter> p4, android.system.keystore2.AuthenticatorSpec[] p5) throws android.security.KeyStoreException { return null; }
    protected static void interruptedPreservingSleep(long p0) {}
}
