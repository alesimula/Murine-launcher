package android.service.wallpaper;

public interface IWallpaperEngine extends android.os.IInterface {
    public void setDesiredSize(int p0, int p1) throws android.os.RemoteException;
    public void setDisplayPadding(android.graphics.Rect p0) throws android.os.RemoteException;
    public void setVisibility(boolean p0) throws android.os.RemoteException;
    public void setInAmbientMode(boolean p0, long p1) throws android.os.RemoteException;
    public void dispatchPointer(android.view.MotionEvent p0) throws android.os.RemoteException;
    public void dispatchWallpaperCommand(java.lang.String p0, int p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException;
    public void requestWallpaperColors() throws android.os.RemoteException;
    public void destroy() throws android.os.RemoteException;
    public void setZoomOut(float p0) throws android.os.RemoteException;
    public void scalePreview(android.graphics.Rect p0) throws android.os.RemoteException;
    public void removeLocalColorsAreas(java.util.List<android.graphics.RectF> p0) throws android.os.RemoteException;
    public void addLocalColorsAreas(java.util.List<android.graphics.RectF> p0) throws android.os.RemoteException;
    public android.view.SurfaceControl mirrorSurfaceControl() throws android.os.RemoteException;

    public static class Default implements android.service.wallpaper.IWallpaperEngine {
        public Default() {}
        public void setDesiredSize(int p0, int p1) throws android.os.RemoteException {}
        public void setDisplayPadding(android.graphics.Rect p0) throws android.os.RemoteException {}
        public void setVisibility(boolean p0) throws android.os.RemoteException {}
        public void setInAmbientMode(boolean p0, long p1) throws android.os.RemoteException {}
        public void dispatchPointer(android.view.MotionEvent p0) throws android.os.RemoteException {}
        public void dispatchWallpaperCommand(java.lang.String p0, int p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public void requestWallpaperColors() throws android.os.RemoteException {}
        public void destroy() throws android.os.RemoteException {}
        public void setZoomOut(float p0) throws android.os.RemoteException {}
        public void scalePreview(android.graphics.Rect p0) throws android.os.RemoteException {}
        public void removeLocalColorsAreas(java.util.List<android.graphics.RectF> p0) throws android.os.RemoteException {}
        public void addLocalColorsAreas(java.util.List<android.graphics.RectF> p0) throws android.os.RemoteException {}
        public android.view.SurfaceControl mirrorSurfaceControl() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.wallpaper.IWallpaperEngine {
        public static final java.lang.String DESCRIPTOR = "android.service.wallpaper.IWallpaperEngine";
        static final int TRANSACTION_setDesiredSize = 1;
        static final int TRANSACTION_setDisplayPadding = 2;
        static final int TRANSACTION_setVisibility = 3;
        static final int TRANSACTION_setInAmbientMode = 4;
        static final int TRANSACTION_dispatchPointer = 5;
        static final int TRANSACTION_dispatchWallpaperCommand = 6;
        static final int TRANSACTION_requestWallpaperColors = 7;
        static final int TRANSACTION_destroy = 8;
        static final int TRANSACTION_setZoomOut = 9;
        static final int TRANSACTION_scalePreview = 10;
        static final int TRANSACTION_removeLocalColorsAreas = 11;
        static final int TRANSACTION_addLocalColorsAreas = 12;
        static final int TRANSACTION_mirrorSurfaceControl = 13;
        public Stub() { super(); }
        public static android.service.wallpaper.IWallpaperEngine asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.wallpaper.IWallpaperEngine p0) { return false; }
        public static android.service.wallpaper.IWallpaperEngine getDefaultImpl() { return null; }

        private static class Proxy implements android.service.wallpaper.IWallpaperEngine {
            private android.os.IBinder mRemote;
            public static android.service.wallpaper.IWallpaperEngine sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setDesiredSize(int p0, int p1) throws android.os.RemoteException {}
            public void setDisplayPadding(android.graphics.Rect p0) throws android.os.RemoteException {}
            public void setVisibility(boolean p0) throws android.os.RemoteException {}
            public void setInAmbientMode(boolean p0, long p1) throws android.os.RemoteException {}
            public void dispatchPointer(android.view.MotionEvent p0) throws android.os.RemoteException {}
            public void dispatchWallpaperCommand(java.lang.String p0, int p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public void requestWallpaperColors() throws android.os.RemoteException {}
            public void destroy() throws android.os.RemoteException {}
            public void setZoomOut(float p0) throws android.os.RemoteException {}
            public void scalePreview(android.graphics.Rect p0) throws android.os.RemoteException {}
            public void removeLocalColorsAreas(java.util.List<android.graphics.RectF> p0) throws android.os.RemoteException {}
            public void addLocalColorsAreas(java.util.List<android.graphics.RectF> p0) throws android.os.RemoteException {}
            public android.view.SurfaceControl mirrorSurfaceControl() throws android.os.RemoteException { return null; }
        }
    }
}
