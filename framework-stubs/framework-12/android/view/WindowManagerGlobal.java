package android.view;

public final class WindowManagerGlobal {
    private static final java.lang.String TAG = "WindowManager";
    private static boolean sUseBLASTAdapter;
    public static final int RELAYOUT_RES_IN_TOUCH_MODE = 1;
    public static final int RELAYOUT_RES_FIRST_TIME = 2;
    public static final int RELAYOUT_RES_SURFACE_CHANGED = 4;
    public static final int RELAYOUT_RES_DRAG_RESIZING_DOCKED = 8;
    public static final int RELAYOUT_RES_DRAG_RESIZING_FREEFORM = 16;
    public static final int RELAYOUT_RES_SURFACE_RESIZED = 32;
    public static final int RELAYOUT_RES_CONSUME_ALWAYS_SYSTEM_BARS = 64;
    public static final int RELAYOUT_RES_BLAST_SYNC = 128;
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
    private static android.view.WindowManagerGlobal sDefaultWindowManager;
    private static android.view.IWindowManager sWindowManagerService;
    private static android.view.IWindowSession sWindowSession;
    private final java.lang.Object mLock = null;
    private final java.util.ArrayList<android.view.View> mViews = null;
    private final java.util.ArrayList<android.view.ViewRootImpl> mRoots = null;
    private final java.util.ArrayList<android.view.WindowManager.LayoutParams> mParams = null;
    private final android.util.ArraySet<android.view.View> mDyingViews = null;
    private java.lang.Runnable mSystemPropertyUpdater;
    private WindowManagerGlobal() {}
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
    private void removeViewLocked(int p0, boolean p1) {}
    void doRemoveView(android.view.ViewRootImpl p0) {}
    private int findViewLocked(android.view.View p0, boolean p1) { return 0; }
    public static boolean shouldDestroyEglContext(int p0) { return false; }
    public void trimMemory(int p0) {}
    public static void trimForeground() {}
    private void doTrimForeground() {}
    public void dumpGfxInfo(java.io.FileDescriptor p0, java.lang.String[] p1) {}
    private static java.lang.String getWindowName(android.view.ViewRootImpl p0) { return null; }
    public void setStoppedState(android.os.IBinder p0, boolean p1) {}
    public void reportNewConfiguration(android.content.res.Configuration p0) {}
    public void changeCanvasOpacity(android.os.IBinder p0, boolean p1) {}
}
