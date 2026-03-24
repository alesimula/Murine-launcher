package android.widget;

public abstract class ResourceCursorTreeAdapter extends android.widget.CursorTreeAdapter {
    private int mCollapsedGroupLayout;
    private int mExpandedGroupLayout;
    private int mChildLayout;
    private int mLastChildLayout;
    private android.view.LayoutInflater mInflater;
    public ResourceCursorTreeAdapter(android.content.Context p0, android.database.Cursor p1, int p2, int p3, int p4, int p5) { super((android.database.Cursor)null, (android.content.Context)null); }
    public ResourceCursorTreeAdapter(android.content.Context p0, android.database.Cursor p1, int p2, int p3, int p4) { super((android.database.Cursor)null, (android.content.Context)null); }
    public ResourceCursorTreeAdapter(android.content.Context p0, android.database.Cursor p1, int p2, int p3) { super((android.database.Cursor)null, (android.content.Context)null); }
    public android.view.View newChildView(android.content.Context p0, android.database.Cursor p1, boolean p2, android.view.ViewGroup p3) { return null; }
    public android.view.View newGroupView(android.content.Context p0, android.database.Cursor p1, boolean p2, android.view.ViewGroup p3) { return null; }
}
