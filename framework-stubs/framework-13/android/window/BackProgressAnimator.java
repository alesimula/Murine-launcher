package android.window;

public class BackProgressAnimator {
    public BackProgressAnimator() {}
    public void onBackProgressed(android.window.BackEvent p0) {}
    public void onBackStarted(android.window.BackEvent p0, android.window.BackProgressAnimator.ProgressCallback p1) {}
    public void reset() {}

    public static interface ProgressCallback {
        public void onProgressUpdate(android.window.BackEvent p0);
    }
}
