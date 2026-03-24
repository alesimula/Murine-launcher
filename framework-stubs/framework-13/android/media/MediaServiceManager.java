package android.media;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class MediaServiceManager {
    public MediaServiceManager() {}
    public android.media.MediaServiceManager.ServiceRegisterer getMediaSessionServiceRegisterer() { return null; }
    public android.media.MediaServiceManager.ServiceRegisterer getMediaTranscodingServiceRegisterer() { return null; }
    public android.media.MediaServiceManager.ServiceRegisterer getMediaCommunicationServiceRegisterer() { return null; }

    public static final class ServiceRegisterer {
        public ServiceRegisterer(java.lang.String p0, boolean p1) {}
        public ServiceRegisterer(java.lang.String p0) {}
        public android.os.IBinder get() { return null; }
    }
}
