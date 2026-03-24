package com.android.server.backup;

public class UsageStatsBackupHelper extends android.app.backup.BlobBackupHelper {
    static final java.lang.String TAG = "UsgStatsBackupHelper";
    static final boolean DEBUG = false;
    static final int BLOB_VERSION = 1;
    static final java.lang.String KEY_USAGE_STATS = "usage_stats";
    public UsageStatsBackupHelper(android.content.Context p0) { super(0, null); }
    protected byte[] getBackupPayload(java.lang.String p0) { return null; }
    protected void applyRestoredPayload(java.lang.String p0, byte[] p1) {}
}
