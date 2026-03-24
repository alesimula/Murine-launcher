package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec;

public class SignatureSpi extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util.DSABase {
    SignatureSpi(com.android.internal.org.bouncycastle.crypto.Digest p0, com.android.internal.org.bouncycastle.crypto.DSAExt p1, com.android.internal.org.bouncycastle.crypto.signers.DSAEncoding p2) { super(null, null, null); }
    protected void engineInitVerify(java.security.PublicKey p0) throws java.security.InvalidKeyException {}
    protected void engineInitSign(java.security.PrivateKey p0) throws java.security.InvalidKeyException {}
    protected java.security.AlgorithmParameters engineGetParameters() { return null; }

    public static class ecDSA extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSA() { super(null, null, null); }
    }

    public static class ecDSA224 extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSA224() { super(null, null, null); }
    }

    public static class ecDSA256 extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSA256() { super(null, null, null); }
    }

    public static class ecDSA384 extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSA384() { super(null, null, null); }
    }

    public static class ecDSA512 extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSA512() { super(null, null, null); }
    }

    public static class ecDSAnone extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSAnone() { super(null, null, null); }
    }
}
