package android.animation;

public class ValueAnimator extends android.animation.Animator implements android.animation.AnimationHandler.AnimationFrameCallback {
    private static final java.lang.String TAG = "ValueAnimator";
    private static final boolean DEBUG = false;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private static float sDurationScale;
    long mStartTime;
    boolean mStartTimeCommitted;
    float mSeekFraction;
    private long mPauseTime;
    private boolean mResumed;
    private static final android.animation.TimeInterpolator sDefaultInterpolator = null;
    private boolean mReversing;
    private float mOverallFraction;
    private float mCurrentFraction;
    private long mLastFrameTime;
    private long mFirstFrameTime;
    private boolean mRunning;
    private boolean mStarted;
    private boolean mStartListenersCalled;
    boolean mInitialized;
    private boolean mAnimationEndRequested;
    @android.annotation.UnsupportedAppUsage
    private long mDuration;
    private long mStartDelay;
    private int mRepeatCount;
    private int mRepeatMode;
    private boolean mSelfPulse;
    private boolean mSuppressSelfPulseRequested;
    private android.animation.TimeInterpolator mInterpolator;
    java.util.ArrayList<android.animation.ValueAnimator.AnimatorUpdateListener> mUpdateListeners;
    android.animation.PropertyValuesHolder[] mValues;
    java.util.HashMap<java.lang.String, android.animation.PropertyValuesHolder> mValuesMap;
    private float mDurationScale;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    public static final int INFINITE = -1;
    public static void setDurationScale(float p0) {}
    public static float getDurationScale() { return 0.0f; }
    public static boolean areAnimatorsEnabled() { return false; }
    public ValueAnimator() { super(); }
    public static android.animation.ValueAnimator ofInt(int... p0) { return null; }
    public static android.animation.ValueAnimator ofArgb(int... p0) { return null; }
    public static android.animation.ValueAnimator ofFloat(float... p0) { return null; }
    public static android.animation.ValueAnimator ofPropertyValuesHolder(android.animation.PropertyValuesHolder... p0) { return null; }
    public static android.animation.ValueAnimator ofObject(android.animation.TypeEvaluator p0, java.lang.Object... p1) { return null; }
    public void setIntValues(int... p0) {}
    public void setFloatValues(float... p0) {}
    public void setObjectValues(java.lang.Object... p0) {}
    public void setValues(android.animation.PropertyValuesHolder... p0) {}
    public android.animation.PropertyValuesHolder[] getValues() { return null; }
    void initAnimation() {}
    public android.animation.ValueAnimator setDuration(long p0) { return null; }
    public void overrideDurationScale(float p0) {}
    private float resolveDurationScale() { return 0.0f; }
    private long getScaledDuration() { return 0L; }
    public long getDuration() { return 0L; }
    public long getTotalDuration() { return 0L; }
    public void setCurrentPlayTime(long p0) {}
    public void setCurrentFraction(float p0) {}
    private int getCurrentIteration(float p0) { return 0; }
    private float getCurrentIterationFraction(float p0, boolean p1) { return 0.0f; }
    private float clampFraction(float p0) { return 0.0f; }
    private boolean shouldPlayBackward(int p0, boolean p1) { return false; }
    public long getCurrentPlayTime() { return 0L; }
    public long getStartDelay() { return 0L; }
    public void setStartDelay(long p0) {}
    public static long getFrameDelay() { return 0L; }
    public static void setFrameDelay(long p0) {}
    public java.lang.Object getAnimatedValue() { return null; }
    public java.lang.Object getAnimatedValue(java.lang.String p0) { return null; }
    public void setRepeatCount(int p0) {}
    public int getRepeatCount() { return 0; }
    public void setRepeatMode(int p0) {}
    public int getRepeatMode() { return 0; }
    public void addUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener p0) {}
    public void removeAllUpdateListeners() {}
    public void removeUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener p0) {}
    public void setInterpolator(android.animation.TimeInterpolator p0) {}
    public android.animation.TimeInterpolator getInterpolator() { return null; }
    public void setEvaluator(android.animation.TypeEvaluator p0) {}
    private void notifyStartListeners() {}
    private void start(boolean p0) {}
    void startWithoutPulsing(boolean p0) {}
    public void start() {}
    public void cancel() {}
    public void end() {}
    public void resume() {}
    public void pause() {}
    public boolean isRunning() { return false; }
    public boolean isStarted() { return false; }
    public void reverse() {}
    public boolean canReverse() { return false; }
    private void endAnimation() {}
    private void startAnimation() {}
    private boolean isPulsingInternal() { return false; }
    java.lang.String getNameForTrace() { return null; }
    public void commitAnimationFrame(long p0) {}
    boolean animateBasedOnTime(long p0) { return false; }
    void animateBasedOnPlayTime(long p0, long p1, boolean p2) {}
    void skipToEndValue(boolean p0) {}
    boolean isInitialized() { return false; }
    public final boolean doAnimationFrame(long p0) { return false; }
    boolean pulseAnimationFrame(long p0) { return false; }
    private void addOneShotCommitCallback() {}
    private void removeAnimationCallback() {}
    private void addAnimationCallback(long p0) {}
    public float getAnimatedFraction() { return 0.0f; }
    @android.annotation.UnsupportedAppUsage
    void animateValue(float p0) {}
    public android.animation.ValueAnimator clone() { return null; }
    public static int getCurrentAnimationsCount() { return 0; }
    public java.lang.String toString() { return null; }
    public void setAllowRunningAsynchronously(boolean p0) {}
    public android.animation.AnimationHandler getAnimationHandler() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RepeatMode {
    }

    public static interface AnimatorUpdateListener {
        public void onAnimationUpdate(android.animation.ValueAnimator p0);
    }
}
