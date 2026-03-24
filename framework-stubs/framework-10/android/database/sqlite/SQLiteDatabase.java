package android.database.sqlite;

public final class SQLiteDatabase extends android.database.sqlite.SQLiteClosable {
    private static final java.lang.String TAG = "SQLiteDatabase";
    private static final int EVENT_DB_CORRUPT = 75004;
    private static final boolean DEBUG_CLOSE_IDLE_CONNECTIONS = Boolean.valueOf(false);
    private static java.util.WeakHashMap<android.database.sqlite.SQLiteDatabase, java.lang.Object> sActiveDatabases;
    @android.annotation.UnsupportedAppUsage
    private final java.lang.ThreadLocal<android.database.sqlite.SQLiteSession> mThreadSession = null;
    private final android.database.sqlite.SQLiteDatabase.CursorFactory mCursorFactory = null;
    private final android.database.DatabaseErrorHandler mErrorHandler = null;
    private final java.lang.Object mLock = null;
    @android.annotation.UnsupportedAppUsage
    private final android.database.sqlite.SQLiteDatabaseConfiguration mConfigurationLocked = null;
    @android.annotation.UnsupportedAppUsage
    private android.database.sqlite.SQLiteConnectionPool mConnectionPoolLocked;
    private boolean mHasAttachedDbsLocked;
    public static final int CONFLICT_ROLLBACK = 1;
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_NONE = 0;
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String[] CONFLICT_VALUES = null;
    public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
    public static final int OPEN_READWRITE = 0;
    public static final int OPEN_READONLY = 1;
    private static final int OPEN_READ_MASK = 1;
    public static final int NO_LOCALIZED_COLLATORS = 16;
    public static final int CREATE_IF_NECESSARY = 268435456;
    public static final int ENABLE_WRITE_AHEAD_LOGGING = 536870912;
    public static final int ENABLE_LEGACY_COMPATIBILITY_WAL = -2147483648;
    public static final int MAX_SQL_CACHE_SIZE = 100;
    private SQLiteDatabase(java.lang.String p0, int p1, android.database.sqlite.SQLiteDatabase.CursorFactory p2, android.database.DatabaseErrorHandler p3, int p4, int p5, long p6, java.lang.String p7, java.lang.String p8) { super(); }
    protected void finalize() throws java.lang.Throwable {}
    protected void onAllReferencesReleased() {}
    private void dispose(boolean p0) {}
    public static int releaseMemory() { return 0; }
    @java.lang.Deprecated
    public void setLockingEnabled(boolean p0) {}
    java.lang.String getLabel() { return null; }
    void onCorruption() {}
    @android.annotation.UnsupportedAppUsage
    android.database.sqlite.SQLiteSession getThreadSession() { return null; }
    android.database.sqlite.SQLiteSession createSession() { return null; }
    int getThreadDefaultConnectionFlags(boolean p0) { return 0; }
    private static boolean isMainThread() { return false; }
    public void beginTransaction() {}
    public void beginTransactionNonExclusive() {}
    public void beginTransactionWithListener(android.database.sqlite.SQLiteTransactionListener p0) {}
    public void beginTransactionWithListenerNonExclusive(android.database.sqlite.SQLiteTransactionListener p0) {}
    @android.annotation.UnsupportedAppUsage
    private void beginTransaction(android.database.sqlite.SQLiteTransactionListener p0, boolean p1) {}
    public void endTransaction() {}
    public void setTransactionSuccessful() {}
    public boolean inTransaction() { return false; }
    public boolean isDbLockedByCurrentThread() { return false; }
    @java.lang.Deprecated
    public boolean isDbLockedByOtherThreads() { return false; }
    @java.lang.Deprecated
    public boolean yieldIfContended() { return false; }
    public boolean yieldIfContendedSafely() { return false; }
    public boolean yieldIfContendedSafely(long p0) { return false; }
    private boolean yieldIfContendedHelper(boolean p0, long p1) { return false; }
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getSyncedTables() { return null; }
    public static android.database.sqlite.SQLiteDatabase openDatabase(java.lang.String p0, android.database.sqlite.SQLiteDatabase.CursorFactory p1, int p2) { return null; }
    public static android.database.sqlite.SQLiteDatabase openDatabase(java.io.File p0, android.database.sqlite.SQLiteDatabase.OpenParams p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    private static android.database.sqlite.SQLiteDatabase openDatabase(java.lang.String p0, android.database.sqlite.SQLiteDatabase.OpenParams p1) { return null; }
    public static android.database.sqlite.SQLiteDatabase openDatabase(java.lang.String p0, android.database.sqlite.SQLiteDatabase.CursorFactory p1, int p2, android.database.DatabaseErrorHandler p3) { return null; }
    public static android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.io.File p0, android.database.sqlite.SQLiteDatabase.CursorFactory p1) { return null; }
    public static android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String p0, android.database.sqlite.SQLiteDatabase.CursorFactory p1) { return null; }
    public static android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String p0, android.database.sqlite.SQLiteDatabase.CursorFactory p1, android.database.DatabaseErrorHandler p2) { return null; }
    public static boolean deleteDatabase(java.io.File p0) { return false; }
    public static boolean deleteDatabase(java.io.File p0, boolean p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public void reopenReadWrite() {}
    private void open() {}
    private void openInner() {}
    public static android.database.sqlite.SQLiteDatabase create(android.database.sqlite.SQLiteDatabase.CursorFactory p0) { return null; }
    public static android.database.sqlite.SQLiteDatabase createInMemory(android.database.sqlite.SQLiteDatabase.OpenParams p0) { return null; }
    public void addCustomFunction(java.lang.String p0, int p1, android.database.sqlite.SQLiteDatabase.CustomFunction p2) {}
    public int getVersion() { return 0; }
    public void setVersion(int p0) {}
    public long getMaximumSize() { return 0L; }
    public long setMaximumSize(long p0) { return 0L; }
    public long getPageSize() { return 0L; }
    public void setPageSize(long p0) {}
    @java.lang.Deprecated
    public void markTableSyncable(java.lang.String p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void markTableSyncable(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public static java.lang.String findEditTable(java.lang.String p0) { return null; }
    public android.database.sqlite.SQLiteStatement compileStatement(java.lang.String p0) throws android.database.SQLException { return null; }
    public android.database.Cursor query(boolean p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3, java.lang.String[] p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8) { return null; }
    public android.database.Cursor query(boolean p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3, java.lang.String[] p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, android.os.CancellationSignal p9) { return null; }
    public android.database.Cursor queryWithFactory(android.database.sqlite.SQLiteDatabase.CursorFactory p0, boolean p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, java.lang.String[] p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) { return null; }
    public android.database.Cursor queryWithFactory(android.database.sqlite.SQLiteDatabase.CursorFactory p0, boolean p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, java.lang.String[] p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, android.os.CancellationSignal p10) { return null; }
    public android.database.Cursor query(java.lang.String p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) { return null; }
    public android.database.Cursor query(java.lang.String p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7) { return null; }
    public android.database.Cursor rawQuery(java.lang.String p0, java.lang.String[] p1) { return null; }
    public android.database.Cursor rawQuery(java.lang.String p0, java.lang.String[] p1, android.os.CancellationSignal p2) { return null; }
    public android.database.Cursor rawQueryWithFactory(android.database.sqlite.SQLiteDatabase.CursorFactory p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3) { return null; }
    public android.database.Cursor rawQueryWithFactory(android.database.sqlite.SQLiteDatabase.CursorFactory p0, java.lang.String p1, java.lang.String[] p2, java.lang.String p3, android.os.CancellationSignal p4) { return null; }
    public long insert(java.lang.String p0, java.lang.String p1, android.content.ContentValues p2) { return 0L; }
    public long insertOrThrow(java.lang.String p0, java.lang.String p1, android.content.ContentValues p2) throws android.database.SQLException { return 0L; }
    public long replace(java.lang.String p0, java.lang.String p1, android.content.ContentValues p2) { return 0L; }
    public long replaceOrThrow(java.lang.String p0, java.lang.String p1, android.content.ContentValues p2) throws android.database.SQLException { return 0L; }
    public long insertWithOnConflict(java.lang.String p0, java.lang.String p1, android.content.ContentValues p2, int p3) { return 0L; }
    public int delete(java.lang.String p0, java.lang.String p1, java.lang.String[] p2) { return 0; }
    public int update(java.lang.String p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3) { return 0; }
    public int updateWithOnConflict(java.lang.String p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3, int p4) { return 0; }
    public void execSQL(java.lang.String p0) throws android.database.SQLException {}
    public void execSQL(java.lang.String p0, java.lang.Object[] p1) throws android.database.SQLException {}
    public int executeSql(java.lang.String p0, java.lang.Object[] p1) throws android.database.SQLException { return 0; }
    public void validateSql(java.lang.String p0, android.os.CancellationSignal p1) {}
    public boolean isReadOnly() { return false; }
    private boolean isReadOnlyLocked() { return false; }
    public boolean isInMemoryDatabase() { return false; }
    public boolean isOpen() { return false; }
    public boolean needUpgrade(int p0) { return false; }
    public final java.lang.String getPath() { return null; }
    public void setLocale(java.util.Locale p0) {}
    public void setMaxSqlCacheSize(int p0) {}
    public void setForeignKeyConstraintsEnabled(boolean p0) {}
    public boolean enableWriteAheadLogging() { return false; }
    public void disableWriteAheadLogging() {}
    public boolean isWriteAheadLoggingEnabled() { return false; }
    static java.util.ArrayList<android.database.sqlite.SQLiteDebug.DbStats> getDbStats() { return null; }
    @android.annotation.UnsupportedAppUsage
    private void collectDbStats(java.util.ArrayList<android.database.sqlite.SQLiteDebug.DbStats> p0) {}
    @android.annotation.UnsupportedAppUsage
    private static java.util.ArrayList<android.database.sqlite.SQLiteDatabase> getActiveDatabases() { return null; }
    static void dumpAll(android.util.Printer p0, boolean p1, boolean p2) {}
    private void dump(android.util.Printer p0, boolean p1, boolean p2, android.util.ArraySet p3) {}
    private static void dumpDatabaseDirectory(android.util.Printer p0, java.io.File p1, boolean p2) {}
    public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() { return null; }
    public boolean isDatabaseIntegrityOk() { return false; }
    public java.lang.String toString() { return null; }
    private void throwIfNotOpenLocked() {}
    public static void wipeDetected(java.lang.String p0, java.lang.String p1) {}
    public static java.lang.String getFileTimestamps(java.lang.String p0) { return null; }
    static void wtfAsSystemServer(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) {}

    public static final class OpenParams {
        private final int mOpenFlags = 0;
        private final android.database.sqlite.SQLiteDatabase.CursorFactory mCursorFactory = null;
        private final android.database.DatabaseErrorHandler mErrorHandler = null;
        private final int mLookasideSlotSize = 0;
        private final int mLookasideSlotCount = 0;
        private final long mIdleConnectionTimeout = 0L;
        private final java.lang.String mJournalMode = null;
        private final java.lang.String mSyncMode = null;
        private OpenParams(int p0, android.database.sqlite.SQLiteDatabase.CursorFactory p1, android.database.DatabaseErrorHandler p2, int p3, int p4, long p5, java.lang.String p6, java.lang.String p7) {}
        public int getLookasideSlotSize() { return 0; }
        public int getLookasideSlotCount() { return 0; }
        public int getOpenFlags() { return 0; }
        public android.database.sqlite.SQLiteDatabase.CursorFactory getCursorFactory() { return null; }
        public android.database.DatabaseErrorHandler getErrorHandler() { return null; }
        public long getIdleConnectionTimeout() { return 0L; }
        public java.lang.String getJournalMode() { return null; }
        public java.lang.String getSynchronousMode() { return null; }
        public android.database.sqlite.SQLiteDatabase.OpenParams.Builder toBuilder() { return null; }

        public static final class Builder {
            private int mLookasideSlotSize;
            private int mLookasideSlotCount;
            private long mIdleConnectionTimeout;
            private int mOpenFlags;
            private android.database.sqlite.SQLiteDatabase.CursorFactory mCursorFactory;
            private android.database.DatabaseErrorHandler mErrorHandler;
            private java.lang.String mJournalMode;
            private java.lang.String mSyncMode;
            public Builder() {}
            public Builder(android.database.sqlite.SQLiteDatabase.OpenParams p0) {}
            public android.database.sqlite.SQLiteDatabase.OpenParams.Builder setLookasideConfig(int p0, int p1) { return null; }
            public boolean isWriteAheadLoggingEnabled() { return false; }
            public android.database.sqlite.SQLiteDatabase.OpenParams.Builder setOpenFlags(int p0) { return null; }
            public android.database.sqlite.SQLiteDatabase.OpenParams.Builder addOpenFlags(int p0) { return null; }
            public android.database.sqlite.SQLiteDatabase.OpenParams.Builder removeOpenFlags(int p0) { return null; }
            public void setWriteAheadLoggingEnabled(boolean p0) {}
            public android.database.sqlite.SQLiteDatabase.OpenParams.Builder setCursorFactory(android.database.sqlite.SQLiteDatabase.CursorFactory p0) { return null; }
            public android.database.sqlite.SQLiteDatabase.OpenParams.Builder setErrorHandler(android.database.DatabaseErrorHandler p0) { return null; }
            @java.lang.Deprecated
            public android.database.sqlite.SQLiteDatabase.OpenParams.Builder setIdleConnectionTimeout(long p0) { return null; }
            public android.database.sqlite.SQLiteDatabase.OpenParams.Builder setJournalMode(java.lang.String p0) { return null; }
            public android.database.sqlite.SQLiteDatabase.OpenParams.Builder setSynchronousMode(java.lang.String p0) { return null; }
            public android.database.sqlite.SQLiteDatabase.OpenParams build() { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DatabaseOpenFlags {
    }

    public static interface CustomFunction {
        public void callback(java.lang.String[] p0);
    }

    public static interface CursorFactory {
        public android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase p0, android.database.sqlite.SQLiteCursorDriver p1, java.lang.String p2, android.database.sqlite.SQLiteQuery p3);
    }
}
