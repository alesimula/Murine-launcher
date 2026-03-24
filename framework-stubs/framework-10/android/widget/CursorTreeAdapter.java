package android.widget;

public abstract class CursorTreeAdapter extends android.widget.BaseExpandableListAdapter implements android.widget.Filterable, android.widget.CursorFilter.CursorFilterClient {
    private android.content.Context mContext;
    private android.os.Handler mHandler;
    private boolean mAutoRequery;
    android.widget.CursorTreeAdapter.MyCursorHelper mGroupCursorHelper;
    android.util.SparseArray<android.widget.CursorTreeAdapter.MyCursorHelper> mChildrenCursorHelpers;
    android.widget.CursorFilter mCursorFilter;
    android.widget.FilterQueryProvider mFilterQueryProvider;
    public CursorTreeAdapter(android.database.Cursor p0, android.content.Context p1) { super(); }
    public CursorTreeAdapter(android.database.Cursor p0, android.content.Context p1, boolean p2) { super(); }
    private void init(android.database.Cursor p0, android.content.Context p1, boolean p2) {}
    synchronized android.widget.CursorTreeAdapter.MyCursorHelper getChildrenCursorHelper(int p0, boolean p1) { return null; }
    protected abstract android.database.Cursor getChildrenCursor(android.database.Cursor p0);
    public void setGroupCursor(android.database.Cursor p0) {}
    public void setChildrenCursor(int p0, android.database.Cursor p1) {}
    public android.database.Cursor getChild(int p0, int p1) { return null; }
    public long getChildId(int p0, int p1) { return 0L; }
    public int getChildrenCount(int p0) { return 0; }
    public android.database.Cursor getGroup(int p0) { return null; }
    public int getGroupCount() { return 0; }
    public long getGroupId(int p0) { return 0L; }
    public android.view.View getGroupView(int p0, boolean p1, android.view.View p2, android.view.ViewGroup p3) { return null; }
    protected abstract android.view.View newGroupView(android.content.Context p0, android.database.Cursor p1, boolean p2, android.view.ViewGroup p3);
    protected abstract void bindGroupView(android.view.View p0, android.content.Context p1, android.database.Cursor p2, boolean p3);
    public android.view.View getChildView(int p0, int p1, boolean p2, android.view.View p3, android.view.ViewGroup p4) { return null; }
    protected abstract android.view.View newChildView(android.content.Context p0, android.database.Cursor p1, boolean p2, android.view.ViewGroup p3);
    protected abstract void bindChildView(android.view.View p0, android.content.Context p1, android.database.Cursor p2, boolean p3);
    public boolean isChildSelectable(int p0, int p1) { return false; }
    public boolean hasStableIds() { return false; }
    private synchronized void releaseCursorHelpers() {}
    public void notifyDataSetChanged() {}
    public void notifyDataSetChanged(boolean p0) {}
    public void notifyDataSetInvalidated() {}
    public void onGroupCollapsed(int p0) {}
    synchronized void deactivateChildrenCursorHelper(int p0) {}
    public java.lang.String convertToString(android.database.Cursor p0) { return null; }
    public android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence p0) { return null; }
    public android.widget.Filter getFilter() { return null; }
    public android.widget.FilterQueryProvider getFilterQueryProvider() { return null; }
    public void setFilterQueryProvider(android.widget.FilterQueryProvider p0) {}
    public void changeCursor(android.database.Cursor p0) {}
    public android.database.Cursor getCursor() { return null; }

    class MyCursorHelper {
        private android.database.Cursor mCursor;
        private boolean mDataValid;
        private int mRowIDColumn;
        private android.widget.CursorTreeAdapter.MyCursorHelper.MyContentObserver mContentObserver;
        private android.widget.CursorTreeAdapter.MyCursorHelper.MyDataSetObserver mDataSetObserver;
        MyCursorHelper(android.widget.CursorTreeAdapter p0, android.database.Cursor p1) {}
        android.database.Cursor getCursor() { return null; }
        int getCount() { return 0; }
        long getId(int p0) { return 0L; }
        android.database.Cursor moveTo(int p0) { return null; }
        void changeCursor(android.database.Cursor p0, boolean p1) {}
        void deactivate() {}
        boolean isValid() { return false; }

        private class MyDataSetObserver extends android.database.DataSetObserver {
            private MyDataSetObserver(android.widget.CursorTreeAdapter.MyCursorHelper p0) { super(); }
            public void onChanged() {}
            public void onInvalidated() {}
        }

        private class MyContentObserver extends android.database.ContentObserver {
            public MyContentObserver(android.widget.CursorTreeAdapter.MyCursorHelper p0) { super(null); }
            public boolean deliverSelfNotifications() { return false; }
            public void onChange(boolean p0) {}
        }
    }
}
