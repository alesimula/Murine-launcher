package com.android.internal.dynamicanimation.animation;

public abstract class DynamicAnimation<T extends com.android.internal.dynamicanimation.animation.DynamicAnimation<T>> implements android.animation.AnimationHandler.AnimationFrameCallback {
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty TRANSLATION_X = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty TRANSLATION_Y = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty TRANSLATION_Z = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty SCALE_X = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty SCALE_Y = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty ROTATION = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty ROTATION_X = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty ROTATION_Y = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty X = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty Y = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty Z = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty ALPHA = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty SCROLL_X = null;
    public static final com.android.internal.dynamicanimation.animation.DynamicAnimation.ViewProperty SCROLL_Y = null;
    @android.annotation.SuppressLint("MinMaxConstant")
    public static final float MIN_VISIBLE_CHANGE_PIXELS = 1.0f;
    @android.annotation.SuppressLint("MinMaxConstant")
    public static final float MIN_VISIBLE_CHANGE_ROTATION_DEGREES = 0.10000000149011612f;
    @android.annotation.SuppressLint("MinMaxConstant")
    public static final float MIN_VISIBLE_CHANGE_ALPHA = 0.00390625f;
    @android.annotation.SuppressLint("MinMaxConstant")
    public static final float MIN_VISIBLE_CHANGE_SCALE = 0.0020000000949949026f;
    float mVelocity;
    float mValue;
    boolean mStartValueIsSet;
    final java.lang.Object mTarget = null;
    final android.util.FloatProperty mProperty = null;
    boolean mRunning;
    float mMaxValue;
    float mMinValue;
    DynamicAnimation(com.android.internal.dynamicanimation.animation.FloatValueHolder p0) {}
    <K extends java.lang.Object> DynamicAnimation(K p0, android.util.FloatProperty<K> p1) {}
    public T setStartValue(float p0) { return null; }
    public T setStartVelocity(float p0) { return null; }
    public T setMaxValue(float p0) { return null; }
    public T setMinValue(float p0) { return null; }
    public T addEndListener(com.android.internal.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener p0) { return null; }
    public void removeEndListener(com.android.internal.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener p0) {}
    public T addUpdateListener(com.android.internal.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener p0) { return null; }
    public void removeUpdateListener(com.android.internal.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener p0) {}
    public T setMinimumVisibleChange(float p0) { return null; }
    public float getMinimumVisibleChange() { return 0.0f; }
    public void start() {}
    boolean isCurrentThread() { return false; }
    public void cancel() {}
    public boolean isRunning() { return false; }
    public boolean doAnimationFrame(long p0) { return false; }
    public void commitAnimationFrame(long p0) {}
    abstract boolean updateValueAndVelocity(long p0);
    void setPropertyValue(float p0) {}
    float getValueThreshold() { return 0.0f; }
    @android.annotation.NonNull
    public android.animation.AnimationHandler getAnimationHandler() { return null; }
    abstract float getAcceleration(float p0, float p1);
    abstract boolean isAtEquilibrium(float p0, float p1);
    abstract void setValueThreshold(float p0);

    static class MassState {
        float mValue;
        float mVelocity;
        MassState() {}
    }

    public static interface OnAnimationEndListener {
        public void onAnimationEnd(com.android.internal.dynamicanimation.animation.DynamicAnimation p0, boolean p1, float p2, float p3);
    }

    public static interface OnAnimationUpdateListener {
        public void onAnimationUpdate(com.android.internal.dynamicanimation.animation.DynamicAnimation p0, float p1, float p2);
    }

    public static abstract class ViewProperty extends android.util.FloatProperty<android.view.View> {
        ViewProperty() { super(null); }
    }
}
