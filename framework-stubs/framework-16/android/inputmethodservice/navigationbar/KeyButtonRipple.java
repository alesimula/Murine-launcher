package android.inputmethodservice.navigationbar;

final class KeyButtonRipple extends android.graphics.drawable.Drawable {
    KeyButtonRipple(android.content.Context p0, android.view.View p1, int p2) { super(); }
    public void updateResources() {}
    public void setDarkIntensity(float p0) {}
    public void setDelayTouchFeedback(boolean p0) {}
    public void setType(android.inputmethodservice.navigationbar.KeyButtonRipple.Type p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public void setAlpha(int p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public int getOpacity() { return 0; }
    public float getGlowAlpha() { return 0.0f; }
    public void setGlowAlpha(float p0) {}
    public float getGlowScale() { return 0.0f; }
    public void setGlowScale(float p0) {}
    protected boolean onStateChange(int[] p0) { return false; }
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void jumpToCurrentState() {}
    public boolean isStateful() { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    public void setPressed(boolean p0) {}
    public void abortDelayedRipple() {}

    private static final class LogInterpolator implements android.view.animation.Interpolator {
        public float getInterpolation(float p0) { return 0.0f; }
    }

    private static final class TraceAnimatorListener extends android.animation.AnimatorListenerAdapter {
        TraceAnimatorListener(java.lang.String p0) { super(); }
        public void onAnimationStart(android.animation.Animator p0) {}
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
    }

    public static enum Type {
        OVAL,
        ROUNDED_RECT;
    }
}
