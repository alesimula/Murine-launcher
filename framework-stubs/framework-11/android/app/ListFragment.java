package android.app;

@java.lang.Deprecated
public class ListFragment extends android.app.Fragment {
    private final android.os.Handler mHandler = null;
    private final java.lang.Runnable mRequestFocus = null;
    private final android.widget.AdapterView.OnItemClickListener mOnClickListener = null;
    android.widget.ListAdapter mAdapter;
    android.widget.ListView mList;
    android.view.View mEmptyView;
    android.widget.TextView mStandardEmptyView;
    android.view.View mProgressContainer;
    android.view.View mListContainer;
    java.lang.CharSequence mEmptyText;
    boolean mListShown;
    public ListFragment() { super(); }
    public android.view.View onCreateView(android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2) { return null; }
    public void onViewCreated(android.view.View p0, android.os.Bundle p1) {}
    public void onDestroyView() {}
    public void onListItemClick(android.widget.ListView p0, android.view.View p1, int p2, long p3) {}
    public void setListAdapter(android.widget.ListAdapter p0) {}
    public void setSelection(int p0) {}
    public int getSelectedItemPosition() { return 0; }
    public long getSelectedItemId() { return 0L; }
    public android.widget.ListView getListView() { return null; }
    public void setEmptyText(java.lang.CharSequence p0) {}
    public void setListShown(boolean p0) {}
    public void setListShownNoAnimation(boolean p0) {}
    private void setListShown(boolean p0, boolean p1) {}
    public android.widget.ListAdapter getListAdapter() { return null; }
    private void ensureList() {}
}
