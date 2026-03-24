package android.app;

public class WallpaperManager {
    static final long RETURN_DEFAULT_ON_SECURITY_EXCEPTION = 239784307L;
    static final long THROW_ON_SECURITY_EXCEPTION = 237508058L;
    public static final java.lang.String ACTION_CROP_AND_SET_WALLPAPER = "android.service.wallpaper.CROP_AND_SET_WALLPAPER";
    public static final java.lang.String ACTION_LIVE_WALLPAPER_CHOOSER = "android.service.wallpaper.LIVE_WALLPAPER_CHOOSER";
    public static final java.lang.String ACTION_CHANGE_LIVE_WALLPAPER = "android.service.wallpaper.CHANGE_LIVE_WALLPAPER";
    public static final java.lang.String EXTRA_LIVE_WALLPAPER_COMPONENT = "android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT";
    public static final java.lang.String WALLPAPER_PREVIEW_META_DATA = "android.wallpaper.preview";
    public static final java.lang.String COMMAND_TAP = "android.wallpaper.tap";
    public static final java.lang.String COMMAND_SECONDARY_TAP = "android.wallpaper.secondaryTap";
    public static final java.lang.String COMMAND_DROP = "android.home.drop";
    public static final java.lang.String COMMAND_WAKING_UP = "android.wallpaper.wakingup";
    public static final java.lang.String COMMAND_KEYGUARD_GOING_AWAY = "android.wallpaper.keyguardgoingaway";
    public static final java.lang.String COMMAND_GOING_TO_SLEEP = "android.wallpaper.goingtosleep";
    public static final java.lang.String COMMAND_DISPLAY_SWITCH = "android.wallpaper.displayswitch";
    public static final java.lang.String COMMAND_REAPPLY = "android.wallpaper.reapply";
    public static final java.lang.String COMMAND_FREEZE = "android.wallpaper.freeze";
    public static final java.lang.String COMMAND_UNFREEZE = "android.wallpaper.unfreeze";
    public static final java.lang.String EXTRA_NEW_WALLPAPER_ID = "android.service.wallpaper.extra.ID";
    public static final java.lang.String EXTRA_FROM_FOREGROUND_APP = "android.service.wallpaper.extra.FROM_FOREGROUND_APP";
    public static final int ORIENTATION_UNKNOWN = -1;
    public static final int PORTRAIT = 0;
    public static final int LANDSCAPE = 1;
    public static final int SQUARE_PORTRAIT = 2;
    public static final int SQUARE_LANDSCAPE = 3;
    public static final int FLAG_SYSTEM = 1;
    public static final int FLAG_LOCK = 2;
    public static int getOrientation(android.graphics.Point p0) { return 0; }
    public static int getRotatedOrientation(int p0) { return 0; }
    static void initGlobals(android.app.IWallpaperManager p0, android.os.Looper p1) {}
    WallpaperManager(android.app.IWallpaperManager p0, android.content.Context p1, android.os.Handler p2) {}
    WallpaperManager() {}
    public static android.app.WallpaperManager getInstance(android.content.Context p0) { return null; }
    public android.app.IWallpaperManager getIWallpaperManager() { return null; }
    public boolean isLockscreenLiveWallpaperEnabled() { return false; }
    public static boolean isMultiCropEnabled() { return false; }
    public boolean shouldEnableWideColorGamut() { return false; }
    @android.annotation.Nullable
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.READ_WALLPAPER_INTERNAL"})
    public android.graphics.drawable.Drawable getDrawable() { return null; }
    @android.annotation.Nullable
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.READ_WALLPAPER_INTERNAL"})
    public android.graphics.drawable.Drawable getDrawable(int p0) { return null; }
    public android.graphics.drawable.Drawable getBuiltInDrawable() { return null; }
    public android.graphics.drawable.Drawable getBuiltInDrawable(int p0) { return null; }
    public android.graphics.drawable.Drawable getBuiltInDrawable(int p0, int p1, boolean p2, float p3, float p4) { return null; }
    public android.graphics.drawable.Drawable getBuiltInDrawable(int p0, int p1, boolean p2, float p3, float p4, int p5) { return null; }
    @android.annotation.Nullable
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.READ_WALLPAPER_INTERNAL"})
    public android.graphics.drawable.Drawable peekDrawable() { return null; }
    @android.annotation.Nullable
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.READ_WALLPAPER_INTERNAL"})
    public android.graphics.drawable.Drawable peekDrawable(int p0) { return null; }
    @android.annotation.Nullable
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.READ_WALLPAPER_INTERNAL"})
    public android.graphics.drawable.Drawable getFastDrawable() { return null; }
    @android.annotation.Nullable
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.READ_WALLPAPER_INTERNAL"})
    public android.graphics.drawable.Drawable getFastDrawable(int p0) { return null; }
    @android.annotation.Nullable
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.READ_WALLPAPER_INTERNAL"})
    public android.graphics.drawable.Drawable peekFastDrawable() { return null; }
    @android.annotation.Nullable
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.READ_WALLPAPER_INTERNAL"})
    public android.graphics.drawable.Drawable peekFastDrawable(int p0) { return null; }
    public boolean wallpaperSupportsWcg(int p0) { return false; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getBitmap() { return null; }
    public android.graphics.Bitmap getBitmap(boolean p0) { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getBitmap(boolean p0, int p1) { return null; }
    public android.graphics.Bitmap getBitmapAsUser(int p0, boolean p1) { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getBitmapAsUser(int p0, boolean p1, int p2) { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getBitmapAsUser(int p0, boolean p1, int p2, boolean p3) { return null; }
    @android.annotation.Nullable
    public android.graphics.Rect peekBitmapDimensions() { return null; }
    @android.annotation.Nullable
    public android.graphics.Rect peekBitmapDimensions(int p0) { return null; }
    @android.annotation.Nullable
    public android.graphics.Rect peekBitmapDimensions(int p0, boolean p1) { return null; }
    @android.annotation.FlaggedApi("com.android.window.flags.multi_crop")
    @android.annotation.RequiresPermission("android.permission.READ_WALLPAPER_INTERNAL")
    @android.annotation.Nullable
    public java.util.List<android.graphics.Rect> getBitmapCrops(java.util.List<android.graphics.Point> p0, int p1, boolean p2) { return null; }
    @android.annotation.FlaggedApi("com.android.window.flags.multi_crop")
    @android.annotation.Nullable
    public java.util.List<android.graphics.Rect> getBitmapCrops(android.graphics.Point p0, java.util.List<android.graphics.Point> p1, java.util.Map<android.graphics.Point, android.graphics.Rect> p2) { return null; }
    @android.annotation.FlaggedApi("com.android.window.flags.multi_crop")
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER_DIM_AMOUNT")
    @android.annotation.Nullable
    public android.app.WallpaperColors getWallpaperColors(android.graphics.Bitmap p0, java.util.Map<android.graphics.Point, android.graphics.Rect> p1) { return null; }
    @android.annotation.Nullable
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.READ_WALLPAPER_INTERNAL"})
    public android.os.ParcelFileDescriptor getWallpaperFile(int p0) { return null; }
    public void addOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, android.os.Handler p1) {}
    public void addOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, android.os.Handler p1, int p2) {}
    public void removeOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0) {}
    public void removeOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, int p1) {}
    @android.annotation.Nullable
    public android.app.WallpaperColors getWallpaperColors(int p0) { return null; }
    @android.annotation.Nullable
    public android.app.WallpaperColors getWallpaperColors(int p0, int p1) { return null; }
    public void addOnColorsChangedListener(android.app.WallpaperManager.LocalWallpaperColorConsumer p0, java.util.List<android.graphics.RectF> p1, int p2) throws java.lang.IllegalArgumentException {}
    public void removeOnColorsChangedListener(android.app.WallpaperManager.LocalWallpaperColorConsumer p0) {}
    public android.os.ParcelFileDescriptor getWallpaperFile(int p0, int p1) { return null; }
    @android.annotation.Nullable
    public android.os.ParcelFileDescriptor getWallpaperFile(int p0, boolean p1) { return null; }
    public void forgetLoadedWallpaper() {}
    @android.annotation.RequiresPermission(value="QUERY_ALL_PACKAGES", conditional=true)
    public android.app.WallpaperInfo getWallpaperInfo() { return null; }
    public android.app.WallpaperInfo getWallpaperInfoForUser(int p0) { return null; }
    @android.annotation.Nullable
    public android.app.WallpaperInfo getWallpaperInfo(int p0) { return null; }
    public android.app.WallpaperInfo getWallpaperInfo(int p0, int p1) { return null; }
    @android.annotation.Nullable
    public android.os.ParcelFileDescriptor getWallpaperInfoFile() { return null; }
    public int getWallpaperId(int p0) { return 0; }
    public int getWallpaperIdForUser(int p0, int p1) { return 0; }
    public android.content.Intent getCropAndSetWallpaperIntent(android.net.Uri p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER")
    public void setResource(int p0) throws java.io.IOException {}
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER")
    public int setResource(int p0, int p1) throws java.io.IOException { return 0; }
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER")
    public void setBitmap(android.graphics.Bitmap p0) throws java.io.IOException {}
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER")
    public int setBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, boolean p2) throws java.io.IOException { return 0; }
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER")
    public int setBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, boolean p2, int p3) throws java.io.IOException { return 0; }
    public int setBitmap(android.graphics.Bitmap p0, android.graphics.Rect p1, boolean p2, int p3, int p4) throws java.io.IOException { return 0; }
    @android.annotation.FlaggedApi("com.android.window.flags.multi_crop")
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER")
    public int setBitmapWithCrops(android.graphics.Bitmap p0, java.util.Map<android.graphics.Point, android.graphics.Rect> p1, boolean p2, int p3) throws java.io.IOException { return 0; }
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER")
    public void setStream(java.io.InputStream p0) throws java.io.IOException {}
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER")
    public int setStream(java.io.InputStream p0, android.graphics.Rect p1, boolean p2) throws java.io.IOException { return 0; }
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER")
    public int setStream(java.io.InputStream p0, android.graphics.Rect p1, boolean p2, int p3) throws java.io.IOException { return 0; }
    @android.annotation.FlaggedApi("com.android.window.flags.multi_crop")
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER")
    public int setStreamWithCrops(java.io.InputStream p0, java.util.Map<android.graphics.Point, android.graphics.Rect> p1, boolean p2, int p3) throws java.io.IOException { return 0; }
    @android.annotation.FlaggedApi("com.android.window.flags.multi_crop")
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER")
    public int setStreamWithCrops(java.io.InputStream p0, android.util.SparseArray<android.graphics.Rect> p1, boolean p2, int p3) throws java.io.IOException { return 0; }
    public boolean hasResourceWallpaper(int p0) { return false; }
    public int getDesiredMinimumWidth() { return 0; }
    public int getDesiredMinimumHeight() { return 0; }
    public void suggestDesiredDimensions(int p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER_HINTS")
    public void setDisplayPadding(android.graphics.Rect p0) {}
    @android.annotation.SystemApi
    public void setDisplayOffset(android.os.IBinder p0, int p1, int p2) {}
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER")
    public void clearWallpaper() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS_FULL")
    public void clearWallpaper(int p0, int p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER_COMPONENT")
    public boolean setWallpaperComponent(android.content.ComponentName p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER_DIM_AMOUNT")
    public void setWallpaperDimAmount(float p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER_DIM_AMOUNT")
    public float getWallpaperDimAmount() { return 0.0f; }
    public boolean lockScreenWallpaperExists() { return false; }
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER_COMPONENT")
    public boolean setWallpaperComponent(android.content.ComponentName p0, int p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER_COMPONENT")
    public boolean setWallpaperComponentWithFlags(android.content.ComponentName p0, int p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER_COMPONENT")
    public boolean setWallpaperComponentWithFlags(android.content.ComponentName p0, int p1, int p2) { return false; }
    public void setWallpaperOffsets(android.os.IBinder p0, float p1, float p2) {}
    public void setWallpaperOffsetSteps(float p0, float p1) {}
    @android.annotation.RequiresPermission(value="android.permission.ALWAYS_UPDATE_WALLPAPER", conditional=true)
    public void sendWallpaperCommand(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, android.os.Bundle p5) {}
    public void setWallpaperZoomOut(android.os.IBinder p0, float p1) {}
    public boolean isWallpaperSupported() { return false; }
    public boolean isSetWallpaperAllowed() { return false; }
    public void clearWallpaperOffsets(android.os.IBinder p0) {}
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER")
    public void clear() throws java.io.IOException {}
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER")
    public void clear(int p0) throws java.io.IOException {}
    public static java.io.InputStream openDefaultWallpaper(android.content.Context p0, int p1) { return null; }
    public static android.content.ComponentName getDefaultWallpaperComponent(android.content.Context p0) { return null; }
    public static android.content.ComponentName getCmfDefaultWallpaperComponent(android.content.Context p0) { return null; }
    public boolean isWallpaperBackupEligible(int p0) { return false; }
    public android.app.WallpaperManager.ColorManagementProxy getColorManagementProxy() { return null; }

    private static class CachedWallpaper {
        final android.graphics.Bitmap mCachedWallpaper = null;
        final int mCachedWallpaperUserId = 0;
        final int mWhich = 0;
        CachedWallpaper(android.graphics.Bitmap p0, int p1, int p2) {}
        boolean isValid(int p0, int p1) { return false; }
    }

    public static class ColorManagementProxy {
        public ColorManagementProxy(android.content.Context p0) {}
        @android.annotation.NonNull
        public java.util.Set<android.graphics.ColorSpace> getSupportedColorSpaces() { return null; }
        boolean isSupportedColorSpace(android.graphics.ColorSpace p0) { return false; }
        void doColorManagement(android.graphics.ImageDecoder p0, android.graphics.ImageDecoder.ImageInfo p1) {}
    }

    static class FastBitmapDrawable extends android.graphics.drawable.Drawable {
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

    private static class Globals extends android.app.IWallpaperManagerCallback.Stub {
        Globals(android.app.IWallpaperManager p0, android.os.Looper p1) { super(); }
        public void onWallpaperChanged() {}
        public void addOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, android.os.Handler p1, int p2, int p3) {}
        public void addOnColorsChangedListener(android.app.WallpaperManager.LocalWallpaperColorConsumer p0, java.util.List<android.graphics.RectF> p1, int p2, int p3, int p4) {}
        public void removeOnColorsChangedListener(android.app.WallpaperManager.LocalWallpaperColorConsumer p0, int p1, int p2, int p3) {}
        public void removeOnColorsChangedListener(android.app.WallpaperManager.OnColorsChangedListener p0, int p1, int p2) {}
        public void onWallpaperColorsChanged(android.app.WallpaperColors p0, int p1, int p2) {}
        android.app.WallpaperColors getWallpaperColors(int p0, int p1, int p2) { return null; }
        public android.graphics.Bitmap peekWallpaperBitmap(android.content.Context p0, boolean p1, int p2, android.app.WallpaperManager.ColorManagementProxy p3) { return null; }
        public android.graphics.Bitmap peekWallpaperBitmap(android.content.Context p0, boolean p1, int p2, int p3, boolean p4, android.app.WallpaperManager.ColorManagementProxy p5) { return null; }
        @android.annotation.Nullable
        public android.graphics.Rect peekWallpaperDimensions(android.content.Context p0, boolean p1, int p2, int p3) { return null; }
        void forgetLoadedWallpaper() {}
    }

    public static interface LocalWallpaperColorConsumer {
        public void onColorsChanged(android.graphics.RectF p0, android.app.WallpaperColors p1);
    }

    public static interface OnColorsChangedListener {
        public void onColorsChanged(android.app.WallpaperColors p0, int p1);
        default public void onColorsChanged(android.app.WallpaperColors p0, int p1, int p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScreenOrientation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SetWallpaperFlags {
    }

    private class WallpaperSetCompletion extends android.app.IWallpaperManagerCallback.Stub {
        final java.util.concurrent.CountDownLatch mLatch = null;
        public WallpaperSetCompletion(android.app.WallpaperManager p0) { super(); }
        public void waitForCompletion() {}
        public void onWallpaperChanged() throws android.os.RemoteException {}
        public void onWallpaperColorsChanged(android.app.WallpaperColors p0, int p1, int p2) throws android.os.RemoteException {}
    }
}
