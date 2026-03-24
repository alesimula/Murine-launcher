package android.graphics;

public class SweepGradient extends android.graphics.Shader {
    @android.annotation.UnsupportedAppUsage
    private float mCx;
    @android.annotation.UnsupportedAppUsage
    private float mCy;
    @android.annotation.UnsupportedAppUsage
    private float[] mPositions;
    @android.annotation.UnsupportedAppUsage
    private int[] mColors;
    @android.annotation.UnsupportedAppUsage
    private int mColor0;
    @android.annotation.UnsupportedAppUsage
    private int mColor1;
    private final long[] mColorLongs = null;
    public SweepGradient(float p0, float p1, int[] p2, float[] p3) { super(); }
    public SweepGradient(float p0, float p1, long[] p2, float[] p3) { super(); }
    private SweepGradient(float p0, float p1, long[] p2, float[] p3, android.graphics.ColorSpace p4) { super(); }
    public SweepGradient(float p0, float p1, int p2, int p3) { super(); }
    public SweepGradient(float p0, float p1, long p2, long p3) { super(); }
    long createNativeInstance(long p0) { return 0L; }
    private static native long nativeCreate(long p0, float p1, float p2, long[] p3, float[] p4, long p5);
}
