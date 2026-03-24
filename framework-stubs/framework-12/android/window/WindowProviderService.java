package android.window;

public abstract class WindowProviderService extends android.app.Service {
    private final android.window.WindowTokenClient mWindowToken = null;
    private final android.window.WindowContextController mController = null;
    private android.view.WindowManager mWindowManager;
    public WindowProviderService() { super(); }
    @android.annotation.SuppressLint("OnNameExpected")
    public abstract int getWindowType();
    @android.annotation.SuppressLint({"OnNameExpected", "NullableCollection"})
    public android.os.Bundle getWindowContextOptions() { return null; }
    public final void attachToWindowToken(android.os.IBinder p0) {}
    public final android.content.Context createServiceBaseContext(android.app.ActivityThread p0, android.app.LoadedApk p1) { return null; }
    public void onCreate() {}
    @android.annotation.SuppressLint("OnNameExpected")
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    public void onDestroy() {}
}
