package android.security.keystore2;

public abstract class AndroidKeyStoreKeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    private static final java.lang.String TAG = "AndroidKeyStoreKeyPairGeneratorSpi";
    private static final int EC_DEFAULT_KEY_SIZE = 256;
    private static final int RSA_DEFAULT_KEY_SIZE = 2048;
    private static final int RSA_MIN_KEY_SIZE = 512;
    private static final int RSA_MAX_KEY_SIZE = 8192;
    private static final java.util.Map<java.lang.String, java.lang.Integer> SUPPORTED_EC_NIST_CURVE_NAME_TO_SIZE = null;
    private static final java.util.List<java.lang.String> SUPPORTED_EC_NIST_CURVE_NAMES = null;
    private static final java.util.List<java.lang.Integer> SUPPORTED_EC_NIST_CURVE_SIZES = null;
    private final int mOriginalKeymasterAlgorithm = 0;
    private android.security.KeyStore2 mKeyStore;
    private android.security.keystore.KeyGenParameterSpec mSpec;
    private java.lang.String mEntryAlias;
    private int mEntryNamespace;
    private java.lang.String mJcaKeyAlgorithm;
    private int mKeymasterAlgorithm;
    private int mKeySizeBits;
    private java.security.SecureRandom mRng;
    private android.system.keystore2.KeyDescriptor mAttestKeyDescriptor;
    private int[] mKeymasterPurposes;
    private int[] mKeymasterBlockModes;
    private int[] mKeymasterEncryptionPaddings;
    private int[] mKeymasterSignaturePaddings;
    private int[] mKeymasterDigests;
    private java.lang.Long mRSAPublicExponent;
    protected AndroidKeyStoreKeyPairGeneratorSpi(int p0) { super(); }
    @android.hardware.security.keymint.EcCurve
    private int keySize2EcCurve(int p0) throws java.security.InvalidAlgorithmParameterException { return 0; }
    public void initialize(int p0, java.security.SecureRandom p1) {}
    public void initialize(java.security.spec.AlgorithmParameterSpec p0, java.security.SecureRandom p1) throws java.security.InvalidAlgorithmParameterException {}
    private void checkAttestKeyPurpose(android.security.keystore.KeyGenParameterSpec p0) throws java.security.InvalidAlgorithmParameterException {}
    private android.system.keystore2.KeyDescriptor buildAndCheckAttestKeyDescriptor(android.security.keystore.KeyGenParameterSpec p0) throws java.security.InvalidAlgorithmParameterException { return null; }
    private void checkAttestKeyChallenge(android.security.keystore.KeyGenParameterSpec p0) throws java.security.InvalidAlgorithmParameterException {}
    private void checkAttestKeyPurpose(android.system.keystore2.Authorization[] p0) throws java.security.InvalidAlgorithmParameterException {}
    private void checkAttestKeySecurityLevel(android.security.keystore.KeyGenParameterSpec p0, android.system.keystore2.KeyEntryResponse p1) throws java.security.InvalidAlgorithmParameterException {}
    private int getKeymasterAlgorithmFromLegacy(int p0, android.security.KeyPairGeneratorSpec p1) throws java.security.InvalidAlgorithmParameterException { return 0; }
    private android.security.keystore.KeyGenParameterSpec buildKeyGenParameterSpecFromLegacy(android.security.KeyPairGeneratorSpec p0, int p1) { return null; }
    private void resetAll() {}
    private void initAlgorithmSpecificParameters() throws java.security.InvalidAlgorithmParameterException {}
    public java.security.KeyPair generateKeyPair() { return null; }
    private java.security.KeyPair generateKeyPairHelper() throws android.security.GenerateRkpKeyException { return null; }
    private void addAttestationParameters(java.util.List<android.hardware.security.keymint.KeyParameter> p0) throws java.security.ProviderException, java.lang.IllegalArgumentException, android.security.keystore.DeviceIdAttestationException {}
    private java.util.Collection<android.hardware.security.keymint.KeyParameter> constructKeyGenerationArguments() throws android.security.keystore.DeviceIdAttestationException, java.lang.IllegalArgumentException, java.security.InvalidAlgorithmParameterException { return null; }
    private void addAlgorithmSpecificParameters(java.util.List<android.hardware.security.keymint.KeyParameter> p0) {}
    private static int getDefaultKeySize(int p0) { return 0; }
    private static void checkValidKeySize(int p0, int p1, boolean p2) throws java.security.InvalidAlgorithmParameterException {}
    private static java.lang.String getCertificateSignatureAlgorithm(int p0, int p1, android.security.keystore.KeyGenParameterSpec p2) { return null; }
    private static java.util.Set<java.lang.Integer> getAvailableKeymasterSignatureDigests(java.lang.String[] p0, java.lang.String[] p1) { return null; }

    public static class EC extends android.security.keystore2.AndroidKeyStoreKeyPairGeneratorSpi {
        public EC() { super(0); }
    }

    public static class RSA extends android.security.keystore2.AndroidKeyStoreKeyPairGeneratorSpi {
        public RSA() { super(0); }
    }
}
