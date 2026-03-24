package android.security.keystore2;

class AndroidKeyStoreBCWorkaroundProvider extends java.security.Provider {
    private static final java.lang.String PACKAGE_NAME = "android.security.keystore2";
    private static final java.lang.String KEYSTORE_SECRET_KEY_CLASS_NAME = "android.security.keystore2.AndroidKeyStoreSecretKey";
    private static final java.lang.String KEYSTORE_PRIVATE_KEY_CLASS_NAME = "android.security.keystore2.AndroidKeyStorePrivateKey";
    private static final java.lang.String KEYSTORE_PUBLIC_KEY_CLASS_NAME = "android.security.keystore2.AndroidKeyStorePublicKey";
    private static final java.lang.String DESEDE_SYSTEM_PROPERTY = "ro.hardware.keystore_desede";
    AndroidKeyStoreBCWorkaroundProvider() { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null); }
    private void putMacImpl(java.lang.String p0, java.lang.String p1) {}
    private void putSymmetricCipherImpl(java.lang.String p0, java.lang.String p1) {}
    private void putAsymmetricCipherImpl(java.lang.String p0, java.lang.String p1) {}
    private void putSignatureImpl(java.lang.String p0, java.lang.String p1) {}
    public static java.lang.String[] getSupportedEcdsaSignatureDigests() { return null; }
    public static java.lang.String[] getSupportedRsaSignatureWithPkcs1PaddingDigests() { return null; }
}
