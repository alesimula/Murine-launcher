package android.security.keystore;

abstract class AndroidKeyStoreRSASignatureSpi extends android.security.keystore.AndroidKeyStoreSignatureSpiBase {
    private final int mKeymasterDigest = 0;
    private final int mKeymasterPadding = 0;
    AndroidKeyStoreRSASignatureSpi(int p0, int p1) { super(); }
    protected final void initKey(android.security.keystore.AndroidKeyStoreKey p0) throws java.security.InvalidKeyException {}
    protected final void resetAll() {}
    protected final void resetWhilePreservingInitState() {}
    protected final void addAlgorithmSpecificParametersToBegin(android.security.keymaster.KeymasterArguments p0) {}

    public static final class SHA512WithPSSPadding extends android.security.keystore.AndroidKeyStoreRSASignatureSpi.PSSPadding {
        public SHA512WithPSSPadding() { super(0); }
    }

    public static final class SHA512WithPKCS1Padding extends android.security.keystore.AndroidKeyStoreRSASignatureSpi.PKCS1Padding {
        public SHA512WithPKCS1Padding() { super(0); }
    }

    public static final class SHA384WithPSSPadding extends android.security.keystore.AndroidKeyStoreRSASignatureSpi.PSSPadding {
        public SHA384WithPSSPadding() { super(0); }
    }

    public static final class SHA384WithPKCS1Padding extends android.security.keystore.AndroidKeyStoreRSASignatureSpi.PKCS1Padding {
        public SHA384WithPKCS1Padding() { super(0); }
    }

    public static final class SHA256WithPSSPadding extends android.security.keystore.AndroidKeyStoreRSASignatureSpi.PSSPadding {
        public SHA256WithPSSPadding() { super(0); }
    }

    public static final class SHA256WithPKCS1Padding extends android.security.keystore.AndroidKeyStoreRSASignatureSpi.PKCS1Padding {
        public SHA256WithPKCS1Padding() { super(0); }
    }

    public static final class SHA224WithPSSPadding extends android.security.keystore.AndroidKeyStoreRSASignatureSpi.PSSPadding {
        public SHA224WithPSSPadding() { super(0); }
    }

    public static final class SHA224WithPKCS1Padding extends android.security.keystore.AndroidKeyStoreRSASignatureSpi.PKCS1Padding {
        public SHA224WithPKCS1Padding() { super(0); }
    }

    public static final class SHA1WithPSSPadding extends android.security.keystore.AndroidKeyStoreRSASignatureSpi.PSSPadding {
        public SHA1WithPSSPadding() { super(0); }
    }

    public static final class SHA1WithPKCS1Padding extends android.security.keystore.AndroidKeyStoreRSASignatureSpi.PKCS1Padding {
        public SHA1WithPKCS1Padding() { super(0); }
    }

    static abstract class PSSPadding extends android.security.keystore.AndroidKeyStoreRSASignatureSpi {
        private static final int SALT_LENGTH_BYTES = 20;
        PSSPadding(int p0) { super(0, 0); }
        protected final int getAdditionalEntropyAmountForSign() { return 0; }
    }

    static abstract class PKCS1Padding extends android.security.keystore.AndroidKeyStoreRSASignatureSpi {
        PKCS1Padding(int p0) { super(0, 0); }
        protected final int getAdditionalEntropyAmountForSign() { return 0; }
    }

    public static final class NONEWithPKCS1Padding extends android.security.keystore.AndroidKeyStoreRSASignatureSpi.PKCS1Padding {
        public NONEWithPKCS1Padding() { super(0); }
    }

    public static final class MD5WithPKCS1Padding extends android.security.keystore.AndroidKeyStoreRSASignatureSpi.PKCS1Padding {
        public MD5WithPKCS1Padding() { super(0); }
    }
}
