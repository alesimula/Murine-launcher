package android.graphics.drawable;

public class AnimatedVectorDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable2 {
    private static final java.lang.String LOGTAG = "AnimatedVectorDrawable";
    private static final java.lang.String ANIMATED_VECTOR = "animated-vector";
    private static final java.lang.String TARGET = "target";
    private static final boolean DBG_ANIMATION_VECTOR_DRAWABLE = false;
    private android.graphics.drawable.AnimatedVectorDrawable.VectorDrawableAnimator mAnimatorSet;
    private android.content.res.Resources mRes;
    private android.graphics.drawable.AnimatedVectorDrawable.AnimatedVectorDrawableState mAnimatedVectorState;
    private android.animation.AnimatorSet mAnimatorSetFromXml;
    private boolean mMutated;
    private java.util.ArrayList<android.graphics.drawable.Animatable2.AnimationCallback> mAnimationCallbacks;
    private android.animation.Animator.AnimatorListener mAnimatorListener;
    private final android.graphics.drawable.Drawable.Callback mCallback = null;
    public AnimatedVectorDrawable() { super(); }
    private AnimatedVectorDrawable(android.graphics.drawable.AnimatedVectorDrawable.AnimatedVectorDrawableState p0, android.content.res.Resources p1) { super(); }
    public android.graphics.drawable.Drawable mutate() { return null; }
    public void clearMutated() {}
    private static boolean shouldIgnoreInvalidAnimation() { return false; }
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
    private static void updateAnimatorProperty(android.animation.Animator p0, java.lang.String p1, android.graphics.drawable.VectorDrawable p2, boolean p3) {}
    private static boolean containsSameValueType(android.animation.PropertyValuesHolder p0, android.util.Property p1) { return false; }
    public void forceAnimationOnUI() {}
    private void fallbackOntoUI() {}
    public boolean canApplyTheme() { return false; }
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean isRunning() { return false; }
    public void reset() {}
    public void start() {}
    private void ensureAnimatorSet() {}
    public void stop() {}
    public void reverse() {}
    public boolean canReverse() { return false; }
    public void registerAnimationCallback(android.graphics.drawable.Animatable2.AnimationCallback p0) {}
    private void removeAnimatorSetListener() {}
    public boolean unregisterAnimationCallback(android.graphics.drawable.Animatable2.AnimationCallback p0) { return false; }
    public void clearAnimationCallbacks() {}
    private static native long nCreateAnimatorSet();
    private static native void nSetVectorDrawableTarget(long p0, long p1);
    private static native void nAddAnimator(long p0, long p1, long p2, long p3, long p4, int p5, int p6);
    private static native void nSetPropertyHolderData(long p0, float[] p1, int p2);
    private static native void nSetPropertyHolderData(long p0, int[] p1, int p2);
    private static native void nStart(long p0, android.graphics.drawable.AnimatedVectorDrawable.VectorDrawableAnimatorRT p1, int p2);
    private static native void nReverse(long p0, android.graphics.drawable.AnimatedVectorDrawable.VectorDrawableAnimatorRT p1, int p2);
    private static native long nCreateGroupPropertyHolder(long p0, int p1, float p2, float p3);
    private static native long nCreatePathDataPropertyHolder(long p0, long p1, long p2);
    private static native long nCreatePathColorPropertyHolder(long p0, int p1, int p2, int p3);
    private static native long nCreatePathPropertyHolder(long p0, int p1, float p2, float p3);
    private static native long nCreateRootAlphaPropertyHolder(long p0, float p1, float p2);
    private static native void nEnd(long p0);
    private static native void nReset(long p0);

    private static class AnimatedVectorDrawableState extends android.graphics.drawable.Drawable.ConstantState {
        int mChangingConfigurations;
        android.graphics.drawable.VectorDrawable mVectorDrawable;
        private final boolean mShouldIgnoreInvalidAnim = false;
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
        private android.animation.Animator prepareLocalAnimator(int p0) { return null; }
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
    }

    public static class VectorDrawableAnimatorRT implements android.graphics.drawable.AnimatedVectorDrawable.VectorDrawableAnimator, android.view.NativeVectorDrawableAnimator {
        private static final int START_ANIMATION = 1;
        private static final int REVERSE_ANIMATION = 2;
        private static final int RESET_ANIMATION = 3;
        private static final int END_ANIMATION = 4;
        private static final int MAX_SAMPLE_POINTS = 300;
        private android.os.Handler mHandler;
        private android.animation.Animator.AnimatorListener mListener;
        private final android.util.LongArray mStartDelays = null;
        private android.animation.PropertyValuesHolder.PropertyValues mTmpValues;
        private long mSetPtr;
        private boolean mContainsSequentialAnimators;
        private boolean mStarted;
        private boolean mInitialized;
        private boolean mIsReversible;
        private boolean mIsInfinite;
        private final com.android.internal.util.VirtualRefBasePtr mSetRefBasePtr = null;
        private java.lang.ref.WeakReference<android.graphics.RenderNode> mLastSeenTarget;
        private int mLastListenerId;
        private final android.util.IntArray mPendingAnimationActions = null;
        private final android.graphics.drawable.AnimatedVectorDrawable mDrawable = null;
        VectorDrawableAnimatorRT(android.graphics.drawable.AnimatedVectorDrawable p0) {}
        public void init(android.animation.AnimatorSet p0) {}
        private void parseAnimatorSet(android.animation.AnimatorSet p0, long p1) {}
        private void createRTAnimator(android.animation.ObjectAnimator p0, long p1) {}
        private void createRTAnimatorForGroup(android.animation.PropertyValuesHolder[] p0, android.animation.ObjectAnimator p1, android.graphics.drawable.VectorDrawable.VGroup p2, long p3) {}
        private void createRTAnimatorForPath(android.animation.ObjectAnimator p0, android.graphics.drawable.VectorDrawable.VPath p1, long p2) {}
        private void createRTAnimatorForFullPath(android.animation.ObjectAnimator p0, android.graphics.drawable.VectorDrawable.VFullPath p1, long p2) {}
        private void createRTAnimatorForRootGroup(android.animation.PropertyValuesHolder[] p0, android.animation.ObjectAnimator p1, android.graphics.drawable.VectorDrawable.VectorDrawableState p2, long p3) {}
        private static int getFrameCount(long p0) { return 0; }
        private static float[] createFloatDataPoints(android.animation.PropertyValuesHolder.PropertyValues.DataSource p0, long p1) { return null; }
        private static int[] createIntDataPoints(android.animation.PropertyValuesHolder.PropertyValues.DataSource p0, long p1) { return null; }
        private void createNativeChildAnimator(long p0, long p1, android.animation.ObjectAnimator p2) {}
        protected void recordLastSeenTarget(android.graphics.RecordingCanvas p0) {}
        private void handlePendingAction(int p0) {}
        private boolean useLastSeenTarget() { return false; }
        private boolean useTarget(android.graphics.RenderNode p0) { return false; }
        private void invalidateOwningView() {}
        private void addPendingAction(int p0) {}
        public void start() {}
        public void end() {}
        public void reset() {}
        public void reverse() {}
        private void startAnimation() {}
        private void endAnimation() {}
        private void resetAnimation() {}
        private void reverseAnimation() {}
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
        private void onAnimationEnd(int p0) {}
        private static void callOnFinished(android.graphics.drawable.AnimatedVectorDrawable.VectorDrawableAnimatorRT p0, int p1) {}
        private void transferPendingActions(android.graphics.drawable.AnimatedVectorDrawable.VectorDrawableAnimator p0) {}
    }

    private static class VectorDrawableAnimatorUI implements android.graphics.drawable.AnimatedVectorDrawable.VectorDrawableAnimator {
        private android.animation.AnimatorSet mSet;
        private final android.graphics.drawable.Drawable mDrawable = null;
        private java.util.ArrayList<android.animation.Animator.AnimatorListener> mListenerArray;
        private boolean mIsInfinite;
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
        private void invalidateOwningView() {}
    }
}
