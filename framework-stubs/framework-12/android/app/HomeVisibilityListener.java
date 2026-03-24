package android.app;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
@android.annotation.SuppressLint("ListenerInterface")
public abstract class HomeVisibilityListener {
    private android.content.Context mContext;
    private android.app.ActivityManager mActivityManager;
    private java.util.concurrent.Executor mExecutor;
    android.app.IProcessObserver.Stub mObserver;
    boolean mIsHomeActivityVisible;
    void init(android.content.Context p0, java.util.concurrent.Executor p1, android.app.ActivityManager p2) {}
    public abstract void onHomeVisibilityChanged(boolean p0);
    public HomeVisibilityListener() {}
    private boolean isHomeActivityVisible() { return false; }
}
