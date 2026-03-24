package android.security.keystore;

abstract class KeyStoreCryptoOperationUtils {
    private static volatile java.security.SecureRandom sRng;
    private KeyStoreCryptoOperationUtils() {}
    static java.security.InvalidKeyException getInvalidKeyExceptionForInit(android.security.KeyStore p0, android.security.keystore.AndroidKeyStoreKey p1, int p2) { return null; }
    public static java.security.GeneralSecurityException getExceptionForCipherInit(android.security.KeyStore p0, android.security.keystore.AndroidKeyStoreKey p1, int p2) { return null; }
    static byte[] getRandomBytesToMixIntoKeystoreRng(java.security.SecureRandom p0, int p1) { return null; }
    private static java.security.SecureRandom getRng() { return null; }
}
