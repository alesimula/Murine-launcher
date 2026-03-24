package android.window;

public class BackProgressAnimator implements com.android.internal.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener {
    public void onAnimationUpdate(com.android.internal.dynamicanimation.animation.DynamicAnimation p0, float p1, float p2) {}
    public BackProgressAnimator() {}
    public void onBackProgressed(android.window.BackMotionEvent p0) {}
    public void onBackStarted(android.window.BackMotionEvent p0, android.window.BackProgressAnimator.ProgressCallback p1) {}
    public void reset() {}
    public void onBackInvoked(java.lang.Runnable p0) {}
    public void onBackCancelled(java.lang.Runnable p0) {}
    public void removeOnBackCancelledFinishCallback() {}
    public void removeOnBackInvokedFinishCallback() {}
    public boolean isBackAnimationInProgress() { return false; }
    public float getVelocity() { return 0.0f; }

    public static interface ProgressCallback {
        public void onProgressUpdate(android.window.BackEvent p0);
    }
}
