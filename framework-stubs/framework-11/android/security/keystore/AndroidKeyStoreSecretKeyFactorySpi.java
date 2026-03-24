package android.security.keystore;

public class AndroidKeyStoreSecretKeyFactorySpi extends javax.crypto.SecretKeyFactorySpi {
    private final android.security.KeyStore mKeyStore = null;
    public AndroidKeyStoreSecretKeyFactorySpi() { super(); }
    protected java.security.spec.KeySpec engineGetKeySpec(javax.crypto.SecretKey p0, java.lang.Class p1) throws java.security.spec.InvalidKeySpecException { return null; }
    static android.security.keystore.KeyInfo getKeyInfo(android.security.KeyStore p0, java.lang.String p1, java.lang.String p2, int p3) { return null; }
    private static java.math.BigInteger getGateKeeperSecureUserId() throws java.security.ProviderException { return null; }
    protected javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec p0) throws java.security.spec.InvalidKeySpecException { return null; }
    protected javax.crypto.SecretKey engineTranslateKey(javax.crypto.SecretKey p0) throws java.security.InvalidKeyException { return null; }
}
