package android.app;

public class Application extends android.content.ContextWrapper implements android.content.ComponentCallbacks2 {
    private static final java.lang.String TAG = "Application";
    private java.util.ArrayList<android.content.ComponentCallbacks> mComponentCallbacks;
    private java.util.ArrayList<android.app.Application.ActivityLifecycleCallbacks> mActivityLifecycleCallbacks;
    private java.util.ArrayList<android.app.Application.OnProvideAssistDataListener> mAssistCallbacks;
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
    final void attach(android.content.Context p0) {}
    void dispatchActivityPreCreated(android.app.Activity p0, android.os.Bundle p1) {}
    void dispatchActivityCreated(android.app.Activity p0, android.os.Bundle p1) {}
    void dispatchActivityPostCreated(android.app.Activity p0, android.os.Bundle p1) {}
    void dispatchActivityPreStarted(android.app.Activity p0) {}
    void dispatchActivityStarted(android.app.Activity p0) {}
    void dispatchActivityPostStarted(android.app.Activity p0) {}
    void dispatchActivityPreResumed(android.app.Activity p0) {}
    void dispatchActivityResumed(android.app.Activity p0) {}
    void dispatchActivityPostResumed(android.app.Activity p0) {}
    void dispatchActivityPrePaused(android.app.Activity p0) {}
    void dispatchActivityPaused(android.app.Activity p0) {}
    void dispatchActivityPostPaused(android.app.Activity p0) {}
    void dispatchActivityPreStopped(android.app.Activity p0) {}
    void dispatchActivityStopped(android.app.Activity p0) {}
    void dispatchActivityPostStopped(android.app.Activity p0) {}
    void dispatchActivityPreSaveInstanceState(android.app.Activity p0, android.os.Bundle p1) {}
    void dispatchActivitySaveInstanceState(android.app.Activity p0, android.os.Bundle p1) {}
    void dispatchActivityPostSaveInstanceState(android.app.Activity p0, android.os.Bundle p1) {}
    void dispatchActivityPreDestroyed(android.app.Activity p0) {}
    void dispatchActivityDestroyed(android.app.Activity p0) {}
    void dispatchActivityPostDestroyed(android.app.Activity p0) {}
    private java.lang.Object[] collectComponentCallbacks() { return null; }
    private java.lang.Object[] collectActivityLifecycleCallbacks() { return null; }
    void dispatchOnProvideAssistData(android.app.Activity p0, android.os.Bundle p1) {}
    public android.view.autofill.AutofillManager.AutofillClient getAutofillClient() { return null; }

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

    public static interface OnProvideAssistDataListener {
        public void onProvideAssistData(android.app.Activity p0, android.os.Bundle p1);
    }
}
