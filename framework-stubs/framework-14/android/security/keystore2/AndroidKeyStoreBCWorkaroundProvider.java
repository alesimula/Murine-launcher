package android.security.keystore2;

class AndroidKeyStoreBCWorkaroundProvider extends java.security.Provider {
    AndroidKeyStoreBCWorkaroundProvider() { super(null, 0.0, null); }
    public static java.lang.String[] getSupportedEcdsaSignatureDigests() { return null; }
    public static java.lang.String[] getSupportedRsaSignatureWithPkcs1PaddingDigests() { return null; }
}
