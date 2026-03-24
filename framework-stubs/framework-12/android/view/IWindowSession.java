package android.view;

public interface IWindowSession extends android.os.IInterface {
    public int addToDisplay(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, android.view.InsetsState p4, android.view.InputChannel p5, android.view.InsetsState p6, android.view.InsetsSourceControl[] p7) throws android.os.RemoteException;
    public int addToDisplayAsUser(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, android.view.InsetsState p5, android.view.InputChannel p6, android.view.InsetsState p7, android.view.InsetsSourceControl[] p8) throws android.os.RemoteException;
    public int addToDisplayWithoutInputChannel(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, android.view.InsetsState p4) throws android.os.RemoteException;
    public void remove(android.view.IWindow p0) throws android.os.RemoteException;
    public int relayout(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, long p6, android.window.ClientWindowFrames p7, android.util.MergedConfiguration p8, android.view.SurfaceControl p9, android.view.InsetsState p10, android.view.InsetsSourceControl[] p11, android.graphics.Point p12) throws android.os.RemoteException;
    public void prepareToReplaceWindows(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public boolean outOfMemory(android.view.IWindow p0) throws android.os.RemoteException;
    public void setInsets(android.view.IWindow p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Region p4) throws android.os.RemoteException;
    public void finishDrawing(android.view.IWindow p0, android.view.SurfaceControl.Transaction p1) throws android.os.RemoteException;
    public void setInTouchMode(boolean p0) throws android.os.RemoteException;
    public boolean getInTouchMode() throws android.os.RemoteException;
    public boolean performHapticFeedback(int p0, boolean p1) throws android.os.RemoteException;
    public android.os.IBinder performDrag(android.view.IWindow p0, int p1, android.view.SurfaceControl p2, int p3, float p4, float p5, float p6, float p7, android.content.ClipData p8) throws android.os.RemoteException;
    public void reportDropResult(android.view.IWindow p0, boolean p1) throws android.os.RemoteException;
    public void cancelDragAndDrop(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void dragRecipientEntered(android.view.IWindow p0) throws android.os.RemoteException;
    public void dragRecipientExited(android.view.IWindow p0) throws android.os.RemoteException;
    public void setWallpaperPosition(android.os.IBinder p0, float p1, float p2, float p3, float p4) throws android.os.RemoteException;
    public void setWallpaperZoomOut(android.os.IBinder p0, float p1) throws android.os.RemoteException;
    public void setShouldZoomOutWallpaper(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void wallpaperOffsetsComplete(android.os.IBinder p0) throws android.os.RemoteException;
    public void setWallpaperDisplayOffset(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;
    public android.os.Bundle sendWallpaperCommand(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, android.os.Bundle p5, boolean p6) throws android.os.RemoteException;
    public void wallpaperCommandComplete(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void onRectangleOnScreenRequested(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public android.view.IWindowId getWindowId(android.os.IBinder p0) throws android.os.RemoteException;
    public void pokeDrawLock(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean startMovingTask(android.view.IWindow p0, float p1, float p2) throws android.os.RemoteException;
    public void finishMovingTask(android.view.IWindow p0) throws android.os.RemoteException;
    public void updatePointerIcon(android.view.IWindow p0) throws android.os.RemoteException;
    public void updateDisplayContentLocation(android.view.IWindow p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void updateTapExcludeRegion(android.view.IWindow p0, android.graphics.Region p1) throws android.os.RemoteException;
    public void insetsModified(android.view.IWindow p0, android.view.InsetsState p1) throws android.os.RemoteException;
    public void reportSystemGestureExclusionChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1) throws android.os.RemoteException;
    public void grantInputChannel(int p0, android.view.SurfaceControl p1, android.view.IWindow p2, android.os.IBinder p3, int p4, int p5, int p6, android.view.InputChannel p7) throws android.os.RemoteException;
    public void updateInputChannel(android.os.IBinder p0, int p1, android.view.SurfaceControl p2, int p3, int p4, android.graphics.Region p5) throws android.os.RemoteException;
    public void grantEmbeddedWindowFocus(android.view.IWindow p0, android.os.IBinder p1, boolean p2) throws android.os.RemoteException;
    public void generateDisplayHash(android.view.IWindow p0, android.graphics.Rect p1, java.lang.String p2, android.os.RemoteCallback p3) throws android.os.RemoteException;

    public static class Default implements android.view.IWindowSession {
        public Default() {}
        public int addToDisplay(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, android.view.InsetsState p4, android.view.InputChannel p5, android.view.InsetsState p6, android.view.InsetsSourceControl[] p7) throws android.os.RemoteException { return 0; }
        public int addToDisplayAsUser(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, android.view.InsetsState p5, android.view.InputChannel p6, android.view.InsetsState p7, android.view.InsetsSourceControl[] p8) throws android.os.RemoteException { return 0; }
        public int addToDisplayWithoutInputChannel(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, android.view.InsetsState p4) throws android.os.RemoteException { return 0; }
        public void remove(android.view.IWindow p0) throws android.os.RemoteException {}
        public int relayout(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, long p6, android.window.ClientWindowFrames p7, android.util.MergedConfiguration p8, android.view.SurfaceControl p9, android.view.InsetsState p10, android.view.InsetsSourceControl[] p11, android.graphics.Point p12) throws android.os.RemoteException { return 0; }
        public void prepareToReplaceWindows(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public boolean outOfMemory(android.view.IWindow p0) throws android.os.RemoteException { return false; }
        public void setInsets(android.view.IWindow p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Region p4) throws android.os.RemoteException {}
        public void finishDrawing(android.view.IWindow p0, android.view.SurfaceControl.Transaction p1) throws android.os.RemoteException {}
        public void setInTouchMode(boolean p0) throws android.os.RemoteException {}
        public boolean getInTouchMode() throws android.os.RemoteException { return false; }
        public boolean performHapticFeedback(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder performDrag(android.view.IWindow p0, int p1, android.view.SurfaceControl p2, int p3, float p4, float p5, float p6, float p7, android.content.ClipData p8) throws android.os.RemoteException { return null; }
        public void reportDropResult(android.view.IWindow p0, boolean p1) throws android.os.RemoteException {}
        public void cancelDragAndDrop(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void dragRecipientEntered(android.view.IWindow p0) throws android.os.RemoteException {}
        public void dragRecipientExited(android.view.IWindow p0) throws android.os.RemoteException {}
        public void setWallpaperPosition(android.os.IBinder p0, float p1, float p2, float p3, float p4) throws android.os.RemoteException {}
        public void setWallpaperZoomOut(android.os.IBinder p0, float p1) throws android.os.RemoteException {}
        public void setShouldZoomOutWallpaper(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void wallpaperOffsetsComplete(android.os.IBinder p0) throws android.os.RemoteException {}
        public void setWallpaperDisplayOffset(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
        public android.os.Bundle sendWallpaperCommand(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, android.os.Bundle p5, boolean p6) throws android.os.RemoteException { return null; }
        public void wallpaperCommandComplete(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void onRectangleOnScreenRequested(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public android.view.IWindowId getWindowId(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void pokeDrawLock(android.os.IBinder p0) throws android.os.RemoteException {}
        public boolean startMovingTask(android.view.IWindow p0, float p1, float p2) throws android.os.RemoteException { return false; }
        public void finishMovingTask(android.view.IWindow p0) throws android.os.RemoteException {}
        public void updatePointerIcon(android.view.IWindow p0) throws android.os.RemoteException {}
        public void updateDisplayContentLocation(android.view.IWindow p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void updateTapExcludeRegion(android.view.IWindow p0, android.graphics.Region p1) throws android.os.RemoteException {}
        public void insetsModified(android.view.IWindow p0, android.view.InsetsState p1) throws android.os.RemoteException {}
        public void reportSystemGestureExclusionChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1) throws android.os.RemoteException {}
        public void grantInputChannel(int p0, android.view.SurfaceControl p1, android.view.IWindow p2, android.os.IBinder p3, int p4, int p5, int p6, android.view.InputChannel p7) throws android.os.RemoteException {}
        public void updateInputChannel(android.os.IBinder p0, int p1, android.view.SurfaceControl p2, int p3, int p4, android.graphics.Region p5) throws android.os.RemoteException {}
        public void grantEmbeddedWindowFocus(android.view.IWindow p0, android.os.IBinder p1, boolean p2) throws android.os.RemoteException {}
        public void generateDisplayHash(android.view.IWindow p0, android.graphics.Rect p1, java.lang.String p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IWindowSession {
        public static final java.lang.String DESCRIPTOR = "android.view.IWindowSession";
        static final int TRANSACTION_addToDisplay = 1;
        static final int TRANSACTION_addToDisplayAsUser = 2;
        static final int TRANSACTION_addToDisplayWithoutInputChannel = 3;
        static final int TRANSACTION_remove = 4;
        static final int TRANSACTION_relayout = 5;
        static final int TRANSACTION_prepareToReplaceWindows = 6;
        static final int TRANSACTION_outOfMemory = 7;
        static final int TRANSACTION_setInsets = 8;
        static final int TRANSACTION_finishDrawing = 9;
        static final int TRANSACTION_setInTouchMode = 10;
        static final int TRANSACTION_getInTouchMode = 11;
        static final int TRANSACTION_performHapticFeedback = 12;
        static final int TRANSACTION_performDrag = 13;
        static final int TRANSACTION_reportDropResult = 14;
        static final int TRANSACTION_cancelDragAndDrop = 15;
        static final int TRANSACTION_dragRecipientEntered = 16;
        static final int TRANSACTION_dragRecipientExited = 17;
        static final int TRANSACTION_setWallpaperPosition = 18;
        static final int TRANSACTION_setWallpaperZoomOut = 19;
        static final int TRANSACTION_setShouldZoomOutWallpaper = 20;
        static final int TRANSACTION_wallpaperOffsetsComplete = 21;
        static final int TRANSACTION_setWallpaperDisplayOffset = 22;
        static final int TRANSACTION_sendWallpaperCommand = 23;
        static final int TRANSACTION_wallpaperCommandComplete = 24;
        static final int TRANSACTION_onRectangleOnScreenRequested = 25;
        static final int TRANSACTION_getWindowId = 26;
        static final int TRANSACTION_pokeDrawLock = 27;
        static final int TRANSACTION_startMovingTask = 28;
        static final int TRANSACTION_finishMovingTask = 29;
        static final int TRANSACTION_updatePointerIcon = 30;
        static final int TRANSACTION_updateDisplayContentLocation = 31;
        static final int TRANSACTION_updateTapExcludeRegion = 32;
        static final int TRANSACTION_insetsModified = 33;
        static final int TRANSACTION_reportSystemGestureExclusionChanged = 34;
        static final int TRANSACTION_grantInputChannel = 35;
        static final int TRANSACTION_updateInputChannel = 36;
        static final int TRANSACTION_grantEmbeddedWindowFocus = 37;
        static final int TRANSACTION_generateDisplayHash = 38;
        public Stub() { super(); }
        public static android.view.IWindowSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IWindowSession p0) { return false; }
        public static android.view.IWindowSession getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IWindowSession {
            private android.os.IBinder mRemote;
            public static android.view.IWindowSession sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int addToDisplay(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, android.view.InsetsState p4, android.view.InputChannel p5, android.view.InsetsState p6, android.view.InsetsSourceControl[] p7) throws android.os.RemoteException { return 0; }
            public int addToDisplayAsUser(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, android.view.InsetsState p5, android.view.InputChannel p6, android.view.InsetsState p7, android.view.InsetsSourceControl[] p8) throws android.os.RemoteException { return 0; }
            public int addToDisplayWithoutInputChannel(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, android.view.InsetsState p4) throws android.os.RemoteException { return 0; }
            public void remove(android.view.IWindow p0) throws android.os.RemoteException {}
            public int relayout(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, long p6, android.window.ClientWindowFrames p7, android.util.MergedConfiguration p8, android.view.SurfaceControl p9, android.view.InsetsState p10, android.view.InsetsSourceControl[] p11, android.graphics.Point p12) throws android.os.RemoteException { return 0; }
            public void prepareToReplaceWindows(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public boolean outOfMemory(android.view.IWindow p0) throws android.os.RemoteException { return false; }
            public void setInsets(android.view.IWindow p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Region p4) throws android.os.RemoteException {}
            public void finishDrawing(android.view.IWindow p0, android.view.SurfaceControl.Transaction p1) throws android.os.RemoteException {}
            public void setInTouchMode(boolean p0) throws android.os.RemoteException {}
            public boolean getInTouchMode() throws android.os.RemoteException { return false; }
            public boolean performHapticFeedback(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public android.os.IBinder performDrag(android.view.IWindow p0, int p1, android.view.SurfaceControl p2, int p3, float p4, float p5, float p6, float p7, android.content.ClipData p8) throws android.os.RemoteException { return null; }
            public void reportDropResult(android.view.IWindow p0, boolean p1) throws android.os.RemoteException {}
            public void cancelDragAndDrop(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void dragRecipientEntered(android.view.IWindow p0) throws android.os.RemoteException {}
            public void dragRecipientExited(android.view.IWindow p0) throws android.os.RemoteException {}
            public void setWallpaperPosition(android.os.IBinder p0, float p1, float p2, float p3, float p4) throws android.os.RemoteException {}
            public void setWallpaperZoomOut(android.os.IBinder p0, float p1) throws android.os.RemoteException {}
            public void setShouldZoomOutWallpaper(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void wallpaperOffsetsComplete(android.os.IBinder p0) throws android.os.RemoteException {}
            public void setWallpaperDisplayOffset(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
            public android.os.Bundle sendWallpaperCommand(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, android.os.Bundle p5, boolean p6) throws android.os.RemoteException { return null; }
            public void wallpaperCommandComplete(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void onRectangleOnScreenRequested(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public android.view.IWindowId getWindowId(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void pokeDrawLock(android.os.IBinder p0) throws android.os.RemoteException {}
            public boolean startMovingTask(android.view.IWindow p0, float p1, float p2) throws android.os.RemoteException { return false; }
            public void finishMovingTask(android.view.IWindow p0) throws android.os.RemoteException {}
            public void updatePointerIcon(android.view.IWindow p0) throws android.os.RemoteException {}
            public void updateDisplayContentLocation(android.view.IWindow p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void updateTapExcludeRegion(android.view.IWindow p0, android.graphics.Region p1) throws android.os.RemoteException {}
            public void insetsModified(android.view.IWindow p0, android.view.InsetsState p1) throws android.os.RemoteException {}
            public void reportSystemGestureExclusionChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1) throws android.os.RemoteException {}
            public void grantInputChannel(int p0, android.view.SurfaceControl p1, android.view.IWindow p2, android.os.IBinder p3, int p4, int p5, int p6, android.view.InputChannel p7) throws android.os.RemoteException {}
            public void updateInputChannel(android.os.IBinder p0, int p1, android.view.SurfaceControl p2, int p3, int p4, android.graphics.Region p5) throws android.os.RemoteException {}
            public void grantEmbeddedWindowFocus(android.view.IWindow p0, android.os.IBinder p1, boolean p2) throws android.os.RemoteException {}
            public void generateDisplayHash(android.view.IWindow p0, android.graphics.Rect p1, java.lang.String p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
        }
    }
}
