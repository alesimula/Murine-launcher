package android.app;

public abstract class HomeVisibilityObserver {
    private android.content.Context mContext;
    private android.app.ActivityManager mActivityManager;
    android.app.IProcessObserver.Stub mObserver;
    boolean mIsHomeActivityVisible;
    void init(android.content.Context p0, android.app.ActivityManager p1) {}
    public abstract void onHomeVisibilityChanged(boolean p0);
    public HomeVisibilityObserver() {}
    private boolean isHomeActivityVisible() { return false; }
}
