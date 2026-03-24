package android.database.sqlite;

public final class SQLiteGlobal {
    private static final java.lang.String TAG = "SQLiteGlobal";
    public static final java.lang.String SYNC_MODE_FULL = "FULL";
    static final java.lang.String WIPE_CHECK_FILE_SUFFIX = "-wipecheck";
    private static final java.lang.Object sLock = null;
    private static int sDefaultPageSize;
    public static volatile java.lang.String sDefaultSyncMode;
    private static native int nativeReleaseMemory();
    private SQLiteGlobal() {}
    public static int releaseMemory() { return 0; }
    public static int getDefaultPageSize() { return 0; }
    public static java.lang.String getDefaultJournalMode() { return null; }
    public static int getJournalSizeLimit() { return 0; }
    public static java.lang.String getDefaultSyncMode() { return null; }
    public static java.lang.String getWALSyncMode() { return null; }
    public static int getWALAutoCheckpoint() { return 0; }
    public static int getWALConnectionPoolSize() { return 0; }
    public static int getIdleConnectionTimeout() { return 0; }
    public static long getWALTruncateSize() { return 0L; }
    public static boolean checkDbWipe() { return false; }
}
