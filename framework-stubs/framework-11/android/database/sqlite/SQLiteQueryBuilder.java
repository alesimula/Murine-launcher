package android.database.sqlite;

public class SQLiteQueryBuilder {
    private static final java.lang.String TAG = "SQLiteQueryBuilder";
    private static final java.util.regex.Pattern sAggregationPattern = null;
    private java.util.Map<java.lang.String, java.lang.String> mProjectionMap;
    private java.util.Collection<java.util.regex.Pattern> mProjectionGreylist;
    private java.lang.String mTables;
    private java.lang.StringBuilder mWhereClause;
    private boolean mDistinct;
    private android.database.sqlite.SQLiteDatabase.CursorFactory mFactory;
    private static final int STRICT_PARENTHESES = 1;
    private static final int STRICT_COLUMNS = 2;
    private static final int STRICT_GRAMMAR = 4;
    private int mStrictFlags;
    public SQLiteQueryBuilder() {}
    public void setDistinct(boolean p0) {}
    public boolean isDistinct() { return false; }
    public java.lang.String getTables() { return null; }
    public void setTables(java.lang.String p0) {}
    public void appendWhere(java.lang.CharSequence p0) {}
    public void appendWhereEscapeString(java.lang.String p0) {}
    public void appendWhereStandalone(java.lang.CharSequence p0) {}
    public void setProjectionMap(java.util.Map<java.lang.String, java.lang.String> p0) {}
    public java.util.Map<java.lang.String, java.lang.String> getProjectionMap() { return null; }
    public void setProjectionGreylist(java.util.Collection<java.util.regex.Pattern> p0) {}
    public java.util.Collection<java.util.regex.Pattern> getProjectionGreylist() { return null; }
    @java.lang.Deprecated
    public void setProjectionAggregationAllowed(boolean p0) {}
    @java.lang.Deprecated
    public boolean isProjectionAggregationAllowed() { return false; }
    public void setCursorFactory(android.database.sqlite.SQLiteDatabase.CursorFactory p0) {}
    public android.database.sqlite.SQLiteDatabase.CursorFactory getCursorFactory() { return null; }
    public void setStrict(boolean p0) {}
    public boolean isStrict() { return false; }
    public void setStrictColumns(boolean p0) {}
    public boolean isStrictColumns() { return false; }
    public void setStrictGrammar(boolean p0) {}
    public boolean isStrictGrammar() { return false; }
    public static java.lang.String buildQueryString(boolean p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7) { return null; }
    private static void appendClause(java.lang.StringBuilder p0, java.lang.String p1, java.lang.String p2) {}
    public static void appendColumns(java.lang.StringBuilder p0, java.lang.String[] p1) {}
    public android.database.Cursor query(android.database.sqlite.SQLiteDatabase p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) { return null; }
    public android.database.Cursor query(android.database.sqlite.SQLiteDatabase p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7) { return null; }
    public android.database.Cursor query(android.database.sqlite.SQLiteDatabase p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, android.os.CancellationSignal p8) { return null; }
    public long insert(android.database.sqlite.SQLiteDatabase p0, android.content.ContentValues p1) { return 0L; }
    public int update(android.database.sqlite.SQLiteDatabase p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3) { return 0; }
    public int delete(android.database.sqlite.SQLiteDatabase p0, java.lang.String p1, java.lang.String[] p2) { return 0; }
    private void enforceStrictColumns(java.lang.String[] p0) {}
    private void enforceStrictColumns(android.content.ContentValues p0) {}
    private void enforceStrictGrammar(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) {}
    private void enforceStrictToken(java.lang.String p0) {}
    public java.lang.String buildQuery(java.lang.String[] p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) { return null; }
    @java.lang.Deprecated
    public java.lang.String buildQuery(java.lang.String[] p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) { return null; }
    public java.lang.String buildInsert(android.content.ContentValues p0) { return null; }
    public java.lang.String buildUpdate(android.content.ContentValues p0, java.lang.String p1) { return null; }
    public java.lang.String buildDelete(java.lang.String p0) { return null; }
    public java.lang.String buildUnionSubQuery(java.lang.String p0, java.lang.String[] p1, java.util.Set<java.lang.String> p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7) { return null; }
    @java.lang.Deprecated
    public java.lang.String buildUnionSubQuery(java.lang.String p0, java.lang.String[] p1, java.util.Set<java.lang.String> p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String[] p6, java.lang.String p7, java.lang.String p8) { return null; }
    public java.lang.String buildUnionQuery(java.lang.String[] p0, java.lang.String p1, java.lang.String p2) { return null; }
    private static java.lang.String maybeWithOperator(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String[] computeProjection(java.lang.String[] p0) { return null; }
    private java.lang.String computeSingleProjectionOrThrow(java.lang.String p0) { return null; }
    private java.lang.String computeSingleProjection(java.lang.String p0) { return null; }
    private boolean isTableOrColumn(java.lang.String p0) { return false; }
    public java.lang.String computeWhere(java.lang.String p0) { return null; }
    private java.lang.String wrap(java.lang.String p0) { return null; }
}
