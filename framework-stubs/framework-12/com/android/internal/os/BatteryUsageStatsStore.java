package com.android.internal.os;

public class BatteryUsageStatsStore {
    private static final java.lang.String TAG = "BatteryUsageStatsStore";
    private static final java.util.List<android.os.BatteryUsageStatsQuery> BATTERY_USAGE_STATS_QUERY = null;
    private static final java.lang.String BATTERY_USAGE_STATS_DIR = "battery-usage-stats";
    private static final java.lang.String SNAPSHOT_FILE_EXTENSION = ".bus";
    private static final java.lang.String DIR_LOCK_FILENAME = ".lock";
    private static final java.lang.String CONFIG_FILENAME = "config";
    private static final java.lang.String BATTERY_USAGE_STATS_BEFORE_RESET_TIMESTAMP_PROPERTY = "BATTERY_USAGE_STATS_BEFORE_RESET_TIMESTAMP";
    private static final long MAX_BATTERY_STATS_SNAPSHOT_STORAGE_BYTES = 102400L;
    private final android.content.Context mContext = null;
    private final com.android.internal.os.BatteryStatsImpl mBatteryStats = null;
    private boolean mSystemReady;
    private final java.io.File mStoreDir = null;
    private final java.io.File mLockFile = null;
    private final android.util.AtomicFile mConfigFile = null;
    private final long mMaxStorageBytes = 0L;
    private final android.os.Handler mHandler = null;
    private final com.android.internal.os.BatteryUsageStatsProvider mBatteryUsageStatsProvider = null;
    public BatteryUsageStatsStore(android.content.Context p0, com.android.internal.os.BatteryStatsImpl p1, java.io.File p2, android.os.Handler p3) {}
    public BatteryUsageStatsStore(android.content.Context p0, com.android.internal.os.BatteryStatsImpl p1, java.io.File p2, android.os.Handler p3, long p4) {}
    public void onSystemReady() {}
    private void prepareForBatteryStatsReset(int p0) {}
    private void storeBatteryUsageStats(android.os.BatteryUsageStats p0) {}
    public long[] listBatteryUsageStatsTimestamps() { return null; }
    public android.os.BatteryUsageStats loadBatteryUsageStats(long p0) { return null; }
    public void setLastBatteryUsageStatsBeforeResetAtomPullTimestamp(long p0) {}
    public long getLastBatteryUsageStatsBeforeResetAtomPullTimestamp() { return 0L; }
    private java.nio.channels.FileLock lockSnapshotDirectory() throws java.io.IOException { return null; }
    private java.io.File makeSnapshotFilename(long p0) { return null; }
    private void writeXmlFileLocked(android.os.BatteryUsageStats p0, java.io.File p1) throws java.io.IOException {}
    private android.os.BatteryUsageStats readXmlFileLocked(java.io.File p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private void removeOldSnapshotsLocked() {}
}
