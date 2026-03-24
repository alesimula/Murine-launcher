package android.transition;

public class ChangeBounds extends android.transition.Transition {
    int[] tempLocation;
    boolean mResizeClip;
    boolean mReparent;
    public ChangeBounds() { super(); }
    public ChangeBounds(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public java.lang.String[] getTransitionProperties() { return null; }
    public void setResizeClip(boolean p0) {}
    public boolean getResizeClip() { return false; }
    @java.lang.Deprecated
    public void setReparent(boolean p0) {}
    public void captureStartValues(android.transition.TransitionValues p0) {}
    public void captureEndValues(android.transition.TransitionValues p0) {}
    public android.animation.Animator createAnimator(android.view.ViewGroup p0, android.transition.TransitionValues p1, android.transition.TransitionValues p2) { return null; }

    private static class ViewBounds {
        public ViewBounds(android.view.View p0) {}
        public void setTopLeft(android.graphics.PointF p0) {}
        public void setBottomRight(android.graphics.PointF p0) {}
    }
}
