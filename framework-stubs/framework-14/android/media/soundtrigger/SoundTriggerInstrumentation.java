package android.media.soundtrigger;

public final class SoundTriggerInstrumentation {
    @android.annotation.RequiresPermission("android.permission.MANAGE_SOUND_TRIGGER")
    public SoundTriggerInstrumentation(com.android.internal.app.ISoundTriggerService p0, java.util.concurrent.Executor p1, android.media.soundtrigger.SoundTriggerInstrumentation.GlobalCallback p2) {}
    public void triggerRestart() {}
    public void triggerOnResourcesAvailable() {}
    public void setResourceContention(boolean p0) {}
    public void setInPhoneCallState(boolean p0) {}

    public static interface GlobalCallback {
        default public void onPreempted() {}
        default public void onRestarted() {}
        default public void onFrameworkDetached() {}
        default public void onClientAttached() {}
        default public void onClientDetached() {}
        public void onModelLoaded(android.media.soundtrigger.SoundTriggerInstrumentation.ModelSession p0);
    }

    private class Injection extends android.media.soundtrigger_middleware.ISoundTriggerInjection.Stub {
        public void registerGlobalEventInjection(android.media.soundtrigger_middleware.IInjectGlobalEvent p0) {}
        public void onSoundModelLoaded(android.media.soundtrigger.SoundModel p0, android.media.soundtrigger.Phrase[] p1, android.media.soundtrigger_middleware.IInjectModelEvent p2, android.media.soundtrigger_middleware.IInjectGlobalEvent p3) {}
        public void onSoundModelUnloaded(android.media.soundtrigger_middleware.IInjectModelEvent p0) {}
        public void onRecognitionStarted(int p0, android.media.soundtrigger.RecognitionConfig p1, android.media.soundtrigger_middleware.IInjectRecognitionEvent p2, android.media.soundtrigger_middleware.IInjectModelEvent p3) {}
        public void onRecognitionStopped(android.media.soundtrigger_middleware.IInjectRecognitionEvent p0) {}
        public void onParamSet(int p0, int p1, android.media.soundtrigger_middleware.IInjectModelEvent p2) {}
        public void onRestarted(android.media.soundtrigger_middleware.IInjectGlobalEvent p0) {}
        public void onFrameworkDetached(android.media.soundtrigger_middleware.IInjectGlobalEvent p0) {}
        public void onClientAttached(android.os.IBinder p0, android.media.soundtrigger_middleware.IInjectGlobalEvent p1) {}
        public void onClientDetached(android.os.IBinder p0) {}
        public void onPreempted() {}
    }

    public static interface ModelCallback {
        default public void onModelUnloaded() {}
        default public void onParamSet(int p0, int p1) {}
        public void onRecognitionStarted(android.media.soundtrigger.SoundTriggerInstrumentation.RecognitionSession p0);
    }

    public class ModelSession {
        public void triggerUnloadModel() {}
        public android.media.soundtrigger.SoundTriggerManager.Model getSoundModel() { return null; }
        public java.util.List<android.hardware.soundtrigger.SoundTrigger.Keyphrase> getPhrases() { return null; }
        public boolean isKeyphrase() { return false; }
        public void setModelCallback(java.util.concurrent.Executor p0, android.media.soundtrigger.SoundTriggerInstrumentation.ModelCallback p1) {}
        public void clearModelCallback() {}
    }

    public static interface RecognitionCallback {
        public void onRecognitionStopped();
    }

    public class RecognitionSession {
        public int getAudioSession() { return 0; }
        public android.hardware.soundtrigger.SoundTrigger.RecognitionConfig getRecognitionConfig() { return null; }
        public void triggerRecognitionEvent(byte[] p0, java.util.List<android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionExtra> p1) {}
        public void triggerAbortRecognition() {}
        public void setRecognitionCallback(java.util.concurrent.Executor p0, android.media.soundtrigger.SoundTriggerInstrumentation.RecognitionCallback p1) {}
        public void clearRecognitionCallback() {}
    }
}
