package android.widget;

public abstract class BaseExpandableListAdapter implements android.widget.ExpandableListAdapter, android.widget.HeterogeneousExpandableList {
    public BaseExpandableListAdapter() {}
    public void registerDataSetObserver(android.database.DataSetObserver p0) {}
    public void unregisterDataSetObserver(android.database.DataSetObserver p0) {}
    public void notifyDataSetInvalidated() {}
    public void notifyDataSetChanged() {}
    public boolean areAllItemsEnabled() { return false; }
    public void onGroupCollapsed(int p0) {}
    public void onGroupExpanded(int p0) {}
    public long getCombinedChildId(long p0, long p1) { return 0L; }
    public long getCombinedGroupId(long p0) { return 0L; }
    public boolean isEmpty() { return false; }
    public int getChildType(int p0, int p1) { return 0; }
    public int getChildTypeCount() { return 0; }
    public int getGroupType(int p0) { return 0; }
    public int getGroupTypeCount() { return 0; }
}
