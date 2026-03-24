package android.widget;

@android.widget.RemoteViews.RemoteView
public class ProgressBar extends android.view.View {
    private static final int MAX_LEVEL = 10000;
    private static final android.view.animation.DecelerateInterpolator PROGRESS_ANIM_INTERPOLATOR = null;
    private static final int PROGRESS_ANIM_DURATION = 80;
    int mMinWidth;
    int mMaxWidth;
    int mMinHeight;
    int mMaxHeight;
    private int mProgress;
    private int mSecondaryProgress;
    private int mMin;
    private boolean mMinInitialized;
    private int mMax;
    private boolean mMaxInitialized;
    private int mBehavior;
    private int mDuration;
    private boolean mIndeterminate;
    private boolean mOnlyIndeterminate;
    private android.view.animation.Transformation mTransformation;
    private android.view.animation.AlphaAnimation mAnimation;
    private boolean mHasAnimation;
    private android.graphics.drawable.Drawable mIndeterminateDrawable;
    private android.graphics.drawable.Drawable mProgressDrawable;
    private android.graphics.drawable.Drawable mCurrentDrawable;
    private android.widget.ProgressBar.ProgressTintInfo mProgressTintInfo;
    int mSampleWidth;
    private boolean mNoInvalidate;
    private android.view.animation.Interpolator mInterpolator;
    private android.widget.ProgressBar.RefreshProgressRunnable mRefreshProgressRunnable;
    private long mUiThreadId;
    private boolean mShouldStartAnimationDrawable;
    private boolean mInDrawing;
    private boolean mAttached;
    private boolean mRefreshIsPosted;
    private float mVisualProgress;
    boolean mMirrorForRtl;
    private boolean mAggregatedIsVisible;
    private java.lang.CharSequence mCustomStateDescription;
    private final java.util.ArrayList<android.widget.ProgressBar.RefreshData> mRefreshData = null;
    private android.animation.ObjectAnimator mLastProgressAnimator;
    private java.text.NumberFormat mPercentFormat;
    private java.util.Locale mCachedLocale;
    private final android.util.FloatProperty<android.widget.ProgressBar> VISUAL_PROGRESS = null;
    public ProgressBar(android.content.Context p0) { super((android.content.Context)null); }
    public ProgressBar(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ProgressBar(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ProgressBar(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void setMinWidth(int p0) {}
    public int getMinWidth() { return 0; }
    public void setMaxWidth(int p0) {}
    public int getMaxWidth() { return 0; }
    public void setMinHeight(int p0) {}
    public int getMinHeight() { return 0; }
    public void setMaxHeight(int p0) {}
    public int getMaxHeight() { return 0; }
    private static boolean needsTileify(android.graphics.drawable.Drawable p0) { return false; }
    private android.graphics.drawable.Drawable tileify(android.graphics.drawable.Drawable p0, boolean p1) { return null; }
    android.graphics.drawable.shapes.Shape getDrawableShape() { return null; }
    private android.graphics.drawable.Drawable tileifyIndeterminate(android.graphics.drawable.Drawable p0) { return null; }
    private void initProgressBar() {}
    @android.view.ViewDebug.ExportedProperty(category="progress")
    public synchronized boolean isIndeterminate() { return false; }
    @android.view.RemotableViewMethod
    public synchronized void setIndeterminate(boolean p0) {}
    private void swapCurrentDrawable(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getIndeterminateDrawable() { return null; }
    public void setIndeterminateDrawable(android.graphics.drawable.Drawable p0) {}
    @android.view.RemotableViewMethod
    public void setIndeterminateTintList(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getIndeterminateTintList() { return null; }
    public void setIndeterminateTintMode(android.graphics.PorterDuff.Mode p0) {}
    @android.view.RemotableViewMethod
    public void setIndeterminateTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.PorterDuff.Mode getIndeterminateTintMode() { return null; }
    public android.graphics.BlendMode getIndeterminateTintBlendMode() { return null; }
    private void applyIndeterminateTint() {}
    public void setIndeterminateDrawableTiled(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getProgressDrawable() { return null; }
    public void setProgressDrawable(android.graphics.drawable.Drawable p0) {}
    public boolean getMirrorForRtl() { return false; }
    private void applyProgressTints() {}
    private void applyPrimaryProgressTint() {}
    private void applyProgressBackgroundTint() {}
    private void applySecondaryProgressTint() {}
    @android.view.RemotableViewMethod
    public void setProgressTintList(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getProgressTintList() { return null; }
    public void setProgressTintMode(android.graphics.PorterDuff.Mode p0) {}
    @android.view.RemotableViewMethod
    public void setProgressTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.PorterDuff.Mode getProgressTintMode() { return null; }
    public android.graphics.BlendMode getProgressTintBlendMode() { return null; }
    @android.view.RemotableViewMethod
    public void setProgressBackgroundTintList(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getProgressBackgroundTintList() { return null; }
    public void setProgressBackgroundTintMode(android.graphics.PorterDuff.Mode p0) {}
    @android.view.RemotableViewMethod
    public void setProgressBackgroundTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.PorterDuff.Mode getProgressBackgroundTintMode() { return null; }
    public android.graphics.BlendMode getProgressBackgroundTintBlendMode() { return null; }
    @android.view.RemotableViewMethod
    public void setSecondaryProgressTintList(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getSecondaryProgressTintList() { return null; }
    public void setSecondaryProgressTintMode(android.graphics.PorterDuff.Mode p0) {}
    @android.view.RemotableViewMethod
    public void setSecondaryProgressTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.PorterDuff.Mode getSecondaryProgressTintMode() { return null; }
    public android.graphics.BlendMode getSecondaryProgressTintBlendMode() { return null; }
    private android.graphics.drawable.Drawable getTintTarget(int p0, boolean p1) { return null; }
    public void setProgressDrawableTiled(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getCurrentDrawable() { return null; }
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    public void jumpDrawablesToCurrentState() {}
    public void onResolveDrawables(int p0) {}
    public void postInvalidate() {}
    private synchronized void doRefreshProgress(int p0, int p1, boolean p2, boolean p3, boolean p4) {}
    private float getPercent(int p0) { return 0.0f; }
    private java.lang.CharSequence formatStateDescription(int p0) { return null; }
    @android.view.RemotableViewMethod
    public void setStateDescription(java.lang.CharSequence p0) {}
    void onProgressRefresh(float p0, boolean p1, int p2) {}
    private void setVisualProgress(int p0, float p1) {}
    void onVisualProgressChanged(int p0, float p1) {}
    private synchronized void refreshProgress(int p0, int p1, boolean p2, boolean p3) {}
    @android.view.RemotableViewMethod
    public synchronized void setProgress(int p0) {}
    public void setProgress(int p0, boolean p1) {}
    @android.view.RemotableViewMethod
    synchronized boolean setProgressInternal(int p0, boolean p1, boolean p2) { return false; }
    @android.view.RemotableViewMethod
    public synchronized void setSecondaryProgress(int p0) {}
    @android.view.ViewDebug.ExportedProperty(category="progress")
    public synchronized int getProgress() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="progress")
    public synchronized int getSecondaryProgress() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="progress")
    public synchronized int getMin() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="progress")
    public synchronized int getMax() { return 0; }
    @android.view.RemotableViewMethod
    public synchronized void setMin(int p0) {}
    @android.view.RemotableViewMethod
    public synchronized void setMax(int p0) {}
    public final synchronized void incrementProgressBy(int p0) {}
    public final synchronized void incrementSecondaryProgressBy(int p0) {}
    void startAnimation() {}
    void stopAnimation() {}
    public void setInterpolator(android.content.Context p0, int p1) {}
    public void setInterpolator(android.view.animation.Interpolator p0) {}
    public android.view.animation.Interpolator getInterpolator() { return null; }
    public void onVisibilityAggregated(boolean p0) {}
    public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    private void updateDrawableBounds(int p0, int p1) {}
    protected synchronized void onDraw(android.graphics.Canvas p0) {}
    void drawTrack(android.graphics.Canvas p0) {}
    protected synchronized void onMeasure(int p0, int p1) {}
    protected void drawableStateChanged() {}
    private void updateDrawableState() {}
    public void drawableHotspotChanged(float p0, float p1) {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    public boolean isAnimating() { return false; }

    private static class ProgressTintInfo {
        android.content.res.ColorStateList mIndeterminateTintList;
        android.graphics.BlendMode mIndeterminateBlendMode;
        boolean mHasIndeterminateTint;
        boolean mHasIndeterminateTintMode;
        android.content.res.ColorStateList mProgressTintList;
        android.graphics.BlendMode mProgressBlendMode;
        boolean mHasProgressTint;
        boolean mHasProgressTintMode;
        android.content.res.ColorStateList mProgressBackgroundTintList;
        android.graphics.BlendMode mProgressBackgroundBlendMode;
        boolean mHasProgressBackgroundTint;
        boolean mHasProgressBackgroundTintMode;
        android.content.res.ColorStateList mSecondaryProgressTintList;
        android.graphics.BlendMode mSecondaryProgressBlendMode;
        boolean mHasSecondaryProgressTint;
        boolean mHasSecondaryProgressTintMode;
        private ProgressTintInfo() {}
    }

    private static class RefreshData {
        private static final int POOL_MAX = 24;
        private static final android.util.Pools.SynchronizedPool<android.widget.ProgressBar.RefreshData> sPool = null;
        public int id;
        public int progress;
        public boolean fromUser;
        public boolean animate;
        private RefreshData() {}
        public static android.widget.ProgressBar.RefreshData obtain(int p0, int p1, boolean p2, boolean p3) { return null; }
        public void recycle() {}
    }

    private class RefreshProgressRunnable implements java.lang.Runnable {
        private RefreshProgressRunnable(android.widget.ProgressBar p0) {}
        public void run() {}
    }

    static class SavedState extends android.view.View.BaseSavedState {
        int progress;
        int secondaryProgress;
        public static final android.os.Parcelable.Creator<android.widget.ProgressBar.SavedState> CREATOR = null;
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        private SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.ProgressBar> {
        private boolean mPropertiesMapped;
        private int mIndeterminateId;
        private int mIndeterminateDrawableId;
        private int mIndeterminateTintId;
        private int mIndeterminateTintBlendModeId;
        private int mIndeterminateTintModeId;
        private int mInterpolatorId;
        private int mMaxId;
        private int mMinId;
        private int mMirrorForRtlId;
        private int mProgressId;
        private int mProgressBackgroundTintId;
        private int mProgressBackgroundTintBlendModeId;
        private int mProgressBackgroundTintModeId;
        private int mProgressDrawableId;
        private int mProgressTintId;
        private int mProgressTintBlendModeId;
        private int mProgressTintModeId;
        private int mSecondaryProgressId;
        private int mSecondaryProgressTintId;
        private int mSecondaryProgressTintBlendModeId;
        private int mSecondaryProgressTintModeId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.ProgressBar p0, android.view.inspector.PropertyReader p1) {}
    }
}
