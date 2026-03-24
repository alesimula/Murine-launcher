package android.widget;

public interface ExpandableListAdapter {
    public void registerDataSetObserver(android.database.DataSetObserver p0);
    public void unregisterDataSetObserver(android.database.DataSetObserver p0);
    public int getGroupCount();
    public int getChildrenCount(int p0);
    public java.lang.Object getGroup(int p0);
    public java.lang.Object getChild(int p0, int p1);
    public long getGroupId(int p0);
    public long getChildId(int p0, int p1);
    public boolean hasStableIds();
    public android.view.View getGroupView(int p0, boolean p1, android.view.View p2, android.view.ViewGroup p3);
    public android.view.View getChildView(int p0, int p1, boolean p2, android.view.View p3, android.view.ViewGroup p4);
    public boolean isChildSelectable(int p0, int p1);
    public boolean areAllItemsEnabled();
    public boolean isEmpty();
    public void onGroupExpanded(int p0);
    public void onGroupCollapsed(int p0);
    public long getCombinedChildId(long p0, long p1);
    public long getCombinedGroupId(long p0);
}
