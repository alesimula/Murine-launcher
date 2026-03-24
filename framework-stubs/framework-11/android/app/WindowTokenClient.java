package android.app;

public class WindowTokenClient extends android.app.IWindowToken.Stub {
    private java.lang.ref.WeakReference<android.app.WindowContext> mContextRef;
    private final android.app.ResourcesManager mResourcesManager = null;
    public WindowTokenClient() { super(); }
    void attachContext(android.app.WindowContext p0) {}
    public void onConfigurationChanged(android.content.res.Configuration p0, int p1) {}
    public void onWindowTokenRemoved() {}
}
