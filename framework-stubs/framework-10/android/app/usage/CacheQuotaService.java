package android.app.usage;

@android.annotation.SystemApi
public abstract class CacheQuotaService extends android.app.Service {
    private static final java.lang.String TAG = "CacheQuotaService";
    public static final java.lang.String SERVICE_INTERFACE = "android.app.usage.CacheQuotaService";
    public static final java.lang.String REQUEST_LIST_KEY = "requests";
    private android.app.usage.CacheQuotaService.CacheQuotaServiceWrapper mWrapper;
    private android.os.Handler mHandler;
    public CacheQuotaService() { super(); }
    public void onCreate() {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract java.util.List<android.app.usage.CacheQuotaHint> onComputeCacheQuotaHints(java.util.List<android.app.usage.CacheQuotaHint> p0);

    private final class ServiceHandler extends android.os.Handler {
        public static final int MSG_SEND_LIST = 1;
        public ServiceHandler(android.app.usage.CacheQuotaService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private final class CacheQuotaServiceWrapper extends android.app.usage.ICacheQuotaService.Stub {
        private CacheQuotaServiceWrapper(android.app.usage.CacheQuotaService p0) { super(); }
        public void computeCacheQuotaHints(android.os.RemoteCallback p0, java.util.List<android.app.usage.CacheQuotaHint> p1) {}
    }
}
