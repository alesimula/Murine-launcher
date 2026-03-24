package android.database.sqlite;

public final class SQLiteGlobal {
    public static final java.lang.String SYNC_MODE_FULL = "FULL";
    static final java.lang.String WIPE_CHECK_FILE_SUFFIX = "-wipecheck";
    public static volatile java.lang.String sDefaultSyncMode;
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
