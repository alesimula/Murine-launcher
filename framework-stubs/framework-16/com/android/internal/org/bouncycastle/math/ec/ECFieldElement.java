package com.android.internal.org.bouncycastle.math.ec;

public abstract class ECFieldElement implements com.android.internal.org.bouncycastle.math.ec.ECConstants {
    public abstract java.math.BigInteger toBigInteger();
    public abstract java.lang.String getFieldName();
    public abstract int getFieldSize();
    public abstract com.android.internal.org.bouncycastle.math.ec.ECFieldElement add(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0);
    public abstract com.android.internal.org.bouncycastle.math.ec.ECFieldElement addOne();
    public abstract com.android.internal.org.bouncycastle.math.ec.ECFieldElement subtract(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0);
    public abstract com.android.internal.org.bouncycastle.math.ec.ECFieldElement multiply(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0);
    public abstract com.android.internal.org.bouncycastle.math.ec.ECFieldElement divide(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0);
    public abstract com.android.internal.org.bouncycastle.math.ec.ECFieldElement negate();
    public abstract com.android.internal.org.bouncycastle.math.ec.ECFieldElement square();
    public abstract com.android.internal.org.bouncycastle.math.ec.ECFieldElement invert();
    public abstract com.android.internal.org.bouncycastle.math.ec.ECFieldElement sqrt();
    public ECFieldElement() {}
    public int bitLength() { return 0; }
    public boolean isOne() { return false; }
    public boolean isZero() { return false; }
    public com.android.internal.org.bouncycastle.math.ec.ECFieldElement multiplyMinusProduct(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECFieldElement multiplyPlusProduct(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECFieldElement squareMinusProduct(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECFieldElement squarePlusProduct(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1) { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECFieldElement squarePow(int p0) { return null; }
    public boolean testBitZero() { return false; }
    public java.lang.String toString() { return null; }
    public byte[] getEncoded() { return null; }

    public static abstract class AbstractF2m extends com.android.internal.org.bouncycastle.math.ec.ECFieldElement {
        public AbstractF2m() { super(); }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement halfTrace() { return null; }
        public boolean hasFastTrace() { return false; }
        public int trace() { return 0; }
    }

    public static abstract class AbstractFp extends com.android.internal.org.bouncycastle.math.ec.ECFieldElement {
        public AbstractFp() { super(); }
    }

    public static class F2m extends com.android.internal.org.bouncycastle.math.ec.ECFieldElement.AbstractF2m {
        public static final int GNB = 1;
        public static final int TPB = 2;
        public static final int PPB = 3;
        com.android.internal.org.bouncycastle.math.ec.LongArray x;
        F2m(int p0, int[] p1, com.android.internal.org.bouncycastle.math.ec.LongArray p2) { super(); }
        public int bitLength() { return 0; }
        public boolean isOne() { return false; }
        public boolean isZero() { return false; }
        public boolean testBitZero() { return false; }
        public java.math.BigInteger toBigInteger() { return null; }
        public java.lang.String getFieldName() { return null; }
        public int getFieldSize() { return 0; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement add(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement addOne() { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement subtract(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement multiply(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement multiplyMinusProduct(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement multiplyPlusProduct(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement divide(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement negate() { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement square() { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement squareMinusProduct(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement squarePlusProduct(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement squarePow(int p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement invert() { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement sqrt() { return null; }
        public int getRepresentation() { return 0; }
        public int getM() { return 0; }
        public int getK1() { return 0; }
        public int getK2() { return 0; }
        public int getK3() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static class Fp extends com.android.internal.org.bouncycastle.math.ec.ECFieldElement.AbstractFp {
        java.math.BigInteger q;
        java.math.BigInteger r;
        java.math.BigInteger x;
        static java.math.BigInteger calculateResidue(java.math.BigInteger p0) { return null; }
        Fp(java.math.BigInteger p0, java.math.BigInteger p1, java.math.BigInteger p2) { super(); }
        public java.math.BigInteger toBigInteger() { return null; }
        public java.lang.String getFieldName() { return null; }
        public int getFieldSize() { return 0; }
        public java.math.BigInteger getQ() { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement add(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement addOne() { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement subtract(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement multiply(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement multiplyMinusProduct(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement multiplyPlusProduct(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p2) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement divide(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement negate() { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement square() { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement squareMinusProduct(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement squarePlusProduct(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0, com.android.internal.org.bouncycastle.math.ec.ECFieldElement p1) { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement invert() { return null; }
        public com.android.internal.org.bouncycastle.math.ec.ECFieldElement sqrt() { return null; }
        protected java.math.BigInteger modAdd(java.math.BigInteger p0, java.math.BigInteger p1) { return null; }
        protected java.math.BigInteger modDouble(java.math.BigInteger p0) { return null; }
        protected java.math.BigInteger modHalf(java.math.BigInteger p0) { return null; }
        protected java.math.BigInteger modHalfAbs(java.math.BigInteger p0) { return null; }
        protected java.math.BigInteger modInverse(java.math.BigInteger p0) { return null; }
        protected java.math.BigInteger modMult(java.math.BigInteger p0, java.math.BigInteger p1) { return null; }
        protected java.math.BigInteger modReduce(java.math.BigInteger p0) { return null; }
        protected java.math.BigInteger modSubtract(java.math.BigInteger p0, java.math.BigInteger p1) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
