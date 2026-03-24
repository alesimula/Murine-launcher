package android.widget;

public class OverScroller {
    private int mMode;
    private final android.widget.OverScroller.SplineOverScroller mScrollerX = null;
    @android.annotation.UnsupportedAppUsage
    private final android.widget.OverScroller.SplineOverScroller mScrollerY = null;
    @android.annotation.UnsupportedAppUsage
    private android.view.animation.Interpolator mInterpolator;
    private final boolean mFlywheel = false;
    private static final int DEFAULT_DURATION = 250;
    private static final int SCROLL_MODE = 0;
    private static final int FLING_MODE = 1;
    public OverScroller(android.content.Context p0) {}
    public OverScroller(android.content.Context p0, android.view.animation.Interpolator p1) {}
    @android.annotation.UnsupportedAppUsage
    public OverScroller(android.content.Context p0, android.view.animation.Interpolator p1, boolean p2) {}
    @java.lang.Deprecated
    public OverScroller(android.content.Context p0, android.view.animation.Interpolator p1, float p2, float p3) {}
    @java.lang.Deprecated
    public OverScroller(android.content.Context p0, android.view.animation.Interpolator p1, float p2, float p3, boolean p4) {}
    @android.annotation.UnsupportedAppUsage
    void setInterpolator(android.view.animation.Interpolator p0) {}
    public final void setFriction(float p0) {}
    public final boolean isFinished() { return false; }
    public final void forceFinished(boolean p0) {}
    public final int getCurrX() { return 0; }
    public final int getCurrY() { return 0; }
    public float getCurrVelocity() { return 0.0f; }
    public final int getStartX() { return 0; }
    public final int getStartY() { return 0; }
    public final int getFinalX() { return 0; }
    public final int getFinalY() { return 0; }
    @java.lang.Deprecated
    public final int getDuration() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void extendDuration(int p0) {}
    @java.lang.Deprecated
    public void setFinalX(int p0) {}
    @java.lang.Deprecated
    public void setFinalY(int p0) {}
    public boolean computeScrollOffset() { return false; }
    public void startScroll(int p0, int p1, int p2, int p3) {}
    public void startScroll(int p0, int p1, int p2, int p3, int p4) {}
    public boolean springBack(int p0, int p1, int p2, int p3, int p4, int p5) { return false; }
    public void fling(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) {}
    public void fling(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9) {}
    public void notifyHorizontalEdgeReached(int p0, int p1, int p2) {}
    public void notifyVerticalEdgeReached(int p0, int p1, int p2) {}
    public boolean isOverScrolled() { return false; }
    public void abortAnimation() {}
    public int timePassed() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public boolean isScrollingInDirection(float p0, float p1) { return false; }

    static class SplineOverScroller {
        private int mStart;
        private int mCurrentPosition;
        private int mFinal;
        private int mVelocity;
        @android.annotation.UnsupportedAppUsage
        private float mCurrVelocity;
        private float mDeceleration;
        private long mStartTime;
        private int mDuration;
        private int mSplineDuration;
        private int mSplineDistance;
        private boolean mFinished;
        private int mOver;
        private float mFlingFriction;
        private int mState;
        private static final float GRAVITY = 2000.0f;
        private float mPhysicalCoeff;
        private static float DECELERATION_RATE;
        private static final float INFLEXION = 0.3499999940395355f;
        private static final float START_TENSION = 0.5f;
        private static final float END_TENSION = 1.0f;
        private static final float P1 = 0.17499999701976776f;
        private static final float P2 = 0.3500000238418579f;
        private static final int NB_SAMPLES = 100;
        private static final float[] SPLINE_POSITION = null;
        private static final float[] SPLINE_TIME = null;
        private static final int SPLINE = 0;
        private static final int CUBIC = 1;
        private static final int BALLISTIC = 2;
        void setFriction(float p0) {}
        SplineOverScroller(android.content.Context p0) {}
        void updateScroll(float p0) {}
        private static float getDeceleration(int p0) { return 0.0f; }
        private void adjustDuration(int p0, int p1, int p2) {}
        void startScroll(int p0, int p1, int p2) {}
        void finish() {}
        void setFinalPosition(int p0) {}
        void extendDuration(int p0) {}
        boolean springback(int p0, int p1, int p2) { return false; }
        private void startSpringback(int p0, int p1, int p2) {}
        void fling(int p0, int p1, int p2, int p3, int p4) {}
        private double getSplineDeceleration(int p0) { return 0.0; }
        private double getSplineFlingDistance(int p0) { return 0.0; }
        private int getSplineFlingDuration(int p0) { return 0; }
        private void fitOnBounceCurve(int p0, int p1, int p2) {}
        private void startBounceAfterEdge(int p0, int p1, int p2) {}
        private void startAfterEdge(int p0, int p1, int p2, int p3) {}
        void notifyEdgeReached(int p0, int p1, int p2) {}
        private void onEdgeReached() {}
        boolean continueWhenFinished() { return false; }
        boolean update() { return false; }
    }
}
