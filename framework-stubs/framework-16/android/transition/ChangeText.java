package android.transition;

public class ChangeText extends android.transition.Transition {
    public static final int CHANGE_BEHAVIOR_KEEP = 0;
    public static final int CHANGE_BEHAVIOR_OUT = 1;
    public static final int CHANGE_BEHAVIOR_IN = 2;
    public static final int CHANGE_BEHAVIOR_OUT_IN = 3;
    public ChangeText() { super(); }
    public android.transition.ChangeText setChangeBehavior(int p0) { return null; }
    public java.lang.String[] getTransitionProperties() { return null; }
    public int getChangeBehavior() { return 0; }
    public void captureStartValues(android.transition.TransitionValues p0) {}
    public void captureEndValues(android.transition.TransitionValues p0) {}
    @android.annotation.Nullable
    public android.animation.Animator createAnimator(android.view.ViewGroup p0, android.transition.TransitionValues p1, android.transition.TransitionValues p2) { return null; }
}
