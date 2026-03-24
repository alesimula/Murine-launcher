package android.database.sqlite;

public abstract class SQLiteProgram extends android.database.sqlite.SQLiteClosable {
    private static final java.lang.String[] EMPTY_STRING_ARRAY = null;
    private final android.database.sqlite.SQLiteDatabase mDatabase = null;
    @android.annotation.UnsupportedAppUsage
    private final java.lang.String mSql = null;
    private final boolean mReadOnly = false;
    private final java.lang.String[] mColumnNames = null;
    private final int mNumParameters = 0;
    @android.annotation.UnsupportedAppUsage
    private final java.lang.Object[] mBindArgs = null;
    SQLiteProgram(android.database.sqlite.SQLiteDatabase p0, java.lang.String p1, java.lang.Object[] p2, android.os.CancellationSignal p3) { super(); }
    final android.database.sqlite.SQLiteDatabase getDatabase() { return null; }
    final java.lang.String getSql() { return null; }
    final java.lang.Object[] getBindArgs() { return null; }
    final java.lang.String[] getColumnNames() { return null; }
    protected final android.database.sqlite.SQLiteSession getSession() { return null; }
    protected final int getConnectionFlags() { return 0; }
    protected final void onCorruption() {}
    @java.lang.Deprecated
    public final int getUniqueId() { return 0; }
    public void bindNull(int p0) {}
    public void bindLong(int p0, long p1) {}
    public void bindDouble(int p0, double p1) {}
    public void bindString(int p0, java.lang.String p1) {}
    public void bindBlob(int p0, byte[] p1) {}
    public void clearBindings() {}
    public void bindAllArgsAsStrings(java.lang.String[] p0) {}
    protected void onAllReferencesReleased() {}
    private void bind(int p0, java.lang.Object p1) {}
}
