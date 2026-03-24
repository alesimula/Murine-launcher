package android.os;

public final class ServiceManager {
    private static final java.lang.String TAG = "ServiceManager";
    private static final java.lang.Object sLock = null;
    @android.annotation.UnsupportedAppUsage
    private static android.os.IServiceManager sServiceManager;
    @android.annotation.UnsupportedAppUsage
    private static java.util.Map<java.lang.String, android.os.IBinder> sCache;
    private static final int SLOW_LOG_INTERVAL_MS = 5000;
    private static final int STATS_LOG_INTERVAL_MS = 5000;
    private static final long GET_SERVICE_SLOW_THRESHOLD_US_CORE = Long.valueOf(0L);
    private static final long GET_SERVICE_SLOW_THRESHOLD_US_NON_CORE = Long.valueOf(0L);
    private static final int GET_SERVICE_LOG_EVERY_CALLS_CORE = Integer.valueOf(0);
    private static final int GET_SERVICE_LOG_EVERY_CALLS_NON_CORE = Integer.valueOf(0);
    private static int sGetServiceAccumulatedUs;
    private static int sGetServiceAccumulatedCallCount;
    private static long sLastStatsLogUptime;
    private static long sLastSlowLogUptime;
    private static long sLastSlowLogActualTime;
    public static final com.android.internal.util.StatLogger sStatLogger = null;
    public ServiceManager() {}
    @android.annotation.UnsupportedAppUsage
    private static android.os.IServiceManager getIServiceManager() { return null; }
    @android.annotation.UnsupportedAppUsage
    public static android.os.IBinder getService(java.lang.String p0) { return null; }
    public static android.os.IBinder getServiceOrThrow(java.lang.String p0) throws android.os.ServiceManager.ServiceNotFoundException { return null; }
    @android.annotation.UnsupportedAppUsage
    public static void addService(java.lang.String p0, android.os.IBinder p1) {}
    @android.annotation.UnsupportedAppUsage
    public static void addService(java.lang.String p0, android.os.IBinder p1, boolean p2) {}
    @android.annotation.UnsupportedAppUsage
    public static void addService(java.lang.String p0, android.os.IBinder p1, boolean p2, int p3) {}
    @android.annotation.UnsupportedAppUsage
    public static android.os.IBinder checkService(java.lang.String p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String[] listServices() { return null; }
    public static void initServiceCache(java.util.Map<java.lang.String, android.os.IBinder> p0) {}
    private static android.os.IBinder rawGetService(java.lang.String p0) throws android.os.RemoteException { return null; }

    static interface Stats {
        public static final int GET_SERVICE = 0;
        public static final int COUNT = 1;
    }

    public static class ServiceNotFoundException extends java.lang.Exception {
        public ServiceNotFoundException(java.lang.String p0) { super(); }
    }
}
