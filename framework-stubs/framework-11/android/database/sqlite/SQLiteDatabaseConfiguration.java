package android.database.sqlite;

public final class SQLiteDatabaseConfiguration {
    private static final java.util.regex.Pattern EMAIL_IN_DB_PATTERN = null;
    public static final java.lang.String MEMORY_DB_PATH = ":memory:";
    public final java.lang.String path = null;
    public final java.lang.String label = null;
    public int openFlags;
    public int maxSqlCacheSize;
    public java.util.Locale locale;
    public boolean foreignKeyConstraintsEnabled;
    public final android.util.ArrayMap<java.lang.String, java.util.function.UnaryOperator<java.lang.String>> customScalarFunctions = null;
    public final android.util.ArrayMap<java.lang.String, java.util.function.BinaryOperator<java.lang.String>> customAggregateFunctions = null;
    public final java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.Object[]>> perConnectionSql = null;
    public int lookasideSlotSize;
    public int lookasideSlotCount;
    public long idleConnectionTimeoutMs;
    public java.lang.String journalMode;
    public java.lang.String syncMode;
    public SQLiteDatabaseConfiguration(java.lang.String p0, int p1) {}
    public SQLiteDatabaseConfiguration(android.database.sqlite.SQLiteDatabaseConfiguration p0) {}
    public void updateParametersFrom(android.database.sqlite.SQLiteDatabaseConfiguration p0) {}
    public boolean isInMemoryDb() { return false; }
    boolean isLegacyCompatibilityWalEnabled() { return false; }
    private static java.lang.String stripPathForLogs(java.lang.String p0) { return null; }
    boolean isLookasideConfigSet() { return false; }
}
