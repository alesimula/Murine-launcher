package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.rsa;

public class BCRSAPrivateCrtKey extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey implements java.security.interfaces.RSAPrivateCrtKey {
    static final long serialVersionUID = 7834723820638524718L;
    private java.math.BigInteger publicExponent;
    private java.math.BigInteger primeP;
    private java.math.BigInteger primeQ;
    private java.math.BigInteger primeExponentP;
    private java.math.BigInteger primeExponentQ;
    private java.math.BigInteger crtCoefficient;
    BCRSAPrivateCrtKey(com.android.internal.org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters p0) { super((com.android.internal.org.bouncycastle.crypto.params.RSAKeyParameters)null); }
    BCRSAPrivateCrtKey(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters p1) { super((com.android.internal.org.bouncycastle.crypto.params.RSAKeyParameters)null); }
    BCRSAPrivateCrtKey(java.security.spec.RSAPrivateCrtKeySpec p0) { super((com.android.internal.org.bouncycastle.crypto.params.RSAKeyParameters)null); }
    BCRSAPrivateCrtKey(java.security.interfaces.RSAPrivateCrtKey p0) { super((com.android.internal.org.bouncycastle.crypto.params.RSAKeyParameters)null); }
    BCRSAPrivateCrtKey(com.android.internal.org.bouncycastle.asn1.pkcs.PrivateKeyInfo p0) throws java.io.IOException { super((com.android.internal.org.bouncycastle.crypto.params.RSAKeyParameters)null); }
    BCRSAPrivateCrtKey(com.android.internal.org.bouncycastle.asn1.pkcs.RSAPrivateKey p0) { super((com.android.internal.org.bouncycastle.crypto.params.RSAKeyParameters)null); }
    BCRSAPrivateCrtKey(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.asn1.pkcs.RSAPrivateKey p1) { super((com.android.internal.org.bouncycastle.crypto.params.RSAKeyParameters)null); }
    public java.lang.String getFormat() { return null; }
    public byte[] getEncoded() { return null; }
    public java.math.BigInteger getPublicExponent() { return null; }
    public java.math.BigInteger getPrimeP() { return null; }
    public java.math.BigInteger getPrimeQ() { return null; }
    public java.math.BigInteger getPrimeExponentP() { return null; }
    public java.math.BigInteger getPrimeExponentQ() { return null; }
    public java.math.BigInteger getCrtCoefficient() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    private void readObject(java.io.ObjectInputStream p0) throws java.io.IOException, java.lang.ClassNotFoundException {}
    private void writeObject(java.io.ObjectOutputStream p0) throws java.io.IOException {}
    public java.lang.String toString() { return null; }
}
