package android.app;

public interface IWallpaperManagerCallback extends android.os.IInterface {
    public void onWallpaperChanged() throws android.os.RemoteException;
    public void onWallpaperColorsChanged(android.app.WallpaperColors p0, int p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.app.IWallpaperManagerCallback {
        public Default() {}
        public void onWallpaperChanged() throws android.os.RemoteException {}
        public void onWallpaperColorsChanged(android.app.WallpaperColors p0, int p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IWallpaperManagerCallback {
        private static final java.lang.String DESCRIPTOR = "android.app.IWallpaperManagerCallback";
        static final int TRANSACTION_onWallpaperChanged = 1;
        static final int TRANSACTION_onWallpaperColorsChanged = 2;
        public Stub() { super(); }
        public static android.app.IWallpaperManagerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IWallpaperManagerCallback p0) { return false; }
        public static android.app.IWallpaperManagerCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IWallpaperManagerCallback {
            private android.os.IBinder mRemote;
            public static android.app.IWallpaperManagerCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onWallpaperChanged() throws android.os.RemoteException {}
            public void onWallpaperColorsChanged(android.app.WallpaperColors p0, int p1, int p2) throws android.os.RemoteException {}
        }
    }
}
