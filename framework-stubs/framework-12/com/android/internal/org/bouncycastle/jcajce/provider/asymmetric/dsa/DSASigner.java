package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.dsa;

public class DSASigner extends java.security.SignatureSpi implements com.android.internal.org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers, com.android.internal.org.bouncycastle.asn1.x509.X509ObjectIdentifiers {
    private com.android.internal.org.bouncycastle.crypto.Digest digest;
    private com.android.internal.org.bouncycastle.crypto.DSAExt signer;
    private com.android.internal.org.bouncycastle.crypto.signers.DSAEncoding encoding;
    private java.security.SecureRandom random;
    protected DSASigner(com.android.internal.org.bouncycastle.crypto.Digest p0, com.android.internal.org.bouncycastle.crypto.DSAExt p1) { super(); }
    protected void engineInitVerify(java.security.PublicKey p0) throws java.security.InvalidKeyException {}
    protected void engineInitSign(java.security.PrivateKey p0, java.security.SecureRandom p1) throws java.security.InvalidKeyException {}
    protected void engineInitSign(java.security.PrivateKey p0) throws java.security.InvalidKeyException {}
    protected void engineUpdate(byte p0) throws java.security.SignatureException {}
    protected void engineUpdate(byte[] p0, int p1, int p2) throws java.security.SignatureException {}
    protected byte[] engineSign() throws java.security.SignatureException { return null; }
    protected boolean engineVerify(byte[] p0) throws java.security.SignatureException { return false; }
    protected java.security.AlgorithmParameters engineGetParameters() { return null; }
    protected void engineSetParameter(java.security.spec.AlgorithmParameterSpec p0) {}
    protected void checkKey(com.android.internal.org.bouncycastle.crypto.params.DSAParameters p0) throws java.security.InvalidKeyException {}
    protected void engineSetParameter(java.lang.String p0, java.lang.Object p1) {}
    protected java.lang.Object engineGetParameter(java.lang.String p0) { return null; }

    public static class dsa224 extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public dsa224() { super(null, null); }
    }

    public static class dsa256 extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public dsa256() { super(null, null); }
    }

    public static class noneDSA extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public noneDSA() { super(null, null); }
    }

    public static class stdDSA extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public stdDSA() { super(null, null); }
    }
}
