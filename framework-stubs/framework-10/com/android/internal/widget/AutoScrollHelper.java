package com.android.internal.widget;

public abstract class AutoScrollHelper implements android.view.View.OnTouchListener {
    public static final float RELATIVE_UNSPECIFIED = 0.0f;
    public static final float NO_MAX = 3.4028234663852886e+38f;
    public static final float NO_MIN = 0.0f;
    public static final int EDGE_TYPE_INSIDE = 0;
    public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
    public static final int EDGE_TYPE_OUTSIDE = 2;
    private static final int HORIZONTAL = 0;
    private static final int VERTICAL = 1;
    private final com.android.internal.widget.AutoScrollHelper.ClampedScroller mScroller = null;
    private final android.view.animation.Interpolator mEdgeInterpolator = null;
    private final android.view.View mTarget = null;
    private java.lang.Runnable mRunnable;
    private float[] mRelativeEdges;
    private float[] mMaximumEdges;
    private int mEdgeType;
    private int mActivationDelay;
    private float[] mRelativeVelocity;
    private float[] mMinimumVelocity;
    private float[] mMaximumVelocity;
    private boolean mAlreadyDelayed;
    private boolean mNeedsReset;
    private boolean mNeedsCancel;
    private boolean mAnimating;
    private boolean mEnabled;
    private boolean mExclusive;
    private static final int DEFAULT_EDGE_TYPE = 1;
    private static final int DEFAULT_MINIMUM_VELOCITY_DIPS = 315;
    private static final int DEFAULT_MAXIMUM_VELOCITY_DIPS = 1575;
    private static final float DEFAULT_MAXIMUM_EDGE = 3.4028234663852886e+38f;
    private static final float DEFAULT_RELATIVE_EDGE = 0.20000000298023224f;
    private static final float DEFAULT_RELATIVE_VELOCITY = 1.0f;
    private static final int DEFAULT_ACTIVATION_DELAY = Integer.valueOf(0);
    private static final int DEFAULT_RAMP_UP_DURATION = 500;
    private static final int DEFAULT_RAMP_DOWN_DURATION = 500;
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
    private boolean shouldAnimate() { return false; }
    private void startAnimating() {}
    private void requestStop() {}
    private float computeTargetVelocity(int p0, float p1, float p2, float p3) { return 0.0f; }
    public abstract void scrollTargetBy(int p0, int p1);
    public abstract boolean canTargetScrollHorizontally(int p0);
    public abstract boolean canTargetScrollVertically(int p0);
    private float getEdgeValue(float p0, float p1, float p2, float p3) { return 0.0f; }
    private float constrainEdgeValue(float p0, float p1) { return 0.0f; }
    private static int constrain(int p0, int p1, int p2) { return 0; }
    private static float constrain(float p0, float p1, float p2) { return 0.0f; }
    private void cancelTargetTouch() {}

    private class ScrollAnimationRunnable implements java.lang.Runnable {
        private ScrollAnimationRunnable(com.android.internal.widget.AutoScrollHelper p0) {}
        public void run() {}
    }

    private static class ClampedScroller {
        private int mRampUpDuration;
        private int mRampDownDuration;
        private float mTargetVelocityX;
        private float mTargetVelocityY;
        private long mStartTime;
        private long mDeltaTime;
        private int mDeltaX;
        private int mDeltaY;
        private long mStopTime;
        private float mStopValue;
        private int mEffectiveRampDown;
        public ClampedScroller() {}
        public void setRampUpDuration(int p0) {}
        public void setRampDownDuration(int p0) {}
        public void start() {}
        public void requestStop() {}
        public boolean isFinished() { return false; }
        private float getValueAt(long p0) { return 0.0f; }
        private float interpolateValue(float p0) { return 0.0f; }
        public void computeScrollDelta() {}
        public void setTargetVelocity(float p0, float p1) {}
        public int getHorizontalDirection() { return 0; }
        public int getVerticalDirection() { return 0; }
        public int getDeltaX() { return 0; }
        public int getDeltaY() { return 0; }
    }

    public static class AbsListViewAutoScroller extends com.android.internal.widget.AutoScrollHelper {
        private final android.widget.AbsListView mTarget = null;
        public AbsListViewAutoScroller(android.widget.AbsListView p0) { super(null); }
        public void scrollTargetBy(int p0, int p1) {}
        public boolean canTargetScrollHorizontally(int p0) { return false; }
        public boolean canTargetScrollVertically(int p0) { return false; }
    }
}
