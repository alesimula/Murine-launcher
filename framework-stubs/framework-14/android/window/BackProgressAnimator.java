package android.window;

public class BackProgressAnimator {
    public BackProgressAnimator() {}
    public void onBackProgressed(android.window.BackMotionEvent p0) {}
    public void onBackStarted(android.window.BackMotionEvent p0, android.window.BackProgressAnimator.ProgressCallback p1) {}
    public void reset() {}
    public void onBackCancelled(java.lang.Runnable p0) {}
    boolean isBackAnimationInProgress() { return false; }

    public static interface ProgressCallback {
        public void onProgressUpdate(android.window.BackEvent p0);
    }
}
