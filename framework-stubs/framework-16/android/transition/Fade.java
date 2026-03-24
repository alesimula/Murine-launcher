package android.transition;

public class Fade extends android.transition.Visibility {
    static final java.lang.String PROPNAME_TRANSITION_ALPHA = "android:fade:transitionAlpha";
    public static final int IN = 1;
    public static final int OUT = 2;
    public Fade() { super(); }
    public Fade(int p0) { super(); }
    public Fade(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public void captureStartValues(android.transition.TransitionValues p0) {}
    public android.animation.Animator onAppear(android.view.ViewGroup p0, android.view.View p1, android.transition.TransitionValues p2, android.transition.TransitionValues p3) { return null; }
    public android.animation.Animator onDisappear(android.view.ViewGroup p0, android.view.View p1, android.transition.TransitionValues p2, android.transition.TransitionValues p3) { return null; }

    private static class FadeAnimatorListener extends android.animation.AnimatorListenerAdapter {
        public FadeAnimatorListener(android.view.View p0) { super(); }
        public void onAnimationStart(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
    }
}
