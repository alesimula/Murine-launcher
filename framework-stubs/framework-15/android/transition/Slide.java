package android.transition;

public class Slide extends android.transition.Visibility {
    public Slide() { super(); }
    public Slide(int p0) { super(); }
    public Slide(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public void captureStartValues(android.transition.TransitionValues p0) {}
    public void captureEndValues(android.transition.TransitionValues p0) {}
    public void setSlideEdge(int p0) {}
    public int getSlideEdge() { return 0; }
    public android.animation.Animator onAppear(android.view.ViewGroup p0, android.view.View p1, android.transition.TransitionValues p2, android.transition.TransitionValues p3) { return null; }
    public android.animation.Animator onDisappear(android.view.ViewGroup p0, android.view.View p1, android.transition.TransitionValues p2, android.transition.TransitionValues p3) { return null; }
    public void setSlideFraction(float p0) {}

    private static interface CalculateSlide {
        public float getGoneX(android.view.ViewGroup p0, android.view.View p1, float p2);
        public float getGoneY(android.view.ViewGroup p0, android.view.View p1, float p2);
    }

    private static abstract class CalculateSlideHorizontal implements android.transition.Slide.CalculateSlide {
        public float getGoneY(android.view.ViewGroup p0, android.view.View p1, float p2) { return 0.0f; }
    }

    private static abstract class CalculateSlideVertical implements android.transition.Slide.CalculateSlide {
        public float getGoneX(android.view.ViewGroup p0, android.view.View p1, float p2) { return 0.0f; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GravityFlag {
    }
}
