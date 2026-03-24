package android.view;

public final class WindowManagerImpl implements android.view.WindowManager {
    @android.annotation.UnsupportedAppUsage
    private final android.view.WindowManagerGlobal mGlobal = null;
    private final android.content.Context mContext = null;
    private final android.view.Window mParentWindow = null;
    private android.os.IBinder mDefaultToken;
    public WindowManagerImpl(android.content.Context p0) {}
    private WindowManagerImpl(android.content.Context p0, android.view.Window p1) {}
    public android.view.WindowManagerImpl createLocalWindowManager(android.view.Window p0) { return null; }
    public android.view.WindowManagerImpl createPresentationWindowManager(android.content.Context p0) { return null; }
    public void setDefaultToken(android.os.IBinder p0) {}
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void updateViewLayout(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    private void applyDefaultToken(android.view.ViewGroup.LayoutParams p0) {}
    public void removeView(android.view.View p0) {}
    public void removeViewImmediate(android.view.View p0) {}
    public void requestAppKeyboardShortcuts(android.view.WindowManager.KeyboardShortcutsReceiver p0, int p1) {}
    public android.view.Display getDefaultDisplay() { return null; }
    public android.graphics.Region getCurrentImeTouchRegion() { return null; }
    public void setShouldShowWithInsecureKeyguard(int p0, boolean p1) {}
    public void setShouldShowSystemDecors(int p0, boolean p1) {}
    public boolean shouldShowSystemDecors(int p0) { return false; }
    public void setShouldShowIme(int p0, boolean p1) {}
    public boolean shouldShowIme(int p0) { return false; }
}
