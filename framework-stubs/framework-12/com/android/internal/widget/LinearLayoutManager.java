package com.android.internal.widget;

public class LinearLayoutManager extends com.android.internal.widget.RecyclerView.LayoutManager implements com.android.internal.widget.helper.ItemTouchHelper.ViewDropHandler, com.android.internal.widget.RecyclerView.SmoothScroller.ScrollVectorProvider {
    private static final java.lang.String TAG = "LinearLayoutManager";
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public static final int INVALID_OFFSET = -2147483648;
    private static final float MAX_SCROLL_FACTOR = 0.3333333432674408f;
    int mOrientation;
    private com.android.internal.widget.LinearLayoutManager.LayoutState mLayoutState;
    com.android.internal.widget.OrientationHelper mOrientationHelper;
    private boolean mLastStackFromEnd;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mStackFromEnd;
    private boolean mSmoothScrollbarEnabled;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    com.android.internal.widget.LinearLayoutManager.SavedState mPendingSavedState;
    final com.android.internal.widget.LinearLayoutManager.AnchorInfo mAnchorInfo = null;
    private final com.android.internal.widget.LinearLayoutManager.LayoutChunkResult mLayoutChunkResult = null;
    private int mInitialItemPrefetchCount;
    public LinearLayoutManager(android.content.Context p0) { super(); }
    public LinearLayoutManager(android.content.Context p0, int p1, boolean p2) { super(); }
    public LinearLayoutManager(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super(); }
    public com.android.internal.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() { return null; }
    public boolean getRecycleChildrenOnDetach() { return false; }
    public void setRecycleChildrenOnDetach(boolean p0) {}
    public void onDetachedFromWindow(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.Recycler p1) {}
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public boolean canScrollHorizontally() { return false; }
    public boolean canScrollVertically() { return false; }
    public void setStackFromEnd(boolean p0) {}
    public boolean getStackFromEnd() { return false; }
    public int getOrientation() { return 0; }
    public void setOrientation(int p0) {}
    private void resolveShouldLayoutReverse() {}
    public boolean getReverseLayout() { return false; }
    public void setReverseLayout(boolean p0) {}
    public android.view.View findViewByPosition(int p0) { return null; }
    protected int getExtraLayoutSpace(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    public void smoothScrollToPosition(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.State p1, int p2) {}
    public android.graphics.PointF computeScrollVectorForPosition(int p0) { return null; }
    public void onLayoutChildren(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) {}
    public void onLayoutCompleted(com.android.internal.widget.RecyclerView.State p0) {}
    void onAnchorReady(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, com.android.internal.widget.LinearLayoutManager.AnchorInfo p2, int p3) {}
    private void layoutForPredictiveAnimations(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, int p2, int p3) {}
    private void updateAnchorInfoForLayout(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, com.android.internal.widget.LinearLayoutManager.AnchorInfo p2) {}
    private boolean updateAnchorFromChildren(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, com.android.internal.widget.LinearLayoutManager.AnchorInfo p2) { return false; }
    private boolean updateAnchorFromPendingData(com.android.internal.widget.RecyclerView.State p0, com.android.internal.widget.LinearLayoutManager.AnchorInfo p1) { return false; }
    private int fixLayoutEndGap(int p0, com.android.internal.widget.RecyclerView.Recycler p1, com.android.internal.widget.RecyclerView.State p2, boolean p3) { return 0; }
    private int fixLayoutStartGap(int p0, com.android.internal.widget.RecyclerView.Recycler p1, com.android.internal.widget.RecyclerView.State p2, boolean p3) { return 0; }
    private void updateLayoutStateToFillEnd(com.android.internal.widget.LinearLayoutManager.AnchorInfo p0) {}
    private void updateLayoutStateToFillEnd(int p0, int p1) {}
    private void updateLayoutStateToFillStart(com.android.internal.widget.LinearLayoutManager.AnchorInfo p0) {}
    private void updateLayoutStateToFillStart(int p0, int p1) {}
    protected boolean isLayoutRTL() { return false; }
    void ensureLayoutState() {}
    com.android.internal.widget.LinearLayoutManager.LayoutState createLayoutState() { return null; }
    public void scrollToPosition(int p0) {}
    public void scrollToPositionWithOffset(int p0, int p1) {}
    public int scrollHorizontallyBy(int p0, com.android.internal.widget.RecyclerView.Recycler p1, com.android.internal.widget.RecyclerView.State p2) { return 0; }
    public int scrollVerticallyBy(int p0, com.android.internal.widget.RecyclerView.Recycler p1, com.android.internal.widget.RecyclerView.State p2) { return 0; }
    public int computeHorizontalScrollOffset(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    public int computeVerticalScrollOffset(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    public int computeHorizontalScrollExtent(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    public int computeVerticalScrollExtent(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    public int computeHorizontalScrollRange(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    public int computeVerticalScrollRange(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    private int computeScrollOffset(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    private int computeScrollExtent(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    private int computeScrollRange(com.android.internal.widget.RecyclerView.State p0) { return 0; }
    public void setSmoothScrollbarEnabled(boolean p0) {}
    public boolean isSmoothScrollbarEnabled() { return false; }
    private void updateLayoutState(int p0, int p1, boolean p2, com.android.internal.widget.RecyclerView.State p3) {}
    boolean resolveIsInfinite() { return false; }
    void collectPrefetchPositionsForLayoutState(com.android.internal.widget.RecyclerView.State p0, com.android.internal.widget.LinearLayoutManager.LayoutState p1, com.android.internal.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry p2) {}
    public void collectInitialPrefetchPositions(int p0, com.android.internal.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry p1) {}
    public void setInitialPrefetchItemCount(int p0) {}
    public int getInitialItemPrefetchCount() { return 0; }
    public void collectAdjacentPrefetchPositions(int p0, int p1, com.android.internal.widget.RecyclerView.State p2, com.android.internal.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry p3) {}
    int scrollBy(int p0, com.android.internal.widget.RecyclerView.Recycler p1, com.android.internal.widget.RecyclerView.State p2) { return 0; }
    public void assertNotInLayoutOrScroll(java.lang.String p0) {}
    private void recycleChildren(com.android.internal.widget.RecyclerView.Recycler p0, int p1, int p2) {}
    private void recycleViewsFromStart(com.android.internal.widget.RecyclerView.Recycler p0, int p1) {}
    private void recycleViewsFromEnd(com.android.internal.widget.RecyclerView.Recycler p0, int p1) {}
    private void recycleByLayoutState(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.LinearLayoutManager.LayoutState p1) {}
    int fill(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.LinearLayoutManager.LayoutState p1, com.android.internal.widget.RecyclerView.State p2, boolean p3) { return 0; }
    void layoutChunk(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, com.android.internal.widget.LinearLayoutManager.LayoutState p2, com.android.internal.widget.LinearLayoutManager.LayoutChunkResult p3) {}
    boolean shouldMeasureTwice() { return false; }
    int convertFocusDirectionToLayoutDirection(int p0) { return 0; }
    private android.view.View getChildClosestToStart() { return null; }
    private android.view.View getChildClosestToEnd() { return null; }
    private android.view.View findFirstVisibleChildClosestToStart(boolean p0, boolean p1) { return null; }
    private android.view.View findFirstVisibleChildClosestToEnd(boolean p0, boolean p1) { return null; }
    private android.view.View findReferenceChildClosestToEnd(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return null; }
    private android.view.View findReferenceChildClosestToStart(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return null; }
    private android.view.View findFirstReferenceChild(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return null; }
    private android.view.View findLastReferenceChild(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return null; }
    android.view.View findReferenceChild(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, int p2, int p3, int p4) { return null; }
    public int findFirstVisibleItemPosition() { return 0; }
    public int findFirstCompletelyVisibleItemPosition() { return 0; }
    public int findLastVisibleItemPosition() { return 0; }
    public int findLastCompletelyVisibleItemPosition() { return 0; }
    android.view.View findOneVisibleChild(int p0, int p1, boolean p2, boolean p3) { return null; }
    public android.view.View onFocusSearchFailed(android.view.View p0, int p1, com.android.internal.widget.RecyclerView.Recycler p2, com.android.internal.widget.RecyclerView.State p3) { return null; }
    private void logChildren() {}
    void validateChildOrder() {}
    public boolean supportsPredictiveItemAnimations() { return false; }
    public void prepareForDrop(android.view.View p0, android.view.View p1, int p2, int p3) {}

    class AnchorInfo {
        int mPosition;
        int mCoordinate;
        boolean mLayoutFromEnd;
        boolean mValid;
        AnchorInfo(com.android.internal.widget.LinearLayoutManager p0) {}
        void reset() {}
        void assignCoordinateFromPadding() {}
        public java.lang.String toString() { return null; }
        boolean isViewValidAsAnchor(android.view.View p0, com.android.internal.widget.RecyclerView.State p1) { return false; }
        public void assignFromViewAndKeepVisibleRect(android.view.View p0) {}
        public void assignFromView(android.view.View p0) {}
    }

    protected static class LayoutChunkResult {
        public int mConsumed;
        public boolean mFinished;
        public boolean mIgnoreConsumed;
        public boolean mFocusable;
        protected LayoutChunkResult() {}
        void resetInternal() {}
    }

    static class LayoutState {
        static final java.lang.String TAG = "LLM#LayoutState";
        static final int LAYOUT_START = -1;
        static final int LAYOUT_END = 1;
        static final int INVALID_LAYOUT = -2147483648;
        static final int ITEM_DIRECTION_HEAD = -1;
        static final int ITEM_DIRECTION_TAIL = 1;
        static final int SCROLLING_OFFSET_NaN = -2147483648;
        boolean mRecycle;
        int mOffset;
        int mAvailable;
        int mCurrentPosition;
        int mItemDirection;
        int mLayoutDirection;
        int mScrollingOffset;
        int mExtra;
        boolean mIsPreLayout;
        int mLastScrollDelta;
        java.util.List<com.android.internal.widget.RecyclerView.ViewHolder> mScrapList;
        boolean mInfinite;
        LayoutState() {}
        boolean hasMore(com.android.internal.widget.RecyclerView.State p0) { return false; }
        android.view.View next(com.android.internal.widget.RecyclerView.Recycler p0) { return null; }
        private android.view.View nextViewFromScrapList() { return null; }
        public void assignPositionFromScrapList() {}
        public void assignPositionFromScrapList(android.view.View p0) {}
        public android.view.View nextViewInLimitedList(android.view.View p0) { return null; }
        void log() {}
    }

    public static class SavedState implements android.os.Parcelable {
        int mAnchorPosition;
        int mAnchorOffset;
        boolean mAnchorLayoutFromEnd;
        public static final android.os.Parcelable.Creator<com.android.internal.widget.LinearLayoutManager.SavedState> CREATOR = null;
        public SavedState() {}
        SavedState(android.os.Parcel p0) {}
        public SavedState(com.android.internal.widget.LinearLayoutManager.SavedState p0) {}
        boolean hasValidAnchor() { return false; }
        void invalidateAnchor() {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
