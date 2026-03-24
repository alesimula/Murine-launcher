package android.view;

public final class WindowInsetsAnimation {
    private final int mTypeMask = 0;
    private float mFraction;
    private final android.view.animation.Interpolator mInterpolator = null;
    private final long mDurationMillis = 0L;
    private float mAlpha;
    public WindowInsetsAnimation(int p0, android.view.animation.Interpolator p1, long p2) {}
    public int getTypeMask() { return 0; }
    public float getFraction() { return 0.0f; }
    public float getInterpolatedFraction() { return 0.0f; }
    public android.view.animation.Interpolator getInterpolator() { return null; }
    public long getDurationMillis() { return 0L; }
    public void setFraction(float p0) {}
    public float getAlpha() { return 0.0f; }
    public void setAlpha(float p0) {}

    public static final class Bounds {
        private final android.graphics.Insets mLowerBound = null;
        private final android.graphics.Insets mUpperBound = null;
        public Bounds(android.graphics.Insets p0, android.graphics.Insets p1) {}
        public android.graphics.Insets getLowerBound() { return null; }
        public android.graphics.Insets getUpperBound() { return null; }
        public android.view.WindowInsetsAnimation.Bounds inset(android.graphics.Insets p0) { return null; }
        public java.lang.String toString() { return null; }
    }

    @android.annotation.SuppressLint("CallbackMethodName")
    public static abstract class Callback {
        public static final int DISPATCH_MODE_STOP = 0;
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        private final int mDispatchMode = 0;
        public Callback(int p0) {}
        @android.annotation.SuppressLint("CallbackMethodName")
        public final int getDispatchMode() { return 0; }
        public void onPrepare(android.view.WindowInsetsAnimation p0) {}
        public android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation p0, android.view.WindowInsetsAnimation.Bounds p1) { return null; }
        public abstract android.view.WindowInsets onProgress(android.view.WindowInsets p0, java.util.List<android.view.WindowInsetsAnimation> p1);
        public void onEnd(android.view.WindowInsetsAnimation p0) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface DispatchMode {
        }
    }
}
