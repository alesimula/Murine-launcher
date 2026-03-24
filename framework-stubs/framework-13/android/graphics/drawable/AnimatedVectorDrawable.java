package android.graphics.drawable;

public class AnimatedVectorDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable2 {
    public AnimatedVectorDrawable() { super(); }
    public android.graphics.drawable.Drawable mutate() { return null; }
    public void clearMutated() {}
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public int getChangingConfigurations() { return 0; }
    public void draw(android.graphics.Canvas p0) {}
    protected void onBoundsChange(android.graphics.Rect p0) {}
    protected boolean onStateChange(int[] p0) { return false; }
    protected boolean onLevelChange(int p0) { return false; }
    public boolean onLayoutDirectionChanged(int p0) { return false; }
    public int getAlpha() { return 0; }
    public void setAlpha(int p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public void setTintList(android.content.res.ColorStateList p0) {}
    public void setHotspot(float p0, float p1) {}
    public void setHotspotBounds(int p0, int p1, int p2, int p3) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public boolean isStateful() { return false; }
    public int getOpacity() { return 0; }
    public int getIntrinsicWidth() { return 0; }
    public int getIntrinsicHeight() { return 0; }
    public void getOutline(android.graphics.Outline p0) {}
    public android.graphics.Insets getOpticalInsets() { return null; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void forceAnimationOnUI() {}
    public boolean canApplyTheme() { return false; }
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public long getTotalDuration() { return 0L; }
    public boolean isRunning() { return false; }
    public void reset() {}
    public void start() {}
    public void stop() {}
    public void reverse() {}
    public boolean canReverse() { return false; }
    public void registerAnimationCallback(android.graphics.drawable.Animatable2.AnimationCallback p0) {}
    public boolean unregisterAnimationCallback(android.graphics.drawable.Animatable2.AnimationCallback p0) { return false; }
    public void clearAnimationCallbacks() {}

    private static class AnimatedVectorDrawableState extends android.graphics.drawable.Drawable.ConstantState {
        int mChangingConfigurations;
        android.graphics.drawable.VectorDrawable mVectorDrawable;
        java.util.ArrayList<android.graphics.drawable.AnimatedVectorDrawable.AnimatedVectorDrawableState.PendingAnimator> mPendingAnims;
        java.util.ArrayList<android.animation.Animator> mAnimators;
        android.util.ArrayMap<android.animation.Animator, java.lang.String> mTargetNameMap;
        public AnimatedVectorDrawableState(android.graphics.drawable.AnimatedVectorDrawable.AnimatedVectorDrawableState p0, android.graphics.drawable.Drawable.Callback p1, android.content.res.Resources p2) { super(); }
        public boolean canApplyTheme() { return false; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public int getChangingConfigurations() { return 0; }
        public void addPendingAnimator(int p0, float p1, java.lang.String p2) {}
        public void addTargetAnimator(java.lang.String p0, android.animation.Animator p1) {}
        public void prepareLocalAnimators(android.animation.AnimatorSet p0, android.content.res.Resources p1) {}
        public void inflatePendingAnimators(android.content.res.Resources p0, android.content.res.Resources.Theme p1) {}

        private static class PendingAnimator {
            public final int animResId = 0;
            public final float pathErrorScale = 0.0f;
            public final java.lang.String target = null;
            public PendingAnimator(int p0, float p1, java.lang.String p2) {}
            public android.animation.Animator newInstance(android.content.res.Resources p0, android.content.res.Resources.Theme p1) { return null; }
        }
    }

    private static interface VectorDrawableAnimator {
        public void init(android.animation.AnimatorSet p0);
        public void start();
        public void end();
        public void reset();
        public void reverse();
        public boolean canReverse();
        public void setListener(android.animation.Animator.AnimatorListener p0);
        public void removeListener(android.animation.Animator.AnimatorListener p0);
        public void onDraw(android.graphics.Canvas p0);
        public boolean isStarted();
        public boolean isRunning();
        public boolean isInfinite();
        public void pause();
        public void resume();
        public long getTotalDuration();
    }

    public static class VectorDrawableAnimatorRT implements android.graphics.drawable.AnimatedVectorDrawable.VectorDrawableAnimator, android.view.NativeVectorDrawableAnimator {
        VectorDrawableAnimatorRT(android.graphics.drawable.AnimatedVectorDrawable p0) {}
        public void init(android.animation.AnimatorSet p0) {}
        protected void recordLastSeenTarget(android.graphics.RecordingCanvas p0) {}
        public void start() {}
        public void end() {}
        public void reset() {}
        public void reverse() {}
        public long getAnimatorNativePtr() { return 0L; }
        public boolean canReverse() { return false; }
        public boolean isStarted() { return false; }
        public boolean isRunning() { return false; }
        public void setListener(android.animation.Animator.AnimatorListener p0) {}
        public void removeListener(android.animation.Animator.AnimatorListener p0) {}
        public void onDraw(android.graphics.Canvas p0) {}
        public boolean isInfinite() { return false; }
        public void pause() {}
        public void resume() {}
        public long getTotalDuration() { return 0L; }
    }

    private static class VectorDrawableAnimatorUI implements android.graphics.drawable.AnimatedVectorDrawable.VectorDrawableAnimator {
        VectorDrawableAnimatorUI(android.graphics.drawable.AnimatedVectorDrawable p0) {}
        public void init(android.animation.AnimatorSet p0) {}
        public void start() {}
        public void end() {}
        public void reset() {}
        public void reverse() {}
        public boolean canReverse() { return false; }
        public void setListener(android.animation.Animator.AnimatorListener p0) {}
        public void removeListener(android.animation.Animator.AnimatorListener p0) {}
        public void onDraw(android.graphics.Canvas p0) {}
        public boolean isStarted() { return false; }
        public boolean isRunning() { return false; }
        public boolean isInfinite() { return false; }
        public void pause() {}
        public void resume() {}
        public long getTotalDuration() { return 0L; }
    }
}
