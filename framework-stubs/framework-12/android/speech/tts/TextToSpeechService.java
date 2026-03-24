package android.speech.tts;

public abstract class TextToSpeechService extends android.app.Service {
    private static final boolean DBG = false;
    private static final java.lang.String TAG = "TextToSpeechService";
    private static final java.lang.String SYNTH_THREAD_NAME = "SynthThread";
    private android.speech.tts.TextToSpeechService.SynthHandler mSynthHandler;
    private android.speech.tts.AudioPlaybackHandler mAudioPlaybackHandler;
    private android.speech.tts.TtsEngines mEngineHelper;
    private android.speech.tts.TextToSpeechService.CallbackMap mCallbacks;
    private java.lang.String mPackageName;
    private final java.lang.Object mVoicesInfoLock = null;
    private final android.speech.tts.ITextToSpeechService.Stub mBinder = null;
    public TextToSpeechService() { super(); }
    public void onCreate() {}
    public void onDestroy() {}
    protected abstract int onIsLanguageAvailable(java.lang.String p0, java.lang.String p1, java.lang.String p2);
    protected abstract java.lang.String[] onGetLanguage();
    protected abstract int onLoadLanguage(java.lang.String p0, java.lang.String p1, java.lang.String p2);
    protected abstract void onStop();
    protected abstract void onSynthesizeText(android.speech.tts.SynthesisRequest p0, android.speech.tts.SynthesisCallback p1);
    protected java.util.Set<java.lang.String> onGetFeaturesForLanguage(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    private int getExpectedLanguageAvailableStatus(java.util.Locale p0) { return 0; }
    public java.util.List<android.speech.tts.Voice> onGetVoices() { return null; }
    public java.lang.String onGetDefaultVoiceNameFor(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public int onLoadVoice(java.lang.String p0) { return 0; }
    public int onIsValidVoiceName(java.lang.String p0) { return 0; }
    private int getDefaultSpeechRate() { return 0; }
    private int getDefaultPitch() { return 0; }
    private java.lang.String[] getSettingsLocale() { return null; }
    private int getSecureSettingInt(java.lang.String p0, int p1) { return 0; }
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
        private final android.speech.tts.AudioPlaybackQueueItem mItem = null;
        public AudioSpeechItem(android.speech.tts.TextToSpeechService p0, java.lang.Object p1, int p2, int p3, android.os.Bundle p4, java.lang.String p5, android.net.Uri p6) { super(null, null, 0, 0, null, null); }
        public boolean isValid() { return false; }
        protected void playImpl() {}
        protected void stopImpl() {}
        public java.lang.String getUtteranceId() { return null; }
        android.speech.tts.TextToSpeechService.AudioOutputParams getAudioParams() { return null; }
    }

    private class CallbackMap extends android.os.RemoteCallbackList<android.speech.tts.ITextToSpeechCallback> {
        private final java.util.HashMap<android.os.IBinder, android.speech.tts.ITextToSpeechCallback> mCallerToCallback = null;
        private CallbackMap(android.speech.tts.TextToSpeechService p0) { super(); }
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
        private android.speech.tts.ITextToSpeechCallback getCallbackFor(java.lang.Object p0) { return null; }
    }

    private class LoadLanguageItem extends android.speech.tts.TextToSpeechService.SpeechItem {
        private final java.lang.String mLanguage = null;
        private final java.lang.String mCountry = null;
        private final java.lang.String mVariant = null;
        public LoadLanguageItem(android.speech.tts.TextToSpeechService p0, java.lang.Object p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) { super(null, null, 0, 0); }
        public boolean isValid() { return false; }
        protected void playImpl() {}
        protected void stopImpl() {}
    }

    private class LoadVoiceItem extends android.speech.tts.TextToSpeechService.SpeechItem {
        private final java.lang.String mVoiceName = null;
        public LoadVoiceItem(android.speech.tts.TextToSpeechService p0, java.lang.Object p1, int p2, int p3, java.lang.String p4) { super(null, null, 0, 0); }
        public boolean isValid() { return false; }
        protected void playImpl() {}
        protected void stopImpl() {}
    }

    private class SilenceSpeechItem extends android.speech.tts.TextToSpeechService.UtteranceSpeechItem {
        private final long mDuration = 0L;
        private final java.lang.String mUtteranceId = null;
        public SilenceSpeechItem(android.speech.tts.TextToSpeechService p0, java.lang.Object p1, int p2, int p3, java.lang.String p4, long p5) { super(null, null, 0, 0); }
        public boolean isValid() { return false; }
        protected void playImpl() {}
        protected void stopImpl() {}
        public java.lang.String getUtteranceId() { return null; }
    }

    private abstract class SpeechItem {
        private final java.lang.Object mCallerIdentity = null;
        private final int mCallerUid = 0;
        private final int mCallerPid = 0;
        private boolean mStarted;
        private boolean mStopped;
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

    private class SynthHandler extends android.os.Handler {
        private android.speech.tts.TextToSpeechService.SpeechItem mCurrentSpeechItem;
        private java.util.List<java.lang.Object> mFlushedObjects;
        private int mFlushAll;
        public SynthHandler(android.speech.tts.TextToSpeechService p0, android.os.Looper p1) { super(); }
        private void startFlushingSpeechItems(java.lang.Object p0) {}
        private void endFlushingSpeechItems(java.lang.Object p0) {}
        private boolean isFlushed(android.speech.tts.TextToSpeechService.SpeechItem p0) { return false; }
        private synchronized android.speech.tts.TextToSpeechService.SpeechItem getCurrentSpeechItem() { return null; }
        private synchronized boolean setCurrentSpeechItem(android.speech.tts.TextToSpeechService.SpeechItem p0) { return false; }
        private synchronized android.speech.tts.TextToSpeechService.SpeechItem removeCurrentSpeechItem() { return null; }
        private synchronized android.speech.tts.TextToSpeechService.SpeechItem maybeRemoveCurrentSpeechItem(java.lang.Object p0) { return null; }
        public boolean isSpeaking() { return false; }
        public void quit() {}
        public int enqueueSpeechItem(int p0, android.speech.tts.TextToSpeechService.SpeechItem p1) { return 0; }
        public int stopForApp(java.lang.Object p0) { return 0; }
        public int stopAll() { return 0; }
    }

    private class SynthThread extends android.os.HandlerThread implements android.os.MessageQueue.IdleHandler {
        private boolean mFirstIdle;
        public SynthThread(android.speech.tts.TextToSpeechService p0) { super((java.lang.String)null); }
        protected void onLooperPrepared() {}
        public boolean queueIdle() { return false; }
        private void broadcastTtsQueueProcessingCompleted() {}
    }

    class SynthesisSpeechItem extends android.speech.tts.TextToSpeechService.UtteranceSpeechItemWithParams {
        private final java.lang.CharSequence mText = null;
        private final android.speech.tts.SynthesisRequest mSynthesisRequest = null;
        private final java.lang.String[] mDefaultLocale = null;
        private android.speech.tts.AbstractSynthesisCallback mSynthesisCallback;
        private final android.speech.tts.EventLogger mEventLogger = null;
        private final int mCallerUid = 0;
        public SynthesisSpeechItem(android.speech.tts.TextToSpeechService p0, java.lang.Object p1, int p2, int p3, android.os.Bundle p4, java.lang.String p5, java.lang.CharSequence p6) { super(null, null, 0, 0, null, null); }
        public java.lang.CharSequence getText() { return null; }
        public boolean isValid() { return false; }
        protected void playImpl() {}
        protected android.speech.tts.AbstractSynthesisCallback createSynthesisCallback() { return null; }
        private void setRequestParams(android.speech.tts.SynthesisRequest p0) {}
        protected void stopImpl() {}
        private java.lang.String getCountry() { return null; }
        private java.lang.String getVariant() { return null; }
        public java.lang.String getLanguage() { return null; }
        public java.lang.String getVoiceName() { return null; }
    }

    private class SynthesisToFileOutputStreamSpeechItem extends android.speech.tts.TextToSpeechService.SynthesisSpeechItem {
        private final java.io.FileOutputStream mFileOutputStream = null;
        public SynthesisToFileOutputStreamSpeechItem(android.speech.tts.TextToSpeechService p0, java.lang.Object p1, int p2, int p3, android.os.Bundle p4, java.lang.String p5, java.lang.CharSequence p6, java.io.FileOutputStream p7) { super(null, null, 0, 0, null, null, null); }
        protected android.speech.tts.AbstractSynthesisCallback createSynthesisCallback() { return null; }
        protected void playImpl() {}
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
