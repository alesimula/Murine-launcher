package android.transition;

public class ChangeTransform extends android.transition.Transition {
    private static final java.lang.String TAG = "ChangeTransform";
    private static final java.lang.String PROPNAME_MATRIX = "android:changeTransform:matrix";
    private static final java.lang.String PROPNAME_TRANSFORMS = "android:changeTransform:transforms";
    private static final java.lang.String PROPNAME_PARENT = "android:changeTransform:parent";
    private static final java.lang.String PROPNAME_PARENT_MATRIX = "android:changeTransform:parentMatrix";
    private static final java.lang.String PROPNAME_INTERMEDIATE_PARENT_MATRIX = "android:changeTransform:intermediateParentMatrix";
    private static final java.lang.String PROPNAME_INTERMEDIATE_MATRIX = "android:changeTransform:intermediateMatrix";
    private static final java.lang.String[] sTransitionProperties = null;
    private static final android.util.Property<android.transition.ChangeTransform.PathAnimatorMatrix, float[]> NON_TRANSLATIONS_PROPERTY = null;
    private static final android.util.Property<android.transition.ChangeTransform.PathAnimatorMatrix, android.graphics.PointF> TRANSLATIONS_PROPERTY = null;
    private boolean mUseOverlay;
    private boolean mReparent;
    private android.graphics.Matrix mTempMatrix;
    public ChangeTransform() { super(); }
    public ChangeTransform(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public boolean getReparentWithOverlay() { return false; }
    public void setReparentWithOverlay(boolean p0) {}
    public boolean getReparent() { return false; }
    public void setReparent(boolean p0) {}
    public java.lang.String[] getTransitionProperties() { return null; }
    private void captureValues(android.transition.TransitionValues p0) {}
    public void captureStartValues(android.transition.TransitionValues p0) {}
    public void captureEndValues(android.transition.TransitionValues p0) {}
    public android.animation.Animator createAnimator(android.view.ViewGroup p0, android.transition.TransitionValues p1, android.transition.TransitionValues p2) { return null; }
    private android.animation.ObjectAnimator createTransformAnimator(android.transition.TransitionValues p0, android.transition.TransitionValues p1, boolean p2) { return null; }
    private boolean parentsMatch(android.view.ViewGroup p0, android.view.ViewGroup p1) { return false; }
    private void createGhostView(android.view.ViewGroup p0, android.transition.TransitionValues p1, android.transition.TransitionValues p2) {}
    private void setMatricesForParent(android.transition.TransitionValues p0, android.transition.TransitionValues p1) {}
    private static void setIdentityTransforms(android.view.View p0) {}
    private static void setTransforms(android.view.View p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8) {}

    private static class Transforms {
        public final float translationX = 0.0f;
        public final float translationY = 0.0f;
        public final float translationZ = 0.0f;
        public final float scaleX = 0.0f;
        public final float scaleY = 0.0f;
        public final float rotationX = 0.0f;
        public final float rotationY = 0.0f;
        public final float rotationZ = 0.0f;
        public Transforms(android.view.View p0) {}
        public void restore(android.view.View p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
    }

    private static class PathAnimatorMatrix {
        private final android.graphics.Matrix mMatrix = null;
        private final android.view.View mView = null;
        private final float[] mValues = null;
        private float mTranslationX;
        private float mTranslationY;
        public PathAnimatorMatrix(android.view.View p0, float[] p1) {}
        public void setValues(float[] p0) {}
        public void setTranslation(android.graphics.PointF p0) {}
        private void setAnimationMatrix() {}
        public android.graphics.Matrix getMatrix() { return null; }
    }

    private static class GhostListener extends android.transition.TransitionListenerAdapter {
        private android.view.View mView;
        private android.view.View mStartView;
        private android.view.GhostView mGhostView;
        public GhostListener(android.view.View p0, android.view.View p1, android.view.GhostView p2) { super(); }
        public void onTransitionEnd(android.transition.Transition p0) {}
        public void onTransitionPause(android.transition.Transition p0) {}
        public void onTransitionResume(android.transition.Transition p0) {}
    }
}
