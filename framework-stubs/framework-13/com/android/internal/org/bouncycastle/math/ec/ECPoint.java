package com.android.internal.org.bouncycastle.math.ec;

public abstract class ECPoint {
    protected static final com.android.internal.org.bouncycastle.math.ec.ECFieldElement[] EMPTY_ZS = null;
    protected com.android.internal.org.bouncycastle.math.ec.ECCurve curve;
    protected com.android.internal.org.bouncycastle.math.ec.ECFieldElement x;
    protected com.android.internal.org.bouncycastle.math.ec.ECFieldElement y;
    protected com.android.internal.org.bouncycastle.math.ec.ECFieldElement[] zs;
    protected java.util.Hashtable preCompTable;
    protected static com.android.internal.org.bouncycastle.math.ec.ECFieldElement[] getInitialZCoords(com.android.internal.org.bouncycastle.math.ec.ECCurve p0) { return null; }
    protected ECPoint(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2) {}
    protected ECPoint(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2, com.android.internal.org.bouncycastle.math.ec.ECFieldElement[] p3) {}
    protected abstract boolean satisfiesCurveEquation();
    protected boolean satisfiesOrder() { return false; }
    public final com.android.internal.org.bouncycastle.math.ec.ECPoint getDetachedPoint() { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECCurve getCurve() { return null; }
    protected abstract com.android.internal.org.bouncycastle.math.ec.ECPoint detach();
    protected int getCurveCoordinateSystem() { return 0; }
    public com.android.internal.org.bouncycastle.math.ec.ECFieldElement getAffineXCoord() { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECFieldElement getAffineYCoord() { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECFieldElement getXCoord() { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECFieldElement getYCoord() { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECFieldElement getZCoord(int p0) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECFieldElement[] getZCoords() { return null; }
    public final com.android.internal.org.bouncycastle.math.ec.ECFieldElement getRawXCoord() { return null; }
    public final com.android.internal.org.bouncycastle.math.ec.ECFieldElement getRawYCoord() { return null; }
    protected final com.android.internal.org.bouncycastle.math.ec.ECFieldElement[] getRawZCoords() { return null; }
    protected void checkNormalized() {}
    public boolean isNormalized() { return false; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint normalize() { return null; }
    com.android.internal.org.bouncycastle.math.ec.ECPoint normalize(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
    protected com.android.internal.org.bouncycastle.math.ec.ECPoint createScaledPoint(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1) { return null; }
    public boolean isInfinity() { return false; }
    public boolean isValid() { return false; }
    boolean isValidPartial() { return false; }
    boolean implIsValid(boolean p0, boolean p1) { return false; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint scaleX(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint scaleXNegateY(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint scaleY(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint scaleYNegateX(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
    public boolean equals(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public byte[] getEncoded(boolean p0) { return null; }
    protected abstract boolean getCompressionYTilde();
    public abstract com.android.internal.org.bouncycastle.math.ec.ECPoint add(com.android.internal.org.bouncycastle.math.ec.ECPoint p0);
    public abstract com.android.internal.org.bouncycastle.math.ec.ECPoint negate();
    public abstract com.android.internal.org.bouncycastle.math.ec.ECPoint subtract(com.android.internal.org.bouncycastle.math.ec.ECPoint p0);
    public com.android.internal.org.bouncycastle.math.ec.ECPoint timesPow2(int p0) { return null; }
    public abstract com.android.internal.org.bouncycastle.math.ec.ECPoint twice();
    public com.android.internal.org.bouncycastle.math.ec.ECPoint twicePlus(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint threeTimes() { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint multiply(java.math.BigInteger p0) { return null; }

    public static abstract class AbstractF2m extends com.android.internal.org.bouncycastle.math.ec.ECPoint {
        protected AbstractF2m(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2) { super((com.android.internal.org.bouncycastle.math.ec.ECCurve)null, (com.android.internal.org.bouncycastle.math.ec.ECFieldElement)null, (com.android.internal.org.bouncycastle.math.ec.ECFieldElement)null); }
        protected AbstractF2m(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2, com.android.internal.org.bouncycastle.math.ec.ECFieldElement[] p3) { super((com.android.internal.org.bouncycastle.math.ec.ECCurve)null, (com.android.internal.org.bouncycastle.math.ec.ECFieldElement)null, (com.android.internal.org.bouncycastle.math.ec.ECFieldElement)null); }
        protected boolean satisfiesCurveEquation() { return false; }
        protected boolean satisfiesOrder() { return false; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint scaleX(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint scaleXNegateY(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint scaleY(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint scaleYNegateX(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint subtract(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint.AbstractF2m tau() { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint.AbstractF2m tauPow(int p0) { return null; }
    }

    public static abstract class AbstractFp extends com.android.internal.org.bouncycastle.math.ec.ECPoint {
        protected AbstractFp(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2) { super((com.android.internal.org.bouncycastle.math.ec.ECCurve)null, (com.android.internal.org.bouncycastle.math.ec.ECFieldElement)null, (com.android.internal.org.bouncycastle.math.ec.ECFieldElement)null); }
        protected AbstractFp(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2, com.android.internal.org.bouncycastle.math.ec.ECFieldElement[] p3) { super((com.android.internal.org.bouncycastle.math.ec.ECCurve)null, (com.android.internal.org.bouncycastle.math.ec.ECFieldElement)null, (com.android.internal.org.bouncycastle.math.ec.ECFieldElement)null); }
        protected boolean getCompressionYTilde() { return false; }
        protected boolean satisfiesCurveEquation() { return false; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint subtract(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) { return null; }
    }

    public static class F2m extends com.android.internal.org.bouncycastle.math.ec.ECPoint.AbstractF2m {
        F2m(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2) { super((com.android.internal.org.bouncycastle.math.ec.ECCurve)null, (com.android.internal.org.bouncycastle.math.ec.ECFieldElement)null, (com.android.internal.org.bouncycastle.math.ec.ECFieldElement)null); }
        F2m(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2, com.android.internal.org.bouncycastle.math.ec.ECFieldElement[] p3) { super((com.android.internal.org.bouncycastle.math.ec.ECCurve)null, (com.android.internal.org.bouncycastle.math.ec.ECFieldElement)null, (com.android.internal.org.bouncycastle.math.ec.ECFieldElement)null); }
        protected com.android.internal.org.bouncycastle.math.ec.ECPoint detach() { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement getYCoord() { return null; }
        protected boolean getCompressionYTilde() { return false; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint add(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint twice() { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint twicePlus(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint negate() { return null; }
    }

    public static class Fp extends com.android.internal.org.bouncycastle.math.ec.ECPoint.AbstractFp {
        Fp(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2) { super((com.android.internal.org.bouncycastle.math.ec.ECCurve)null, (com.android.internal.org.bouncycastle.math.ec.ECFieldElement)null, (com.android.internal.org.bouncycastle.math.ec.ECFieldElement)null); }
        Fp(com.android.internal.org.bouncycastle.math.ec.ECCurve p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2, com.android.internal.org.bouncycastle.math.ec.ECFieldElement[] p3) { super((com.android.internal.org.bouncycastle.math.ec.ECCurve)null, (com.android.internal.org.bouncycastle.math.ec.ECFieldElement)null, (com.android.internal.org.bouncycastle.math.ec.ECFieldElement)null); }
        protected com.android.internal.org.bouncycastle.math.ec.ECPoint detach() { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement getZCoord(int p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint add(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint twice() { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint twicePlus(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint threeTimes() { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint timesPow2(int p0) { return null; }
        protected com.android.internal.org.bouncycastle.math.ec.ECFieldElement two(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
        protected com.android.internal.org.bouncycastle.math.ec.ECFieldElement three(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
        protected com.android.internal.org.bouncycastle.math.ec.ECFieldElement four(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
        protected com.android.internal.org.bouncycastle.math.ec.ECFieldElement eight(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
        protected com.android.internal.org.bouncycastle.math.ec.ECFieldElement doubleProductFromSquares(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p3) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECPoint negate() { return null; }
        protected com.android.internal.org.bouncycastle.math.ec.ECFieldElement calculateJacobianModifiedW(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1) { return null; }
        protected com.android.internal.org.bouncycastle.math.ec.ECFieldElement getJacobianModifiedW() { return null; }
        protected com.android.internal.org.bouncycastle.math.ec.ECPoint.Fp twiceJacobianModified(boolean p0) { return null; }
    }
}
