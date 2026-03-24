package android.service.voice;

@android.annotation.SystemApi
public class AlwaysOnHotwordDetector extends android.service.voice.AbstractDetector {
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
    static final long THROW_ON_INITIALIZE_IF_NO_DSP = 269165460L;
    static final long SEND_ON_FAILURE_FOR_ASYNC_EXCEPTIONS = 280471513L;
    public static final int MODEL_PARAM_THRESHOLD_FACTOR = 0;
    static final java.lang.String TAG = "AlwaysOnHotwordDetector";
    static final boolean DBG = false;
    public AlwaysOnHotwordDetector(java.lang.String p0, java.util.Locale p1, java.util.concurrent.Executor p2, android.service.voice.AlwaysOnHotwordDetector.Callback p3, android.hardware.soundtrigger.KeyphraseEnrollmentInfo p4, com.android.internal.app.IVoiceInteractionManagerService p5, int p6, boolean p7, java.lang.String p8) { super(null, null, null); }
    void initialize(android.os.PersistableBundle p0, android.os.SharedMemory p1) {}
    void initialize(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.hardware.soundtrigger.SoundTrigger.ModuleProperties p2) {}
    public final void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1) {}
    public void overrideAvailability(int p0) {}
    public void resetAvailability() {}
    @android.annotation.RequiresPermission(allOf={"android.permission.RECORD_AUDIO", "android.permission.CAPTURE_AUDIO_HOTWORD"})
    public void triggerHardwareRecognitionEventForTest(int p0, int p1, long p2, boolean p3, int p4, int p5, int p6, boolean p7, android.media.AudioFormat p8, byte[] p9, java.util.List<android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra> p10) {}
    public int getSupportedRecognitionModes() { return 0; }
    public int getSupportedAudioCapabilities() { return 0; }
    @android.annotation.RequiresPermission(allOf={"android.permission.RECORD_AUDIO", "android.permission.CAPTURE_AUDIO_HOTWORD"})
    public boolean startRecognition(int p0, byte[] p1) { return false; }
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
    @android.annotation.Nullable
    public android.service.voice.AlwaysOnHotwordDetector.ModelParamRange queryParameter(int p0) { return null; }
    @android.annotation.Nullable
    public android.content.Intent createEnrollIntent() { return null; }
    @android.annotation.Nullable
    public android.content.Intent createUnEnrollIntent() { return null; }
    @android.annotation.Nullable
    public android.content.Intent createReEnrollIntent() { return null; }
    public void destroy() {}
    public boolean isUsingSandboxedDetectionService() { return false; }
    void onSoundModelsChanged() {}
    void onDetectorRemoteException() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioCapabilities {
    }

    public static abstract class Callback implements android.service.voice.HotwordDetector.Callback {
        public Callback() {}
        public abstract void onAvailabilityChanged(int p0);
        public abstract void onDetected(android.service.voice.AlwaysOnHotwordDetector.EventPayload p0);
        @java.lang.Deprecated
        public abstract void onError();
        public void onFailure(android.service.voice.SoundTriggerFailure p0) {}
        public abstract void onRecognitionPaused();
        public abstract void onRecognitionResumed();
        public void onRejected(android.service.voice.HotwordRejectedResult p0) {}
        public void onHotwordDetectionServiceInitialized(int p0) {}
        public void onHotwordDetectionServiceRestarted() {}
    }

    public static class EventPayload {
        public static final int DATA_FORMAT_RAW = 0;
        public static final int DATA_FORMAT_TRIGGER_AUDIO = 1;
        @android.annotation.Nullable
        public android.media.AudioFormat getCaptureAudioFormat() { return null; }
        @java.lang.Deprecated
        @android.annotation.Nullable
        public byte[] getTriggerAudio() { return null; }
        public int getDataFormat() { return 0; }
        @android.annotation.Nullable
        public byte[] getData() { return null; }
        @android.annotation.Nullable
        public java.lang.Integer getCaptureSession() { return null; }
        @android.annotation.Nullable
        public android.service.voice.HotwordDetectedResult getHotwordDetectedResult() { return null; }
        @android.annotation.Nullable
        public android.os.ParcelFileDescriptor getAudioStream() { return null; }
        @android.annotation.NonNull
        public java.util.List<android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra> getKeyphraseRecognitionExtras() { return null; }
        public long getHalEventReceivedMillis() { return 0L; }
        @android.annotation.FlaggedApi("android.app.wearable.enable_hotword_wearable_sensing_api")
        public boolean isRecognitionStopped() { return false; }

        public static final class Builder {
            public Builder() {}
            Builder(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0) {}
            @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
            @android.annotation.NonNull
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setCaptureAvailable(boolean p0) { return null; }
            @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
            @android.annotation.NonNull
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setCaptureSession(int p0) { return null; }
            @android.annotation.NonNull
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setCaptureAudioFormat(android.media.AudioFormat p0) { return null; }
            @android.annotation.NonNull
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setDataFormat(int p0) { return null; }
            @android.annotation.NonNull
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setData(byte[] p0) { return null; }
            @android.annotation.NonNull
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setHotwordDetectedResult(android.service.voice.HotwordDetectedResult p0) { return null; }
            @android.annotation.NonNull
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setAudioStream(android.os.ParcelFileDescriptor p0) { return null; }
            @android.annotation.NonNull
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setKeyphraseRecognitionExtras(java.util.List<android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra> p0) { return null; }
            @android.annotation.NonNull
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setHalEventReceivedMillis(long p0) { return null; }
            @android.annotation.FlaggedApi("android.app.wearable.enable_hotword_wearable_sensing_api")
            @android.annotation.NonNull
            public android.service.voice.AlwaysOnHotwordDetector.EventPayload.Builder setIsRecognitionStopped(boolean p0) { return null; }
            @android.annotation.NonNull
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
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModelParams {
    }

    class MyHandler extends android.os.Handler {
        MyHandler(android.service.voice.AlwaysOnHotwordDetector p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecognitionFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecognitionModes {
    }

    class RefreshAvailabilityTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
        RefreshAvailabilityTask(android.service.voice.AlwaysOnHotwordDetector p0) { super(); }
        public java.lang.Void doInBackground(java.lang.Void... p0) { return null; }
    }

    static final class SoundTriggerListener extends com.android.internal.app.IHotwordRecognitionStatusCallback.Stub {
        public SoundTriggerListener(android.os.Handler p0) { super(); }
        public void onKeyphraseDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, android.service.voice.HotwordDetectedResult p1) {}
        public void onKeyphraseDetectedFromExternalSource(android.service.voice.HotwordDetectedResult p0) {}
        public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) {}
        public void onRejected(android.service.voice.HotwordRejectedResult p0) {}
        public void onHotwordDetectionServiceFailure(android.service.voice.HotwordDetectionServiceFailure p0) {}
        public void onVisualQueryDetectionServiceFailure(android.service.voice.VisualQueryDetectionServiceFailure p0) throws android.os.RemoteException {}
        public void onSoundTriggerFailure(android.service.voice.SoundTriggerFailure p0) {}
        public void onUnknownFailure(java.lang.String p0) throws android.os.RemoteException {}
        public void onRecognitionPaused() {}
        public void onRecognitionResumed() {}
        public void onStatusReported(int p0) {}
        public void onProcessRestarted() {}
        public void onOpenFile(java.lang.String p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException {}
    }
}
