package android.view;

public class WindowlessWindowManager implements android.view.IWindowSession {
    private static final java.lang.String TAG = "WindowlessWindowManager";
    final java.util.HashMap<android.os.IBinder, android.view.WindowlessWindowManager.State> mStateForWindow = null;
    final java.util.HashMap<android.os.IBinder, android.view.WindowlessWindowManager.ResizeCompleteCallback> mResizeCompletionForWindow = null;
    private final android.view.SurfaceSession mSurfaceSession = null;
    private final android.view.SurfaceControl mRootSurface = null;
    private final android.content.res.Configuration mConfiguration = null;
    private final android.view.IWindowSession mRealWm = null;
    private final android.os.IBinder mHostInputToken = null;
    private int mForceHeight;
    private int mForceWidth;
    public WindowlessWindowManager(android.content.res.Configuration p0, android.view.SurfaceControl p1, android.os.IBinder p2) {}
    protected void setConfiguration(android.content.res.Configuration p0) {}
    void setCompletionCallback(android.os.IBinder p0, android.view.WindowlessWindowManager.ResizeCompleteCallback p1) {}
    protected void setTouchRegion(android.os.IBinder p0, android.graphics.Region p1) {}
    public int addToDisplay(android.view.IWindow p0, int p1, android.view.WindowManager.LayoutParams p2, int p3, int p4, android.graphics.Rect p5, android.graphics.Rect p6, android.graphics.Rect p7, android.view.DisplayCutout.ParcelableWrapper p8, android.view.InputChannel p9, android.view.InsetsState p10, android.view.InsetsSourceControl[] p11) { return 0; }
    public int addToDisplayAsUser(android.view.IWindow p0, int p1, android.view.WindowManager.LayoutParams p2, int p3, int p4, int p5, android.graphics.Rect p6, android.graphics.Rect p7, android.graphics.Rect p8, android.view.DisplayCutout.ParcelableWrapper p9, android.view.InputChannel p10, android.view.InsetsState p11, android.view.InsetsSourceControl[] p12) { return 0; }
    public int addToDisplayWithoutInputChannel(android.view.IWindow p0, int p1, android.view.WindowManager.LayoutParams p2, int p3, int p4, android.graphics.Rect p5, android.graphics.Rect p6, android.view.InsetsState p7) { return 0; }
    public void remove(android.view.IWindow p0) throws android.os.RemoteException {}
    private boolean isOpaque(android.view.WindowManager.LayoutParams p0) { return false; }
    protected android.view.SurfaceControl getSurfaceControl(android.view.View p0) { return null; }
    public int relayout(android.view.IWindow p0, int p1, android.view.WindowManager.LayoutParams p2, int p3, int p4, int p5, int p6, long p7, android.graphics.Rect p8, android.graphics.Rect p9, android.graphics.Rect p10, android.graphics.Rect p11, android.graphics.Rect p12, android.view.DisplayCutout.ParcelableWrapper p13, android.util.MergedConfiguration p14, android.view.SurfaceControl p15, android.view.InsetsState p16, android.view.InsetsSourceControl[] p17, android.graphics.Point p18, android.view.SurfaceControl p19) { return 0; }
    public void prepareToReplaceWindows(android.os.IBinder p0, boolean p1) {}
    public boolean outOfMemory(android.view.IWindow p0) { return false; }
    public void setTransparentRegion(android.view.IWindow p0, android.graphics.Region p1) {}
    public void setInsets(android.view.IWindow p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Region p4) {}
    public void getDisplayFrame(android.view.IWindow p0, android.graphics.Rect p1) {}
    public void finishDrawing(android.view.IWindow p0, android.view.SurfaceControl.Transaction p1) {}
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
    public void reparentDisplayContent(android.view.IWindow p0, android.view.SurfaceControl p1, int p2) {}
    public void updateDisplayContentLocation(android.view.IWindow p0, int p1, int p2, int p3) {}
    public void updateTapExcludeRegion(android.view.IWindow p0, android.graphics.Region p1) {}
    public void insetsModified(android.view.IWindow p0, android.view.InsetsState p1) {}
    public void reportSystemGestureExclusionChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1) {}
    public void grantInputChannel(int p0, android.view.SurfaceControl p1, android.view.IWindow p2, android.os.IBinder p3, int p4, int p5, android.view.InputChannel p6) {}
    public void updateInputChannel(android.os.IBinder p0, int p1, android.view.SurfaceControl p2, int p3, android.graphics.Region p4) {}
    public android.os.IBinder asBinder() { return null; }
    private int getSurfaceWidth(android.view.WindowManager.LayoutParams p0) { return 0; }
    private int getSurfaceHeight(android.view.WindowManager.LayoutParams p0) { return 0; }

    public static interface ResizeCompleteCallback {
        public void finished(android.view.SurfaceControl.Transaction p0);
    }

    private class State {
        android.view.SurfaceControl mSurfaceControl;
        android.view.WindowManager.LayoutParams mParams;
        int mDisplayId;
        android.os.IBinder mInputChannelToken;
        android.graphics.Region mInputRegion;
        State(android.view.WindowlessWindowManager p0, android.view.SurfaceControl p1, android.view.WindowManager.LayoutParams p2, int p3, android.os.IBinder p4) {}
    }
}
