package android.widget;

public abstract class CursorAdapter extends android.widget.BaseAdapter implements android.widget.Filterable, android.widget.CursorFilter.CursorFilterClient, android.widget.ThemedSpinnerAdapter {
    @android.annotation.UnsupportedAppUsage
    protected boolean mDataValid;
    protected boolean mAutoRequery;
    @android.annotation.UnsupportedAppUsage
    protected android.database.Cursor mCursor;
    @android.annotation.UnsupportedAppUsage
    protected android.content.Context mContext;
    protected android.content.Context mDropDownContext;
    @android.annotation.UnsupportedAppUsage
    protected int mRowIDColumn;
    @android.annotation.UnsupportedAppUsage
    protected android.widget.CursorAdapter.ChangeObserver mChangeObserver;
    @android.annotation.UnsupportedAppUsage
    protected android.database.DataSetObserver mDataSetObserver;
    protected android.widget.CursorFilter mCursorFilter;
    protected android.widget.FilterQueryProvider mFilterQueryProvider;
    @java.lang.Deprecated
    public static final int FLAG_AUTO_REQUERY = 1;
    public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;
    @java.lang.Deprecated
    public CursorAdapter(android.content.Context p0, android.database.Cursor p1) { super(); }
    public CursorAdapter(android.content.Context p0, android.database.Cursor p1, boolean p2) { super(); }
    public CursorAdapter(android.content.Context p0, android.database.Cursor p1, int p2) { super(); }
    @java.lang.Deprecated
    protected void init(android.content.Context p0, android.database.Cursor p1, boolean p2) {}
    void init(android.content.Context p0, android.database.Cursor p1, int p2) {}
    public void setDropDownViewTheme(android.content.res.Resources.Theme p0) {}
    public android.content.res.Resources.Theme getDropDownViewTheme() { return null; }
    public android.database.Cursor getCursor() { return null; }
    public int getCount() { return 0; }
    public java.lang.Object getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public boolean hasStableIds() { return false; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public android.view.View getDropDownView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public abstract android.view.View newView(android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2);
    public android.view.View newDropDownView(android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2) { return null; }
    public abstract void bindView(android.view.View p0, android.content.Context p1, android.database.Cursor p2);
    public void changeCursor(android.database.Cursor p0) {}
    public android.database.Cursor swapCursor(android.database.Cursor p0) { return null; }
    public java.lang.CharSequence convertToString(android.database.Cursor p0) { return null; }
    public android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence p0) { return null; }
    public android.widget.Filter getFilter() { return null; }
    public android.widget.FilterQueryProvider getFilterQueryProvider() { return null; }
    public void setFilterQueryProvider(android.widget.FilterQueryProvider p0) {}
    protected void onContentChanged() {}

    private class MyDataSetObserver extends android.database.DataSetObserver {
        private MyDataSetObserver(android.widget.CursorAdapter p0) { super(); }
        public void onChanged() {}
        public void onInvalidated() {}
    }

    private class ChangeObserver extends android.database.ContentObserver {
        public ChangeObserver(android.widget.CursorAdapter p0) { super(null); }
        public boolean deliverSelfNotifications() { return false; }
        public void onChange(boolean p0) {}
    }
}
