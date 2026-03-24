package com.android.internal.graphics;

public final class ColorUtils {
    private static final double XYZ_WHITE_REFERENCE_X = 95.047;
    private static final double XYZ_WHITE_REFERENCE_Y = 100.0;
    private static final double XYZ_WHITE_REFERENCE_Z = 108.883;
    private static final double XYZ_EPSILON = 0.008856;
    private static final double XYZ_KAPPA = 903.3;
    private static final int MIN_ALPHA_SEARCH_MAX_ITERATIONS = 10;
    private static final int MIN_ALPHA_SEARCH_PRECISION = 1;
    private static final java.lang.ThreadLocal<double[]> TEMP_ARRAY = null;
    private ColorUtils() {}
    public static int compositeColors(int p0, int p1) { return 0; }
    private static int compositeAlpha(int p0, int p1) { return 0; }
    private static int compositeComponent(int p0, int p1, int p2, int p3, int p4) { return 0; }
    public static double calculateLuminance(int p0) { return 0.0; }
    public static double calculateContrast(int p0, int p1) { return 0.0; }
    public static int calculateMinimumBackgroundAlpha(int p0, int p1, float p2) { return 0; }
    public static int calculateMinimumAlpha(int p0, int p1, float p2) { return 0; }
    private static int binaryAlphaSearch(int p0, int p1, float p2, com.android.internal.graphics.ColorUtils.ContrastCalculator p3) { return 0; }
    public static void RGBToHSL(int p0, int p1, int p2, float[] p3) {}
    public static void colorToHSL(int p0, float[] p1) {}
    public static int HSLToColor(float[] p0) { return 0; }
    public static int setAlphaComponent(int p0, int p1) { return 0; }
    public static void colorToLAB(int p0, double[] p1) {}
    public static void RGBToLAB(int p0, int p1, int p2, double[] p3) {}
    public static void colorToXYZ(int p0, double[] p1) {}
    public static void RGBToXYZ(int p0, int p1, int p2, double[] p3) {}
    public static void XYZToLAB(double p0, double p1, double p2, double[] p3) {}
    public static void LABToXYZ(double p0, double p1, double p2, double[] p3) {}
    public static int XYZToColor(double p0, double p1, double p2) { return 0; }
    public static int LABToColor(double p0, double p1, double p2) { return 0; }
    public static double distanceEuclidean(double[] p0, double[] p1) { return 0.0; }
    private static float constrain(float p0, float p1, float p2) { return 0.0f; }
    private static int constrain(int p0, int p1, int p2) { return 0; }
    private static double pivotXyzComponent(double p0) { return 0.0; }
    public static int blendARGB(int p0, int p1, float p2) { return 0; }
    public static void blendHSL(float[] p0, float[] p1, float p2, float[] p3) {}
    public static void blendLAB(double[] p0, double[] p1, double p2, double[] p3) {}
    static float circularInterpolate(float p0, float p1, float p2) { return 0.0f; }
    private static double[] getTempDouble3Array() { return null; }

    private static interface ContrastCalculator {
        public double calculateContrast(int p0, int p1, int p2);
    }
}
