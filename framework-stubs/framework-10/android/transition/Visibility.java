package android.transition;

public abstract class Visibility extends android.transition.Transition {
    static final java.lang.String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final java.lang.String PROPNAME_PARENT = "android:visibility:parent";
    private static final java.lang.String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final java.lang.String[] sTransitionProperties = null;
    private int mMode;
    private boolean mSuppressLayout;
    public Visibility() { super(); }
    public Visibility(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public void setSuppressLayout(boolean p0) {}
    public void setMode(int p0) {}
    public int getMode() { return 0; }
    public java.lang.String[] getTransitionProperties() { return null; }
    private void captureValues(android.transition.TransitionValues p0) {}
    public void captureStartValues(android.transition.TransitionValues p0) {}
    public void captureEndValues(android.transition.TransitionValues p0) {}
    public boolean isVisible(android.transition.TransitionValues p0) { return false; }
    private static android.transition.Visibility.VisibilityInfo getVisibilityChangeInfo(android.transition.TransitionValues p0, android.transition.TransitionValues p1) { return null; }
    public android.animation.Animator createAnimator(android.view.ViewGroup p0, android.transition.TransitionValues p1, android.transition.TransitionValues p2) { return null; }
    public android.animation.Animator onAppear(android.view.ViewGroup p0, android.transition.TransitionValues p1, int p2, android.transition.TransitionValues p3, int p4) { return null; }
    public android.animation.Animator onAppear(android.view.ViewGroup p0, android.view.View p1, android.transition.TransitionValues p2, android.transition.TransitionValues p3) { return null; }
    public android.animation.Animator onDisappear(android.view.ViewGroup p0, android.transition.TransitionValues p1, int p2, android.transition.TransitionValues p3, int p4) { return null; }
    public boolean isTransitionRequired(android.transition.TransitionValues p0, android.transition.TransitionValues p1) { return false; }
    public android.animation.Animator onDisappear(android.view.ViewGroup p0, android.view.View p1, android.transition.TransitionValues p2, android.transition.TransitionValues p3) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface VisibilityMode {
    }

    private static class VisibilityInfo {
        boolean visibilityChange;
        boolean fadeIn;
        int startVisibility;
        int endVisibility;
        android.view.ViewGroup startParent;
        android.view.ViewGroup endParent;
        private VisibilityInfo() {}
    }

    private static class DisappearListener extends android.transition.TransitionListenerAdapter implements android.animation.Animator.AnimatorListener, android.animation.Animator.AnimatorPauseListener {
        private final android.view.View mView = null;
        private final int mFinalVisibility = 0;
        private final android.view.ViewGroup mParent = null;
        private final boolean mSuppressLayout = false;
        private boolean mLayoutSuppressed;
        boolean mCanceled;
        public DisappearListener(android.view.View p0, int p1, boolean p2) { super(); }
        public void onAnimationPause(android.animation.Animator p0) {}
        public void onAnimationResume(android.animation.Animator p0) {}
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationRepeat(android.animation.Animator p0) {}
        public void onAnimationStart(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onTransitionEnd(android.transition.Transition p0) {}
        public void onTransitionPause(android.transition.Transition p0) {}
        public void onTransitionResume(android.transition.Transition p0) {}
        private void hideViewWhenNotCanceled() {}
        private void suppressLayout(boolean p0) {}
    }
}
