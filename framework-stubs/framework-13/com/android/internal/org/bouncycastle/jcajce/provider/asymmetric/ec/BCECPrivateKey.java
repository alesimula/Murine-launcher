package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec;

public class BCECPrivateKey implements java.security.interfaces.ECPrivateKey, com.android.internal.org.bouncycastle.jce.interfaces.ECPrivateKey, com.android.internal.org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier, com.android.internal.org.bouncycastle.jce.interfaces.ECPointEncoder {
    static final long serialVersionUID = 994553197664784084L;
    protected BCECPrivateKey() {}
    public BCECPrivateKey(java.security.interfaces.ECPrivateKey p0, com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration p1) {}
    public BCECPrivateKey(java.lang.String p0, com.android.internal.org.bouncycastle.jce.spec.ECPrivateKeySpec p1, com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration p2) {}
    public BCECPrivateKey(java.lang.String p0, java.security.spec.ECPrivateKeySpec p1, com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration p2) {}
    public BCECPrivateKey(java.lang.String p0, com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey p1) {}
    public BCECPrivateKey(java.lang.String p0, com.android.internal.org.bouncycastle.crypto.params.ECPrivateKeyParameters p1, com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey p2, java.security.spec.ECParameterSpec p3, com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration p4) {}
    public BCECPrivateKey(java.lang.String p0, com.android.internal.org.bouncycastle.crypto.params.ECPrivateKeyParameters p1, com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey p2, com.android.internal.org.bouncycastle.jce.spec.ECParameterSpec p3, com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration p4) {}
    public BCECPrivateKey(java.lang.String p0, com.android.internal.org.bouncycastle.crypto.params.ECPrivateKeyParameters p1, com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration p2) {}
    BCECPrivateKey(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.pkcs.PrivateKeyInfo p1, com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration p2) throws java.io.IOException {}
    public java.lang.String getAlgorithm() { return null; }
    public java.lang.String getFormat() { return null; }
    public byte[] getEncoded() { return null; }
    public java.security.spec.ECParameterSpec getParams() { return null; }
    public com.android.internal.org.bouncycastle.jce.spec.ECParameterSpec getParameters() { return null; }
    com.android.internal.org.bouncycastle.jce.spec.ECParameterSpec engineGetSpec() { return null; }
    public java.math.BigInteger getS() { return null; }
    public java.math.BigInteger getD() { return null; }
    public void setBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p1) {}
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public java.util.Enumeration getBagAttributeKeys() { return null; }
    public void setPointFormat(java.lang.String p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}
