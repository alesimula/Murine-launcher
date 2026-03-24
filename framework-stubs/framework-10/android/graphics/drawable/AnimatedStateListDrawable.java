package android.graphics.drawable;

public class AnimatedStateListDrawable extends android.graphics.drawable.StateListDrawable {
    private static final java.lang.String LOGTAG = null;
    private static final java.lang.String ELEMENT_TRANSITION = "transition";
    private static final java.lang.String ELEMENT_ITEM = "item";
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private android.graphics.drawable.AnimatedStateListDrawable.AnimatedStateListState mState;
    private android.graphics.drawable.AnimatedStateListDrawable.Transition mTransition;
    private int mTransitionToIndex;
    private int mTransitionFromIndex;
    private boolean mMutated;
    public AnimatedStateListDrawable() { super(); }
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void addState(int[] p0, android.graphics.drawable.Drawable p1, int p2) {}
    public <T extends android.graphics.drawable.Drawable & android.graphics.drawable.Animatable> void addTransition(int p0, int p1, T p2, boolean p3) {}
    public boolean isStateful() { return false; }
    protected boolean onStateChange(int[] p0) { return false; }
    private boolean selectTransition(int p0) { return false; }
    public void jumpToCurrentState() {}
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
    private void init() {}
    private void inflateChildElements(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private int parseTransition(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return 0; }
    private int parseItem(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return 0; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    android.graphics.drawable.AnimatedStateListDrawable.AnimatedStateListState cloneConstantState() { return null; }
    public void clearMutated() {}
    protected void setConstantState(android.graphics.drawable.DrawableContainer.DrawableContainerState p0) {}
    private AnimatedStateListDrawable(android.graphics.drawable.AnimatedStateListDrawable.AnimatedStateListState p0, android.content.res.Resources p1) { super(); }

    private static abstract class Transition {
        private Transition() {}
        public abstract void start();
        public abstract void stop();
        public void reverse() {}
        public boolean canReverse() { return false; }
    }

    private static class FrameInterpolator implements android.animation.TimeInterpolator {
        private int[] mFrameTimes;
        private int mFrames;
        private int mTotalDuration;
        public FrameInterpolator(android.graphics.drawable.AnimationDrawable p0, boolean p1) {}
        public int updateFrames(android.graphics.drawable.AnimationDrawable p0, boolean p1) { return 0; }
        public int getTotalDuration() { return 0; }
        public float getInterpolation(float p0) { return 0.0f; }
    }

    private static class AnimationDrawableTransition extends android.graphics.drawable.AnimatedStateListDrawable.Transition {
        private final android.animation.ObjectAnimator mAnim = null;
        private final boolean mHasReversibleFlag = false;
        public AnimationDrawableTransition(android.graphics.drawable.AnimationDrawable p0, boolean p1, boolean p2) { super(); }
        public boolean canReverse() { return false; }
        public void start() {}
        public void reverse() {}
        public void stop() {}
    }

    private static class AnimatedVectorDrawableTransition extends android.graphics.drawable.AnimatedStateListDrawable.Transition {
        private final android.graphics.drawable.AnimatedVectorDrawable mAvd = null;
        private final boolean mReversed = false;
        private final boolean mHasReversibleFlag = false;
        public AnimatedVectorDrawableTransition(android.graphics.drawable.AnimatedVectorDrawable p0, boolean p1, boolean p2) { super(); }
        public boolean canReverse() { return false; }
        public void start() {}
        public void reverse() {}
        public void stop() {}
    }

    static class AnimatedStateListState extends android.graphics.drawable.StateListDrawable.StateListState {
        private static final long REVERSED_BIT = 4294967296L;
        private static final long REVERSIBLE_FLAG_BIT = 8589934592L;
        int[] mAnimThemeAttrs;
        @android.annotation.UnsupportedAppUsage
        android.util.LongSparseLongArray mTransitions;
        @android.annotation.UnsupportedAppUsage
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
        private static long generateTransitionKey(int p0, int p1) { return 0L; }
    }

    private static class AnimatableTransition extends android.graphics.drawable.AnimatedStateListDrawable.Transition {
        private final android.graphics.drawable.Animatable mA = null;
        public AnimatableTransition(android.graphics.drawable.Animatable p0) { super(); }
        public void start() {}
        public void stop() {}
    }
}
