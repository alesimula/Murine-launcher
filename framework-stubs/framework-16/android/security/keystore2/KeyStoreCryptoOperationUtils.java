package android.security.keystore2;

abstract class KeyStoreCryptoOperationUtils {
    public static boolean canUserAuthorizationSucceed(android.security.keystore2.AndroidKeyStoreKey p0) { return false; }
    public static java.security.InvalidKeyException getInvalidKeyException(android.security.keystore2.AndroidKeyStoreKey p0, android.security.KeyStoreException p1) { return null; }
    public static java.security.GeneralSecurityException getExceptionForCipherInit(android.security.keystore2.AndroidKeyStoreKey p0, android.security.KeyStoreException p1) { return null; }
    static byte[] getRandomBytesToMixIntoKeystoreRng(java.security.SecureRandom p0, int p1) { return null; }
    static void abortOperation(android.security.KeyStoreOperation p0) {}
    static long getOrMakeOperationChallenge(android.security.KeyStoreOperation p0, android.security.keystore2.AndroidKeyStoreKey p1) throws android.security.keystore.KeyPermanentlyInvalidatedException { return 0L; }
}
