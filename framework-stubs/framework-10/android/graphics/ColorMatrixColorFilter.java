package android.graphics;

public class ColorMatrixColorFilter extends android.graphics.ColorFilter {
    @android.annotation.UnsupportedAppUsage
    private final android.graphics.ColorMatrix mMatrix = null;
    public ColorMatrixColorFilter(android.graphics.ColorMatrix p0) { super(); }
    public ColorMatrixColorFilter(float[] p0) { super(); }
    public void getColorMatrix(android.graphics.ColorMatrix p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setColorMatrix(android.graphics.ColorMatrix p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setColorMatrixArray(float[] p0) {}
    long createNativeInstance() { return 0L; }
    private static native long nativeColorMatrixFilter(float[] p0);
}
