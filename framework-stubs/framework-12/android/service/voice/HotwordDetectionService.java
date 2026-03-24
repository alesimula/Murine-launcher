package android.service.voice;

@android.annotation.SystemApi
public abstract class HotwordDetectionService extends android.app.Service {
    private static final java.lang.String TAG = "HotwordDetectionService";
    private static final boolean DBG = false;
    private static final long UPDATE_TIMEOUT_MILLIS = 5000L;
    public static final java.lang.String KEY_INITIALIZATION_STATUS = "initialization_status";
    public static final int MAXIMUM_NUMBER_OF_INITIALIZATION_STATUS_CUSTOM_ERROR = 2;
    public static final int INITIALIZATION_STATUS_SUCCESS = 0;
    public static final int INITIALIZATION_STATUS_UNKNOWN = 100;
    public static final int AUDIO_SOURCE_MICROPHONE = 1;
    public static final int AUDIO_SOURCE_EXTERNAL = 2;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.voice.HotwordDetectionService";
    private android.view.contentcapture.ContentCaptureManager mContentCaptureManager;
    private final android.service.voice.IHotwordDetectionService mInterface = null;
    public HotwordDetectionService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.SuppressLint("OnNameExpected")
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public static int getMaxCustomInitializationStatus() { return 0; }
    @android.annotation.SystemApi
    public void onDetect(android.service.voice.AlwaysOnHotwordDetector.EventPayload p0, long p1, android.service.voice.HotwordDetectionService.Callback p2) {}
    @android.annotation.SystemApi
    public void onUpdateState(android.os.PersistableBundle p0, android.os.SharedMemory p1, long p2, java.util.function.IntConsumer p3) {}
    public void onDetect(android.service.voice.HotwordDetectionService.Callback p0) {}
    public void onDetect(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.os.PersistableBundle p2, android.service.voice.HotwordDetectionService.Callback p3) {}
    private void onUpdateStateInternal(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.IRemoteCallback p2) {}
    public void onStopDetection() {}

    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface AudioSource {
    }

    @android.annotation.SystemApi
    public static final class Callback {
        private final android.service.voice.IDspHotwordDetectionCallback mRemoteCallback = null;
        private Callback(android.service.voice.IDspHotwordDetectionCallback p0) {}
        public void onDetected(android.service.voice.HotwordDetectedResult p0) {}
        public void onRejected(android.service.voice.HotwordRejectedResult p0) {}
    }
}
