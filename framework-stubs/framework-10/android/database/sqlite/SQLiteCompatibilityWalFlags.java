package android.database.sqlite;

public class SQLiteCompatibilityWalFlags {
    private static final java.lang.String TAG = "SQLiteCompatibilityWalFlags";
    private static volatile boolean sInitialized;
    private static volatile boolean sLegacyCompatibilityWalEnabled;
    private static volatile java.lang.String sWALSyncMode;
    private static volatile long sTruncateSize;
    private static volatile boolean sCallingGlobalSettings;
    private SQLiteCompatibilityWalFlags() {}
    public static boolean isLegacyCompatibilityWalEnabled() { return false; }
    public static java.lang.String getWALSyncMode() { return null; }
    public static long getTruncateSize() { return 0L; }
    private static void initIfNeeded() {}
    public static void init(java.lang.String p0) {}
    public static void reset() {}
}
