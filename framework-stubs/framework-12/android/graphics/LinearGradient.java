package android.graphics;

public class LinearGradient extends android.graphics.Shader {
    private float mX0;
    private float mY0;
    private float mX1;
    private float mY1;
    private float[] mPositions;
    private android.graphics.Shader.TileMode mTileMode;
    private int[] mColors;
    private int mColor0;
    private int mColor1;
    private final long[] mColorLongs = null;
    public LinearGradient(float p0, float p1, float p2, float p3, int[] p4, float[] p5, android.graphics.Shader.TileMode p6) { super(); }
    public LinearGradient(float p0, float p1, float p2, float p3, long[] p4, float[] p5, android.graphics.Shader.TileMode p6) { super(); }
    private LinearGradient(float p0, float p1, float p2, float p3, long[] p4, float[] p5, android.graphics.Shader.TileMode p6, android.graphics.ColorSpace p7) { super(); }
    public LinearGradient(float p0, float p1, float p2, float p3, int p4, int p5, android.graphics.Shader.TileMode p6) { super(); }
    public LinearGradient(float p0, float p1, float p2, float p3, long p4, long p5, android.graphics.Shader.TileMode p6) { super(); }
    protected long createNativeInstance(long p0, boolean p1) { return 0L; }
    private native long nativeCreate(long p0, float p1, float p2, float p3, float p4, long[] p5, float[] p6, int p7, long p8);
}
