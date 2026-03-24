package android.widget;

@android.widget.RemoteViews.RemoteView
public class ListView extends android.widget.AbsListView {
    static final java.lang.String TAG = "ListView";
    static final int NO_POSITION = -1;
    java.util.ArrayList<android.widget.ListView.FixedViewInfo> mHeaderViewInfos;
    java.util.ArrayList<android.widget.ListView.FixedViewInfo> mFooterViewInfos;
    android.graphics.drawable.Drawable mDivider;
    int mDividerHeight;
    android.graphics.drawable.Drawable mOverScrollHeader;
    android.graphics.drawable.Drawable mOverScrollFooter;
    public ListView(android.content.Context p0) { super((android.content.Context)null); }
    public ListView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ListView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ListView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public int getMaxScrollAmount() { return 0; }
    public void addHeaderView(android.view.View p0, java.lang.Object p1, boolean p2) {}
    public void addHeaderView(android.view.View p0) {}
    public int getHeaderViewsCount() { return 0; }
    public boolean removeHeaderView(android.view.View p0) { return false; }
    public void addFooterView(android.view.View p0, java.lang.Object p1, boolean p2) {}
    public void addFooterView(android.view.View p0) {}
    public int getFooterViewsCount() { return 0; }
    public boolean removeFooterView(android.view.View p0) { return false; }
    public android.widget.ListAdapter getAdapter() { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setRemoteViewsAdapterAsync")
    public void setRemoteViewsAdapter(android.content.Intent p0) {}
    public void setAdapter(android.widget.ListAdapter p0) {}
    void resetList() {}
    public boolean requestChildRectangleOnScreen(android.view.View p0, android.graphics.Rect p1, boolean p2) { return false; }
    void fillGap(boolean p0) {}
    @android.view.RemotableViewMethod
    public void smoothScrollToPosition(int p0) {}
    @android.view.RemotableViewMethod
    public void smoothScrollByOffset(int p0) {}
    protected void onDetachedFromWindow() {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    protected void onMeasure(int p0, int p1) {}
    @android.view.ViewDebug.ExportedProperty(category="list")
    protected boolean recycleOnMeasure() { return false; }
    final int measureHeightOfChildren(int p0, int p1, int p2, int p3, int p4) { return 0; }
    int findMotionRow(int p0) { return 0; }
    protected void layoutChildren() {}
    boolean trackMotionScroll(int p0, int p1) { return false; }
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
    boolean pageScroll(int p0) { return false; }
    boolean fullScroll(int p0) { return false; }
    boolean arrowScroll(int p0) { return false; }
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
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    public void onInitializeAccessibilityNodeInfoForItem(android.view.View p0, int p1, android.view.accessibility.AccessibilityNodeInfo p2) {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    protected android.widget.HeaderViewListAdapter wrapHeaderListAdapterInternal(java.util.ArrayList<android.widget.ListView.FixedViewInfo> p0, java.util.ArrayList<android.widget.ListView.FixedViewInfo> p1, android.widget.ListAdapter p2) { return null; }
    protected void wrapHeaderListAdapterInternal() {}
    protected void dispatchDataSetObserverOnChangedInternal() {}

    private static class ArrowScrollFocusResult {
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
        android.widget.ListView.FocusSelector setupForSetSelection(int p0, int p1) { return null; }
        public void run() {}
        java.lang.Runnable setupFocusIfValid(int p0) { return null; }
        void onLayoutComplete() {}
    }
}
