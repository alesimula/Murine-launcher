package android.security.keystore2;

public class AndroidKeyStoreKeyFactorySpi extends java.security.KeyFactorySpi {
    private final android.security.KeyStore mKeyStore = null;
    public AndroidKeyStoreKeyFactorySpi() { super(); }
    protected <T extends java.security.spec.KeySpec> T engineGetKeySpec(java.security.Key p0, java.lang.Class<T> p1) throws java.security.spec.InvalidKeySpecException { return null; }
    protected java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec p0) throws java.security.spec.InvalidKeySpecException { return null; }
    protected java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec p0) throws java.security.spec.InvalidKeySpecException { return null; }
    protected java.security.Key engineTranslateKey(java.security.Key p0) throws java.security.InvalidKeyException { return null; }
}
