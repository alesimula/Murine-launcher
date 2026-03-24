package android.app.backup;

public class WallpaperBackupHelper extends android.app.backup.FileBackupHelperBase implements android.app.backup.BackupHelper {
    public static final java.lang.String WALLPAPER_IMAGE_KEY = "/data/data/com.android.settings/files/wallpaper";
    public static final java.lang.String WALLPAPER_INFO_KEY = "/data/system/wallpaper_info.xml";
    public WallpaperBackupHelper(android.content.Context p0, java.lang.String[] p1) { super(null); }
    public void performBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2) {}
    public void restoreEntity(android.app.backup.BackupDataInputStream p0) {}
}
