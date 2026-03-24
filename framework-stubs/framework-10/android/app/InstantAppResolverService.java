package android.app;

@android.annotation.SystemApi
public abstract class InstantAppResolverService extends android.app.Service {
    private static final boolean DEBUG_INSTANT = Boolean.valueOf(false);
    private static final java.lang.String TAG = "PackageManager";
    public static final java.lang.String EXTRA_RESOLVE_INFO = "android.app.extra.RESOLVE_INFO";
    public static final java.lang.String EXTRA_SEQUENCE = "android.app.extra.SEQUENCE";
    android.os.Handler mHandler;
    public InstantAppResolverService() { super(); }
    @java.lang.Deprecated
    public void onGetInstantAppResolveInfo(int[] p0, java.lang.String p1, android.app.InstantAppResolverService.InstantAppResolutionCallback p2) {}
    @java.lang.Deprecated
    public void onGetInstantAppIntentFilter(int[] p0, java.lang.String p1, android.app.InstantAppResolverService.InstantAppResolutionCallback p2) {}
    @java.lang.Deprecated
    public void onGetInstantAppResolveInfo(android.content.Intent p0, int[] p1, java.lang.String p2, android.app.InstantAppResolverService.InstantAppResolutionCallback p3) {}
    @java.lang.Deprecated
    public void onGetInstantAppIntentFilter(android.content.Intent p0, int[] p1, java.lang.String p2, android.app.InstantAppResolverService.InstantAppResolutionCallback p3) {}
    public void onGetInstantAppResolveInfo(android.content.Intent p0, int[] p1, android.os.UserHandle p2, java.lang.String p3, android.app.InstantAppResolverService.InstantAppResolutionCallback p4) {}
    public void onGetInstantAppIntentFilter(android.content.Intent p0, int[] p1, android.os.UserHandle p2, java.lang.String p3, android.app.InstantAppResolverService.InstantAppResolutionCallback p4) {}
    android.os.Looper getLooper() { return null; }
    public final void attachBaseContext(android.content.Context p0) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }

    private final class ServiceHandler extends android.os.Handler {
        public static final int MSG_GET_INSTANT_APP_RESOLVE_INFO = 1;
        public static final int MSG_GET_INSTANT_APP_INTENT_FILTER = 2;
        public ServiceHandler(android.app.InstantAppResolverService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static final class InstantAppResolutionCallback {
        private final android.os.IRemoteCallback mCallback = null;
        private final int mSequence = 0;
        InstantAppResolutionCallback(int p0, android.os.IRemoteCallback p1) {}
        public void onInstantAppResolveInfo(java.util.List<android.content.pm.InstantAppResolveInfo> p0) {}
    }
}
