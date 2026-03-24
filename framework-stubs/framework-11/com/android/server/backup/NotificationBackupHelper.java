package com.android.server.backup;

public class NotificationBackupHelper extends android.app.backup.BlobBackupHelper {
    static final java.lang.String TAG = "NotifBackupHelper";
    static final boolean DEBUG = Boolean.valueOf(false);
    static final int BLOB_VERSION = 1;
    static final java.lang.String KEY_NOTIFICATIONS = "notifications";
    private final int mUserId = 0;
    public NotificationBackupHelper(int p0) { super(0, null); }
    protected byte[] getBackupPayload(java.lang.String p0) { return null; }
    protected void applyRestoredPayload(java.lang.String p0, byte[] p1) {}
}
