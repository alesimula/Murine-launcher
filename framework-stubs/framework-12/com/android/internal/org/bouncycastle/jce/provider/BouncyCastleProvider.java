package com.android.internal.org.bouncycastle.jce.provider;

public final class BouncyCastleProvider extends java.security.Provider implements com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider {
    private static java.lang.String info;
    public static final java.lang.String PROVIDER_NAME = "BC";
    public static final com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration CONFIGURATION = null;
    private static final java.util.Map keyInfoConverters = null;
    private static final java.lang.Class revChkClass = null;
    private static final java.lang.String SYMMETRIC_PACKAGE = "com.android.internal.org.bouncycastle.jcajce.provider.symmetric.";
    private static final java.lang.String[] SYMMETRIC_GENERIC = null;
    private static final java.lang.String[] SYMMETRIC_MACS = null;
    private static final java.lang.String[] SYMMETRIC_CIPHERS = null;
    private static final java.lang.String ASYMMETRIC_PACKAGE = "com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.";
    private static final java.lang.String[] ASYMMETRIC_GENERIC = null;
    private static final java.lang.String[] ASYMMETRIC_CIPHERS = null;
    private static final java.lang.String DIGEST_PACKAGE = "com.android.internal.org.bouncycastle.jcajce.provider.digest.";
    private static final java.lang.String[] DIGESTS = null;
    private static final java.lang.String KEYSTORE_PACKAGE = "com.android.internal.org.bouncycastle.jcajce.provider.keystore.";
    private static final java.lang.String[] KEYSTORES = null;
    public BouncyCastleProvider() { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null); }
    private void setup() {}
    private void loadAlgorithms(java.lang.String p0, java.lang.String[] p1) {}
    public void setParameter(java.lang.String p0, java.lang.Object p1) {}
    public boolean hasAlgorithm(java.lang.String p0, java.lang.String p1) { return false; }
    public void addAlgorithm(java.lang.String p0, java.lang.String p1) {}
    public void addAlgorithm(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, java.lang.String p2) {}
    public void addKeyInfoConverter(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter p1) {}
    public com.android.internal.org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter getKeyInfoConverter(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public void addAttributes(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1) {}
    private static com.android.internal.org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter getAsymmetricKeyInfoConverter(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public static java.security.PublicKey getPublicKey(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) throws java.io.IOException { return null; }
    public static java.security.PrivateKey getPrivateKey(com.android.internal.org.bouncycastle.asn1.pkcs.PrivateKeyInfo p0) throws java.io.IOException { return null; }
}
