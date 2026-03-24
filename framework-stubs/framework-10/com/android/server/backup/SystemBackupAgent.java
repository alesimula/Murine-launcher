package com.android.server.backup;

public class SystemBackupAgent extends android.app.backup.BackupAgentHelper {
    private static final java.lang.String TAG = "SystemBackupAgent";
    private static final java.lang.String WALLPAPER_HELPER = "wallpaper";
    private static final java.lang.String SYNC_SETTINGS_HELPER = "account_sync_settings";
    private static final java.lang.String PREFERRED_HELPER = "preferred_activities";
    private static final java.lang.String NOTIFICATION_HELPER = "notifications";
    private static final java.lang.String PERMISSION_HELPER = "permissions";
    private static final java.lang.String USAGE_STATS_HELPER = "usage_stats";
    private static final java.lang.String SHORTCUT_MANAGER_HELPER = "shortcut_manager";
    private static final java.lang.String ACCOUNT_MANAGER_HELPER = "account_manager";
    private static final java.lang.String SLICES_HELPER = "slices";
    private static final java.lang.String WALLPAPER_IMAGE_FILENAME = "wallpaper";
    private static final java.lang.String WALLPAPER_INFO_FILENAME = "wallpaper_info.xml";
    private static final java.lang.String WALLPAPER_IMAGE_DIR = null;
    public static final java.lang.String WALLPAPER_IMAGE = null;
    private static final java.lang.String WALLPAPER_INFO_DIR = null;
    public static final java.lang.String WALLPAPER_INFO = null;
    private static final java.lang.String WALLPAPER_IMAGE_KEY = "/data/data/com.android.settings/files/wallpaper";
    private static final java.util.Set<java.lang.String> sEligibleForMultiUser = null;
    private int mUserId;
    public SystemBackupAgent() { super(); }
    public void onCreate(android.os.UserHandle p0) {}
    public void onFullBackup(android.app.backup.FullBackupDataOutput p0) throws java.io.IOException {}
    public void onRestore(android.app.backup.BackupDataInput p0, int p1, android.os.ParcelFileDescriptor p2) throws java.io.IOException {}
    public void addHelper(java.lang.String p0, android.app.backup.BackupHelper p1) {}
    public void onRestoreFile(android.os.ParcelFileDescriptor p0, long p1, int p2, java.lang.String p3, java.lang.String p4, long p5, long p6) throws java.io.IOException {}
}
