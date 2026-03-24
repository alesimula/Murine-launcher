package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.rsa;

public class BCRSAPrivateKey implements java.security.interfaces.RSAPrivateKey, com.android.internal.org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    static final long serialVersionUID = 5110188922551353628L;
    protected java.math.BigInteger modulus;
    protected java.math.BigInteger privateExponent;
    protected transient com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier;
    protected transient com.android.internal.org.bouncycastle.crypto.params.RSAKeyParameters rsaPrivateKey;
    protected transient com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl attrCarrier;
    BCRSAPrivateKey(com.android.internal.org.bouncycastle.crypto.params.RSAKeyParameters p0) {}
    BCRSAPrivateKey(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.crypto.params.RSAKeyParameters p1) {}
    BCRSAPrivateKey(java.security.spec.RSAPrivateKeySpec p0) {}
    BCRSAPrivateKey(java.security.interfaces.RSAPrivateKey p0) {}
    BCRSAPrivateKey(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.asn1.pkcs.RSAPrivateKey p1) {}
    public java.math.BigInteger getModulus() { return null; }
    public java.math.BigInteger getPrivateExponent() { return null; }
    public java.lang.String getAlgorithm() { return null; }
    public java.lang.String getFormat() { return null; }
    com.android.internal.org.bouncycastle.crypto.params.RSAKeyParameters engineGetKeyParameters() { return null; }
    public byte[] getEncoded() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void setBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p1) {}
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public java.util.Enumeration getBagAttributeKeys() { return null; }
    public java.lang.String toString() { return null; }
}
