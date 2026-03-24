package android.view;

public class ViewPropertyAnimator {
    final android.view.View mView = null;
    java.util.ArrayList<android.view.ViewPropertyAnimator.NameValuesHolder> mPendingAnimations;
    static final int NONE = 0;
    static final int TRANSLATION_X = 1;
    static final int TRANSLATION_Y = 2;
    static final int TRANSLATION_Z = 4;
    static final int SCALE_X = 8;
    static final int SCALE_Y = 16;
    static final int ROTATION = 32;
    static final int ROTATION_X = 64;
    static final int ROTATION_Y = 128;
    static final int X = 256;
    static final int Y = 512;
    static final int Z = 1024;
    static final int ALPHA = 2048;
    ViewPropertyAnimator(android.view.View p0) {}
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator setDuration(long p0) { return null; }
    public long getDuration() { return 0L; }
    public long getStartDelay() { return 0L; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator setStartDelay(long p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator setInterpolator(android.animation.TimeInterpolator p0) { return null; }
    @android.annotation.Nullable
    public android.animation.TimeInterpolator getInterpolator() { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator setListener(android.animation.Animator.AnimatorListener p0) { return null; }
    @android.annotation.Nullable
    android.animation.Animator.AnimatorListener getListener() { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator setUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener p0) { return null; }
    @android.annotation.Nullable
    android.animation.ValueAnimator.AnimatorUpdateListener getUpdateListener() { return null; }
    public void start() {}
    public void cancel() {}
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator x(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator xBy(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator y(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator yBy(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator z(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator zBy(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator rotation(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator rotationBy(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator rotationX(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator rotationXBy(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator rotationY(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator rotationYBy(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator translationX(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator translationXBy(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator translationY(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator translationYBy(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator translationZ(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator translationZBy(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator scaleX(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator scaleXBy(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator scaleY(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator scaleYBy(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator alpha(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator alphaBy(float p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator withLayer() { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator withStartAction(java.lang.Runnable p0) { return null; }
    @android.annotation.NonNull
    public android.view.ViewPropertyAnimator withEndAction(java.lang.Runnable p0) { return null; }
    boolean hasActions() { return false; }

    private class AnimatorEventListener implements android.animation.Animator.AnimatorListener, android.animation.ValueAnimator.AnimatorUpdateListener {
        public void onAnimationStart(android.animation.Animator p0) {}
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationRepeat(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onAnimationUpdate(android.animation.ValueAnimator p0) {}
    }

    static class NameValuesHolder {
        int mNameConstant;
        float mFromValue;
        float mDeltaValue;
        NameValuesHolder(int p0, float p1, float p2) {}
    }

    private static class PropertyBundle {
        int mPropertyMask;
        java.util.ArrayList<android.view.ViewPropertyAnimator.NameValuesHolder> mNameValuesHolder;
        PropertyBundle(int p0, java.util.ArrayList<android.view.ViewPropertyAnimator.NameValuesHolder> p1) {}
        boolean cancel(int p0) { return false; }
    }
}
