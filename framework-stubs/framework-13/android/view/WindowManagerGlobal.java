package android.view;

public final class WindowManagerGlobal {
    public static final int RELAYOUT_RES_FIRST_TIME = 1;
    public static final int RELAYOUT_RES_SURFACE_CHANGED = 2;
    public static final int RELAYOUT_RES_SURFACE_RESIZED = 4;
    public static final int RELAYOUT_RES_CONSUME_ALWAYS_SYSTEM_BARS = 8;
    public static final int RELAYOUT_RES_CANCEL_AND_REDRAW = 16;
    public static final int RELAYOUT_INSETS_PENDING = 1;
    public static final int ADD_FLAG_IN_TOUCH_MODE = 1;
    public static final int ADD_FLAG_APP_VISIBLE = 2;
    public static final int ADD_FLAG_USE_BLAST = 8;
    public static final int ADD_FLAG_ALWAYS_CONSUME_SYSTEM_BARS = 4;
    public static final int ADD_OKAY = 0;
    public static final int ADD_BAD_APP_TOKEN = -1;
    public static final int ADD_BAD_SUBWINDOW_TOKEN = -2;
    public static final int ADD_NOT_APP_TOKEN = -3;
    public static final int ADD_APP_EXITING = -4;
    public static final int ADD_DUPLICATE_ADD = -5;
    public static final int ADD_STARTING_NOT_NEEDED = -6;
    public static final int ADD_MULTIPLE_SINGLETON = -7;
    public static final int ADD_PERMISSION_DENIED = -8;
    public static final int ADD_INVALID_DISPLAY = -9;
    public static final int ADD_INVALID_TYPE = -10;
    public static final int ADD_INVALID_USER = -11;
    public static void initialize() {}
    public static android.view.WindowManagerGlobal getInstance() { return null; }
    public static android.view.IWindowManager getWindowManagerService() { return null; }
    public static android.view.IWindowSession getWindowSession() { return null; }
    public static android.view.IWindowSession peekWindowSession() { return null; }
    public static boolean useBLAST() { return false; }
    public java.lang.String[] getViewRootNames() { return null; }
    public java.util.ArrayList<android.view.ViewRootImpl> getRootViews(android.os.IBinder p0) { return null; }
    public java.util.ArrayList<android.view.View> getWindowViews() { return null; }
    public android.view.View getWindowView(android.os.IBinder p0) { return null; }
    public android.view.View getRootView(java.lang.String p0) { return null; }
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1, android.view.Display p2, android.view.Window p3, int p4) {}
    public void updateViewLayout(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void removeView(android.view.View p0, boolean p1) {}
    public void closeAll(android.os.IBinder p0, java.lang.String p1, java.lang.String p2) {}
    public void closeAllExceptView(android.os.IBinder p0, android.view.View p1, java.lang.String p2, java.lang.String p3) {}
    void doRemoveView(android.view.ViewRootImpl p0) {}
    public static boolean shouldDestroyEglContext(int p0) { return false; }
    public void trimMemory(int p0) {}
    public static void trimForeground() {}
    public void dumpGfxInfo(java.io.FileDescriptor p0, java.lang.String[] p1) {}
    public void setStoppedState(android.os.IBinder p0, boolean p1) {}
    public void reportNewConfiguration(android.content.res.Configuration p0) {}
    public void changeCanvasOpacity(android.os.IBinder p0, boolean p1) {}
    public android.view.SurfaceControl mirrorWallpaperSurface(int p0) { return null; }
    public void addWindowlessRoot(android.view.ViewRootImpl p0) {}
    public void removeWindowlessRoot(android.view.ViewRootImpl p0) {}
    public void setRecentsAppBehindSystemBars(boolean p0) {}
}
