package com.android.internal.org.bouncycastle.jce.provider;

public class JCEDHPublicKey implements javax.crypto.interfaces.DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    JCEDHPublicKey(javax.crypto.spec.DHPublicKeySpec p0) {}
    JCEDHPublicKey(javax.crypto.interfaces.DHPublicKey p0) {}
    JCEDHPublicKey(com.android.internal.org.bouncycastle.crypto.params.DHPublicKeyParameters p0) {}
    JCEDHPublicKey(java.math.BigInteger p0, javax.crypto.spec.DHParameterSpec p1) {}
    JCEDHPublicKey(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) {}
    public java.lang.String getAlgorithm() { return null; }
    public java.lang.String getFormat() { return null; }
    public byte[] getEncoded() { return null; }
    public javax.crypto.spec.DHParameterSpec getParams() { return null; }
    public java.math.BigInteger getY() { return null; }
}
