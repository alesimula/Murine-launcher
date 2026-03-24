package com.android.internal.org.bouncycastle.jce.provider;

public class JDKDSAPublicKey implements java.security.interfaces.DSAPublicKey {
    private static final long serialVersionUID = 1752452449903495175L;
    private java.math.BigInteger y;
    private java.security.interfaces.DSAParams dsaSpec;
    JDKDSAPublicKey(java.security.spec.DSAPublicKeySpec p0) {}
    JDKDSAPublicKey(java.security.interfaces.DSAPublicKey p0) {}
    JDKDSAPublicKey(com.android.internal.org.bouncycastle.crypto.params.DSAPublicKeyParameters p0) {}
    JDKDSAPublicKey(java.math.BigInteger p0, java.security.spec.DSAParameterSpec p1) {}
    JDKDSAPublicKey(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) {}
    private boolean isNotNull(com.android.internal.org.bouncycastle.asn1.ASN1Encodable p0) { return false; }
    public java.lang.String getAlgorithm() { return null; }
    public java.lang.String getFormat() { return null; }
    public byte[] getEncoded() { return null; }
    public java.security.interfaces.DSAParams getParams() { return null; }
    public java.math.BigInteger getY() { return null; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    private void readObject(java.io.ObjectInputStream p0) throws java.io.IOException, java.lang.ClassNotFoundException {}
    private void writeObject(java.io.ObjectOutputStream p0) throws java.io.IOException {}
}
