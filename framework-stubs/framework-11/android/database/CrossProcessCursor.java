package android.database;

public interface CrossProcessCursor extends android.database.Cursor {
    public android.database.CursorWindow getWindow();
    public void fillWindow(int p0, android.database.CursorWindow p1);
    public boolean onMove(int p0, int p1);
}
