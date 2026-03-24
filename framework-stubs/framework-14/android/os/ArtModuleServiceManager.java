package android.os;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class ArtModuleServiceManager {
    public ArtModuleServiceManager() {}
    public android.os.ArtModuleServiceManager.ServiceRegisterer getArtdServiceRegisterer() { return null; }

    public static final class ServiceRegisterer {
        public ServiceRegisterer(java.lang.String p0) {}
        public android.os.IBinder waitForService() { return null; }
    }
}
