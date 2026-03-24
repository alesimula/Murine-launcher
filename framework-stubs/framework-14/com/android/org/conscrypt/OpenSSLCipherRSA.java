package com.android.org.conscrypt;

public abstract class OpenSSLCipherRSA extends javax.crypto.CipherSpi {
    com.android.org.conscrypt.OpenSSLKey key;
    boolean usingPrivateKey;
    boolean encrypting;
    int padding;
    OpenSSLCipherRSA(int p0) { super(); }
    protected void engineSetMode(java.lang.String p0) throws java.security.NoSuchAlgorithmException {}
    protected void engineSetPadding(java.lang.String p0) throws javax.crypto.NoSuchPaddingException {}
    protected int engineGetBlockSize() { return 0; }
    protected int engineGetOutputSize(int p0) { return 0; }
    int paddedBlockSizeBytes() { return 0; }
    int keySizeBytes() { return 0; }
    boolean isInitialized() { return false; }
    protected byte[] engineGetIV() { return null; }
    protected java.security.AlgorithmParameters engineGetParameters() { return null; }
    void doCryptoInit(java.security.spec.AlgorithmParameterSpec p0) throws java.security.InvalidAlgorithmParameterException, java.security.InvalidKeyException {}
    void engineInitInternal(int p0, java.security.Key p1, java.security.spec.AlgorithmParameterSpec p2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected int engineGetKeySize(java.security.Key p0) throws java.security.InvalidKeyException { return 0; }
    protected void engineInit(int p0, java.security.Key p1, java.security.SecureRandom p2) throws java.security.InvalidKeyException {}
    protected void engineInit(int p0, java.security.Key p1, java.security.spec.AlgorithmParameterSpec p2, java.security.SecureRandom p3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected void engineInit(int p0, java.security.Key p1, java.security.AlgorithmParameters p2, java.security.SecureRandom p3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected byte[] engineUpdate(byte[] p0, int p1, int p2) { return null; }
    protected int engineUpdate(byte[] p0, int p1, int p2, byte[] p3, int p4) throws javax.crypto.ShortBufferException { return 0; }
    protected byte[] engineDoFinal(byte[] p0, int p1, int p2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { return null; }
    abstract int doCryptoOperation(byte[] p0, byte[] p1) throws javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException;
    protected int engineDoFinal(byte[] p0, int p1, int p2, byte[] p3, int p4) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { return 0; }
    protected byte[] engineWrap(java.security.Key p0) throws javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException { return null; }
    protected java.security.Key engineUnwrap(byte[] p0, java.lang.String p1, int p2) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException { return null; }

    public static abstract class DirectRSA extends com.android.org.conscrypt.OpenSSLCipherRSA {
        protected DirectRSA(int p0) { super(0); }
        int doCryptoOperation(byte[] p0, byte[] p1) throws javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException { return 0; }
    }

    public static class OAEP extends com.android.org.conscrypt.OpenSSLCipherRSA {
        public OAEP(long p0, int p1) { super(0); }
        protected java.security.AlgorithmParameters engineGetParameters() { return null; }
        protected void engineSetPadding(java.lang.String p0) throws javax.crypto.NoSuchPaddingException {}
        protected void engineInit(int p0, java.security.Key p1, java.security.spec.AlgorithmParameterSpec p2, java.security.SecureRandom p3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
        protected void engineInit(int p0, java.security.Key p1, java.security.AlgorithmParameters p2, java.security.SecureRandom p3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
        void engineInitInternal(int p0, java.security.Key p1, java.security.spec.AlgorithmParameterSpec p2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
        void doCryptoInit(java.security.spec.AlgorithmParameterSpec p0) throws java.security.InvalidAlgorithmParameterException, java.security.InvalidKeyException {}
        int paddedBlockSizeBytes() { return 0; }
        int doCryptoOperation(byte[] p0, byte[] p1) throws javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException { return 0; }

        public static final class SHA1 extends com.android.org.conscrypt.OpenSSLCipherRSA.OAEP {
            public SHA1() { super(0L, 0); }
        }

        public static final class SHA224 extends com.android.org.conscrypt.OpenSSLCipherRSA.OAEP {
            public SHA224() { super(0L, 0); }
        }

        public static final class SHA256 extends com.android.org.conscrypt.OpenSSLCipherRSA.OAEP {
            public SHA256() { super(0L, 0); }
        }

        public static final class SHA384 extends com.android.org.conscrypt.OpenSSLCipherRSA.OAEP {
            public SHA384() { super(0L, 0); }
        }

        public static final class SHA512 extends com.android.org.conscrypt.OpenSSLCipherRSA.OAEP {
            public SHA512() { super(0L, 0); }
        }
    }

    public static final class PKCS1 extends com.android.org.conscrypt.OpenSSLCipherRSA.DirectRSA {
        public PKCS1() { super(0); }
    }

    public static final class Raw extends com.android.org.conscrypt.OpenSSLCipherRSA.DirectRSA {
        public Raw() { super(0); }
    }
}
