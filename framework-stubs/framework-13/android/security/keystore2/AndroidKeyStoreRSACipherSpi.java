package android.security.keystore2;

abstract class AndroidKeyStoreRSACipherSpi extends android.security.keystore2.AndroidKeyStoreCipherSpiBase {
    AndroidKeyStoreRSACipherSpi(int p0) { super(); }
    protected java.lang.String getTransform() { return null; }
    protected final void initKey(int p0, java.security.Key p1) throws java.security.InvalidKeyException {}
    protected boolean adjustConfigForEncryptingWithPrivateKey() { return false; }
    protected final void resetAll() {}
    protected final void resetWhilePreservingInitState() {}
    protected void addAlgorithmSpecificParametersToBegin(java.util.List<android.hardware.security.keymint.KeyParameter> p0) {}
    protected void loadAlgorithmSpecificParametersFromBeginResult(android.hardware.security.keymint.KeyParameter[] p0) {}
    protected final int engineGetBlockSize() { return 0; }
    protected final byte[] engineGetIV() { return null; }
    protected final int engineGetOutputSize(int p0) { return 0; }
    protected final int getModulusSizeBytes() { return 0; }
    protected final void setKeymasterPaddingOverride(int p0) {}
    protected final int getKeymasterPaddingOverride() { return 0; }

    public static final class NoPadding extends android.security.keystore2.AndroidKeyStoreRSACipherSpi {
        public NoPadding() { super(0); }
        protected boolean adjustConfigForEncryptingWithPrivateKey() { return false; }
        protected void initAlgorithmSpecificParameters() throws java.security.InvalidKeyException {}
        protected void initAlgorithmSpecificParameters(java.security.spec.AlgorithmParameterSpec p0) throws java.security.InvalidAlgorithmParameterException {}
        protected void initAlgorithmSpecificParameters(java.security.AlgorithmParameters p0) throws java.security.InvalidAlgorithmParameterException {}
        protected java.security.AlgorithmParameters engineGetParameters() { return null; }
        protected final int getAdditionalEntropyAmountForBegin() { return 0; }
        protected final int getAdditionalEntropyAmountForFinish() { return 0; }
    }

    static abstract class OAEPWithMGF1Padding extends android.security.keystore2.AndroidKeyStoreRSACipherSpi {
        OAEPWithMGF1Padding(int p0) { super(0); }
        protected final void initAlgorithmSpecificParameters() throws java.security.InvalidKeyException {}
        protected final void initAlgorithmSpecificParameters(java.security.spec.AlgorithmParameterSpec p0) throws java.security.InvalidAlgorithmParameterException {}
        protected final void initAlgorithmSpecificParameters(java.security.AlgorithmParameters p0) throws java.security.InvalidAlgorithmParameterException {}
        protected final java.security.AlgorithmParameters engineGetParameters() { return null; }
        protected final void addAlgorithmSpecificParametersToBegin(java.util.List<android.hardware.security.keymint.KeyParameter> p0) {}
        protected final void loadAlgorithmSpecificParametersFromBeginResult(android.hardware.security.keymint.KeyParameter[] p0) {}
        protected final int getAdditionalEntropyAmountForBegin() { return 0; }
        protected final int getAdditionalEntropyAmountForFinish() { return 0; }
        protected final java.lang.String getTransform() { return null; }
    }

    public static class OAEPWithSHA1AndMGF1Padding extends android.security.keystore2.AndroidKeyStoreRSACipherSpi.OAEPWithMGF1Padding {
        public OAEPWithSHA1AndMGF1Padding() { super(0); }
    }

    public static class OAEPWithSHA224AndMGF1Padding extends android.security.keystore2.AndroidKeyStoreRSACipherSpi.OAEPWithMGF1Padding {
        public OAEPWithSHA224AndMGF1Padding() { super(0); }
    }

    public static class OAEPWithSHA256AndMGF1Padding extends android.security.keystore2.AndroidKeyStoreRSACipherSpi.OAEPWithMGF1Padding {
        public OAEPWithSHA256AndMGF1Padding() { super(0); }
    }

    public static class OAEPWithSHA384AndMGF1Padding extends android.security.keystore2.AndroidKeyStoreRSACipherSpi.OAEPWithMGF1Padding {
        public OAEPWithSHA384AndMGF1Padding() { super(0); }
    }

    public static class OAEPWithSHA512AndMGF1Padding extends android.security.keystore2.AndroidKeyStoreRSACipherSpi.OAEPWithMGF1Padding {
        public OAEPWithSHA512AndMGF1Padding() { super(0); }
    }

    public static final class PKCS1Padding extends android.security.keystore2.AndroidKeyStoreRSACipherSpi {
        public PKCS1Padding() { super(0); }
        protected boolean adjustConfigForEncryptingWithPrivateKey() { return false; }
        protected void initAlgorithmSpecificParameters() throws java.security.InvalidKeyException {}
        protected void initAlgorithmSpecificParameters(java.security.spec.AlgorithmParameterSpec p0) throws java.security.InvalidAlgorithmParameterException {}
        protected void initAlgorithmSpecificParameters(java.security.AlgorithmParameters p0) throws java.security.InvalidAlgorithmParameterException {}
        protected java.security.AlgorithmParameters engineGetParameters() { return null; }
        protected final int getAdditionalEntropyAmountForBegin() { return 0; }
        protected final int getAdditionalEntropyAmountForFinish() { return 0; }
    }
}
