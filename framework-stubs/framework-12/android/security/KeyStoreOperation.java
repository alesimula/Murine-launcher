package android.security;

public class KeyStoreOperation {
    static final java.lang.String TAG = "KeyStoreOperation";
    private final android.system.keystore2.IKeystoreOperation mOperation = null;
    private final java.lang.Long mChallenge = null;
    private final android.hardware.security.keymint.KeyParameter[] mParameters = null;
    public KeyStoreOperation(android.system.keystore2.IKeystoreOperation p0, java.lang.Long p1, android.hardware.security.keymint.KeyParameter[] p2) {}
    public java.lang.Long getChallenge() { return null; }
    public android.hardware.security.keymint.KeyParameter[] getParameters() { return null; }
    private <R extends java.lang.Object> R handleExceptions(android.security.CheckedRemoteRequest<R> p0) throws android.security.KeyStoreException { return null; }
    public void updateAad(byte[] p0) throws android.security.KeyStoreException {}
    public byte[] update(byte[] p0) throws android.security.KeyStoreException { return null; }
    public byte[] finish(byte[] p0, byte[] p1) throws android.security.KeyStoreException { return null; }
    public void abort() throws android.security.KeyStoreException {}
}
