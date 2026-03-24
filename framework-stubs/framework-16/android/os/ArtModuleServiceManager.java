package android.os;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class ArtModuleServiceManager {
    public ArtModuleServiceManager() {}
    @android.annotation.NonNull
    public android.os.ArtModuleServiceManager.ServiceRegisterer getArtdServiceRegisterer() { return null; }
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("android.content.pm.use_art_service_v2")
    public android.os.ArtModuleServiceManager.ServiceRegisterer getArtdPreRebootServiceRegisterer() { return null; }
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("android.content.pm.use_art_service_v2")
    public android.os.ArtModuleServiceManager.ServiceRegisterer getDexoptChrootSetupServiceRegisterer() { return null; }

    public static final class ServiceRegisterer {
        public ServiceRegisterer(java.lang.String p0, boolean p1) {}
        @android.annotation.Nullable
        public android.os.IBinder waitForService() { return null; }
    }
}
