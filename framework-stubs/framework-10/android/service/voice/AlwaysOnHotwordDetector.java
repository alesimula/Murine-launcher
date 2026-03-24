package android.service.voice;

public class AlwaysOnHotwordDetector {
    private static final int STATE_INVALID = -3;
    public static final int STATE_HARDWARE_UNAVAILABLE = -2;
    public static final int STATE_KEYPHRASE_UNSUPPORTED = -1;
    public static final int STATE_KEYPHRASE_UNENROLLED = 1;
    public static final int STATE_KEYPHRASE_ENROLLED = 2;
    private static final int STATE_NOT_READY = 0;
    public static final int MANAGE_ACTION_ENROLL = 0;
    public static final int MANAGE_ACTION_RE_ENROLL = 1;
    public static final int MANAGE_ACTION_UN_ENROLL = 2;
    public static final int RECOGNITION_FLAG_NONE = 0;
    public static final int RECOGNITION_FLAG_CAPTURE_TRIGGER_AUDIO = 1;
    public static final int RECOGNITION_FLAG_ALLOW_MULTIPLE_TRIGGERS = 2;
    public static final int RECOGNITION_MODE_VOICE_TRIGGER = 1;
    public static final int RECOGNITION_MODE_USER_IDENTIFICATION = 2;
    static final java.lang.String TAG = "AlwaysOnHotwordDetector";
    static final boolean DBG = false;
    private static final int STATUS_ERROR = -2147483648;
    private static final int STATUS_OK = 0;
    private static final int MSG_AVAILABILITY_CHANGED = 1;
    private static final int MSG_HOTWORD_DETECTED = 2;
    private static final int MSG_DETECTION_ERROR = 3;
    private static final int MSG_DETECTION_PAUSE = 4;
    private static final int MSG_DETECTION_RESUME = 5;
    private final java.lang.String mText = null;
    private final java.util.Locale mLocale = null;
    private final android.hardware.soundtrigger.KeyphraseMetadata mKeyphraseMetadata = null;
    private final android.hardware.soundtrigger.KeyphraseEnrollmentInfo mKeyphraseEnrollmentInfo = null;
    private final android.service.voice.IVoiceInteractionService mVoiceInteractionService = null;
    private final com.android.internal.app.IVoiceInteractionManagerService mModelManagementService = null;
    private final android.service.voice.AlwaysOnHotwordDetector.SoundTriggerListener mInternalCallback = null;
    private final android.service.voice.AlwaysOnHotwordDetector.Callback mExternalCallback = null;
    private final java.lang.Object mLock = null;
    private final android.os.Handler mHandler = null;
    private int mAvailability;
    public AlwaysOnHotwordDetector(java.lang.String p0, java.util.Locale p1, android.service.voice.AlwaysOnHotwordDetector.Callback p2, android.hardware.soundtrigger.KeyphraseEnrollmentInfo p3, android.service.voice.IVoiceInteractionService p4, com.android.internal.app.IVoiceInteractionManagerService p5) {}
    public int getSupportedRecognitionModes() { return 0; }
    private int getSupportedRecognitionModesLocked() { return 0; }
    public boolean startRecognition(int p0) { return false; }
    public boolean stopRecognition() { return false; }
    public android.content.Intent createEnrollIntent() { return null; }
    public android.content.Intent createUnEnrollIntent() { return null; }
    public android.content.Intent createReEnrollIntent() { return null; }
    private android.content.Intent getManageIntentLocked(int p0) { return null; }
    void invalidate() {}
    void onSoundModelsChanged() {}
    private int startRecognitionLocked(int p0) { return 0; }
    private int stopRecognitionLocked() { return 0; }
    private void notifyStateChangedLocked() {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}

    static final class SoundTriggerListener extends android.hardware.soundtrigger.IRecognitionStatusCallback.Stub {
        private final android.os.Handler mHandler = null;
        public SoundTriggerListener(android.os.Handler p0) { super(); }
        public void onKeyphraseDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0) {}
        public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) {}
        public void onError(int p0) {}
        public void onRecognitionPaused() {}
        public void onRecognitionResumed() {}
    }

    class RefreshAvailabiltyTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
        RefreshAvailabiltyTask(android.service.voice.AlwaysOnHotwordDetector p0) { super(); }
        public java.lang.Void doInBackground(java.lang.Void... p0) { return null; }
        private int internalGetInitialAvailability() { return 0; }
        private boolean internalGetIsEnrolled(int p0, java.util.Locale p1) { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecognitionModes {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecognitionFlags {
    }

    class MyHandler extends android.os.Handler {
        MyHandler(android.service.voice.AlwaysOnHotwordDetector p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface ManageActions {
    }

    public static class EventPayload {
        private final boolean mTriggerAvailable = false;
        private final boolean mCaptureAvailable = false;
        private final int mCaptureSession = 0;
        private final android.media.AudioFormat mAudioFormat = null;
        private final byte[] mData = null;
        private EventPayload(boolean p0, boolean p1, android.media.AudioFormat p2, int p3, byte[] p4) {}
        public android.media.AudioFormat getCaptureAudioFormat() { return null; }
        public byte[] getTriggerAudio() { return null; }
        @android.annotation.UnsupportedAppUsage
        public java.lang.Integer getCaptureSession() { return null; }
    }

    public static abstract class Callback {
        public Callback() {}
        public abstract void onAvailabilityChanged(int p0);
        public abstract void onDetected(android.service.voice.AlwaysOnHotwordDetector.EventPayload p0);
        public abstract void onError();
        public abstract void onRecognitionPaused();
        public abstract void onRecognitionResumed();
    }
}
