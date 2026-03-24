package android.service.wallpaper;

public interface IWallpaperConnection extends android.os.IInterface {
    public void attachEngine(android.service.wallpaper.IWallpaperEngine p0, int p1) throws android.os.RemoteException;
    public void engineShown(android.service.wallpaper.IWallpaperEngine p0) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor setWallpaper(java.lang.String p0) throws android.os.RemoteException;
    public void onWallpaperColorsChanged(android.app.WallpaperColors p0, int p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.wallpaper.IWallpaperConnection {
        private static final java.lang.String DESCRIPTOR = "android.service.wallpaper.IWallpaperConnection";
        static final int TRANSACTION_attachEngine = 1;
        static final int TRANSACTION_engineShown = 2;
        static final int TRANSACTION_setWallpaper = 3;
        static final int TRANSACTION_onWallpaperColorsChanged = 4;
        public Stub() { super(); }
        public static android.service.wallpaper.IWallpaperConnection asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.wallpaper.IWallpaperConnection p0) { return false; }
        public static android.service.wallpaper.IWallpaperConnection getDefaultImpl() { return null; }

        private static class Proxy implements android.service.wallpaper.IWallpaperConnection {
            private android.os.IBinder mRemote;
            public static android.service.wallpaper.IWallpaperConnection sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void attachEngine(android.service.wallpaper.IWallpaperEngine p0, int p1) throws android.os.RemoteException {}
            public void engineShown(android.service.wallpaper.IWallpaperEngine p0) throws android.os.RemoteException {}
            public android.os.ParcelFileDescriptor setWallpaper(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void onWallpaperColorsChanged(android.app.WallpaperColors p0, int p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.service.wallpaper.IWallpaperConnection {
        public Default() {}
        public void attachEngine(android.service.wallpaper.IWallpaperEngine p0, int p1) throws android.os.RemoteException {}
        public void engineShown(android.service.wallpaper.IWallpaperEngine p0) throws android.os.RemoteException {}
        public android.os.ParcelFileDescriptor setWallpaper(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void onWallpaperColorsChanged(android.app.WallpaperColors p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
