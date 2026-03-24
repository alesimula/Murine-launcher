package android.view.animation;

public abstract class Animation implements java.lang.Cloneable {
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    public static final int START_ON_FIRST_FRAME = -1;
    public static final int ABSOLUTE = 0;
    public static final int RELATIVE_TO_SELF = 1;
    public static final int RELATIVE_TO_PARENT = 2;
    public static final int ZORDER_NORMAL = 0;
    public static final int ZORDER_TOP = 1;
    public static final int ZORDER_BOTTOM = -1;
    boolean mEnded;
    boolean mStarted;
    boolean mCycleFlip;
    boolean mInitialized;
    boolean mFillBefore;
    boolean mFillAfter;
    boolean mFillEnabled;
    long mStartTime;
    long mStartOffset;
    long mDuration;
    int mRepeatCount;
    int mRepeated;
    int mRepeatMode;
    android.view.animation.Interpolator mInterpolator;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=117519981L)
    private android.view.animation.Animation.AnimationListener mListener;
    private int mZAdjustment;
    private int mBackgroundColor;
    private float mScaleFactor;
    private boolean mShowWallpaper;
    private boolean mHasRoundedCorners;
    private boolean mMore;
    private boolean mOneMoreTime;
    @android.annotation.UnsupportedAppUsage
    android.graphics.RectF mPreviousRegion;
    @android.annotation.UnsupportedAppUsage
    android.graphics.RectF mRegion;
    @android.annotation.UnsupportedAppUsage
    android.view.animation.Transformation mTransformation;
    @android.annotation.UnsupportedAppUsage
    android.view.animation.Transformation mPreviousTransformation;
    private android.os.Handler mListenerHandler;
    private java.lang.Runnable mOnStart;
    private java.lang.Runnable mOnRepeat;
    private java.lang.Runnable mOnEnd;
    public Animation() {}
    public Animation(android.content.Context p0, android.util.AttributeSet p1) {}
    protected android.view.animation.Animation clone() throws java.lang.CloneNotSupportedException { return null; }
    public void reset() {}
    public void cancel() {}
    @android.annotation.UnsupportedAppUsage
    public void detach() {}
    public boolean isInitialized() { return false; }
    public void initialize(int p0, int p1, int p2, int p3) {}
    public void setListenerHandler(android.os.Handler p0) {}
    public void setInterpolator(android.content.Context p0, int p1) {}
    public void setInterpolator(android.view.animation.Interpolator p0) {}
    public void setStartOffset(long p0) {}
    public void setDuration(long p0) {}
    public void restrictDuration(long p0) {}
    public void scaleCurrentDuration(float p0) {}
    public void setStartTime(long p0) {}
    public void start() {}
    public void startNow() {}
    public void setRepeatMode(int p0) {}
    public void setRepeatCount(int p0) {}
    public boolean isFillEnabled() { return false; }
    public void setFillEnabled(boolean p0) {}
    public void setFillBefore(boolean p0) {}
    public void setFillAfter(boolean p0) {}
    public void setZAdjustment(int p0) {}
    public void setBackgroundColor(int p0) {}
    protected float getScaleFactor() { return 0.0f; }
    public void setDetachWallpaper(boolean p0) {}
    public void setShowWallpaper(boolean p0) {}
    public void setHasRoundedCorners(boolean p0) {}
    public android.view.animation.Interpolator getInterpolator() { return null; }
    public long getStartTime() { return 0L; }
    public long getDuration() { return 0L; }
    public long getStartOffset() { return 0L; }
    public int getRepeatMode() { return 0; }
    public int getRepeatCount() { return 0; }
    public boolean getFillBefore() { return false; }
    public boolean getFillAfter() { return false; }
    public int getZAdjustment() { return 0; }
    public int getBackgroundColor() { return 0; }
    public boolean getDetachWallpaper() { return false; }
    public boolean getShowWallpaper() { return false; }
    public boolean hasRoundedCorners() { return false; }
    public boolean willChangeTransformationMatrix() { return false; }
    public boolean willChangeBounds() { return false; }
    private boolean hasAnimationListener() { return false; }
    public void setAnimationListener(android.view.animation.Animation.AnimationListener p0) {}
    protected void ensureInterpolator() {}
    public long computeDurationHint() { return 0L; }
    public boolean getTransformation(long p0, android.view.animation.Transformation p1) { return false; }
    private boolean isCanceled() { return false; }
    private void fireAnimationStart() {}
    private void fireAnimationRepeat() {}
    private void fireAnimationEnd() {}
    void dispatchAnimationStart() {}
    void dispatchAnimationRepeat() {}
    void dispatchAnimationEnd() {}
    public boolean getTransformation(long p0, android.view.animation.Transformation p1, float p2) { return false; }
    public boolean hasStarted() { return false; }
    public boolean hasEnded() { return false; }
    protected void applyTransformation(float p0, android.view.animation.Transformation p1) {}
    protected float resolveSize(int p0, float p1, int p2, int p3) { return 0.0f; }
    @android.annotation.UnsupportedAppUsage
    public void getInvalidateRegion(int p0, int p1, int p2, int p3, android.graphics.RectF p4, android.view.animation.Transformation p5) {}
    @android.annotation.UnsupportedAppUsage
    public void initializeInvalidateRegion(int p0, int p1, int p2, int p3) {}
    protected void finalize() throws java.lang.Throwable {}
    public boolean hasAlpha() { return false; }

    private static class NoImagePreloadHolder {
        public static final boolean USE_CLOSEGUARD = Boolean.valueOf(false);
        private NoImagePreloadHolder() {}
    }

    protected static class Description {
        public int type;
        public float value;
        protected Description() {}
        static android.view.animation.Animation.Description parseValue(android.util.TypedValue p0) { return null; }
    }

    public static interface AnimationListener {
        public void onAnimationStart(android.view.animation.Animation p0);
        public void onAnimationEnd(android.view.animation.Animation p0);
        public void onAnimationRepeat(android.view.animation.Animation p0);
    }
}
