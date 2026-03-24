package android.database;

public final class CursorJoiner implements java.util.Iterator<android.database.CursorJoiner.Result>, java.lang.Iterable<android.database.CursorJoiner.Result> {
    public CursorJoiner(android.database.Cursor p0, java.lang.String[] p1, android.database.Cursor p2, java.lang.String[] p3) {}
    public java.util.Iterator<android.database.CursorJoiner.Result> iterator() { return null; }
    public boolean hasNext() { return false; }
    public android.database.CursorJoiner.Result next() { return null; }
    public void remove() {}

    public static enum Result {
        RIGHT,
        LEFT,
        BOTH;
    }
}
