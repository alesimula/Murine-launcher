package android.database.sqlite;

public interface SQLiteCursorDriver {
    public android.database.Cursor query(android.database.sqlite.SQLiteDatabase.CursorFactory p0, java.lang.String[] p1);
    public void cursorDeactivated();
    public void cursorRequeried(android.database.Cursor p0);
    public void cursorClosed();
    public void setBindArguments(java.lang.String[] p0);
}
