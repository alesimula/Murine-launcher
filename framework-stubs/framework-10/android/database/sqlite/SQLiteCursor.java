package android.database.sqlite;

public class SQLiteCursor extends android.database.AbstractWindowedCursor {
    static final java.lang.String TAG = "SQLiteCursor";
    static final int NO_COUNT = -1;
    @android.annotation.UnsupportedAppUsage
    private final java.lang.String mEditTable = null;
    private final java.lang.String[] mColumns = null;
    @android.annotation.UnsupportedAppUsage
    private final android.database.sqlite.SQLiteQuery mQuery = null;
    private final android.database.sqlite.SQLiteCursorDriver mDriver = null;
    private int mCount;
    private int mCursorWindowCapacity;
    private java.util.Map<java.lang.String, java.lang.Integer> mColumnNameMap;
    private final java.lang.Throwable mStackTrace = null;
    private boolean mFillWindowForwardOnly;
    @java.lang.Deprecated
    public SQLiteCursor(android.database.sqlite.SQLiteDatabase p0, android.database.sqlite.SQLiteCursorDriver p1, java.lang.String p2, android.database.sqlite.SQLiteQuery p3) { super(); }
    public SQLiteCursor(android.database.sqlite.SQLiteCursorDriver p0, java.lang.String p1, android.database.sqlite.SQLiteQuery p2) { super(); }
    public android.database.sqlite.SQLiteDatabase getDatabase() { return null; }
    public boolean onMove(int p0, int p1) { return false; }
    public int getCount() { return 0; }
    @android.annotation.UnsupportedAppUsage
    private void fillWindow(int p0) {}
    public int getColumnIndex(java.lang.String p0) { return 0; }
    public java.lang.String[] getColumnNames() { return null; }
    public void deactivate() {}
    public void close() {}
    public boolean requery() { return false; }
    public void setWindow(android.database.CursorWindow p0) {}
    public void setSelectionArguments(java.lang.String[] p0) {}
    public void setFillWindowForwardOnly(boolean p0) {}
    protected void finalize() {}
}
