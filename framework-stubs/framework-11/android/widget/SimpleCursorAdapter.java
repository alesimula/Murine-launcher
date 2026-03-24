package android.widget;

public class SimpleCursorAdapter extends android.widget.ResourceCursorAdapter {
    protected int[] mFrom;
    protected int[] mTo;
    private int mStringConversionColumn;
    private android.widget.SimpleCursorAdapter.CursorToStringConverter mCursorToStringConverter;
    private android.widget.SimpleCursorAdapter.ViewBinder mViewBinder;
    java.lang.String[] mOriginalFrom;
    @java.lang.Deprecated
    public SimpleCursorAdapter(android.content.Context p0, int p1, android.database.Cursor p2, java.lang.String[] p3, int[] p4) { super((android.content.Context)null, 0, (android.database.Cursor)null); }
    public SimpleCursorAdapter(android.content.Context p0, int p1, android.database.Cursor p2, java.lang.String[] p3, int[] p4, int p5) { super((android.content.Context)null, 0, (android.database.Cursor)null); }
    public void bindView(android.view.View p0, android.content.Context p1, android.database.Cursor p2) {}
    public android.widget.SimpleCursorAdapter.ViewBinder getViewBinder() { return null; }
    public void setViewBinder(android.widget.SimpleCursorAdapter.ViewBinder p0) {}
    public void setViewImage(android.widget.ImageView p0, java.lang.String p1) {}
    public void setViewText(android.widget.TextView p0, java.lang.String p1) {}
    public int getStringConversionColumn() { return 0; }
    public void setStringConversionColumn(int p0) {}
    public android.widget.SimpleCursorAdapter.CursorToStringConverter getCursorToStringConverter() { return null; }
    public void setCursorToStringConverter(android.widget.SimpleCursorAdapter.CursorToStringConverter p0) {}
    public java.lang.CharSequence convertToString(android.database.Cursor p0) { return null; }
    private void findColumns(android.database.Cursor p0, java.lang.String[] p1) {}
    public android.database.Cursor swapCursor(android.database.Cursor p0) { return null; }
    public void changeCursorAndColumns(android.database.Cursor p0, java.lang.String[] p1, int[] p2) {}

    public static interface CursorToStringConverter {
        public java.lang.CharSequence convertToString(android.database.Cursor p0);
    }

    public static interface ViewBinder {
        public boolean setViewValue(android.view.View p0, android.database.Cursor p1, int p2);
    }
}
