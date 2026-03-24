package android.view;

public interface IWindowSession extends android.os.IInterface {
    public int addToDisplay(android.view.IWindow p0, int p1, android.view.WindowManager.LayoutParams p2, int p3, int p4, android.graphics.Rect p5, android.graphics.Rect p6, android.graphics.Rect p7, android.graphics.Rect p8, android.view.DisplayCutout.ParcelableWrapper p9, android.view.InputChannel p10, android.view.InsetsState p11) throws android.os.RemoteException;
    public int addToDisplayWithoutInputChannel(android.view.IWindow p0, int p1, android.view.WindowManager.LayoutParams p2, int p3, int p4, android.graphics.Rect p5, android.graphics.Rect p6, android.view.InsetsState p7) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void remove(android.view.IWindow p0) throws android.os.RemoteException;
    public int relayout(android.view.IWindow p0, int p1, android.view.WindowManager.LayoutParams p2, int p3, int p4, int p5, int p6, long p7, android.graphics.Rect p8, android.graphics.Rect p9, android.graphics.Rect p10, android.graphics.Rect p11, android.graphics.Rect p12, android.graphics.Rect p13, android.graphics.Rect p14, android.view.DisplayCutout.ParcelableWrapper p15, android.util.MergedConfiguration p16, android.view.SurfaceControl p17, android.view.InsetsState p18) throws android.os.RemoteException;
    public void prepareToReplaceWindows(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public boolean outOfMemory(android.view.IWindow p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setTransparentRegion(android.view.IWindow p0, android.graphics.Region p1) throws android.os.RemoteException;
    public void setInsets(android.view.IWindow p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Region p4) throws android.os.RemoteException;
    public void getDisplayFrame(android.view.IWindow p0, android.graphics.Rect p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void finishDrawing(android.view.IWindow p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setInTouchMode(boolean p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean getInTouchMode() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean performHapticFeedback(int p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.os.IBinder performDrag(android.view.IWindow p0, int p1, android.view.SurfaceControl p2, int p3, float p4, float p5, float p6, float p7, android.content.ClipData p8) throws android.os.RemoteException;
    public void reportDropResult(android.view.IWindow p0, boolean p1) throws android.os.RemoteException;
    public void cancelDragAndDrop(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void dragRecipientEntered(android.view.IWindow p0) throws android.os.RemoteException;
    public void dragRecipientExited(android.view.IWindow p0) throws android.os.RemoteException;
    public void setWallpaperPosition(android.os.IBinder p0, float p1, float p2, float p3, float p4) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void wallpaperOffsetsComplete(android.os.IBinder p0) throws android.os.RemoteException;
    public void setWallpaperDisplayOffset(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;
    public android.os.Bundle sendWallpaperCommand(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, android.os.Bundle p5, boolean p6) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void wallpaperCommandComplete(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void onRectangleOnScreenRequested(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public android.view.IWindowId getWindowId(android.os.IBinder p0) throws android.os.RemoteException;
    public void pokeDrawLock(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean startMovingTask(android.view.IWindow p0, float p1, float p2) throws android.os.RemoteException;
    public void finishMovingTask(android.view.IWindow p0) throws android.os.RemoteException;
    public void updatePointerIcon(android.view.IWindow p0) throws android.os.RemoteException;
    public void reparentDisplayContent(android.view.IWindow p0, android.view.SurfaceControl p1, int p2) throws android.os.RemoteException;
    public void updateDisplayContentLocation(android.view.IWindow p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void updateTapExcludeRegion(android.view.IWindow p0, int p1, android.graphics.Region p2) throws android.os.RemoteException;
    public void insetsModified(android.view.IWindow p0, android.view.InsetsState p1) throws android.os.RemoteException;
    public void reportSystemGestureExclusionChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.view.IWindowSession {
        private static final java.lang.String DESCRIPTOR = "android.view.IWindowSession";
        static final int TRANSACTION_addToDisplay = 1;
        static final int TRANSACTION_addToDisplayWithoutInputChannel = 2;
        static final int TRANSACTION_remove = 3;
        static final int TRANSACTION_relayout = 4;
        static final int TRANSACTION_prepareToReplaceWindows = 5;
        static final int TRANSACTION_outOfMemory = 6;
        static final int TRANSACTION_setTransparentRegion = 7;
        static final int TRANSACTION_setInsets = 8;
        static final int TRANSACTION_getDisplayFrame = 9;
        static final int TRANSACTION_finishDrawing = 10;
        static final int TRANSACTION_setInTouchMode = 11;
        static final int TRANSACTION_getInTouchMode = 12;
        static final int TRANSACTION_performHapticFeedback = 13;
        static final int TRANSACTION_performDrag = 14;
        static final int TRANSACTION_reportDropResult = 15;
        static final int TRANSACTION_cancelDragAndDrop = 16;
        static final int TRANSACTION_dragRecipientEntered = 17;
        static final int TRANSACTION_dragRecipientExited = 18;
        static final int TRANSACTION_setWallpaperPosition = 19;
        static final int TRANSACTION_wallpaperOffsetsComplete = 20;
        static final int TRANSACTION_setWallpaperDisplayOffset = 21;
        static final int TRANSACTION_sendWallpaperCommand = 22;
        static final int TRANSACTION_wallpaperCommandComplete = 23;
        static final int TRANSACTION_onRectangleOnScreenRequested = 24;
        static final int TRANSACTION_getWindowId = 25;
        static final int TRANSACTION_pokeDrawLock = 26;
        static final int TRANSACTION_startMovingTask = 27;
        static final int TRANSACTION_finishMovingTask = 28;
        static final int TRANSACTION_updatePointerIcon = 29;
        static final int TRANSACTION_reparentDisplayContent = 30;
        static final int TRANSACTION_updateDisplayContentLocation = 31;
        static final int TRANSACTION_updateTapExcludeRegion = 32;
        static final int TRANSACTION_insetsModified = 33;
        static final int TRANSACTION_reportSystemGestureExclusionChanged = 34;
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
            public int addToDisplay(android.view.IWindow p0, int p1, android.view.WindowManager.LayoutParams p2, int p3, int p4, android.graphics.Rect p5, android.graphics.Rect p6, android.graphics.Rect p7, android.graphics.Rect p8, android.view.DisplayCutout.ParcelableWrapper p9, android.view.InputChannel p10, android.view.InsetsState p11) throws android.os.RemoteException { return 0; }
            public int addToDisplayWithoutInputChannel(android.view.IWindow p0, int p1, android.view.WindowManager.LayoutParams p2, int p3, int p4, android.graphics.Rect p5, android.graphics.Rect p6, android.view.InsetsState p7) throws android.os.RemoteException { return 0; }
            public void remove(android.view.IWindow p0) throws android.os.RemoteException {}
            public int relayout(android.view.IWindow p0, int p1, android.view.WindowManager.LayoutParams p2, int p3, int p4, int p5, int p6, long p7, android.graphics.Rect p8, android.graphics.Rect p9, android.graphics.Rect p10, android.graphics.Rect p11, android.graphics.Rect p12, android.graphics.Rect p13, android.graphics.Rect p14, android.view.DisplayCutout.ParcelableWrapper p15, android.util.MergedConfiguration p16, android.view.SurfaceControl p17, android.view.InsetsState p18) throws android.os.RemoteException { return 0; }
            public void prepareToReplaceWindows(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public boolean outOfMemory(android.view.IWindow p0) throws android.os.RemoteException { return false; }
            public void setTransparentRegion(android.view.IWindow p0, android.graphics.Region p1) throws android.os.RemoteException {}
            public void setInsets(android.view.IWindow p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Region p4) throws android.os.RemoteException {}
            public void getDisplayFrame(android.view.IWindow p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public void finishDrawing(android.view.IWindow p0) throws android.os.RemoteException {}
            public void setInTouchMode(boolean p0) throws android.os.RemoteException {}
            public boolean getInTouchMode() throws android.os.RemoteException { return false; }
            public boolean performHapticFeedback(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public android.os.IBinder performDrag(android.view.IWindow p0, int p1, android.view.SurfaceControl p2, int p3, float p4, float p5, float p6, float p7, android.content.ClipData p8) throws android.os.RemoteException { return null; }
            public void reportDropResult(android.view.IWindow p0, boolean p1) throws android.os.RemoteException {}
            public void cancelDragAndDrop(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void dragRecipientEntered(android.view.IWindow p0) throws android.os.RemoteException {}
            public void dragRecipientExited(android.view.IWindow p0) throws android.os.RemoteException {}
            public void setWallpaperPosition(android.os.IBinder p0, float p1, float p2, float p3, float p4) throws android.os.RemoteException {}
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
            public void reparentDisplayContent(android.view.IWindow p0, android.view.SurfaceControl p1, int p2) throws android.os.RemoteException {}
            public void updateDisplayContentLocation(android.view.IWindow p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void updateTapExcludeRegion(android.view.IWindow p0, int p1, android.graphics.Region p2) throws android.os.RemoteException {}
            public void insetsModified(android.view.IWindow p0, android.view.InsetsState p1) throws android.os.RemoteException {}
            public void reportSystemGestureExclusionChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.view.IWindowSession {
        public Default() {}
        public int addToDisplay(android.view.IWindow p0, int p1, android.view.WindowManager.LayoutParams p2, int p3, int p4, android.graphics.Rect p5, android.graphics.Rect p6, android.graphics.Rect p7, android.graphics.Rect p8, android.view.DisplayCutout.ParcelableWrapper p9, android.view.InputChannel p10, android.view.InsetsState p11) throws android.os.RemoteException { return 0; }
        public int addToDisplayWithoutInputChannel(android.view.IWindow p0, int p1, android.view.WindowManager.LayoutParams p2, int p3, int p4, android.graphics.Rect p5, android.graphics.Rect p6, android.view.InsetsState p7) throws android.os.RemoteException { return 0; }
        public void remove(android.view.IWindow p0) throws android.os.RemoteException {}
        public int relayout(android.view.IWindow p0, int p1, android.view.WindowManager.LayoutParams p2, int p3, int p4, int p5, int p6, long p7, android.graphics.Rect p8, android.graphics.Rect p9, android.graphics.Rect p10, android.graphics.Rect p11, android.graphics.Rect p12, android.graphics.Rect p13, android.graphics.Rect p14, android.view.DisplayCutout.ParcelableWrapper p15, android.util.MergedConfiguration p16, android.view.SurfaceControl p17, android.view.InsetsState p18) throws android.os.RemoteException { return 0; }
        public void prepareToReplaceWindows(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public boolean outOfMemory(android.view.IWindow p0) throws android.os.RemoteException { return false; }
        public void setTransparentRegion(android.view.IWindow p0, android.graphics.Region p1) throws android.os.RemoteException {}
        public void setInsets(android.view.IWindow p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Region p4) throws android.os.RemoteException {}
        public void getDisplayFrame(android.view.IWindow p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public void finishDrawing(android.view.IWindow p0) throws android.os.RemoteException {}
        public void setInTouchMode(boolean p0) throws android.os.RemoteException {}
        public boolean getInTouchMode() throws android.os.RemoteException { return false; }
        public boolean performHapticFeedback(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder performDrag(android.view.IWindow p0, int p1, android.view.SurfaceControl p2, int p3, float p4, float p5, float p6, float p7, android.content.ClipData p8) throws android.os.RemoteException { return null; }
        public void reportDropResult(android.view.IWindow p0, boolean p1) throws android.os.RemoteException {}
        public void cancelDragAndDrop(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void dragRecipientEntered(android.view.IWindow p0) throws android.os.RemoteException {}
        public void dragRecipientExited(android.view.IWindow p0) throws android.os.RemoteException {}
        public void setWallpaperPosition(android.os.IBinder p0, float p1, float p2, float p3, float p4) throws android.os.RemoteException {}
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
        public void reparentDisplayContent(android.view.IWindow p0, android.view.SurfaceControl p1, int p2) throws android.os.RemoteException {}
        public void updateDisplayContentLocation(android.view.IWindow p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void updateTapExcludeRegion(android.view.IWindow p0, int p1, android.graphics.Region p2) throws android.os.RemoteException {}
        public void insetsModified(android.view.IWindow p0, android.view.InsetsState p1) throws android.os.RemoteException {}
        public void reportSystemGestureExclusionChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
