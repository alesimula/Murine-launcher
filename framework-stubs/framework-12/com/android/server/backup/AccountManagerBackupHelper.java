package com.android.server.backup;

public class AccountManagerBackupHelper extends android.app.backup.BlobBackupHelper {
    private static final java.lang.String TAG = "AccountsBackup";
    private static final boolean DEBUG = false;
    private static final int STATE_VERSION = 1;
    private static final java.lang.String KEY_ACCOUNT_ACCESS_GRANTS = "account_access_grants";
    public AccountManagerBackupHelper() { super(0, null); }
    protected byte[] getBackupPayload(java.lang.String p0) { return null; }
    protected void applyRestoredPayload(java.lang.String p0, byte[] p1) {}
}
