package android.window;

public class WindowContext extends android.content.ContextWrapper implements android.window.WindowProvider, android.window.ConfigurationDispatcher {
    public WindowContext(android.content.Context p0, int p1, android.os.Bundle p2) { super(null); }
    public void attachToDisplayArea() {}
    public void reparentToDisplay(int p0) {}
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public void release() {}
    public void destroy() {}
    public void registerComponentCallbacks(android.content.ComponentCallbacks p0) {}
    public void unregisterComponentCallbacks(android.content.ComponentCallbacks p0) {}
    public void setWindowTypeOverride(int p0) {}
    public void attachWindow(android.view.View p0) {}
    public static boolean shouldFallbackToDefaultDisplay(android.os.Bundle p0) { return false; }
    public int getWindowType() { return 0; }
    @android.annotation.Nullable
    public android.os.Bundle getWindowContextOptions() { return null; }
    public int getWindowTypeOverride() { return 0; }
    public boolean shouldReportPrivateChanges() { return false; }
    public void dispatchConfigurationChanged(android.content.res.Configuration p0) {}

    private static class WindowWrapper extends android.window.WindowBase {
        WindowWrapper(android.content.Context p0, android.view.View p1) { super(null); }
        @android.annotation.NonNull
        public android.view.LayoutInflater getLayoutInflater() { return null; }
        @android.annotation.NonNull
        public android.view.View getDecorView() { return null; }
        public android.view.View peekDecorView() { return null; }
    }
}
