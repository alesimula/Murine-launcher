package android.database.sqlite;

public class SQLiteQueryBuilder {
    private static final java.lang.String TAG = "SQLiteQueryBuilder";
    private static final java.util.regex.Pattern sLimitPattern = null;
    private static final java.util.regex.Pattern sAggregationPattern = null;
    private java.util.Map<java.lang.String, java.lang.String> mProjectionMap;
    private java.util.List<java.util.regex.Pattern> mProjectionGreylist;
    private boolean mProjectionAggregationAllowed;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private java.lang.String mTables;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private java.lang.StringBuilder mWhereClause;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private boolean mDistinct;
    private android.database.sqlite.SQLiteDatabase.CursorFactory mFactory;
    private boolean mStrict;
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
    public void setProjectionGreylist(java.util.List<java.util.regex.Pattern> p0) {}
    public java.util.List<java.util.regex.Pattern> getProjectionGreylist() { return null; }
    public void setProjectionAggregationAllowed(boolean p0) {}
    public boolean isProjectionAggregationAllowed() { return false; }
    public void setCursorFactory(android.database.sqlite.SQLiteDatabase.CursorFactory p0) {}
    public android.database.sqlite.SQLiteDatabase.CursorFactory getCursorFactory() { return null; }
    public void setStrict(boolean p0) {}
    public boolean isStrict() { return false; }
    public static java.lang.String buildQueryString(boolean p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7) { return null; }
    private static void appendClause(java.lang.StringBuilder p0, java.lang.String p1, java.lang.String p2) {}
    public static void appendColumns(java.lang.StringBuilder p0, java.lang.String[] p1) {}
    public android.database.Cursor query(android.database.sqlite.SQLiteDatabase p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) { return null; }
    public android.database.Cursor query(android.database.sqlite.SQLiteDatabase p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7) { return null; }
    public android.database.Cursor query(android.database.sqlite.SQLiteDatabase p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, android.os.CancellationSignal p8) { return null; }
    public int update(android.database.sqlite.SQLiteDatabase p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3) { return 0; }
    public int delete(android.database.sqlite.SQLiteDatabase p0, java.lang.String p1, java.lang.String[] p2) { return 0; }
    public java.lang.String buildQuery(java.lang.String[] p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) { return null; }
    @java.lang.Deprecated
    public java.lang.String buildQuery(java.lang.String[] p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) { return null; }
    public java.lang.String buildUpdate(android.content.ContentValues p0, java.lang.String p1) { return null; }
    public java.lang.String buildDelete(java.lang.String p0) { return null; }
    public java.lang.String buildUnionSubQuery(java.lang.String p0, java.lang.String[] p1, java.util.Set<java.lang.String> p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7) { return null; }
    @java.lang.Deprecated
    public java.lang.String buildUnionSubQuery(java.lang.String p0, java.lang.String[] p1, java.util.Set<java.lang.String> p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String[] p6, java.lang.String p7, java.lang.String p8) { return null; }
    public java.lang.String buildUnionQuery(java.lang.String[] p0, java.lang.String p1, java.lang.String p2) { return null; }
    private static java.lang.String maybeWithOperator(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public java.lang.String[] computeProjection(java.lang.String[] p0) { return null; }
    public java.lang.String computeWhere(java.lang.String p0) { return null; }
    private java.lang.String wrap(java.lang.String p0) { return null; }
}
