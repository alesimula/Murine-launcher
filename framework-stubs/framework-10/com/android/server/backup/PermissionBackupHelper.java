package com.android.server.backup;

public class PermissionBackupHelper extends android.app.backup.BlobBackupHelper {
    private static final java.lang.String TAG = "PermissionBackup";
    private static final boolean DEBUG = false;
    private static final int STATE_VERSION = 1;
    private static final java.lang.String KEY_PERMISSIONS = "permissions";
    private final android.os.UserHandle mUser = null;
    private final android.permission.PermissionManagerInternal mPermissionManager = null;
    public PermissionBackupHelper(int p0) { super(0, null); }
    protected byte[] getBackupPayload(java.lang.String p0) { return null; }
    protected void applyRestoredPayload(java.lang.String p0, byte[] p1) {}
}
