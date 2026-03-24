package com.android.internal.org.bouncycastle.jce.provider;

public class JCEECPrivateKey implements java.security.interfaces.ECPrivateKey, com.android.internal.org.bouncycastle.jce.interfaces.ECPrivateKey, com.android.internal.org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier, com.android.internal.org.bouncycastle.jce.interfaces.ECPointEncoder {
    private java.lang.String algorithm;
    private java.math.BigInteger d;
    private java.security.spec.ECParameterSpec ecSpec;
    private boolean withCompression;
    private com.android.internal.org.bouncycastle.asn1.DERBitString publicKey;
    private com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl attrCarrier;
    protected JCEECPrivateKey() {}
    public JCEECPrivateKey(java.security.interfaces.ECPrivateKey p0) {}
    public JCEECPrivateKey(java.lang.String p0, com.android.internal.org.bouncycastle.jce.spec.ECPrivateKeySpec p1) {}
    public JCEECPrivateKey(java.lang.String p0, java.security.spec.ECPrivateKeySpec p1) {}
    public JCEECPrivateKey(java.lang.String p0, com.android.internal.org.bouncycastle.jce.provider.JCEECPrivateKey p1) {}
    public JCEECPrivateKey(java.lang.String p0, com.android.internal.org.bouncycastle.crypto.params.ECPrivateKeyParameters p1, com.android.internal.org.bouncycastle.jce.provider.JCEECPublicKey p2, java.security.spec.ECParameterSpec p3) {}
    public JCEECPrivateKey(java.lang.String p0, com.android.internal.org.bouncycastle.crypto.params.ECPrivateKeyParameters p1, com.android.internal.org.bouncycastle.jce.provider.JCEECPublicKey p2, com.android.internal.org.bouncycastle.jce.spec.ECParameterSpec p3) {}
    public JCEECPrivateKey(java.lang.String p0, com.android.internal.org.bouncycastle.crypto.params.ECPrivateKeyParameters p1) {}
    JCEECPrivateKey(com.android.internal.org.bouncycastle.asn1.pkcs.PrivateKeyInfo p0) throws java.io.IOException {}
    private void populateFromPrivKeyInfo(com.android.internal.org.bouncycastle.asn1.pkcs.PrivateKeyInfo p0) throws java.io.IOException {}
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
    private com.android.internal.org.bouncycastle.asn1.DERBitString getPublicKeyDetails(com.android.internal.org.bouncycastle.jce.provider.JCEECPublicKey p0) { return null; }
    private void readObject(java.io.ObjectInputStream p0) throws java.io.IOException, java.lang.ClassNotFoundException {}
    private void writeObject(java.io.ObjectOutputStream p0) throws java.io.IOException {}
}
