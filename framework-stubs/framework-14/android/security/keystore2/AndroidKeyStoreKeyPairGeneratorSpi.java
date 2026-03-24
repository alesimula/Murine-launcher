package android.security.keystore2;

public abstract class AndroidKeyStoreKeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    protected AndroidKeyStoreKeyPairGeneratorSpi(int p0) { super(); }
    public void initialize(int p0, java.security.SecureRandom p1) {}
    public void initialize(java.security.spec.AlgorithmParameterSpec p0, java.security.SecureRandom p1) throws java.security.InvalidAlgorithmParameterException {}
    public java.security.KeyPair generateKeyPair() { return null; }

    public static class EC extends android.security.keystore2.AndroidKeyStoreKeyPairGeneratorSpi {
        public EC() { super(0); }
    }

    public static class RSA extends android.security.keystore2.AndroidKeyStoreKeyPairGeneratorSpi {
        public RSA() { super(0); }
    }

    public static class XDH extends android.security.keystore2.AndroidKeyStoreKeyPairGeneratorSpi {
        public XDH() { super(0); }
    }
}
