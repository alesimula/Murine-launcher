package android.view.animation;

@com.android.internal.view.animation.HasNativeInterpolator
public class CycleInterpolator extends android.view.animation.BaseInterpolator implements com.android.internal.view.animation.NativeInterpolatorFactory {
    private float mCycles;
    public CycleInterpolator(float p0) { super(); }
    public CycleInterpolator(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public CycleInterpolator(android.content.res.Resources p0, android.content.res.Resources.Theme p1, android.util.AttributeSet p2) { super(); }
    public float getInterpolation(float p0) { return 0.0f; }
    public long createNativeInterpolator() { return 0L; }
}
