package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.rsa;

public class BCRSAPublicKey implements java.security.interfaces.RSAPublicKey {
    static final com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier DEFAULT_ALGORITHM_IDENTIFIER = null;
    static final long serialVersionUID = 2675817738516720772L;
    private java.math.BigInteger modulus;
    private java.math.BigInteger publicExponent;
    private transient com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier;
    private transient com.android.internal.org.bouncycastle.crypto.params.RSAKeyParameters rsaPublicKey;
    BCRSAPublicKey(com.android.internal.org.bouncycastle.crypto.params.RSAKeyParameters p0) {}
    BCRSAPublicKey(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.crypto.params.RSAKeyParameters p1) {}
    BCRSAPublicKey(java.security.spec.RSAPublicKeySpec p0) {}
    BCRSAPublicKey(java.security.interfaces.RSAPublicKey p0) {}
    BCRSAPublicKey(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) {}
    private void populateFromPublicKeyInfo(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) {}
    public java.math.BigInteger getModulus() { return null; }
    public java.math.BigInteger getPublicExponent() { return null; }
    public java.lang.String getAlgorithm() { return null; }
    public java.lang.String getFormat() { return null; }
    public byte[] getEncoded() { return null; }
    com.android.internal.org.bouncycastle.crypto.params.RSAKeyParameters engineGetKeyParameters() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    private void readObject(java.io.ObjectInputStream p0) throws java.io.IOException, java.lang.ClassNotFoundException {}
    private void writeObject(java.io.ObjectOutputStream p0) throws java.io.IOException {}
}
