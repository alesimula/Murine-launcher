package android.service.voice;

@android.annotation.SystemApi
public interface HotwordDetector {
    public static final int DETECTOR_TYPE_NORMAL = 0;
    public static final int DETECTOR_TYPE_TRUSTED_HOTWORD_DSP = 1;
    public static final int DETECTOR_TYPE_TRUSTED_HOTWORD_SOFTWARE = 2;
    public static final int DETECTOR_TYPE_VISUAL_QUERY_DETECTOR = 3;
    @android.annotation.RequiresPermission(allOf={"android.permission.RECORD_AUDIO", "android.permission.CAPTURE_AUDIO_HOTWORD"})
    public boolean startRecognition();
    public boolean stopRecognition();
    public boolean startRecognition(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.os.PersistableBundle p2);
    public void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1);
    default public void destroy() {}
    default public boolean isUsingSandboxedDetectionService() { return false; }
    public static java.lang.String detectorTypeToString(int p0) { return null; }
    default public void dump(java.lang.String p0, java.io.PrintWriter p1) {}

    public static interface Callback {
        public void onDetected(android.service.voice.AlwaysOnHotwordDetector.EventPayload p0);
        @java.lang.Deprecated
        public void onError();
        default public void onFailure(android.service.voice.HotwordDetectionServiceFailure p0) {}
        default public void onUnknownFailure(java.lang.String p0) {}
        public void onRecognitionPaused();
        public void onRecognitionResumed();
        public void onRejected(android.service.voice.HotwordRejectedResult p0);
        public void onHotwordDetectionServiceInitialized(int p0);
        public void onHotwordDetectionServiceRestarted();
    }
}
