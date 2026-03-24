package android.content;

public class SearchRecentSuggestionsProvider extends android.content.ContentProvider {
    public static final int DATABASE_MODE_QUERIES = 1;
    public static final int DATABASE_MODE_2LINES = 2;
    public SearchRecentSuggestionsProvider() { super(); }
    protected void setupSuggestions(java.lang.String p0, int p1) {}
    public int delete(android.net.Uri p0, java.lang.String p1, java.lang.String[] p2) { return 0; }
    public java.lang.String getType(android.net.Uri p0) { return null; }
    public android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1) { return null; }
    public boolean onCreate() { return false; }
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) { return null; }
    public int update(android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3) { return 0; }

    private static class DatabaseHelper extends android.database.sqlite.SQLiteOpenHelper {
        public DatabaseHelper(android.content.Context p0, int p1) { super((android.content.Context)null, (java.lang.String)null, (android.database.sqlite.SQLiteDatabase.CursorFactory)null, 0); }
        public void onCreate(android.database.sqlite.SQLiteDatabase p0) {}
        public void onUpgrade(android.database.sqlite.SQLiteDatabase p0, int p1, int p2) {}
    }
}
