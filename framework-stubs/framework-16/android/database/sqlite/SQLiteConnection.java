package android.database.sqlite;

public final class SQLiteConnection implements android.os.CancellationSignal.OnCancelListener {
    protected void finalize() throws java.lang.Throwable {}
    static android.database.sqlite.SQLiteConnection open(android.database.sqlite.SQLiteConnectionPool p0, android.database.sqlite.SQLiteDatabaseConfiguration p1, int p2, boolean p3) { return null; }
    void close() {}
    void recordBeginTransaction(java.lang.String p0) {}
    void recordEndTransaction(boolean p0) {}
    void reconfigure(android.database.sqlite.SQLiteDatabaseConfiguration p0) {}
    void setOnlyAllowReadOnlyOperations(boolean p0) {}
    boolean isPreparedStatementInCache(java.lang.String p0) { return false; }
    public int getConnectionId() { return 0; }
    public boolean isPrimaryConnection() { return false; }
    public void prepare(java.lang.String p0, android.database.sqlite.SQLiteStatementInfo p1) {}
    public void execute(java.lang.String p0, java.lang.Object[] p1, android.os.CancellationSignal p2) {}
    public long executeForLong(java.lang.String p0, java.lang.Object[] p1, android.os.CancellationSignal p2) { return 0L; }
    public java.lang.String executeForString(java.lang.String p0, java.lang.Object[] p1, android.os.CancellationSignal p2) { return null; }
    public android.os.ParcelFileDescriptor executeForBlobFileDescriptor(java.lang.String p0, java.lang.Object[] p1, android.os.CancellationSignal p2) { return null; }
    public int executeForChangedRowCount(java.lang.String p0, java.lang.Object[] p1, android.os.CancellationSignal p2) { return 0; }
    public long executeForLastInsertedRowId(java.lang.String p0, java.lang.Object[] p1, android.os.CancellationSignal p2) { return 0L; }
    public int executeForCursorWindow(java.lang.String p0, java.lang.Object[] p1, android.database.CursorWindow p2, int p3, int p4, boolean p5, android.os.CancellationSignal p6) { return 0; }
    android.database.sqlite.SQLiteConnection.PreparedStatement acquirePreparedStatement(java.lang.String p0) { return null; }
    void releasePreparedStatement(android.database.sqlite.SQLiteConnection.PreparedStatement p0) {}
    android.database.sqlite.SQLiteConnection.PreparedStatement acquirePersistentStatement(java.lang.String p0) { return null; }
    public void onCancel() {}
    void throwIfStatementForbidden(android.database.sqlite.SQLiteConnection.PreparedStatement p0) {}
    public void dump(android.util.Printer p0, boolean p1) {}
    void dumpUnsafe(android.util.Printer p0, boolean p1) {}
    java.lang.String describeCurrentOperationUnsafe() { return null; }
    void collectDbStats(java.util.ArrayList<android.database.sqlite.SQLiteDebug.DbStats> p0) {}
    void collectDbStatsUnsafe(java.util.ArrayList<android.database.sqlite.SQLiteDebug.DbStats> p0) {}
    public java.lang.String toString() { return null; }
    void setDatabaseSeqNum(long p0) {}
    long getLastInsertRowId() { return 0L; }
    long getLastChangedRowCount() { return 0L; }
    long getTotalChangedRowCount() { return 0L; }

    private final class Operation {
        public long mStartWallTime;
        public long mStartTime;
        public long mEndTime;
        public java.lang.String mKind;
        public java.lang.String mSql;
        public java.util.ArrayList<java.lang.Object> mBindArgs;
        public boolean mFinished;
        public java.lang.Exception mException;
        public int mCookie;
        public long mResultLong;
        public java.lang.String mResultString;
        public boolean mTraced;
        void start() {}
        void copyFrom(android.database.sqlite.SQLiteConnection.Operation p0) {}
        void setEmpty() {}
        boolean isEmpty() { return false; }
        public void describe(java.lang.StringBuilder p0, boolean p1) {}
        public java.lang.String describe(int p0) { return null; }
    }

    private final class OperationLog {
        public int beginOperation(java.lang.String p0, java.lang.String p1, java.lang.Object[] p2) { return 0; }
        public void beginTransaction(java.lang.String p0) {}
        public void failOperation(int p0, java.lang.Exception p1) {}
        public void endOperation(int p0) {}
        public boolean endOperationDeferLog(int p0) { return false; }
        public boolean endTransaction(boolean p0) { return false; }
        public void logOperation(int p0, java.lang.String p1) {}
        public void setResult(long p0) {}
        public void setResult(java.lang.String p0) {}
        public java.lang.String describeCurrentOperation() { return null; }
        public long getTotalLongOperations() { return 0L; }
        public void dump(android.util.Printer p0) {}
    }

    static final class PreparedStatement {
        public android.database.sqlite.SQLiteConnection.PreparedStatement mPoolNext;
        public java.lang.String mSql;
        public long mStatementPtr;
        public int mNumParameters;
        public int mType;
        public boolean mReadOnly;
        public boolean mInCache;
        public long mSeqNum;
        public boolean mInUse;
        PreparedStatement() {}
    }

    private final class PreparedStatementCache extends android.util.LruCache<java.lang.String, android.database.sqlite.SQLiteConnection.PreparedStatement> {
        public PreparedStatementCache(android.database.sqlite.SQLiteConnection p0, int p1) { super(0); }
        public synchronized void setDatabaseSeqNum(long p0) {}
        public long getLastSeqNum() { return 0L; }
        public synchronized android.database.sqlite.SQLiteConnection.PreparedStatement getStatement(java.lang.String p0) { return null; }
        public synchronized long createStatement(java.lang.String p0) { return 0L; }
        protected void entryRemoved(boolean p0, java.lang.String p1, android.database.sqlite.SQLiteConnection.PreparedStatement p2, android.database.sqlite.SQLiteConnection.PreparedStatement p3) {}
        public void dump(android.util.Printer p0) {}
    }

    private static class RateLimiter {
        RateLimiter(long p0, int p1) {}
        boolean tryAcquire() { return false; }
    }
}
