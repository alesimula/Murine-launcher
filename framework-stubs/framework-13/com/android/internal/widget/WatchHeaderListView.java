package com.android.internal.widget;

public class WatchHeaderListView extends android.widget.ListView {
    public WatchHeaderListView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public WatchHeaderListView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public WatchHeaderListView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected android.widget.HeaderViewListAdapter wrapHeaderListAdapterInternal(java.util.ArrayList<android.widget.ListView.FixedViewInfo> p0, java.util.ArrayList<android.widget.ListView.FixedViewInfo> p1, android.widget.ListAdapter p2) { return null; }
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void setTopPanel(android.view.View p0) {}
    public void setAdapter(android.widget.ListAdapter p0) {}
    protected android.view.View findViewTraversal(int p0) { return null; }
    protected android.view.View findViewWithTagTraversal(java.lang.Object p0) { return null; }
    protected <T extends android.view.View> T findViewByPredicateTraversal(java.util.function.Predicate<android.view.View> p0, android.view.View p1) { return null; }
    public int getHeaderViewsCount() { return 0; }

    private static class WatchHeaderListAdapter extends android.widget.HeaderViewListAdapter {
        public WatchHeaderListAdapter(java.util.ArrayList<android.widget.ListView.FixedViewInfo> p0, java.util.ArrayList<android.widget.ListView.FixedViewInfo> p1, android.widget.ListAdapter p2) { super(null, null, null); }
        public void setTopPanel(android.view.View p0) {}
        public int getCount() { return 0; }
        public boolean areAllItemsEnabled() { return false; }
        public boolean isEnabled(int p0) { return false; }
        public java.lang.Object getItem(int p0) { return null; }
        public long getItemId(int p0) { return 0L; }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        public int getItemViewType(int p0) { return 0; }
    }
}
