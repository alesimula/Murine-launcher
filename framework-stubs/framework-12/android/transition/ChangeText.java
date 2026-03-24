package android.transition;

public class ChangeText extends android.transition.Transition {
    private static final java.lang.String LOG_TAG = "TextChange";
    private static final java.lang.String PROPNAME_TEXT = "android:textchange:text";
    private static final java.lang.String PROPNAME_TEXT_SELECTION_START = "android:textchange:textSelectionStart";
    private static final java.lang.String PROPNAME_TEXT_SELECTION_END = "android:textchange:textSelectionEnd";
    private static final java.lang.String PROPNAME_TEXT_COLOR = "android:textchange:textColor";
    private int mChangeBehavior;
    public static final int CHANGE_BEHAVIOR_KEEP = 0;
    public static final int CHANGE_BEHAVIOR_OUT = 1;
    public static final int CHANGE_BEHAVIOR_IN = 2;
    public static final int CHANGE_BEHAVIOR_OUT_IN = 3;
    private static final java.lang.String[] sTransitionProperties = null;
    public ChangeText() { super(); }
    public android.transition.ChangeText setChangeBehavior(int p0) { return null; }
    public java.lang.String[] getTransitionProperties() { return null; }
    public int getChangeBehavior() { return 0; }
    private void captureValues(android.transition.TransitionValues p0) {}
    public void captureStartValues(android.transition.TransitionValues p0) {}
    public void captureEndValues(android.transition.TransitionValues p0) {}
    public android.animation.Animator createAnimator(android.view.ViewGroup p0, android.transition.TransitionValues p1, android.transition.TransitionValues p2) { return null; }
    private void setSelection(android.widget.EditText p0, int p1, int p2) {}
}
