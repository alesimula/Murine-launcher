package android.view;

public interface IWindowSession extends android.os.IInterface {
    public int addToDisplay(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, android.view.InputChannel p5, android.view.WindowRelayoutResult p6) throws android.os.RemoteException;
    public int addToDisplayAsUser(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, android.view.InputChannel p6, android.view.WindowRelayoutResult p7) throws android.os.RemoteException;
    public int addToDisplayWithoutInputChannel(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, android.view.WindowRelayoutResult p4) throws android.os.RemoteException;
    public void remove(android.os.IBinder p0) throws android.os.RemoteException;
    public int relayout(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, int p7, android.view.WindowRelayoutResult p8, android.view.SurfaceControl p9) throws android.os.RemoteException;
    public void relayoutAsync(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, int p7) throws android.os.RemoteException;
    public boolean outOfMemory(android.view.IWindow p0) throws android.os.RemoteException;
    public void setInsets(android.view.IWindow p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Region p4) throws android.os.RemoteException;
    public void finishDrawing(android.view.IWindow p0, android.view.SurfaceControl.Transaction p1, int p2) throws android.os.RemoteException;
    public android.os.IBinder performDrag(android.view.IWindow p0, int p1, android.view.SurfaceControl p2, int p3, int p4, int p5, float p6, float p7, float p8, float p9, android.content.ClipData p10) throws android.os.RemoteException;
    public boolean dropForAccessibility(android.view.IWindow p0, int p1, int p2) throws android.os.RemoteException;
    public void reportDropResult(android.view.IWindow p0, boolean p1) throws android.os.RemoteException;
    public void cancelDragAndDrop(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void dragRecipientEntered(android.view.IWindow p0) throws android.os.RemoteException;
    public void dragRecipientExited(android.view.IWindow p0) throws android.os.RemoteException;
    public void setWallpaperPosition(android.os.IBinder p0, float p1, float p2, float p3, float p4) throws android.os.RemoteException;
    public void setWallpaperZoomOut(android.os.IBinder p0, float p1) throws android.os.RemoteException;
    public void setShouldZoomOutWallpaper(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void wallpaperOffsetsComplete(android.os.IBinder p0) throws android.os.RemoteException;
    public void setWallpaperDisplayOffset(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;
    public void sendWallpaperCommand(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, android.os.Bundle p5, boolean p6) throws android.os.RemoteException;
    public void wallpaperCommandComplete(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void onRectangleOnScreenRequested(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException;
    public android.view.IWindowId getWindowId(android.os.IBinder p0) throws android.os.RemoteException;
    public void pokeDrawLock(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean startMovingTask(android.view.IWindow p0, float p1, float p2) throws android.os.RemoteException;
    public void finishMovingTask(android.view.IWindow p0) throws android.os.RemoteException;
    public void updateTapExcludeRegion(android.view.IWindow p0, android.graphics.Region p1) throws android.os.RemoteException;
    public void updateRequestedVisibleTypes(android.view.IWindow p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException;
    public void updateAnimatingTypes(android.view.IWindow p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException;
    public void reportSystemGestureExclusionChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1) throws android.os.RemoteException;
    public void reportDecorViewGestureInterceptionChanged(android.view.IWindow p0, boolean p1) throws android.os.RemoteException;
    public void reportKeepClearAreasChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1, java.util.List<android.graphics.Rect> p2) throws android.os.RemoteException;
    public void grantInputChannel(int p0, android.view.SurfaceControl p1, android.os.IBinder p2, android.window.InputTransferToken p3, int p4, int p5, int p6, int p7, android.os.IBinder p8, android.window.InputTransferToken p9, java.lang.String p10, android.view.InputChannel p11) throws android.os.RemoteException;
    public void updateInputChannel(android.os.IBinder p0, android.window.InputTransferToken p1, int p2, android.view.SurfaceControl p3, int p4, int p5, int p6, android.graphics.Region p7) throws android.os.RemoteException;
    public void grantEmbeddedWindowFocus(android.view.IWindow p0, android.window.InputTransferToken p1, boolean p2) throws android.os.RemoteException;
    public void generateDisplayHash(android.view.IWindow p0, android.graphics.Rect p1, java.lang.String p2, android.os.RemoteCallback p3) throws android.os.RemoteException;
    public void setOnBackInvokedCallbackInfo(android.view.IWindow p0, android.window.OnBackInvokedCallbackInfo p1) throws android.os.RemoteException;
    public void clearTouchableRegion(android.view.IWindow p0) throws android.os.RemoteException;
    public boolean cancelDraw(android.view.IWindow p0, int p1) throws android.os.RemoteException;
    public boolean moveFocusToAdjacentWindow(android.view.IWindow p0, int p1) throws android.os.RemoteException;
    public void notifyImeWindowVisibilityChangedFromClient(android.view.IWindow p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException;

    public static class Default implements android.view.IWindowSession {
        public Default() {}
        public int addToDisplay(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, android.view.InputChannel p5, android.view.WindowRelayoutResult p6) throws android.os.RemoteException { return 0; }
        public int addToDisplayAsUser(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, android.view.InputChannel p6, android.view.WindowRelayoutResult p7) throws android.os.RemoteException { return 0; }
        public int addToDisplayWithoutInputChannel(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, android.view.WindowRelayoutResult p4) throws android.os.RemoteException { return 0; }
        public void remove(android.os.IBinder p0) throws android.os.RemoteException {}
        public int relayout(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, int p7, android.view.WindowRelayoutResult p8, android.view.SurfaceControl p9) throws android.os.RemoteException { return 0; }
        public void relayoutAsync(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, int p7) throws android.os.RemoteException {}
        public boolean outOfMemory(android.view.IWindow p0) throws android.os.RemoteException { return false; }
        public void setInsets(android.view.IWindow p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Region p4) throws android.os.RemoteException {}
        public void finishDrawing(android.view.IWindow p0, android.view.SurfaceControl.Transaction p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder performDrag(android.view.IWindow p0, int p1, android.view.SurfaceControl p2, int p3, int p4, int p5, float p6, float p7, float p8, float p9, android.content.ClipData p10) throws android.os.RemoteException { return null; }
        public boolean dropForAccessibility(android.view.IWindow p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public void reportDropResult(android.view.IWindow p0, boolean p1) throws android.os.RemoteException {}
        public void cancelDragAndDrop(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void dragRecipientEntered(android.view.IWindow p0) throws android.os.RemoteException {}
        public void dragRecipientExited(android.view.IWindow p0) throws android.os.RemoteException {}
        public void setWallpaperPosition(android.os.IBinder p0, float p1, float p2, float p3, float p4) throws android.os.RemoteException {}
        public void setWallpaperZoomOut(android.os.IBinder p0, float p1) throws android.os.RemoteException {}
        public void setShouldZoomOutWallpaper(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void wallpaperOffsetsComplete(android.os.IBinder p0) throws android.os.RemoteException {}
        public void setWallpaperDisplayOffset(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
        public void sendWallpaperCommand(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, android.os.Bundle p5, boolean p6) throws android.os.RemoteException {}
        public void wallpaperCommandComplete(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void onRectangleOnScreenRequested(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException {}
        public android.view.IWindowId getWindowId(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void pokeDrawLock(android.os.IBinder p0) throws android.os.RemoteException {}
        public boolean startMovingTask(android.view.IWindow p0, float p1, float p2) throws android.os.RemoteException { return false; }
        public void finishMovingTask(android.view.IWindow p0) throws android.os.RemoteException {}
        public void updateTapExcludeRegion(android.view.IWindow p0, android.graphics.Region p1) throws android.os.RemoteException {}
        public void updateRequestedVisibleTypes(android.view.IWindow p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
        public void updateAnimatingTypes(android.view.IWindow p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
        public void reportSystemGestureExclusionChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1) throws android.os.RemoteException {}
        public void reportDecorViewGestureInterceptionChanged(android.view.IWindow p0, boolean p1) throws android.os.RemoteException {}
        public void reportKeepClearAreasChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1, java.util.List<android.graphics.Rect> p2) throws android.os.RemoteException {}
        public void grantInputChannel(int p0, android.view.SurfaceControl p1, android.os.IBinder p2, android.window.InputTransferToken p3, int p4, int p5, int p6, int p7, android.os.IBinder p8, android.window.InputTransferToken p9, java.lang.String p10, android.view.InputChannel p11) throws android.os.RemoteException {}
        public void updateInputChannel(android.os.IBinder p0, android.window.InputTransferToken p1, int p2, android.view.SurfaceControl p3, int p4, int p5, int p6, android.graphics.Region p7) throws android.os.RemoteException {}
        public void grantEmbeddedWindowFocus(android.view.IWindow p0, android.window.InputTransferToken p1, boolean p2) throws android.os.RemoteException {}
        public void generateDisplayHash(android.view.IWindow p0, android.graphics.Rect p1, java.lang.String p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
        public void setOnBackInvokedCallbackInfo(android.view.IWindow p0, android.window.OnBackInvokedCallbackInfo p1) throws android.os.RemoteException {}
        public void clearTouchableRegion(android.view.IWindow p0) throws android.os.RemoteException {}
        public boolean cancelDraw(android.view.IWindow p0, int p1) throws android.os.RemoteException { return false; }
        public boolean moveFocusToAdjacentWindow(android.view.IWindow p0, int p1) throws android.os.RemoteException { return false; }
        public void notifyImeWindowVisibilityChangedFromClient(android.view.IWindow p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IWindowSession {
        public static final java.lang.String DESCRIPTOR = "android.view.IWindowSession";
        static final int TRANSACTION_addToDisplay = 1;
        static final int TRANSACTION_addToDisplayAsUser = 2;
        static final int TRANSACTION_addToDisplayWithoutInputChannel = 3;
        static final int TRANSACTION_remove = 4;
        static final int TRANSACTION_relayout = 5;
        static final int TRANSACTION_relayoutAsync = 6;
        static final int TRANSACTION_outOfMemory = 7;
        static final int TRANSACTION_setInsets = 8;
        static final int TRANSACTION_finishDrawing = 9;
        static final int TRANSACTION_performDrag = 10;
        static final int TRANSACTION_dropForAccessibility = 11;
        static final int TRANSACTION_reportDropResult = 12;
        static final int TRANSACTION_cancelDragAndDrop = 13;
        static final int TRANSACTION_dragRecipientEntered = 14;
        static final int TRANSACTION_dragRecipientExited = 15;
        static final int TRANSACTION_setWallpaperPosition = 16;
        static final int TRANSACTION_setWallpaperZoomOut = 17;
        static final int TRANSACTION_setShouldZoomOutWallpaper = 18;
        static final int TRANSACTION_wallpaperOffsetsComplete = 19;
        static final int TRANSACTION_setWallpaperDisplayOffset = 20;
        static final int TRANSACTION_sendWallpaperCommand = 21;
        static final int TRANSACTION_wallpaperCommandComplete = 22;
        static final int TRANSACTION_onRectangleOnScreenRequested = 23;
        static final int TRANSACTION_getWindowId = 24;
        static final int TRANSACTION_pokeDrawLock = 25;
        static final int TRANSACTION_startMovingTask = 26;
        static final int TRANSACTION_finishMovingTask = 27;
        static final int TRANSACTION_updateTapExcludeRegion = 28;
        static final int TRANSACTION_updateRequestedVisibleTypes = 29;
        static final int TRANSACTION_updateAnimatingTypes = 30;
        static final int TRANSACTION_reportSystemGestureExclusionChanged = 31;
        static final int TRANSACTION_reportDecorViewGestureInterceptionChanged = 32;
        static final int TRANSACTION_reportKeepClearAreasChanged = 33;
        static final int TRANSACTION_grantInputChannel = 34;
        static final int TRANSACTION_updateInputChannel = 35;
        static final int TRANSACTION_grantEmbeddedWindowFocus = 36;
        static final int TRANSACTION_generateDisplayHash = 37;
        static final int TRANSACTION_setOnBackInvokedCallbackInfo = 38;
        static final int TRANSACTION_clearTouchableRegion = 39;
        static final int TRANSACTION_cancelDraw = 40;
        static final int TRANSACTION_moveFocusToAdjacentWindow = 41;
        static final int TRANSACTION_notifyImeWindowVisibilityChangedFromClient = 42;
        public Stub() { super(); }
        public static android.view.IWindowSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.view.IWindowSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int addToDisplay(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, android.view.InputChannel p5, android.view.WindowRelayoutResult p6) throws android.os.RemoteException { return 0; }
            public int addToDisplayAsUser(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, android.view.InputChannel p6, android.view.WindowRelayoutResult p7) throws android.os.RemoteException { return 0; }
            public int addToDisplayWithoutInputChannel(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, android.view.WindowRelayoutResult p4) throws android.os.RemoteException { return 0; }
            public void remove(android.os.IBinder p0) throws android.os.RemoteException {}
            public int relayout(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, int p7, android.view.WindowRelayoutResult p8, android.view.SurfaceControl p9) throws android.os.RemoteException { return 0; }
            public void relayoutAsync(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, int p7) throws android.os.RemoteException {}
            public boolean outOfMemory(android.view.IWindow p0) throws android.os.RemoteException { return false; }
            public void setInsets(android.view.IWindow p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Region p4) throws android.os.RemoteException {}
            public void finishDrawing(android.view.IWindow p0, android.view.SurfaceControl.Transaction p1, int p2) throws android.os.RemoteException {}
            public android.os.IBinder performDrag(android.view.IWindow p0, int p1, android.view.SurfaceControl p2, int p3, int p4, int p5, float p6, float p7, float p8, float p9, android.content.ClipData p10) throws android.os.RemoteException { return null; }
            public boolean dropForAccessibility(android.view.IWindow p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public void reportDropResult(android.view.IWindow p0, boolean p1) throws android.os.RemoteException {}
            public void cancelDragAndDrop(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void dragRecipientEntered(android.view.IWindow p0) throws android.os.RemoteException {}
            public void dragRecipientExited(android.view.IWindow p0) throws android.os.RemoteException {}
            public void setWallpaperPosition(android.os.IBinder p0, float p1, float p2, float p3, float p4) throws android.os.RemoteException {}
            public void setWallpaperZoomOut(android.os.IBinder p0, float p1) throws android.os.RemoteException {}
            public void setShouldZoomOutWallpaper(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void wallpaperOffsetsComplete(android.os.IBinder p0) throws android.os.RemoteException {}
            public void setWallpaperDisplayOffset(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
            public void sendWallpaperCommand(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, android.os.Bundle p5, boolean p6) throws android.os.RemoteException {}
            public void wallpaperCommandComplete(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void onRectangleOnScreenRequested(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException {}
            public android.view.IWindowId getWindowId(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void pokeDrawLock(android.os.IBinder p0) throws android.os.RemoteException {}
            public boolean startMovingTask(android.view.IWindow p0, float p1, float p2) throws android.os.RemoteException { return false; }
            public void finishMovingTask(android.view.IWindow p0) throws android.os.RemoteException {}
            public void updateTapExcludeRegion(android.view.IWindow p0, android.graphics.Region p1) throws android.os.RemoteException {}
            public void updateRequestedVisibleTypes(android.view.IWindow p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
            public void updateAnimatingTypes(android.view.IWindow p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
            public void reportSystemGestureExclusionChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1) throws android.os.RemoteException {}
            public void reportDecorViewGestureInterceptionChanged(android.view.IWindow p0, boolean p1) throws android.os.RemoteException {}
            public void reportKeepClearAreasChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1, java.util.List<android.graphics.Rect> p2) throws android.os.RemoteException {}
            public void grantInputChannel(int p0, android.view.SurfaceControl p1, android.os.IBinder p2, android.window.InputTransferToken p3, int p4, int p5, int p6, int p7, android.os.IBinder p8, android.window.InputTransferToken p9, java.lang.String p10, android.view.InputChannel p11) throws android.os.RemoteException {}
            public void updateInputChannel(android.os.IBinder p0, android.window.InputTransferToken p1, int p2, android.view.SurfaceControl p3, int p4, int p5, int p6, android.graphics.Region p7) throws android.os.RemoteException {}
            public void grantEmbeddedWindowFocus(android.view.IWindow p0, android.window.InputTransferToken p1, boolean p2) throws android.os.RemoteException {}
            public void generateDisplayHash(android.view.IWindow p0, android.graphics.Rect p1, java.lang.String p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
            public void setOnBackInvokedCallbackInfo(android.view.IWindow p0, android.window.OnBackInvokedCallbackInfo p1) throws android.os.RemoteException {}
            public void clearTouchableRegion(android.view.IWindow p0) throws android.os.RemoteException {}
            public boolean cancelDraw(android.view.IWindow p0, int p1) throws android.os.RemoteException { return false; }
            public boolean moveFocusToAdjacentWindow(android.view.IWindow p0, int p1) throws android.os.RemoteException { return false; }
            public void notifyImeWindowVisibilityChangedFromClient(android.view.IWindow p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
        }
    }
}
