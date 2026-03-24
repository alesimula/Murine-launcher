package android.graphics.drawable;

public final class RippleAnimationSession {
    RippleAnimationSession(android.graphics.drawable.RippleAnimationSession.AnimationProperties<java.lang.Float, android.graphics.Paint> p0, boolean p1) {}
    boolean isForceSoftware() { return false; }
    @android.annotation.NonNull
    android.graphics.drawable.RippleAnimationSession enter(android.graphics.Canvas p0) { return null; }
    void end() {}
    @android.annotation.NonNull
    android.graphics.drawable.RippleAnimationSession exit(android.graphics.Canvas p0) { return null; }
    @android.annotation.NonNull
    android.graphics.drawable.RippleAnimationSession setOnSessionEnd(java.util.function.Consumer<android.graphics.drawable.RippleAnimationSession> p0) { return null; }
    android.graphics.drawable.RippleAnimationSession setOnAnimationUpdated(java.lang.Runnable p0) { return null; }
    android.graphics.drawable.RippleAnimationSession setForceSoftwareAnimation(boolean p0) { return null; }
    void setRadius(float p0) {}
    @android.annotation.NonNull
    android.graphics.drawable.RippleAnimationSession.AnimationProperties<java.lang.Float, android.graphics.Paint> getProperties() { return null; }
    @android.annotation.NonNull
    android.graphics.drawable.RippleAnimationSession.AnimationProperties<android.graphics.CanvasProperty<java.lang.Float>, android.graphics.CanvasProperty<android.graphics.Paint>> getCanvasProperties() { return null; }

    static class AnimationProperties<FloatType extends java.lang.Object, PaintType extends java.lang.Object> {
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
        AnimatorListener(android.graphics.drawable.RippleAnimationSession p0) {}
        public void onAnimationStart(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationRepeat(android.animation.Animator p0) {}
    }
}
