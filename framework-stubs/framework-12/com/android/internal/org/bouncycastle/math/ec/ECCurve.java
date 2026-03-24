package com.android.internal.org.bouncycastle.math.ec;

public abstract class ECCurve {
    public static final int COORD_AFFINE = 0;
    public static final int COORD_HOMOGENEOUS = 1;
    public static final int COORD_JACOBIAN = 2;
    public static final int COORD_JACOBIAN_CHUDNOVSKY = 3;
    public static final int COORD_JACOBIAN_MODIFIED = 4;
    public static final int COORD_LAMBDA_AFFINE = 5;
    public static final int COORD_LAMBDA_PROJECTIVE = 6;
    public static final int COORD_SKEWED = 7;
    protected com.android.internal.org.bouncycastle.math.field.FiniteField field;
    protected com.android.internal.org.bouncycastle.math.ec.ECFieldElement a;
    protected com.android.internal.org.bouncycastle.math.ec.ECFieldElement b;
    protected java.math.BigInteger order;
    protected java.math.BigInteger cofactor;
    protected int coord;
    protected com.android.internal.org.bouncycastle.math.ec.endo.ECEndomorphism endomorphism;
    protected com.android.internal.org.bouncycastle.math.ec.ECMultiplier multiplier;
    public static int[] getAllCoordinateSystems() { return null; }
    protected ECCurve(com.android.internal.org.bouncycastle.math.field.FiniteField p0) {}
    public abstract int getFieldSize();
    public abstract com.android.internal.org.bouncycastle.math.ec.ECFieldElement fromBigInteger(java.math.BigInteger p0);
    public abstract boolean isValidFieldElement(java.math.BigInteger p0);
    public abstract com.android.internal.org.bouncycastle.math.ec.ECFieldElement randomFieldElement(java.security.SecureRandom p0);
    public abstract com.android.internal.org.bouncycastle.math.ec.ECFieldElement randomFieldElementMult(java.security.SecureRandom p0);
    public synchronized com.android.internal.org.bouncycastle.math.ec.ECCurve.Config configure() { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint validatePoint(java.math.BigInteger p0, java.math.BigInteger p1) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint createPoint(java.math.BigInteger p0, java.math.BigInteger p1) { return null; }
    protected abstract com.android.internal.org.bouncycastle.math.ec.ECCurve cloneCurve();
    protected abstract com.android.internal.org.bouncycastle.math.ec.ECPoint createRawPoint(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1);
    protected abstract com.android.internal.org.bouncycastle.math.ec.ECPoint createRawPoint(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement[] p2);
    protected com.android.internal.org.bouncycastle.math.ec.ECMultiplier createDefaultMultiplier() { return null; }
    public boolean supportsCoordinateSystem(int p0) { return false; }
    public com.android.internal.org.bouncycastle.math.ec.PreCompInfo getPreCompInfo(com.android.internal.org.bouncycastle.math.ec.ECPoint p0, java.lang.String p1) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.PreCompInfo precompute(com.android.internal.org.bouncycastle.math.ec.ECPoint p0, java.lang.String p1, com.android.internal.org.bouncycastle.math.ec.PreCompCallback p2) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint importPoint(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) { return null; }
    public void normalizeAll(com.android.internal.org.bouncycastle.math.ec.ECPoint[] p0) {}
    public void normalizeAll(com.android.internal.org.bouncycastle.math.ec.ECPoint[] p0, int p1, int p2, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p3) {}
    public abstract com.android.internal.org.bouncycastle.math.ec.ECPoint getInfinity();
    public com.android.internal.org.bouncycastle.math.field.FiniteField getField() { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECFieldElement getA() { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECFieldElement getB() { return null; }
    public java.math.BigInteger getOrder() { return null; }
    public java.math.BigInteger getCofactor() { return null; }
    public int getCoordinateSystem() { return 0; }
    protected abstract com.android.internal.org.bouncycastle.math.ec.ECPoint decompressPoint(int p0, java.math.BigInteger p1);
    public com.android.internal.org.bouncycastle.math.ec.endo.ECEndomorphism getEndomorphism() { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECMultiplier getMultiplier() { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint decodePoint(byte[] p0) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECLookupTable createCacheSafeLookupTable(com.android.internal.org.bouncycastle.math.ec.ECPoint[] p0, int p1, int p2) { return null; }
    protected void checkPoint(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) {}
    protected void checkPoints(com.android.internal.org.bouncycastle.math.ec.ECPoint[] p0) {}
    protected void checkPoints(com.android.internal.org.bouncycastle.math.ec.ECPoint[] p0, int p1, int p2) {}
    public boolean equals(com.android.internal.org.bouncycastle.math.ec.ECCurve p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static abstract class AbstractF2m extends com.android.internal.org.bouncycastle.math.ec.ECCurve {
        private java.math.BigInteger[] si;
        public static java.math.BigInteger inverse(int p0, int[] p1, java.math.BigInteger p2) { return null; }
        private static com.android.internal.org.bouncycastle.math.field.FiniteField buildField(int p0, int p1, int p2, int p3) { return null; }
        protected AbstractF2m(int p0, int p1, int p2, int p3) { super(null); }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint createPoint(java.math.BigInteger p0, java.math.BigInteger p1) { return null; }
        public boolean isValidFieldElement(java.math.BigInteger p0) { return false; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement randomFieldElement(java.security.SecureRandom p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement randomFieldElementMult(java.security.SecureRandom p0) { return null; }
        protected com.android.internal.org.bouncycastle.math.ec.ECPoint decompressPoint(int p0, java.math.BigInteger p1) { return null; }
        protected com.android.internal.org.bouncycastle.math.ec.ECFieldElement solveQuadraticEquation(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
        synchronized java.math.BigInteger[] getSi() { return null; }
        public boolean isKoblitz() { return false; }
        private static java.math.BigInteger implRandomFieldElementMult(java.security.SecureRandom p0, int p1) { return null; }
    }

    public static abstract class AbstractFp extends com.android.internal.org.bouncycastle.math.ec.ECCurve {
        protected AbstractFp(java.math.BigInteger p0) { super(null); }
        public boolean isValidFieldElement(java.math.BigInteger p0) { return false; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement randomFieldElement(java.security.SecureRandom p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement randomFieldElementMult(java.security.SecureRandom p0) { return null; }
        protected com.android.internal.org.bouncycastle.math.ec.ECPoint decompressPoint(int p0, java.math.BigInteger p1) { return null; }
        private static java.math.BigInteger implRandomFieldElement(java.security.SecureRandom p0, java.math.BigInteger p1) { return null; }
        private static java.math.BigInteger implRandomFieldElementMult(java.security.SecureRandom p0, java.math.BigInteger p1) { return null; }
    }

    public class Config {
        protected int coord;
        protected com.android.internal.org.bouncycastle.math.ec.endo.ECEndomorphism endomorphism;
        protected com.android.internal.org.bouncycastle.math.ec.ECMultiplier multiplier;
        Config(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, int p1, com.android.internal.org.bouncycastle.math.ec.endo.ECEndomorphism p2, com.android.internal.org.bouncycastle.math.ec.ECMultiplier p3) {}
        public com.android.internal.org.bouncycastle.math.ec.ECCurve.Config setCoordinateSystem(int p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECCurve.Config setEndomorphism(com.android.internal.org.bouncycastle.math.ec.endo.ECEndomorphism p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECCurve.Config setMultiplier(com.android.internal.org.bouncycastle.math.ec.ECMultiplier p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECCurve create() { return null; }
    }

    public static class F2m extends com.android.internal.org.bouncycastle.math.ec.ECCurve.AbstractF2m {
        private static final int F2M_DEFAULT_COORDS = 6;
        private int m;
        private int k1;
        private int k2;
        private int k3;
        private com.android.internal.org.bouncycastle.math.ec.ECPoint.F2m infinity;
        public F2m(int p0, int p1, java.math.BigInteger p2, java.math.BigInteger p3) { super(0, 0, 0, 0); }
        public F2m(int p0, int p1, java.math.BigInteger p2, java.math.BigInteger p3, java.math.BigInteger p4, java.math.BigInteger p5) { super(0, 0, 0, 0); }
        public F2m(int p0, int p1, int p2, int p3, java.math.BigInteger p4, java.math.BigInteger p5) { super(0, 0, 0, 0); }
        public F2m(int p0, int p1, int p2, int p3, java.math.BigInteger p4, java.math.BigInteger p5, java.math.BigInteger p6, java.math.BigInteger p7) { super(0, 0, 0, 0); }
        protected F2m(int p0, int p1, int p2, int p3, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p4, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p5, java.math.BigInteger p6, java.math.BigInteger p7) { super(0, 0, 0, 0); }
        protected com.android.internal.org.bouncycastle.math.ec.ECCurve cloneCurve() { return null; }
        public boolean supportsCoordinateSystem(int p0) { return false; }
        protected com.android.internal.org.bouncycastle.math.ec.ECMultiplier createDefaultMultiplier() { return null; }
        public int getFieldSize() { return 0; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement fromBigInteger(java.math.BigInteger p0) { return null; }
        protected com.android.internal.org.bouncycastle.math.ec.ECPoint createRawPoint(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1) { return null; }
        protected com.android.internal.org.bouncycastle.math.ec.ECPoint createRawPoint(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement[] p2) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint getInfinity() { return null; }
        public int getM() { return 0; }
        public boolean isTrinomial() { return false; }
        public int getK1() { return 0; }
        public int getK2() { return 0; }
        public int getK3() { return 0; }
        public com.android.internal.org.bouncycastle.math.ec.ECLookupTable createCacheSafeLookupTable(com.android.internal.org.bouncycastle.math.ec.ECPoint[] p0, int p1, int p2) { return null; }
    }

    public static class Fp extends com.android.internal.org.bouncycastle.math.ec.ECCurve.AbstractFp {
        private static final int FP_DEFAULT_COORDS = 4;
        java.math.BigInteger q;
        java.math.BigInteger r;
        com.android.internal.org.bouncycastle.math.ec.ECPoint.Fp infinity;
        public Fp(java.math.BigInteger p0, java.math.BigInteger p1, java.math.BigInteger p2) { super(null); }
        public Fp(java.math.BigInteger p0, java.math.BigInteger p1, java.math.BigInteger p2, java.math.BigInteger p3, java.math.BigInteger p4) { super(null); }
        protected Fp(java.math.BigInteger p0, java.math.BigInteger p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p3, java.math.BigInteger p4, java.math.BigInteger p5) { super(null); }
        protected com.android.internal.org.bouncycastle.math.ec.ECCurve cloneCurve() { return null; }
        public boolean supportsCoordinateSystem(int p0) { return false; }
        public java.math.BigInteger getQ() { return null; }
        public int getFieldSize() { return 0; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement fromBigInteger(java.math.BigInteger p0) { return null; }
        protected com.android.internal.org.bouncycastle.math.ec.ECPoint createRawPoint(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1) { return null; }
        protected com.android.internal.org.bouncycastle.math.ec.ECPoint createRawPoint(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement[] p2) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint importPoint(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint getInfinity() { return null; }
    }
}
