package com.android.internal.location.geometry;

public final class S2CellIdUtils {
    public static final int MAX_LEVEL = 30;
    public static final int LAT_LNG_MIN_LENGTH = 2;
    public static final int LAT_INDEX = 0;
    public static final int LNG_INDEX = 1;
    public static double[] toLatLngDegrees(long p0, double[] p1) { return null; }
    public static double[] toLatLngRadians(long p0, double[] p1) { return null; }
    public static boolean containsLatLngDegrees(long p0, double p1, double p2) { return false; }
    public static long fromLatLngDegrees(double p0, double p1) { return 0L; }
    public static long fromFij(int p0, int p1, int p2) { return 0L; }
    public static int getFace(long p0) { return 0; }
    public static long getParent(long p0, int p1) { return 0L; }
    public static void getEdgeNeighbors(long p0, long[] p1) {}
    public static int getI(long p0) { return 0; }
    public static int getJ(long p0) { return 0; }
    public static int getLevel(long p0) { return 0; }
    static long getLowestOnBit(long p0) { return 0L; }
    static long getLowestOnBitForLevel(int p0) { return 0L; }
    public static long getTraversalStart(long p0, int p1) { return 0L; }
    public static long getTraversalNext(long p0) { return 0L; }
    @android.annotation.NonNull
    public static java.lang.String getToken(long p0) { return null; }

    private static interface UvTransform {
        public double xyzToU(double p0, double p1, double p2);
        public double xyzToV(double p0, double p1, double p2);
    }

    private static interface XyzTransform {
        public double uvToX(double p0, double p1);
        public double uvToY(double p0, double p1);
        public double uvToZ(double p0, double p1);
    }
}
