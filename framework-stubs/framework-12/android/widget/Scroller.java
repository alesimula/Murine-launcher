package android.widget;

public class Scroller {
    private final android.view.animation.Interpolator mInterpolator = null;
    private int mMode;
    private int mStartX;
    private int mStartY;
    private int mFinalX;
    private int mFinalY;
    private int mMinX;
    private int mMaxX;
    private int mMinY;
    private int mMaxY;
    private int mCurrX;
    private int mCurrY;
    private long mStartTime;
    private int mDuration;
    private float mDurationReciprocal;
    private float mDeltaX;
    private float mDeltaY;
    private boolean mFinished;
    private boolean mFlywheel;
    private float mVelocity;
    private float mCurrVelocity;
    private int mDistance;
    private float mFlingFriction;
    private static final int DEFAULT_DURATION = 250;
    private static final int SCROLL_MODE = 0;
    private static final int FLING_MODE = 1;
    private static float DECELERATION_RATE;
    private static final float INFLEXION = 0.3499999940395355f;
    private static final float START_TENSION = 0.5f;
    private static final float END_TENSION = 1.0f;
    private static final float P1 = 0.17499999701976776f;
    private static final float P2 = 0.3500000238418579f;
    private static final int NB_SAMPLES = 100;
    private static final float[] SPLINE_POSITION = null;
    private static final float[] SPLINE_TIME = null;
    private float mDeceleration;
    private final float mPpi = 0.0f;
    private float mPhysicalCoeff;
    public Scroller(android.content.Context p0) {}
    public Scroller(android.content.Context p0, android.view.animation.Interpolator p1) {}
    public Scroller(android.content.Context p0, android.view.animation.Interpolator p1, boolean p2) {}
    public final void setFriction(float p0) {}
    private float computeDeceleration(float p0) { return 0.0f; }
    public final boolean isFinished() { return false; }
    public final void forceFinished(boolean p0) {}
    public final int getDuration() { return 0; }
    public final int getCurrX() { return 0; }
    public final int getCurrY() { return 0; }
    public float getCurrVelocity() { return 0.0f; }
    public final int getStartX() { return 0; }
    public final int getStartY() { return 0; }
    public final int getFinalX() { return 0; }
    public final int getFinalY() { return 0; }
    public boolean computeScrollOffset() { return false; }
    public void startScroll(int p0, int p1, int p2, int p3) {}
    public void startScroll(int p0, int p1, int p2, int p3, int p4) {}
    public void fling(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) {}
    private double getSplineDeceleration(float p0) { return 0.0; }
    private int getSplineFlingDuration(float p0) { return 0; }
    private double getSplineFlingDistance(float p0) { return 0.0; }
    public void abortAnimation() {}
    public void extendDuration(int p0) {}
    public int timePassed() { return 0; }
    public void setFinalX(int p0) {}
    public void setFinalY(int p0) {}
    public boolean isScrollingInDirection(float p0, float p1) { return false; }

    static class ViscousFluidInterpolator implements android.view.animation.Interpolator {
        private static final float VISCOUS_FLUID_SCALE = 8.0f;
        private static final float VISCOUS_FLUID_NORMALIZE = Float.valueOf(0.0f);
        private static final float VISCOUS_FLUID_OFFSET = Float.valueOf(0.0f);
        ViscousFluidInterpolator() {}
        private static float viscousFluid(float p0) { return 0.0f; }
        public float getInterpolation(float p0) { return 0.0f; }
    }
}
