package android.app;

@java.lang.Deprecated
public class ListActivity extends android.app.Activity {
    protected android.widget.ListAdapter mAdapter;
    protected android.widget.ListView mList;
    public ListActivity() { super(); }
    protected void onListItemClick(android.widget.ListView p0, android.view.View p1, int p2, long p3) {}
    protected void onRestoreInstanceState(android.os.Bundle p0) {}
    protected void onDestroy() {}
    public void onContentChanged() {}
    public void setListAdapter(android.widget.ListAdapter p0) {}
    public void setSelection(int p0) {}
    public int getSelectedItemPosition() { return 0; }
    public long getSelectedItemId() { return 0L; }
    public android.widget.ListView getListView() { return null; }
    public android.widget.ListAdapter getListAdapter() { return null; }
}
