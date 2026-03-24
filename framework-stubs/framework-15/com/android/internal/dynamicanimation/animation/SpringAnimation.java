package com.android.internal.dynamicanimation.animation;

public final class SpringAnimation extends com.android.internal.dynamicanimation.animation.DynamicAnimation<com.android.internal.dynamicanimation.animation.SpringAnimation> {
    public SpringAnimation(com.android.internal.dynamicanimation.animation.FloatValueHolder p0) { super((com.android.internal.dynamicanimation.animation.FloatValueHolder)null); }
    public SpringAnimation(com.android.internal.dynamicanimation.animation.FloatValueHolder p0, float p1) { super((com.android.internal.dynamicanimation.animation.FloatValueHolder)null); }
    public <K extends java.lang.Object> SpringAnimation(K p0, android.util.FloatProperty<K> p1) { super((com.android.internal.dynamicanimation.animation.FloatValueHolder)null); }
    public <K extends java.lang.Object> SpringAnimation(K p0, android.util.FloatProperty<K> p1, float p2) { super((com.android.internal.dynamicanimation.animation.FloatValueHolder)null); }
    public com.android.internal.dynamicanimation.animation.SpringForce getSpring() { return null; }
    public com.android.internal.dynamicanimation.animation.SpringAnimation setSpring(com.android.internal.dynamicanimation.animation.SpringForce p0) { return null; }
    public void start() {}
    public void animateToFinalPosition(float p0) {}
    public void cancel() {}
    public void skipToEnd() {}
    public boolean canSkipToEnd() { return false; }
    boolean updateValueAndVelocity(long p0) { return false; }
    float getAcceleration(float p0, float p1) { return 0.0f; }
    boolean isAtEquilibrium(float p0, float p1) { return false; }
    void setValueThreshold(float p0) {}
}
