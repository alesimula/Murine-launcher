package android.view;

public final class WindowManagerImpl implements android.view.WindowManager {
    private final android.view.WindowManagerGlobal mGlobal = null;
    public final android.content.Context mContext = null;
    private final android.view.Window mParentWindow = null;
    private android.os.IBinder mDefaultToken;
    private final android.os.IBinder mWindowContextToken = null;
    public WindowManagerImpl(android.content.Context p0) {}
    private WindowManagerImpl(android.content.Context p0, android.view.Window p1, android.os.IBinder p2) {}
    public android.view.WindowManagerImpl createLocalWindowManager(android.view.Window p0) { return null; }
    public android.view.WindowManagerImpl createPresentationWindowManager(android.content.Context p0) { return null; }
    public static android.view.WindowManager createWindowContextWindowManager(android.content.Context p0) { return null; }
    public void setDefaultToken(android.os.IBinder p0) {}
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void updateViewLayout(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    private void applyTokens(android.view.ViewGroup.LayoutParams p0) {}
    public void removeView(android.view.View p0) {}
    public void removeViewImmediate(android.view.View p0) {}
    public void requestAppKeyboardShortcuts(android.view.WindowManager.KeyboardShortcutsReceiver p0, int p1) {}
    public android.view.Display getDefaultDisplay() { return null; }
    public android.graphics.Region getCurrentImeTouchRegion() { return null; }
    public void setShouldShowWithInsecureKeyguard(int p0, boolean p1) {}
    public void setShouldShowSystemDecors(int p0, boolean p1) {}
    public boolean shouldShowSystemDecors(int p0) { return false; }
    public void setDisplayImePolicy(int p0, int p1) {}
    @android.view.WindowManager.DisplayImePolicy
    public int getDisplayImePolicy(int p0) { return 0; }
    public android.view.WindowMetrics getCurrentWindowMetrics() { return null; }
    private static android.graphics.Rect getCurrentBounds(android.content.Context p0) { return null; }
    public android.view.WindowMetrics getMaximumWindowMetrics() { return null; }
    private static android.graphics.Rect getMaximumBounds(android.content.Context p0) { return null; }
    private android.view.WindowInsets computeWindowInsets(android.graphics.Rect p0) { return null; }
    private android.view.WindowInsets getWindowInsetsFromServer(android.view.WindowManager.LayoutParams p0, android.graphics.Rect p1) { return null; }
    public void holdLock(android.os.IBinder p0, int p1) {}
    public boolean isCrossWindowBlurEnabled() { return false; }
    public void addCrossWindowBlurEnabledListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    public void addCrossWindowBlurEnabledListener(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Boolean> p1) {}
    public void removeCrossWindowBlurEnabledListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    public boolean isTaskSnapshotSupported() { return false; }
}
