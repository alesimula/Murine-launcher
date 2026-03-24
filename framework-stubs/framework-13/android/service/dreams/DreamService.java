package android.service.dreams;

public class DreamService extends android.app.Service implements android.view.Window.Callback {
    public static final java.lang.String DREAM_SERVICE = "dreams";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.dreams.DreamService";
    public static final java.lang.String EXTRA_DREAM_OVERLAY_COMPONENT = "android.service.dream.DreamService.dream_overlay_component";
    public static final java.lang.String DREAM_META_DATA = "android.service.dream";
    public static final boolean DEFAULT_SHOW_COMPLICATIONS = false;
    public DreamService() { super(); }
    public void setDebug(boolean p0) {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public android.view.View onCreatePanelView(int p0) { return null; }
    public boolean onCreatePanelMenu(int p0, android.view.Menu p1) { return false; }
    public boolean onPreparePanel(int p0, android.view.View p1, android.view.Menu p2) { return false; }
    public boolean onMenuOpened(int p0, android.view.Menu p1) { return false; }
    public boolean onMenuItemSelected(int p0, android.view.MenuItem p1) { return false; }
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams p0) {}
    public void onContentChanged() {}
    public void onWindowFocusChanged(boolean p0) {}
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    public void onPanelClosed(int p0, android.view.Menu p1) {}
    public boolean onSearchRequested(android.view.SearchEvent p0) { return false; }
    public boolean onSearchRequested() { return false; }
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback p0) { return null; }
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback p0, int p1) { return null; }
    public void onActionModeStarted(android.view.ActionMode p0) {}
    public void onActionModeFinished(android.view.ActionMode p0) {}
    public android.view.WindowManager getWindowManager() { return null; }
    public android.view.Window getWindow() { return null; }
    public void setContentView(int p0) {}
    public void setContentView(android.view.View p0) {}
    public void setContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void addContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public <T extends android.view.View> T findViewById(int p0) { return null; }
    public final <T extends android.view.View> T requireViewById(int p0) { return null; }
    public void setInteractive(boolean p0) {}
    public boolean isInteractive() { return false; }
    public void setFullscreen(boolean p0) {}
    public boolean isFullscreen() { return false; }
    public void setScreenBright(boolean p0) {}
    public boolean isScreenBright() { return false; }
    public void setWindowless(boolean p0) {}
    public boolean isWindowless() { return false; }
    public boolean canDoze() { return false; }
    public void startDozing() {}
    public void stopDozing() {}
    public boolean isDozing() { return false; }
    public int getDozeScreenState() { return 0; }
    public void setDozeScreenState(int p0) {}
    public int getDozeScreenBrightness() { return 0; }
    public void setDozeScreenBrightness(int p0) {}
    public void onCreate() {}
    public void onDreamingStarted() {}
    public void onDreamingStopped() {}
    public void onWakeUp() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    public final void finish() {}
    public final void wakeUp() {}
    public void onDestroy() {}
    public static android.service.dreams.DreamService.DreamMetadata getDreamMetadata(android.content.Context p0, android.content.pm.ServiceInfo p1) { return null; }
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    protected void dumpOnHandler(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    final class DreamActivityCallback extends android.os.Binder {
        DreamActivityCallback(android.service.dreams.DreamService p0, android.os.IBinder p1) { super(); }
        void onActivityCreated(android.service.dreams.DreamActivity p0) {}
    }

    final class DreamActivityCallbacks extends android.os.Binder {
        DreamActivityCallbacks(android.service.dreams.DreamService p0, android.os.IBinder p1) { super(); }
        void onActivityCreated(android.service.dreams.DreamActivity p0) {}
        void onActivityDestroyed() {}
    }

    public static final class DreamMetadata {
        public final android.content.ComponentName settingsActivity = null;
        public final android.graphics.drawable.Drawable previewImage = null;
        public final boolean showComplications = false;
        DreamMetadata(android.content.ComponentName p0, android.graphics.drawable.Drawable p1, boolean p2) {}
    }

    final class DreamServiceWrapper extends android.service.dreams.IDreamService.Stub {
        DreamServiceWrapper(android.service.dreams.DreamService p0) { super(); }
        public void attach(android.os.IBinder p0, boolean p1, boolean p2, android.os.IRemoteCallback p3) {}
        public void detach() {}
        public void wakeUp() {}
    }

    private static class OverlayConnection implements android.content.ServiceConnection {
        OverlayConnection() {}
        public void bind(android.content.Context p0, android.content.ComponentName p1, android.content.ComponentName p2) {}
        public void unbind(android.content.Context p0) {}
        public void request(java.util.function.Consumer<android.service.dreams.IDreamOverlay> p0) {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
    }
}
