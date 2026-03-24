package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec;

public class KeyFactorySpi extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi implements com.android.internal.org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter {
    java.lang.String algorithm;
    com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration configuration;
    KeyFactorySpi(java.lang.String p0, com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration p1) { super(); }
    protected java.security.Key engineTranslateKey(java.security.Key p0) throws java.security.InvalidKeyException { return null; }
    protected java.security.spec.KeySpec engineGetKeySpec(java.security.Key p0, java.lang.Class p1) throws java.security.spec.InvalidKeySpecException { return null; }
    protected java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec p0) throws java.security.spec.InvalidKeySpecException { return null; }
    protected java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec p0) throws java.security.spec.InvalidKeySpecException { return null; }
    public java.security.PrivateKey generatePrivate(com.android.internal.org.bouncycastle.asn1.pkcs.PrivateKeyInfo p0) throws java.io.IOException { return null; }
    public java.security.PublicKey generatePublic(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) throws java.io.IOException { return null; }

    public static class EC extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi {
        public EC() { super(null, null); }
    }

    public static class ECDH extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi {
        public ECDH() { super(null, null); }
    }

    public static class ECDHC extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi {
        public ECDHC() { super(null, null); }
    }

    public static class ECDSA extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi {
        public ECDSA() { super(null, null); }
    }

    public static class ECMQV extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi {
        public ECMQV() { super(null, null); }
    }
}
