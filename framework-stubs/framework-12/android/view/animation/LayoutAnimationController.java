package android.view.animation;

public class LayoutAnimationController {
    public static final int ORDER_NORMAL = 0;
    public static final int ORDER_REVERSE = 1;
    public static final int ORDER_RANDOM = 2;
    protected android.view.animation.Animation mAnimation;
    protected java.util.Random mRandomizer;
    protected android.view.animation.Interpolator mInterpolator;
    private float mDelay;
    private int mOrder;
    private long mDuration;
    private long mMaxDelay;
    public LayoutAnimationController(android.content.Context p0, android.util.AttributeSet p1) {}
    public LayoutAnimationController(android.view.animation.Animation p0) {}
    public LayoutAnimationController(android.view.animation.Animation p0, float p1) {}
    public int getOrder() { return 0; }
    public void setOrder(int p0) {}
    public void setAnimation(android.content.Context p0, int p1) {}
    public void setAnimation(android.view.animation.Animation p0) {}
    public android.view.animation.Animation getAnimation() { return null; }
    public void setInterpolator(android.content.Context p0, int p1) {}
    public void setInterpolator(android.view.animation.Interpolator p0) {}
    public android.view.animation.Interpolator getInterpolator() { return null; }
    public float getDelay() { return 0.0f; }
    public void setDelay(float p0) {}
    public boolean willOverlap() { return false; }
    public void start() {}
    public final android.view.animation.Animation getAnimationForView(android.view.View p0) { return null; }
    public boolean isDone() { return false; }
    protected long getDelayForView(android.view.View p0) { return 0L; }
    protected int getTransformedIndex(android.view.animation.LayoutAnimationController.AnimationParameters p0) { return 0; }

    public static class AnimationParameters {
        public int count;
        public int index;
        public AnimationParameters() {}
    }
}
