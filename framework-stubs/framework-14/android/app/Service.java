package android.app;

public abstract class Service extends android.content.ContextWrapper implements android.content.ComponentCallbacks2, android.view.contentcapture.ContentCaptureManager.ContentCaptureClient {
    @java.lang.Deprecated
    public static final int STOP_FOREGROUND_LEGACY = 0;
    public static final int STOP_FOREGROUND_REMOVE = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int START_CONTINUATION_MASK = 15;
    public static final int START_STICKY_COMPATIBILITY = 0;
    public static final int START_STICKY = 1;
    public static final int START_NOT_STICKY = 2;
    public static final int START_REDELIVER_INTENT = 3;
    public static final int START_TASK_REMOVED_COMPLETE = 1000;
    public static final int START_FLAG_REDELIVERY = 1;
    public static final int START_FLAG_RETRY = 2;
    public Service() { super(null); }
    public final android.app.Application getApplication() { return null; }
    public void onCreate() {}
    @java.lang.Deprecated
    public void onStart(android.content.Intent p0, int p1) {}
    public int onStartCommand(android.content.Intent p0, int p1, int p2) { return 0; }
    public void onDestroy() {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onLowMemory() {}
    public void onTrimMemory(int p0) {}
    public abstract android.os.IBinder onBind(android.content.Intent p0);
    public boolean onUnbind(android.content.Intent p0) { return false; }
    public void onRebind(android.content.Intent p0) {}
    public void onTaskRemoved(android.content.Intent p0) {}
    public final void stopSelf() {}
    public final void stopSelf(int p0) {}
    public final boolean stopSelfResult(int p0) { return false; }
    @java.lang.Deprecated
    public final void setForeground(boolean p0) {}
    public final void startForeground(int p0, android.app.Notification p1) {}
    public final void startForeground(int p0, android.app.Notification p1, int p2) {}
    @java.lang.Deprecated
    public final void stopForeground(boolean p0) {}
    public final void stopForeground(int p0) {}
    public final int getForegroundServiceType() { return 0; }
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    protected void attachBaseContext(android.content.Context p0) {}
    public final void attach(android.content.Context p0, android.app.ActivityThread p1, java.lang.String p2, android.os.IBinder p3, android.app.Application p4, java.lang.Object p5) {}
    public android.content.Context createServiceBaseContext(android.app.ActivityThread p0, android.app.LoadedApk p1) { return null; }
    public final void detachAndCleanUp() {}
    final java.lang.String getClassName() { return null; }
    public final android.view.contentcapture.ContentCaptureManager.ContentCaptureClient getContentCaptureClient() { return null; }
    public final android.content.ComponentName contentCaptureClientGetComponentName() { return null; }
    public static void setStartForegroundServiceStackTrace(java.lang.String p0, android.app.StackTrace p1) {}
    public static android.app.StackTrace getStartForegroundServiceStackTrace(java.lang.String p0) { return null; }
    public final void callOnTimeout(int p0) {}
    public void onTimeout(int p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StartArgFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StartResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StopForegroundSelector {
    }
}
