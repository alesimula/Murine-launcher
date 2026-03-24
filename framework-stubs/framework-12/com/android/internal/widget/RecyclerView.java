package com.android.internal.widget;

public class RecyclerView extends android.view.ViewGroup implements com.android.internal.widget.ScrollingView, com.android.internal.widget.NestedScrollingChild {
    static final java.lang.String TAG = "RecyclerView";
    static final boolean DEBUG = false;
    private static final int[] NESTED_SCROLLING_ATTRS = null;
    private static final int[] CLIP_TO_PADDING_ATTR = null;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = Boolean.valueOf(false);
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = Boolean.valueOf(false);
    static final boolean POST_UPDATES_ON_ANIMATION = Boolean.valueOf(false);
    private static final boolean ALLOW_THREAD_GAP_WORK = Boolean.valueOf(false);
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = Boolean.valueOf(false);
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = Boolean.valueOf(false);
    static final boolean DISPATCH_TEMP_DETACH = false;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public static final int NO_POSITION = -1;
    public static final long NO_ID = -1L;
    public static final int INVALID_TYPE = -1;
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final int MAX_SCROLL_DURATION = 2000;
    static final java.lang.String TRACE_SCROLL_TAG = "RV Scroll";
    private static final java.lang.String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    private static final java.lang.String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final java.lang.String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final java.lang.String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final java.lang.String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final java.lang.String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    static final java.lang.String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final java.lang.Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = null;
    private final com.android.internal.widget.RecyclerView.RecyclerViewDataObserver mObserver = null;
    final com.android.internal.widget.RecyclerView.Recycler mRecycler = null;
    private com.android.internal.widget.RecyclerView.SavedState mPendingSavedState;
    com.android.internal.widget.AdapterHelper mAdapterHelper;
    com.android.internal.widget.ChildHelper mChildHelper;
    final com.android.internal.widget.ViewInfoStore mViewInfoStore = null;
    boolean mClipToPadding;
    final java.lang.Runnable mUpdateChildViewsRunnable = null;
    final android.graphics.Rect mTempRect = null;
    private final android.graphics.Rect mTempRect2 = null;
    final android.graphics.RectF mTempRectF = null;
    com.android.internal.widget.RecyclerView.Adapter mAdapter;
    com.android.internal.widget.RecyclerView.LayoutManager mLayout;
    com.android.internal.widget.RecyclerView.RecyclerListener mRecyclerListener;
    final java.util.ArrayList<com.android.internal.widget.RecyclerView.ItemDecoration> mItemDecorations = null;
    private final java.util.ArrayList<com.android.internal.widget.RecyclerView.OnItemTouchListener> mOnItemTouchListeners = null;
    private com.android.internal.widget.RecyclerView.OnItemTouchListener mActiveOnItemTouchListener;
    boolean mIsAttached;
    boolean mHasFixedSize;
    boolean mFirstLayoutComplete;
    private int mEatRequestLayout;
    boolean mLayoutRequestEaten;
    boolean mLayoutFrozen;
    private boolean mIgnoreMotionEventTillDown;
    private int mEatenAccessibilityChangeFlags;
    boolean mAdapterUpdateDuringMeasure;
    private final android.view.accessibility.AccessibilityManager mAccessibilityManager = null;
    private java.util.List<com.android.internal.widget.RecyclerView.OnChildAttachStateChangeListener> mOnChildAttachStateListeners;
    boolean mDataSetHasChangedAfterLayout;
    private int mLayoutOrScrollCounter;
    private int mDispatchScrollCounter;
    private android.widget.EdgeEffect mLeftGlow;
    private android.widget.EdgeEffect mTopGlow;
    private android.widget.EdgeEffect mRightGlow;
    private android.widget.EdgeEffect mBottomGlow;
    com.android.internal.widget.RecyclerView.ItemAnimator mItemAnimator;
    private static final int INVALID_POINTER = -1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final long FOREVER_NS = 9223372036854775807L;
    private int mScrollState;
    private int mScrollPointerId;
    private android.view.VelocityTracker mVelocityTracker;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mLastTouchX;
    private int mLastTouchY;
    private int mTouchSlop;
    private com.android.internal.widget.RecyclerView.OnFlingListener mOnFlingListener;
    private final int mMinFlingVelocity = 0;
    private final int mMaxFlingVelocity = 0;
    private float mScrollFactor;
    private boolean mPreserveFocusAfterLayout;
    final com.android.internal.widget.RecyclerView.ViewFlinger mViewFlinger = null;
    com.android.internal.widget.GapWorker mGapWorker;
    com.android.internal.widget.GapWorker.LayoutPrefetchRegistryImpl mPrefetchRegistry;
    final com.android.internal.widget.RecyclerView.State mState = null;
    private com.android.internal.widget.RecyclerView.OnScrollListener mScrollListener;
    private java.util.List<com.android.internal.widget.RecyclerView.OnScrollListener> mScrollListeners;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private com.android.internal.widget.RecyclerView.ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
    boolean mPostedAnimatorRunner;
    com.android.internal.widget.RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private com.android.internal.widget.RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback;
    private final int[] mMinMaxLayoutPositions = null;
    private final int[] mScrollOffset = null;
    private final int[] mScrollConsumed = null;
    private final int[] mNestedOffsets = null;
    final java.util.List<com.android.internal.widget.RecyclerView.ViewHolder> mPendingAccessibilityImportanceChange = null;
    private java.lang.Runnable mItemAnimatorRunner;
    static final android.view.animation.Interpolator sQuinticInterpolator = null;
    private final com.android.internal.widget.ViewInfoStore.ProcessCallback mViewInfoProcessCallback = null;
    public RecyclerView(android.content.Context p0) { super((android.content.Context)null); }
    public RecyclerView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public RecyclerView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public com.android.internal.widget.RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() { return null; }
    public void setAccessibilityDelegateCompat(com.android.internal.widget.RecyclerViewAccessibilityDelegate p0) {}
    private void createLayoutManager(android.content.Context p0, java.lang.String p1, android.util.AttributeSet p2, int p3, int p4) {}
    private java.lang.String getFullClassName(android.content.Context p0, java.lang.String p1) { return null; }
    private void initChildrenHelper() {}
    void initAdapterManager() {}
    public void setHasFixedSize(boolean p0) {}
    public boolean hasFixedSize() { return false; }
    public void setClipToPadding(boolean p0) {}
    public boolean getClipToPadding() { return false; }
    public void setScrollingTouchSlop(int p0) {}
    public void swapAdapter(com.android.internal.widget.RecyclerView.Adapter p0, boolean p1) {}
    public void setAdapter(com.android.internal.widget.RecyclerView.Adapter p0) {}
    void removeAndRecycleViews() {}
    private void setAdapterInternal(com.android.internal.widget.RecyclerView.Adapter p0, boolean p1, boolean p2) {}
    public com.android.internal.widget.RecyclerView.Adapter getAdapter() { return null; }
    public void setRecyclerListener(com.android.internal.widget.RecyclerView.RecyclerListener p0) {}
    public int getBaseline() { return 0; }
    public void addOnChildAttachStateChangeListener(com.android.internal.widget.RecyclerView.OnChildAttachStateChangeListener p0) {}
    public void removeOnChildAttachStateChangeListener(com.android.internal.widget.RecyclerView.OnChildAttachStateChangeListener p0) {}
    public void clearOnChildAttachStateChangeListeners() {}
    public void setLayoutManager(com.android.internal.widget.RecyclerView.LayoutManager p0) {}
    public void setOnFlingListener(com.android.internal.widget.RecyclerView.OnFlingListener p0) {}
    public com.android.internal.widget.RecyclerView.OnFlingListener getOnFlingListener() { return null; }
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    private void addAnimatingView(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    boolean removeAnimatingView(android.view.View p0) { return false; }
    public com.android.internal.widget.RecyclerView.LayoutManager getLayoutManager() { return null; }
    public com.android.internal.widget.RecyclerView.RecycledViewPool getRecycledViewPool() { return null; }
    public void setRecycledViewPool(com.android.internal.widget.RecyclerView.RecycledViewPool p0) {}
    public void setViewCacheExtension(com.android.internal.widget.RecyclerView.ViewCacheExtension p0) {}
    public void setItemViewCacheSize(int p0) {}
    public int getScrollState() { return 0; }
    void setScrollState(int p0) {}
    public void addItemDecoration(com.android.internal.widget.RecyclerView.ItemDecoration p0, int p1) {}
    public void addItemDecoration(com.android.internal.widget.RecyclerView.ItemDecoration p0) {}
    public void removeItemDecoration(com.android.internal.widget.RecyclerView.ItemDecoration p0) {}
    public void setChildDrawingOrderCallback(com.android.internal.widget.RecyclerView.ChildDrawingOrderCallback p0) {}
    @java.lang.Deprecated
    public void setOnScrollListener(com.android.internal.widget.RecyclerView.OnScrollListener p0) {}
    public void addOnScrollListener(com.android.internal.widget.RecyclerView.OnScrollListener p0) {}
    public void removeOnScrollListener(com.android.internal.widget.RecyclerView.OnScrollListener p0) {}
    public void clearOnScrollListeners() {}
    public void scrollToPosition(int p0) {}
    void jumpToPositionForSmoothScroller(int p0) {}
    public void smoothScrollToPosition(int p0) {}
    public void scrollTo(int p0, int p1) {}
    public void scrollBy(int p0, int p1) {}
    void consumePendingUpdateOperations() {}
    private boolean hasUpdatedView() { return false; }
    boolean scrollByInternal(int p0, int p1, android.view.MotionEvent p2) { return false; }
    public int computeHorizontalScrollOffset() { return 0; }
    public int computeHorizontalScrollExtent() { return 0; }
    public int computeHorizontalScrollRange() { return 0; }
    public int computeVerticalScrollOffset() { return 0; }
    public int computeVerticalScrollExtent() { return 0; }
    public int computeVerticalScrollRange() { return 0; }
    void eatRequestLayout() {}
    void resumeRequestLayout(boolean p0) {}
    public void setLayoutFrozen(boolean p0) {}
    public boolean isLayoutFrozen() { return false; }
    public void smoothScrollBy(int p0, int p1) {}
    public void smoothScrollBy(int p0, int p1, android.view.animation.Interpolator p2) {}
    public boolean fling(int p0, int p1) { return false; }
    public void stopScroll() {}
    private void stopScrollersInternal() {}
    public int getMinFlingVelocity() { return 0; }
    public int getMaxFlingVelocity() { return 0; }
    private void pullGlows(float p0, float p1, float p2, float p3) {}
    private void releaseGlows() {}
    void considerReleasingGlowsOnScroll(int p0, int p1) {}
    void absorbGlows(int p0, int p1) {}
    void ensureLeftGlow() {}
    void ensureRightGlow() {}
    void ensureTopGlow() {}
    void ensureBottomGlow() {}
    void invalidateGlows() {}
    public android.view.View focusSearch(android.view.View p0, int p1) { return null; }
    private boolean isPreferredNextFocus(android.view.View p0, android.view.View p1, int p2) { return false; }
    private boolean isPreferredNextFocusAbsolute(android.view.View p0, android.view.View p1, int p2) { return false; }
    public void requestChildFocus(android.view.View p0, android.view.View p1) {}
    public boolean requestChildRectangleOnScreen(android.view.View p0, android.graphics.Rect p1, boolean p2) { return false; }
    public void addFocusables(java.util.ArrayList<android.view.View> p0, int p1, int p2) {}
    protected boolean onRequestFocusInDescendants(int p0, android.graphics.Rect p1) { return false; }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public boolean isAttachedToWindow() { return false; }
    void assertInLayoutOrScroll(java.lang.String p0) {}
    void assertNotInLayoutOrScroll(java.lang.String p0) {}
    public void addOnItemTouchListener(com.android.internal.widget.RecyclerView.OnItemTouchListener p0) {}
    public void removeOnItemTouchListener(com.android.internal.widget.RecyclerView.OnItemTouchListener p0) {}
    private boolean dispatchOnItemTouchIntercept(android.view.MotionEvent p0) { return false; }
    private boolean dispatchOnItemTouch(android.view.MotionEvent p0) { return false; }
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    private boolean stopGlowAnimations(android.view.MotionEvent p0) { return false; }
    public void requestDisallowInterceptTouchEvent(boolean p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    private int releaseHorizontalGlow(int p0, float p1) { return 0; }
    private int releaseVerticalGlow(int p0, float p1) { return 0; }
    private void resetTouch() {}
    private void cancelTouch() {}
    private void onPointerUp(android.view.MotionEvent p0) {}
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    private float getScrollFactor() { return 0.0f; }
    protected void onMeasure(int p0, int p1) {}
    void defaultOnMeasure(int p0, int p1) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    public void setItemAnimator(com.android.internal.widget.RecyclerView.ItemAnimator p0) {}
    void onEnterLayoutOrScroll() {}
    void onExitLayoutOrScroll() {}
    boolean isAccessibilityEnabled() { return false; }
    private void dispatchContentChangedIfNecessary() {}
    public boolean isComputingLayout() { return false; }
    boolean shouldDeferAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent p0) {}
    public com.android.internal.widget.RecyclerView.ItemAnimator getItemAnimator() { return null; }
    void postAnimationRunner() {}
    private boolean predictiveItemAnimationsEnabled() { return false; }
    private void processAdapterUpdatesAndSetAnimationFlags() {}
    void dispatchLayout() {}
    private void saveFocusInfo() {}
    private void resetFocusInfo() {}
    private android.view.View findNextViewToFocus() { return null; }
    private void recoverFocusFromState() {}
    private int getDeepestFocusedViewWithId(android.view.View p0) { return 0; }
    private void dispatchLayoutStep1() {}
    private void dispatchLayoutStep2() {}
    private void dispatchLayoutStep3() {}
    private void handleMissingPreInfoForChangeError(long p0, com.android.internal.widget.RecyclerView.ViewHolder p1, com.android.internal.widget.RecyclerView.ViewHolder p2) {}
    void recordAnimationInfoIfBouncedHiddenView(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1) {}
    private void findMinMaxChildLayoutPositions(int[] p0) {}
    private boolean didChildRangeChange(int p0, int p1) { return false; }
    protected void removeDetachedView(android.view.View p0, boolean p1) {}
    long getChangedHolderKey(com.android.internal.widget.RecyclerView.ViewHolder p0) { return 0L; }
    void animateAppearance(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2) {}
    void animateDisappearance(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2) {}
    private void animateChange(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ViewHolder p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p3, boolean p4, boolean p5) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void requestLayout() {}
    void markItemDecorInsetsDirty() {}
    public void draw(android.graphics.Canvas p0) {}
    public void onDraw(android.graphics.Canvas p0) {}
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public boolean isAnimating() { return false; }
    void saveOldPositions() {}
    void clearOldPositions() {}
    void offsetPositionRecordsForMove(int p0, int p1) {}
    void offsetPositionRecordsForInsert(int p0, int p1) {}
    void offsetPositionRecordsForRemove(int p0, int p1, boolean p2) {}
    void viewRangeUpdate(int p0, int p1, java.lang.Object p2) {}
    boolean canReuseUpdatedViewHolder(com.android.internal.widget.RecyclerView.ViewHolder p0) { return false; }
    void setDataSetChangedAfterLayout() {}
    void markKnownViewsInvalid() {}
    public void invalidateItemDecorations() {}
    public boolean getPreserveFocusAfterLayout() { return false; }
    public void setPreserveFocusAfterLayout(boolean p0) {}
    public com.android.internal.widget.RecyclerView.ViewHolder getChildViewHolder(android.view.View p0) { return null; }
    public android.view.View findContainingItemView(android.view.View p0) { return null; }
    public com.android.internal.widget.RecyclerView.ViewHolder findContainingViewHolder(android.view.View p0) { return null; }
    static com.android.internal.widget.RecyclerView.ViewHolder getChildViewHolderInt(android.view.View p0) { return null; }
    @java.lang.Deprecated
    public int getChildPosition(android.view.View p0) { return 0; }
    public int getChildAdapterPosition(android.view.View p0) { return 0; }
    public int getChildLayoutPosition(android.view.View p0) { return 0; }
    public long getChildItemId(android.view.View p0) { return 0L; }
    @java.lang.Deprecated
    public com.android.internal.widget.RecyclerView.ViewHolder findViewHolderForPosition(int p0) { return null; }
    public com.android.internal.widget.RecyclerView.ViewHolder findViewHolderForLayoutPosition(int p0) { return null; }
    public com.android.internal.widget.RecyclerView.ViewHolder findViewHolderForAdapterPosition(int p0) { return null; }
    com.android.internal.widget.RecyclerView.ViewHolder findViewHolderForPosition(int p0, boolean p1) { return null; }
    public com.android.internal.widget.RecyclerView.ViewHolder findViewHolderForItemId(long p0) { return null; }
    public android.view.View findChildViewUnder(float p0, float p1) { return null; }
    public boolean drawChild(android.graphics.Canvas p0, android.view.View p1, long p2) { return false; }
    public void offsetChildrenVertical(int p0) {}
    public void onChildAttachedToWindow(android.view.View p0) {}
    public void onChildDetachedFromWindow(android.view.View p0) {}
    public void offsetChildrenHorizontal(int p0) {}
    public void getDecoratedBoundsWithMargins(android.view.View p0, android.graphics.Rect p1) {}
    static void getDecoratedBoundsWithMarginsInt(android.view.View p0, android.graphics.Rect p1) {}
    android.graphics.Rect getItemDecorInsetsForChild(android.view.View p0) { return null; }
    public void onScrolled(int p0, int p1) {}
    void dispatchOnScrolled(int p0, int p1) {}
    public void onScrollStateChanged(int p0) {}
    void dispatchOnScrollStateChanged(int p0) {}
    public boolean hasPendingAdapterUpdates() { return false; }
    void repositionShadowingViews() {}
    static com.android.internal.widget.RecyclerView findNestedRecyclerView(android.view.View p0) { return null; }
    static void clearNestedRecyclerViewIfNotNested(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    long getNanoTime() { return 0L; }
    void dispatchChildDetached(android.view.View p0) {}
    void dispatchChildAttached(android.view.View p0) {}
    boolean setChildImportantForAccessibilityInternal(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1) { return false; }
    void dispatchPendingImportantForAccessibilityChanges() {}
    int getAdapterPositionFor(com.android.internal.widget.RecyclerView.ViewHolder p0) { return 0; }
    protected int getChildDrawingOrder(int p0, int p1) { return 0; }

    public static abstract class Adapter<VH extends com.android.internal.widget.RecyclerView.ViewHolder> {
        private final com.android.internal.widget.RecyclerView.AdapterDataObservable mObservable = null;
        private boolean mHasStableIds;
        public Adapter() {}
        public abstract VH onCreateViewHolder(android.view.ViewGroup p0, int p1);
        public abstract void onBindViewHolder(VH p0, int p1);
        public void onBindViewHolder(VH p0, int p1, java.util.List<java.lang.Object> p2) {}
        public final VH createViewHolder(android.view.ViewGroup p0, int p1) { return null; }
        public final void bindViewHolder(VH p0, int p1) {}
        public int getItemViewType(int p0) { return 0; }
        public void setHasStableIds(boolean p0) {}
        public long getItemId(int p0) { return 0L; }
        public abstract int getItemCount();
        public final boolean hasStableIds() { return false; }
        public void onViewRecycled(VH p0) {}
        public boolean onFailedToRecycleView(VH p0) { return false; }
        public void onViewAttachedToWindow(VH p0) {}
        public void onViewDetachedFromWindow(VH p0) {}
        public final boolean hasObservers() { return false; }
        public void registerAdapterDataObserver(com.android.internal.widget.RecyclerView.AdapterDataObserver p0) {}
        public void unregisterAdapterDataObserver(com.android.internal.widget.RecyclerView.AdapterDataObserver p0) {}
        public void onAttachedToRecyclerView(com.android.internal.widget.RecyclerView p0) {}
        public void onDetachedFromRecyclerView(com.android.internal.widget.RecyclerView p0) {}
        public final void notifyDataSetChanged() {}
        public final void notifyItemChanged(int p0) {}
        public final void notifyItemChanged(int p0, java.lang.Object p1) {}
        public final void notifyItemRangeChanged(int p0, int p1) {}
        public final void notifyItemRangeChanged(int p0, int p1, java.lang.Object p2) {}
        public final void notifyItemInserted(int p0) {}
        public final void notifyItemMoved(int p0, int p1) {}
        public final void notifyItemRangeInserted(int p0, int p1) {}
        public final void notifyItemRemoved(int p0) {}
        public final void notifyItemRangeRemoved(int p0, int p1) {}
    }

    static class AdapterDataObservable extends android.database.Observable<com.android.internal.widget.RecyclerView.AdapterDataObserver> {
        AdapterDataObservable() { super(); }
        public boolean hasObservers() { return false; }
        public void notifyChanged() {}
        public void notifyItemRangeChanged(int p0, int p1) {}
        public void notifyItemRangeChanged(int p0, int p1, java.lang.Object p2) {}
        public void notifyItemRangeInserted(int p0, int p1) {}
        public void notifyItemRangeRemoved(int p0, int p1) {}
        public void notifyItemMoved(int p0, int p1) {}
    }

    public static abstract class AdapterDataObserver {
        public AdapterDataObserver() {}
        public void onChanged() {}
        public void onItemRangeChanged(int p0, int p1) {}
        public void onItemRangeChanged(int p0, int p1, java.lang.Object p2) {}
        public void onItemRangeInserted(int p0, int p1) {}
        public void onItemRangeRemoved(int p0, int p1) {}
        public void onItemRangeMoved(int p0, int p1, int p2) {}
    }

    public static interface ChildDrawingOrderCallback {
        public int onGetChildDrawingOrder(int p0, int p1);
    }

    public static abstract class ItemAnimator {
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_REMOVED = 8;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        private com.android.internal.widget.RecyclerView.ItemAnimator.ItemAnimatorListener mListener;
        private java.util.ArrayList<com.android.internal.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> mFinishedListeners;
        private long mAddDuration;
        private long mRemoveDuration;
        private long mMoveDuration;
        private long mChangeDuration;
        public ItemAnimator() {}
        public long getMoveDuration() { return 0L; }
        public void setMoveDuration(long p0) {}
        public long getAddDuration() { return 0L; }
        public void setAddDuration(long p0) {}
        public long getRemoveDuration() { return 0L; }
        public void setRemoveDuration(long p0) {}
        public long getChangeDuration() { return 0L; }
        public void setChangeDuration(long p0) {}
        void setListener(com.android.internal.widget.RecyclerView.ItemAnimator.ItemAnimatorListener p0) {}
        public com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo recordPreLayoutInformation(com.android.internal.widget.RecyclerView.State p0, com.android.internal.widget.RecyclerView.ViewHolder p1, int p2, java.util.List<java.lang.Object> p3) { return null; }
        public com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo recordPostLayoutInformation(com.android.internal.widget.RecyclerView.State p0, com.android.internal.widget.RecyclerView.ViewHolder p1) { return null; }
        public abstract boolean animateDisappearance(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2);
        public abstract boolean animateAppearance(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2);
        public abstract boolean animatePersistence(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2);
        public abstract boolean animateChange(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ViewHolder p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p3);
        static int buildAdapterChangeFlagsForAnimations(com.android.internal.widget.RecyclerView.ViewHolder p0) { return 0; }
        public abstract void runPendingAnimations();
        public abstract void endAnimation(com.android.internal.widget.RecyclerView.ViewHolder p0);
        public abstract void endAnimations();
        public abstract boolean isRunning();
        public final void dispatchAnimationFinished(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        public void onAnimationFinished(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        public final void dispatchAnimationStarted(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        public void onAnimationStarted(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        public final boolean isRunning(com.android.internal.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener p0) { return false; }
        public boolean canReuseUpdatedViewHolder(com.android.internal.widget.RecyclerView.ViewHolder p0) { return false; }
        public boolean canReuseUpdatedViewHolder(com.android.internal.widget.RecyclerView.ViewHolder p0, java.util.List<java.lang.Object> p1) { return false; }
        public final void dispatchAnimationsFinished() {}
        public com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo obtainHolderInfo() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface AdapterChanges {
        }

        public static interface ItemAnimatorFinishedListener {
            public void onAnimationsFinished();
        }

        static interface ItemAnimatorListener {
            public void onAnimationFinished(com.android.internal.widget.RecyclerView.ViewHolder p0);
        }

        public static class ItemHolderInfo {
            public int left;
            public int top;
            public int right;
            public int bottom;
            public int changeFlags;
            public ItemHolderInfo() {}
            public com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo setFrom(com.android.internal.widget.RecyclerView.ViewHolder p0) { return null; }
            public com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo setFrom(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1) { return null; }
        }
    }

    private class ItemAnimatorRestoreListener implements com.android.internal.widget.RecyclerView.ItemAnimator.ItemAnimatorListener {
        ItemAnimatorRestoreListener(com.android.internal.widget.RecyclerView p0) {}
        public void onAnimationFinished(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    }

    public static abstract class ItemDecoration {
        public ItemDecoration() {}
        public void onDraw(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1, com.android.internal.widget.RecyclerView.State p2) {}
        @java.lang.Deprecated
        public void onDraw(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1) {}
        public void onDrawOver(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1, com.android.internal.widget.RecyclerView.State p2) {}
        @java.lang.Deprecated
        public void onDrawOver(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1) {}
        @java.lang.Deprecated
        public void getItemOffsets(android.graphics.Rect p0, int p1, com.android.internal.widget.RecyclerView p2) {}
        public void getItemOffsets(android.graphics.Rect p0, android.view.View p1, com.android.internal.widget.RecyclerView p2, com.android.internal.widget.RecyclerView.State p3) {}
    }

    public static abstract class LayoutManager {
        com.android.internal.widget.ChildHelper mChildHelper;
        com.android.internal.widget.RecyclerView mRecyclerView;
        com.android.internal.widget.RecyclerView.SmoothScroller mSmoothScroller;
        boolean mRequestedSimpleAnimations;
        boolean mIsAttachedToWindow;
        boolean mAutoMeasure;
        private boolean mMeasurementCacheEnabled;
        private boolean mItemPrefetchEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        private int mWidthMode;
        private int mHeightMode;
        private int mWidth;
        private int mHeight;
        public LayoutManager() {}
        void setRecyclerView(com.android.internal.widget.RecyclerView p0) {}
        void setMeasureSpecs(int p0, int p1) {}
        void setMeasuredDimensionFromChildren(int p0, int p1) {}
        public void setMeasuredDimension(android.graphics.Rect p0, int p1, int p2) {}
        public void requestLayout() {}
        public void assertInLayoutOrScroll(java.lang.String p0) {}
        public static int chooseSize(int p0, int p1, int p2) { return 0; }
        public void assertNotInLayoutOrScroll(java.lang.String p0) {}
        public void setAutoMeasureEnabled(boolean p0) {}
        public boolean isAutoMeasureEnabled() { return false; }
        public boolean supportsPredictiveItemAnimations() { return false; }
        public final void setItemPrefetchEnabled(boolean p0) {}
        public final boolean isItemPrefetchEnabled() { return false; }
        public void collectAdjacentPrefetchPositions(int p0, int p1, com.android.internal.widget.RecyclerView.State p2, com.android.internal.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry p3) {}
        public void collectInitialPrefetchPositions(int p0, com.android.internal.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry p1) {}
        void dispatchAttachedToWindow(com.android.internal.widget.RecyclerView p0) {}
        void dispatchDetachedFromWindow(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.Recycler p1) {}
        public boolean isAttachedToWindow() { return false; }
        public void postOnAnimation(java.lang.Runnable p0) {}
        public boolean removeCallbacks(java.lang.Runnable p0) { return false; }
        public void onAttachedToWindow(com.android.internal.widget.RecyclerView p0) {}
        @java.lang.Deprecated
        public void onDetachedFromWindow(com.android.internal.widget.RecyclerView p0) {}
        public void onDetachedFromWindow(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.Recycler p1) {}
        public boolean getClipToPadding() { return false; }
        public void onLayoutChildren(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) {}
        public void onLayoutCompleted(com.android.internal.widget.RecyclerView.State p0) {}
        public abstract com.android.internal.widget.RecyclerView.LayoutParams generateDefaultLayoutParams();
        public boolean checkLayoutParams(com.android.internal.widget.RecyclerView.LayoutParams p0) { return false; }
        public com.android.internal.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
        public com.android.internal.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context p0, android.util.AttributeSet p1) { return null; }
        public int scrollHorizontallyBy(int p0, com.android.internal.widget.RecyclerView.Recycler p1, com.android.internal.widget.RecyclerView.State p2) { return 0; }
        public int scrollVerticallyBy(int p0, com.android.internal.widget.RecyclerView.Recycler p1, com.android.internal.widget.RecyclerView.State p2) { return 0; }
        public boolean canScrollHorizontally() { return false; }
        public boolean canScrollVertically() { return false; }
        public void scrollToPosition(int p0) {}
        public void smoothScrollToPosition(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.State p1, int p2) {}
        public void startSmoothScroll(com.android.internal.widget.RecyclerView.SmoothScroller p0) {}
        public boolean isSmoothScrolling() { return false; }
        public int getLayoutDirection() { return 0; }
        public void endAnimation(android.view.View p0) {}
        public void addDisappearingView(android.view.View p0) {}
        public void addDisappearingView(android.view.View p0, int p1) {}
        public void addView(android.view.View p0) {}
        public void addView(android.view.View p0, int p1) {}
        private void addViewInt(android.view.View p0, int p1, boolean p2) {}
        public void removeView(android.view.View p0) {}
        public void removeViewAt(int p0) {}
        public void removeAllViews() {}
        public int getBaseline() { return 0; }
        public int getPosition(android.view.View p0) { return 0; }
        public int getItemViewType(android.view.View p0) { return 0; }
        public android.view.View findContainingItemView(android.view.View p0) { return null; }
        public android.view.View findViewByPosition(int p0) { return null; }
        public void detachView(android.view.View p0) {}
        public void detachViewAt(int p0) {}
        private void detachViewInternal(int p0, android.view.View p1) {}
        public void attachView(android.view.View p0, int p1, com.android.internal.widget.RecyclerView.LayoutParams p2) {}
        public void attachView(android.view.View p0, int p1) {}
        public void attachView(android.view.View p0) {}
        public void removeDetachedView(android.view.View p0) {}
        public void moveView(int p0, int p1) {}
        public void detachAndScrapView(android.view.View p0, com.android.internal.widget.RecyclerView.Recycler p1) {}
        public void detachAndScrapViewAt(int p0, com.android.internal.widget.RecyclerView.Recycler p1) {}
        public void removeAndRecycleView(android.view.View p0, com.android.internal.widget.RecyclerView.Recycler p1) {}
        public void removeAndRecycleViewAt(int p0, com.android.internal.widget.RecyclerView.Recycler p1) {}
        public int getChildCount() { return 0; }
        public android.view.View getChildAt(int p0) { return null; }
        public int getWidthMode() { return 0; }
        public int getHeightMode() { return 0; }
        public int getWidth() { return 0; }
        public int getHeight() { return 0; }
        public int getPaddingLeft() { return 0; }
        public int getPaddingTop() { return 0; }
        public int getPaddingRight() { return 0; }
        public int getPaddingBottom() { return 0; }
        public int getPaddingStart() { return 0; }
        public int getPaddingEnd() { return 0; }
        public boolean isFocused() { return false; }
        public boolean hasFocus() { return false; }
        public android.view.View getFocusedChild() { return null; }
        public int getItemCount() { return 0; }
        public void offsetChildrenHorizontal(int p0) {}
        public void offsetChildrenVertical(int p0) {}
        public void ignoreView(android.view.View p0) {}
        public void stopIgnoringView(android.view.View p0) {}
        public void detachAndScrapAttachedViews(com.android.internal.widget.RecyclerView.Recycler p0) {}
        private void scrapOrRecycleView(com.android.internal.widget.RecyclerView.Recycler p0, int p1, android.view.View p2) {}
        void removeAndRecycleScrapInt(com.android.internal.widget.RecyclerView.Recycler p0) {}
        public void measureChild(android.view.View p0, int p1, int p2) {}
        boolean shouldReMeasureChild(android.view.View p0, int p1, int p2, com.android.internal.widget.RecyclerView.LayoutParams p3) { return false; }
        boolean shouldMeasureChild(android.view.View p0, int p1, int p2, com.android.internal.widget.RecyclerView.LayoutParams p3) { return false; }
        public boolean isMeasurementCacheEnabled() { return false; }
        public void setMeasurementCacheEnabled(boolean p0) {}
        private static boolean isMeasurementUpToDate(int p0, int p1, int p2) { return false; }
        public void measureChildWithMargins(android.view.View p0, int p1, int p2) {}
        @java.lang.Deprecated
        public static int getChildMeasureSpec(int p0, int p1, int p2, boolean p3) { return 0; }
        public static int getChildMeasureSpec(int p0, int p1, int p2, int p3, boolean p4) { return 0; }
        public int getDecoratedMeasuredWidth(android.view.View p0) { return 0; }
        public int getDecoratedMeasuredHeight(android.view.View p0) { return 0; }
        public void layoutDecorated(android.view.View p0, int p1, int p2, int p3, int p4) {}
        public void layoutDecoratedWithMargins(android.view.View p0, int p1, int p2, int p3, int p4) {}
        public void getTransformedBoundingBox(android.view.View p0, boolean p1, android.graphics.Rect p2) {}
        public void getDecoratedBoundsWithMargins(android.view.View p0, android.graphics.Rect p1) {}
        public int getDecoratedLeft(android.view.View p0) { return 0; }
        public int getDecoratedTop(android.view.View p0) { return 0; }
        public int getDecoratedRight(android.view.View p0) { return 0; }
        public int getDecoratedBottom(android.view.View p0) { return 0; }
        public void calculateItemDecorationsForChild(android.view.View p0, android.graphics.Rect p1) {}
        public int getTopDecorationHeight(android.view.View p0) { return 0; }
        public int getBottomDecorationHeight(android.view.View p0) { return 0; }
        public int getLeftDecorationWidth(android.view.View p0) { return 0; }
        public int getRightDecorationWidth(android.view.View p0) { return 0; }
        public android.view.View onFocusSearchFailed(android.view.View p0, int p1, com.android.internal.widget.RecyclerView.Recycler p2, com.android.internal.widget.RecyclerView.State p3) { return null; }
        public android.view.View onInterceptFocusSearch(android.view.View p0, int p1) { return null; }
        public boolean requestChildRectangleOnScreen(com.android.internal.widget.RecyclerView p0, android.view.View p1, android.graphics.Rect p2, boolean p3) { return false; }
        @java.lang.Deprecated
        public boolean onRequestChildFocus(com.android.internal.widget.RecyclerView p0, android.view.View p1, android.view.View p2) { return false; }
        public boolean onRequestChildFocus(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.State p1, android.view.View p2, android.view.View p3) { return false; }
        public void onAdapterChanged(com.android.internal.widget.RecyclerView.Adapter p0, com.android.internal.widget.RecyclerView.Adapter p1) {}
        public boolean onAddFocusables(com.android.internal.widget.RecyclerView p0, java.util.ArrayList<android.view.View> p1, int p2, int p3) { return false; }
        public void onItemsChanged(com.android.internal.widget.RecyclerView p0) {}
        public void onItemsAdded(com.android.internal.widget.RecyclerView p0, int p1, int p2) {}
        public void onItemsRemoved(com.android.internal.widget.RecyclerView p0, int p1, int p2) {}
        public void onItemsUpdated(com.android.internal.widget.RecyclerView p0, int p1, int p2) {}
        public void onItemsUpdated(com.android.internal.widget.RecyclerView p0, int p1, int p2, java.lang.Object p3) {}
        public void onItemsMoved(com.android.internal.widget.RecyclerView p0, int p1, int p2, int p3) {}
        public int computeHorizontalScrollExtent(com.android.internal.widget.RecyclerView.State p0) { return 0; }
        public int computeHorizontalScrollOffset(com.android.internal.widget.RecyclerView.State p0) { return 0; }
        public int computeHorizontalScrollRange(com.android.internal.widget.RecyclerView.State p0) { return 0; }
        public int computeVerticalScrollExtent(com.android.internal.widget.RecyclerView.State p0) { return 0; }
        public int computeVerticalScrollOffset(com.android.internal.widget.RecyclerView.State p0) { return 0; }
        public int computeVerticalScrollRange(com.android.internal.widget.RecyclerView.State p0) { return 0; }
        public void onMeasure(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, int p2, int p3) {}
        public void setMeasuredDimension(int p0, int p1) {}
        public int getMinimumWidth() { return 0; }
        public int getMinimumHeight() { return 0; }
        public android.os.Parcelable onSaveInstanceState() { return null; }
        public void onRestoreInstanceState(android.os.Parcelable p0) {}
        void stopSmoothScroller() {}
        private void onSmoothScrollerStopped(com.android.internal.widget.RecyclerView.SmoothScroller p0) {}
        public void onScrollStateChanged(int p0) {}
        public void removeAndRecycleAllViews(com.android.internal.widget.RecyclerView.Recycler p0) {}
        void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
        public void onInitializeAccessibilityNodeInfo(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, android.view.accessibility.AccessibilityNodeInfo p2) {}
        public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
        public void onInitializeAccessibilityEvent(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, android.view.accessibility.AccessibilityEvent p2) {}
        void onInitializeAccessibilityNodeInfoForItem(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
        public void onInitializeAccessibilityNodeInfoForItem(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, android.view.View p2, android.view.accessibility.AccessibilityNodeInfo p3) {}
        public void requestSimpleAnimationsInNextLayout() {}
        public int getSelectionModeForAccessibility(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return 0; }
        public int getRowCountForAccessibility(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return 0; }
        public int getColumnCountForAccessibility(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return 0; }
        public boolean isLayoutHierarchical(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1) { return false; }
        boolean performAccessibilityAction(int p0, android.os.Bundle p1) { return false; }
        public boolean performAccessibilityAction(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, int p2, android.os.Bundle p3) { return false; }
        boolean performAccessibilityActionForItem(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
        public boolean performAccessibilityActionForItem(com.android.internal.widget.RecyclerView.Recycler p0, com.android.internal.widget.RecyclerView.State p1, android.view.View p2, int p3, android.os.Bundle p4) { return false; }
        public static com.android.internal.widget.RecyclerView.LayoutManager.Properties getProperties(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { return null; }
        void setExactMeasureSpecsFrom(com.android.internal.widget.RecyclerView p0) {}
        boolean shouldMeasureTwice() { return false; }
        boolean hasFlexibleChildInBothOrientations() { return false; }

        public static interface LayoutPrefetchRegistry {
            public void addPosition(int p0, int p1);
        }

        public static class Properties {
            public int orientation;
            public int spanCount;
            public boolean reverseLayout;
            public boolean stackFromEnd;
            public Properties() {}
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        com.android.internal.widget.RecyclerView.ViewHolder mViewHolder;
        final android.graphics.Rect mDecorInsets = null;
        boolean mInsetsDirty;
        boolean mPendingInvalidate;
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(com.android.internal.widget.RecyclerView.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public boolean viewNeedsUpdate() { return false; }
        public boolean isViewInvalid() { return false; }
        public boolean isItemRemoved() { return false; }
        public boolean isItemChanged() { return false; }
        @java.lang.Deprecated
        public int getViewPosition() { return 0; }
        public int getViewLayoutPosition() { return 0; }
        public int getViewAdapterPosition() { return 0; }
    }

    public static interface OnChildAttachStateChangeListener {
        public void onChildViewAttachedToWindow(android.view.View p0);
        public void onChildViewDetachedFromWindow(android.view.View p0);
    }

    public static abstract class OnFlingListener {
        public OnFlingListener() {}
        public abstract boolean onFling(int p0, int p1);
    }

    public static interface OnItemTouchListener {
        public boolean onInterceptTouchEvent(com.android.internal.widget.RecyclerView p0, android.view.MotionEvent p1);
        public void onTouchEvent(com.android.internal.widget.RecyclerView p0, android.view.MotionEvent p1);
        public void onRequestDisallowInterceptTouchEvent(boolean p0);
    }

    public static abstract class OnScrollListener {
        public OnScrollListener() {}
        public void onScrollStateChanged(com.android.internal.widget.RecyclerView p0, int p1) {}
        public void onScrolled(com.android.internal.widget.RecyclerView p0, int p1, int p2) {}
    }

    public static class RecycledViewPool {
        private static final int DEFAULT_MAX_SCRAP = 5;
        android.util.SparseArray<com.android.internal.widget.RecyclerView.RecycledViewPool.ScrapData> mScrap;
        private int mAttachCount;
        public RecycledViewPool() {}
        public void clear() {}
        public void setMaxRecycledViews(int p0, int p1) {}
        public int getRecycledViewCount(int p0) { return 0; }
        public com.android.internal.widget.RecyclerView.ViewHolder getRecycledView(int p0) { return null; }
        int size() { return 0; }
        public void putRecycledView(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        long runningAverage(long p0, long p1) { return 0L; }
        void factorInCreateTime(int p0, long p1) {}
        void factorInBindTime(int p0, long p1) {}
        boolean willCreateInTime(int p0, long p1, long p2) { return false; }
        boolean willBindInTime(int p0, long p1, long p2) { return false; }
        void attach(com.android.internal.widget.RecyclerView.Adapter p0) {}
        void detach() {}
        void onAdapterChanged(com.android.internal.widget.RecyclerView.Adapter p0, com.android.internal.widget.RecyclerView.Adapter p1, boolean p2) {}
        private com.android.internal.widget.RecyclerView.RecycledViewPool.ScrapData getScrapDataForType(int p0) { return null; }

        static class ScrapData {
            java.util.ArrayList<com.android.internal.widget.RecyclerView.ViewHolder> mScrapHeap;
            int mMaxScrap;
            long mCreateRunningAverageNs;
            long mBindRunningAverageNs;
            ScrapData() {}
        }
    }

    public final class Recycler {
        final java.util.ArrayList<com.android.internal.widget.RecyclerView.ViewHolder> mAttachedScrap = null;
        java.util.ArrayList<com.android.internal.widget.RecyclerView.ViewHolder> mChangedScrap;
        final java.util.ArrayList<com.android.internal.widget.RecyclerView.ViewHolder> mCachedViews = null;
        private final java.util.List<com.android.internal.widget.RecyclerView.ViewHolder> mUnmodifiableAttachedScrap = null;
        private int mRequestedCacheMax;
        int mViewCacheMax;
        com.android.internal.widget.RecyclerView.RecycledViewPool mRecyclerPool;
        private com.android.internal.widget.RecyclerView.ViewCacheExtension mViewCacheExtension;
        static final int DEFAULT_CACHE_SIZE = 2;
        public Recycler(com.android.internal.widget.RecyclerView p0) {}
        public void clear() {}
        public void setViewCacheSize(int p0) {}
        void updateViewCacheSize() {}
        public java.util.List<com.android.internal.widget.RecyclerView.ViewHolder> getScrapList() { return null; }
        boolean validateViewHolderForOffsetPosition(com.android.internal.widget.RecyclerView.ViewHolder p0) { return false; }
        private boolean tryBindViewHolderByDeadline(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1, int p2, long p3) { return false; }
        public void bindViewToPosition(android.view.View p0, int p1) {}
        public int convertPreLayoutPositionToPostLayout(int p0) { return 0; }
        public android.view.View getViewForPosition(int p0) { return null; }
        android.view.View getViewForPosition(int p0, boolean p1) { return null; }
        com.android.internal.widget.RecyclerView.ViewHolder tryGetViewHolderForPositionByDeadline(int p0, boolean p1, long p2) { return null; }
        private void attachAccessibilityDelegate(android.view.View p0) {}
        private void invalidateDisplayListInt(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        private void invalidateDisplayListInt(android.view.ViewGroup p0, boolean p1) {}
        public void recycleView(android.view.View p0) {}
        void recycleViewInternal(android.view.View p0) {}
        void recycleAndClearCachedViews() {}
        void recycleCachedViewAt(int p0) {}
        void recycleViewHolderInternal(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        void addViewHolderToRecycledViewPool(com.android.internal.widget.RecyclerView.ViewHolder p0, boolean p1) {}
        void quickRecycleScrapView(android.view.View p0) {}
        void scrapView(android.view.View p0) {}
        void unscrapView(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        int getScrapCount() { return 0; }
        android.view.View getScrapViewAt(int p0) { return null; }
        void clearScrap() {}
        com.android.internal.widget.RecyclerView.ViewHolder getChangedScrapViewForPosition(int p0) { return null; }
        com.android.internal.widget.RecyclerView.ViewHolder getScrapOrHiddenOrCachedHolderForPosition(int p0, boolean p1) { return null; }
        com.android.internal.widget.RecyclerView.ViewHolder getScrapOrCachedViewForId(long p0, int p1, boolean p2) { return null; }
        void dispatchViewRecycled(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
        void onAdapterChanged(com.android.internal.widget.RecyclerView.Adapter p0, com.android.internal.widget.RecyclerView.Adapter p1, boolean p2) {}
        void offsetPositionRecordsForMove(int p0, int p1) {}
        void offsetPositionRecordsForInsert(int p0, int p1) {}
        void offsetPositionRecordsForRemove(int p0, int p1, boolean p2) {}
        void setViewCacheExtension(com.android.internal.widget.RecyclerView.ViewCacheExtension p0) {}
        void setRecycledViewPool(com.android.internal.widget.RecyclerView.RecycledViewPool p0) {}
        com.android.internal.widget.RecyclerView.RecycledViewPool getRecycledViewPool() { return null; }
        void viewRangeUpdate(int p0, int p1) {}
        void setAdapterPositionsAsUnknown() {}
        void markKnownViewsInvalid() {}
        void clearOldPositions() {}
        void markItemDecorInsetsDirty() {}
    }

    public static interface RecyclerListener {
        public void onViewRecycled(com.android.internal.widget.RecyclerView.ViewHolder p0);
    }

    private class RecyclerViewDataObserver extends com.android.internal.widget.RecyclerView.AdapterDataObserver {
        RecyclerViewDataObserver(com.android.internal.widget.RecyclerView p0) { super(); }
        public void onChanged() {}
        public void onItemRangeChanged(int p0, int p1, java.lang.Object p2) {}
        public void onItemRangeInserted(int p0, int p1) {}
        public void onItemRangeRemoved(int p0, int p1) {}
        public void onItemRangeMoved(int p0, int p1, int p2) {}
        void triggerUpdateProcessor() {}
    }

    public static class SavedState extends android.view.AbsSavedState {
        android.os.Parcelable mLayoutState;
        public static final android.os.Parcelable.Creator<com.android.internal.widget.RecyclerView.SavedState> CREATOR = null;
        SavedState(android.os.Parcel p0) { super((android.os.Parcelable)null); }
        SavedState(android.os.Parcelable p0) { super((android.os.Parcelable)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        void copyFrom(com.android.internal.widget.RecyclerView.SavedState p0) {}
    }

    public static class SimpleOnItemTouchListener implements com.android.internal.widget.RecyclerView.OnItemTouchListener {
        public SimpleOnItemTouchListener() {}
        public boolean onInterceptTouchEvent(com.android.internal.widget.RecyclerView p0, android.view.MotionEvent p1) { return false; }
        public void onTouchEvent(com.android.internal.widget.RecyclerView p0, android.view.MotionEvent p1) {}
        public void onRequestDisallowInterceptTouchEvent(boolean p0) {}
    }

    public static abstract class SmoothScroller {
        private int mTargetPosition;
        private com.android.internal.widget.RecyclerView mRecyclerView;
        private com.android.internal.widget.RecyclerView.LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private boolean mRunning;
        private android.view.View mTargetView;
        private final com.android.internal.widget.RecyclerView.SmoothScroller.Action mRecyclingAction = null;
        public SmoothScroller() {}
        void start(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.LayoutManager p1) {}
        public void setTargetPosition(int p0) {}
        public com.android.internal.widget.RecyclerView.LayoutManager getLayoutManager() { return null; }
        protected final void stop() {}
        public boolean isPendingInitialRun() { return false; }
        public boolean isRunning() { return false; }
        public int getTargetPosition() { return 0; }
        private void onAnimation(int p0, int p1) {}
        public int getChildPosition(android.view.View p0) { return 0; }
        public int getChildCount() { return 0; }
        public android.view.View findViewByPosition(int p0) { return null; }
        @java.lang.Deprecated
        public void instantScrollToPosition(int p0) {}
        protected void onChildAttachedToWindow(android.view.View p0) {}
        protected void normalize(android.graphics.PointF p0) {}
        protected abstract void onStart();
        protected abstract void onStop();
        protected abstract void onSeekTargetStep(int p0, int p1, com.android.internal.widget.RecyclerView.State p2, com.android.internal.widget.RecyclerView.SmoothScroller.Action p3);
        protected abstract void onTargetFound(android.view.View p0, com.android.internal.widget.RecyclerView.State p1, com.android.internal.widget.RecyclerView.SmoothScroller.Action p2);

        public static class Action {
            public static final int UNDEFINED_DURATION = -2147483648;
            private int mDx;
            private int mDy;
            private int mDuration;
            private int mJumpToPosition;
            private android.view.animation.Interpolator mInterpolator;
            private boolean mChanged;
            private int mConsecutiveUpdates;
            public Action(int p0, int p1) {}
            public Action(int p0, int p1, int p2) {}
            public Action(int p0, int p1, int p2, android.view.animation.Interpolator p3) {}
            public void jumpTo(int p0) {}
            boolean hasJumpTarget() { return false; }
            void runIfNecessary(com.android.internal.widget.RecyclerView p0) {}
            private void validate() {}
            public int getDx() { return 0; }
            public void setDx(int p0) {}
            public int getDy() { return 0; }
            public void setDy(int p0) {}
            public int getDuration() { return 0; }
            public void setDuration(int p0) {}
            public android.view.animation.Interpolator getInterpolator() { return null; }
            public void setInterpolator(android.view.animation.Interpolator p0) {}
            public void update(int p0, int p1, int p2, android.view.animation.Interpolator p3) {}
        }

        public static interface ScrollVectorProvider {
            public android.graphics.PointF computeScrollVectorForPosition(int p0);
        }
    }

    public static class State {
        static final int STEP_START = 1;
        static final int STEP_LAYOUT = 2;
        static final int STEP_ANIMATIONS = 4;
        private int mTargetPosition;
        private android.util.SparseArray<java.lang.Object> mData;
        int mPreviousLayoutItemCount;
        int mDeletedInvisibleItemCountSincePreviousLayout;
        int mLayoutStep;
        int mItemCount;
        boolean mStructureChanged;
        boolean mInPreLayout;
        boolean mTrackOldChangeHolders;
        boolean mIsMeasuring;
        boolean mRunSimpleAnimations;
        boolean mRunPredictiveAnimations;
        int mFocusedItemPosition;
        long mFocusedItemId;
        int mFocusedSubChildId;
        public State() {}
        void assertLayoutStep(int p0) {}
        com.android.internal.widget.RecyclerView.State reset() { return null; }
        void prepareForNestedPrefetch(com.android.internal.widget.RecyclerView.Adapter p0) {}
        public boolean isMeasuring() { return false; }
        public boolean isPreLayout() { return false; }
        public boolean willRunPredictiveAnimations() { return false; }
        public boolean willRunSimpleAnimations() { return false; }
        public void remove(int p0) {}
        public <T extends java.lang.Object> T get(int p0) { return null; }
        public void put(int p0, java.lang.Object p1) {}
        public int getTargetScrollPosition() { return 0; }
        public boolean hasTargetScrollPosition() { return false; }
        public boolean didStructureChange() { return false; }
        public int getItemCount() { return 0; }
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        static @interface LayoutState {
        }
    }

    public static abstract class ViewCacheExtension {
        public ViewCacheExtension() {}
        public abstract android.view.View getViewForPositionAndType(com.android.internal.widget.RecyclerView.Recycler p0, int p1, int p2);
    }

    class ViewFlinger implements java.lang.Runnable {
        private int mLastFlingX;
        private int mLastFlingY;
        private android.widget.OverScroller mScroller;
        android.view.animation.Interpolator mInterpolator;
        private boolean mEatRunOnAnimationRequest;
        private boolean mReSchedulePostAnimationCallback;
        ViewFlinger(com.android.internal.widget.RecyclerView p0) {}
        public void run() {}
        private void disableRunOnAnimationRequests() {}
        private void enableRunOnAnimationRequests() {}
        void postOnAnimation() {}
        public void fling(int p0, int p1) {}
        public void smoothScrollBy(int p0, int p1) {}
        public void smoothScrollBy(int p0, int p1, int p2, int p3) {}
        private float distanceInfluenceForSnapDuration(float p0) { return 0.0f; }
        private int computeScrollDuration(int p0, int p1, int p2, int p3) { return 0; }
        public void smoothScrollBy(int p0, int p1, int p2) {}
        public void smoothScrollBy(int p0, int p1, android.view.animation.Interpolator p2) {}
        public void smoothScrollBy(int p0, int p1, int p2, android.view.animation.Interpolator p3) {}
        public void stop() {}
    }

    public static abstract class ViewHolder {
        public final android.view.View itemView = null;
        java.lang.ref.WeakReference<com.android.internal.widget.RecyclerView> mNestedRecyclerView;
        int mPosition;
        int mOldPosition;
        long mItemId;
        int mItemViewType;
        int mPreLayoutPosition;
        com.android.internal.widget.RecyclerView.ViewHolder mShadowedHolder;
        com.android.internal.widget.RecyclerView.ViewHolder mShadowingHolder;
        static final int FLAG_BOUND = 1;
        static final int FLAG_UPDATE = 2;
        static final int FLAG_INVALID = 4;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        private int mFlags;
        private static final java.util.List<java.lang.Object> FULLUPDATE_PAYLOADS = null;
        java.util.List<java.lang.Object> mPayloads;
        java.util.List<java.lang.Object> mUnmodifiedPayloads;
        private int mIsRecyclableCount;
        private com.android.internal.widget.RecyclerView.Recycler mScrapContainer;
        private boolean mInChangeScrap;
        private int mWasImportantForAccessibilityBeforeHidden;
        int mPendingAccessibilityState;
        com.android.internal.widget.RecyclerView mOwnerRecyclerView;
        public ViewHolder(android.view.View p0) {}
        void flagRemovedAndOffsetPosition(int p0, int p1, boolean p2) {}
        void offsetPosition(int p0, boolean p1) {}
        void clearOldPosition() {}
        void saveOldPosition() {}
        boolean shouldIgnore() { return false; }
        @java.lang.Deprecated
        public final int getPosition() { return 0; }
        public final int getLayoutPosition() { return 0; }
        public final int getAdapterPosition() { return 0; }
        public final int getOldPosition() { return 0; }
        public final long getItemId() { return 0L; }
        public final int getItemViewType() { return 0; }
        boolean isScrap() { return false; }
        void unScrap() {}
        boolean wasReturnedFromScrap() { return false; }
        void clearReturnedFromScrapFlag() {}
        void clearTmpDetachFlag() {}
        void stopIgnoring() {}
        void setScrapContainer(com.android.internal.widget.RecyclerView.Recycler p0, boolean p1) {}
        boolean isInvalid() { return false; }
        boolean needsUpdate() { return false; }
        boolean isBound() { return false; }
        boolean isRemoved() { return false; }
        boolean hasAnyOfTheFlags(int p0) { return false; }
        boolean isTmpDetached() { return false; }
        boolean isAdapterPositionUnknown() { return false; }
        void setFlags(int p0, int p1) {}
        void addFlags(int p0) {}
        void addChangePayload(java.lang.Object p0) {}
        private void createPayloadsIfNeeded() {}
        void clearPayload() {}
        java.util.List<java.lang.Object> getUnmodifiedPayloads() { return null; }
        void resetInternal() {}
        private void onEnteredHiddenState(com.android.internal.widget.RecyclerView p0) {}
        private void onLeftHiddenState(com.android.internal.widget.RecyclerView p0) {}
        public java.lang.String toString() { return null; }
        public final void setIsRecyclable(boolean p0) {}
        public final boolean isRecyclable() { return false; }
        private boolean shouldBeKeptAsChild() { return false; }
        private boolean doesTransientStatePreventRecycling() { return false; }
        boolean isUpdated() { return false; }
    }
}
