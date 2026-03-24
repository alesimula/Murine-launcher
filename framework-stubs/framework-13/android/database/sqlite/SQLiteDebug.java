package android.database.sqlite;

public final class SQLiteDebug {
    public static boolean shouldLogSlowQuery(long p0) { return false; }
    public static android.database.sqlite.SQLiteDebug.PagerStats getDatabaseInfo() { return null; }
    public static void dump(android.util.Printer p0, java.lang.String[] p1) {}
    public static void dump(android.util.Printer p0, java.lang.String[] p1, boolean p2) {}

    public static class DbStats {
        public java.lang.String dbName;
        public long pageSize;
        public long dbSize;
        public int lookaside;
        public java.lang.String cache;
        public DbStats(java.lang.String p0, long p1, long p2, int p3, int p4, int p5, int p6) {}
    }

    public static final class NoPreloadHolder {
        public static final boolean DEBUG_SQL_LOG = Boolean.valueOf(false);
        public static final boolean DEBUG_SQL_STATEMENTS = Boolean.valueOf(false);
        public static final boolean DEBUG_SQL_TIME = Boolean.valueOf(false);
        public static final boolean DEBUG_LOG_SLOW_QUERIES = Boolean.valueOf(false);
        public static final boolean DEBUG_LOG_DETAILED = Boolean.valueOf(false);
        public NoPreloadHolder() {}
    }

    public static class PagerStats {
        public int memoryUsed;
        public int pageCacheOverflow;
        public int largestMemAlloc;
        public java.util.ArrayList<android.database.sqlite.SQLiteDebug.DbStats> dbStats;
        public PagerStats() {}
    }
}
