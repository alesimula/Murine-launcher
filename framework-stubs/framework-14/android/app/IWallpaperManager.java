package android.app;

public interface IWallpaperManager extends android.os.IInterface {
    public android.os.ParcelFileDescriptor setWallpaper(java.lang.String p0, java.lang.String p1, android.graphics.Rect p2, boolean p3, android.os.Bundle p4, int p5, android.app.IWallpaperManagerCallback p6, int p7) throws android.os.RemoteException;
    public void setWallpaperComponentChecked(android.content.ComponentName p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public void setWallpaperComponent(android.content.ComponentName p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public android.os.ParcelFileDescriptor getWallpaper(java.lang.String p0, android.app.IWallpaperManagerCallback p1, int p2, android.os.Bundle p3, int p4) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor getWallpaperWithFeature(java.lang.String p0, java.lang.String p1, android.app.IWallpaperManagerCallback p2, int p3, android.os.Bundle p4, int p5, boolean p6) throws android.os.RemoteException;
    public int getWallpaperIdForUser(int p0, int p1) throws android.os.RemoteException;
    public android.app.WallpaperInfo getWallpaperInfo(int p0) throws android.os.RemoteException;
    public android.app.WallpaperInfo getWallpaperInfoWithFlags(int p0, int p1) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor getWallpaperInfoFile(int p0) throws android.os.RemoteException;
    public void clearWallpaper(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean hasNamedWallpaper(java.lang.String p0) throws android.os.RemoteException;
    public void setDimensionHints(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public int getWidthHint(int p0) throws android.os.RemoteException;
    public int getHeightHint(int p0) throws android.os.RemoteException;
    public void setDisplayPadding(android.graphics.Rect p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public java.lang.String getName() throws android.os.RemoteException;
    public void settingsRestored() throws android.os.RemoteException;
    public boolean isWallpaperSupported(java.lang.String p0) throws android.os.RemoteException;
    public boolean isSetWallpaperAllowed(java.lang.String p0) throws android.os.RemoteException;
    public boolean isWallpaperBackupEligible(int p0, int p1) throws android.os.RemoteException;
    public boolean setLockWallpaperCallback(android.app.IWallpaperManagerCallback p0) throws android.os.RemoteException;
    public android.app.WallpaperColors getWallpaperColors(int p0, int p1, int p2) throws android.os.RemoteException;
    public void removeOnLocalColorsChangedListener(android.app.ILocalWallpaperColorConsumer p0, java.util.List<android.graphics.RectF> p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void addOnLocalColorsChangedListener(android.app.ILocalWallpaperColorConsumer p0, java.util.List<android.graphics.RectF> p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void registerWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException;
    public void unregisterWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException;
    public void setInAmbientMode(boolean p0, long p1) throws android.os.RemoteException;
    public void notifyWakingUp(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void notifyGoingToSleep(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER_DIM_AMOUNT")
    public void setWallpaperDimAmount(float p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SET_WALLPAPER_DIM_AMOUNT")
    public float getWallpaperDimAmount() throws android.os.RemoteException;
    public boolean lockScreenWallpaperExists() throws android.os.RemoteException;
    public boolean isStaticWallpaper(int p0) throws android.os.RemoteException;
    public boolean isLockscreenLiveWallpaperEnabled() throws android.os.RemoteException;
    public boolean isMultiCropEnabled() throws android.os.RemoteException;

    public static class Default implements android.app.IWallpaperManager {
        public Default() {}
        public android.os.ParcelFileDescriptor setWallpaper(java.lang.String p0, java.lang.String p1, android.graphics.Rect p2, boolean p3, android.os.Bundle p4, int p5, android.app.IWallpaperManagerCallback p6, int p7) throws android.os.RemoteException { return null; }
        public void setWallpaperComponentChecked(android.content.ComponentName p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
        public void setWallpaperComponent(android.content.ComponentName p0) throws android.os.RemoteException {}
        public android.os.ParcelFileDescriptor getWallpaper(java.lang.String p0, android.app.IWallpaperManagerCallback p1, int p2, android.os.Bundle p3, int p4) throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor getWallpaperWithFeature(java.lang.String p0, java.lang.String p1, android.app.IWallpaperManagerCallback p2, int p3, android.os.Bundle p4, int p5, boolean p6) throws android.os.RemoteException { return null; }
        public int getWallpaperIdForUser(int p0, int p1) throws android.os.RemoteException { return 0; }
        public android.app.WallpaperInfo getWallpaperInfo(int p0) throws android.os.RemoteException { return null; }
        public android.app.WallpaperInfo getWallpaperInfoWithFlags(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor getWallpaperInfoFile(int p0) throws android.os.RemoteException { return null; }
        public void clearWallpaper(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public boolean hasNamedWallpaper(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setDimensionHints(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public int getWidthHint(int p0) throws android.os.RemoteException { return 0; }
        public int getHeightHint(int p0) throws android.os.RemoteException { return 0; }
        public void setDisplayPadding(android.graphics.Rect p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public java.lang.String getName() throws android.os.RemoteException { return null; }
        public void settingsRestored() throws android.os.RemoteException {}
        public boolean isWallpaperSupported(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isSetWallpaperAllowed(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isWallpaperBackupEligible(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean setLockWallpaperCallback(android.app.IWallpaperManagerCallback p0) throws android.os.RemoteException { return false; }
        public android.app.WallpaperColors getWallpaperColors(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public void removeOnLocalColorsChangedListener(android.app.ILocalWallpaperColorConsumer p0, java.util.List<android.graphics.RectF> p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void addOnLocalColorsChangedListener(android.app.ILocalWallpaperColorConsumer p0, java.util.List<android.graphics.RectF> p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void registerWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException {}
        public void unregisterWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException {}
        public void setInAmbientMode(boolean p0, long p1) throws android.os.RemoteException {}
        public void notifyWakingUp(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void notifyGoingToSleep(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void setWallpaperDimAmount(float p0) throws android.os.RemoteException {}
        public float getWallpaperDimAmount() throws android.os.RemoteException { return 0.0f; }
        public boolean lockScreenWallpaperExists() throws android.os.RemoteException { return false; }
        public boolean isStaticWallpaper(int p0) throws android.os.RemoteException { return false; }
        public boolean isLockscreenLiveWallpaperEnabled() throws android.os.RemoteException { return false; }
        public boolean isMultiCropEnabled() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IWallpaperManager {
        public static final java.lang.String DESCRIPTOR = "android.app.IWallpaperManager";
        static final int TRANSACTION_setWallpaper = 1;
        static final int TRANSACTION_setWallpaperComponentChecked = 2;
        static final int TRANSACTION_setWallpaperComponent = 3;
        static final int TRANSACTION_getWallpaper = 4;
        static final int TRANSACTION_getWallpaperWithFeature = 5;
        static final int TRANSACTION_getWallpaperIdForUser = 6;
        static final int TRANSACTION_getWallpaperInfo = 7;
        static final int TRANSACTION_getWallpaperInfoWithFlags = 8;
        static final int TRANSACTION_getWallpaperInfoFile = 9;
        static final int TRANSACTION_clearWallpaper = 10;
        static final int TRANSACTION_hasNamedWallpaper = 11;
        static final int TRANSACTION_setDimensionHints = 12;
        static final int TRANSACTION_getWidthHint = 13;
        static final int TRANSACTION_getHeightHint = 14;
        static final int TRANSACTION_setDisplayPadding = 15;
        static final int TRANSACTION_getName = 16;
        static final int TRANSACTION_settingsRestored = 17;
        static final int TRANSACTION_isWallpaperSupported = 18;
        static final int TRANSACTION_isSetWallpaperAllowed = 19;
        static final int TRANSACTION_isWallpaperBackupEligible = 20;
        static final int TRANSACTION_setLockWallpaperCallback = 21;
        static final int TRANSACTION_getWallpaperColors = 22;
        static final int TRANSACTION_removeOnLocalColorsChangedListener = 23;
        static final int TRANSACTION_addOnLocalColorsChangedListener = 24;
        static final int TRANSACTION_registerWallpaperColorsCallback = 25;
        static final int TRANSACTION_unregisterWallpaperColorsCallback = 26;
        static final int TRANSACTION_setInAmbientMode = 27;
        static final int TRANSACTION_notifyWakingUp = 28;
        static final int TRANSACTION_notifyGoingToSleep = 29;
        static final int TRANSACTION_setWallpaperDimAmount = 30;
        static final int TRANSACTION_getWallpaperDimAmount = 31;
        static final int TRANSACTION_lockScreenWallpaperExists = 32;
        static final int TRANSACTION_isStaticWallpaper = 33;
        static final int TRANSACTION_isLockscreenLiveWallpaperEnabled = 34;
        static final int TRANSACTION_isMultiCropEnabled = 35;
        public Stub() { super(); }
        public static android.app.IWallpaperManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.IWallpaperManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.ParcelFileDescriptor setWallpaper(java.lang.String p0, java.lang.String p1, android.graphics.Rect p2, boolean p3, android.os.Bundle p4, int p5, android.app.IWallpaperManagerCallback p6, int p7) throws android.os.RemoteException { return null; }
            public void setWallpaperComponentChecked(android.content.ComponentName p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
            public void setWallpaperComponent(android.content.ComponentName p0) throws android.os.RemoteException {}
            public android.os.ParcelFileDescriptor getWallpaper(java.lang.String p0, android.app.IWallpaperManagerCallback p1, int p2, android.os.Bundle p3, int p4) throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor getWallpaperWithFeature(java.lang.String p0, java.lang.String p1, android.app.IWallpaperManagerCallback p2, int p3, android.os.Bundle p4, int p5, boolean p6) throws android.os.RemoteException { return null; }
            public int getWallpaperIdForUser(int p0, int p1) throws android.os.RemoteException { return 0; }
            public android.app.WallpaperInfo getWallpaperInfo(int p0) throws android.os.RemoteException { return null; }
            public android.app.WallpaperInfo getWallpaperInfoWithFlags(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor getWallpaperInfoFile(int p0) throws android.os.RemoteException { return null; }
            public void clearWallpaper(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public boolean hasNamedWallpaper(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setDimensionHints(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public int getWidthHint(int p0) throws android.os.RemoteException { return 0; }
            public int getHeightHint(int p0) throws android.os.RemoteException { return 0; }
            public void setDisplayPadding(android.graphics.Rect p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public java.lang.String getName() throws android.os.RemoteException { return null; }
            public void settingsRestored() throws android.os.RemoteException {}
            public boolean isWallpaperSupported(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isSetWallpaperAllowed(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isWallpaperBackupEligible(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean setLockWallpaperCallback(android.app.IWallpaperManagerCallback p0) throws android.os.RemoteException { return false; }
            public android.app.WallpaperColors getWallpaperColors(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public void removeOnLocalColorsChangedListener(android.app.ILocalWallpaperColorConsumer p0, java.util.List<android.graphics.RectF> p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void addOnLocalColorsChangedListener(android.app.ILocalWallpaperColorConsumer p0, java.util.List<android.graphics.RectF> p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void registerWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException {}
            public void unregisterWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException {}
            public void setInAmbientMode(boolean p0, long p1) throws android.os.RemoteException {}
            public void notifyWakingUp(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void notifyGoingToSleep(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void setWallpaperDimAmount(float p0) throws android.os.RemoteException {}
            public float getWallpaperDimAmount() throws android.os.RemoteException { return 0.0f; }
            public boolean lockScreenWallpaperExists() throws android.os.RemoteException { return false; }
            public boolean isStaticWallpaper(int p0) throws android.os.RemoteException { return false; }
            public boolean isLockscreenLiveWallpaperEnabled() throws android.os.RemoteException { return false; }
            public boolean isMultiCropEnabled() throws android.os.RemoteException { return false; }
        }
    }
}
