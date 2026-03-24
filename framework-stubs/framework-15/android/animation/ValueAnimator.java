package android.animation;

public class ValueAnimator extends android.animation.Animator implements android.animation.AnimationHandler.AnimationFrameCallback {
    long mStartTime;
    boolean mStartTimeCommitted;
    float mSeekFraction;
    boolean mInitialized;
    java.util.ArrayList<android.animation.ValueAnimator.AnimatorUpdateListener> mUpdateListeners;
    android.animation.PropertyValuesHolder[] mValues;
    java.util.HashMap<java.lang.String, android.animation.PropertyValuesHolder> mValuesMap;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    public static final int INFINITE = -1;
    public static void setDurationScale(float p0) {}
    public static float getDurationScale() { return 0.0f; }
    public static boolean registerDurationScaleChangeListener(android.animation.ValueAnimator.DurationScaleChangeListener p0) { return false; }
    public static boolean unregisterDurationScaleChangeListener(android.animation.ValueAnimator.DurationScaleChangeListener p0) { return false; }
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
    public long getDuration() { return 0L; }
    public long getTotalDuration() { return 0L; }
    public void setCurrentPlayTime(long p0) {}
    public void setCurrentFraction(float p0) {}
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
    java.lang.String getNameForTrace() { return null; }
    public void commitAnimationFrame(long p0) {}
    boolean animateBasedOnTime(long p0) { return false; }
    void animateValuesInRange(long p0, long p1) {}
    void animateSkipToEnds(long p0, long p1) {}
    void skipToEndValue(boolean p0) {}
    boolean isInitialized() { return false; }
    public final boolean doAnimationFrame(long p0) { return false; }
    boolean pulseAnimationFrame(long p0) { return false; }
    public float getAnimatedFraction() { return 0.0f; }
    void animateValue(float p0) {}
    public android.animation.ValueAnimator clone() { return null; }
    public static int getCurrentAnimationsCount() { return 0; }
    public java.lang.String toString() { return null; }
    public void setAllowRunningAsynchronously(boolean p0) {}
    public android.animation.AnimationHandler getAnimationHandler() { return null; }
    public void setAnimationHandler(android.animation.AnimationHandler p0) {}

    public static interface AnimatorUpdateListener {
        public void onAnimationUpdate(android.animation.ValueAnimator p0);
    }

    public static interface DurationScaleChangeListener {
        public void onChanged(float p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RepeatMode {
    }
}
