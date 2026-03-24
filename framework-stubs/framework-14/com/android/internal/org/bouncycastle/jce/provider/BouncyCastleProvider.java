package com.android.internal.org.bouncycastle.jce.provider;

public final class BouncyCastleProvider extends java.security.Provider implements com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider {
    public static final java.lang.String PROVIDER_NAME = "BC";
    public static final com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration CONFIGURATION = null;
    public BouncyCastleProvider() { super(null, 0.0, null); }
    public void setParameter(java.lang.String p0, java.lang.Object p1) {}
    public boolean hasAlgorithm(java.lang.String p0, java.lang.String p1) { return false; }
    public void addAlgorithm(java.lang.String p0, java.lang.String p1) {}
    public void addAlgorithm(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, java.lang.String p2) {}
    public void addKeyInfoConverter(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter p1) {}
    public com.android.internal.org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter getKeyInfoConverter(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public void addAttributes(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1) {}
    public static java.security.PublicKey getPublicKey(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) throws java.io.IOException { return null; }
    public static java.security.PrivateKey getPrivateKey(com.android.internal.org.bouncycastle.asn1.pkcs.PrivateKeyInfo p0) throws java.io.IOException { return null; }
    public void addPrivateAlgorithm(java.lang.String p0, java.lang.String p1) {}
    public void addPrivateAlgorithm(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, java.lang.String p2) {}
    public java.security.Provider getPrivateProvider() { return null; }

    private static final class PrivateProvider extends java.security.Provider {
        public PrivateProvider() { super(null, 0.0, null); }
    }
}
