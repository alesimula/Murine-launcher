package android.database.sqlite;

public final class SQLiteConnection implements android.os.CancellationSignal.OnCancelListener {
    private static final java.lang.String TAG = "SQLiteConnection";
    private static final boolean DEBUG = false;
    private static final java.lang.String[] EMPTY_STRING_ARRAY = null;
    private static final byte[] EMPTY_BYTE_ARRAY = null;
    private final android.database.sqlite.SQLiteConnectionPool mPool = null;
    private final android.database.sqlite.SQLiteDatabaseConfiguration mConfiguration = null;
    private final int mConnectionId = 0;
    private final boolean mIsPrimaryConnection = false;
    private final boolean mIsReadOnlyConnection = false;
    private final android.database.sqlite.SQLiteConnection.PreparedStatementCache mPreparedStatementCache = null;
    private android.database.sqlite.SQLiteConnection.PreparedStatement mPreparedStatementPool;
    private final android.database.sqlite.SQLiteConnection.OperationLog mRecentOperations = null;
    private long mConnectionPtr;
    private boolean mOnlyAllowReadOnlyOperations;
    private int mCancellationSignalAttachCount;
    private static native long nativeOpen(java.lang.String p0, int p1, java.lang.String p2, boolean p3, boolean p4, int p5, int p6);
    private static native void nativeClose(long p0);
    private static native void nativeRegisterCustomScalarFunction(long p0, java.lang.String p1, java.util.function.UnaryOperator<java.lang.String> p2);
    private static native void nativeRegisterCustomAggregateFunction(long p0, java.lang.String p1, java.util.function.BinaryOperator<java.lang.String> p2);
    private static native void nativeRegisterLocalizedCollators(long p0, java.lang.String p1);
    private static native long nativePrepareStatement(long p0, java.lang.String p1);
    private static native void nativeFinalizeStatement(long p0, long p1);
    private static native int nativeGetParameterCount(long p0, long p1);
    private static native boolean nativeIsReadOnly(long p0, long p1);
    private static native int nativeGetColumnCount(long p0, long p1);
    private static native java.lang.String nativeGetColumnName(long p0, long p1, int p2);
    private static native void nativeBindNull(long p0, long p1, int p2);
    private static native void nativeBindLong(long p0, long p1, int p2, long p3);
    private static native void nativeBindDouble(long p0, long p1, int p2, double p3);
    private static native void nativeBindString(long p0, long p1, int p2, java.lang.String p3);
    private static native void nativeBindBlob(long p0, long p1, int p2, byte[] p3);
    private static native void nativeResetStatementAndClearBindings(long p0, long p1);
    private static native void nativeExecute(long p0, long p1);
    private static native long nativeExecuteForLong(long p0, long p1);
    private static native java.lang.String nativeExecuteForString(long p0, long p1);
    private static native int nativeExecuteForBlobFileDescriptor(long p0, long p1);
    private static native int nativeExecuteForChangedRowCount(long p0, long p1);
    private static native long nativeExecuteForLastInsertedRowId(long p0, long p1);
    private static native long nativeExecuteForCursorWindow(long p0, long p1, long p2, int p3, int p4, boolean p5);
    private static native int nativeGetDbLookaside(long p0);
    private static native void nativeCancel(long p0);
    private static native void nativeResetCancel(long p0, boolean p1);
    private SQLiteConnection(android.database.sqlite.SQLiteConnectionPool p0, android.database.sqlite.SQLiteDatabaseConfiguration p1, int p2, boolean p3) {}
    protected void finalize() throws java.lang.Throwable {}
    static android.database.sqlite.SQLiteConnection open(android.database.sqlite.SQLiteConnectionPool p0, android.database.sqlite.SQLiteDatabaseConfiguration p1, int p2, boolean p3) { return null; }
    void close() {}
    private void open() {}
    private void dispose(boolean p0) {}
    private void setPageSize() {}
    private void setAutoCheckpointInterval() {}
    private void setJournalSizeLimit() {}
    private void setForeignKeyModeFromConfiguration() {}
    private void setWalModeFromConfiguration() {}
    private void maybeTruncateWalFile() {}
    private void setSyncMode(java.lang.String p0) {}
    private static java.lang.String canonicalizeSyncMode(java.lang.String p0) { return null; }
    private void setJournalMode(java.lang.String p0) {}
    private void setLocaleFromConfiguration() {}
    private void setCustomFunctionsFromConfiguration() {}
    private void executePerConnectionSqlFromConfiguration(int p0) {}
    private void checkDatabaseWiped() {}
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
    private android.database.sqlite.SQLiteConnection.PreparedStatement acquirePreparedStatement(java.lang.String p0) { return null; }
    private void releasePreparedStatement(android.database.sqlite.SQLiteConnection.PreparedStatement p0) {}
    private void finalizePreparedStatement(android.database.sqlite.SQLiteConnection.PreparedStatement p0) {}
    private void attachCancellationSignal(android.os.CancellationSignal p0) {}
    private void detachCancellationSignal(android.os.CancellationSignal p0) {}
    public void onCancel() {}
    private void bindArguments(android.database.sqlite.SQLiteConnection.PreparedStatement p0, java.lang.Object[] p1) {}
    private void throwIfStatementForbidden(android.database.sqlite.SQLiteConnection.PreparedStatement p0) {}
    private static boolean isCacheable(int p0) { return false; }
    private void applyBlockGuardPolicy(android.database.sqlite.SQLiteConnection.PreparedStatement p0) {}
    public void dump(android.util.Printer p0, boolean p1) {}
    void dumpUnsafe(android.util.Printer p0, boolean p1) {}
    java.lang.String describeCurrentOperationUnsafe() { return null; }
    void collectDbStats(java.util.ArrayList<android.database.sqlite.SQLiteDebug.DbStats> p0) {}
    void collectDbStatsUnsafe(java.util.ArrayList<android.database.sqlite.SQLiteDebug.DbStats> p0) {}
    private android.database.sqlite.SQLiteDebug.DbStats getMainDbStatsUnsafe(int p0, long p1, long p2) { return null; }
    public java.lang.String toString() { return null; }
    private android.database.sqlite.SQLiteConnection.PreparedStatement obtainPreparedStatement(java.lang.String p0, long p1, int p2, int p3, boolean p4) { return null; }
    private void recyclePreparedStatement(android.database.sqlite.SQLiteConnection.PreparedStatement p0) {}
    private static java.lang.String trimSqlForDisplay(java.lang.String p0) { return null; }

    private static final class Operation {
        private static final int MAX_TRACE_METHOD_NAME_LEN = 256;
        public long mStartWallTime;
        public long mStartTime;
        public long mEndTime;
        public java.lang.String mKind;
        public java.lang.String mSql;
        public java.util.ArrayList<java.lang.Object> mBindArgs;
        public boolean mFinished;
        public java.lang.Exception mException;
        public int mCookie;
        public java.lang.String mPath;
        public long mResultLong;
        public java.lang.String mResultString;
        private Operation() {}
        public void describe(java.lang.StringBuilder p0, boolean p1) {}
        private java.lang.String getStatus() { return null; }
        private java.lang.String getTraceMethodName() { return null; }
    }

    private static final class OperationLog {
        private static final int MAX_RECENT_OPERATIONS = 20;
        private static final int COOKIE_GENERATION_SHIFT = 8;
        private static final int COOKIE_INDEX_MASK = 255;
        private final android.database.sqlite.SQLiteConnection.Operation[] mOperations = null;
        private int mIndex;
        private int mGeneration;
        private final android.database.sqlite.SQLiteConnectionPool mPool = null;
        private long mResultLong;
        private java.lang.String mResultString;
        OperationLog(android.database.sqlite.SQLiteConnectionPool p0) {}
        public int beginOperation(java.lang.String p0, java.lang.String p1, java.lang.Object[] p2) { return 0; }
        public void failOperation(int p0, java.lang.Exception p1) {}
        public void endOperation(int p0) {}
        public boolean endOperationDeferLog(int p0) { return false; }
        public void logOperation(int p0, java.lang.String p1) {}
        public void setResult(long p0) {}
        public void setResult(java.lang.String p0) {}
        private boolean endOperationDeferLogLocked(int p0) { return false; }
        private void logOperationLocked(int p0, java.lang.String p1) {}
        private int newOperationCookieLocked(int p0) { return 0; }
        private android.database.sqlite.SQLiteConnection.Operation getOperationLocked(int p0) { return null; }
        public java.lang.String describeCurrentOperation() { return null; }
        public void dump(android.util.Printer p0) {}
    }

    private static final class PreparedStatement {
        public android.database.sqlite.SQLiteConnection.PreparedStatement mPoolNext;
        public java.lang.String mSql;
        public long mStatementPtr;
        public int mNumParameters;
        public int mType;
        public boolean mReadOnly;
        public boolean mInCache;
        public boolean mInUse;
        private PreparedStatement() {}
    }

    private final class PreparedStatementCache extends android.util.LruCache<java.lang.String, android.database.sqlite.SQLiteConnection.PreparedStatement> {
        public PreparedStatementCache(android.database.sqlite.SQLiteConnection p0, int p1) { super(0); }
        protected void entryRemoved(boolean p0, java.lang.String p1, android.database.sqlite.SQLiteConnection.PreparedStatement p2, android.database.sqlite.SQLiteConnection.PreparedStatement p3) {}
        public void dump(android.util.Printer p0) {}
    }
}
