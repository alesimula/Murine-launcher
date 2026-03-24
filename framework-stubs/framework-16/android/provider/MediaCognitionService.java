package android.provider;

@android.annotation.FlaggedApi("com.android.providers.media.flags.media_cognition_service")
public abstract class MediaCognitionService extends android.app.Service {
    public static final java.lang.String BIND_MEDIA_COGNITION_SERVICE = "com.android.providers.media.permission.BIND_MEDIA_COGNITION_SERVICE";
    public static final java.lang.String SERVICE_INTERFACE = "android.provider.MediaCognitionService";
    public MediaCognitionService() { super(); }
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onGetProcessingVersions(android.provider.MediaCognitionGetVersionsCallback p0);
    public abstract void onProcessMedia(java.util.List<android.provider.MediaCognitionProcessingRequest> p0, android.os.CancellationSignal p1, android.provider.MediaCognitionProcessingCallback p2);

    public static interface ProcessingTypes {
        public static final int IMAGE_LABEL = 2;
        public static final int IMAGE_OCR_LATIN = 1;
    }
}
