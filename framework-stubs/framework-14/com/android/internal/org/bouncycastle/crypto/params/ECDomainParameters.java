package com.android.internal.org.bouncycastle.crypto.params;

public class ECDomainParameters implements com.android.internal.org.bouncycastle.math.ec.ECConstants {
    public ECDomainParameters(com.android.internal.org.bouncycastle.asn1.x9.X9ECParameters p0) {}
    public ECDomainParameters(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.ECPoint p1, java.math.BigInteger p2) {}
    public ECDomainParameters(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.ECPoint p1, java.math.BigInteger p2, java.math.BigInteger p3) {}
    public ECDomainParameters(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.ECPoint p1, java.math.BigInteger p2, java.math.BigInteger p3, byte[] p4) {}
    public com.android.internal.org.bouncycastle.math.ec.ECCurve getCurve() { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint getG() { return null; }
    public java.math.BigInteger getN() { return null; }
    public java.math.BigInteger getH() { return null; }
    public synchronized java.math.BigInteger getHInv() { return null; }
    public byte[] getSeed() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.math.BigInteger validatePrivateScalar(java.math.BigInteger p0) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint validatePublicPoint(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) { return null; }
    static com.android.internal.org.bouncycastle.math.ec.ECPoint validatePublicPoint(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.ECPoint p1) { return null; }
}
