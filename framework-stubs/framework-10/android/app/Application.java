package android.app;

public class Application extends android.content.ContextWrapper implements android.content.ComponentCallbacks2 {
    private static final java.lang.String TAG = "Application";
    @android.annotation.UnsupportedAppUsage
    private java.util.ArrayList<android.content.ComponentCallbacks> mComponentCallbacks;
    @android.annotation.UnsupportedAppUsage
    private java.util.ArrayList<android.app.Application.ActivityLifecycleCallbacks> mActivityLifecycleCallbacks;
    @android.annotation.UnsupportedAppUsage
    private java.util.ArrayList<android.app.Application.OnProvideAssistDataListener> mAssistCallbacks;
    @android.annotation.UnsupportedAppUsage
    public android.app.LoadedApk mLoadedApk;
    public Application() { super(null); }
    public void onCreate() {}
    public void onTerminate() {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onLowMemory() {}
    public void onTrimMemory(int p0) {}
    public void registerComponentCallbacks(android.content.ComponentCallbacks p0) {}
    public void unregisterComponentCallbacks(android.content.ComponentCallbacks p0) {}
    public void registerActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks p0) {}
    public void unregisterActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks p0) {}
    public void registerOnProvideAssistDataListener(android.app.Application.OnProvideAssistDataListener p0) {}
    public void unregisterOnProvideAssistDataListener(android.app.Application.OnProvideAssistDataListener p0) {}
    public static java.lang.String getProcessName() { return null; }
    @android.annotation.UnsupportedAppUsage
    final void attach(android.content.Context p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityPreCreated(android.app.Activity p0, android.os.Bundle p1) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityCreated(android.app.Activity p0, android.os.Bundle p1) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityPostCreated(android.app.Activity p0, android.os.Bundle p1) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityPreStarted(android.app.Activity p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityStarted(android.app.Activity p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityPostStarted(android.app.Activity p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityPreResumed(android.app.Activity p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityResumed(android.app.Activity p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityPostResumed(android.app.Activity p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityPrePaused(android.app.Activity p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityPaused(android.app.Activity p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityPostPaused(android.app.Activity p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityPreStopped(android.app.Activity p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityStopped(android.app.Activity p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityPostStopped(android.app.Activity p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityPreSaveInstanceState(android.app.Activity p0, android.os.Bundle p1) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivitySaveInstanceState(android.app.Activity p0, android.os.Bundle p1) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityPostSaveInstanceState(android.app.Activity p0, android.os.Bundle p1) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityPreDestroyed(android.app.Activity p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityDestroyed(android.app.Activity p0) {}
    @android.annotation.UnsupportedAppUsage
    void dispatchActivityPostDestroyed(android.app.Activity p0) {}
    private java.lang.Object[] collectComponentCallbacks() { return null; }
    @android.annotation.UnsupportedAppUsage
    private java.lang.Object[] collectActivityLifecycleCallbacks() { return null; }
    void dispatchOnProvideAssistData(android.app.Activity p0, android.os.Bundle p1) {}
    public android.view.autofill.AutofillManager.AutofillClient getAutofillClient() { return null; }

    public static interface OnProvideAssistDataListener {
        public void onProvideAssistData(android.app.Activity p0, android.os.Bundle p1);
    }

    public static interface ActivityLifecycleCallbacks {
        default public void onActivityPreCreated(android.app.Activity p0, android.os.Bundle p1) {}
        public void onActivityCreated(android.app.Activity p0, android.os.Bundle p1);
        default public void onActivityPostCreated(android.app.Activity p0, android.os.Bundle p1) {}
        default public void onActivityPreStarted(android.app.Activity p0) {}
        public void onActivityStarted(android.app.Activity p0);
        default public void onActivityPostStarted(android.app.Activity p0) {}
        default public void onActivityPreResumed(android.app.Activity p0) {}
        public void onActivityResumed(android.app.Activity p0);
        default public void onActivityPostResumed(android.app.Activity p0) {}
        default public void onActivityPrePaused(android.app.Activity p0) {}
        public void onActivityPaused(android.app.Activity p0);
        default public void onActivityPostPaused(android.app.Activity p0) {}
        default public void onActivityPreStopped(android.app.Activity p0) {}
        public void onActivityStopped(android.app.Activity p0);
        default public void onActivityPostStopped(android.app.Activity p0) {}
        default public void onActivityPreSaveInstanceState(android.app.Activity p0, android.os.Bundle p1) {}
        public void onActivitySaveInstanceState(android.app.Activity p0, android.os.Bundle p1);
        default public void onActivityPostSaveInstanceState(android.app.Activity p0, android.os.Bundle p1) {}
        default public void onActivityPreDestroyed(android.app.Activity p0) {}
        public void onActivityDestroyed(android.app.Activity p0);
        default public void onActivityPostDestroyed(android.app.Activity p0) {}
    }
}
