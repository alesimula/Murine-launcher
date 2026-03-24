package com.android.server.backup;

public class SliceBackupHelper extends android.app.backup.BlobBackupHelper {
    static final java.lang.String TAG = "SliceBackupHelper";
    static final boolean DEBUG = Boolean.valueOf(false);
    static final int BLOB_VERSION = 1;
    static final java.lang.String KEY_SLICES = "slices";
    public SliceBackupHelper(android.content.Context p0) { super(0, null); }
    protected byte[] getBackupPayload(java.lang.String p0) { return null; }
    protected void applyRestoredPayload(java.lang.String p0, byte[] p1) {}
}
