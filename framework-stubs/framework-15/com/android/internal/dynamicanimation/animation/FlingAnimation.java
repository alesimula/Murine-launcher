package com.android.internal.dynamicanimation.animation;

public final class FlingAnimation extends com.android.internal.dynamicanimation.animation.DynamicAnimation<com.android.internal.dynamicanimation.animation.FlingAnimation> {
    public FlingAnimation(com.android.internal.dynamicanimation.animation.FloatValueHolder p0) { super((com.android.internal.dynamicanimation.animation.FloatValueHolder)null); }
    public com.android.internal.dynamicanimation.animation.FlingAnimation setFriction(float p0) { return null; }
    public float getFriction() { return 0.0f; }
    public com.android.internal.dynamicanimation.animation.FlingAnimation setMinValue(float p0) { return null; }
    public com.android.internal.dynamicanimation.animation.FlingAnimation setMaxValue(float p0) { return null; }
    public com.android.internal.dynamicanimation.animation.FlingAnimation setStartVelocity(float p0) { return null; }
    boolean updateValueAndVelocity(long p0) { return false; }
    float getAcceleration(float p0, float p1) { return 0.0f; }
    boolean isAtEquilibrium(float p0, float p1) { return false; }
    void setValueThreshold(float p0) {}

    private static final class DragForce implements com.android.internal.dynamicanimation.animation.Force {
        void setFrictionScalar(float p0) {}
        float getFrictionScalar() { return 0.0f; }
        com.android.internal.dynamicanimation.animation.DynamicAnimation.MassState updateValueAndVelocity(float p0, float p1, long p2) { return null; }
        public float getAcceleration(float p0, float p1) { return 0.0f; }
        public boolean isAtEquilibrium(float p0, float p1) { return false; }
        void setValueThreshold(float p0) {}
    }
}
