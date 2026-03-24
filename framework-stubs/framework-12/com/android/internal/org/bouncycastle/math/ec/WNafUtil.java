package com.android.internal.org.bouncycastle.math.ec;

public abstract class WNafUtil {
    public static final java.lang.String PRECOMP_NAME = "bc_wnaf";
    private static final int[] DEFAULT_WINDOW_SIZE_CUTOFFS = null;
    private static final int MAX_WIDTH = 16;
    private static final byte[] EMPTY_BYTES = null;
    private static final int[] EMPTY_INTS = null;
    private static final com.android.internal.org.bouncycastle.math.ec.ECPoint[] EMPTY_POINTS = null;
    public WNafUtil() {}
    public static void configureBasepoint(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) {}
    public static int[] generateCompactNaf(java.math.BigInteger p0) { return null; }
    public static int[] generateCompactWindowNaf(int p0, java.math.BigInteger p1) { return null; }
    public static byte[] generateJSF(java.math.BigInteger p0, java.math.BigInteger p1) { return null; }
    public static byte[] generateNaf(java.math.BigInteger p0) { return null; }
    public static byte[] generateWindowNaf(int p0, java.math.BigInteger p1) { return null; }
    public static int getNafWeight(java.math.BigInteger p0) { return 0; }
    public static com.android.internal.org.bouncycastle.math.ec.WNafPreCompInfo getWNafPreCompInfo(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) { return null; }
    public static com.android.internal.org.bouncycastle.math.ec.WNafPreCompInfo getWNafPreCompInfo(com.android.internal.org.bouncycastle.math.ec.PreCompInfo p0) { return null; }
    public static int getWindowSize(int p0) { return 0; }
    public static int getWindowSize(int p0, int p1) { return 0; }
    public static int getWindowSize(int p0, int[] p1) { return 0; }
    public static int getWindowSize(int p0, int[] p1, int p2) { return 0; }
    public static com.android.internal.org.bouncycastle.math.ec.WNafPreCompInfo precompute(com.android.internal.org.bouncycastle.math.ec.ECPoint p0, int p1, boolean p2) { return null; }
    public static com.android.internal.org.bouncycastle.math.ec.WNafPreCompInfo precomputeWithPointMap(com.android.internal.org.bouncycastle.math.ec.ECPoint p0, com.android.internal.org.bouncycastle.math.ec.ECPointMap p1, com.android.internal.org.bouncycastle.math.ec.WNafPreCompInfo p2, boolean p3) { return null; }
    private static byte[] trim(byte[] p0, int p1) { return null; }
    private static int[] trim(int[] p0, int p1) { return null; }
    private static com.android.internal.org.bouncycastle.math.ec.ECPoint[] resizeTable(com.android.internal.org.bouncycastle.math.ec.ECPoint[] p0, int p1) { return null; }
}
