package android.service.dreams;

public class DreamService extends android.app.Service implements android.view.Window.Callback {
    public static final java.lang.String DREAM_SERVICE = "dreams";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.dreams.DreamService";
    public static final java.lang.String DREAM_META_DATA = "android.service.dream";
    public static final boolean DEFAULT_SHOW_COMPLICATIONS = false;
    public static final int DREAM_CATEGORY_DEFAULT = 0;
    public static final int DREAM_CATEGORY_LOW_LIGHT = 1;
    public static final int DREAM_CATEGORY_HOME_PANEL = 2;
    static final java.lang.String EXTRA_DREAM_OVERLAY_COMPONENT = "android.service.dream.DreamService.dream_overlay_component";
    public DreamService() { super(); }
    public DreamService(android.service.dreams.DreamService.Injector p0) { super(); }
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
    public android.app.Activity getActivity() { return null; }
    public void setContentView(int p0) {}
    public void setContentView(android.view.View p0) {}
    public void setContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void addContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public <T extends android.view.View> T findViewById(int p0) { return null; }
    @android.annotation.NonNull
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
    public void setDozeScreenState(int p0, int p1, boolean p2) {}
    public boolean getUseNormalBrightnessForDoze() { return false; }
    public int getDozeScreenBrightness() { return 0; }
    public void setDozeScreenBrightness(int p0) {}
    public void setScreenBrightness(float p0) {}
    public void setDozeScreenBrightnessFloat(float p0) {}
    public void onCreate() {}
    public void onDreamingStarted() {}
    public void onDreamingStopped() {}
    public void onWakeUp() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    public final void finish() {}
    public final void wakeUp() {}
    public boolean getRedirectWake() { return false; }
    public void onDestroy() {}
    @android.annotation.Nullable
    public static android.service.dreams.DreamService.DreamMetadata getDreamMetadata(android.content.Context p0, android.content.pm.ServiceInfo p1) { return null; }
    @android.annotation.Nullable
    public static android.service.dreams.DreamService.DreamMetadata getDreamMetadata(android.content.pm.PackageManager p0, android.content.pm.ServiceInfo p1) { return null; }
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    protected void dumpOnHandler(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public static void setDreamOverlayComponent(android.content.Intent p0, android.content.ComponentName p1) {}

    private static final class DefaultInjector implements android.service.dreams.DreamService.Injector {
        public void init(android.content.Context p0) {}
        public android.service.dreams.DreamOverlayConnectionHandler createOverlayConnection(android.content.ComponentName p0, java.lang.Runnable p1) { return null; }
        public android.content.ComponentName getDreamActivityComponent() { return null; }
        public android.content.ComponentName getDreamComponent() { return null; }
        public java.lang.String getDreamPackageName() { return null; }
        public android.service.dreams.IDreamManager getDreamManager() { return null; }
        public android.content.pm.ServiceInfo getServiceInfo() { return null; }
        public android.os.Handler getHandler() { return null; }
        public android.content.pm.PackageManager getPackageManager() { return null; }
        public android.content.res.Resources getResources() { return null; }
    }

    public static final class DreamActivityCallbacks extends android.os.Binder {
        public DreamActivityCallbacks(android.os.IBinder p0, java.lang.ref.WeakReference<android.service.dreams.DreamService> p1) { super(); }
        public void onActivityCreated(android.service.dreams.DreamActivity p0) {}
        public void onActivityDestroyed() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface DreamCategory {
    }

    public static final class DreamMetadata {
        @android.annotation.Nullable
        public final android.content.ComponentName settingsActivity = null;
        @android.annotation.Nullable
        public final android.graphics.drawable.Drawable previewImage = null;
        @android.annotation.NonNull
        public final boolean showComplications = false;
        @android.annotation.NonNull
        @android.annotation.FlaggedApi("android.service.controls.flags.home_panel_dream")
        public final int dreamCategory = 0;
        public DreamMetadata(android.content.ComponentName p0, android.graphics.drawable.Drawable p1, boolean p2, int p3) {}
    }

    static final class DreamServiceWrapper extends android.service.dreams.IDreamService.Stub {
        final java.lang.ref.WeakReference<android.service.dreams.DreamService> mService = null;
        DreamServiceWrapper(java.lang.ref.WeakReference<android.service.dreams.DreamService> p0) { super(); }
        public void attach(android.os.IBinder p0, boolean p1, boolean p2, android.os.IRemoteCallback p3) {}
        public void detach() {}
        public void wakeUp() {}
        public void comeToFront() {}
    }

    public static interface Injector {
        public void init(android.content.Context p0);
        public android.service.dreams.DreamOverlayConnectionHandler createOverlayConnection(android.content.ComponentName p0, java.lang.Runnable p1);
        public android.content.ComponentName getDreamActivityComponent();
        public android.content.ComponentName getDreamComponent();
        public java.lang.String getDreamPackageName();
        public android.service.dreams.IDreamManager getDreamManager();
        public android.content.pm.ServiceInfo getServiceInfo();
        public android.os.Handler getHandler();
        public android.content.pm.PackageManager getPackageManager();
        public android.content.res.Resources getResources();
    }
}
