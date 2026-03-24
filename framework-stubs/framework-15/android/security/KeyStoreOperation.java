package android.security;

public class KeyStoreOperation {
    static final java.lang.String TAG = "KeyStoreOperation";
    public KeyStoreOperation(android.system.keystore2.IKeystoreOperation p0, java.lang.Long p1, android.hardware.security.keymint.KeyParameter[] p2) {}
    public java.lang.Long getChallenge() { return null; }
    public android.hardware.security.keymint.KeyParameter[] getParameters() { return null; }
    public void updateAad(byte[] p0) throws android.security.KeyStoreException {}
    public byte[] update(byte[] p0) throws android.security.KeyStoreException { return null; }
    public byte[] finish(byte[] p0, byte[] p1) throws android.security.KeyStoreException { return null; }
    public void abort() throws android.security.KeyStoreException {}
}
