package android.database.sqlite;

public class SQLiteCompatibilityWalFlags {
    public static boolean isLegacyCompatibilityWalEnabled() { return false; }
    public static java.lang.String getWALSyncMode() { return null; }
    public static long getTruncateSize() { return 0L; }
    public static void init(java.lang.String p0) {}
    public static void reset() {}
}
