package com.android.org.conscrypt;

public abstract class OpenSSLEvpCipherDESEDE extends com.android.org.conscrypt.OpenSSLEvpCipher {
    OpenSSLEvpCipherDESEDE(com.android.org.conscrypt.OpenSSLCipher.Mode p0, com.android.org.conscrypt.OpenSSLCipher.Padding p1) { super(null, null); }
    java.lang.String getBaseCipherName() { return null; }
    java.lang.String getCipherName(int p0, com.android.org.conscrypt.OpenSSLCipher.Mode p1) { return null; }
    void checkSupportedKeySize(int p0) throws java.security.InvalidKeyException {}
    void checkSupportedMode(com.android.org.conscrypt.OpenSSLCipher.Mode p0) throws java.security.NoSuchAlgorithmException {}
    void checkSupportedPadding(com.android.org.conscrypt.OpenSSLCipher.Padding p0) throws javax.crypto.NoSuchPaddingException {}
    int getCipherBlockSize() { return 0; }

    public static class CBC extends com.android.org.conscrypt.OpenSSLEvpCipherDESEDE {
        CBC(com.android.org.conscrypt.OpenSSLCipher.Padding p0) { super(null, null); }

        public static class NoPadding extends com.android.org.conscrypt.OpenSSLEvpCipherDESEDE.CBC {
            public NoPadding() { super(null); }
        }

        public static class PKCS5Padding extends com.android.org.conscrypt.OpenSSLEvpCipherDESEDE.CBC {
            public PKCS5Padding() { super(null); }
        }
    }
}
