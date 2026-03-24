package android.security;

public class KeyStore2 {
    static final long KEYSTORE_OPERATION_CREATION_MAY_FAIL = 169897160L;
    public static android.security.KeyStore2 getInstance() { return null; }
    void delete(android.system.keystore2.KeyDescriptor p0) throws android.security.KeyStoreException {}
    public android.system.keystore2.KeyDescriptor[] list(int p0, long p1) throws android.security.KeyStoreException { return null; }
    public android.system.keystore2.KeyDescriptor[] listBatch(int p0, long p1, java.lang.String p2) throws android.security.KeyStoreException { return null; }
    public static java.lang.String makeKeystoreEngineGrantString(long p0) { return null; }
    public static android.system.keystore2.KeyDescriptor keystoreEngineGrantString2KeyDescriptor(java.lang.String p0) { return null; }
    public android.system.keystore2.KeyDescriptor grant(android.system.keystore2.KeyDescriptor p0, int p1, int p2) throws android.security.KeyStoreException { return null; }
    public void ungrant(android.system.keystore2.KeyDescriptor p0, int p1) throws android.security.KeyStoreException {}
    public android.system.keystore2.KeyEntryResponse getKeyEntry(android.system.keystore2.KeyDescriptor p0) throws android.security.KeyStoreException { return null; }
    public android.security.KeyStoreSecurityLevel getSecurityLevel(int p0) throws android.security.KeyStoreException { return null; }
    public void updateSubcomponents(android.system.keystore2.KeyDescriptor p0, byte[] p1, byte[] p2) throws android.security.KeyStoreException {}
    public void deleteKey(android.system.keystore2.KeyDescriptor p0) throws android.security.KeyStoreException {}
    public int getNumberOfEntries(int p0, long p1) throws android.security.KeyStoreException { return 0; }
    protected static void interruptedPreservingSleep(long p0) {}
    static android.security.KeyStoreException getKeyStoreException(int p0, java.lang.String p1) { return null; }

    @java.lang.FunctionalInterface
    static interface CheckedRemoteRequest<R extends java.lang.Object> {
        public R execute(android.system.keystore2.IKeystoreService p0) throws android.os.RemoteException;
    }
}
