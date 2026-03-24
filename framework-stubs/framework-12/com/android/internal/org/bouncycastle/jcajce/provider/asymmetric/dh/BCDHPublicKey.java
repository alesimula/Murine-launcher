package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.dh;

public class BCDHPublicKey implements javax.crypto.interfaces.DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    private java.math.BigInteger y;
    private transient com.android.internal.org.bouncycastle.crypto.params.DHPublicKeyParameters dhPublicKey;
    private transient javax.crypto.spec.DHParameterSpec dhSpec;
    private transient com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo info;
    BCDHPublicKey(javax.crypto.spec.DHPublicKeySpec p0) {}
    BCDHPublicKey(javax.crypto.interfaces.DHPublicKey p0) {}
    BCDHPublicKey(com.android.internal.org.bouncycastle.crypto.params.DHPublicKeyParameters p0) {}
    BCDHPublicKey(java.math.BigInteger p0, javax.crypto.spec.DHParameterSpec p1) {}
    public BCDHPublicKey(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) {}
    public java.lang.String getAlgorithm() { return null; }
    public java.lang.String getFormat() { return null; }
    public byte[] getEncoded() { return null; }
    public java.lang.String toString() { return null; }
    public javax.crypto.spec.DHParameterSpec getParams() { return null; }
    public java.math.BigInteger getY() { return null; }
    public com.android.internal.org.bouncycastle.crypto.params.DHPublicKeyParameters engineGetKeyParameters() { return null; }
    private boolean isPKCSParam(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    private void readObject(java.io.ObjectInputStream p0) throws java.io.IOException, java.lang.ClassNotFoundException {}
    private void writeObject(java.io.ObjectOutputStream p0) throws java.io.IOException {}
}
