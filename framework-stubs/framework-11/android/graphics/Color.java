package android.graphics;

public class Color {
    public static final int BLACK = -16777216;
    public static final int DKGRAY = -12303292;
    public static final int GRAY = -7829368;
    public static final int LTGRAY = -3355444;
    public static final int WHITE = -1;
    public static final int RED = -65536;
    public static final int GREEN = -16711936;
    public static final int BLUE = -16776961;
    public static final int YELLOW = -256;
    public static final int CYAN = -16711681;
    public static final int MAGENTA = -65281;
    public static final int TRANSPARENT = 0;
    private final float[] mComponents = null;
    private final android.graphics.ColorSpace mColorSpace = null;
    private static final java.util.HashMap<java.lang.String, java.lang.Integer> sColorNameMap = null;
    public Color() {}
    private Color(float p0, float p1, float p2, float p3) {}
    private Color(float p0, float p1, float p2, float p3, android.graphics.ColorSpace p4) {}
    private Color(float[] p0, android.graphics.ColorSpace p1) {}
    public android.graphics.ColorSpace getColorSpace() { return null; }
    public android.graphics.ColorSpace.Model getModel() { return null; }
    public boolean isWideGamut() { return false; }
    public boolean isSrgb() { return false; }
    public int getComponentCount() { return 0; }
    public long pack() { return 0L; }
    public android.graphics.Color convert(android.graphics.ColorSpace p0) { return null; }
    public int toArgb() { return 0; }
    public float red() { return 0.0f; }
    public float green() { return 0.0f; }
    public float blue() { return 0.0f; }
    public float alpha() { return 0.0f; }
    public float[] getComponents() { return null; }
    public float[] getComponents(float[] p0) { return null; }
    public float getComponent(int p0) { return 0.0f; }
    public float luminance() { return 0.0f; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public static android.graphics.ColorSpace colorSpace(long p0) { return null; }
    public static float red(long p0) { return 0.0f; }
    public static float green(long p0) { return 0.0f; }
    public static float blue(long p0) { return 0.0f; }
    public static float alpha(long p0) { return 0.0f; }
    public static boolean isSrgb(long p0) { return false; }
    public static boolean isWideGamut(long p0) { return false; }
    public static boolean isInColorSpace(long p0, android.graphics.ColorSpace p1) { return false; }
    public static int toArgb(long p0) { return 0; }
    public static android.graphics.Color valueOf(int p0) { return null; }
    public static android.graphics.Color valueOf(long p0) { return null; }
    public static android.graphics.Color valueOf(float p0, float p1, float p2) { return null; }
    public static android.graphics.Color valueOf(float p0, float p1, float p2, float p3) { return null; }
    public static android.graphics.Color valueOf(float p0, float p1, float p2, float p3, android.graphics.ColorSpace p4) { return null; }
    public static android.graphics.Color valueOf(float[] p0, android.graphics.ColorSpace p1) { return null; }
    public static long pack(int p0) { return 0L; }
    public static long pack(float p0, float p1, float p2) { return 0L; }
    public static long pack(float p0, float p1, float p2, float p3) { return 0L; }
    public static long pack(float p0, float p1, float p2, float p3, android.graphics.ColorSpace p4) { return 0L; }
    public static long convert(int p0, android.graphics.ColorSpace p1) { return 0L; }
    public static long convert(long p0, android.graphics.ColorSpace p1) { return 0L; }
    public static long convert(float p0, float p1, float p2, float p3, android.graphics.ColorSpace p4, android.graphics.ColorSpace p5) { return 0L; }
    public static long convert(long p0, android.graphics.ColorSpace.Connector p1) { return 0L; }
    public static long convert(float p0, float p1, float p2, float p3, android.graphics.ColorSpace.Connector p4) { return 0L; }
    public static float luminance(long p0) { return 0.0f; }
    private static float saturate(float p0) { return 0.0f; }
    public static int alpha(int p0) { return 0; }
    public static int red(int p0) { return 0; }
    public static int green(int p0) { return 0; }
    public static int blue(int p0) { return 0; }
    public static int rgb(int p0, int p1, int p2) { return 0; }
    public static int rgb(float p0, float p1, float p2) { return 0; }
    public static int argb(int p0, int p1, int p2, int p3) { return 0; }
    public static int argb(float p0, float p1, float p2, float p3) { return 0; }
    public static float luminance(int p0) { return 0.0f; }
    public static int parseColor(java.lang.String p0) { return 0; }
    public static void RGBToHSV(int p0, int p1, int p2, float[] p3) {}
    public static void colorToHSV(int p0, float[] p1) {}
    public static int HSVToColor(float[] p0) { return 0; }
    public static int HSVToColor(int p0, float[] p1) { return 0; }
    private static native void nativeRGBToHSV(int p0, int p1, int p2, float[] p3);
    private static native int nativeHSVToColor(int p0, float[] p1);
    public static int getHtmlColor(java.lang.String p0) { return 0; }
}
