package com.android.internal.org.bouncycastle.math.ec.custom.sec;

public class SecP256R1Curve extends com.android.internal.org.bouncycastle.math.ec.ECCurve.AbstractFp {
    public static final java.math.BigInteger q = null;
    private static final int SECP256R1_DEFAULT_COORDS = 2;
    private static final com.android.internal.org.bouncycastle.math.ec.ECFieldElement[] SECP256R1_AFFINE_ZS = null;
    protected com.android.internal.org.bouncycastle.math.ec.custom.sec.SecP256R1Point infinity;
    public SecP256R1Curve() { super(null); }
    protected com.android.internal.org.bouncycastle.math.ec.ECCurve cloneCurve() { return null; }
    public boolean supportsCoordinateSystem(int p0) { return false; }
    public java.math.BigInteger getQ() { return null; }
    public int getFieldSize() { return 0; }
    public com.android.internal.org.bouncycastle.math.ec.ECFieldElement fromBigInteger(java.math.BigInteger p0) { return null; }
    protected com.android.internal.org.bouncycastle.math.ec.ECPoint createRawPoint(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1) { return null; }
    protected com.android.internal.org.bouncycastle.math.ec.ECPoint createRawPoint(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement[] p2) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint getInfinity() { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECLookupTable createCacheSafeLookupTable(com.android.internal.org.bouncycastle.math.ec.ECPoint[] p0, int p1, int p2) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECFieldElement randomFieldElement(java.security.SecureRandom p0) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECFieldElement randomFieldElementMult(java.security.SecureRandom p0) { return null; }
}
