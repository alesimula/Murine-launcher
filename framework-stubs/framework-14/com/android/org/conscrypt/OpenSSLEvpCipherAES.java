package com.android.org.conscrypt;

public abstract class OpenSSLEvpCipherAES extends com.android.org.conscrypt.OpenSSLEvpCipher {
    OpenSSLEvpCipherAES(com.android.org.conscrypt.OpenSSLCipher.Mode p0, com.android.org.conscrypt.OpenSSLCipher.Padding p1) { super(null, null); }
    void checkSupportedMode(com.android.org.conscrypt.OpenSSLCipher.Mode p0) throws java.security.NoSuchAlgorithmException {}
    void checkSupportedPadding(com.android.org.conscrypt.OpenSSLCipher.Padding p0) throws javax.crypto.NoSuchPaddingException {}
    java.lang.String getBaseCipherName() { return null; }
    java.lang.String getCipherName(int p0, com.android.org.conscrypt.OpenSSLCipher.Mode p1) { return null; }
    int getCipherBlockSize() { return 0; }

    public static class AES extends com.android.org.conscrypt.OpenSSLEvpCipherAES {
        AES(com.android.org.conscrypt.OpenSSLCipher.Mode p0, com.android.org.conscrypt.OpenSSLCipher.Padding p1) { super(null, null); }
        void checkSupportedKeySize(int p0) throws java.security.InvalidKeyException {}

        public static class CBC extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES {
            CBC(com.android.org.conscrypt.OpenSSLCipher.Padding p0) { super(null, null); }

            public static class NoPadding extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES.CBC {
                public NoPadding() { super(null); }
            }

            public static class PKCS5Padding extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES.CBC {
                public PKCS5Padding() { super(null); }
            }
        }

        public static class CTR extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES {
            public CTR() { super(null, null); }
        }

        public static class ECB extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES {
            ECB(com.android.org.conscrypt.OpenSSLCipher.Padding p0) { super(null, null); }

            public static class NoPadding extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES.ECB {
                public NoPadding() { super(null); }
            }

            public static class PKCS5Padding extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES.ECB {
                public PKCS5Padding() { super(null); }
            }
        }
    }

    public static class AES_128 extends com.android.org.conscrypt.OpenSSLEvpCipherAES {
        AES_128(com.android.org.conscrypt.OpenSSLCipher.Mode p0, com.android.org.conscrypt.OpenSSLCipher.Padding p1) { super(null, null); }
        void checkSupportedKeySize(int p0) throws java.security.InvalidKeyException {}

        public static class CBC extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES_128 {
            CBC(com.android.org.conscrypt.OpenSSLCipher.Padding p0) { super(null, null); }

            public static class NoPadding extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES_128.CBC {
                public NoPadding() { super(null); }
            }

            public static class PKCS5Padding extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES_128.CBC {
                public PKCS5Padding() { super(null); }
            }
        }

        public static class CTR extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES_128 {
            public CTR() { super(null, null); }
        }

        public static class ECB extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES_128 {
            ECB(com.android.org.conscrypt.OpenSSLCipher.Padding p0) { super(null, null); }

            public static class NoPadding extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES_128.ECB {
                public NoPadding() { super(null); }
            }

            public static class PKCS5Padding extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES_128.ECB {
                public PKCS5Padding() { super(null); }
            }
        }
    }

    public static class AES_256 extends com.android.org.conscrypt.OpenSSLEvpCipherAES {
        AES_256(com.android.org.conscrypt.OpenSSLCipher.Mode p0, com.android.org.conscrypt.OpenSSLCipher.Padding p1) { super(null, null); }
        void checkSupportedKeySize(int p0) throws java.security.InvalidKeyException {}

        public static class CBC extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES_256 {
            CBC(com.android.org.conscrypt.OpenSSLCipher.Padding p0) { super(null, null); }

            public static class NoPadding extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES_256.CBC {
                public NoPadding() { super(null); }
            }

            public static class PKCS5Padding extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES_256.CBC {
                public PKCS5Padding() { super(null); }
            }
        }

        public static class CTR extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES_256 {
            public CTR() { super(null, null); }
        }

        public static class ECB extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES_256 {
            ECB(com.android.org.conscrypt.OpenSSLCipher.Padding p0) { super(null, null); }

            public static class NoPadding extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES_256.ECB {
                public NoPadding() { super(null); }
            }

            public static class PKCS5Padding extends com.android.org.conscrypt.OpenSSLEvpCipherAES.AES_256.ECB {
                public PKCS5Padding() { super(null); }
            }
        }
    }
}
