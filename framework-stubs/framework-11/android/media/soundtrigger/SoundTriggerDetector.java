package android.media.soundtrigger;

@android.annotation.SystemApi
public final class SoundTriggerDetector {
    private static final boolean DBG = false;
    private static final java.lang.String TAG = "SoundTriggerDetector";
    private static final int MSG_AVAILABILITY_CHANGED = 1;
    private static final int MSG_SOUND_TRIGGER_DETECTED = 2;
    private static final int MSG_DETECTION_ERROR = 3;
    private static final int MSG_DETECTION_PAUSE = 4;
    private static final int MSG_DETECTION_RESUME = 5;
    private final java.lang.Object mLock = null;
    private final com.android.internal.app.ISoundTriggerService mSoundTriggerService = null;
    private final java.util.UUID mSoundModelId = null;
    private final android.media.soundtrigger.SoundTriggerDetector.Callback mCallback = null;
    private final android.os.Handler mHandler = null;
    private final android.media.soundtrigger.SoundTriggerDetector.RecognitionCallback mRecognitionCallback = null;
    public static final int RECOGNITION_FLAG_NONE = 0;
    public static final int RECOGNITION_FLAG_CAPTURE_TRIGGER_AUDIO = 1;
    public static final int RECOGNITION_FLAG_ALLOW_MULTIPLE_TRIGGERS = 2;
    public static final int RECOGNITION_FLAG_ENABLE_AUDIO_ECHO_CANCELLATION = 4;
    public static final int RECOGNITION_FLAG_ENABLE_AUDIO_NOISE_SUPPRESSION = 8;
    SoundTriggerDetector(com.android.internal.app.ISoundTriggerService p0, java.util.UUID p1, android.media.soundtrigger.SoundTriggerDetector.Callback p2, android.os.Handler p3) {}
    public boolean startRecognition(int p0) { return false; }
    public boolean stopRecognition() { return false; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}

    public static abstract class Callback {
        public Callback() {}
        public abstract void onAvailabilityChanged(int p0);
        public abstract void onDetected(android.media.soundtrigger.SoundTriggerDetector.EventPayload p0);
        public abstract void onError();
        public abstract void onRecognitionPaused();
        public abstract void onRecognitionResumed();
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
        public byte[] getData() { return null; }
        public java.lang.Integer getCaptureSession() { return null; }
    }

    private class MyHandler extends android.os.Handler {
        MyHandler(android.media.soundtrigger.SoundTriggerDetector p0) { super(); }
        MyHandler(android.media.soundtrigger.SoundTriggerDetector p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private class RecognitionCallback extends android.hardware.soundtrigger.IRecognitionStatusCallback.Stub {
        private RecognitionCallback(android.media.soundtrigger.SoundTriggerDetector p0) { super(); }
        public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) {}
        public void onKeyphraseDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0) {}
        public void onError(int p0) {}
        public void onRecognitionPaused() {}
        public void onRecognitionResumed() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecognitionFlags {
    }
}
