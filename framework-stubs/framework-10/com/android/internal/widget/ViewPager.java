package com.android.internal.widget;

public class ViewPager extends android.view.ViewGroup {
    private static final java.lang.String TAG = "ViewPager";
    private static final boolean DEBUG = false;
    private static final int MAX_SCROLL_X = 16777216;
    private static final boolean USE_CACHE = false;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final int[] LAYOUT_ATTRS = null;
    private int mExpectedAdapterCount;
    private static final java.util.Comparator<com.android.internal.widget.ViewPager.ItemInfo> COMPARATOR = null;
    private static final android.view.animation.Interpolator sInterpolator = null;
    private final java.util.ArrayList<com.android.internal.widget.ViewPager.ItemInfo> mItems = null;
    private final com.android.internal.widget.ViewPager.ItemInfo mTempItem = null;
    private final android.graphics.Rect mTempRect = null;
    private com.android.internal.widget.PagerAdapter mAdapter;
    private int mCurItem;
    private int mRestoredCurItem;
    private android.os.Parcelable mRestoredAdapterState;
    private java.lang.ClassLoader mRestoredClassLoader;
    private final android.widget.Scroller mScroller = null;
    private com.android.internal.widget.ViewPager.PagerObserver mObserver;
    private int mPageMargin;
    private android.graphics.drawable.Drawable mMarginDrawable;
    private int mTopPageBounds;
    private int mBottomPageBounds;
    private int mLeftIncr;
    private float mFirstOffset;
    private float mLastOffset;
    private int mChildWidthMeasureSpec;
    private int mChildHeightMeasureSpec;
    private boolean mInLayout;
    private boolean mScrollingCacheEnabled;
    private boolean mPopulatePending;
    private int mOffscreenPageLimit;
    private boolean mIsBeingDragged;
    private boolean mIsUnableToDrag;
    private final int mDefaultGutterSize = 0;
    private int mGutterSize;
    private final int mTouchSlop = 0;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private int mActivePointerId;
    private static final int INVALID_POINTER = -1;
    private android.view.VelocityTracker mVelocityTracker;
    private final int mMinimumVelocity = 0;
    private final int mMaximumVelocity = 0;
    private final int mFlingDistance = 0;
    private final int mCloseEnough = 0;
    private static final int CLOSE_ENOUGH = 2;
    private final android.widget.EdgeEffect mLeftEdge = null;
    private final android.widget.EdgeEffect mRightEdge = null;
    private boolean mFirstLayout;
    private boolean mCalledSuper;
    private int mDecorChildCount;
    private com.android.internal.widget.ViewPager.OnPageChangeListener mOnPageChangeListener;
    private com.android.internal.widget.ViewPager.OnPageChangeListener mInternalPageChangeListener;
    private com.android.internal.widget.ViewPager.OnAdapterChangeListener mAdapterChangeListener;
    private com.android.internal.widget.ViewPager.PageTransformer mPageTransformer;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private int mDrawingOrder;
    private java.util.ArrayList<android.view.View> mDrawingOrderedChildren;
    private static final com.android.internal.widget.ViewPager.ViewPositionComparator sPositionComparator = null;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_SETTLING = 2;
    private final java.lang.Runnable mEndScrollRunnable = null;
    private int mScrollState;
    public ViewPager(android.content.Context p0) { super((android.content.Context)null); }
    public ViewPager(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ViewPager(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ViewPager(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onDetachedFromWindow() {}
    private void setScrollState(int p0) {}
    public void setAdapter(com.android.internal.widget.PagerAdapter p0) {}
    private void removeNonDecorViews() {}
    public com.android.internal.widget.PagerAdapter getAdapter() { return null; }
    void setOnAdapterChangeListener(com.android.internal.widget.ViewPager.OnAdapterChangeListener p0) {}
    private int getPaddedWidth() { return 0; }
    public void setCurrentItem(int p0) {}
    public void setCurrentItem(int p0, boolean p1) {}
    @android.annotation.UnsupportedAppUsage
    public int getCurrentItem() { return 0; }
    boolean setCurrentItemInternal(int p0, boolean p1, boolean p2) { return false; }
    boolean setCurrentItemInternal(int p0, boolean p1, boolean p2, int p3) { return false; }
    private void scrollToItem(int p0, boolean p1, int p2, boolean p3) {}
    private int getLeftEdgeForItem(int p0) { return 0; }
    public void setOnPageChangeListener(com.android.internal.widget.ViewPager.OnPageChangeListener p0) {}
    public void setPageTransformer(boolean p0, com.android.internal.widget.ViewPager.PageTransformer p1) {}
    protected int getChildDrawingOrder(int p0, int p1) { return 0; }
    com.android.internal.widget.ViewPager.OnPageChangeListener setInternalPageChangeListener(com.android.internal.widget.ViewPager.OnPageChangeListener p0) { return null; }
    public int getOffscreenPageLimit() { return 0; }
    public void setOffscreenPageLimit(int p0) {}
    public void setPageMargin(int p0) {}
    public int getPageMargin() { return 0; }
    public void setPageMarginDrawable(android.graphics.drawable.Drawable p0) {}
    public void setPageMarginDrawable(int p0) {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    protected void drawableStateChanged() {}
    float distanceInfluenceForSnapDuration(float p0) { return 0.0f; }
    void smoothScrollTo(int p0, int p1) {}
    void smoothScrollTo(int p0, int p1, int p2) {}
    com.android.internal.widget.ViewPager.ItemInfo addNewItem(int p0, int p1) { return null; }
    void dataSetChanged() {}
    public void populate() {}
    void populate(int p0) {}
    private void sortChildDrawingOrder() {}
    private void calculatePageOffsets(com.android.internal.widget.ViewPager.ItemInfo p0, int p1, com.android.internal.widget.ViewPager.ItemInfo p2) {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    public java.lang.Object getCurrent() { return null; }
    public void removeView(android.view.View p0) {}
    com.android.internal.widget.ViewPager.ItemInfo infoForChild(android.view.View p0) { return null; }
    com.android.internal.widget.ViewPager.ItemInfo infoForAnyChild(android.view.View p0) { return null; }
    com.android.internal.widget.ViewPager.ItemInfo infoForPosition(int p0) { return null; }
    protected void onAttachedToWindow() {}
    protected void onMeasure(int p0, int p1) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    private void recomputeScrollPosition(int p0, int p1, int p2, int p3) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void computeScroll() {}
    private boolean pageScrolled(int p0) { return false; }
    protected void onPageScrolled(int p0, float p1, int p2) {}
    private void completeScroll(boolean p0) {}
    private boolean isGutterDrag(float p0, float p1) { return false; }
    private void enableLayers(boolean p0) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    private void requestParentDisallowInterceptTouchEvent(boolean p0) {}
    private boolean performDrag(float p0) { return false; }
    private com.android.internal.widget.ViewPager.ItemInfo infoForFirstVisiblePage() { return null; }
    private int getScrollStart() { return 0; }
    private int determineTargetPage(int p0, float p1, int p2, int p3) { return 0; }
    public void draw(android.graphics.Canvas p0) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    private void onSecondaryPointerUp(android.view.MotionEvent p0) {}
    private void endDrag() {}
    private void setScrollingCacheEnabled(boolean p0) {}
    public boolean canScrollHorizontally(int p0) { return false; }
    protected boolean canScroll(android.view.View p0, boolean p1, int p2, int p3, int p4) { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean executeKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean arrowScroll(int p0) { return false; }
    private android.graphics.Rect getChildRectInPagerCoordinates(android.graphics.Rect p0, android.view.View p1) { return null; }
    boolean pageLeft() { return false; }
    boolean pageRight() { return false; }
    public void onRtlPropertiesChanged(int p0) {}
    public void addFocusables(java.util.ArrayList<android.view.View> p0, int p1, int p2) {}
    public void addTouchables(java.util.ArrayList<android.view.View> p0) {}
    protected boolean onRequestFocusInDescendants(int p0, android.graphics.Rect p1) { return false; }
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean performAccessibilityAction(int p0, android.os.Bundle p1) { return false; }
    private boolean canScroll() { return false; }

    static class ViewPositionComparator implements java.util.Comparator<android.view.View> {
        ViewPositionComparator() {}
        public int compare(android.view.View p0, android.view.View p1) { return 0; }
    }

    public static class SimpleOnPageChangeListener implements com.android.internal.widget.ViewPager.OnPageChangeListener {
        public SimpleOnPageChangeListener() {}
        public void onPageScrolled(int p0, float p1, int p2) {}
        public void onPageSelected(int p0) {}
        public void onPageScrollStateChanged(int p0) {}
    }

    public static class SavedState extends android.view.AbsSavedState {
        int position;
        android.os.Parcelable adapterState;
        java.lang.ClassLoader loader;
        public static final android.os.Parcelable.Creator<com.android.internal.widget.ViewPager.SavedState> CREATOR = null;
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcelable)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
        SavedState(android.os.Parcel p0, java.lang.ClassLoader p1) { super((android.os.Parcelable)null); }
    }

    private class PagerObserver extends android.database.DataSetObserver {
        private PagerObserver(com.android.internal.widget.ViewPager p0) { super(); }
        public void onChanged() {}
        public void onInvalidated() {}
    }

    public static interface PageTransformer {
        public void transformPage(android.view.View p0, float p1);
    }

    public static interface OnPageChangeListener {
        @android.annotation.UnsupportedAppUsage
        public void onPageScrolled(int p0, float p1, int p2);
        @android.annotation.UnsupportedAppUsage
        public void onPageSelected(int p0);
        @android.annotation.UnsupportedAppUsage
        public void onPageScrollStateChanged(int p0);
    }

    static interface OnAdapterChangeListener {
        public void onAdapterChanged(com.android.internal.widget.PagerAdapter p0, com.android.internal.widget.PagerAdapter p1);
    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        public boolean isDecor;
        public int gravity;
        float widthFactor;
        boolean needsMeasure;
        int position;
        int childIndex;
        public LayoutParams() { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }

        public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<com.android.internal.widget.ViewPager.LayoutParams> {
            private boolean mPropertiesMapped;
            private int mLayout_gravityId;
            public InspectionCompanion() {}
            public void mapProperties(android.view.inspector.PropertyMapper p0) {}
            public void readProperties(com.android.internal.widget.ViewPager.LayoutParams p0, android.view.inspector.PropertyReader p1) {}
        }
    }

    static class ItemInfo {
        java.lang.Object object;
        boolean scrolling;
        float widthFactor;
        int position;
        float offset;
        ItemInfo() {}
    }

    static interface Decor {
    }
}
