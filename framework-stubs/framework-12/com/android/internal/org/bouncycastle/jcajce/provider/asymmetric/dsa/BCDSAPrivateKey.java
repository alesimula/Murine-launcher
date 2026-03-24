package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.dsa;

public class BCDSAPrivateKey implements java.security.interfaces.DSAPrivateKey, com.android.internal.org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    private static final long serialVersionUID = -4677259546958385734L;
    private java.math.BigInteger x;
    private transient java.security.interfaces.DSAParams dsaSpec;
    private transient com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl attrCarrier;
    protected BCDSAPrivateKey() {}
    BCDSAPrivateKey(java.security.interfaces.DSAPrivateKey p0) {}
    BCDSAPrivateKey(java.security.spec.DSAPrivateKeySpec p0) {}
    public BCDSAPrivateKey(com.android.internal.org.bouncycastle.asn1.pkcs.PrivateKeyInfo p0) throws java.io.IOException {}
    BCDSAPrivateKey(com.android.internal.org.bouncycastle.crypto.params.DSAPrivateKeyParameters p0) {}
    public java.lang.String getAlgorithm() { return null; }
    public java.lang.String getFormat() { return null; }
    public byte[] getEncoded() { return null; }
    public java.security.interfaces.DSAParams getParams() { return null; }
    public java.math.BigInteger getX() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void setBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p1) {}
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public java.util.Enumeration getBagAttributeKeys() { return null; }
    private void readObject(java.io.ObjectInputStream p0) throws java.io.IOException, java.lang.ClassNotFoundException {}
    private void writeObject(java.io.ObjectOutputStream p0) throws java.io.IOException {}
    public java.lang.String toString() { return null; }
}
