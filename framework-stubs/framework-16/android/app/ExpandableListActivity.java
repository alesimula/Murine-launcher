package android.app;

@java.lang.Deprecated
public class ExpandableListActivity extends android.app.Activity implements android.view.View.OnCreateContextMenuListener, android.widget.ExpandableListView.OnChildClickListener, android.widget.ExpandableListView.OnGroupCollapseListener, android.widget.ExpandableListView.OnGroupExpandListener {
    android.widget.ExpandableListAdapter mAdapter;
    android.widget.ExpandableListView mList;
    boolean mFinishedStart;
    public ExpandableListActivity() { super(); }
    public void onCreateContextMenu(android.view.ContextMenu p0, android.view.View p1, android.view.ContextMenu.ContextMenuInfo p2) {}
    public boolean onChildClick(android.widget.ExpandableListView p0, android.view.View p1, int p2, int p3, long p4) { return false; }
    public void onGroupCollapse(int p0) {}
    public void onGroupExpand(int p0) {}
    protected void onRestoreInstanceState(android.os.Bundle p0) {}
    public void onContentChanged() {}
    public void setListAdapter(android.widget.ExpandableListAdapter p0) {}
    public android.widget.ExpandableListView getExpandableListView() { return null; }
    public android.widget.ExpandableListAdapter getExpandableListAdapter() { return null; }
    public long getSelectedId() { return 0L; }
    public long getSelectedPosition() { return 0L; }
    public boolean setSelectedChild(int p0, int p1, boolean p2) { return false; }
    public void setSelectedGroup(int p0) {}
}
