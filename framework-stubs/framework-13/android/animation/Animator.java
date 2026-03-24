package android.animation;

public abstract class Animator implements java.lang.Cloneable {
    public static final long DURATION_INFINITE = -1L;
    java.util.ArrayList<android.animation.Animator.AnimatorListener> mListeners;
    java.util.ArrayList<android.animation.Animator.AnimatorPauseListener> mPauseListeners;
    boolean mPaused;
    int mChangingConfigurations;
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
    void animateBasedOnPlayTime(long p0, long p1, boolean p2) {}
    public void setAllowRunningAsynchronously(boolean p0) {}

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
