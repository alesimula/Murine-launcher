package android.service.wallpaper;

public interface IWallpaperService extends android.os.IInterface {
    public void attach(android.service.wallpaper.IWallpaperConnection p0, android.os.IBinder p1, int p2, boolean p3, int p4, int p5, android.graphics.Rect p6, int p7) throws android.os.RemoteException;
    public void detach() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.wallpaper.IWallpaperService {
        private static final java.lang.String DESCRIPTOR = "android.service.wallpaper.IWallpaperService";
        static final int TRANSACTION_attach = 1;
        static final int TRANSACTION_detach = 2;
        public Stub() { super(); }
        public static android.service.wallpaper.IWallpaperService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.wallpaper.IWallpaperService p0) { return false; }
        public static android.service.wallpaper.IWallpaperService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.wallpaper.IWallpaperService {
            private android.os.IBinder mRemote;
            public static android.service.wallpaper.IWallpaperService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void attach(android.service.wallpaper.IWallpaperConnection p0, android.os.IBinder p1, int p2, boolean p3, int p4, int p5, android.graphics.Rect p6, int p7) throws android.os.RemoteException {}
            public void detach() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.service.wallpaper.IWallpaperService {
        public Default() {}
        public void attach(android.service.wallpaper.IWallpaperConnection p0, android.os.IBinder p1, int p2, boolean p3, int p4, int p5, android.graphics.Rect p6, int p7) throws android.os.RemoteException {}
        public void detach() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
