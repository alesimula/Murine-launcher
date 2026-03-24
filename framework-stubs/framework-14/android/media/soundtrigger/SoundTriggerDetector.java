package android.media.soundtrigger;

@java.lang.Deprecated
@android.annotation.SystemApi
public final class SoundTriggerDetector {
    public static final int RECOGNITION_FLAG_NONE = 0;
    public static final int RECOGNITION_FLAG_CAPTURE_TRIGGER_AUDIO = 1;
    public static final int RECOGNITION_FLAG_ALLOW_MULTIPLE_TRIGGERS = 2;
    public static final int RECOGNITION_FLAG_ENABLE_AUDIO_ECHO_CANCELLATION = 4;
    public static final int RECOGNITION_FLAG_ENABLE_AUDIO_NOISE_SUPPRESSION = 8;
    public static final int RECOGNITION_FLAG_RUN_IN_BATTERY_SAVER = 16;
    SoundTriggerDetector(com.android.internal.app.ISoundTriggerSession p0, android.hardware.soundtrigger.SoundTrigger.GenericSoundModel p1, android.media.soundtrigger.SoundTriggerDetector.Callback p2, android.os.Handler p3) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MANAGE_SOUND_TRIGGER")
    public boolean startRecognition(int p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MANAGE_SOUND_TRIGGER")
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
        public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) {}
        public void onKeyphraseDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0) {}
        public void onRecognitionPaused() {}
        public void onRecognitionResumed() {}
        public void onPreempted() {}
        public void onModuleDied() {}
        public void onResumeFailed(int p0) {}
        public void onPauseFailed(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecognitionFlags {
    }
}
