package android.database.sqlite;

public final class SQLiteDatabase extends android.database.sqlite.SQLiteClosable {
    public static final int CONFLICT_ROLLBACK = 1;
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_NONE = 0;
    public static final java.lang.String[] CONFLICT_VALUES = null;
    public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
    public static final int OPEN_READWRITE = 0;
    public static final int OPEN_READONLY = 1;
    public static final int NO_LOCALIZED_COLLATORS = 16;
    public static final int CREATE_IF_NECESSARY = 268435456;
    public static final int ENABLE_WRITE_AHEAD_LOGGING = 536870912;
    public static final int ENABLE_LEGACY_COMPATIBILITY_WAL = -2147483648;
    public static final int MAX_SQL_CACHE_SIZE = 100;
    public static final java.lang.String JOURNAL_MODE_WAL = "WAL";
    public static final java.lang.String JOURNAL_MODE_PERSIST = "PERSIST";
    public static final java.lang.String JOURNAL_MODE_TRUNCATE = "TRUNCATE";
    public static final java.lang.String JOURNAL_MODE_MEMORY = "MEMORY";
    public static final java.lang.String JOURNAL_MODE_DELETE = "DELETE";
    public static final java.lang.String JOURNAL_MODE_OFF = "OFF";
    @android.annotation.SuppressLint("IntentName")
    public static final java.lang.String SYNC_MODE_EXTRA = "EXTRA";
    public static final java.lang.String SYNC_MODE_FULL = "FULL";
    public static final java.lang.String SYNC_MODE_NORMAL = "NORMAL";
    public static final java.lang.String SYNC_MODE_OFF = "OFF";
    protected void finalize() throws java.lang.Throwable {}
    protected void onAllReferencesReleased() {}
    public static int releaseMemory() { return 0; }
    @java.lang.Deprecated
    public void setLockingEnabled(boolean p0) {}
    java.lang.String getLabel() { return null; }
    void onCorruption() {}
    android.database.sqlite.SQLiteSession getThreadSession() { return null; }
    android.database.sqlite.SQLiteSession createSession() { return null; }
    int getThreadDefaultConnectionFlags(boolean p0) { return 0; }
    public void beginTransaction() {}
    public void beginTransactionNonExclusive() {}
    public void beginTransactionWithListener(android.database.sqlite.SQLiteTransactionListener p0) {}
    public void beginTransactionWithListenerNonExclusive(android.database.sqlite.SQLiteTransactionListener p0) {}
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
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getSyncedTables() { return null; }
    public static android.database.sqlite.SQLiteDatabase openDatabase(java.lang.String p0, android.database.sqlite.SQLiteDatabase.CursorFactory p1, int p2) { return null; }
    public static android.database.sqlite.SQLiteDatabase openDatabase(java.io.File p0, android.database.sqlite.SQLiteDatabase.OpenParams p1) { return null; }
    public static android.database.sqlite.SQLiteDatabase openDatabase(java.lang.String p0, android.database.sqlite.SQLiteDatabase.CursorFactory p1, int p2, android.database.DatabaseErrorHandler p3) { return null; }
    public static android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.io.File p0, android.database.sqlite.SQLiteDatabase.CursorFactory p1) { return null; }
    public static android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String p0, android.database.sqlite.SQLiteDatabase.CursorFactory p1) { return null; }
    public static android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String p0, android.database.sqlite.SQLiteDatabase.CursorFactory p1, android.database.DatabaseErrorHandler p2) { return null; }
    public static boolean deleteDatabase(java.io.File p0) { return false; }
    public static boolean deleteDatabase(java.io.File p0, boolean p1) { return false; }
    public void reopenReadWrite() {}
    public static android.database.sqlite.SQLiteDatabase create(android.database.sqlite.SQLiteDatabase.CursorFactory p0) { return null; }
    public static android.database.sqlite.SQLiteDatabase createInMemory(android.database.sqlite.SQLiteDatabase.OpenParams p0) { return null; }
    public void setCustomScalarFunction(java.lang.String p0, java.util.function.UnaryOperator<java.lang.String> p1) throws android.database.sqlite.SQLiteException {}
    public void setCustomAggregateFunction(java.lang.String p0, java.util.function.BinaryOperator<java.lang.String> p1) throws android.database.sqlite.SQLiteException {}
    public void execPerConnectionSQL(java.lang.String p0, java.lang.Object[] p1) throws android.database.SQLException {}
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
    static void dumpAll(android.util.Printer p0, boolean p1, boolean p2) {}
    public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() { return null; }
    public boolean isDatabaseIntegrityOk() { return false; }
    public java.lang.String toString() { return null; }
    public static void wipeDetected(java.lang.String p0, java.lang.String p1) {}
    public static java.lang.String getFileTimestamps(java.lang.String p0) { return null; }
    static void wtfAsSystemServer(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) {}

    public static interface CursorFactory {
        public android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase p0, android.database.sqlite.SQLiteCursorDriver p1, java.lang.String p2, android.database.sqlite.SQLiteQuery p3);
    }

    public static interface CustomFunction {
        public void callback(java.lang.String[] p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DatabaseOpenFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface JournalMode {
    }

    public static final class OpenParams {
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
    public static @interface SyncMode {
    }
}
