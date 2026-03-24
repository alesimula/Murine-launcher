package android.graphics;

public class RadialGradient extends android.graphics.Shader {
    @android.annotation.UnsupportedAppUsage
    private float mX;
    @android.annotation.UnsupportedAppUsage
    private float mY;
    @android.annotation.UnsupportedAppUsage
    private float mRadius;
    @android.annotation.UnsupportedAppUsage
    private float[] mPositions;
    @android.annotation.UnsupportedAppUsage
    private android.graphics.Shader.TileMode mTileMode;
    @android.annotation.UnsupportedAppUsage
    private int[] mColors;
    @android.annotation.UnsupportedAppUsage
    private int mCenterColor;
    @android.annotation.UnsupportedAppUsage
    private int mEdgeColor;
    private final long[] mColorLongs = null;
    public RadialGradient(float p0, float p1, float p2, int[] p3, float[] p4, android.graphics.Shader.TileMode p5) { super(); }
    public RadialGradient(float p0, float p1, float p2, long[] p3, float[] p4, android.graphics.Shader.TileMode p5) { super(); }
    private RadialGradient(float p0, float p1, float p2, long[] p3, float[] p4, android.graphics.Shader.TileMode p5, android.graphics.ColorSpace p6) { super(); }
    public RadialGradient(float p0, float p1, float p2, int p3, int p4, android.graphics.Shader.TileMode p5) { super(); }
    public RadialGradient(float p0, float p1, float p2, long p3, long p4, android.graphics.Shader.TileMode p5) { super(); }
    long createNativeInstance(long p0) { return 0L; }
    private static native long nativeCreate(long p0, float p1, float p2, float p3, long[] p4, float[] p5, int p6, long p7);
}
