package android.service.wallpaper;

public class EngineWindowPage {
    private android.graphics.Bitmap mScreenShot;
    private volatile long mLastUpdateTime;
    private java.util.Set<android.graphics.RectF> mCallbackAreas;
    private java.util.Map<android.graphics.RectF, android.app.WallpaperColors> mRectFColors;
    public EngineWindowPage() {}
    public void addArea(android.graphics.RectF p0) {}
    public void addWallpaperColors(android.graphics.RectF p0, android.app.WallpaperColors p1) {}
    public android.graphics.Bitmap getBitmap() { return null; }
    public void removeArea(android.graphics.RectF p0) {}
    public void setLastUpdateTime(long p0) {}
    public long getLastUpdateTime() { return 0L; }
    public android.app.WallpaperColors getColors(android.graphics.RectF p0) { return null; }
    public void setBitmap(android.graphics.Bitmap p0) {}
    public java.util.Set<android.graphics.RectF> getAreas() { return null; }
    public synchronized void execSync(java.util.function.Consumer<android.service.wallpaper.EngineWindowPage> p0) {}
    public void removeColor(android.graphics.RectF p0) {}
}
