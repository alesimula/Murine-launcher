package android.graphics.drawable;

public class DrawableContainer extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "DrawableContainer";
    private static final boolean DEFAULT_DITHER = true;
    @android.annotation.UnsupportedAppUsage
    private android.graphics.drawable.DrawableContainer.DrawableContainerState mDrawableContainerState;
    private android.graphics.Rect mHotspotBounds;
    private android.graphics.drawable.Drawable mCurrDrawable;
    @android.annotation.UnsupportedAppUsage
    private android.graphics.drawable.Drawable mLastDrawable;
    private int mAlpha;
    private boolean mHasAlpha;
    private int mCurIndex;
    private int mLastIndex;
    private boolean mMutated;
    private java.lang.Runnable mAnimationRunnable;
    private long mEnterAnimationEnd;
    private long mExitAnimationEnd;
    private android.graphics.drawable.DrawableContainer.BlockInvalidateCallback mBlockInvalidateCallback;
    public DrawableContainer() { super(); }
    public void draw(android.graphics.Canvas p0) {}
    public int getChangingConfigurations() { return 0; }
    private boolean needsMirroring() { return false; }
    public boolean getPadding(android.graphics.Rect p0) { return false; }
    public android.graphics.Insets getOpticalInsets() { return null; }
    public void getOutline(android.graphics.Outline p0) {}
    public void setAlpha(int p0) {}
    public int getAlpha() { return 0; }
    public void setDither(boolean p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public void setTintList(android.content.res.ColorStateList p0) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    public void setEnterFadeDuration(int p0) {}
    public void setExitFadeDuration(int p0) {}
    protected void onBoundsChange(android.graphics.Rect p0) {}
    public boolean isStateful() { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    public void setAutoMirrored(boolean p0) {}
    public boolean isAutoMirrored() { return false; }
    public void jumpToCurrentState() {}
    public void setHotspot(float p0, float p1) {}
    public void setHotspotBounds(int p0, int p1, int p2, int p3) {}
    public void getHotspotBounds(android.graphics.Rect p0) {}
    protected boolean onStateChange(int[] p0) { return false; }
    protected boolean onLevelChange(int p0) { return false; }
    public boolean onLayoutDirectionChanged(int p0) { return false; }
    public int getIntrinsicWidth() { return 0; }
    public int getIntrinsicHeight() { return 0; }
    public int getMinimumWidth() { return 0; }
    public int getMinimumHeight() { return 0; }
    public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
    public void scheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1, long p2) {}
    public void unscheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public int getOpacity() { return 0; }
    public void setCurrentIndex(int p0) {}
    public int getCurrentIndex() { return 0; }
    public boolean selectDrawable(int p0) { return false; }
    private void initializeDrawableForDisplay(android.graphics.drawable.Drawable p0) {}
    void animate(boolean p0) {}
    public android.graphics.drawable.Drawable getCurrent() { return null; }
    protected final void updateDensity(android.content.res.Resources p0) {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    android.graphics.drawable.DrawableContainer.DrawableContainerState cloneConstantState() { return null; }
    public void clearMutated() {}
    protected void setConstantState(android.graphics.drawable.DrawableContainer.DrawableContainerState p0) {}

    public static abstract class DrawableContainerState extends android.graphics.drawable.Drawable.ConstantState {
        final android.graphics.drawable.DrawableContainer mOwner = null;
        android.content.res.Resources mSourceRes;
        int mDensity;
        int mChangingConfigurations;
        int mChildrenChangingConfigurations;
        android.util.SparseArray<android.graphics.drawable.Drawable.ConstantState> mDrawableFutures;
        @android.annotation.UnsupportedAppUsage
        android.graphics.drawable.Drawable[] mDrawables;
        int mNumChildren;
        boolean mVariablePadding;
        boolean mCheckedPadding;
        @android.annotation.UnsupportedAppUsage
        android.graphics.Rect mConstantPadding;
        boolean mConstantSize;
        boolean mCheckedConstantSize;
        int mConstantWidth;
        int mConstantHeight;
        int mConstantMinimumWidth;
        int mConstantMinimumHeight;
        boolean mCheckedOpacity;
        int mOpacity;
        boolean mCheckedStateful;
        boolean mStateful;
        boolean mCheckedConstantState;
        boolean mCanConstantState;
        boolean mDither;
        boolean mMutated;
        int mLayoutDirection;
        int mEnterFadeDuration;
        int mExitFadeDuration;
        boolean mAutoMirrored;
        android.graphics.ColorFilter mColorFilter;
        @android.annotation.UnsupportedAppUsage
        boolean mHasColorFilter;
        android.content.res.ColorStateList mTintList;
        android.graphics.BlendMode mBlendMode;
        boolean mHasTintList;
        boolean mHasTintMode;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        protected DrawableContainerState(android.graphics.drawable.DrawableContainer.DrawableContainerState p0, android.graphics.drawable.DrawableContainer p1, android.content.res.Resources p2) { super(); }
        public int getChangingConfigurations() { return 0; }
        public final int addChild(android.graphics.drawable.Drawable p0) { return 0; }
        void invalidateCache() {}
        final int getCapacity() { return 0; }
        private void createAllFutures() {}
        private android.graphics.drawable.Drawable prepareDrawable(android.graphics.drawable.Drawable p0) { return null; }
        public final int getChildCount() { return 0; }
        public final android.graphics.drawable.Drawable[] getChildren() { return null; }
        public final android.graphics.drawable.Drawable getChild(int p0) { return null; }
        final boolean setLayoutDirection(int p0, int p1) { return false; }
        final void updateDensity(android.content.res.Resources p0) {}
        final void applyTheme(android.content.res.Resources.Theme p0) {}
        public boolean canApplyTheme() { return false; }
        private void mutate() {}
        final void clearMutated() {}
        public final void setVariablePadding(boolean p0) {}
        public final android.graphics.Rect getConstantPadding() { return null; }
        public final void setConstantSize(boolean p0) {}
        public final boolean isConstantSize() { return false; }
        public final int getConstantWidth() { return 0; }
        public final int getConstantHeight() { return 0; }
        public final int getConstantMinimumWidth() { return 0; }
        public final int getConstantMinimumHeight() { return 0; }
        protected void computeConstantSize() {}
        public final void setEnterFadeDuration(int p0) {}
        public final int getEnterFadeDuration() { return 0; }
        public final void setExitFadeDuration(int p0) {}
        public final int getExitFadeDuration() { return 0; }
        public final int getOpacity() { return 0; }
        public final boolean isStateful() { return false; }
        public void growArray(int p0, int p1) {}
        public synchronized boolean canConstantState() { return false; }
    }

    private static class BlockInvalidateCallback implements android.graphics.drawable.Drawable.Callback {
        private android.graphics.drawable.Drawable.Callback mCallback;
        private BlockInvalidateCallback() {}
        public android.graphics.drawable.DrawableContainer.BlockInvalidateCallback wrap(android.graphics.drawable.Drawable.Callback p0) { return null; }
        public android.graphics.drawable.Drawable.Callback unwrap() { return null; }
        public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
        public void scheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1, long p2) {}
        public void unscheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1) {}
    }
}
