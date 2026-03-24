package com.android.server;

public class BootReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = "BootReceiver";
    private static final java.lang.String TAG_TRUNCATED = "[[TRUNCATED]]\n";
    private static final int LOG_SIZE = Integer.valueOf(0);
    private static final int LASTK_LOG_SIZE = Integer.valueOf(0);
    private static final int GMSCORE_LASTK_LOG_SIZE = 196608;
    private static final java.io.File TOMBSTONE_DIR = null;
    private static final java.lang.String TAG_TOMBSTONE = "SYSTEM_TOMBSTONE";
    private static final java.lang.String OLD_UPDATER_PACKAGE = "com.google.android.systemupdater";
    private static final java.lang.String OLD_UPDATER_CLASS = "com.google.android.systemupdater.SystemUpdateReceiver";
    private static android.os.FileObserver sTombstoneObserver;
    private static final java.lang.String LOG_FILES_FILE = "log-files.xml";
    private static final android.util.AtomicFile sFile = null;
    private static final java.lang.String LAST_HEADER_FILE = "last-header.txt";
    private static final java.io.File lastHeaderFile = null;
    private static final java.lang.String FS_STAT_PATTERN = "fs_stat,[^,]*/([^/,]+),(0x[0-9a-fA-F]+)";
    private static final int FS_STAT_FS_FIXED = 1024;
    private static final java.lang.String FSCK_PASS_PATTERN = "Pass ([1-9]E?):";
    private static final java.lang.String FSCK_TREE_OPTIMIZATION_PATTERN = "Inode [0-9]+ extent tree.*could be shorter";
    private static final java.lang.String FSCK_FS_MODIFIED = "FILE SYSTEM WAS MODIFIED";
    private static final java.lang.String[] MOUNT_DURATION_PROPS_POSTFIX = null;
    private static final java.lang.String[] LAST_KMSG_FILES = null;
    private static final java.lang.String LAST_SHUTDOWN_TIME_PATTERN = "powerctl_shutdown_time_ms:([0-9]+):([0-9]+)";
    private static final int UMOUNT_STATUS_NOT_AVAILABLE = 4;
    private static final java.lang.String SHUTDOWN_METRICS_FILE = "/data/system/shutdown-metrics.txt";
    private static final java.lang.String SHUTDOWN_TRON_METRICS_PREFIX = "shutdown_";
    private static final java.lang.String METRIC_SYSTEM_SERVER = "shutdown_system_server";
    private static final java.lang.String METRIC_SHUTDOWN_TIME_START = "begin_shutdown";
    public BootReceiver() { super(); }
    public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    private void removeOldUpdatePackages(android.content.Context p0) {}
    private java.lang.String getPreviousBootHeaders() { return null; }
    private java.lang.String getCurrentBootHeaders() throws java.io.IOException { return null; }
    private java.lang.String getBootHeadersToLogAndUpdate() throws java.io.IOException { return null; }
    private void logBootEvents(android.content.Context p0) throws java.io.IOException {}
    private static void addLastkToDropBox(android.os.DropBoxManager p0, java.util.HashMap<java.lang.String, java.lang.Long> p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5, java.lang.String p6) throws java.io.IOException {}
    private static void addFileToDropBox(android.os.DropBoxManager p0, java.util.HashMap<java.lang.String, java.lang.Long> p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.String p5) throws java.io.IOException {}
    private static void addFileWithFootersToDropBox(android.os.DropBoxManager p0, java.util.HashMap<java.lang.String, java.lang.Long> p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5, java.lang.String p6) throws java.io.IOException {}
    private static void addTextToDropBox(android.os.DropBoxManager p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4) {}
    private static void addAuditErrorsToDropBox(android.os.DropBoxManager p0, java.util.HashMap<java.lang.String, java.lang.Long> p1, java.lang.String p2, int p3, java.lang.String p4) throws java.io.IOException {}
    private static void addFsckErrorsToDropBoxAndLogFsStat(android.os.DropBoxManager p0, java.util.HashMap<java.lang.String, java.lang.Long> p1, java.lang.String p2, int p3, java.lang.String p4) throws java.io.IOException {}
    private static void logFsMountTime() {}
    private static void logSystemServerShutdownTimeMetrics() {}
    private static void logTronShutdownMetric(java.lang.String p0, java.lang.String p1) {}
    private static void logStatsdShutdownAtom(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    private static void logFsShutdownTime() {}
    public static int fixFsckFsStat(java.lang.String p0, int p1, java.lang.String[] p2, int p3, int p4) { return 0; }
    private static void handleFsckFsStat(java.util.regex.Matcher p0, java.lang.String[] p1, int p2, int p3) {}
    private static java.util.HashMap<java.lang.String, java.lang.Long> readTimestamps() { return null; }
    private void writeTimestamps(java.util.HashMap<java.lang.String, java.lang.Long> p0) {}
}
