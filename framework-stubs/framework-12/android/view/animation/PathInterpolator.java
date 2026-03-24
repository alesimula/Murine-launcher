package android.view.animation;

@android.graphics.animation.HasNativeInterpolator
public class PathInterpolator extends android.view.animation.BaseInterpolator implements android.graphics.animation.NativeInterpolator {
    private static final float PRECISION = 0.0020000000949949026f;
    private float[] mX;
    private float[] mY;
    public PathInterpolator(android.graphics.Path p0) { super(); }
    public PathInterpolator(float p0, float p1) { super(); }
    public PathInterpolator(float p0, float p1, float p2, float p3) { super(); }
    public PathInterpolator(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public PathInterpolator(android.content.res.Resources p0, android.content.res.Resources.Theme p1, android.util.AttributeSet p2) { super(); }
    private void parseInterpolatorFromTypeArray(android.content.res.TypedArray p0) {}
    private void initQuad(float p0, float p1) {}
    private void initCubic(float p0, float p1, float p2, float p3) {}
    private void initPath(android.graphics.Path p0) {}
    public float getInterpolation(float p0) { return 0.0f; }
    public long createNativeInterpolator() { return 0L; }
}
