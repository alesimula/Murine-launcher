package android.window;

public abstract class WindowProviderService extends android.app.Service implements android.window.WindowProvider, android.window.ConfigurationDispatcher {
    public static boolean isWindowProviderService(android.os.Bundle p0) { return false; }
    public WindowProviderService() { super(); }
    @android.annotation.SuppressLint("OnNameExpected")
    public abstract int getWindowType();
    @android.annotation.SuppressLint({"OnNameExpected", "NullableCollection"})
    @android.annotation.Nullable
    public android.os.Bundle getWindowContextOptions() { return null; }
    @android.annotation.SuppressLint({"OnNameExpected", "ExecutorRegistration"})
    public void registerComponentCallbacks(android.content.ComponentCallbacks p0) {}
    @android.annotation.SuppressLint("OnNameExpected")
    public void unregisterComponentCallbacks(android.content.ComponentCallbacks p0) {}
    @android.annotation.SuppressLint("OnNameExpected")
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onLowMemory() {}
    public void onTrimMemory(int p0) {}
    @android.annotation.SuppressLint("OnNameExpected")
    @android.annotation.NonNull
    public int getInitialDisplayId() { return 0; }
    public final void attachToWindowToken(android.os.IBinder p0) {}
    public final android.content.Context createServiceBaseContext(android.app.ActivityThread p0, android.app.LoadedApk p1) { return null; }
    protected void attachBaseContext(android.content.Context p0) {}
    @android.annotation.SuppressLint("OnNameExpected")
    @android.annotation.Nullable
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    public void onDestroy() {}
    public void dispatchConfigurationChanged(android.content.res.Configuration p0) {}
}
