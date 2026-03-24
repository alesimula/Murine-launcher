package android.database;

public final class CursorJoiner implements java.util.Iterator<android.database.CursorJoiner.Result>, java.lang.Iterable<android.database.CursorJoiner.Result> {
    private android.database.Cursor mCursorLeft;
    private android.database.Cursor mCursorRight;
    private boolean mCompareResultIsValid;
    private android.database.CursorJoiner.Result mCompareResult;
    private int[] mColumnsLeft;
    private int[] mColumnsRight;
    private java.lang.String[] mValues;
    public CursorJoiner(android.database.Cursor p0, java.lang.String[] p1, android.database.Cursor p2, java.lang.String[] p3) {}
    public java.util.Iterator<android.database.CursorJoiner.Result> iterator() { return null; }
    private int[] buildColumnIndiciesArray(android.database.Cursor p0, java.lang.String[] p1) { return null; }
    public boolean hasNext() { return false; }
    public android.database.CursorJoiner.Result next() { return null; }
    public void remove() {}
    private static void populateValues(java.lang.String[] p0, android.database.Cursor p1, int[] p2, int p3) {}
    private void incrementCursors() {}
    private static int compareStrings(java.lang.String... p0) { return 0; }

    public static enum Result {
        RIGHT,
        LEFT,
        BOTH;
        private Result() {}
    }
}
