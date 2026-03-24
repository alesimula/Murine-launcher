package com.android.org.conscrypt.ct;

public class DigitallySigned {
    public DigitallySigned(com.android.org.conscrypt.ct.DigitallySigned.HashAlgorithm p0, com.android.org.conscrypt.ct.DigitallySigned.SignatureAlgorithm p1, byte[] p2) {}
    public DigitallySigned(int p0, int p1, byte[] p2) {}
    public com.android.org.conscrypt.ct.DigitallySigned.HashAlgorithm getHashAlgorithm() { return null; }
    public com.android.org.conscrypt.ct.DigitallySigned.SignatureAlgorithm getSignatureAlgorithm() { return null; }
    public byte[] getSignature() { return null; }
    public java.lang.String getAlgorithm() { return null; }
    public static com.android.org.conscrypt.ct.DigitallySigned decode(java.io.InputStream p0) throws com.android.org.conscrypt.ct.SerializationException { return null; }
    public static com.android.org.conscrypt.ct.DigitallySigned decode(byte[] p0) throws com.android.org.conscrypt.ct.SerializationException { return null; }

    public static enum HashAlgorithm {
        NONE,
        MD5,
        SHA1,
        SHA224,
        SHA256,
        SHA384,
        SHA512;
        public static com.android.org.conscrypt.ct.DigitallySigned.HashAlgorithm valueOf(int p0) { return null; }
    }

    public static enum SignatureAlgorithm {
        ANONYMOUS,
        RSA,
        DSA,
        ECDSA;
        public static com.android.org.conscrypt.ct.DigitallySigned.SignatureAlgorithm valueOf(int p0) { return null; }
    }
}
