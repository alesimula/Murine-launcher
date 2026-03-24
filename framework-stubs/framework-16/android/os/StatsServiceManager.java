package android.os;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class StatsServiceManager {
    public StatsServiceManager() {}
    @android.annotation.NonNull
    public android.os.StatsServiceManager.ServiceRegisterer getStatsCompanionServiceRegisterer() { return null; }
    @android.annotation.NonNull
    public android.os.StatsServiceManager.ServiceRegisterer getStatsManagerServiceRegisterer() { return null; }
    @android.annotation.NonNull
    public android.os.StatsServiceManager.ServiceRegisterer getStatsdServiceRegisterer() { return null; }

    public static class ServiceNotFoundException extends android.os.ServiceManager.ServiceNotFoundException {
        public ServiceNotFoundException(java.lang.String p0) { super(null); }
    }

    public static final class ServiceRegisterer {
        public ServiceRegisterer(java.lang.String p0) {}
        @android.annotation.Nullable
        public android.os.IBinder get() { return null; }
        @android.annotation.Nullable
        public android.os.IBinder getOrThrow() throws android.os.StatsServiceManager.ServiceNotFoundException { return null; }
    }
}
