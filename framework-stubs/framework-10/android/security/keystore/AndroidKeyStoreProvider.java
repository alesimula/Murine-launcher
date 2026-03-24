package android.security.keystore;

public class AndroidKeyStoreProvider extends java.security.Provider {
    public static final java.lang.String PROVIDER_NAME = "AndroidKeyStore";
    private static final java.lang.String PACKAGE_NAME = "android.security.keystore";
    private static final java.lang.String DESEDE_SYSTEM_PROPERTY = "ro.hardware.keystore_desede";
    public AndroidKeyStoreProvider() { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null); }
    public static void install() {}
    private void putSecretKeyFactoryImpl(java.lang.String p0) {}
    private void putKeyFactoryImpl(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public static long getKeyStoreOperationHandle(java.lang.Object p0) { return 0L; }
    public static android.security.keystore.AndroidKeyStorePublicKey getAndroidKeyStorePublicKey(java.lang.String p0, int p1, java.lang.String p2, byte[] p3) { return null; }
    private static android.security.keystore.AndroidKeyStorePrivateKey getAndroidKeyStorePrivateKey(android.security.keystore.AndroidKeyStorePublicKey p0) { return null; }
    private static android.security.keymaster.KeyCharacteristics getKeyCharacteristics(android.security.KeyStore p0, java.lang.String p1, int p2) throws java.security.UnrecoverableKeyException, android.security.keystore.KeyPermanentlyInvalidatedException { return null; }
    private static android.security.keystore.AndroidKeyStorePublicKey loadAndroidKeyStorePublicKeyFromKeystore(android.security.KeyStore p0, java.lang.String p1, int p2, android.security.keymaster.KeyCharacteristics p3) throws java.security.UnrecoverableKeyException { return null; }
    public static android.security.keystore.AndroidKeyStorePublicKey loadAndroidKeyStorePublicKeyFromKeystore(android.security.KeyStore p0, java.lang.String p1, int p2) throws java.security.UnrecoverableKeyException, android.security.keystore.KeyPermanentlyInvalidatedException { return null; }
    private static java.security.KeyPair loadAndroidKeyStoreKeyPairFromKeystore(android.security.KeyStore p0, java.lang.String p1, int p2, android.security.keymaster.KeyCharacteristics p3) throws java.security.UnrecoverableKeyException { return null; }
    public static java.security.KeyPair loadAndroidKeyStoreKeyPairFromKeystore(android.security.KeyStore p0, java.lang.String p1, int p2) throws java.security.UnrecoverableKeyException, android.security.keystore.KeyPermanentlyInvalidatedException { return null; }
    private static android.security.keystore.AndroidKeyStorePrivateKey loadAndroidKeyStorePrivateKeyFromKeystore(android.security.KeyStore p0, java.lang.String p1, int p2, android.security.keymaster.KeyCharacteristics p3) throws java.security.UnrecoverableKeyException { return null; }
    public static android.security.keystore.AndroidKeyStorePrivateKey loadAndroidKeyStorePrivateKeyFromKeystore(android.security.KeyStore p0, java.lang.String p1, int p2) throws java.security.UnrecoverableKeyException, android.security.keystore.KeyPermanentlyInvalidatedException { return null; }
    private static android.security.keystore.AndroidKeyStoreSecretKey loadAndroidKeyStoreSecretKeyFromKeystore(java.lang.String p0, int p1, android.security.keymaster.KeyCharacteristics p2) throws java.security.UnrecoverableKeyException { return null; }
    public static android.security.keystore.AndroidKeyStoreKey loadAndroidKeyStoreKeyFromKeystore(android.security.KeyStore p0, java.lang.String p1, int p2) throws java.security.UnrecoverableKeyException, android.security.keystore.KeyPermanentlyInvalidatedException { return null; }
    public static java.security.KeyStore getKeyStoreForUid(int p0) throws java.security.KeyStoreException, java.security.NoSuchProviderException { return null; }
}
