package android.widget;

public abstract class ResourceCursorAdapter extends android.widget.CursorAdapter {
    private int mLayout;
    private int mDropDownLayout;
    private android.view.LayoutInflater mInflater;
    private android.view.LayoutInflater mDropDownInflater;
    @java.lang.Deprecated
    public ResourceCursorAdapter(android.content.Context p0, int p1, android.database.Cursor p2) { super((android.content.Context)null, (android.database.Cursor)null); }
    public ResourceCursorAdapter(android.content.Context p0, int p1, android.database.Cursor p2, boolean p3) { super((android.content.Context)null, (android.database.Cursor)null); }
    public ResourceCursorAdapter(android.content.Context p0, int p1, android.database.Cursor p2, int p3) { super((android.content.Context)null, (android.database.Cursor)null); }
    public void setDropDownViewTheme(android.content.res.Resources.Theme p0) {}
    public android.view.View newView(android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2) { return null; }
    public android.view.View newDropDownView(android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2) { return null; }
    public void setViewResource(int p0) {}
    public void setDropDownViewResource(int p0) {}
}
