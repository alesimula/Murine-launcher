package android.graphics;

public class LinearGradient extends android.graphics.Shader {
    @android.annotation.UnsupportedAppUsage
    private float mX0;
    @android.annotation.UnsupportedAppUsage
    private float mY0;
    @android.annotation.UnsupportedAppUsage
    private float mX1;
    @android.annotation.UnsupportedAppUsage
    private float mY1;
    @android.annotation.UnsupportedAppUsage
    private float[] mPositions;
    @android.annotation.UnsupportedAppUsage
    private android.graphics.Shader.TileMode mTileMode;
    @android.annotation.UnsupportedAppUsage
    private int[] mColors;
    @android.annotation.UnsupportedAppUsage
    private int mColor0;
    @android.annotation.UnsupportedAppUsage
    private int mColor1;
    private final long[] mColorLongs = null;
    public LinearGradient(float p0, float p1, float p2, float p3, int[] p4, float[] p5, android.graphics.Shader.TileMode p6) { super(); }
    public LinearGradient(float p0, float p1, float p2, float p3, long[] p4, float[] p5, android.graphics.Shader.TileMode p6) { super(); }
    private LinearGradient(float p0, float p1, float p2, float p3, long[] p4, float[] p5, android.graphics.Shader.TileMode p6, android.graphics.ColorSpace p7) { super(); }
    public LinearGradient(float p0, float p1, float p2, float p3, int p4, int p5, android.graphics.Shader.TileMode p6) { super(); }
    public LinearGradient(float p0, float p1, float p2, float p3, long p4, long p5, android.graphics.Shader.TileMode p6) { super(); }
    long createNativeInstance(long p0) { return 0L; }
    private native long nativeCreate(long p0, float p1, float p2, float p3, float p4, long[] p5, float[] p6, int p7, long p8);
}
