package android.view;

public interface IWindow extends android.os.IInterface {
    public void executeCommand(java.lang.String p0, java.lang.String p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException;
    public void resized(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4, android.graphics.Rect p5, boolean p6, android.util.MergedConfiguration p7, android.graphics.Rect p8, boolean p9, boolean p10, int p11, android.view.DisplayCutout.ParcelableWrapper p12) throws android.os.RemoteException;
    public void locationInParentDisplayChanged(android.graphics.Point p0) throws android.os.RemoteException;
    public void insetsChanged(android.view.InsetsState p0) throws android.os.RemoteException;
    public void insetsControlChanged(android.view.InsetsState p0, android.view.InsetsSourceControl[] p1) throws android.os.RemoteException;
    public void moved(int p0, int p1) throws android.os.RemoteException;
    public void dispatchAppVisibility(boolean p0) throws android.os.RemoteException;
    public void dispatchGetNewSurface() throws android.os.RemoteException;
    public void windowFocusChanged(boolean p0, boolean p1) throws android.os.RemoteException;
    public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException;
    public void dispatchWallpaperOffsets(float p0, float p1, float p2, float p3, boolean p4) throws android.os.RemoteException;
    public void dispatchWallpaperCommand(java.lang.String p0, int p1, int p2, int p3, android.os.Bundle p4, boolean p5) throws android.os.RemoteException;
    public void dispatchDragEvent(android.view.DragEvent p0) throws android.os.RemoteException;
    public void updatePointerIcon(float p0, float p1) throws android.os.RemoteException;
    public void dispatchSystemUiVisibilityChanged(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void dispatchWindowShown() throws android.os.RemoteException;
    public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException;
    public void dispatchPointerCaptureChanged(boolean p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.view.IWindow {
        private static final java.lang.String DESCRIPTOR = "android.view.IWindow";
        static final int TRANSACTION_executeCommand = 1;
        static final int TRANSACTION_resized = 2;
        static final int TRANSACTION_locationInParentDisplayChanged = 3;
        static final int TRANSACTION_insetsChanged = 4;
        static final int TRANSACTION_insetsControlChanged = 5;
        static final int TRANSACTION_moved = 6;
        static final int TRANSACTION_dispatchAppVisibility = 7;
        static final int TRANSACTION_dispatchGetNewSurface = 8;
        static final int TRANSACTION_windowFocusChanged = 9;
        static final int TRANSACTION_closeSystemDialogs = 10;
        static final int TRANSACTION_dispatchWallpaperOffsets = 11;
        static final int TRANSACTION_dispatchWallpaperCommand = 12;
        static final int TRANSACTION_dispatchDragEvent = 13;
        static final int TRANSACTION_updatePointerIcon = 14;
        static final int TRANSACTION_dispatchSystemUiVisibilityChanged = 15;
        static final int TRANSACTION_dispatchWindowShown = 16;
        static final int TRANSACTION_requestAppKeyboardShortcuts = 17;
        static final int TRANSACTION_dispatchPointerCaptureChanged = 18;
        public Stub() { super(); }
        public static android.view.IWindow asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IWindow p0) { return false; }
        public static android.view.IWindow getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IWindow {
            private android.os.IBinder mRemote;
            public static android.view.IWindow sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void executeCommand(java.lang.String p0, java.lang.String p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException {}
            public void resized(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4, android.graphics.Rect p5, boolean p6, android.util.MergedConfiguration p7, android.graphics.Rect p8, boolean p9, boolean p10, int p11, android.view.DisplayCutout.ParcelableWrapper p12) throws android.os.RemoteException {}
            public void locationInParentDisplayChanged(android.graphics.Point p0) throws android.os.RemoteException {}
            public void insetsChanged(android.view.InsetsState p0) throws android.os.RemoteException {}
            public void insetsControlChanged(android.view.InsetsState p0, android.view.InsetsSourceControl[] p1) throws android.os.RemoteException {}
            public void moved(int p0, int p1) throws android.os.RemoteException {}
            public void dispatchAppVisibility(boolean p0) throws android.os.RemoteException {}
            public void dispatchGetNewSurface() throws android.os.RemoteException {}
            public void windowFocusChanged(boolean p0, boolean p1) throws android.os.RemoteException {}
            public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException {}
            public void dispatchWallpaperOffsets(float p0, float p1, float p2, float p3, boolean p4) throws android.os.RemoteException {}
            public void dispatchWallpaperCommand(java.lang.String p0, int p1, int p2, int p3, android.os.Bundle p4, boolean p5) throws android.os.RemoteException {}
            public void dispatchDragEvent(android.view.DragEvent p0) throws android.os.RemoteException {}
            public void updatePointerIcon(float p0, float p1) throws android.os.RemoteException {}
            public void dispatchSystemUiVisibilityChanged(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void dispatchWindowShown() throws android.os.RemoteException {}
            public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException {}
            public void dispatchPointerCaptureChanged(boolean p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.view.IWindow {
        public Default() {}
        public void executeCommand(java.lang.String p0, java.lang.String p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException {}
        public void resized(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4, android.graphics.Rect p5, boolean p6, android.util.MergedConfiguration p7, android.graphics.Rect p8, boolean p9, boolean p10, int p11, android.view.DisplayCutout.ParcelableWrapper p12) throws android.os.RemoteException {}
        public void locationInParentDisplayChanged(android.graphics.Point p0) throws android.os.RemoteException {}
        public void insetsChanged(android.view.InsetsState p0) throws android.os.RemoteException {}
        public void insetsControlChanged(android.view.InsetsState p0, android.view.InsetsSourceControl[] p1) throws android.os.RemoteException {}
        public void moved(int p0, int p1) throws android.os.RemoteException {}
        public void dispatchAppVisibility(boolean p0) throws android.os.RemoteException {}
        public void dispatchGetNewSurface() throws android.os.RemoteException {}
        public void windowFocusChanged(boolean p0, boolean p1) throws android.os.RemoteException {}
        public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException {}
        public void dispatchWallpaperOffsets(float p0, float p1, float p2, float p3, boolean p4) throws android.os.RemoteException {}
        public void dispatchWallpaperCommand(java.lang.String p0, int p1, int p2, int p3, android.os.Bundle p4, boolean p5) throws android.os.RemoteException {}
        public void dispatchDragEvent(android.view.DragEvent p0) throws android.os.RemoteException {}
        public void updatePointerIcon(float p0, float p1) throws android.os.RemoteException {}
        public void dispatchSystemUiVisibilityChanged(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void dispatchWindowShown() throws android.os.RemoteException {}
        public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException {}
        public void dispatchPointerCaptureChanged(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
