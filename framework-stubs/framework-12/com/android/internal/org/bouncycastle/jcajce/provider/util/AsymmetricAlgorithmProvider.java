package com.android.internal.org.bouncycastle.jcajce.provider.util;

public abstract class AsymmetricAlgorithmProvider extends com.android.internal.org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
    public AsymmetricAlgorithmProvider() { super(); }
    protected void addSignatureAlgorithm(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0, java.lang.String p1, java.lang.String p2, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p3) {}
    protected void addSignatureAlgorithm(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p4) {}
    protected void registerOid(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, java.lang.String p2, com.android.internal.org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter p3) {}
    protected void registerOidAlgorithmParameters(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, java.lang.String p2) {}
    protected void registerOidAlgorithmParameterGenerator(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, java.lang.String p2) {}
}
