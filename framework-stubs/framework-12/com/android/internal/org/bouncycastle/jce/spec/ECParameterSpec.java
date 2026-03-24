package com.android.internal.org.bouncycastle.jce.spec;

public class ECParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    private com.android.internal.org.bouncycastle.math.ec.ECCurve curve;
    private byte[] seed;
    private com.android.internal.org.bouncycastle.math.ec.ECPoint G;
    private java.math.BigInteger n;
    private java.math.BigInteger h;
    public ECParameterSpec(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.ECPoint p1, java.math.BigInteger p2) {}
    public ECParameterSpec(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.ECPoint p1, java.math.BigInteger p2, java.math.BigInteger p3) {}
    public ECParameterSpec(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.ECPoint p1, java.math.BigInteger p2, java.math.BigInteger p3, byte[] p4) {}
    public com.android.internal.org.bouncycastle.math.ec.ECCurve getCurve() { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint getG() { return null; }
    public java.math.BigInteger getN() { return null; }
    public java.math.BigInteger getH() { return null; }
    public byte[] getSeed() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
