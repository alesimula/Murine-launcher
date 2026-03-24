package com.android.internal.widget;

public class LockPatternView extends android.view.View {
    private static final int ASPECT_SQUARE = 0;
    private static final int ASPECT_LOCK_WIDTH = 1;
    private static final int ASPECT_LOCK_HEIGHT = 2;
    private static final boolean PROFILE_DRAWING = false;
    private static final float LINE_FADE_ALPHA_MULTIPLIER = 1.5f;
    private final com.android.internal.widget.LockPatternView.CellState[][] mCellStates = null;
    private final int mDotSize = 0;
    private final int mDotSizeActivated = 0;
    private final int mPathWidth = 0;
    private boolean mDrawingProfilingStarted;
    @android.annotation.UnsupportedAppUsage
    private final android.graphics.Paint mPaint = null;
    @android.annotation.UnsupportedAppUsage
    private final android.graphics.Paint mPathPaint = null;
    private static final int MILLIS_PER_CIRCLE_ANIMATING = 700;
    private static final float DRAG_THRESHHOLD = 0.0f;
    public static final int VIRTUAL_BASE_VIEW_ID = 1;
    public static final boolean DEBUG_A11Y = false;
    private static final java.lang.String TAG = "LockPatternView";
    private com.android.internal.widget.LockPatternView.OnPatternListener mOnPatternListener;
    @android.annotation.UnsupportedAppUsage
    private final java.util.ArrayList<com.android.internal.widget.LockPatternView.Cell> mPattern = null;
    private final boolean[][] mPatternDrawLookup = null;
    private float mInProgressX;
    private float mInProgressY;
    private long mAnimatingPeriodStart;
    private long[] mLineFadeStart;
    @android.annotation.UnsupportedAppUsage
    private com.android.internal.widget.LockPatternView.DisplayMode mPatternDisplayMode;
    private boolean mInputEnabled;
    @android.annotation.UnsupportedAppUsage
    private boolean mInStealthMode;
    private boolean mEnableHapticFeedback;
    @android.annotation.UnsupportedAppUsage
    private boolean mPatternInProgress;
    private boolean mFadePattern;
    private float mHitFactor;
    @android.annotation.UnsupportedAppUsage
    private float mSquareWidth;
    @android.annotation.UnsupportedAppUsage
    private float mSquareHeight;
    private final android.graphics.Path mCurrentPath = null;
    private final android.graphics.Rect mInvalidate = null;
    private final android.graphics.Rect mTmpInvalidateRect = null;
    private int mAspect;
    private int mRegularColor;
    private int mErrorColor;
    private int mSuccessColor;
    private final android.view.animation.Interpolator mFastOutSlowInInterpolator = null;
    private final android.view.animation.Interpolator mLinearOutSlowInInterpolator = null;
    private com.android.internal.widget.LockPatternView.PatternExploreByTouchHelper mExploreByTouchHelper;
    private android.media.AudioManager mAudioManager;
    private android.graphics.drawable.Drawable mSelectedDrawable;
    private android.graphics.drawable.Drawable mNotSelectedDrawable;
    private boolean mUseLockPatternDrawable;
    public LockPatternView(android.content.Context p0) { super((android.content.Context)null); }
    @android.annotation.UnsupportedAppUsage
    public LockPatternView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    @android.annotation.UnsupportedAppUsage
    public com.android.internal.widget.LockPatternView.CellState[][] getCellStates() { return null; }
    public boolean isInStealthMode() { return false; }
    public boolean isTactileFeedbackEnabled() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setInStealthMode(boolean p0) {}
    public void setFadePattern(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setTactileFeedbackEnabled(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setOnPatternListener(com.android.internal.widget.LockPatternView.OnPatternListener p0) {}
    public void setPattern(com.android.internal.widget.LockPatternView.DisplayMode p0, java.util.List<com.android.internal.widget.LockPatternView.Cell> p1) {}
    @android.annotation.UnsupportedAppUsage
    public void setDisplayMode(com.android.internal.widget.LockPatternView.DisplayMode p0) {}
    public void startCellStateAnimation(com.android.internal.widget.LockPatternView.CellState p0, float p1, float p2, float p3, float p4, float p5, float p6, long p7, long p8, android.view.animation.Interpolator p9, java.lang.Runnable p10) {}
    private void startCellStateAnimationSw(com.android.internal.widget.LockPatternView.CellState p0, float p1, float p2, float p3, float p4, float p5, float p6, long p7, long p8, android.view.animation.Interpolator p9, java.lang.Runnable p10) {}
    private void startCellStateAnimationHw(com.android.internal.widget.LockPatternView.CellState p0, float p1, float p2, float p3, float p4, float p5, float p6, long p7, long p8, android.view.animation.Interpolator p9, java.lang.Runnable p10) {}
    private void startRtAlphaAnimation(com.android.internal.widget.LockPatternView.CellState p0, float p1, long p2, long p3, android.view.animation.Interpolator p4, android.animation.Animator.AnimatorListener p5) {}
    private void startRtFloatAnimation(android.graphics.CanvasProperty<java.lang.Float> p0, float p1, long p2, long p3, android.view.animation.Interpolator p4) {}
    private void notifyCellAdded() {}
    private void notifyPatternStarted() {}
    @android.annotation.UnsupportedAppUsage
    private void notifyPatternDetected() {}
    private void notifyPatternCleared() {}
    @android.annotation.UnsupportedAppUsage
    public void clearPattern() {}
    protected boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    private void resetPattern() {}
    public boolean isEmpty() { return false; }
    private void clearPatternDrawLookup() {}
    @android.annotation.UnsupportedAppUsage
    public void disableInput() {}
    @android.annotation.UnsupportedAppUsage
    public void enableInput() {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    private int resolveMeasured(int p0, int p1) { return 0; }
    protected void onMeasure(int p0, int p1) {}
    private com.android.internal.widget.LockPatternView.Cell detectAndAddHit(float p0, float p1) { return null; }
    private void addCellToPattern(com.android.internal.widget.LockPatternView.Cell p0) {}
    private void startCellActivatedAnimation(com.android.internal.widget.LockPatternView.Cell p0) {}
    private void startLineEndAnimation(com.android.internal.widget.LockPatternView.CellState p0, float p1, float p2, float p3, float p4) {}
    private void startRadiusAnimation(float p0, float p1, long p2, android.view.animation.Interpolator p3, com.android.internal.widget.LockPatternView.CellState p4, java.lang.Runnable p5) {}
    private com.android.internal.widget.LockPatternView.Cell checkForNewHit(float p0, float p1) { return null; }
    private int getRowHit(float p0) { return 0; }
    private int getColumnHit(float p0) { return 0; }
    public boolean onHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    private void setPatternInProgress(boolean p0) {}
    private void handleActionMove(android.view.MotionEvent p0) {}
    private void sendAccessEvent(int p0) {}
    private void handleActionUp() {}
    private void cancelLineAnimations() {}
    private void handleActionDown(android.view.MotionEvent p0) {}
    private float getCenterXForColumn(int p0) { return 0.0f; }
    private float getCenterYForRow(int p0) { return 0.0f; }
    protected void onDraw(android.graphics.Canvas p0) {}
    private float calculateLastSegmentAlpha(float p0, float p1, float p2, float p3) { return 0.0f; }
    private int getCurrentColor(boolean p0) { return 0; }
    private void drawCircle(android.graphics.Canvas p0, float p1, float p2, float p3, boolean p4, float p5) {}
    private void drawCellDrawable(android.graphics.Canvas p0, int p1, int p2, float p3, boolean p4) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}

    private static class SavedState extends android.view.View.BaseSavedState {
        private final java.lang.String mSerializedPattern = null;
        private final int mDisplayMode = 0;
        private final boolean mInputEnabled = false;
        private final boolean mInStealthMode = false;
        private final boolean mTactileFeedbackEnabled = false;
        public static final android.os.Parcelable.Creator<com.android.internal.widget.LockPatternView.SavedState> CREATOR = null;
        @android.annotation.UnsupportedAppUsage
        private SavedState(android.os.Parcelable p0, java.lang.String p1, int p2, boolean p3, boolean p4, boolean p5) { super((android.os.Parcel)null); }
        @android.annotation.UnsupportedAppUsage
        private SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public java.lang.String getSerializedPattern() { return null; }
        public int getDisplayMode() { return 0; }
        public boolean isInputEnabled() { return false; }
        public boolean isInStealthMode() { return false; }
        public boolean isTactileFeedbackEnabled() { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private final class PatternExploreByTouchHelper extends com.android.internal.widget.ExploreByTouchHelper {
        private android.graphics.Rect mTempRect;
        private final android.util.SparseArray<com.android.internal.widget.LockPatternView.PatternExploreByTouchHelper.VirtualViewContainer> mItems = null;
        public PatternExploreByTouchHelper(com.android.internal.widget.LockPatternView p0, android.view.View p1) { super(null); }
        protected int getVirtualViewAt(float p0, float p1) { return 0; }
        protected void getVisibleVirtualViews(android.util.IntArray p0) {}
        protected void onPopulateEventForVirtualView(int p0, android.view.accessibility.AccessibilityEvent p1) {}
        public void onPopulateAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) {}
        protected void onPopulateNodeForVirtualView(int p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
        private boolean isClickable(int p0) { return false; }
        protected boolean onPerformActionForVirtualView(int p0, int p1, android.os.Bundle p2) { return false; }
        boolean onItemClicked(int p0) { return false; }
        private android.graphics.Rect getBoundsForVirtualView(int p0) { return null; }
        private java.lang.CharSequence getTextForVirtualView(int p0) { return null; }
        private int getVirtualViewIdForHit(float p0, float p1) { return 0; }

        class VirtualViewContainer {
            java.lang.CharSequence description;
            public VirtualViewContainer(com.android.internal.widget.LockPatternView.PatternExploreByTouchHelper p0, java.lang.CharSequence p1) {}
        }
    }

    public static interface OnPatternListener {
        public void onPatternStart();
        public void onPatternCleared();
        public void onPatternCellAdded(java.util.List<com.android.internal.widget.LockPatternView.Cell> p0);
        public void onPatternDetected(java.util.List<com.android.internal.widget.LockPatternView.Cell> p0);
    }

    public static enum DisplayMode {
        Correct,
        Animate,
        Wrong;
        private DisplayMode() {}
    }

    public static class CellState {
        int row;
        int col;
        boolean hwAnimating;
        android.graphics.CanvasProperty<java.lang.Float> hwRadius;
        android.graphics.CanvasProperty<java.lang.Float> hwCenterX;
        android.graphics.CanvasProperty<java.lang.Float> hwCenterY;
        android.graphics.CanvasProperty<android.graphics.Paint> hwPaint;
        float radius;
        float translationY;
        float alpha;
        public float lineEndX;
        public float lineEndY;
        public android.animation.ValueAnimator lineAnimator;
        public CellState() {}
    }

    public static final class Cell {
        @android.annotation.UnsupportedAppUsage
        final int row = 0;
        @android.annotation.UnsupportedAppUsage
        final int column = 0;
        private static final com.android.internal.widget.LockPatternView.Cell[][] sCells = null;
        private static com.android.internal.widget.LockPatternView.Cell[][] createCells() { return null; }
        private Cell(int p0, int p1) {}
        public int getRow() { return 0; }
        public int getColumn() { return 0; }
        public static com.android.internal.widget.LockPatternView.Cell of(int p0, int p1) { return null; }
        private static void checkRange(int p0, int p1) {}
        public java.lang.String toString() { return null; }
    }
}
