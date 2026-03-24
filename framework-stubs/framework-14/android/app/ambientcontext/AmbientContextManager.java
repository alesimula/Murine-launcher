package android.app.ambientcontext;

@android.annotation.SystemApi
public final class AmbientContextManager {
    public static final java.lang.String STATUS_RESPONSE_BUNDLE_KEY = "android.app.ambientcontext.AmbientContextStatusBundleKey";
    public static final java.lang.String EXTRA_AMBIENT_CONTEXT_EVENTS = "android.app.ambientcontext.extra.AMBIENT_CONTEXT_EVENTS";
    public static final int STATUS_UNKNOWN = 0;
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_NOT_SUPPORTED = 2;
    public static final int STATUS_SERVICE_UNAVAILABLE = 3;
    public static final int STATUS_MICROPHONE_DISABLED = 4;
    public static final int STATUS_ACCESS_DENIED = 5;
    public static java.util.List<android.app.ambientcontext.AmbientContextEvent> getEventsFromIntent(android.content.Intent p0) { return null; }
    public AmbientContextManager(android.content.Context p0, android.app.ambientcontext.IAmbientContextManager p1) {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_AMBIENT_CONTEXT_EVENT")
    public void queryAmbientContextServiceStatus(java.util.Set<java.lang.Integer> p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_AMBIENT_CONTEXT_EVENT")
    public void startConsentActivity(java.util.Set<java.lang.Integer> p0) {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_AMBIENT_CONTEXT_EVENT")
    public void registerObserver(android.app.ambientcontext.AmbientContextEventRequest p0, android.app.PendingIntent p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_AMBIENT_CONTEXT_EVENT")
    public void registerObserver(android.app.ambientcontext.AmbientContextEventRequest p0, java.util.concurrent.Executor p1, android.app.ambientcontext.AmbientContextCallback p2) {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_AMBIENT_CONTEXT_EVENT")
    public void unregisterObserver() {}

    public static @interface StatusCode {
    }
}
