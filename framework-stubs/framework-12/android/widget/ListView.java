package android.widget;

@android.widget.RemoteViews.RemoteView
public class ListView extends android.widget.AbsListView {
    static final java.lang.String TAG = "ListView";
    static final int NO_POSITION = -1;
    private static final float MAX_SCROLL_FACTOR = 0.33000001311302185f;
    private static final int MIN_SCROLL_PREVIEW_PIXELS = 2;
    java.util.ArrayList<android.widget.ListView.FixedViewInfo> mHeaderViewInfos;
    java.util.ArrayList<android.widget.ListView.FixedViewInfo> mFooterViewInfos;
    android.graphics.drawable.Drawable mDivider;
    int mDividerHeight;
    android.graphics.drawable.Drawable mOverScrollHeader;
    android.graphics.drawable.Drawable mOverScrollFooter;
    private boolean mIsCacheColorOpaque;
    private boolean mDividerIsOpaque;
    private boolean mHeaderDividersEnabled;
    private boolean mFooterDividersEnabled;
    private boolean mAreAllItemsSelectable;
    private boolean mItemsCanFocus;
    private final android.graphics.Rect mTempRect = null;
    private android.graphics.Paint mDividerPaint;
    private final android.widget.ListView.ArrowScrollFocusResult mArrowScrollFocusResult = null;
    private android.widget.ListView.FocusSelector mFocusSelector;
    public ListView(android.content.Context p0) { super((android.content.Context)null); }
    public ListView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ListView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ListView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public int getMaxScrollAmount() { return 0; }
    private void adjustViewsUpOrDown() {}
    public void addHeaderView(android.view.View p0, java.lang.Object p1, boolean p2) {}
    public void addHeaderView(android.view.View p0) {}
    public int getHeaderViewsCount() { return 0; }
    public boolean removeHeaderView(android.view.View p0) { return false; }
    private void removeFixedViewInfo(android.view.View p0, java.util.ArrayList<android.widget.ListView.FixedViewInfo> p1) {}
    public void addFooterView(android.view.View p0, java.lang.Object p1, boolean p2) {}
    public void addFooterView(android.view.View p0) {}
    public int getFooterViewsCount() { return 0; }
    public boolean removeFooterView(android.view.View p0) { return false; }
    public android.widget.ListAdapter getAdapter() { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setRemoteViewsAdapterAsync")
    public void setRemoteViewsAdapter(android.content.Intent p0) {}
    public void setAdapter(android.widget.ListAdapter p0) {}
    void resetList() {}
    private void clearRecycledState(java.util.ArrayList<android.widget.ListView.FixedViewInfo> p0) {}
    private boolean showingTopFadingEdge() { return false; }
    private boolean showingBottomFadingEdge() { return false; }
    public boolean requestChildRectangleOnScreen(android.view.View p0, android.graphics.Rect p1, boolean p2) { return false; }
    void fillGap(boolean p0) {}
    private android.view.View fillDown(int p0, int p1) { return null; }
    private android.view.View fillUp(int p0, int p1) { return null; }
    private android.view.View fillFromTop(int p0) { return null; }
    private android.view.View fillFromMiddle(int p0, int p1) { return null; }
    private void fillAboveAndBelow(android.view.View p0, int p1) {}
    private android.view.View fillFromSelection(int p0, int p1, int p2) { return null; }
    private int getBottomSelectionPixel(int p0, int p1, int p2) { return 0; }
    private int getTopSelectionPixel(int p0, int p1, int p2) { return 0; }
    @android.view.RemotableViewMethod
    public void smoothScrollToPosition(int p0) {}
    @android.view.RemotableViewMethod
    public void smoothScrollByOffset(int p0) {}
    private android.view.View moveSelection(android.view.View p0, android.view.View p1, int p2, int p3, int p4) { return null; }
    protected void onDetachedFromWindow() {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    protected void onMeasure(int p0, int p1) {}
    private void measureScrapChild(android.view.View p0, int p1, int p2, int p3) {}
    @android.view.ViewDebug.ExportedProperty(category="list")
    protected boolean recycleOnMeasure() { return false; }
    final int measureHeightOfChildren(int p0, int p1, int p2, int p3, int p4) { return 0; }
    int findMotionRow(int p0) { return 0; }
    private android.view.View fillSpecific(int p0, int p1) { return null; }
    private void correctTooHigh(int p0) {}
    private void correctTooLow(int p0) {}
    protected void layoutChildren() {}
    boolean trackMotionScroll(int p0, int p1) { return false; }
    private void removeUnusedFixedViews(java.util.List<android.widget.ListView.FixedViewInfo> p0) {}
    private boolean isDirectChildHeaderOrFooter(android.view.View p0) { return false; }
    private android.view.View makeAndAddView(int p0, int p1, boolean p2, int p3, boolean p4) { return null; }
    private void setupChild(android.view.View p0, int p1, int p2, boolean p3, int p4, boolean p5, boolean p6) {}
    protected boolean canAnimate() { return false; }
    public void setSelection(int p0) {}
    void setSelectionInt(int p0) {}
    int lookForSelectablePosition(int p0, boolean p1) { return 0; }
    int lookForSelectablePositionAfter(int p0, int p1, boolean p2) { return 0; }
    public void setSelectionAfterHeaderView() {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    private boolean commonKey(int p0, int p1, android.view.KeyEvent p2) { return false; }
    boolean pageScroll(int p0) { return false; }
    boolean fullScroll(int p0) { return false; }
    private boolean handleHorizontalFocusWithinListItem(int p0) { return false; }
    boolean arrowScroll(int p0) { return false; }
    private final int nextSelectedPositionForDirection(android.view.View p0, int p1, int p2) { return 0; }
    private boolean arrowScrollImpl(int p0) { return false; }
    private void handleNewSelectionChange(android.view.View p0, int p1, int p2, boolean p3) {}
    private void measureAndAdjustDown(android.view.View p0, int p1, int p2) {}
    private void measureItem(android.view.View p0) {}
    private void relayoutMeasuredItem(android.view.View p0) {}
    private int getArrowScrollPreviewLength() { return 0; }
    private int amountToScroll(int p0, int p1) { return 0; }
    private int lookForSelectablePositionOnScreen(int p0) { return 0; }
    private android.widget.ListView.ArrowScrollFocusResult arrowScrollFocused(int p0) { return null; }
    private int positionOfNewFocus(android.view.View p0) { return 0; }
    private boolean isViewAncestorOf(android.view.View p0, android.view.View p1) { return false; }
    private int amountToScrollToNewFocus(int p0, android.view.View p1, int p2) { return 0; }
    private int distanceToView(android.view.View p0) { return 0; }
    private void scrollListItemsBy(int p0) {}
    private android.view.View addViewAbove(android.view.View p0, int p1) { return null; }
    private android.view.View addViewBelow(android.view.View p0, int p1) { return null; }
    public void setItemsCanFocus(boolean p0) {}
    public boolean getItemsCanFocus() { return false; }
    public boolean isOpaque() { return false; }
    public void setCacheColorHint(int p0) {}
    void drawOverscrollHeader(android.graphics.Canvas p0, android.graphics.drawable.Drawable p1, android.graphics.Rect p2) {}
    void drawOverscrollFooter(android.graphics.Canvas p0, android.graphics.drawable.Drawable p1, android.graphics.Rect p2) {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    protected boolean drawChild(android.graphics.Canvas p0, android.view.View p1, long p2) { return false; }
    void drawDivider(android.graphics.Canvas p0, android.graphics.Rect p1, int p2) {}
    public android.graphics.drawable.Drawable getDivider() { return null; }
    public void setDivider(android.graphics.drawable.Drawable p0) {}
    public int getDividerHeight() { return 0; }
    public void setDividerHeight(int p0) {}
    public void setHeaderDividersEnabled(boolean p0) {}
    public boolean areHeaderDividersEnabled() { return false; }
    public void setFooterDividersEnabled(boolean p0) {}
    public boolean areFooterDividersEnabled() { return false; }
    public void setOverscrollHeader(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getOverscrollHeader() { return null; }
    public void setOverscrollFooter(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getOverscrollFooter() { return null; }
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    protected void onFinishInflate() {}
    protected <T extends android.view.View> T findViewTraversal(int p0) { return null; }
    android.view.View findViewInHeadersOrFooters(java.util.ArrayList<android.widget.ListView.FixedViewInfo> p0, int p1) { return null; }
    protected <T extends android.view.View> T findViewWithTagTraversal(java.lang.Object p0) { return null; }
    android.view.View findViewWithTagInHeadersOrFooters(java.util.ArrayList<android.widget.ListView.FixedViewInfo> p0, java.lang.Object p1) { return null; }
    protected <T extends android.view.View> T findViewByPredicateTraversal(java.util.function.Predicate<android.view.View> p0, android.view.View p1) { return null; }
    android.view.View findViewByPredicateInHeadersOrFooters(java.util.ArrayList<android.widget.ListView.FixedViewInfo> p0, java.util.function.Predicate<android.view.View> p1, android.view.View p2) { return null; }
    @java.lang.Deprecated
    public long[] getCheckItemIds() { return null; }
    int getHeightForPosition(int p0) { return 0; }
    private boolean shouldAdjustHeightForDivider(int p0) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    public void onInitializeAccessibilityNodeInfoForItem(android.view.View p0, int p1, android.view.accessibility.AccessibilityNodeInfo p2) {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    protected android.widget.HeaderViewListAdapter wrapHeaderListAdapterInternal(java.util.ArrayList<android.widget.ListView.FixedViewInfo> p0, java.util.ArrayList<android.widget.ListView.FixedViewInfo> p1, android.widget.ListAdapter p2) { return null; }
    protected void wrapHeaderListAdapterInternal() {}
    protected void dispatchDataSetObserverOnChangedInternal() {}

    private static class ArrowScrollFocusResult {
        private int mSelectedPosition;
        private int mAmountToScroll;
        private ArrowScrollFocusResult() {}
        void populate(int p0, int p1) {}
        public int getSelectedPosition() { return 0; }
        public int getAmountToScroll() { return 0; }
    }

    public class FixedViewInfo {
        public android.view.View view;
        public java.lang.Object data;
        public boolean isSelectable;
        public FixedViewInfo(android.widget.ListView p0) {}
    }

    private class FocusSelector implements java.lang.Runnable {
        private static final int STATE_SET_SELECTION = 1;
        private static final int STATE_WAIT_FOR_LAYOUT = 2;
        private static final int STATE_REQUEST_FOCUS = 3;
        private int mAction;
        private int mPosition;
        private int mPositionTop;
        private FocusSelector(android.widget.ListView p0) {}
        android.widget.ListView.FocusSelector setupForSetSelection(int p0, int p1) { return null; }
        public void run() {}
        java.lang.Runnable setupFocusIfValid(int p0) { return null; }
        void onLayoutComplete() {}
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.ListView> {
        private boolean mPropertiesMapped;
        private int mDividerId;
        private int mDividerHeightId;
        private int mFooterDividersEnabledId;
        private int mHeaderDividersEnabledId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.ListView p0, android.view.inspector.PropertyReader p1) {}
    }
}
