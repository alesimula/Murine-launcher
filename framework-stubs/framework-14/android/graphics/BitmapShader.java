package android.graphics;

public class BitmapShader extends android.graphics.Shader {
    android.graphics.Bitmap mBitmap;
    public static final int FILTER_MODE_DEFAULT = 0;
    public static final int FILTER_MODE_NEAREST = 1;
    public static final int FILTER_MODE_LINEAR = 2;
    public BitmapShader(android.graphics.Bitmap p0, android.graphics.Shader.TileMode p1, android.graphics.Shader.TileMode p2) { super(); }
    public int getFilterMode() { return 0; }
    public void setFilterMode(int p0) {}
    public void setMaxAnisotropy(int p0) {}
    public int getMaxAnisotropy() { return 0; }
    synchronized long getNativeInstanceWithDirectSampling() { return 0L; }
    protected long createNativeInstance(long p0, boolean p1) { return 0L; }
    protected boolean shouldDiscardNativeInstance(boolean p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FilterMode {
    }
}
