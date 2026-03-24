package android.database;

public class CrossProcessCursorWrapper extends android.database.CursorWrapper implements android.database.CrossProcessCursor {
    public CrossProcessCursorWrapper(android.database.Cursor p0) { super(null); }
    public void fillWindow(int p0, android.database.CursorWindow p1) {}
    public android.database.CursorWindow getWindow() { return null; }
    public boolean onMove(int p0, int p1) { return false; }
}
