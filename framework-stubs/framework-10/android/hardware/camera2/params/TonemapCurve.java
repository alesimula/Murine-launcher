package android.hardware.camera2.params;

public final class TonemapCurve {
    public static final float LEVEL_BLACK = 0.0f;
    public static final float LEVEL_WHITE = 1.0f;
    public static final int POINT_SIZE = 2;
    public static final int CHANNEL_RED = 0;
    public static final int CHANNEL_GREEN = 1;
    public static final int CHANNEL_BLUE = 2;
    private static final int OFFSET_POINT_IN = 0;
    private static final int OFFSET_POINT_OUT = 1;
    private static final int TONEMAP_MIN_CURVE_POINTS = 2;
    private static final int MIN_CURVE_LENGTH = 4;
    private final float[] mRed = null;
    private final float[] mGreen = null;
    private final float[] mBlue = null;
    private int mHashCode;
    private boolean mHashCalculated;
    public TonemapCurve(float[] p0, float[] p1, float[] p2) {}
    private static void checkArgumentArrayLengthDivisibleBy(float[] p0, int p1, java.lang.String p2) {}
    private static int checkArgumentColorChannel(int p0) { return 0; }
    private static void checkArgumentArrayLengthNoLessThan(float[] p0, int p1, java.lang.String p2) {}
    public int getPointCount(int p0) { return 0; }
    public android.graphics.PointF getPoint(int p0, int p1) { return null; }
    public void copyColorCurve(int p0, float[] p1, int p2) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    private java.lang.String curveToString(int p0) { return null; }
    private float[] getCurve(int p0) { return null; }
}
