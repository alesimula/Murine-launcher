package android.graphics.drawable;

public final class RippleAnimationSession {
    private static final java.lang.String TAG = "RippleAnimationSession";
    private static final int ENTER_ANIM_DURATION = 450;
    private static final int EXIT_ANIM_DURATION = 375;
    private static final long NOISE_ANIMATION_DURATION = 7000L;
    private static final long MAX_NOISE_PHASE = 32L;
    private static final android.animation.TimeInterpolator LINEAR_INTERPOLATOR = null;
    private static final android.view.animation.Interpolator FAST_OUT_SLOW_IN = null;
    private java.util.function.Consumer<android.graphics.drawable.RippleAnimationSession> mOnSessionEnd;
    private final android.graphics.drawable.RippleAnimationSession.AnimationProperties<java.lang.Float, android.graphics.Paint> mProperties = null;
    private android.graphics.drawable.RippleAnimationSession.AnimationProperties<android.graphics.CanvasProperty<java.lang.Float>, android.graphics.CanvasProperty<android.graphics.Paint>> mCanvasProperties;
    private java.lang.Runnable mOnUpdate;
    private long mStartTime;
    private boolean mForceSoftware;
    private android.animation.Animator mLoopAnimation;
    private android.animation.Animator mCurrentAnimation;
    RippleAnimationSession(android.graphics.drawable.RippleAnimationSession.AnimationProperties<java.lang.Float, android.graphics.Paint> p0, boolean p1) {}
    boolean isForceSoftware() { return false; }
    android.graphics.drawable.RippleAnimationSession enter(android.graphics.Canvas p0) { return null; }
    void end() {}
    android.graphics.drawable.RippleAnimationSession exit(android.graphics.Canvas p0) { return null; }
    private void onAnimationEnd(android.animation.Animator p0) {}
    android.graphics.drawable.RippleAnimationSession setOnSessionEnd(java.util.function.Consumer<android.graphics.drawable.RippleAnimationSession> p0) { return null; }
    android.graphics.drawable.RippleAnimationSession setOnAnimationUpdated(java.lang.Runnable p0) { return null; }
    private boolean useRTAnimations(android.graphics.Canvas p0) { return false; }
    private void exitSoftware() {}
    private long computeDelay() { return 0L; }
    private void notifyUpdate() {}
    android.graphics.drawable.RippleAnimationSession setForceSoftwareAnimation(boolean p0) { return null; }
    private void exitHardware(android.graphics.RecordingCanvas p0) {}
    private void enterHardware(android.graphics.RecordingCanvas p0) {}
    private void startAnimation(android.animation.Animator p0, android.animation.Animator p1) {}
    private void enterSoftware() {}
    void setRadius(float p0) {}
    android.graphics.drawable.RippleAnimationSession.AnimationProperties<java.lang.Float, android.graphics.Paint> getProperties() { return null; }
    android.graphics.drawable.RippleAnimationSession.AnimationProperties<android.graphics.CanvasProperty<java.lang.Float>, android.graphics.CanvasProperty<android.graphics.Paint>> getCanvasProperties() { return null; }

    static class AnimationProperties<FloatType extends java.lang.Object, PaintType extends java.lang.Object> {
        private final android.graphics.drawable.RippleShader mShader = null;
        private final int mColor = 0;
        AnimationProperties(FloatType p0, FloatType p1, FloatType p2, FloatType p3, PaintType p4, FloatType p5, int p6, android.graphics.drawable.RippleShader p7) {}
        FloatType getProgress() { return null; }
        void setRadius(FloatType p0) {}
        void setOrigin(FloatType p0, FloatType p1) {}
        FloatType getX() { return null; }
        FloatType getY() { return null; }
        FloatType getMaxRadius() { return null; }
        PaintType getPaint() { return null; }
        android.graphics.drawable.RippleShader getShader() { return null; }
        FloatType getNoisePhase() { return null; }
        int getColor() { return 0; }
    }

    private static class AnimatorListener implements android.animation.Animator.AnimatorListener {
        private final android.graphics.drawable.RippleAnimationSession mSession = null;
        AnimatorListener(android.graphics.drawable.RippleAnimationSession p0) {}
        public void onAnimationStart(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationRepeat(android.animation.Animator p0) {}
    }
}
