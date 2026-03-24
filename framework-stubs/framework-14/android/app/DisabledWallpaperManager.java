package android.app;

final class DisabledWallpaperManager extends android.app.WallpaperManager {
    static android.app.DisabledWallpaperManager getInstance() { return null; }
    public boolean isWallpaperSupported() { return false; }
    public boolean isSetWallpaperAllowed() { return false; }
    public android.graphics.drawable.Drawable getDrawable() { return null; }
    public android.graphics.drawable.Drawable getBuiltInDrawable() { return null; }
    public android.graphics.drawable.Drawable getBuiltInDrawable(int p0) { return null; }
    public android.graphics.drawable.Drawable getBuiltInDrawable(int p0, int p1, boolean p2, float p3, float p4) { return null; }
    public android.graphics.drawable.Drawable getBuiltInDrawable(int p0, int p1, boolean p2, float p3, float p4, int p5) { return null; }
    public android.graphics.drawable.Drawable peekDrawable() { return null; }
    public android.graphics.drawable.Drawable getFastDrawable() { return null; }
    public android.graphics.drawable.Drawable peekFastDrawable() { return null; }
    public android.graphics.Bitmap getBitmap() { return null; }
    public android.graphics.Bitmap getBitmap(boolean p0) { return null; }
    public android.graphics.Bitmap getBitmapAsUser(int p0, boolean p1) { return null; }
    public android.os.ParcelFileDescriptor getWallpaperFile(int p0) { return null; }
    public void addOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, android.os.Handler p1) {}
    public void addOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, android.os.Handler p1, int p2) {}
    public void removeOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0) {}
    public void removeOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, int p1) {}
    public android.app.WallpaperColors getWallpaperColors(int p0) { return null; }
    public android.app.WallpaperColors getWallpaperColors(int p0, int p1) { return null; }
    public android.os.ParcelFileDescriptor getWallpaperFile(int p0, int p1) { return null; }
    public android.os.ParcelFileDescriptor getWallpaperFile(int p0, boolean p1) { return null; }
    public void forgetLoadedWallpaper() {}
    public android.app.WallpaperInfo getWallpaperInfo() { return null; }
    public android.os.ParcelFileDescriptor getWallpaperInfoFile() { return null; }
    public android.app.WallpaperInfo getWallpaperInfoForUser(int p0) { return null; }
    public android.app.WallpaperInfo getWallpaperInfo(int p0) { return null; }
    public android.app.WallpaperInfo getWallpaperInfo(int p0, int p1) { return null; }
    public int getWallpaperId(int p0) { return 0; }
    public int getWallpaperIdForUser(int p0, int p1) { return 0; }
    public android.content.Intent getCropAndSetWallpaperIntent(android.net.Uri p0) { return null; }
    public void setResource(int p0) throws java.io.IOException {}
    public int setResource(int p0, int p1) throws java.io.IOException { return 0; }
    public void setBitmap(android.graphics.Bitmap p0) throws java.io.IOException {}
    public int setBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, boolean p2) throws java.io.IOException { return 0; }
    public int setBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, boolean p2, int p3) throws java.io.IOException { return 0; }
    public int setBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, boolean p2, int p3, int p4) throws java.io.IOException { return 0; }
    public void setStream(java.io.InputStream p0) throws java.io.IOException {}
    public int setStream(java.io.InputStream p0, android.graphics.Rect p1, boolean p2) throws java.io.IOException { return 0; }
    public int setStream(java.io.InputStream p0, android.graphics.Rect p1, boolean p2, int p3) throws java.io.IOException { return 0; }
    public boolean hasResourceWallpaper(int p0) { return false; }
    public int getDesiredMinimumWidth() { return 0; }
    public int getDesiredMinimumHeight() { return 0; }
    public void suggestDesiredDimensions(int p0, int p1) {}
    public void setDisplayPadding(android.graphics.Rect p0) {}
    public void setDisplayOffset(android.os.IBinder p0, int p1, int p2) {}
    public void clearWallpaper() {}
    public void clearWallpaper(int p0, int p1) {}
    public boolean setWallpaperComponent(android.content.ComponentName p0) { return false; }
    public boolean setWallpaperComponent(android.content.ComponentName p0, int p1) { return false; }
    public void setWallpaperOffsets(android.os.IBinder p0, float p1, float p2) {}
    public void setWallpaperOffsetSteps(float p0, float p1) {}
    public void sendWallpaperCommand(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, android.os.Bundle p5) {}
    public void clearWallpaperOffsets(android.os.IBinder p0) {}
    public void clear() throws java.io.IOException {}
    public void clear(int p0) throws java.io.IOException {}
    public boolean isWallpaperBackupEligible(int p0) { return false; }
    public boolean wallpaperSupportsWcg(int p0) { return false; }
}
