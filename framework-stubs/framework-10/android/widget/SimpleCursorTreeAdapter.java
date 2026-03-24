package android.widget;

public abstract class SimpleCursorTreeAdapter extends android.widget.ResourceCursorTreeAdapter {
    private java.lang.String[] mGroupFromNames;
    private int[] mGroupFrom;
    private int[] mGroupTo;
    private java.lang.String[] mChildFromNames;
    private int[] mChildFrom;
    private int[] mChildTo;
    private android.widget.SimpleCursorTreeAdapter.ViewBinder mViewBinder;
    public SimpleCursorTreeAdapter(android.content.Context p0, android.database.Cursor p1, int p2, int p3, java.lang.String[] p4, int[] p5, int p6, int p7, java.lang.String[] p8, int[] p9) { super((android.content.Context)null, (android.database.Cursor)null, 0, 0); }
    public SimpleCursorTreeAdapter(android.content.Context p0, android.database.Cursor p1, int p2, int p3, java.lang.String[] p4, int[] p5, int p6, java.lang.String[] p7, int[] p8) { super((android.content.Context)null, (android.database.Cursor)null, 0, 0); }
    public SimpleCursorTreeAdapter(android.content.Context p0, android.database.Cursor p1, int p2, java.lang.String[] p3, int[] p4, int p5, java.lang.String[] p6, int[] p7) { super((android.content.Context)null, (android.database.Cursor)null, 0, 0); }
    private void init(java.lang.String[] p0, int[] p1, java.lang.String[] p2, int[] p3) {}
    public android.widget.SimpleCursorTreeAdapter.ViewBinder getViewBinder() { return null; }
    public void setViewBinder(android.widget.SimpleCursorTreeAdapter.ViewBinder p0) {}
    private void bindView(android.view.View p0, android.content.Context p1, android.database.Cursor p2, int[] p3, int[] p4) {}
    private void initFromColumns(android.database.Cursor p0, java.lang.String[] p1, int[] p2) {}
    protected void bindChildView(android.view.View p0, android.content.Context p1, android.database.Cursor p2, boolean p3) {}
    protected void bindGroupView(android.view.View p0, android.content.Context p1, android.database.Cursor p2, boolean p3) {}
    protected void setViewImage(android.widget.ImageView p0, java.lang.String p1) {}
    public void setViewText(android.widget.TextView p0, java.lang.String p1) {}

    public static interface ViewBinder {
        public boolean setViewValue(android.view.View p0, android.database.Cursor p1, int p2);
    }
}
