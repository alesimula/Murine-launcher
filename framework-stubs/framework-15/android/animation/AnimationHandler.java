package android.animation;

public class AnimationHandler {
    public static final java.lang.ThreadLocal<android.animation.AnimationHandler> sAnimatorHandler = null;
    public AnimationHandler() {}
    public static android.animation.AnimationHandler getInstance() { return null; }
    @android.annotation.Nullable
    public static android.animation.AnimationHandler setTestHandler(android.animation.AnimationHandler p0) { return null; }
    public static void setAnimatorPausingEnabled(boolean p0) {}
    public static void setOverrideAnimatorPausingSystemProperty(boolean p0) {}
    public static void removeRequestor(java.lang.Object p0) {}
    public static void requestAnimatorsEnabled(boolean p0, java.lang.Object p1) {}
    public void setProvider(android.animation.AnimationHandler.AnimationFrameCallbackProvider p0) {}
    public void addAnimationFrameCallback(android.animation.AnimationHandler.AnimationFrameCallback p0, long p1) {}
    public void addOneShotCommitCallback(android.animation.AnimationHandler.AnimationFrameCallback p0) {}
    public void removeCallback(android.animation.AnimationHandler.AnimationFrameCallback p0) {}
    public static int getAnimationCount() { return 0; }
    public static void setFrameDelay(long p0) {}
    public static long getFrameDelay() { return 0L; }
    void autoCancelBasedOn(android.animation.ObjectAnimator p0) {}

    public static interface AnimationFrameCallback {
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
        public void postFrameCallback(android.view.Choreographer.FrameCallback p0) {}
        public void postCommitCallback(java.lang.Runnable p0) {}
        public long getFrameTime() { return 0L; }
        public long getFrameDelay() { return 0L; }
        public void setFrameDelay(long p0) {}
    }
}
