package com.android.internal.widget;

public abstract class AutoScrollHelper implements android.view.View.OnTouchListener {
    public static final float RELATIVE_UNSPECIFIED = 0.0f;
    public static final float NO_MAX = 3.4028234663852886e+38f;
    public static final float NO_MIN = 0.0f;
    public static final int EDGE_TYPE_INSIDE = 0;
    public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
    public static final int EDGE_TYPE_OUTSIDE = 2;
    public AutoScrollHelper(android.view.View p0) {}
    public com.android.internal.widget.AutoScrollHelper setEnabled(boolean p0) { return null; }
    public boolean isEnabled() { return false; }
    public com.android.internal.widget.AutoScrollHelper setExclusive(boolean p0) { return null; }
    public boolean isExclusive() { return false; }
    public com.android.internal.widget.AutoScrollHelper setMaximumVelocity(float p0, float p1) { return null; }
    public com.android.internal.widget.AutoScrollHelper setMinimumVelocity(float p0, float p1) { return null; }
    public com.android.internal.widget.AutoScrollHelper setRelativeVelocity(float p0, float p1) { return null; }
    public com.android.internal.widget.AutoScrollHelper setEdgeType(int p0) { return null; }
    public com.android.internal.widget.AutoScrollHelper setRelativeEdges(float p0, float p1) { return null; }
    public com.android.internal.widget.AutoScrollHelper setMaximumEdges(float p0, float p1) { return null; }
    public com.android.internal.widget.AutoScrollHelper setActivationDelay(int p0) { return null; }
    public com.android.internal.widget.AutoScrollHelper setRampUpDuration(int p0) { return null; }
    public com.android.internal.widget.AutoScrollHelper setRampDownDuration(int p0) { return null; }
    public boolean onTouch(android.view.View p0, android.view.MotionEvent p1) { return false; }
    public abstract void scrollTargetBy(int p0, int p1);
    public abstract boolean canTargetScrollHorizontally(int p0);
    public abstract boolean canTargetScrollVertically(int p0);

    public static class AbsListViewAutoScroller extends com.android.internal.widget.AutoScrollHelper {
        public AbsListViewAutoScroller(android.widget.AbsListView p0) { super(null); }
        public void scrollTargetBy(int p0, int p1) {}
        public boolean canTargetScrollHorizontally(int p0) { return false; }
        public boolean canTargetScrollVertically(int p0) { return false; }
    }

    private static class ClampedScroller {
        public ClampedScroller() {}
        public void setRampUpDuration(int p0) {}
        public void setRampDownDuration(int p0) {}
        public void start() {}
        public void requestStop() {}
        public boolean isFinished() { return false; }
        public void computeScrollDelta() {}
        public void setTargetVelocity(float p0, float p1) {}
        public int getHorizontalDirection() { return 0; }
        public int getVerticalDirection() { return 0; }
        public int getDeltaX() { return 0; }
        public int getDeltaY() { return 0; }
    }

    private class ScrollAnimationRunnable implements java.lang.Runnable {
        public void run() {}
    }
}
