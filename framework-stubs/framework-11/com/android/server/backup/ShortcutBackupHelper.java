package com.android.server.backup;

public class ShortcutBackupHelper extends android.app.backup.BlobBackupHelper {
    private static final java.lang.String TAG = "ShortcutBackupAgent";
    private static final int BLOB_VERSION = 1;
    private static final java.lang.String KEY_USER_FILE = "shortcutuser.xml";
    public ShortcutBackupHelper() { super(0, null); }
    private android.content.pm.IShortcutService getShortcutService() { return null; }
    protected byte[] getBackupPayload(java.lang.String p0) { return null; }
    protected void applyRestoredPayload(java.lang.String p0, byte[] p1) {}
}
