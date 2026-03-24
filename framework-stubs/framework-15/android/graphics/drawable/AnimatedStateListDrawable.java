package android.graphics.drawable;

public class AnimatedStateListDrawable extends android.graphics.drawable.StateListDrawable {
    public AnimatedStateListDrawable() { super(); }
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void addState(int[] p0, android.graphics.drawable.Drawable p1, int p2) {}
    public <T extends android.graphics.drawable.Drawable & android.graphics.drawable.Animatable> void addTransition(int p0, int p1, T p2, boolean p3) {}
    public boolean isStateful() { return false; }
    protected boolean onStateChange(int[] p0) { return false; }
    public void jumpToCurrentState() {}
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public android.graphics.drawable.Drawable mutate() { return null; }
    android.graphics.drawable.AnimatedStateListDrawable.AnimatedStateListState cloneConstantState() { return null; }
    public void clearMutated() {}
    protected void setConstantState(android.graphics.drawable.DrawableContainer.DrawableContainerState p0) {}

    private static class AnimatableTransition extends android.graphics.drawable.AnimatedStateListDrawable.Transition {
        public AnimatableTransition(android.graphics.drawable.Animatable p0) { super(); }
        public void start() {}
        public void stop() {}
    }

    static class AnimatedStateListState extends android.graphics.drawable.StateListDrawable.StateListState {
        int[] mAnimThemeAttrs;
        android.util.LongSparseLongArray mTransitions;
        android.util.SparseIntArray mStateIds;
        AnimatedStateListState(android.graphics.drawable.AnimatedStateListDrawable.AnimatedStateListState p0, android.graphics.drawable.AnimatedStateListDrawable p1, android.content.res.Resources p2) { super(null, null, null); }
        void mutate() {}
        int addTransition(int p0, int p1, android.graphics.drawable.Drawable p2, boolean p3) { return 0; }
        int addStateSet(int[] p0, android.graphics.drawable.Drawable p1, int p2) { return 0; }
        int indexOfKeyframe(int[] p0) { return 0; }
        int getKeyframeIdAt(int p0) { return 0; }
        int indexOfTransition(int p0, int p1) { return 0; }
        boolean isTransitionReversed(int p0, int p1) { return false; }
        boolean transitionHasReversibleFlag(int p0, int p1) { return false; }
        public boolean canApplyTheme() { return false; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
    }

    private static class AnimatedVectorDrawableTransition extends android.graphics.drawable.AnimatedStateListDrawable.Transition {
        public AnimatedVectorDrawableTransition(android.graphics.drawable.AnimatedVectorDrawable p0, boolean p1, boolean p2) { super(); }
        public boolean canReverse() { return false; }
        public void start() {}
        public void reverse() {}
        public void stop() {}
    }

    private static class AnimationDrawableTransition extends android.graphics.drawable.AnimatedStateListDrawable.Transition {
        public AnimationDrawableTransition(android.graphics.drawable.AnimationDrawable p0, boolean p1, boolean p2) { super(); }
        public boolean canReverse() { return false; }
        public void start() {}
        public void reverse() {}
        public void stop() {}
    }

    private static class FrameInterpolator implements android.animation.TimeInterpolator {
        public FrameInterpolator(android.graphics.drawable.AnimationDrawable p0, boolean p1) {}
        public int updateFrames(android.graphics.drawable.AnimationDrawable p0, boolean p1) { return 0; }
        public int getTotalDuration() { return 0; }
        public float getInterpolation(float p0) { return 0.0f; }
    }

    private static abstract class Transition {
        public abstract void start();
        public abstract void stop();
        public void reverse() {}
        public boolean canReverse() { return false; }
    }
}
