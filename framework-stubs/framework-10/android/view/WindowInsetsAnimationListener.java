package android.view;

public interface WindowInsetsAnimationListener {
    public void onStarted(android.view.WindowInsetsAnimationListener.InsetsAnimation p0);
    public android.view.WindowInsets onProgress(android.view.WindowInsets p0);
    public void onFinished(android.view.WindowInsetsAnimationListener.InsetsAnimation p0);

    public static class InsetsAnimation {
        private final int mTypeMask = 0;
        private final android.graphics.Insets mLowerBound = null;
        private final android.graphics.Insets mUpperBound = null;
        InsetsAnimation(int p0, android.graphics.Insets p1, android.graphics.Insets p2) {}
        public int getTypeMask() { return 0; }
        public android.graphics.Insets getLowerBound() { return null; }
        public android.graphics.Insets getUpperBound() { return null; }
    }
}
