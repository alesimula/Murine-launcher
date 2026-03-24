package android.animation;

public abstract class Animator implements java.lang.Cloneable {
    public static final long DURATION_INFINITE = -1L;
    java.util.ArrayList<android.animation.Animator.AnimatorListener> mListeners;
    java.util.ArrayList<android.animation.Animator.AnimatorPauseListener> mPauseListeners;
    boolean mPaused;
    int mChangingConfigurations;
    boolean mStartListenersCalled;
    public Animator() {}
    public static void setBackgroundPauseDelay(long p0) {}
    public static long getBackgroundPauseDelay() { return 0L; }
    public static void setAnimatorPausingEnabled(boolean p0) {}
    public void start() {}
    public void cancel() {}
    public void end() {}
    public void pause() {}
    public void resume() {}
    public boolean isPaused() { return false; }
    public abstract long getStartDelay();
    public abstract void setStartDelay(long p0);
    public abstract android.animation.Animator setDuration(long p0);
    public abstract long getDuration();
    public long getTotalDuration() { return 0L; }
    public abstract void setInterpolator(android.animation.TimeInterpolator p0);
    public android.animation.TimeInterpolator getInterpolator() { return null; }
    public abstract boolean isRunning();
    public boolean isStarted() { return false; }
    public void addListener(android.animation.Animator.AnimatorListener p0) {}
    public void removeListener(android.animation.Animator.AnimatorListener p0) {}
    public java.util.ArrayList<android.animation.Animator.AnimatorListener> getListeners() { return null; }
    public void addPauseListener(android.animation.Animator.AnimatorPauseListener p0) {}
    public void removePauseListener(android.animation.Animator.AnimatorPauseListener p0) {}
    public void removeAllListeners() {}
    public int getChangingConfigurations() { return 0; }
    public void setChangingConfigurations(int p0) {}
    public void appendChangingConfigurations(int p0) {}
    public android.content.res.ConstantState<android.animation.Animator> createConstantState() { return null; }
    public android.animation.Animator clone() { return null; }
    public void setupStartValues() {}
    public void setupEndValues() {}
    public void setTarget(java.lang.Object p0) {}
    public boolean canReverse() { return false; }
    public void reverse() {}
    boolean pulseAnimationFrame(long p0) { return false; }
    void startWithoutPulsing(boolean p0) {}
    void skipToEndValue(boolean p0) {}
    boolean isInitialized() { return false; }
    void animateValuesInRange(long p0, long p1) {}
    void animateSkipToEnds(long p0, long p1) {}
    void getStartAndEndTimes(android.util.LongArray p0, long p1) {}
    void notifyListeners(android.animation.Animator.AnimatorCaller<android.animation.Animator.AnimatorListener, android.animation.Animator> p0, boolean p1) {}
    void notifyPauseListeners(android.animation.Animator.AnimatorCaller<android.animation.Animator.AnimatorPauseListener, android.animation.Animator> p0) {}
    void notifyStartListeners(boolean p0) {}
    void notifyEndListeners(boolean p0) {}
    <T extends java.lang.Object, A extends java.lang.Object> void callOnList(java.util.ArrayList<T> p0, android.animation.Animator.AnimatorCaller<T, A> p1, A p2, boolean p3) {}
    public void setAllowRunningAsynchronously(boolean p0) {}

    static interface AnimatorCaller<T extends java.lang.Object, A extends java.lang.Object> {
        public static final android.animation.Animator.AnimatorCaller<android.animation.Animator.AnimatorListener, android.animation.Animator> ON_START = null;
        public static final android.animation.Animator.AnimatorCaller<android.animation.Animator.AnimatorListener, android.animation.Animator> ON_END = null;
        public static final android.animation.Animator.AnimatorCaller<android.animation.Animator.AnimatorListener, android.animation.Animator> ON_CANCEL = null;
        public static final android.animation.Animator.AnimatorCaller<android.animation.Animator.AnimatorListener, android.animation.Animator> ON_REPEAT = null;
        public static final android.animation.Animator.AnimatorCaller<android.animation.Animator.AnimatorPauseListener, android.animation.Animator> ON_PAUSE = null;
        public static final android.animation.Animator.AnimatorCaller<android.animation.Animator.AnimatorPauseListener, android.animation.Animator> ON_RESUME = null;
        public static final android.animation.Animator.AnimatorCaller<android.animation.ValueAnimator.AnimatorUpdateListener, android.animation.ValueAnimator> ON_UPDATE = null;
        public void call(T p0, A p1, boolean p2);
    }

    private static class AnimatorConstantState extends android.content.res.ConstantState<android.animation.Animator> {
        final android.animation.Animator mAnimator = null;
        int mChangingConf;
        public AnimatorConstantState(android.animation.Animator p0) { super(); }
        public int getChangingConfigurations() { return 0; }
        public android.animation.Animator newInstance() { return null; }
    }

    public static interface AnimatorListener {
        default public void onAnimationStart(android.animation.Animator p0, boolean p1) {}
        default public void onAnimationEnd(android.animation.Animator p0, boolean p1) {}
        public void onAnimationStart(android.animation.Animator p0);
        public void onAnimationEnd(android.animation.Animator p0);
        public void onAnimationCancel(android.animation.Animator p0);
        public void onAnimationRepeat(android.animation.Animator p0);
    }

    public static interface AnimatorPauseListener {
        public void onAnimationPause(android.animation.Animator p0);
        public void onAnimationResume(android.animation.Animator p0);
    }
}
