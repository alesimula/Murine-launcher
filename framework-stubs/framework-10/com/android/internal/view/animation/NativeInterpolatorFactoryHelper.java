package com.android.internal.view.animation;

public final class NativeInterpolatorFactoryHelper {
    private NativeInterpolatorFactoryHelper() {}
    public static native long createAccelerateDecelerateInterpolator();
    public static native long createAccelerateInterpolator(float p0);
    public static native long createAnticipateInterpolator(float p0);
    public static native long createAnticipateOvershootInterpolator(float p0);
    public static native long createBounceInterpolator();
    public static native long createCycleInterpolator(float p0);
    public static native long createDecelerateInterpolator(float p0);
    public static native long createLinearInterpolator();
    public static native long createOvershootInterpolator(float p0);
    public static native long createPathInterpolator(float[] p0, float[] p1);
    public static native long createLutInterpolator(float[] p0);
}
