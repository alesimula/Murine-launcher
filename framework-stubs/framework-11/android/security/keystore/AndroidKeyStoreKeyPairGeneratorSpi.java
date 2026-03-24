package android.security.keystore;

public abstract class AndroidKeyStoreKeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    private static final int EC_DEFAULT_KEY_SIZE = 256;
    private static final int RSA_DEFAULT_KEY_SIZE = 2048;
    private static final int RSA_MIN_KEY_SIZE = 512;
    private static final int RSA_MAX_KEY_SIZE = 8192;
    private static final java.util.Map<java.lang.String, java.lang.Integer> SUPPORTED_EC_NIST_CURVE_NAME_TO_SIZE = null;
    private static final java.util.List<java.lang.String> SUPPORTED_EC_NIST_CURVE_NAMES = null;
    private static final java.util.List<java.lang.Integer> SUPPORTED_EC_NIST_CURVE_SIZES = null;
    private final int mOriginalKeymasterAlgorithm = 0;
    private android.security.KeyStore mKeyStore;
    private android.security.keystore.KeyGenParameterSpec mSpec;
    private java.lang.String mEntryAlias;
    private int mEntryUid;
    private boolean mEncryptionAtRestRequired;
    private java.lang.String mJcaKeyAlgorithm;
    private int mKeymasterAlgorithm;
    private int mKeySizeBits;
    private java.security.SecureRandom mRng;
    private int[] mKeymasterPurposes;
    private int[] mKeymasterBlockModes;
    private int[] mKeymasterEncryptionPaddings;
    private int[] mKeymasterSignaturePaddings;
    private int[] mKeymasterDigests;
    private java.math.BigInteger mRSAPublicExponent;
    protected AndroidKeyStoreKeyPairGeneratorSpi(int p0) { super(); }
    public void initialize(int p0, java.security.SecureRandom p1) {}
    public void initialize(java.security.spec.AlgorithmParameterSpec p0, java.security.SecureRandom p1) throws java.security.InvalidAlgorithmParameterException {}
    private void resetAll() {}
    private void initAlgorithmSpecificParameters() throws java.security.InvalidAlgorithmParameterException {}
    public java.security.KeyPair generateKeyPair() { return null; }
    private java.lang.Iterable<byte[]> createCertificateChain(java.lang.String p0, java.security.KeyPair p1) throws java.security.ProviderException { return null; }
    private void generateKeystoreKeyPair(java.lang.String p0, android.security.keymaster.KeymasterArguments p1, byte[] p2, int p3) throws java.security.ProviderException {}
    private java.security.KeyPair loadKeystoreKeyPair(java.lang.String p0) throws java.security.ProviderException { return null; }
    private android.security.keymaster.KeymasterArguments constructKeyGenerationArguments() { return null; }
    private void storeCertificateChain(int p0, java.lang.Iterable<byte[]> p1) throws java.security.ProviderException {}
    private void storeCertificate(java.lang.String p0, byte[] p1, int p2, java.lang.String p3) throws java.security.ProviderException {}
    private byte[] generateSelfSignedCertificateBytes(java.security.KeyPair p0) throws java.security.ProviderException { return null; }
    private java.lang.Iterable<byte[]> getAttestationChain(java.lang.String p0, java.security.KeyPair p1, android.security.keymaster.KeymasterArguments p2) throws java.security.ProviderException { return null; }
    private void addAlgorithmSpecificParameters(android.security.keymaster.KeymasterArguments p0) {}
    private java.security.cert.X509Certificate generateSelfSignedCertificate(java.security.PrivateKey p0, java.security.PublicKey p1) throws java.security.cert.CertificateParsingException, java.io.IOException { return null; }
    private java.security.cert.X509Certificate generateSelfSignedCertificateWithValidSignature(java.security.PrivateKey p0, java.security.PublicKey p1, java.lang.String p2) throws java.lang.Exception { return null; }
    private java.security.cert.X509Certificate generateSelfSignedCertificateWithFakeSignature(java.security.PublicKey p0) throws java.io.IOException, java.security.cert.CertificateParsingException { return null; }
    private static int getDefaultKeySize(int p0) { return 0; }
    private static void checkValidKeySize(int p0, int p1, boolean p2) throws java.security.InvalidAlgorithmParameterException {}
    private static java.lang.String getCertificateSignatureAlgorithm(int p0, int p1, android.security.keystore.KeyGenParameterSpec p2) { return null; }
    private static java.util.Set<java.lang.Integer> getAvailableKeymasterSignatureDigests(java.lang.String[] p0, java.lang.String[] p1) { return null; }

    public static class EC extends android.security.keystore.AndroidKeyStoreKeyPairGeneratorSpi {
        public EC() { super(0); }
    }

    public static class RSA extends android.security.keystore.AndroidKeyStoreKeyPairGeneratorSpi {
        public RSA() { super(0); }
    }
}
