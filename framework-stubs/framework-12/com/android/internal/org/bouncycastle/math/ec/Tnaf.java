package com.android.internal.org.bouncycastle.math.ec;

class Tnaf {
    private static final java.math.BigInteger MINUS_ONE = null;
    private static final java.math.BigInteger MINUS_TWO = null;
    private static final java.math.BigInteger MINUS_THREE = null;
    public static final byte WIDTH = 4;
    public static final byte POW_2_WIDTH = 16;
    public static final com.android.internal.org.bouncycastle.math.ec.ZTauElement[] alpha0 = null;
    public static final byte[][] alpha0Tnaf = null;
    public static final com.android.internal.org.bouncycastle.math.ec.ZTauElement[] alpha1 = null;
    public static final byte[][] alpha1Tnaf = null;
    Tnaf() {}
    public static java.math.BigInteger norm(byte p0, com.android.internal.org.bouncycastle.math.ec.ZTauElement p1) { return null; }
    public static com.android.internal.org.bouncycastle.math.ec.SimpleBigDecimal norm(byte p0, com.android.internal.org.bouncycastle.math.ec.SimpleBigDecimal p1, com.android.internal.org.bouncycastle.math.ec.SimpleBigDecimal p2) { return null; }
    public static com.android.internal.org.bouncycastle.math.ec.ZTauElement round(com.android.internal.org.bouncycastle.math.ec.SimpleBigDecimal p0, com.android.internal.org.bouncycastle.math.ec.SimpleBigDecimal p1, byte p2) { return null; }
    public static com.android.internal.org.bouncycastle.math.ec.SimpleBigDecimal approximateDivisionByN(java.math.BigInteger p0, java.math.BigInteger p1, java.math.BigInteger p2, byte p3, int p4, int p5) { return null; }
    public static byte[] tauAdicNaf(byte p0, com.android.internal.org.bouncycastle.math.ec.ZTauElement p1) { return null; }
    public static com.android.internal.org.bouncycastle.math.ec.ECPoint.AbstractF2m tau(com.android.internal.org.bouncycastle.math.ec.ECPoint.AbstractF2m p0) { return null; }
    public static byte getMu(com.android.internal.org.bouncycastle.math.ec.ECCurve.AbstractF2m p0) { return 0; }
    public static byte getMu(com.android.internal.org.bouncycastle.math.ec.ECFieldElement p0) { return 0; }
    public static byte getMu(int p0) { return 0; }
    public static java.math.BigInteger[] getLucas(byte p0, int p1, boolean p2) { return null; }
    public static java.math.BigInteger getTw(byte p0, int p1) { return null; }
    public static java.math.BigInteger[] getSi(com.android.internal.org.bouncycastle.math.ec.ECCurve.AbstractF2m p0) { return null; }
    public static java.math.BigInteger[] getSi(int p0, int p1, java.math.BigInteger p2) { return null; }
    protected static int getShiftsForCofactor(java.math.BigInteger p0) { return 0; }
    public static com.android.internal.org.bouncycastle.math.ec.ZTauElement partModReduction(java.math.BigInteger p0, int p1, byte p2, java.math.BigInteger[] p3, byte p4, byte p5) { return null; }
    public static com.android.internal.org.bouncycastle.math.ec.ECPoint.AbstractF2m multiplyRTnaf(com.android.internal.org.bouncycastle.math.ec.ECPoint.AbstractF2m p0, java.math.BigInteger p1) { return null; }
    public static com.android.internal.org.bouncycastle.math.ec.ECPoint.AbstractF2m multiplyTnaf(com.android.internal.org.bouncycastle.math.ec.ECPoint.AbstractF2m p0, com.android.internal.org.bouncycastle.math.ec.ZTauElement p1) { return null; }
    public static com.android.internal.org.bouncycastle.math.ec.ECPoint.AbstractF2m multiplyFromTnaf(com.android.internal.org.bouncycastle.math.ec.ECPoint.AbstractF2m p0, byte[] p1) { return null; }
    public static byte[] tauAdicWNaf(byte p0, com.android.internal.org.bouncycastle.math.ec.ZTauElement p1, byte p2, java.math.BigInteger p3, java.math.BigInteger p4, com.android.internal.org.bouncycastle.math.ec.ZTauElement[] p5) { return null; }
    public static com.android.internal.org.bouncycastle.math.ec.ECPoint.AbstractF2m[] getPreComp(com.android.internal.org.bouncycastle.math.ec.ECPoint.AbstractF2m p0, byte p1) { return null; }
}
