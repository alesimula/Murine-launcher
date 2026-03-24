package android.transition;

public class Crossfade extends android.transition.Transition {
    public static final int FADE_BEHAVIOR_CROSSFADE = 0;
    public static final int FADE_BEHAVIOR_REVEAL = 1;
    public static final int FADE_BEHAVIOR_OUT_IN = 2;
    public static final int RESIZE_BEHAVIOR_NONE = 0;
    public static final int RESIZE_BEHAVIOR_SCALE = 1;
    public Crossfade() { super(); }
    public android.transition.Crossfade setFadeBehavior(int p0) { return null; }
    public int getFadeBehavior() { return 0; }
    public android.transition.Crossfade setResizeBehavior(int p0) { return null; }
    public int getResizeBehavior() { return 0; }
    public android.animation.Animator createAnimator(android.view.ViewGroup p0, android.transition.TransitionValues p1, android.transition.TransitionValues p2) { return null; }
    public void captureStartValues(android.transition.TransitionValues p0) {}
    public void captureEndValues(android.transition.TransitionValues p0) {}
}
