package android.animation;

public class AnimationHandler {
    private final android.util.ArrayMap<android.animation.AnimationHandler.AnimationFrameCallback, java.lang.Long> mDelayedCallbackStartTime = null;
    private final java.util.ArrayList<android.animation.AnimationHandler.AnimationFrameCallback> mAnimationCallbacks = null;
    private final java.util.ArrayList<android.animation.AnimationHandler.AnimationFrameCallback> mCommitCallbacks = null;
    private android.animation.AnimationHandler.AnimationFrameCallbackProvider mProvider;
    private final android.view.Choreographer.FrameCallback mFrameCallback = null;
    public static final java.lang.ThreadLocal<android.animation.AnimationHandler> sAnimatorHandler = null;
    private boolean mListDirty;
    public AnimationHandler() {}
    public static android.animation.AnimationHandler getInstance() { return null; }
    public void setProvider(android.animation.AnimationHandler.AnimationFrameCallbackProvider p0) {}
    private android.animation.AnimationHandler.AnimationFrameCallbackProvider getProvider() { return null; }
    public void addAnimationFrameCallback(android.animation.AnimationHandler.AnimationFrameCallback p0, long p1) {}
    public void addOneShotCommitCallback(android.animation.AnimationHandler.AnimationFrameCallback p0) {}
    public void removeCallback(android.animation.AnimationHandler.AnimationFrameCallback p0) {}
    private void doAnimationFrame(long p0) {}
    private void commitAnimationFrame(android.animation.AnimationHandler.AnimationFrameCallback p0, long p1) {}
    private boolean isCallbackDue(android.animation.AnimationHandler.AnimationFrameCallback p0, long p1) { return false; }
    public static int getAnimationCount() { return 0; }
    public static void setFrameDelay(long p0) {}
    public static long getFrameDelay() { return 0L; }
    void autoCancelBasedOn(android.animation.ObjectAnimator p0) {}
    private void cleanUpList() {}
    private int getCallbackSize() { return 0; }

    static interface AnimationFrameCallback {
        public boolean doAnimationFrame(long p0);
        public void commitAnimationFrame(long p0);
    }

    public static interface AnimationFrameCallbackProvider {
        public void postFrameCallback(android.view.Choreographer.FrameCallback p0);
        public void postCommitCallback(java.lang.Runnable p0);
        public long getFrameTime();
        public long getFrameDelay();
        public void setFrameDelay(long p0);
    }

    private class MyFrameCallbackProvider implements android.animation.AnimationHandler.AnimationFrameCallbackProvider {
        final android.view.Choreographer mChoreographer = null;
        private MyFrameCallbackProvider(android.animation.AnimationHandler p0) {}
        public void postFrameCallback(android.view.Choreographer.FrameCallback p0) {}
        public void postCommitCallback(java.lang.Runnable p0) {}
        public long getFrameTime() { return 0L; }
        public long getFrameDelay() { return 0L; }
        public void setFrameDelay(long p0) {}
    }
}
