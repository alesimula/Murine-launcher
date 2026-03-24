package android.service.voice;

@android.annotation.SystemApi
public class AlwaysOnHotwordDetector extends android.service.voice.AbstractHotwordDetector {
    public static final int STATE_HARDWARE_UNAVAILABLE = -2;
    @java.lang.Deprecated
    public static final int STATE_KEYPHRASE_UNSUPPORTED = -1;
    public static final int STATE_KEYPHRASE_UNENROLLED = 1;
    public static final int STATE_KEYPHRASE_ENROLLED = 2;
    public static final int STATE_ERROR = 3;
    public static final int RECOGNITION_FLAG_NONE = 0;
    public static final int RECOGNITION_FLAG_CAPTURE_TRIGGER_AUDIO = 1;
    public static final int RECOGNITION_FLAG_ALLOW_MULTIPLE_TRIGGERS = 2;
    public static final int RECOGNITION_FLAG_ENABLE_AUDIO_ECHO_CANCELLATION = 4;
    public static final int RECOGNITION_FLAG_ENABLE_AUDIO_NOISE_SUPPRESSION = 8;
    public static final int RECOGNITION_FLAG_RUN_IN_BATTERY_SAVER = 16;
    public static final int RECOGNITION_MODE_VOICE_TRIGGER = 1;
    public static final int RECOGNITION_MODE_USER_IDENTIFICATION = 2;
    public static final int AUDIO_CAPABILITY_ECHO_CANCELLATION = 1;
    public static final int AUDIO_CAPABILITY_NOISE_SUPPRESSION = 2;
    public static final int MODEL_PARAM_THRESHOLD_FACTOR = 0;
    static final java.lang.String TAG = "AlwaysOnHotwordDetector";
    static final boolean DBG = false;
    public AlwaysOnHotwordDetector(java.lang.String p0, java.util.Locale p1, android.service.voice.AlwaysOnHotwordDetector.Callback p2, android.hardware.soundtrigger.KeyphraseEnrollmentInfo p3, com.android.internal.app.IVoiceInteractionManagerService p4, int p5, boolean p6, android.os.PersistableBundle p7, android.os.SharedMemory p8) { super(null, null, 0); }
    public final void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.RECORD_AUDIO", "android.permission.CAPTURE_AUDIO_HOTWORD"})
    public void triggerHardwareRecognitionEventForTest(int p0, int p1, boolean p2, int p3, int p4, int p5, boolean p6, android.media.AudioFormat p7, byte[] p8, java.util.List<android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra> p9) {}
    public int getSupportedRecognitionModes() { return 0; }
    public int getSupportedAudioCapabilities() { return 0; }
    @android.annotation.RequiresPermission(allOf={"android.permission.RECORD_AUDIO", "android.permission.CAPTURE_AUDIO_HOTWORD"})
    public boolean startRecognition(int p0) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.RECORD_AUDIO", "android.permission.CAPTURE_AUDIO_HOTWORD"})
    public boolean startRecognition() { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.RECORD_AUDIO", "android.permission.CAPTURE_AUDIO_HOTWORD"})
    public boolean stopRecognition() { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.RECORD_AUDIO", "android.permission.CAPTURE_AUDIO_HOTWORD"})
    public int setParameter(int p0, int p1) { return 0; }
    @android.annotation.RequiresPermission(allOf={"android.permission.RECORD_AUDIO", "android.permission.CAPTURE_AUDIO_HOTWORD"})
    public int getParameter(int p0) { return 0; }
    @android.annotation.RequiresPermission(allOf={"android.permission.RECORD_AUDIO", "android.permission.CAPTURE_AUDIO_HOTWORD"})
    public android.service.voice.AlwaysOnHotwordDetector.ModelParamRange queryParameter(int p0) { return null; }
    public android.content.Intent createEnrollIntent() { return null; }
    public android.content.Intent createUnEnrollIntent() { return null; }
    public android.content.Intent createReEnrollIntent() { return null; }
    public void destroy() {}
    void onSoundModelsChanged() {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioCapabilities {
    }

    public static abstract class Callback implements android.service.voice.HotwordDetector.Callback {
        public Callback() {}
        public abstract void onAvailabilityChanged(int p0);
        public abstract void onDetected(android.service.voice.AlwaysOnHotwordDetector.EventPayload p0);
        public abstract void onError();
        public abstract void onRecognitionPaused();
        public abstract void onRecognitionResumed();
        public void onRejected(android.service.voice.HotwordRejectedResult p0) {}
        public void onHotwordDetectionServiceInitialized(int p0) {}
        public void onHotwordDetectionServiceRestarted() {}
    }

    public static class EventPayload {
        public static final int DATA_FORMAT_RAW = 0;
        public static final int DATA_FORMAT_TRIGGER_AUDIO = 1;
        public android.media.AudioFormat getCaptureAudioFormat() { return null; }
        @java.lang.Deprecated
        public byte[] getTriggerAudio() { return null; }
        public int getDataFormat() { return 0; }
        public byte[] getData() { return null; }
        public java.lang.Integer getCaptureSession() { return null; }
        public android.service.voice.HotwordDetectedResult getHotwordDetectedResult() { return null; }
        public android.os.ParcelFileDescriptor getAudioStream() { return null; }
        public java.util.List<android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra> getKeyphraseRecognitionExtras() { return null; }

        public static final class Builder {
            public Builder() {}
            Builder(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0) {}
            @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setCaptureAvailable(boolean p0) { return null; }
            @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setCaptureSession(int p0) { return null; }
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setCaptureAudioFormat(android.media.AudioFormat p0) { return null; }
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setDataFormat(int p0) { return null; }
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setData(byte[] p0) { return null; }
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setHotwordDetectedResult(android.service.voice.HotwordDetectedResult p0) { return null; }
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setAudioStream(android.os.ParcelFileDescriptor p0) { return null; }
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setKeyphraseRecognitionExtras(java.util.List<android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra> p0) { return null; }
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload build() { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface DataFormat {
        }
    }

    public static final class ModelParamRange {
        ModelParamRange(android.hardware.soundtrigger.SoundTrigger.ModelParamRange p0) {}
        public int getStart() { return 0; }
        public int getEnd() { return 0; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModelParams {
    }

    class MyHandler extends android.os.Handler {
        MyHandler(android.service.voice.AlwaysOnHotwordDetector p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecognitionFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecognitionModes {
    }

    class RefreshAvailabiltyTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
        RefreshAvailabiltyTask(android.service.voice.AlwaysOnHotwordDetector p0) { super(); }
        public java.lang.Void doInBackground(java.lang.Void... p0) { return null; }
    }

    static final class SoundTriggerListener extends com.android.internal.app.IHotwordRecognitionStatusCallback.Stub {
        public SoundTriggerListener(android.os.Handler p0) { super(); }
        public void onKeyphraseDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, android.service.voice.HotwordDetectedResult p1) {}
        public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) {}
        public void onRejected(android.service.voice.HotwordRejectedResult p0) {}
        public void onError(int p0) {}
        public void onRecognitionPaused() {}
        public void onRecognitionResumed() {}
        public void onStatusReported(int p0) {}
        public void onProcessRestarted() {}
    }
}
