package android.transition;

public class ChangeBounds extends android.transition.Transition {
    private static final java.lang.String PROPNAME_BOUNDS = "android:changeBounds:bounds";
    private static final java.lang.String PROPNAME_CLIP = "android:changeBounds:clip";
    private static final java.lang.String PROPNAME_PARENT = "android:changeBounds:parent";
    private static final java.lang.String PROPNAME_WINDOW_X = "android:changeBounds:windowX";
    private static final java.lang.String PROPNAME_WINDOW_Y = "android:changeBounds:windowY";
    private static final java.lang.String[] sTransitionProperties = null;
    private static final android.util.Property<android.graphics.drawable.Drawable, android.graphics.PointF> DRAWABLE_ORIGIN_PROPERTY = null;
    private static final android.util.Property<android.transition.ChangeBounds.ViewBounds, android.graphics.PointF> TOP_LEFT_PROPERTY = null;
    private static final android.util.Property<android.transition.ChangeBounds.ViewBounds, android.graphics.PointF> BOTTOM_RIGHT_PROPERTY = null;
    private static final android.util.Property<android.view.View, android.graphics.PointF> BOTTOM_RIGHT_ONLY_PROPERTY = null;
    private static final android.util.Property<android.view.View, android.graphics.PointF> TOP_LEFT_ONLY_PROPERTY = null;
    private static final android.util.Property<android.view.View, android.graphics.PointF> POSITION_PROPERTY = null;
    int[] tempLocation;
    boolean mResizeClip;
    boolean mReparent;
    private static final java.lang.String LOG_TAG = "ChangeBounds";
    private static android.animation.RectEvaluator sRectEvaluator;
    public ChangeBounds() { super(); }
    public ChangeBounds(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public java.lang.String[] getTransitionProperties() { return null; }
    public void setResizeClip(boolean p0) {}
    public boolean getResizeClip() { return false; }
    @java.lang.Deprecated
    public void setReparent(boolean p0) {}
    private void captureValues(android.transition.TransitionValues p0) {}
    public void captureStartValues(android.transition.TransitionValues p0) {}
    public void captureEndValues(android.transition.TransitionValues p0) {}
    private boolean parentMatches(android.view.View p0, android.view.View p1) { return false; }
    public android.animation.Animator createAnimator(android.view.ViewGroup p0, android.transition.TransitionValues p1, android.transition.TransitionValues p2) { return null; }

    private static class ViewBounds {
        private int mLeft;
        private int mTop;
        private int mRight;
        private int mBottom;
        private android.view.View mView;
        private int mTopLeftCalls;
        private int mBottomRightCalls;
        public ViewBounds(android.view.View p0) {}
        public void setTopLeft(android.graphics.PointF p0) {}
        public void setBottomRight(android.graphics.PointF p0) {}
        private void setLeftTopRightBottom() {}
    }
}
