package android.service.voice;

@android.annotation.SystemApi
public interface HotwordDetector {
    @android.annotation.RequiresPermission(allOf={"android.permission.RECORD_AUDIO", "android.permission.CAPTURE_AUDIO_HOTWORD"})
    public boolean startRecognition();
    public boolean stopRecognition();
    public boolean startRecognition(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.os.PersistableBundle p2);
    public void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1);

    public static interface Callback {
        public void onDetected(android.service.voice.AlwaysOnHotwordDetector.EventPayload p0);
        public void onError();
        public void onRecognitionPaused();
        public void onRecognitionResumed();
        public void onRejected(android.service.voice.HotwordRejectedResult p0);
        public void onHotwordDetectionServiceInitialized(int p0);
        public void onHotwordDetectionServiceRestarted();
    }
}
