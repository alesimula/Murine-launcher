package android.view;

public interface IWindow extends android.os.IInterface {
    public void executeCommand(java.lang.String p0, java.lang.String p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException;
    public void resized(android.window.ClientWindowFrames p0, boolean p1, android.util.MergedConfiguration p2, android.view.InsetsState p3, boolean p4, boolean p5, int p6, int p7, boolean p8) throws android.os.RemoteException;
    public void insetsControlChanged(android.view.InsetsState p0, android.view.InsetsSourceControl[] p1) throws android.os.RemoteException;
    public void showInsets(int p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException;
    public void hideInsets(int p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException;
    public void moved(int p0, int p1) throws android.os.RemoteException;
    public void dispatchAppVisibility(boolean p0) throws android.os.RemoteException;
    public void dispatchGetNewSurface() throws android.os.RemoteException;
    public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException;
    public void dispatchWallpaperOffsets(float p0, float p1, float p2, float p3, float p4, boolean p5) throws android.os.RemoteException;
    public void dispatchWallpaperCommand(java.lang.String p0, int p1, int p2, int p3, android.os.Bundle p4, boolean p5) throws android.os.RemoteException;
    public void dispatchDragEvent(android.view.DragEvent p0) throws android.os.RemoteException;
    public void updatePointerIcon(float p0, float p1) throws android.os.RemoteException;
    public void dispatchWindowShown() throws android.os.RemoteException;
    public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException;
    public void requestScrollCapture(android.view.IScrollCaptureResponseListener p0) throws android.os.RemoteException;

    public static class Default implements android.view.IWindow {
        public Default() {}
        public void executeCommand(java.lang.String p0, java.lang.String p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException {}
        public void resized(android.window.ClientWindowFrames p0, boolean p1, android.util.MergedConfiguration p2, android.view.InsetsState p3, boolean p4, boolean p5, int p6, int p7, boolean p8) throws android.os.RemoteException {}
        public void insetsControlChanged(android.view.InsetsState p0, android.view.InsetsSourceControl[] p1) throws android.os.RemoteException {}
        public void showInsets(int p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
        public void hideInsets(int p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
        public void moved(int p0, int p1) throws android.os.RemoteException {}
        public void dispatchAppVisibility(boolean p0) throws android.os.RemoteException {}
        public void dispatchGetNewSurface() throws android.os.RemoteException {}
        public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException {}
        public void dispatchWallpaperOffsets(float p0, float p1, float p2, float p3, float p4, boolean p5) throws android.os.RemoteException {}
        public void dispatchWallpaperCommand(java.lang.String p0, int p1, int p2, int p3, android.os.Bundle p4, boolean p5) throws android.os.RemoteException {}
        public void dispatchDragEvent(android.view.DragEvent p0) throws android.os.RemoteException {}
        public void updatePointerIcon(float p0, float p1) throws android.os.RemoteException {}
        public void dispatchWindowShown() throws android.os.RemoteException {}
        public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException {}
        public void requestScrollCapture(android.view.IScrollCaptureResponseListener p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IWindow {
        public static final java.lang.String DESCRIPTOR = "android.view.IWindow";
        static final int TRANSACTION_executeCommand = 1;
        static final int TRANSACTION_resized = 2;
        static final int TRANSACTION_insetsControlChanged = 3;
        static final int TRANSACTION_showInsets = 4;
        static final int TRANSACTION_hideInsets = 5;
        static final int TRANSACTION_moved = 6;
        static final int TRANSACTION_dispatchAppVisibility = 7;
        static final int TRANSACTION_dispatchGetNewSurface = 8;
        static final int TRANSACTION_closeSystemDialogs = 9;
        static final int TRANSACTION_dispatchWallpaperOffsets = 10;
        static final int TRANSACTION_dispatchWallpaperCommand = 11;
        static final int TRANSACTION_dispatchDragEvent = 12;
        static final int TRANSACTION_updatePointerIcon = 13;
        static final int TRANSACTION_dispatchWindowShown = 14;
        static final int TRANSACTION_requestAppKeyboardShortcuts = 15;
        static final int TRANSACTION_requestScrollCapture = 16;
        public Stub() { super(); }
        public static android.view.IWindow asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.view.IWindow {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void executeCommand(java.lang.String p0, java.lang.String p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException {}
            public void resized(android.window.ClientWindowFrames p0, boolean p1, android.util.MergedConfiguration p2, android.view.InsetsState p3, boolean p4, boolean p5, int p6, int p7, boolean p8) throws android.os.RemoteException {}
            public void insetsControlChanged(android.view.InsetsState p0, android.view.InsetsSourceControl[] p1) throws android.os.RemoteException {}
            public void showInsets(int p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
            public void hideInsets(int p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
            public void moved(int p0, int p1) throws android.os.RemoteException {}
            public void dispatchAppVisibility(boolean p0) throws android.os.RemoteException {}
            public void dispatchGetNewSurface() throws android.os.RemoteException {}
            public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException {}
            public void dispatchWallpaperOffsets(float p0, float p1, float p2, float p3, float p4, boolean p5) throws android.os.RemoteException {}
            public void dispatchWallpaperCommand(java.lang.String p0, int p1, int p2, int p3, android.os.Bundle p4, boolean p5) throws android.os.RemoteException {}
            public void dispatchDragEvent(android.view.DragEvent p0) throws android.os.RemoteException {}
            public void updatePointerIcon(float p0, float p1) throws android.os.RemoteException {}
            public void dispatchWindowShown() throws android.os.RemoteException {}
            public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException {}
            public void requestScrollCapture(android.view.IScrollCaptureResponseListener p0) throws android.os.RemoteException {}
        }
    }
}
