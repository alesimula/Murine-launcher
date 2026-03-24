package android.provider;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class DeviceConfigServiceManager {
    public DeviceConfigServiceManager() {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.NonNull
    public android.provider.DeviceConfigServiceManager.ServiceRegisterer getDeviceConfigUpdatableServiceRegisterer() { return null; }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static class ServiceNotFoundException extends android.os.ServiceManager.ServiceNotFoundException {
        public ServiceNotFoundException(java.lang.String p0) { super(null); }
    }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final class ServiceRegisterer {
        public ServiceRegisterer(java.lang.String p0) {}
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        public void register(android.os.IBinder p0) {}
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        @android.annotation.Nullable
        public android.os.IBinder get() { return null; }
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        @android.annotation.NonNull
        public android.os.IBinder getOrThrow() throws android.provider.DeviceConfigServiceManager.ServiceNotFoundException { return null; }
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        @android.annotation.Nullable
        public android.os.IBinder tryGet() { return null; }
    }
}
