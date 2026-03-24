package android.graphics.animation;

@android.graphics.animation.HasNativeInterpolator
public class FallbackLUTInterpolator implements android.graphics.animation.NativeInterpolator, android.animation.TimeInterpolator {
    public FallbackLUTInterpolator(android.animation.TimeInterpolator p0, long p1) {}
    public long createNativeInterpolator() { return 0L; }
    public static long createNativeInterpolator(android.animation.TimeInterpolator p0, long p1) { return 0L; }
    public float getInterpolation(float p0) { return 0.0f; }
}
