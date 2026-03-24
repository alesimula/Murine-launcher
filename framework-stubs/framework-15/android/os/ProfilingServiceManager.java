package android.os;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
@android.annotation.FlaggedApi("android.os.telemetry_apis_framework_initialization")
public class ProfilingServiceManager {
    public ProfilingServiceManager() {}
    @android.annotation.NonNull
    public android.os.ProfilingServiceManager.ServiceRegisterer getProfilingServiceRegisterer() { return null; }

    public static class ServiceNotFoundException extends android.os.ServiceManager.ServiceNotFoundException {
        public ServiceNotFoundException(java.lang.String p0) { super(null); }
    }

    public static final class ServiceRegisterer {
        public ServiceRegisterer(java.lang.String p0) {}
        @android.annotation.Nullable
        public android.os.IBinder get() { return null; }
        @android.annotation.Nullable
        public android.os.IBinder getOrThrow() throws android.os.ProfilingServiceManager.ServiceNotFoundException { return null; }
    }
}
