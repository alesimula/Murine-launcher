package com.android.org.conscrypt;

public abstract class OpenSSLAeadCipherAES extends com.android.org.conscrypt.OpenSSLAeadCipher {
    OpenSSLAeadCipherAES(com.android.org.conscrypt.OpenSSLCipher.Mode p0) { super(null); }
    void checkSupportedKeySize(int p0) throws java.security.InvalidKeyException {}
    java.lang.String getBaseCipherName() { return null; }
    int getCipherBlockSize() { return 0; }
    protected java.security.spec.AlgorithmParameterSpec getParameterSpec(java.security.AlgorithmParameters p0) throws java.security.InvalidAlgorithmParameterException { return null; }
    protected java.security.AlgorithmParameters engineGetParameters() { return null; }
    int getOutputSizeForFinal(int p0) { return 0; }

    public static class GCM extends com.android.org.conscrypt.OpenSSLAeadCipherAES {
        public GCM() { super(null); }
        void checkSupportedMode(com.android.org.conscrypt.OpenSSLCipher.Mode p0) throws java.security.NoSuchAlgorithmException {}
        long getEVP_AEAD(int p0) throws java.security.InvalidKeyException { return 0L; }

        public static class AES_128 extends com.android.org.conscrypt.OpenSSLAeadCipherAES.GCM {
            public AES_128() { super(); }
            void checkSupportedKeySize(int p0) throws java.security.InvalidKeyException {}
        }

        public static class AES_256 extends com.android.org.conscrypt.OpenSSLAeadCipherAES.GCM {
            public AES_256() { super(); }
            void checkSupportedKeySize(int p0) throws java.security.InvalidKeyException {}
        }
    }

    public static class GCM_SIV extends com.android.org.conscrypt.OpenSSLAeadCipherAES {
        public GCM_SIV() { super(null); }
        void checkSupportedMode(com.android.org.conscrypt.OpenSSLCipher.Mode p0) throws java.security.NoSuchAlgorithmException {}
        boolean allowsNonceReuse() { return false; }
        void checkSupportedTagLength(int p0) throws java.security.InvalidAlgorithmParameterException {}
        long getEVP_AEAD(int p0) throws java.security.InvalidKeyException { return 0L; }

        public static class AES_128 extends com.android.org.conscrypt.OpenSSLAeadCipherAES.GCM_SIV {
            public AES_128() { super(); }
            void checkSupportedKeySize(int p0) throws java.security.InvalidKeyException {}
        }

        public static class AES_256 extends com.android.org.conscrypt.OpenSSLAeadCipherAES.GCM_SIV {
            public AES_256() { super(); }
            void checkSupportedKeySize(int p0) throws java.security.InvalidKeyException {}
        }
    }
}
