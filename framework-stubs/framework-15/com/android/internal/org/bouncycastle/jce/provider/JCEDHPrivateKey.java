package com.android.internal.org.bouncycastle.jce.provider;

public class JCEDHPrivateKey implements javax.crypto.interfaces.DHPrivateKey, com.android.internal.org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    static final long serialVersionUID = 311058815616901812L;
    java.math.BigInteger x;
    protected JCEDHPrivateKey() {}
    JCEDHPrivateKey(javax.crypto.interfaces.DHPrivateKey p0) {}
    JCEDHPrivateKey(javax.crypto.spec.DHPrivateKeySpec p0) {}
    JCEDHPrivateKey(com.android.internal.org.bouncycastle.asn1.pkcs.PrivateKeyInfo p0) throws java.io.IOException {}
    JCEDHPrivateKey(com.android.internal.org.bouncycastle.crypto.params.DHPrivateKeyParameters p0) {}
    public java.lang.String getAlgorithm() { return null; }
    public java.lang.String getFormat() { return null; }
    public byte[] getEncoded() { return null; }
    public javax.crypto.spec.DHParameterSpec getParams() { return null; }
    public java.math.BigInteger getX() { return null; }
    public void setBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p1) {}
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public java.util.Enumeration getBagAttributeKeys() { return null; }
}
