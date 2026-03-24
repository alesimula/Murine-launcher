package com.android.org.conscrypt;

public class OpenSSLSignature extends java.security.SignatureSpi {
    protected void configureEVP_PKEY_CTX(long p0) throws java.security.InvalidAlgorithmParameterException {}
    protected void engineUpdate(byte p0) {}
    protected void engineUpdate(byte[] p0, int p1, int p2) {}
    protected void engineUpdate(java.nio.ByteBuffer p0) {}
    @java.lang.Deprecated
    protected java.lang.Object engineGetParameter(java.lang.String p0) throws java.security.InvalidParameterException { return null; }
    protected void engineInitSign(java.security.PrivateKey p0) throws java.security.InvalidKeyException {}
    protected void engineInitVerify(java.security.PublicKey p0) throws java.security.InvalidKeyException {}
    @java.lang.Deprecated
    protected void engineSetParameter(java.lang.String p0, java.lang.Object p1) throws java.security.InvalidParameterException {}
    protected byte[] engineSign() throws java.security.SignatureException { return null; }
    protected boolean engineVerify(byte[] p0) throws java.security.SignatureException { return false; }
    protected final long getEVP_PKEY_CTX() { return 0L; }

    private static enum EngineType {
        RSA,
        EC;
    }

    public static final class MD5RSA extends com.android.org.conscrypt.OpenSSLSignature.RSAPKCS1Padding {
        public MD5RSA() { super(0L); }
    }

    static abstract class RSAPKCS1Padding extends com.android.org.conscrypt.OpenSSLSignature {
        RSAPKCS1Padding(long p0) { super(); }
        protected final void configureEVP_PKEY_CTX(long p0) throws java.security.InvalidAlgorithmParameterException {}
    }

    static abstract class RSAPSSPadding extends com.android.org.conscrypt.OpenSSLSignature {
        RSAPSSPadding(long p0, java.lang.String p1, int p2) { super(); }
        protected final void configureEVP_PKEY_CTX(long p0) throws java.security.InvalidAlgorithmParameterException {}
        protected final void engineSetParameter(java.security.spec.AlgorithmParameterSpec p0) throws java.security.InvalidAlgorithmParameterException {}
        protected final java.security.AlgorithmParameters engineGetParameters() { return null; }
    }

    public static final class SHA1ECDSA extends com.android.org.conscrypt.OpenSSLSignature {
        public SHA1ECDSA() { super(); }
    }

    public static final class SHA1RSA extends com.android.org.conscrypt.OpenSSLSignature.RSAPKCS1Padding {
        public SHA1RSA() { super(0L); }
    }

    public static final class SHA1RSAPSS extends com.android.org.conscrypt.OpenSSLSignature.RSAPSSPadding {
        public SHA1RSAPSS() { super(0L, null, 0); }
    }

    public static final class SHA224ECDSA extends com.android.org.conscrypt.OpenSSLSignature {
        public SHA224ECDSA() { super(); }
    }

    public static final class SHA224RSA extends com.android.org.conscrypt.OpenSSLSignature.RSAPKCS1Padding {
        public SHA224RSA() { super(0L); }
    }

    public static final class SHA224RSAPSS extends com.android.org.conscrypt.OpenSSLSignature.RSAPSSPadding {
        public SHA224RSAPSS() { super(0L, null, 0); }
    }

    public static final class SHA256ECDSA extends com.android.org.conscrypt.OpenSSLSignature {
        public SHA256ECDSA() { super(); }
    }

    public static final class SHA256RSA extends com.android.org.conscrypt.OpenSSLSignature.RSAPKCS1Padding {
        public SHA256RSA() { super(0L); }
    }

    public static final class SHA256RSAPSS extends com.android.org.conscrypt.OpenSSLSignature.RSAPSSPadding {
        public SHA256RSAPSS() { super(0L, null, 0); }
    }

    public static final class SHA384ECDSA extends com.android.org.conscrypt.OpenSSLSignature {
        public SHA384ECDSA() { super(); }
    }

    public static final class SHA384RSA extends com.android.org.conscrypt.OpenSSLSignature.RSAPKCS1Padding {
        public SHA384RSA() { super(0L); }
    }

    public static final class SHA384RSAPSS extends com.android.org.conscrypt.OpenSSLSignature.RSAPSSPadding {
        public SHA384RSAPSS() { super(0L, null, 0); }
    }

    public static final class SHA512ECDSA extends com.android.org.conscrypt.OpenSSLSignature {
        public SHA512ECDSA() { super(); }
    }

    public static final class SHA512RSA extends com.android.org.conscrypt.OpenSSLSignature.RSAPKCS1Padding {
        public SHA512RSA() { super(0L); }
    }

    public static final class SHA512RSAPSS extends com.android.org.conscrypt.OpenSSLSignature.RSAPSSPadding {
        public SHA512RSAPSS() { super(0L, null, 0); }
    }
}
