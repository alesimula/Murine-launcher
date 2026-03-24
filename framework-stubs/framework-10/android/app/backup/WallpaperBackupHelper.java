package android.app.backup;

public class WallpaperBackupHelper extends android.app.backup.FileBackupHelperBase implements android.app.backup.BackupHelper {
    private static final java.lang.String TAG = "WallpaperBackupHelper";
    private static final boolean DEBUG = false;
    public static final java.lang.String WALLPAPER_IMAGE_KEY = "/data/data/com.android.settings/files/wallpaper";
    public static final java.lang.String WALLPAPER_INFO_KEY = "/data/system/wallpaper_info.xml";
    private static final java.lang.String STAGE_FILE = null;
    private final java.lang.String[] mKeys = null;
    private final android.app.WallpaperManager mWpm = null;
    public WallpaperBackupHelper(android.content.Context p0, java.lang.String[] p1) { super(null); }
    public void performBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2) {}
    public void restoreEntity(android.app.backup.BackupDataInputStream p0) {}
}
