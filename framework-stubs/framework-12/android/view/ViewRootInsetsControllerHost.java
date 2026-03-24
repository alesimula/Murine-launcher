package android.view;

public class ViewRootInsetsControllerHost implements android.view.InsetsController.Host {
    private final java.lang.String TAG = null;
    private final android.view.ViewRootImpl mViewRoot = null;
    private android.view.SyncRtSurfaceTransactionApplier mApplier;
    public ViewRootInsetsControllerHost(android.view.ViewRootImpl p0) {}
    public android.os.Handler getHandler() { return null; }
    public void notifyInsetsChanged() {}
    public void addOnPreDrawRunnable(java.lang.Runnable p0) {}
    public void dispatchWindowInsetsAnimationPrepare(android.view.WindowInsetsAnimation p0) {}
    public android.view.WindowInsetsAnimation.Bounds dispatchWindowInsetsAnimationStart(android.view.WindowInsetsAnimation p0, android.view.WindowInsetsAnimation.Bounds p1) { return null; }
    public android.view.WindowInsets dispatchWindowInsetsAnimationProgress(android.view.WindowInsets p0, java.util.List<android.view.WindowInsetsAnimation> p1) { return null; }
    public void dispatchWindowInsetsAnimationEnd(android.view.WindowInsetsAnimation p0) {}
    public void applySurfaceParams(android.view.SyncRtSurfaceTransactionApplier.SurfaceParams... p0) {}
    public void postInsetsAnimationCallback(java.lang.Runnable p0) {}
    public void updateCompatSysUiVisibility(int p0, boolean p1, boolean p2) {}
    public void onInsetsModified(android.view.InsetsState p0) {}
    public boolean hasAnimationCallbacks() { return false; }
    public void setSystemBarsAppearance(int p0, int p1) {}
    public int getSystemBarsAppearance() { return 0; }
    public boolean isSystemBarsAppearanceControlled() { return false; }
    public void setSystemBarsBehavior(int p0) {}
    public int getSystemBarsBehavior() { return 0; }
    public boolean isSystemBarsBehaviorControlled() { return false; }
    public void releaseSurfaceControlFromRt(android.view.SurfaceControl p0) {}
    public android.view.inputmethod.InputMethodManager getInputMethodManager() { return null; }
    public java.lang.String getRootViewTitle() { return null; }
    public int dipToPx(int p0) { return 0; }
    public android.os.IBinder getWindowToken() { return null; }
    public android.content.res.CompatibilityInfo.Translator getTranslator() { return null; }
}
