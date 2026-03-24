package android.widget;

public class HeaderViewListAdapter implements android.widget.WrapperListAdapter, android.widget.Filterable {
    private final android.widget.ListAdapter mAdapter = null;
    java.util.ArrayList<android.widget.ListView.FixedViewInfo> mHeaderViewInfos;
    java.util.ArrayList<android.widget.ListView.FixedViewInfo> mFooterViewInfos;
    static final java.util.ArrayList<android.widget.ListView.FixedViewInfo> EMPTY_INFO_LIST = null;
    boolean mAreAllFixedViewsSelectable;
    private final boolean mIsFilterable = false;
    public HeaderViewListAdapter(java.util.ArrayList<android.widget.ListView.FixedViewInfo> p0, java.util.ArrayList<android.widget.ListView.FixedViewInfo> p1, android.widget.ListAdapter p2) {}
    public int getHeadersCount() { return 0; }
    public int getFootersCount() { return 0; }
    public boolean isEmpty() { return false; }
    private boolean areAllListInfosSelectable(java.util.ArrayList<android.widget.ListView.FixedViewInfo> p0) { return false; }
    public boolean removeHeader(android.view.View p0) { return false; }
    public boolean removeFooter(android.view.View p0) { return false; }
    public int getCount() { return 0; }
    public boolean areAllItemsEnabled() { return false; }
    public boolean isEnabled(int p0) { return false; }
    public java.lang.Object getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public boolean hasStableIds() { return false; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public int getItemViewType(int p0) { return 0; }
    public int getViewTypeCount() { return 0; }
    public void registerDataSetObserver(android.database.DataSetObserver p0) {}
    public void unregisterDataSetObserver(android.database.DataSetObserver p0) {}
    public android.widget.Filter getFilter() { return null; }
    public android.widget.ListAdapter getWrappedAdapter() { return null; }
}
