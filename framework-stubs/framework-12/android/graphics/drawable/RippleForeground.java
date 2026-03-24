package android.graphics.drawable;

class RippleForeground extends android.graphics.drawable.RippleComponent {
    private static final android.animation.TimeInterpolator LINEAR_INTERPOLATOR = null;
    private static final android.animation.TimeInterpolator DECELERATE_INTERPOLATOR = null;
    private static final int RIPPLE_ENTER_DURATION = 225;
    private static final int RIPPLE_ORIGIN_DURATION = 225;
    private static final int OPACITY_ENTER_DURATION = 75;
    private static final int OPACITY_EXIT_DURATION = 150;
    private static final int OPACITY_HOLD_DURATION = 225;
    private float mStartingX;
    private float mStartingY;
    private float mClampedStartingX;
    private float mClampedStartingY;
    private android.graphics.CanvasProperty<android.graphics.Paint> mPropPaint;
    private android.graphics.CanvasProperty<java.lang.Float> mPropRadius;
    private android.graphics.CanvasProperty<java.lang.Float> mPropX;
    private android.graphics.CanvasProperty<java.lang.Float> mPropY;
    private float mTargetX;
    private float mTargetY;
    private float mOpacity;
    private float mTweenRadius;
    private float mTweenX;
    private float mTweenY;
    private boolean mHasFinishedExit;
    private boolean mUsingProperties;
    private long mEnterStartedAtMillis;
    private java.util.ArrayList<android.graphics.animation.RenderNodeAnimator> mPendingHwAnimators;
    private java.util.ArrayList<android.graphics.animation.RenderNodeAnimator> mRunningHwAnimators;
    private java.util.ArrayList<android.animation.Animator> mRunningSwAnimators;
    private final boolean mForceSoftware = false;
    private float mStartRadius;
    private final android.animation.AnimatorListenerAdapter mAnimationListener = null;
    private static final android.util.FloatProperty<android.graphics.drawable.RippleForeground> TWEEN_RADIUS = null;
    private static final android.util.FloatProperty<android.graphics.drawable.RippleForeground> TWEEN_ORIGIN = null;
    private static final android.util.FloatProperty<android.graphics.drawable.RippleForeground> OPACITY = null;
    public RippleForeground(android.graphics.drawable.RippleDrawable p0, android.graphics.Rect p1, float p2, float p3, boolean p4) { super(null, null); }
    protected void onTargetRadiusChanged(float p0) {}
    private void drawSoftware(android.graphics.Canvas p0, android.graphics.Paint p1) {}
    private void startPending(android.graphics.RecordingCanvas p0) {}
    private void pruneHwFinished() {}
    private void pruneSwFinished() {}
    private void drawHardware(android.graphics.RecordingCanvas p0, android.graphics.Paint p1) {}
    public void getBounds(android.graphics.Rect p0) {}
    public void move(float p0, float p1) {}
    public boolean hasFinishedExit() { return false; }
    private long computeFadeOutDelay() { return 0L; }
    private void startSoftwareEnter() {}
    private void startSoftwareExit() {}
    private void startHardwareEnter() {}
    private void startHardwareExit() {}
    public final void enter() {}
    public final void exit() {}
    private float getCurrentX() { return 0.0f; }
    private float getCurrentY() { return 0.0f; }
    private float getCurrentRadius() { return 0.0f; }
    public void draw(android.graphics.Canvas p0, android.graphics.Paint p1) {}
    private void clampStartingPosition() {}
    public void end() {}
    private void onAnimationPropertyChanged() {}
    private void clearHwProps() {}
    private void switchToUiThreadAnimation() {}
}
