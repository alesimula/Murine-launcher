package android.view;

public class WindowlessWindowManager implements android.view.IWindowSession {
    final java.util.HashMap<android.os.IBinder, android.view.WindowlessWindowManager.State> mStateForWindow = null;
    final java.util.HashMap<android.os.IBinder, android.view.WindowlessWindowManager.ResizeCompleteCallback> mResizeCompletionForWindow = null;
    protected final android.view.SurfaceControl mRootSurface = null;
    public WindowlessWindowManager(android.content.res.Configuration p0, android.view.SurfaceControl p1, android.os.IBinder p2) {}
    public void setConfiguration(android.content.res.Configuration p0) {}
    android.os.IBinder getFocusGrantToken() { return null; }
    void setCompletionCallback(android.os.IBinder p0, android.view.WindowlessWindowManager.ResizeCompleteCallback p1) {}
    protected void setTouchRegion(android.os.IBinder p0, android.graphics.Region p1) {}
    protected void attachToParentSurface(android.view.IWindow p0, android.view.SurfaceControl.Builder p1) {}
    public int addToDisplay(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, android.view.InsetsVisibilities p4, android.view.InputChannel p5, android.view.InsetsState p6, android.view.InsetsSourceControl[] p7, android.graphics.Rect p8, float[] p9) { return 0; }
    public int addToDisplayAsUser(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, android.view.InsetsVisibilities p5, android.view.InputChannel p6, android.view.InsetsState p7, android.view.InsetsSourceControl[] p8, android.graphics.Rect p9, float[] p10) { return 0; }
    public int addToDisplayWithoutInputChannel(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, android.view.InsetsState p4, android.graphics.Rect p5, float[] p6) { return 0; }
    public void remove(android.view.IWindow p0) throws android.os.RemoteException {}
    protected void removeSurface(android.view.SurfaceControl p0) {}
    protected android.os.IBinder getWindowBinder(android.view.View p0) { return null; }
    protected android.view.SurfaceControl getSurfaceControl(android.view.View p0) { return null; }
    protected android.view.SurfaceControl getSurfaceControl(android.view.IWindow p0) { return null; }
    public int relayout(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, int p7, android.window.ClientWindowFrames p8, android.util.MergedConfiguration p9, android.view.SurfaceControl p10, android.view.InsetsState p11, android.view.InsetsSourceControl[] p12, android.os.Bundle p13) { return 0; }
    public void relayoutAsync(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, int p7) {}
    public void prepareToReplaceWindows(android.os.IBinder p0, boolean p1) {}
    public boolean outOfMemory(android.view.IWindow p0) { return false; }
    public void setInsets(android.view.IWindow p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Region p4) {}
    public void clearTouchableRegion(android.view.IWindow p0) {}
    public void finishDrawing(android.view.IWindow p0, android.view.SurfaceControl.Transaction p1, int p2) {}
    public void setInTouchMode(boolean p0) {}
    public boolean getInTouchMode() { return false; }
    public boolean performHapticFeedback(int p0, boolean p1) { return false; }
    public android.os.IBinder performDrag(android.view.IWindow p0, int p1, android.view.SurfaceControl p2, int p3, float p4, float p5, float p6, float p7, android.content.ClipData p8) { return null; }
    public void reportDropResult(android.view.IWindow p0, boolean p1) {}
    public void cancelDragAndDrop(android.os.IBinder p0, boolean p1) {}
    public void dragRecipientEntered(android.view.IWindow p0) {}
    public void dragRecipientExited(android.view.IWindow p0) {}
    public void setWallpaperPosition(android.os.IBinder p0, float p1, float p2, float p3, float p4) {}
    public void setWallpaperZoomOut(android.os.IBinder p0, float p1) {}
    public void setShouldZoomOutWallpaper(android.os.IBinder p0, boolean p1) {}
    public void wallpaperOffsetsComplete(android.os.IBinder p0) {}
    public void setWallpaperDisplayOffset(android.os.IBinder p0, int p1, int p2) {}
    public android.os.Bundle sendWallpaperCommand(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, android.os.Bundle p5, boolean p6) { return null; }
    public void wallpaperCommandComplete(android.os.IBinder p0, android.os.Bundle p1) {}
    public void onRectangleOnScreenRequested(android.os.IBinder p0, android.graphics.Rect p1) {}
    public android.view.IWindowId getWindowId(android.os.IBinder p0) { return null; }
    public void pokeDrawLock(android.os.IBinder p0) {}
    public boolean startMovingTask(android.view.IWindow p0, float p1, float p2) { return false; }
    public void finishMovingTask(android.view.IWindow p0) {}
    public void updatePointerIcon(android.view.IWindow p0) {}
    public void updateTapExcludeRegion(android.view.IWindow p0, android.graphics.Region p1) {}
    public void updateRequestedVisibilities(android.view.IWindow p0, android.view.InsetsVisibilities p1) {}
    public void reportSystemGestureExclusionChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1) {}
    public void reportKeepClearAreasChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1, java.util.List<android.graphics.Rect> p2) {}
    public void grantInputChannel(int p0, android.view.SurfaceControl p1, android.view.IWindow p2, android.os.IBinder p3, int p4, int p5, int p6, android.os.IBinder p7, java.lang.String p8, android.view.InputChannel p9) {}
    public void updateInputChannel(android.os.IBinder p0, int p1, android.view.SurfaceControl p2, int p3, int p4, android.graphics.Region p5) {}
    public android.os.IBinder asBinder() { return null; }
    public void grantEmbeddedWindowFocus(android.view.IWindow p0, android.os.IBinder p1, boolean p2) {}
    public void generateDisplayHash(android.view.IWindow p0, android.graphics.Rect p1, java.lang.String p2, android.os.RemoteCallback p3) {}
    public void setOnBackInvokedCallbackInfo(android.view.IWindow p0, android.window.OnBackInvokedCallbackInfo p1) throws android.os.RemoteException {}
    public boolean dropForAccessibility(android.view.IWindow p0, int p1, int p2) { return false; }
    public void setInsetsState(android.view.InsetsState p0) {}
    public boolean cancelDraw(android.view.IWindow p0) { return false; }

    public static interface ResizeCompleteCallback {
        public void finished(android.view.SurfaceControl.Transaction p0);
    }

    private class State {
        android.view.SurfaceControl mSurfaceControl;
        android.view.WindowManager.LayoutParams mParams;
        int mDisplayId;
        android.os.IBinder mInputChannelToken;
        android.graphics.Region mInputRegion;
        android.view.IWindow mClient;
        State(android.view.WindowlessWindowManager p0, android.view.SurfaceControl p1, android.view.WindowManager.LayoutParams p2, int p3, android.os.IBinder p4, android.view.IWindow p5) {}
    }
}
