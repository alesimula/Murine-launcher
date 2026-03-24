package android.graphics;

public class PorterDuffColorFilter extends android.graphics.ColorFilter {
    private int mColor;
    private android.graphics.PorterDuff.Mode mMode;
    public PorterDuffColorFilter(int p0, android.graphics.PorterDuff.Mode p1) { super(); }
    public int getColor() { return 0; }
    public android.graphics.PorterDuff.Mode getMode() { return null; }
    long createNativeInstance() { return 0L; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    private static native long native_CreateBlendModeFilter(int p0, int p1);
}
