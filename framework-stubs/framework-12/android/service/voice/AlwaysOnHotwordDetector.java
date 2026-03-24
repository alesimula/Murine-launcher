package android.service.voice;

@android.annotation.SystemApi
public class AlwaysOnHotwordDetector extends android.service.voice.AbstractHotwordDetector {
    private static final int STATE_INVALID = -3;
    public static final int STATE_HARDWARE_UNAVAILABLE = -2;
    @java.lang.Deprecated
    public static final int STATE_KEYPHRASE_UNSUPPORTED = -1;
    public static final int STATE_KEYPHRASE_UNENROLLED = 1;
    public static final int STATE_KEYPHRASE_ENROLLED = 2;
    public static final int STATE_ERROR = 3;
    private static final int STATE_NOT_READY = 0;
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
    private static final int STATUS_ERROR = -2147483648;
    private static final int STATUS_OK = 0;
    private static final int MSG_AVAILABILITY_CHANGED = 1;
    private static final int MSG_HOTWORD_DETECTED = 2;
    private static final int MSG_DETECTION_ERROR = 3;
    private static final int MSG_DETECTION_PAUSE = 4;
    private static final int MSG_DETECTION_RESUME = 5;
    private static final int MSG_HOTWORD_REJECTED = 6;
    private static final int MSG_HOTWORD_STATUS_REPORTED = 7;
    private static final int MSG_PROCESS_RESTARTED = 8;
    private final java.lang.String mText = null;
    private final java.util.Locale mLocale = null;
    private android.hardware.soundtrigger.KeyphraseMetadata mKeyphraseMetadata;
    private final android.hardware.soundtrigger.KeyphraseEnrollmentInfo mKeyphraseEnrollmentInfo = null;
    private final com.android.internal.app.IVoiceInteractionManagerService mModelManagementService = null;
    private final com.android.internal.app.IVoiceInteractionSoundTriggerSession mSoundTriggerSession = null;
    private final android.service.voice.AlwaysOnHotwordDetector.SoundTriggerListener mInternalCallback = null;
    private final android.service.voice.AlwaysOnHotwordDetector.Callback mExternalCallback = null;
    private final android.os.Handler mHandler = null;
    private final android.os.IBinder mBinder = null;
    private final int mTargetSdkVersion = 0;
    private final boolean mSupportHotwordDetectionService = false;
    private int mAvailability;
    public AlwaysOnHotwordDetector(java.lang.String p0, java.util.Locale p1, android.service.voice.AlwaysOnHotwordDetector.Callback p2, android.hardware.soundtrigger.KeyphraseEnrollmentInfo p3, com.android.internal.app.IVoiceInteractionManagerService p4, int p5, boolean p6, android.os.PersistableBundle p7, android.os.SharedMemory p8) { super(null, null); }
    public final void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.RECORD_AUDIO", "android.permission.CAPTURE_AUDIO_HOTWORD"})
    public void triggerHardwareRecognitionEventForTest(int p0, int p1, boolean p2, int p3, int p4, int p5, boolean p6, android.media.AudioFormat p7, byte[] p8) {}
    public int getSupportedRecognitionModes() { return 0; }
    private int getSupportedRecognitionModesLocked() { return 0; }
    public int getSupportedAudioCapabilities() { return 0; }
    private int getSupportedAudioCapabilitiesLocked() { return 0; }
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
    private android.content.Intent getManageIntentLocked(int p0) { return null; }
    void invalidate() {}
    void onSoundModelsChanged() {}
    private int startRecognitionLocked(int p0) { return 0; }
    private int stopRecognitionLocked() { return 0; }
    private int setParameterLocked(int p0, int p1) { return 0; }
    private int getParameterLocked(int p0) { return 0; }
    private android.service.voice.AlwaysOnHotwordDetector.ModelParamRange queryParameterLocked(int p0) { return null; }
    private void updateAndNotifyStateChangedLocked(int p0) {}
    private void notifyStateChangedLocked() {}
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
        private final boolean mTriggerAvailable = false;
        private final boolean mCaptureAvailable = false;
        private final int mCaptureSession = 0;
        private final android.media.AudioFormat mAudioFormat = null;
        private final byte[] mData = null;
        private final android.service.voice.HotwordDetectedResult mHotwordDetectedResult = null;
        private final android.os.ParcelFileDescriptor mAudioStream = null;
        EventPayload(boolean p0, boolean p1, android.media.AudioFormat p2, int p3, byte[] p4) {}
        EventPayload(boolean p0, boolean p1, android.media.AudioFormat p2, int p3, byte[] p4, android.service.voice.HotwordDetectedResult p5) {}
        EventPayload(android.media.AudioFormat p0, android.service.voice.HotwordDetectedResult p1) {}
        EventPayload(android.media.AudioFormat p0, android.service.voice.HotwordDetectedResult p1, android.os.ParcelFileDescriptor p2) {}
        private EventPayload(boolean p0, boolean p1, android.media.AudioFormat p2, int p3, byte[] p4, android.service.voice.HotwordDetectedResult p5, android.os.ParcelFileDescriptor p6) {}
        public android.media.AudioFormat getCaptureAudioFormat() { return null; }
        public byte[] getTriggerAudio() { return null; }
        public java.lang.Integer getCaptureSession() { return null; }
        public android.service.voice.HotwordDetectedResult getHotwordDetectedResult() { return null; }
        public android.os.ParcelFileDescriptor getAudioStream() { return null; }
    }

    public static final class ModelParamRange {
        private final android.hardware.soundtrigger.SoundTrigger.ModelParamRange mModelParamRange = null;
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
        private int internalGetInitialAvailability() { return 0; }
        private void internalUpdateEnrolledKeyphraseMetadata() {}
    }

    static final class SoundTriggerListener extends com.android.internal.app.IHotwordRecognitionStatusCallback.Stub {
        private final android.os.Handler mHandler = null;
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
