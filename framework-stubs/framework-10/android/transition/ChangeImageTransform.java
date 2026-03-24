package android.transition;

public class ChangeImageTransform extends android.transition.Transition {
    private static final java.lang.String TAG = "ChangeImageTransform";
    private static final java.lang.String PROPNAME_MATRIX = "android:changeImageTransform:matrix";
    private static final java.lang.String PROPNAME_BOUNDS = "android:changeImageTransform:bounds";
    private static final java.lang.String[] sTransitionProperties = null;
    private static android.animation.TypeEvaluator<android.graphics.Matrix> NULL_MATRIX_EVALUATOR;
    private static android.util.Property<android.widget.ImageView, android.graphics.Matrix> ANIMATED_TRANSFORM_PROPERTY;
    public ChangeImageTransform() { super(); }
    public ChangeImageTransform(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    private void captureValues(android.transition.TransitionValues p0) {}
    public void captureStartValues(android.transition.TransitionValues p0) {}
    public void captureEndValues(android.transition.TransitionValues p0) {}
    public java.lang.String[] getTransitionProperties() { return null; }
    public android.animation.Animator createAnimator(android.view.ViewGroup p0, android.transition.TransitionValues p1, android.transition.TransitionValues p2) { return null; }
    private android.animation.ObjectAnimator createNullAnimator(android.widget.ImageView p0) { return null; }
    private android.animation.ObjectAnimator createMatrixAnimator(android.widget.ImageView p0, android.graphics.Matrix p1, android.graphics.Matrix p2) { return null; }
}
