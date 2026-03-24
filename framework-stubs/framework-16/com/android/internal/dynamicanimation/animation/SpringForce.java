package com.android.internal.dynamicanimation.animation;

public final class SpringForce implements com.android.internal.dynamicanimation.animation.Force {
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.20000000298023224f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    double mNaturalFreq;
    double mDampingRatio;
    public SpringForce() {}
    public SpringForce(float p0) {}
    public com.android.internal.dynamicanimation.animation.SpringForce setStiffness(float p0) { return null; }
    public float getStiffness() { return 0.0f; }
    public com.android.internal.dynamicanimation.animation.SpringForce setDampingRatio(float p0) { return null; }
    public float getDampingRatio() { return 0.0f; }
    public com.android.internal.dynamicanimation.animation.SpringForce setFinalPosition(float p0) { return null; }
    public float getFinalPosition() { return 0.0f; }
    public float getAcceleration(float p0, float p1) { return 0.0f; }
    public boolean isAtEquilibrium(float p0, float p1) { return false; }
    com.android.internal.dynamicanimation.animation.DynamicAnimation.MassState updateValues(double p0, double p1, long p2) { return null; }
    void setValueThreshold(double p0) {}
}
