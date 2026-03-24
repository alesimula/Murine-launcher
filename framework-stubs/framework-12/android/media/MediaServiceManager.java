package android.media;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class MediaServiceManager {
    private static final java.lang.String MEDIA_SESSION_SERVICE = "media_session";
    private static final java.lang.String MEDIA_TRANSCODING_SERVICE = "media.transcoding";
    private static final java.lang.String MEDIA_COMMUNICATION_SERVICE = "media_communication";
    public MediaServiceManager() {}
    public android.media.MediaServiceManager.ServiceRegisterer getMediaSessionServiceRegisterer() { return null; }
    public android.media.MediaServiceManager.ServiceRegisterer getMediaTranscodingServiceRegisterer() { return null; }
    public android.media.MediaServiceManager.ServiceRegisterer getMediaCommunicationServiceRegisterer() { return null; }

    public static final class ServiceRegisterer {
        private final java.lang.String mServiceName = null;
        private final boolean mLazyStart = false;
        public ServiceRegisterer(java.lang.String p0, boolean p1) {}
        public ServiceRegisterer(java.lang.String p0) {}
        public android.os.IBinder get() { return null; }
    }
}
