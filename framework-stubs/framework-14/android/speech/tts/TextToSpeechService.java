package android.speech.tts;

public abstract class TextToSpeechService extends android.app.Service {
    public TextToSpeechService() { super(); }
    public void onCreate() {}
    public void onDestroy() {}
    protected abstract int onIsLanguageAvailable(java.lang.String p0, java.lang.String p1, java.lang.String p2);
    protected abstract java.lang.String[] onGetLanguage();
    protected abstract int onLoadLanguage(java.lang.String p0, java.lang.String p1, java.lang.String p2);
    protected abstract void onStop();
    protected abstract void onSynthesizeText(android.speech.tts.SynthesisRequest p0, android.speech.tts.SynthesisCallback p1);
    protected java.util.Set<java.lang.String> onGetFeaturesForLanguage(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public java.util.List<android.speech.tts.Voice> onGetVoices() { return null; }
    public java.lang.String onGetDefaultVoiceNameFor(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public int onLoadVoice(java.lang.String p0) { return 0; }
    public int onIsValidVoiceName(java.lang.String p0) { return 0; }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }

    static class AudioOutputParams {
        public final int mSessionId = 0;
        public final float mVolume = 0.0f;
        public final float mPan = 0.0f;
        public final android.media.AudioAttributes mAudioAttributes = null;
        AudioOutputParams() {}
        AudioOutputParams(int p0, float p1, float p2, android.media.AudioAttributes p3) {}
        static android.speech.tts.TextToSpeechService.AudioOutputParams createFromParamsBundle(android.os.Bundle p0, boolean p1) { return null; }
    }

    private class AudioSpeechItem extends android.speech.tts.TextToSpeechService.UtteranceSpeechItemWithParams {
        public AudioSpeechItem(android.speech.tts.TextToSpeechService p0, java.lang.Object p1, int p2, int p3, android.os.Bundle p4, java.lang.String p5, android.net.Uri p6) { super(null, null, 0, 0, null, null); }
        public boolean isValid() { return false; }
        protected void playImpl() {}
        protected void stopImpl() {}
        public java.lang.String getUtteranceId() { return null; }
        android.speech.tts.TextToSpeechService.AudioOutputParams getAudioParams() { return null; }
    }

    private class CallbackMap extends android.os.RemoteCallbackList<android.speech.tts.ITextToSpeechCallback> {
        public void setCallback(android.os.IBinder p0, android.speech.tts.ITextToSpeechCallback p1) {}
        public void dispatchOnStop(java.lang.Object p0, java.lang.String p1, boolean p2) {}
        public void dispatchOnSuccess(java.lang.Object p0, java.lang.String p1) {}
        public void dispatchOnStart(java.lang.Object p0, java.lang.String p1) {}
        public void dispatchOnError(java.lang.Object p0, java.lang.String p1, int p2) {}
        public void dispatchOnBeginSynthesis(java.lang.Object p0, java.lang.String p1, int p2, int p3, int p4) {}
        public void dispatchOnAudioAvailable(java.lang.Object p0, java.lang.String p1, byte[] p2) {}
        public void dispatchOnRangeStart(java.lang.Object p0, java.lang.String p1, int p2, int p3, int p4) {}
        public void onCallbackDied(android.speech.tts.ITextToSpeechCallback p0, java.lang.Object p1) {}
        public void kill() {}
    }

    private class LoadLanguageItem extends android.speech.tts.TextToSpeechService.SpeechItem {
        public LoadLanguageItem(android.speech.tts.TextToSpeechService p0, java.lang.Object p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) { super(null, null, 0, 0); }
        public boolean isValid() { return false; }
        protected void playImpl() {}
        protected void stopImpl() {}
    }

    private class LoadVoiceItem extends android.speech.tts.TextToSpeechService.SpeechItem {
        public LoadVoiceItem(android.speech.tts.TextToSpeechService p0, java.lang.Object p1, int p2, int p3, java.lang.String p4) { super(null, null, 0, 0); }
        public boolean isValid() { return false; }
        protected void playImpl() {}
        protected void stopImpl() {}
    }

    private class SilenceSpeechItem extends android.speech.tts.TextToSpeechService.UtteranceSpeechItem {
        public SilenceSpeechItem(android.speech.tts.TextToSpeechService p0, java.lang.Object p1, int p2, int p3, java.lang.String p4, long p5) { super(null, null, 0, 0); }
        public boolean isValid() { return false; }
        protected void playImpl() {}
        protected void stopImpl() {}
        public java.lang.String getUtteranceId() { return null; }
    }

    private abstract class SpeechItem {
        public SpeechItem(android.speech.tts.TextToSpeechService p0, java.lang.Object p1, int p2, int p3) {}
        public java.lang.Object getCallerIdentity() { return null; }
        public int getCallerUid() { return 0; }
        public int getCallerPid() { return 0; }
        public abstract boolean isValid();
        public void play() {}
        protected abstract void playImpl();
        public void stop() {}
        protected abstract void stopImpl();
        protected synchronized boolean isStopped() { return false; }
        protected synchronized boolean isStarted() { return false; }
    }

    class SynthesisSpeechItem extends android.speech.tts.TextToSpeechService.UtteranceSpeechItemWithParams {
        public SynthesisSpeechItem(android.speech.tts.TextToSpeechService p0, java.lang.Object p1, int p2, int p3, android.os.Bundle p4, java.lang.String p5, java.lang.CharSequence p6) { super(null, null, 0, 0, null, null); }
        public java.lang.CharSequence getText() { return null; }
        public boolean isValid() { return false; }
        protected void playImpl() {}
        protected android.speech.tts.AbstractSynthesisCallback createSynthesisCallback() { return null; }
        protected void stopImpl() {}
        public java.lang.String getLanguage() { return null; }
        public java.lang.String getVoiceName() { return null; }
    }

    private class SynthesisToFileOutputStreamSpeechItem extends android.speech.tts.TextToSpeechService.SynthesisSpeechItem {
        public SynthesisToFileOutputStreamSpeechItem(android.speech.tts.TextToSpeechService p0, java.lang.Object p1, int p2, int p3, android.os.Bundle p4, java.lang.String p5, java.lang.CharSequence p6, java.io.FileOutputStream p7) { super(null, null, 0, 0, null, null, null); }
        protected android.speech.tts.AbstractSynthesisCallback createSynthesisCallback() { return null; }
        protected void playImpl() {}
    }

    private class SynthHandler extends android.os.Handler {
        public SynthHandler(android.speech.tts.TextToSpeechService p0, android.os.Looper p1) { super(); }
        public boolean isSpeaking() { return false; }
        public void quit() {}
        public int enqueueSpeechItem(int p0, android.speech.tts.TextToSpeechService.SpeechItem p1) { return 0; }
        public int stopForApp(java.lang.Object p0) { return 0; }
        public int stopAll() { return 0; }
    }

    private class SynthThread extends android.os.HandlerThread implements android.os.MessageQueue.IdleHandler {
        public SynthThread(android.speech.tts.TextToSpeechService p0) { super((java.lang.String)null); }
        protected void onLooperPrepared() {}
        public boolean queueIdle() { return false; }
    }

    static interface UtteranceProgressDispatcher {
        public void dispatchOnStop();
        public void dispatchOnSuccess();
        public void dispatchOnStart();
        public void dispatchOnError(int p0);
        public void dispatchOnBeginSynthesis(int p0, int p1, int p2);
        public void dispatchOnAudioAvailable(byte[] p0);
        public void dispatchOnRangeStart(int p0, int p1, int p2);
    }

    private abstract class UtteranceSpeechItem extends android.speech.tts.TextToSpeechService.SpeechItem implements android.speech.tts.TextToSpeechService.UtteranceProgressDispatcher {
        public UtteranceSpeechItem(android.speech.tts.TextToSpeechService p0, java.lang.Object p1, int p2, int p3) { super(null, null, 0, 0); }
        public void dispatchOnSuccess() {}
        public void dispatchOnStop() {}
        public void dispatchOnStart() {}
        public void dispatchOnError(int p0) {}
        public void dispatchOnBeginSynthesis(int p0, int p1, int p2) {}
        public void dispatchOnAudioAvailable(byte[] p0) {}
        public void dispatchOnRangeStart(int p0, int p1, int p2) {}
        public abstract java.lang.String getUtteranceId();
        java.lang.String getStringParam(android.os.Bundle p0, java.lang.String p1, java.lang.String p2) { return null; }
        int getIntParam(android.os.Bundle p0, java.lang.String p1, int p2) { return 0; }
        float getFloatParam(android.os.Bundle p0, java.lang.String p1, float p2) { return 0.0f; }
    }

    private abstract class UtteranceSpeechItemWithParams extends android.speech.tts.TextToSpeechService.UtteranceSpeechItem {
        protected final android.os.Bundle mParams = null;
        protected final java.lang.String mUtteranceId = null;
        UtteranceSpeechItemWithParams(android.speech.tts.TextToSpeechService p0, java.lang.Object p1, int p2, int p3, android.os.Bundle p4, java.lang.String p5) { super(null, null, 0, 0); }
        boolean hasLanguage() { return false; }
        int getSpeechRate() { return 0; }
        int getPitch() { return 0; }
        public java.lang.String getUtteranceId() { return null; }
        android.speech.tts.TextToSpeechService.AudioOutputParams getAudioParams() { return null; }
    }
}
