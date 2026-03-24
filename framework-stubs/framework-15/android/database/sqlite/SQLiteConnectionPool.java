package android.database.sqlite;

public final class SQLiteConnectionPool implements java.io.Closeable {
    public int mTotalPrepareStatementCacheMiss;
    public int mTotalPrepareStatements;
    public static final int CONNECTION_FLAG_READ_ONLY = 1;
    public static final int CONNECTION_FLAG_PRIMARY_CONNECTION_AFFINITY = 2;
    public static final int CONNECTION_FLAG_INTERACTIVE = 4;
    protected void finalize() throws java.lang.Throwable {}
    public static android.database.sqlite.SQLiteConnectionPool open(android.database.sqlite.SQLiteDatabaseConfiguration p0) { return null; }
    public void close() {}
    public void reconfigure(android.database.sqlite.SQLiteDatabaseConfiguration p0) {}
    public android.database.sqlite.SQLiteConnection acquireConnection(java.lang.String p0, int p1, android.os.CancellationSignal p2) { return null; }
    public void releaseConnection(android.database.sqlite.SQLiteConnection p0) {}
    public boolean hasAnyAvailableNonPrimaryConnection() { return false; }
    public boolean shouldYieldConnection(android.database.sqlite.SQLiteConnection p0, int p1) { return false; }
    public void collectDbStats(java.util.ArrayList<android.database.sqlite.SQLiteDebug.DbStats> p0) {}
    void onConnectionLeaked() {}
    void onStatementExecuted(long p0) {}
    void closeAvailableNonPrimaryConnectionsAndLogExceptions() {}
    public void setupIdleConnectionHandler(android.os.Looper p0, long p1, java.lang.Runnable p2) {}
    void disableIdleConnectionHandler() {}
    void clearAcquiredConnectionsPreparedStatementCache() {}
    public void dump(android.util.Printer p0, boolean p1, android.util.ArraySet<java.lang.String> p2) {}
    public double getStatementCacheMissRate() { return 0.0; }
    public long getTotalStatementsTime() { return 0L; }
    public long getTotalStatementsCount() { return 0L; }
    public java.lang.String toString() { return null; }
    public java.lang.String getPath() { return null; }

    static enum AcquiredConnectionStatus {
        NORMAL,
        RECONFIGURE,
        DISCARD;
    }

    private static final class ConnectionWaiter {
        public android.database.sqlite.SQLiteConnectionPool.ConnectionWaiter mNext;
        public java.lang.Thread mThread;
        public long mStartTime;
        public int mPriority;
        public boolean mWantPrimaryConnection;
        public java.lang.String mSql;
        public int mConnectionFlags;
        public android.database.sqlite.SQLiteConnection mAssignedConnection;
        public java.lang.RuntimeException mException;
        public int mNonce;
    }

    private class IdleConnectionHandler extends android.os.Handler {
        IdleConnectionHandler(android.database.sqlite.SQLiteConnectionPool p0, android.os.Looper p1, long p2, java.lang.Runnable p3) { super(); }
        public void handleMessage(android.os.Message p0) {}
        void connectionReleased(android.database.sqlite.SQLiteConnection p0) {}
        void connectionAcquired(android.database.sqlite.SQLiteConnection p0) {}
        void connectionClosed(android.database.sqlite.SQLiteConnection p0) {}
    }
}
