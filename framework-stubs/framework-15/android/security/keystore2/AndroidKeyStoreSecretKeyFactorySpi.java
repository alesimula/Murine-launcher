package android.security.keystore2;

public class AndroidKeyStoreSecretKeyFactorySpi extends javax.crypto.SecretKeyFactorySpi {
    public AndroidKeyStoreSecretKeyFactorySpi() { super(); }
    protected java.security.spec.KeySpec engineGetKeySpec(javax.crypto.SecretKey p0, java.lang.Class p1) throws java.security.spec.InvalidKeySpecException { return null; }
    @android.annotation.NonNull
    static android.security.keystore.KeyInfo getKeyInfo(android.security.keystore2.AndroidKeyStoreKey p0) { return null; }
    protected javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec p0) throws java.security.spec.InvalidKeySpecException { return null; }
    protected javax.crypto.SecretKey engineTranslateKey(javax.crypto.SecretKey p0) throws java.security.InvalidKeyException { return null; }
}
