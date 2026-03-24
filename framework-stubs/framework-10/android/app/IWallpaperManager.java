package android.app;

public interface IWallpaperManager extends android.os.IInterface {
    public android.os.ParcelFileDescriptor setWallpaper(java.lang.String p0, java.lang.String p1, android.graphics.Rect p2, boolean p3, android.os.Bundle p4, int p5, android.app.IWallpaperManagerCallback p6, int p7) throws android.os.RemoteException;
    public void setWallpaperComponentChecked(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setWallpaperComponent(android.content.ComponentName p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.os.ParcelFileDescriptor getWallpaper(java.lang.String p0, android.app.IWallpaperManagerCallback p1, int p2, android.os.Bundle p3, int p4) throws android.os.RemoteException;
    public int getWallpaperIdForUser(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.app.WallpaperInfo getWallpaperInfo(int p0) throws android.os.RemoteException;
    public void clearWallpaper(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean hasNamedWallpaper(java.lang.String p0) throws android.os.RemoteException;
    public void setDimensionHints(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getWidthHint(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getHeightHint(int p0) throws android.os.RemoteException;
    public void setDisplayPadding(android.graphics.Rect p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public java.lang.String getName() throws android.os.RemoteException;
    public void settingsRestored() throws android.os.RemoteException;
    public boolean isWallpaperSupported(java.lang.String p0) throws android.os.RemoteException;
    public boolean isSetWallpaperAllowed(java.lang.String p0) throws android.os.RemoteException;
    public boolean isWallpaperBackupEligible(int p0, int p1) throws android.os.RemoteException;
    public boolean setLockWallpaperCallback(android.app.IWallpaperManagerCallback p0) throws android.os.RemoteException;
    public android.app.WallpaperColors getWallpaperColors(int p0, int p1, int p2) throws android.os.RemoteException;
    public void registerWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException;
    public void unregisterWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException;
    public void setInAmbientMode(boolean p0, long p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.IWallpaperManager {
        private static final java.lang.String DESCRIPTOR = "android.app.IWallpaperManager";
        static final int TRANSACTION_setWallpaper = 1;
        static final int TRANSACTION_setWallpaperComponentChecked = 2;
        static final int TRANSACTION_setWallpaperComponent = 3;
        static final int TRANSACTION_getWallpaper = 4;
        static final int TRANSACTION_getWallpaperIdForUser = 5;
        static final int TRANSACTION_getWallpaperInfo = 6;
        static final int TRANSACTION_clearWallpaper = 7;
        static final int TRANSACTION_hasNamedWallpaper = 8;
        static final int TRANSACTION_setDimensionHints = 9;
        static final int TRANSACTION_getWidthHint = 10;
        static final int TRANSACTION_getHeightHint = 11;
        static final int TRANSACTION_setDisplayPadding = 12;
        static final int TRANSACTION_getName = 13;
        static final int TRANSACTION_settingsRestored = 14;
        static final int TRANSACTION_isWallpaperSupported = 15;
        static final int TRANSACTION_isSetWallpaperAllowed = 16;
        static final int TRANSACTION_isWallpaperBackupEligible = 17;
        static final int TRANSACTION_setLockWallpaperCallback = 18;
        static final int TRANSACTION_getWallpaperColors = 19;
        static final int TRANSACTION_registerWallpaperColorsCallback = 20;
        static final int TRANSACTION_unregisterWallpaperColorsCallback = 21;
        static final int TRANSACTION_setInAmbientMode = 22;
        public Stub() { super(); }
        public static android.app.IWallpaperManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IWallpaperManager p0) { return false; }
        public static android.app.IWallpaperManager getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IWallpaperManager {
            private android.os.IBinder mRemote;
            public static android.app.IWallpaperManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.ParcelFileDescriptor setWallpaper(java.lang.String p0, java.lang.String p1, android.graphics.Rect p2, boolean p3, android.os.Bundle p4, int p5, android.app.IWallpaperManagerCallback p6, int p7) throws android.os.RemoteException { return null; }
            public void setWallpaperComponentChecked(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setWallpaperComponent(android.content.ComponentName p0) throws android.os.RemoteException {}
            public android.os.ParcelFileDescriptor getWallpaper(java.lang.String p0, android.app.IWallpaperManagerCallback p1, int p2, android.os.Bundle p3, int p4) throws android.os.RemoteException { return null; }
            public int getWallpaperIdForUser(int p0, int p1) throws android.os.RemoteException { return 0; }
            public android.app.WallpaperInfo getWallpaperInfo(int p0) throws android.os.RemoteException { return null; }
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
            public void registerWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException {}
            public void unregisterWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException {}
            public void setInAmbientMode(boolean p0, long p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.app.IWallpaperManager {
        public Default() {}
        public android.os.ParcelFileDescriptor setWallpaper(java.lang.String p0, java.lang.String p1, android.graphics.Rect p2, boolean p3, android.os.Bundle p4, int p5, android.app.IWallpaperManagerCallback p6, int p7) throws android.os.RemoteException { return null; }
        public void setWallpaperComponentChecked(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setWallpaperComponent(android.content.ComponentName p0) throws android.os.RemoteException {}
        public android.os.ParcelFileDescriptor getWallpaper(java.lang.String p0, android.app.IWallpaperManagerCallback p1, int p2, android.os.Bundle p3, int p4) throws android.os.RemoteException { return null; }
        public int getWallpaperIdForUser(int p0, int p1) throws android.os.RemoteException { return 0; }
        public android.app.WallpaperInfo getWallpaperInfo(int p0) throws android.os.RemoteException { return null; }
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
        public void registerWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException {}
        public void unregisterWallpaperColorsCallback(android.app.IWallpaperManagerCallback p0, int p1, int p2) throws android.os.RemoteException {}
        public void setInAmbientMode(boolean p0, long p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
