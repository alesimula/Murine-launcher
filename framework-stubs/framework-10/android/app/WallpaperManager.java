package android.app;

public class WallpaperManager {
    private static java.lang.String TAG;
    private static boolean DEBUG;
    private float mWallpaperXStep;
    private float mWallpaperYStep;
    private static final java.lang.String PROP_WALLPAPER = "ro.config.wallpaper";
    private static final java.lang.String PROP_LOCK_WALLPAPER = "ro.config.lock_wallpaper";
    private static final java.lang.String PROP_WALLPAPER_COMPONENT = "ro.config.wallpaper_component";
    public static final java.lang.String ACTION_CROP_AND_SET_WALLPAPER = "android.service.wallpaper.CROP_AND_SET_WALLPAPER";
    public static final java.lang.String ACTION_LIVE_WALLPAPER_CHOOSER = "android.service.wallpaper.LIVE_WALLPAPER_CHOOSER";
    public static final java.lang.String ACTION_CHANGE_LIVE_WALLPAPER = "android.service.wallpaper.CHANGE_LIVE_WALLPAPER";
    public static final java.lang.String EXTRA_LIVE_WALLPAPER_COMPONENT = "android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT";
    public static final java.lang.String WALLPAPER_PREVIEW_META_DATA = "android.wallpaper.preview";
    public static final java.lang.String COMMAND_TAP = "android.wallpaper.tap";
    public static final java.lang.String COMMAND_SECONDARY_TAP = "android.wallpaper.secondaryTap";
    public static final java.lang.String COMMAND_DROP = "android.home.drop";
    public static final java.lang.String EXTRA_NEW_WALLPAPER_ID = "android.service.wallpaper.extra.ID";
    public static final int FLAG_SYSTEM = 1;
    public static final int FLAG_LOCK = 2;
    private final android.content.Context mContext = null;
    private static final java.lang.Object sSync = null;
    @android.annotation.UnsupportedAppUsage
    private static android.app.WallpaperManager.Globals sGlobals;
    static void initGlobals(android.app.IWallpaperManager p0, android.os.Looper p1) {}
    WallpaperManager(android.app.IWallpaperManager p0, android.content.Context p1, android.os.Handler p2) {}
    public static android.app.WallpaperManager getInstance(android.content.Context p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.app.IWallpaperManager getIWallpaperManager() { return null; }
    public android.graphics.drawable.Drawable getDrawable() { return null; }
    public android.graphics.drawable.Drawable getBuiltInDrawable() { return null; }
    public android.graphics.drawable.Drawable getBuiltInDrawable(int p0) { return null; }
    public android.graphics.drawable.Drawable getBuiltInDrawable(int p0, int p1, boolean p2, float p3, float p4) { return null; }
    public android.graphics.drawable.Drawable getBuiltInDrawable(int p0, int p1, boolean p2, float p3, float p4, int p5) { return null; }
    private static android.graphics.RectF getMaxCropRect(int p0, int p1, int p2, int p3, float p4, float p5) { return null; }
    public android.graphics.drawable.Drawable peekDrawable() { return null; }
    public android.graphics.drawable.Drawable getFastDrawable() { return null; }
    public android.graphics.drawable.Drawable peekFastDrawable() { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.graphics.Bitmap getBitmap() { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.graphics.Bitmap getBitmap(boolean p0) { return null; }
    public android.graphics.Bitmap getBitmapAsUser(int p0, boolean p1) { return null; }
    public android.os.ParcelFileDescriptor getWallpaperFile(int p0) { return null; }
    public void addOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, android.os.Handler p1) {}
    @android.annotation.UnsupportedAppUsage
    public void addOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, android.os.Handler p1, int p2) {}
    public void removeOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0) {}
    public void removeOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, int p1) {}
    public android.app.WallpaperColors getWallpaperColors(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.app.WallpaperColors getWallpaperColors(int p0, int p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.os.ParcelFileDescriptor getWallpaperFile(int p0, int p1) { return null; }
    public void forgetLoadedWallpaper() {}
    public android.app.WallpaperInfo getWallpaperInfo() { return null; }
    public android.app.WallpaperInfo getWallpaperInfo(int p0) { return null; }
    public int getWallpaperId(int p0) { return 0; }
    public int getWallpaperIdForUser(int p0, int p1) { return 0; }
    public android.content.Intent getCropAndSetWallpaperIntent(android.net.Uri p0) { return null; }
    public void setResource(int p0) throws java.io.IOException {}
    public int setResource(int p0, int p1) throws java.io.IOException { return 0; }
    public void setBitmap(android.graphics.Bitmap p0) throws java.io.IOException {}
    public int setBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, boolean p2) throws java.io.IOException { return 0; }
    public int setBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, boolean p2, int p3) throws java.io.IOException { return 0; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public int setBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, boolean p2, int p3, int p4) throws java.io.IOException { return 0; }
    private final void validateRect(android.graphics.Rect p0) {}
    public void setStream(java.io.InputStream p0) throws java.io.IOException {}
    private void copyStreamToWallpaperFile(java.io.InputStream p0, java.io.FileOutputStream p1) throws java.io.IOException {}
    public int setStream(java.io.InputStream p0, android.graphics.Rect p1, boolean p2) throws java.io.IOException { return 0; }
    public int setStream(java.io.InputStream p0, android.graphics.Rect p1, boolean p2, int p3) throws java.io.IOException { return 0; }
    public boolean hasResourceWallpaper(int p0) { return false; }
    public int getDesiredMinimumWidth() { return 0; }
    public int getDesiredMinimumHeight() { return 0; }
    public void suggestDesiredDimensions(int p0, int p1) {}
    public void setDisplayPadding(android.graphics.Rect p0) {}
    @android.annotation.SystemApi
    public void setDisplayOffset(android.os.IBinder p0, int p1, int p2) {}
    public void clearWallpaper() {}
    @android.annotation.SystemApi
    public void clearWallpaper(int p0, int p1) {}
    @android.annotation.SystemApi
    public boolean setWallpaperComponent(android.content.ComponentName p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean setWallpaperComponent(android.content.ComponentName p0, int p1) { return false; }
    public void setWallpaperOffsets(android.os.IBinder p0, float p1, float p2) {}
    public void setWallpaperOffsetSteps(float p0, float p1) {}
    public void sendWallpaperCommand(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, android.os.Bundle p5) {}
    public boolean isWallpaperSupported() { return false; }
    public boolean isSetWallpaperAllowed() { return false; }
    public void clearWallpaperOffsets(android.os.IBinder p0) {}
    public void clear() throws java.io.IOException {}
    public void clear(int p0) throws java.io.IOException {}
    @android.annotation.UnsupportedAppUsage
    public static java.io.InputStream openDefaultWallpaper(android.content.Context p0, int p1) { return null; }
    public static android.content.ComponentName getDefaultWallpaperComponent(android.content.Context p0) { return null; }
    public boolean setLockWallpaperCallback(android.app.IWallpaperManagerCallback p0) { return false; }
    public boolean isWallpaperBackupEligible(int p0) { return false; }

    private class WallpaperSetCompletion extends android.app.IWallpaperManagerCallback.Stub {
        final java.util.concurrent.CountDownLatch mLatch = null;
        public WallpaperSetCompletion(android.app.WallpaperManager p0) { super(); }
        public void waitForCompletion() {}
        public void onWallpaperChanged() throws android.os.RemoteException {}
        public void onWallpaperColorsChanged(android.app.WallpaperColors p0, int p1, int p2) throws android.os.RemoteException {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SetWallpaperFlags {
    }

    public static interface OnColorsChangedListener {
        public void onColorsChanged(android.app.WallpaperColors p0, int p1);
        default public void onColorsChanged(android.app.WallpaperColors p0, int p1, int p2) {}
    }

    private static class Globals extends android.app.IWallpaperManagerCallback.Stub {
        private final android.app.IWallpaperManager mService = null;
        private boolean mColorCallbackRegistered;
        private final java.util.ArrayList<android.util.Pair<android.app.WallpaperManager.OnColorsChangedListener, android.os.Handler>> mColorListeners = null;
        private android.graphics.Bitmap mCachedWallpaper;
        private int mCachedWallpaperUserId;
        private android.graphics.Bitmap mDefaultWallpaper;
        private android.os.Handler mMainLooperHandler;
        Globals(android.app.IWallpaperManager p0, android.os.Looper p1) { super(); }
        public void onWallpaperChanged() {}
        public void addOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, android.os.Handler p1, int p2, int p3) {}
        public void removeOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, int p1, int p2) {}
        public void onWallpaperColorsChanged(android.app.WallpaperColors p0, int p1, int p2) {}
        android.app.WallpaperColors getWallpaperColors(int p0, int p1, int p2) { return null; }
        public android.graphics.Bitmap peekWallpaperBitmap(android.content.Context p0, boolean p1, int p2) { return null; }
        public android.graphics.Bitmap peekWallpaperBitmap(android.content.Context p0, boolean p1, int p2, int p3, boolean p4) { return null; }
        void forgetLoadedWallpaper() {}
        private android.graphics.Bitmap getCurrentWallpaperLocked(android.content.Context p0, int p1, boolean p2) { return null; }
        private android.graphics.Bitmap getDefaultWallpaper(android.content.Context p0, int p1) { return null; }
    }

    static class FastBitmapDrawable extends android.graphics.drawable.Drawable {
        private final android.graphics.Bitmap mBitmap = null;
        private final int mWidth = 0;
        private final int mHeight = 0;
        private int mDrawLeft;
        private int mDrawTop;
        private final android.graphics.Paint mPaint = null;
        private FastBitmapDrawable(android.graphics.Bitmap p0) { super(); }
        public void draw(android.graphics.Canvas p0) {}
        public int getOpacity() { return 0; }
        public void setBounds(int p0, int p1, int p2, int p3) {}
        public void setAlpha(int p0) {}
        public void setColorFilter(android.graphics.ColorFilter p0) {}
        public void setDither(boolean p0) {}
        public void setFilterBitmap(boolean p0) {}
        public int getIntrinsicWidth() { return 0; }
        public int getIntrinsicHeight() { return 0; }
        public int getMinimumWidth() { return 0; }
        public int getMinimumHeight() { return 0; }
    }
}
