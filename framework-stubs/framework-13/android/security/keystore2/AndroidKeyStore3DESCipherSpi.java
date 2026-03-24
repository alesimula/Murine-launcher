package android.security.keystore2;

public abstract class AndroidKeyStore3DESCipherSpi extends android.security.keystore2.AndroidKeyStoreCipherSpiBase {
    AndroidKeyStore3DESCipherSpi(int p0, int p1, boolean p2) { super(); }
    protected void initKey(int p0, java.security.Key p1) throws java.security.InvalidKeyException {}
    protected int engineGetBlockSize() { return 0; }
    protected int engineGetOutputSize(int p0) { return 0; }
    protected final byte[] engineGetIV() { return null; }
    protected java.security.AlgorithmParameters engineGetParameters() { return null; }
    protected void initAlgorithmSpecificParameters() throws java.security.InvalidKeyException {}
    protected void initAlgorithmSpecificParameters(java.security.spec.AlgorithmParameterSpec p0) throws java.security.InvalidAlgorithmParameterException {}
    protected void initAlgorithmSpecificParameters(java.security.AlgorithmParameters p0) throws java.security.InvalidAlgorithmParameterException {}
    protected final int getAdditionalEntropyAmountForBegin() { return 0; }
    protected int getAdditionalEntropyAmountForFinish() { return 0; }
    protected void addAlgorithmSpecificParametersToBegin(java.util.List<android.hardware.security.keymint.KeyParameter> p0) {}
    protected void loadAlgorithmSpecificParametersFromBeginResult(android.hardware.security.keymint.KeyParameter[] p0) {}
    protected final void resetAll() {}

    static abstract class CBC extends android.security.keystore2.AndroidKeyStore3DESCipherSpi {
        protected CBC(int p0) { super(0, 0, false); }

        public static class NoPadding extends android.security.keystore2.AndroidKeyStore3DESCipherSpi.CBC {
            public NoPadding() { super(0); }
            protected final java.lang.String getTransform() { return null; }
        }

        public static class PKCS7Padding extends android.security.keystore2.AndroidKeyStore3DESCipherSpi.CBC {
            public PKCS7Padding() { super(0); }
            protected final java.lang.String getTransform() { return null; }
        }
    }

    static abstract class ECB extends android.security.keystore2.AndroidKeyStore3DESCipherSpi {
        protected ECB(int p0) { super(0, 0, false); }

        public static class NoPadding extends android.security.keystore2.AndroidKeyStore3DESCipherSpi.ECB {
            public NoPadding() { super(0); }
            protected final java.lang.String getTransform() { return null; }
        }

        public static class PKCS7Padding extends android.security.keystore2.AndroidKeyStore3DESCipherSpi.ECB {
            public PKCS7Padding() { super(0); }
            protected final java.lang.String getTransform() { return null; }
        }
    }
}
