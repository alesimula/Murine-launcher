package com.android.internal.dynamicanimation.animation;

interface Force {
    public float getAcceleration(float p0, float p1);
    public boolean isAtEquilibrium(float p0, float p1);
}
