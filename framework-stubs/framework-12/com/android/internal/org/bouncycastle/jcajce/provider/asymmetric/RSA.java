package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric;

public class RSA {
    private static final java.lang.String PREFIX = "com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.rsa.";
    private static final java.util.Map<java.lang.String, java.lang.String> generalRsaAttributes = null;
    public RSA() {}

    public static class Mappings extends com.android.internal.org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider {
        public Mappings() { super(); }
        public void configure(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0) {}
        private void addDigestSignature(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0, java.lang.String p1, java.lang.String p2, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p3) {}
        private void addISO9796Signature(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0, java.lang.String p1, java.lang.String p2) {}
        private void addPSSSignature(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0, java.lang.String p1, java.lang.String p2) {}
        private void addX931Signature(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0, java.lang.String p1, java.lang.String p2) {}
    }
}
