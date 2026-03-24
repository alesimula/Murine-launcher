package android.transition;

public class ChangeTransform extends android.transition.Transition {
    public ChangeTransform() { super(); }
    public ChangeTransform(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public boolean getReparentWithOverlay() { return false; }
    public void setReparentWithOverlay(boolean p0) {}
    public boolean getReparent() { return false; }
    public void setReparent(boolean p0) {}
    public java.lang.String[] getTransitionProperties() { return null; }
    public void captureStartValues(android.transition.TransitionValues p0) {}
    public void captureEndValues(android.transition.TransitionValues p0) {}
    public android.animation.Animator createAnimator(android.view.ViewGroup p0, android.transition.TransitionValues p1, android.transition.TransitionValues p2) { return null; }

    private static class GhostListener extends android.transition.TransitionListenerAdapter {
        public GhostListener(android.view.View p0, android.view.View p1, android.view.GhostView p2) { super(); }
        public void onTransitionEnd(android.transition.Transition p0) {}
        public void onTransitionPause(android.transition.Transition p0) {}
        public void onTransitionResume(android.transition.Transition p0) {}
    }

    private static class PathAnimatorMatrix {
        public PathAnimatorMatrix(android.view.View p0, float[] p1) {}
        public void setValues(float[] p0) {}
        public void setTranslation(android.graphics.PointF p0) {}
        public android.graphics.Matrix getMatrix() { return null; }
    }

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
}
