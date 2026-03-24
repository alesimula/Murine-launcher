package android.security.keystore2;

public class AndroidKeyStoreProvider extends java.security.Provider {
    public AndroidKeyStoreProvider() { super(null, 0.0, null); }
    public static void install() {}
    public static long getKeyStoreOperationHandle(java.lang.Object p0) { return 0L; }
    static android.security.keystore2.AndroidKeyStorePublicKey makeAndroidKeyStorePublicKeyFromKeyEntryResponse(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyMetadata p1, android.security.KeyStoreSecurityLevel p2, int p3) throws java.security.UnrecoverableKeyException { return null; }
    public static android.security.keystore2.AndroidKeyStorePublicKey loadAndroidKeyStorePublicKeyFromKeystore(android.security.KeyStore2 p0, java.lang.String p1, int p2) throws java.security.UnrecoverableKeyException, android.security.keystore.KeyPermanentlyInvalidatedException { return null; }
    public static java.security.KeyPair loadAndroidKeyStoreKeyPairFromKeystore(android.security.KeyStore2 p0, android.system.keystore2.KeyDescriptor p1) throws java.security.UnrecoverableKeyException, android.security.keystore.KeyPermanentlyInvalidatedException { return null; }
    public static android.security.keystore2.AndroidKeyStorePrivateKey loadAndroidKeyStorePrivateKeyFromKeystore(android.security.KeyStore2 p0, java.lang.String p1, int p2) throws java.security.UnrecoverableKeyException, android.security.keystore.KeyPermanentlyInvalidatedException { return null; }
    public static javax.crypto.SecretKey loadAndroidKeyStoreSecretKeyFromKeystore(android.security.KeyStore2 p0, android.system.keystore2.KeyDescriptor p1) throws java.security.UnrecoverableKeyException, android.security.keystore.KeyPermanentlyInvalidatedException { return null; }
    public static android.security.keystore2.AndroidKeyStoreKey loadAndroidKeyStoreKeyFromKeystore(android.security.KeyStore2 p0, java.lang.String p1, int p2) throws java.security.UnrecoverableKeyException, android.security.keystore.KeyPermanentlyInvalidatedException { return null; }
}
