package com.android.server.backup;

public class PreferredActivityBackupHelper extends android.app.backup.BlobBackupHelper {
    private static final java.lang.String TAG = "PreferredBackup";
    private static final boolean DEBUG = false;
    private static final int STATE_VERSION = 3;
    private static final java.lang.String KEY_PREFERRED = "preferred-activity";
    private static final java.lang.String KEY_DEFAULT_APPS = "default-apps";
    private static final java.lang.String KEY_INTENT_VERIFICATION = "intent-verification";
    public PreferredActivityBackupHelper() { super(0, null); }
    protected byte[] getBackupPayload(java.lang.String p0) { return null; }
    protected void applyRestoredPayload(java.lang.String p0, byte[] p1) {}
}
