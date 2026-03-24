package android.graphics.animation;

public class RenderNodeAnimator extends android.animation.Animator {
    public static final int TRANSLATION_X = 0;
    public static final int TRANSLATION_Y = 1;
    public static final int TRANSLATION_Z = 2;
    public static final int SCALE_X = 3;
    public static final int SCALE_Y = 4;
    public static final int ROTATION = 5;
    public static final int ROTATION_X = 6;
    public static final int ROTATION_Y = 7;
    public static final int X = 8;
    public static final int Y = 9;
    public static final int Z = 10;
    public static final int ALPHA = 11;
    public static final int LAST_VALUE = 11;
    public static final int PAINT_STROKE_WIDTH = 0;
    public static final int PAINT_ALPHA = 1;
    private com.android.internal.util.VirtualRefBasePtr mNativePtr;
    private android.os.Handler mHandler;
    private android.graphics.RenderNode mTarget;
    private android.graphics.animation.RenderNodeAnimator.ViewListener mViewListener;
    private int mRenderProperty;
    private float mFinalValue;
    private android.animation.TimeInterpolator mInterpolator;
    private static final int STATE_PREPARE = 0;
    private static final int STATE_DELAYED = 1;
    private static final int STATE_RUNNING = 2;
    private static final int STATE_FINISHED = 3;
    private int mState;
    private long mUnscaledDuration;
    private long mUnscaledStartDelay;
    private final boolean mUiThreadHandlesDelay = false;
    private long mStartDelay;
    private long mStartTime;
    private static java.lang.ThreadLocal<android.graphics.animation.RenderNodeAnimator.DelayedAnimationHelper> sAnimationHelper;
    public RenderNodeAnimator(int p0, float p1) { super(); }
    public RenderNodeAnimator(android.graphics.CanvasProperty<java.lang.Float> p0, float p1) { super(); }
    public RenderNodeAnimator(android.graphics.CanvasProperty<android.graphics.Paint> p0, int p1, float p2) { super(); }
    public RenderNodeAnimator(int p0, int p1, float p2, float p3) { super(); }
    private void init(long p0) {}
    private void checkMutable() {}
    static boolean isNativeInterpolator(android.animation.TimeInterpolator p0) { return false; }
    private void applyInterpolator() {}
    public void start() {}
    private void doStart() {}
    private void moveToRunningState() {}
    private void notifyStartListeners() {}
    public void cancel() {}
    public void end() {}
    public void pause() {}
    public void resume() {}
    public void setViewListener(android.graphics.animation.RenderNodeAnimator.ViewListener p0) {}
    public final void setTarget(android.graphics.RecordingCanvas p0) {}
    protected void setTarget(android.graphics.RenderNode p0) {}
    public void setStartValue(float p0) {}
    public void setStartDelay(long p0) {}
    public long getStartDelay() { return 0L; }
    public android.graphics.animation.RenderNodeAnimator setDuration(long p0) { return null; }
    public long getDuration() { return 0L; }
    public long getTotalDuration() { return 0L; }
    public boolean isRunning() { return false; }
    public boolean isStarted() { return false; }
    public void setInterpolator(android.animation.TimeInterpolator p0) {}
    public android.animation.TimeInterpolator getInterpolator() { return null; }
    protected void onFinished() {}
    private void releaseNativePtr() {}
    private java.util.ArrayList<android.animation.Animator.AnimatorListener> cloneListeners() { return null; }
    public long getNativeAnimator() { return 0L; }
    private boolean processDelayed(long p0) { return false; }
    private static android.graphics.animation.RenderNodeAnimator.DelayedAnimationHelper getHelper() { return null; }
    private static void callOnFinished(android.graphics.animation.RenderNodeAnimator p0) {}
    public android.animation.Animator clone() { return null; }
    public void setAllowRunningAsynchronously(boolean p0) {}
    private static native long nCreateAnimator(int p0, float p1);
    private static native long nCreateCanvasPropertyFloatAnimator(long p0, float p1);
    private static native long nCreateCanvasPropertyPaintAnimator(long p0, int p1, float p2);
    private static native long nCreateRevealAnimator(int p0, int p1, float p2, float p3);
    private static native void nSetStartValue(long p0, float p1);
    private static native void nSetDuration(long p0, long p1);
    private static native long nGetDuration(long p0);
    private static native void nSetStartDelay(long p0, long p1);
    private static native void nSetInterpolator(long p0, long p1);
    private static native void nSetAllowRunningAsync(long p0, boolean p1);
    private static native void nSetListener(long p0, android.graphics.animation.RenderNodeAnimator p1);
    private static native void nStart(long p0);
    private static native void nEnd(long p0);

    private static class DelayedAnimationHelper implements java.lang.Runnable {
        private java.util.ArrayList<android.graphics.animation.RenderNodeAnimator> mDelayedAnims;
        private final android.view.Choreographer mChoreographer = null;
        private boolean mCallbackScheduled;
        DelayedAnimationHelper() {}
        public void addDelayedAnimation(android.graphics.animation.RenderNodeAnimator p0) {}
        public void removeDelayedAnimation(android.graphics.animation.RenderNodeAnimator p0) {}
        private void scheduleCallback() {}
        public void run() {}
    }

    public static interface ViewListener {
        public void onAlphaAnimationStart(float p0);
        public void invalidateParent(boolean p0);
    }
}
