package com.android.internal.org.bouncycastle.math.raw;

public class Interleave {
    private static final long M32 = 1431655765L;
    private static final long M64 = 6148914691236517205L;
    private static final long M64R = -6148914691236517206L;
    public Interleave() {}
    public static int expand8to16(int p0) { return 0; }
    public static int expand16to32(int p0) { return 0; }
    public static long expand32to64(int p0) { return 0L; }
    public static void expand64To128(long p0, long[] p1, int p2) {}
    public static void expand64To128(long[] p0, int p1, int p2, long[] p3, int p4) {}
    public static void expand64To128Rev(long p0, long[] p1, int p2) {}
    public static int shuffle(int p0) { return 0; }
    public static long shuffle(long p0) { return 0L; }
    public static int shuffle2(int p0) { return 0; }
    public static long shuffle2(long p0) { return 0L; }
    public static long shuffle3(long p0) { return 0L; }
    public static int unshuffle(int p0) { return 0; }
    public static long unshuffle(long p0) { return 0L; }
    public static int unshuffle2(int p0) { return 0; }
    public static long unshuffle2(long p0) { return 0L; }
    public static long unshuffle3(long p0) { return 0L; }
}
