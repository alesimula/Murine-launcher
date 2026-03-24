package com.android.internal.widget;

public class ResolverDrawerLayout extends android.view.ViewGroup {
    private static final java.lang.String TAG = "ResolverDrawerLayout";
    private com.android.internal.logging.MetricsLogger mMetricsLogger;
    private int mMaxWidth;
    private int mMaxCollapsedHeight;
    private int mMaxCollapsedHeightSmall;
    private final boolean mIsMaxCollapsedHeightSmallExplicit = false;
    private boolean mSmallCollapsed;
    private float mCollapseOffset;
    private float mDragRemainder;
    private int mCollapsibleHeight;
    private int mUncollapsibleHeight;
    private int mAlwaysShowHeight;
    private int mCollapsibleHeightReserved;
    private int mTopOffset;
    private boolean mShowAtTop;
    private boolean mIsDragging;
    private boolean mOpenOnClick;
    private boolean mOpenOnLayout;
    private boolean mDismissOnScrollerFinished;
    private final int mTouchSlop = 0;
    private final float mMinFlingVelocity = 0.0f;
    private final android.widget.OverScroller mScroller = null;
    private final android.view.VelocityTracker mVelocityTracker = null;
    private android.graphics.drawable.Drawable mScrollIndicatorDrawable;
    private com.android.internal.widget.ResolverDrawerLayout.OnDismissedListener mOnDismissedListener;
    private com.android.internal.widget.ResolverDrawerLayout.RunOnDismissedListener mRunOnDismissedListener;
    private com.android.internal.widget.ResolverDrawerLayout.OnCollapsedChangedListener mOnCollapsedChangedListener;
    private boolean mDismissLocked;
    private float mInitialTouchX;
    private float mInitialTouchY;
    private float mLastTouchY;
    private int mActivePointerId;
    private final android.graphics.Rect mTempRect = null;
    private android.widget.AbsListView mNestedListChild;
    private com.android.internal.widget.RecyclerView mNestedRecyclerChild;
    private final android.view.ViewTreeObserver.OnTouchModeChangeListener mTouchModeChangeListener = null;
    public ResolverDrawerLayout(android.content.Context p0) { super((android.content.Context)null); }
    public ResolverDrawerLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ResolverDrawerLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public void setMaxCollapsedHeight(int p0) {}
    public void setSmallCollapsed(boolean p0) {}
    public boolean isSmallCollapsed() { return false; }
    public boolean isCollapsed() { return false; }
    public void setShowAtTop(boolean p0) {}
    public boolean getShowAtTop() { return false; }
    public void setCollapsed(boolean p0) {}
    public void setCollapsibleHeightReserved(int p0) {}
    public void setDismissLocked(boolean p0) {}
    private boolean isMoving() { return false; }
    private boolean isDragging() { return false; }
    private boolean updateCollapseOffset(int p0, boolean p1) { return false; }
    private int getMaxCollapsedHeight() { return 0; }
    public void setOnDismissedListener(com.android.internal.widget.ResolverDrawerLayout.OnDismissedListener p0) {}
    private boolean isDismissable() { return false; }
    public void setOnCollapsedChangedListener(com.android.internal.widget.ResolverDrawerLayout.OnCollapsedChangedListener p0) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    private boolean isNestedListChildScrolled() { return false; }
    private boolean isNestedRecyclerChildScrolled() { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void scrollNestedScrollableChildBackToTop() {}
    private void onSecondaryPointerUp(android.view.MotionEvent p0) {}
    private void resetTouch() {}
    private void dismiss() {}
    public void computeScroll() {}
    private void abortAnimation() {}
    private float performDrag(float p0) { return 0.0f; }
    private void onCollapsedChanged(boolean p0) {}
    void dispatchOnDismissed() {}
    private void smoothScrollTo(int p0, float p1) {}
    private float distanceInfluenceForSnapDuration(float p0) { return 0.0f; }
    private android.view.View findChildUnder(float p0, float p1) { return null; }
    private static android.view.View findChildUnder(android.view.ViewGroup p0, float p1, float p2) { return null; }
    private android.view.View findListChildUnder(float p0, float p1) { return null; }
    private boolean isListChildUnderClipped(float p0, float p1) { return false; }
    private boolean isDescendantClipped(android.view.View p0) { return false; }
    private static boolean isChildUnder(android.view.View p0, float p1, float p2) { return false; }
    public void requestChildFocus(android.view.View p0, android.view.View p1) {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public boolean onStartNestedScroll(android.view.View p0, android.view.View p1, int p2) { return false; }
    public void onNestedScrollAccepted(android.view.View p0, android.view.View p1, int p2) {}
    public void onStopNestedScroll(android.view.View p0) {}
    public void onNestedScroll(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void onNestedPreScroll(android.view.View p0, int p1, int p2, int[] p3) {}
    public boolean onNestedPreFling(android.view.View p0, float p1, float p2) { return false; }
    public boolean onNestedFling(android.view.View p0, float p1, float p2, boolean p3) { return false; }
    private boolean performAccessibilityActionCommon(int p0) { return false; }
    public boolean onNestedPrePerformAccessibilityAction(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    public void onDrawForeground(android.graphics.Canvas p0) {}
    protected void onMeasure(int p0, int p1) {}
    public int getAlwaysShowHeight() { return 0; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    private com.android.internal.logging.MetricsLogger getMetricsLogger() { return null; }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public boolean alwaysShow;
        public boolean ignoreOffset;
        public boolean hasNestedScrollIndicator;
        public int maxHeight;
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(com.android.internal.widget.ResolverDrawerLayout.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
    }

    public static interface OnCollapsedChangedListener {
        public void onCollapsedChanged(boolean p0);
    }

    public static interface OnDismissedListener {
        public void onDismissed();
    }

    private class RunOnDismissedListener implements java.lang.Runnable {
        private RunOnDismissedListener(com.android.internal.widget.ResolverDrawerLayout p0) {}
        public void run() {}
    }

    static class SavedState extends android.view.View.BaseSavedState {
        boolean open;
        private int mCollapsibleHeightReserved;
        public static final android.os.Parcelable.Creator<com.android.internal.widget.ResolverDrawerLayout.SavedState> CREATOR = null;
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        private SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
