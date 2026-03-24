package com.android.internal.org.bouncycastle.jcajce.provider.config;

public interface ConfigurableProvider {
    public static final java.lang.String THREAD_LOCAL_EC_IMPLICITLY_CA = "threadLocalEcImplicitlyCa";
    public static final java.lang.String EC_IMPLICITLY_CA = "ecImplicitlyCa";
    public static final java.lang.String THREAD_LOCAL_DH_DEFAULT_PARAMS = "threadLocalDhDefaultParams";
    public static final java.lang.String DH_DEFAULT_PARAMS = "DhDefaultParams";
    public static final java.lang.String ACCEPTABLE_EC_CURVES = "acceptableEcCurves";
    public static final java.lang.String ADDITIONAL_EC_PARAMETERS = "additionalEcParameters";
    public void setParameter(java.lang.String p0, java.lang.Object p1);
    public void addAlgorithm(java.lang.String p0, java.lang.String p1);
    public void addAlgorithm(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, java.lang.String p2);
    public boolean hasAlgorithm(java.lang.String p0, java.lang.String p1);
    public void addKeyInfoConverter(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter p1);
    public com.android.internal.org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter getKeyInfoConverter(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0);
    public void addAttributes(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1);
}
