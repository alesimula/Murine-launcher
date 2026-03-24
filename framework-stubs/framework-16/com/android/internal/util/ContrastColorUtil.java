package com.android.internal.util;

public class ContrastColorUtil {
    public static com.android.internal.util.ContrastColorUtil getInstance(android.content.Context p0) { return null; }
    public boolean isGrayscaleIcon(android.graphics.Bitmap p0) { return false; }
    public boolean isGrayscaleIcon(android.graphics.drawable.Drawable p0) { return false; }
    public boolean isGrayscaleIcon(android.content.Context p0, android.graphics.drawable.Icon p1) { return false; }
    public boolean isGrayscaleIcon(android.content.Context p0, int p1) { return false; }
    public java.lang.CharSequence invertCharSequenceColors(java.lang.CharSequence p0) { return null; }
    public static java.lang.CharSequence clearColorSpans(java.lang.CharSequence p0) { return null; }
    public static java.lang.CharSequence ensureColorSpanContrast(java.lang.CharSequence p0, int p1) { return null; }
    public static boolean isColorDark(int p0) { return false; }
    public static boolean isColorDarkLab(int p0) { return false; }
    public static int findContrastColor(int p0, int p1, boolean p2, double p3) { return 0; }
    public static int findAlphaToMeetContrast(int p0, int p1, double p2) { return 0; }
    public static int findContrastColorAgainstDark(int p0, int p1, boolean p2, double p3) { return 0; }
    public static int ensureTextContrastOnBlack(int p0) { return 0; }
    public static int ensureLargeTextContrast(int p0, int p1, boolean p2) { return 0; }
    public static int ensureTextContrast(int p0, int p1, boolean p2) { return 0; }
    public static int ensureContrast(int p0, int p1, boolean p2, double p3) { return 0; }
    public static int ensureTextBackgroundColor(int p0, int p1, int p2) { return 0; }
    public static int resolveColor(android.content.Context p0, int p1, boolean p2) { return 0; }
    public static int resolveContrastColor(android.content.Context p0, int p1, int p2) { return 0; }
    public static int resolveContrastColor(android.content.Context p0, int p1, int p2, boolean p3) { return 0; }
    public static int changeColorLightness(int p0, int p1) { return 0; }
    public static int resolvePrimaryColor(android.content.Context p0, int p1, boolean p2) { return 0; }
    public static int resolveSecondaryColor(android.content.Context p0, int p1, boolean p2) { return 0; }
    public static int resolveDefaultColor(android.content.Context p0, int p1, boolean p2) { return 0; }
    public static int getShiftedColor(int p0, int p1) { return 0; }
    public static int getMutedColor(int p0, float p1) { return 0; }
    public static double calculateLuminance(int p0) { return 0.0; }
    public static double calculateContrast(int p0, int p1) { return 0.0; }
    public static boolean satisfiesTextContrast(int p0, int p1) { return false; }
    public static int compositeColors(int p0, int p1) { return 0; }
    public static boolean isColorLight(int p0) { return false; }

    private static class ColorUtilsFromCompat {
        public static int compositeColors(int p0, int p1) { return 0; }
        public static int setAlphaComponent(int p0, int p1) { return 0; }
        public static double calculateLuminance(int p0) { return 0.0; }
        public static double calculateContrast(int p0, int p1) { return 0.0; }
        public static void colorToLAB(int p0, double[] p1) {}
        public static void RGBToLAB(int p0, int p1, int p2, double[] p3) {}
        public static void colorToXYZ(int p0, double[] p1) {}
        public static void RGBToXYZ(int p0, int p1, int p2, double[] p3) {}
        public static void XYZToLAB(double p0, double p1, double p2, double[] p3) {}
        public static void LABToXYZ(double p0, double p1, double p2, double[] p3) {}
        public static int XYZToColor(double p0, double p1, double p2) { return 0; }
        public static int LABToColor(double p0, double p1, double p2) { return 0; }
        public static double[] getTempDouble3Array() { return null; }
        public static int HSLToColor(float[] p0) { return 0; }
        public static void colorToHSL(int p0, float[] p1) {}
        public static void RGBToHSL(int p0, int p1, int p2, float[] p3) {}
    }
}
