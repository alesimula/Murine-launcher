package android.service.voice;

@android.annotation.SystemApi
public abstract class HotwordDetectionService extends android.app.Service implements android.service.voice.SandboxedDetectionInitializer {
    @android.annotation.FlaggedApi("android.app.wearable.enable_hotword_wearable_sensing_api")
    public static final java.lang.String KEY_SYSTEM_WILL_CLOSE_AUDIO_STREAM_AFTER_CALLBACK = "android.service.voice.HotwordDetectionService.KEY_SYSTEM_WILL_CLOSE_AUDIO_STREAM_AFTER_CALLBACK";
    public static final boolean ENABLE_PROXIMITY_RESULT = true;
    @java.lang.Deprecated
    public static final int INITIALIZATION_STATUS_SUCCESS = 0;
    @java.lang.Deprecated
    public static final int INITIALIZATION_STATUS_UNKNOWN = 100;
    public static final int AUDIO_SOURCE_MICROPHONE = 1;
    public static final int AUDIO_SOURCE_EXTERNAL = 2;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.voice.HotwordDetectionService";
    public HotwordDetectionService() { super(); }
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.SuppressLint("OnNameExpected")
    @android.annotation.Nullable
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static int getMaxCustomInitializationStatus() { return 0; }
    @android.annotation.SystemApi
    public void onDetect(android.service.voice.AlwaysOnHotwordDetector.EventPayload p0, long p1, android.service.voice.HotwordDetectionService.Callback p2) {}
    @android.annotation.SystemApi
    public void onUpdateState(android.os.PersistableBundle p0, android.os.SharedMemory p1, long p2, java.util.function.IntConsumer p3) {}
    public void onDetect(android.service.voice.HotwordDetectionService.Callback p0) {}
    public void onDetect(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.os.PersistableBundle p2, android.service.voice.HotwordDetectionService.Callback p3) {}
    public void onStopDetection() {}

    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface AudioSource {
    }

    @android.annotation.SystemApi
    public static final class Callback {
        public void onDetected(android.service.voice.HotwordDetectedResult p0) {}
        public void onRejected(android.service.voice.HotwordRejectedResult p0) {}
    }
}
