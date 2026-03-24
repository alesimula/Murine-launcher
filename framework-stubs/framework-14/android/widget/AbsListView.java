package android.widget;

public abstract class AbsListView extends android.widget.AdapterView<android.widget.ListAdapter> implements android.text.TextWatcher, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.Filter.FilterListener, android.view.ViewTreeObserver.OnTouchModeChangeListener, android.widget.RemoteViewsAdapter.RemoteAdapterConnectionCallback {
    public static final int TRANSCRIPT_MODE_DISABLED = 0;
    public static final int TRANSCRIPT_MODE_NORMAL = 1;
    public static final int TRANSCRIPT_MODE_ALWAYS_SCROLL = 2;
    static final int TOUCH_MODE_REST = -1;
    static final int TOUCH_MODE_DOWN = 0;
    static final int TOUCH_MODE_TAP = 1;
    static final int TOUCH_MODE_DONE_WAITING = 2;
    static final int TOUCH_MODE_SCROLL = 3;
    static final int TOUCH_MODE_FLING = 4;
    static final int TOUCH_MODE_OVERSCROLL = 5;
    static final int TOUCH_MODE_OVERFLING = 6;
    static final int LAYOUT_NORMAL = 0;
    static final int LAYOUT_FORCE_TOP = 1;
    static final int LAYOUT_SET_SELECTION = 2;
    static final int LAYOUT_FORCE_BOTTOM = 3;
    static final int LAYOUT_SPECIFIC = 4;
    static final int LAYOUT_SYNC = 5;
    static final int LAYOUT_MOVE_SELECTION = 6;
    public static final int CHOICE_MODE_NONE = 0;
    public static final int CHOICE_MODE_SINGLE = 1;
    public static final int CHOICE_MODE_MULTIPLE = 2;
    public static final int CHOICE_MODE_MULTIPLE_MODAL = 3;
    int mChoiceMode;
    android.view.ActionMode mChoiceActionMode;
    android.widget.AbsListView.MultiChoiceModeWrapper mMultiChoiceModeCallback;
    int mCheckedItemCount;
    android.util.SparseBooleanArray mCheckStates;
    android.util.LongSparseArray<java.lang.Integer> mCheckedIdStates;
    int mLayoutMode;
    android.widget.AbsListView.AdapterDataSetObserver mDataSetObserver;
    android.widget.ListAdapter mAdapter;
    boolean mAdapterHasStableIds;
    boolean mDrawSelectorOnTop;
    android.graphics.drawable.Drawable mSelector;
    int mSelectorPosition;
    android.graphics.Rect mSelectorRect;
    final android.widget.AbsListView.RecycleBin mRecycler = null;
    int mSelectionLeftPadding;
    int mSelectionTopPadding;
    int mSelectionRightPadding;
    int mSelectionBottomPadding;
    android.graphics.Rect mListPadding;
    int mWidthMeasureSpec;
    android.view.View mScrollUp;
    android.view.View mScrollDown;
    boolean mCachingStarted;
    boolean mCachingActive;
    int mMotionPosition;
    int mMotionViewOriginalTop;
    int mMotionViewNewTop;
    int mMotionX;
    int mMotionY;
    int mTouchMode;
    int mLastY;
    int mMotionCorrection;
    android.widget.AbsListView.AbsPositionScroller mPositionScroller;
    int mSelectedTop;
    boolean mStackFromBottom;
    boolean mScrollingCacheEnabled;
    boolean mFastScrollEnabled;
    boolean mFastScrollAlwaysVisible;
    android.widget.PopupWindow mPopup;
    android.widget.EditText mTextFilter;
    int mResurrectToPosition;
    int mOverscrollMax;
    static final int OVERSCROLL_LIMIT_DIVISOR = 3;
    java.lang.Runnable mPositionScrollAfterLayout;
    final boolean[] mIsScrap = null;
    int mOverscrollDistance;
    int mOverflingDistance;
    public android.widget.EdgeEffect mEdgeGlowTop;
    public android.widget.EdgeEffect mEdgeGlowBottom;
    static final android.view.animation.Interpolator sLinearInterpolator = null;
    public AbsListView(android.content.Context p0) { super((android.content.Context)null); }
    public AbsListView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AbsListView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AbsListView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void setAdapter(android.widget.ListAdapter p0) {}
    public int getCheckedItemCount() { return 0; }
    public boolean isItemChecked(int p0) { return false; }
    public int getCheckedItemPosition() { return 0; }
    public android.util.SparseBooleanArray getCheckedItemPositions() { return null; }
    public long[] getCheckedItemIds() { return null; }
    public void clearChoices() {}
    public void setItemChecked(int p0, boolean p1) {}
    public boolean performItemClick(android.view.View p0, int p1, long p2) { return false; }
    public int getChoiceMode() { return 0; }
    public void setChoiceMode(int p0) {}
    public void setMultiChoiceModeListener(android.widget.AbsListView.MultiChoiceModeListener p0) {}
    public void setFastScrollEnabled(boolean p0) {}
    public void setFastScrollStyle(int p0) {}
    public void setFastScrollAlwaysVisible(boolean p0) {}
    public boolean isFastScrollAlwaysVisible() { return false; }
    public int getVerticalScrollbarWidth() { return 0; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isFastScrollEnabled() { return false; }
    public void setVerticalScrollbarPosition(int p0) {}
    public void setScrollBarStyle(int p0) {}
    protected boolean isVerticalScrollBarHidden() { return false; }
    public void setSmoothScrollbarEnabled(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty
    public boolean isSmoothScrollbarEnabled() { return false; }
    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener p0) {}
    void invokeOnItemScrollListener() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    int getSelectionModeForAccessibility() { return 0; }
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isScrollingCacheEnabled() { return false; }
    public void setScrollingCacheEnabled(boolean p0) {}
    public void setTextFilterEnabled(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty
    public boolean isTextFilterEnabled() { return false; }
    public void getFocusedRect(android.graphics.Rect p0) {}
    @android.view.ViewDebug.ExportedProperty
    public boolean isStackFromBottom() { return false; }
    public void setStackFromBottom(boolean p0) {}
    void requestLayoutIfNecessary() {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public void setFilterText(java.lang.String p0) {}
    public java.lang.CharSequence getTextFilter() { return null; }
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    public void requestLayout() {}
    void resetList() {}
    protected int computeVerticalScrollExtent() { return 0; }
    protected int computeVerticalScrollOffset() { return 0; }
    protected int computeVerticalScrollRange() { return 0; }
    protected float getTopFadingEdgeStrength() { return 0.0f; }
    protected float getBottomFadingEdgeStrength() { return 0.0f; }
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    protected void layoutChildren() {}
    android.view.View getAccessibilityFocusedChild(android.view.View p0) { return null; }
    void updateScrollIndicators() {}
    @android.view.ViewDebug.ExportedProperty
    public android.view.View getSelectedView() { return null; }
    public int getListPaddingTop() { return 0; }
    public int getListPaddingBottom() { return 0; }
    public int getListPaddingLeft() { return 0; }
    public int getListPaddingRight() { return 0; }
    android.view.View obtainView(int p0, boolean[] p1) { return null; }
    public void onInitializeAccessibilityNodeInfoForItem(android.view.View p0, int p1, android.view.accessibility.AccessibilityNodeInfo p2) {}
    void positionSelectorLikeTouch(int p0, android.view.View p1, float p2, float p3) {}
    void positionSelectorLikeFocus(int p0, android.view.View p1) {}
    void positionSelector(int p0, android.view.View p1) {}
    public boolean isSelectedChildViewEnabled() { return false; }
    public void setSelectedChildViewEnabled(boolean p0) {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    protected boolean isPaddingOffsetRequired() { return false; }
    protected int getLeftPaddingOffset() { return 0; }
    protected int getTopPaddingOffset() { return 0; }
    protected int getRightPaddingOffset() { return 0; }
    protected int getBottomPaddingOffset() { return 0; }
    protected void internalSetPadding(int p0, int p1, int p2, int p3) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    void handleBoundsChange() {}
    boolean touchModeDrawsInPressedState() { return false; }
    boolean shouldShowSelector() { return false; }
    public final boolean shouldDrawSelector() { return false; }
    public void setDrawSelectorOnTop(boolean p0) {}
    public boolean isDrawSelectorOnTop() { return false; }
    public void setSelector(int p0) {}
    public void setSelector(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getSelector() { return null; }
    void keyPressed() {}
    public void setScrollIndicators(android.view.View p0, android.view.View p1) {}
    void updateSelectorState() {}
    protected void drawableStateChanged() {}
    public boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    public void jumpDrawablesToCurrentState() {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public void onWindowFocusChanged(boolean p0) {}
    public void onRtlPropertiesChanged(int p0) {}
    android.view.ContextMenu.ContextMenuInfo createContextMenuInfo(android.view.View p0, int p1, long p2) { return null; }
    public void onCancelPendingInputEvents() {}
    boolean performLongPress(android.view.View p0, int p1, long p2) { return false; }
    boolean performLongPress(android.view.View p0, int p1, long p2, float p3, float p4) { return false; }
    protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo() { return null; }
    public boolean showContextMenu() { return false; }
    public boolean showContextMenu(float p0, float p1) { return false; }
    public boolean showContextMenuForChild(android.view.View p0) { return false; }
    public boolean showContextMenuForChild(android.view.View p0, float p1, float p2) { return false; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    protected void dispatchSetPressed(boolean p0) {}
    public void dispatchDrawableHotspotChanged(float p0, float p1) {}
    public int pointToPosition(int p0, int p1) { return 0; }
    public long pointToRowId(int p0, int p1) { return 0L; }
    public void onTouchModeChanged(boolean p0) {}
    protected boolean handleScrollBarDragging(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    protected void onOverScrolled(int p0, int p1, boolean p2, boolean p3) {}
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public void fling(int p0) {}
    public boolean onStartNestedScroll(android.view.View p0, android.view.View p1, int p2) { return false; }
    public void onNestedScrollAccepted(android.view.View p0, android.view.View p1, int p2) {}
    public void onNestedScroll(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public boolean onNestedFling(android.view.View p0, float p1, float p2, boolean p3) { return false; }
    public void draw(android.graphics.Canvas p0) {}
    public void requestDisallowInterceptTouchEvent(boolean p0) {}
    public boolean onInterceptHoverEvent(android.view.MotionEvent p0) { return false; }
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent p0, int p1) { return null; }
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public void addTouchables(java.util.ArrayList<android.view.View> p0) {}
    void reportScrollStateChange(int p0) {}
    public void setFriction(float p0) {}
    public void setVelocityScale(float p0) {}
    android.widget.AbsListView.AbsPositionScroller createPositionScroller() { return null; }
    public void smoothScrollToPosition(int p0) {}
    public void smoothScrollToPositionFromTop(int p0, int p1, int p2) {}
    public void smoothScrollToPositionFromTop(int p0, int p1) {}
    public void smoothScrollToPosition(int p0, int p1) {}
    public void smoothScrollBy(int p0, int p1) {}
    void smoothScrollBy(int p0, int p1, boolean p2, boolean p3) {}
    void smoothScrollByOffset(int p0) {}
    public void scrollListBy(int p0) {}
    public boolean canScrollList(int p0) { return false; }
    boolean trackMotionScroll(int p0, int p1) { return false; }
    int getHeaderViewsCount() { return 0; }
    int getFooterViewsCount() { return 0; }
    abstract void fillGap(boolean p0);
    void hideSelector() {}
    int reconcileSelectedPosition() { return 0; }
    abstract int findMotionRow(int p0);
    int findClosestMotionRow(int p0) { return 0; }
    public void invalidateViews() {}
    boolean resurrectSelectionIfNeeded() { return false; }
    abstract void setSelectionInt(int p0);
    boolean resurrectSelection() { return false; }
    void confirmCheckedPositionsById() {}
    protected void handleDataChanged() {}
    protected void onDisplayHint(int p0) {}
    static int getDistance(android.graphics.Rect p0, android.graphics.Rect p1, int p2) { return 0; }
    protected boolean isInFilterMode() { return false; }
    boolean sendToTextFilter(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo p0) { return null; }
    public boolean checkInputConnectionProxy(android.view.View p0) { return false; }
    public void clearTextFilter() {}
    public boolean hasTextFilter() { return false; }
    public void onGlobalLayout() {}
    public void beforeTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public void onTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public void afterTextChanged(android.text.Editable p0) {}
    public void onFilterComplete(int p0) {}
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public android.widget.AbsListView.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    public void setTranscriptMode(int p0) {}
    public int getTranscriptMode() { return 0; }
    public int getSolidColor() { return 0; }
    public void setCacheColorHint(int p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public int getCacheColorHint() { return 0; }
    public void reclaimViews(java.util.List<android.view.View> p0) {}
    public void setRemoteViewsAdapter(android.content.Intent p0) {}
    public java.lang.Runnable setRemoteViewsAdapterAsync(android.content.Intent p0) { return null; }
    public void setRemoteViewsAdapter(android.content.Intent p0, boolean p1) {}
    public void setRemoteViewsInteractionHandler(android.widget.RemoteViews.InteractionHandler p0) {}
    public void deferNotifyDataSetChanged() {}
    public boolean onRemoteAdapterConnected() { return false; }
    public void onRemoteAdapterDisconnected() {}
    void setVisibleRangeHint(int p0, int p1) {}
    public void setEdgeEffectColor(int p0) {}
    public void setBottomEdgeEffectColor(int p0) {}
    public void setTopEdgeEffectColor(int p0) {}
    public int getTopEdgeEffectColor() { return 0; }
    public int getBottomEdgeEffectColor() { return 0; }
    public void setRecyclerListener(android.widget.AbsListView.RecyclerListener p0) {}
    public void onProvideContentCaptureStructure(android.view.ViewStructure p0, int p1) {}
    int getHeightForPosition(int p0) { return 0; }
    public void setSelectionFromTop(int p0, int p1) {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        @android.view.ViewDebug.ExportedProperty(category="list", mapping={@android.view.ViewDebug.IntToString(from=-1, to="ITEM_VIEW_TYPE_IGNORE"), @android.view.ViewDebug.IntToString(from=-2, to="ITEM_VIEW_TYPE_HEADER_OR_FOOTER")})
        int viewType;
        @android.view.ViewDebug.ExportedProperty(category="list")
        boolean recycledHeaderFooter;
        @android.view.ViewDebug.ExportedProperty(category="list")
        boolean forceAdd;
        int scrappedFromPosition;
        long itemId;
        boolean isEnabled;
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1, int p2) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    }

    public static interface RecyclerListener {
        public void onMovedToScrapHeap(android.view.View p0);
    }

    public static interface OnScrollListener {
        public static final int SCROLL_STATE_IDLE = 0;
        public static final int SCROLL_STATE_TOUCH_SCROLL = 1;
        public static final int SCROLL_STATE_FLING = 2;
        public void onScrollStateChanged(android.widget.AbsListView p0, int p1);
        public void onScroll(android.widget.AbsListView p0, int p1, int p2, int p3);
    }

    public static interface MultiChoiceModeListener extends android.view.ActionMode.Callback {
        public void onItemCheckedStateChanged(android.view.ActionMode p0, int p1, long p2, boolean p3);
    }

    public static interface SelectionBoundsAdjuster {
        public void adjustListItemSelectionBounds(android.graphics.Rect p0);
    }

    static abstract class AbsPositionScroller {
        AbsPositionScroller() {}
        public abstract void start(int p0);
        public abstract void start(int p0, int p1);
        public abstract void startWithOffset(int p0, int p1);
        public abstract void startWithOffset(int p0, int p1, int p2);
        public abstract void stop();
    }

    class AdapterDataSetObserver extends android.widget.AdapterView<android.widget.ListAdapter>.AdapterDataSetObserver {
        AdapterDataSetObserver(android.widget.AbsListView p0) { super(null); }
        public void onChanged() {}
        public void onInvalidated() {}
    }

    private class CheckForKeyLongPress extends android.widget.AbsListView.WindowRunnnable implements java.lang.Runnable {
        public void run() {}
    }

    private class CheckForLongPress extends android.widget.AbsListView.WindowRunnnable implements java.lang.Runnable {
        public void run() {}
    }

    private final class CheckForTap implements java.lang.Runnable {
        float x;
        float y;
        public void run() {}
    }

    private static class DeviceConfigChangeListener implements android.provider.DeviceConfig.OnPropertiesChangedListener {
        public void onPropertiesChanged(android.provider.DeviceConfig.Properties p0) {}
    }

    private class FlingRunnable implements java.lang.Runnable {
        FlingRunnable(android.widget.AbsListView p0) {}
        float getSplineFlingDistance(int p0) { return 0.0f; }
        void start(int p0) {}
        void startSpringback() {}
        void startOverfling(int p0) {}
        void edgeReached(int p0) {}
        void startScroll(int p0, int p1, boolean p2, boolean p3) {}
        void endFling() {}
        void flywheelTouch() {}
        public void run() {}
    }

    private class InputConnectionWrapper implements android.view.inputmethod.InputConnection {
        public InputConnectionWrapper(android.widget.AbsListView p0, android.view.inputmethod.EditorInfo p1) {}
        public boolean reportFullscreenMode(boolean p0) { return false; }
        public boolean performEditorAction(int p0) { return false; }
        public boolean sendKeyEvent(android.view.KeyEvent p0) { return false; }
        public java.lang.CharSequence getTextBeforeCursor(int p0, int p1) { return null; }
        public java.lang.CharSequence getTextAfterCursor(int p0, int p1) { return null; }
        public java.lang.CharSequence getSelectedText(int p0) { return null; }
        public android.view.inputmethod.SurroundingText getSurroundingText(int p0, int p1, int p2) { return null; }
        public int getCursorCapsMode(int p0) { return 0; }
        public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest p0, int p1) { return null; }
        public boolean deleteSurroundingText(int p0, int p1) { return false; }
        public boolean deleteSurroundingTextInCodePoints(int p0, int p1) { return false; }
        public boolean setComposingText(java.lang.CharSequence p0, int p1) { return false; }
        public boolean setComposingRegion(int p0, int p1) { return false; }
        public boolean finishComposingText() { return false; }
        public boolean commitText(java.lang.CharSequence p0, int p1) { return false; }
        public boolean commitCompletion(android.view.inputmethod.CompletionInfo p0) { return false; }
        public boolean commitCorrection(android.view.inputmethod.CorrectionInfo p0) { return false; }
        public boolean setSelection(int p0, int p1) { return false; }
        public boolean performContextMenuAction(int p0) { return false; }
        public boolean beginBatchEdit() { return false; }
        public boolean endBatchEdit() { return false; }
        public boolean clearMetaKeyStates(int p0) { return false; }
        public boolean performPrivateCommand(java.lang.String p0, android.os.Bundle p1) { return false; }
        public boolean requestCursorUpdates(int p0) { return false; }
        public boolean requestCursorUpdates(int p0, int p1) { return false; }
        public android.os.Handler getHandler() { return null; }
        public void closeConnection() {}
        public boolean commitContent(android.view.inputmethod.InputContentInfo p0, int p1, android.os.Bundle p2) { return false; }
    }

    class ListItemAccessibilityDelegate extends android.view.View.AccessibilityDelegate {
        ListItemAccessibilityDelegate(android.widget.AbsListView p0) { super(); }
        public void onInitializeAccessibilityNodeInfo(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
        public boolean performAccessibilityAction(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
    }

    class MultiChoiceModeWrapper implements android.widget.AbsListView.MultiChoiceModeListener {
        MultiChoiceModeWrapper(android.widget.AbsListView p0) {}
        public void setWrapped(android.widget.AbsListView.MultiChoiceModeListener p0) {}
        public boolean hasWrappedCallback() { return false; }
        public boolean onCreateActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
        public boolean onPrepareActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
        public boolean onActionItemClicked(android.view.ActionMode p0, android.view.MenuItem p1) { return false; }
        public void onDestroyActionMode(android.view.ActionMode p0) {}
        public void onItemCheckedStateChanged(android.view.ActionMode p0, int p1, long p2, boolean p3) {}
    }

    private class PerformClick extends android.widget.AbsListView.WindowRunnnable implements java.lang.Runnable {
        int mClickMotionPosition;
        public void run() {}
    }

    class PositionScroller extends android.widget.AbsListView.AbsPositionScroller implements java.lang.Runnable {
        PositionScroller(android.widget.AbsListView p0) { super(); }
        public void start(int p0) {}
        public void start(int p0, int p1) {}
        public void startWithOffset(int p0, int p1) {}
        public void startWithOffset(int p0, int p1, int p2) {}
        public void stop() {}
        public void run() {}
    }

    class RecycleBin {
        RecycleBin(android.widget.AbsListView p0) {}
        public void setViewTypeCount(int p0) {}
        public void markChildrenDirty() {}
        public boolean shouldRecycleViewType(int p0) { return false; }
        void clear() {}
        void fillActiveViews(int p0, int p1) {}
        android.view.View getActiveView(int p0) { return null; }
        android.view.View getTransientStateView(int p0) { return null; }
        void clearTransientStateViews() {}
        android.view.View getScrapView(int p0) { return null; }
        void addScrapView(android.view.View p0, int p1) {}
        void removeSkippedScrap() {}
        void scrapActiveViews() {}
        void fullyDetachScrapViews() {}
        void reclaimScrapViews(java.util.List<android.view.View> p0) {}
        void setCacheColorHint(int p0) {}
    }

    static class SavedState extends android.view.View.BaseSavedState {
        long selectedId;
        long firstId;
        int viewTop;
        int position;
        int height;
        java.lang.String filter;
        boolean inActionMode;
        int checkedItemCount;
        android.util.SparseBooleanArray checkState;
        android.util.LongSparseArray<java.lang.Integer> checkIdState;
        public static final android.os.Parcelable.Creator<android.widget.AbsListView.SavedState> CREATOR = null;
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    private class WindowRunnnable {
        public void rememberWindowAttachCount() {}
        public boolean sameWindow() { return false; }
    }
}
