package android.database;

public class TranslatingCursor extends android.database.CrossProcessCursorWrapper {
    public TranslatingCursor(android.database.Cursor p0, android.database.TranslatingCursor.Config p1, android.database.TranslatingCursor.Translator p2, boolean p3) { super(null); }
    public int getColumnCount() { return 0; }
    public java.lang.String[] getColumnNames() { return null; }
    public static android.database.Cursor query(android.database.TranslatingCursor.Config p0, android.database.TranslatingCursor.Translator p1, android.database.sqlite.SQLiteQueryBuilder p2, android.database.sqlite.SQLiteDatabase p3, java.lang.String[] p4, java.lang.String p5, java.lang.String[] p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, android.os.CancellationSignal p11) { return null; }
    public void fillWindow(int p0, android.database.CursorWindow p1) {}
    public android.database.CursorWindow getWindow() { return null; }
    public android.database.Cursor getWrappedCursor() { return null; }
    public double getDouble(int p0) { return 0.0; }
    public float getFloat(int p0) { return 0.0f; }
    public int getInt(int p0) { return 0; }
    public long getLong(int p0) { return 0L; }
    public short getShort(int p0) { return 0; }
    public java.lang.String getString(int p0) { return null; }
    public void copyStringToBuffer(int p0, android.database.CharArrayBuffer p1) {}
    public byte[] getBlob(int p0) { return null; }
    public int getType(int p0) { return 0; }
    public boolean isNull(int p0) { return false; }

    public static class Config {
        public final android.net.Uri baseUri = null;
        public final java.lang.String auxiliaryColumn = null;
        public final java.lang.String[] translateColumns = null;
        public Config(android.net.Uri p0, java.lang.String p1, java.lang.String... p2) {}
    }

    public static interface Translator {
        public java.lang.String translate(java.lang.String p0, int p1, java.lang.String p2, android.database.Cursor p3);
    }
}
