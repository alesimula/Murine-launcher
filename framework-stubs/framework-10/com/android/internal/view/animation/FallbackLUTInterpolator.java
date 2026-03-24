package com.android.internal.view.animation;

@com.android.internal.view.animation.HasNativeInterpolator
public class FallbackLUTInterpolator implements com.android.internal.view.animation.NativeInterpolatorFactory, android.animation.TimeInterpolator {
    private static final int MAX_SAMPLE_POINTS = 300;
    private android.animation.TimeInterpolator mSourceInterpolator;
    private final float[] mLut = null;
    public FallbackLUTInterpolator(android.animation.TimeInterpolator p0, long p1) {}
    private static float[] createLUT(android.animation.TimeInterpolator p0, long p1) { return null; }
    public long createNativeInterpolator() { return 0L; }
    public static long createNativeInterpolator(android.animation.TimeInterpolator p0, long p1) { return 0L; }
    public float getInterpolation(float p0) { return 0.0f; }
}
