package android.graphics;

public class LightingColorFilter extends android.graphics.ColorFilter {
    private int mMul;
    private int mAdd;
    public LightingColorFilter(int p0, int p1) { super(); }
    public int getColorMultiply() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setColorMultiply(int p0) {}
    public int getColorAdd() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setColorAdd(int p0) {}
    long createNativeInstance() { return 0L; }
    private static native long native_CreateLightingFilter(int p0, int p1);
}
