package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.rsa;

public class DigestSignatureSpi extends java.security.SignatureSpi {
    private com.android.internal.org.bouncycastle.crypto.Digest digest;
    private com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher cipher;
    private com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier algId;
    protected DigestSignatureSpi(com.android.internal.org.bouncycastle.crypto.Digest p0, com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher p1) { super(); }
    protected DigestSignatureSpi(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.crypto.Digest p1, com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher p2) { super(); }
    protected void engineInitVerify(java.security.PublicKey p0) throws java.security.InvalidKeyException {}
    protected void engineInitSign(java.security.PrivateKey p0) throws java.security.InvalidKeyException {}
    private java.lang.String getType(java.lang.Object p0) { return null; }
    protected void engineUpdate(byte p0) throws java.security.SignatureException {}
    protected void engineUpdate(byte[] p0, int p1, int p2) throws java.security.SignatureException {}
    protected byte[] engineSign() throws java.security.SignatureException { return null; }
    protected boolean engineVerify(byte[] p0) throws java.security.SignatureException { return false; }
    protected void engineSetParameter(java.security.spec.AlgorithmParameterSpec p0) {}
    protected void engineSetParameter(java.lang.String p0, java.lang.Object p1) {}
    protected java.lang.Object engineGetParameter(java.lang.String p0) { return null; }
    protected java.security.AlgorithmParameters engineGetParameters() { return null; }
    private byte[] derEncode(byte[] p0) throws java.io.IOException { return null; }

    public static class MD5 extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public MD5() { super((com.android.internal.org.bouncycastle.crypto.Digest)null, (com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher)null); }
    }

    public static class SHA1 extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public SHA1() { super((com.android.internal.org.bouncycastle.crypto.Digest)null, (com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher)null); }
    }

    public static class SHA224 extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public SHA224() { super((com.android.internal.org.bouncycastle.crypto.Digest)null, (com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher)null); }
    }

    public static class SHA256 extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public SHA256() { super((com.android.internal.org.bouncycastle.crypto.Digest)null, (com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher)null); }
    }

    public static class SHA384 extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public SHA384() { super((com.android.internal.org.bouncycastle.crypto.Digest)null, (com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher)null); }
    }

    public static class SHA512 extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public SHA512() { super((com.android.internal.org.bouncycastle.crypto.Digest)null, (com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher)null); }
    }
}
