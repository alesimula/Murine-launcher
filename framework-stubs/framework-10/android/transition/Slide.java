package android.transition;

public class Slide extends android.transition.Visibility {
    private static final java.lang.String TAG = "Slide";
    private static final android.animation.TimeInterpolator sDecelerate = null;
    private static final android.animation.TimeInterpolator sAccelerate = null;
    private static final java.lang.String PROPNAME_SCREEN_POSITION = "android:slide:screenPosition";
    private android.transition.Slide.CalculateSlide mSlideCalculator;
    private int mSlideEdge;
    private float mSlideFraction;
    private static final android.transition.Slide.CalculateSlide sCalculateLeft = null;
    private static final android.transition.Slide.CalculateSlide sCalculateStart = null;
    private static final android.transition.Slide.CalculateSlide sCalculateTop = null;
    private static final android.transition.Slide.CalculateSlide sCalculateRight = null;
    private static final android.transition.Slide.CalculateSlide sCalculateEnd = null;
    private static final android.transition.Slide.CalculateSlide sCalculateBottom = null;
    public Slide() { super(); }
    public Slide(int p0) { super(); }
    public Slide(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    private void captureValues(android.transition.TransitionValues p0) {}
    public void captureStartValues(android.transition.TransitionValues p0) {}
    public void captureEndValues(android.transition.TransitionValues p0) {}
    public void setSlideEdge(int p0) {}
    public int getSlideEdge() { return 0; }
    public android.animation.Animator onAppear(android.view.ViewGroup p0, android.view.View p1, android.transition.TransitionValues p2, android.transition.TransitionValues p3) { return null; }
    public android.animation.Animator onDisappear(android.view.ViewGroup p0, android.view.View p1, android.transition.TransitionValues p2, android.transition.TransitionValues p3) { return null; }
    public void setSlideFraction(float p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GravityFlag {
    }

    private static abstract class CalculateSlideVertical implements android.transition.Slide.CalculateSlide {
        private CalculateSlideVertical() {}
        public float getGoneX(android.view.ViewGroup p0, android.view.View p1, float p2) { return 0.0f; }
    }

    private static abstract class CalculateSlideHorizontal implements android.transition.Slide.CalculateSlide {
        private CalculateSlideHorizontal() {}
        public float getGoneY(android.view.ViewGroup p0, android.view.View p1, float p2) { return 0.0f; }
    }

    private static interface CalculateSlide {
        public float getGoneX(android.view.ViewGroup p0, android.view.View p1, float p2);
        public float getGoneY(android.view.ViewGroup p0, android.view.View p1, float p2);
    }
}
