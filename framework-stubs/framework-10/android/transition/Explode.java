package android.transition;

public class Explode extends android.transition.Visibility {
    private static final android.animation.TimeInterpolator sDecelerate = null;
    private static final android.animation.TimeInterpolator sAccelerate = null;
    private static final java.lang.String TAG = "Explode";
    private static final java.lang.String PROPNAME_SCREEN_BOUNDS = "android:explode:screenBounds";
    private int[] mTempLoc;
    public Explode() { super(); }
    public Explode(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    private void captureValues(android.transition.TransitionValues p0) {}
    public void captureStartValues(android.transition.TransitionValues p0) {}
    public void captureEndValues(android.transition.TransitionValues p0) {}
    public android.animation.Animator onAppear(android.view.ViewGroup p0, android.view.View p1, android.transition.TransitionValues p2, android.transition.TransitionValues p3) { return null; }
    public android.animation.Animator onDisappear(android.view.ViewGroup p0, android.view.View p1, android.transition.TransitionValues p2, android.transition.TransitionValues p3) { return null; }
    private void calculateOut(android.view.View p0, android.graphics.Rect p1, int[] p2) {}
    private static double calculateMaxDistance(android.view.View p0, int p1, int p2) { return 0.0; }
}
