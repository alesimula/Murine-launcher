package android.widget;

class RemoteCollectionItemsAdapter extends android.widget.BaseAdapter {
    private final int mViewTypeCount = 0;
    private android.widget.RemoteViews.RemoteCollectionItems mItems;
    private android.widget.RemoteViews.InteractionHandler mInteractionHandler;
    private android.widget.RemoteViews.ColorResources mColorResources;
    private android.util.SparseIntArray mLayoutIdToViewType;
    RemoteCollectionItemsAdapter(android.widget.RemoteViews.RemoteCollectionItems p0, android.widget.RemoteViews.InteractionHandler p1, android.widget.RemoteViews.ColorResources p2) { super(); }
    void setData(android.widget.RemoteViews.RemoteCollectionItems p0, android.widget.RemoteViews.InteractionHandler p1, android.widget.RemoteViews.ColorResources p2) {}
    private void initLayoutIdToViewType() {}
    public int getCount() { return 0; }
    public android.widget.RemoteViews getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public int getItemViewType(int p0) { return 0; }
    public int getViewTypeCount() { return 0; }
    public boolean hasStableIds() { return false; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    private static android.view.View getViewToReapply(android.view.View p0, android.widget.RemoteViews p1) { return null; }
}
