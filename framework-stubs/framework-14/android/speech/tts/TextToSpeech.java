package android.speech.tts;

public class TextToSpeech {
    public static final int SUCCESS = 0;
    public static final int ERROR = -1;
    public static final int STOPPED = -2;
    public static final int ERROR_SYNTHESIS = -3;
    public static final int ERROR_SERVICE = -4;
    public static final int ERROR_OUTPUT = -5;
    public static final int ERROR_NETWORK = -6;
    public static final int ERROR_NETWORK_TIMEOUT = -7;
    public static final int ERROR_INVALID_REQUEST = -8;
    public static final int ERROR_NOT_INSTALLED_YET = -9;
    public static final int QUEUE_FLUSH = 0;
    public static final int QUEUE_ADD = 1;
    static final int QUEUE_DESTROY = 2;
    public static final int LANG_COUNTRY_VAR_AVAILABLE = 2;
    public static final int LANG_COUNTRY_AVAILABLE = 1;
    public static final int LANG_AVAILABLE = 0;
    public static final int LANG_MISSING_DATA = -1;
    public static final int LANG_NOT_SUPPORTED = -2;
    public static final java.lang.String ACTION_TTS_QUEUE_PROCESSING_COMPLETED = "android.speech.tts.TTS_QUEUE_PROCESSING_COMPLETED";
    public TextToSpeech(android.content.Context p0, android.speech.tts.TextToSpeech.OnInitListener p1) {}
    public TextToSpeech(android.content.Context p0, android.speech.tts.TextToSpeech.OnInitListener p1, java.lang.String p2) {}
    public TextToSpeech(android.content.Context p0, android.speech.tts.TextToSpeech.OnInitListener p1, java.lang.String p2, java.lang.String p3, boolean p4) {}
    public void shutdown() {}
    public int addSpeech(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
    public int addSpeech(java.lang.CharSequence p0, java.lang.String p1, int p2) { return 0; }
    public int addSpeech(java.lang.String p0, java.lang.String p1) { return 0; }
    public int addSpeech(java.lang.CharSequence p0, java.io.File p1) { return 0; }
    public int addSpeech(java.lang.CharSequence p0, android.net.Uri p1) { return 0; }
    public int addEarcon(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
    @java.lang.Deprecated
    public int addEarcon(java.lang.String p0, java.lang.String p1) { return 0; }
    public int addEarcon(java.lang.String p0, java.io.File p1) { return 0; }
    public int addEarcon(java.lang.String p0, android.net.Uri p1) { return 0; }
    public int speak(java.lang.CharSequence p0, int p1, android.os.Bundle p2, java.lang.String p3) { return 0; }
    @java.lang.Deprecated
    public int speak(java.lang.String p0, int p1, java.util.HashMap<java.lang.String, java.lang.String> p2) { return 0; }
    public int playEarcon(java.lang.String p0, int p1, android.os.Bundle p2, java.lang.String p3) { return 0; }
    @java.lang.Deprecated
    public int playEarcon(java.lang.String p0, int p1, java.util.HashMap<java.lang.String, java.lang.String> p2) { return 0; }
    public int playSilentUtterance(long p0, int p1, java.lang.String p2) { return 0; }
    @java.lang.Deprecated
    public int playSilence(long p0, int p1, java.util.HashMap<java.lang.String, java.lang.String> p2) { return 0; }
    @java.lang.Deprecated
    public java.util.Set<java.lang.String> getFeatures(java.util.Locale p0) { return null; }
    public boolean isSpeaking() { return false; }
    public int stop() { return 0; }
    public int setSpeechRate(float p0) { return 0; }
    public int setPitch(float p0) { return 0; }
    public int setAudioAttributes(android.media.AudioAttributes p0) { return 0; }
    public java.lang.String getCurrentEngine() { return null; }
    @java.lang.Deprecated
    public java.util.Locale getDefaultLanguage() { return null; }
    public int setLanguage(java.util.Locale p0) { return 0; }
    @java.lang.Deprecated
    public java.util.Locale getLanguage() { return null; }
    public java.util.Set<java.util.Locale> getAvailableLanguages() { return null; }
    public java.util.Set<android.speech.tts.Voice> getVoices() { return null; }
    public int setVoice(android.speech.tts.Voice p0) { return 0; }
    public android.speech.tts.Voice getVoice() { return null; }
    public android.speech.tts.Voice getDefaultVoice() { return null; }
    public int isLanguageAvailable(java.util.Locale p0) { return 0; }
    public int synthesizeToFile(java.lang.CharSequence p0, android.os.Bundle p1, android.os.ParcelFileDescriptor p2, java.lang.String p3) { return 0; }
    public int synthesizeToFile(java.lang.CharSequence p0, android.os.Bundle p1, java.io.File p2, java.lang.String p3) { return 0; }
    @java.lang.Deprecated
    public int synthesizeToFile(java.lang.String p0, java.util.HashMap<java.lang.String, java.lang.String> p1, java.lang.String p2) { return 0; }
    @java.lang.Deprecated
    public int setOnUtteranceCompletedListener(android.speech.tts.TextToSpeech.OnUtteranceCompletedListener p0) { return 0; }
    public int setOnUtteranceProgressListener(android.speech.tts.UtteranceProgressListener p0) { return 0; }
    @java.lang.Deprecated
    public int setEngineByPackageName(java.lang.String p0) { return 0; }
    public java.lang.String getDefaultEngine() { return null; }
    @java.lang.Deprecated
    public boolean areDefaultsEnforced() { return false; }
    public java.util.List<android.speech.tts.TextToSpeech.EngineInfo> getEngines() { return null; }
    public static int getMaxSpeechInputLength() { return 0; }

    @java.lang.Deprecated
    public static interface OnUtteranceCompletedListener {
        public void onUtteranceCompleted(java.lang.String p0);
    }

    public class Engine {
        public static final int DEFAULT_RATE = 100;
        public static final int DEFAULT_PITCH = 100;
        public static final float DEFAULT_VOLUME = 1.0f;
        public static final float DEFAULT_PAN = 0.0f;
        public static final int USE_DEFAULTS = 0;
        @java.lang.Deprecated
        public static final java.lang.String DEFAULT_ENGINE = "com.svox.pico";
        public static final int DEFAULT_STREAM = 3;
        public static final int CHECK_VOICE_DATA_PASS = 1;
        public static final int CHECK_VOICE_DATA_FAIL = 0;
        @java.lang.Deprecated
        public static final int CHECK_VOICE_DATA_BAD_DATA = -1;
        @java.lang.Deprecated
        public static final int CHECK_VOICE_DATA_MISSING_DATA = -2;
        @java.lang.Deprecated
        public static final int CHECK_VOICE_DATA_MISSING_VOLUME = -3;
        public static final java.lang.String INTENT_ACTION_TTS_SERVICE = "android.intent.action.TTS_SERVICE";
        public static final java.lang.String SERVICE_META_DATA = "android.speech.tts";
        public static final java.lang.String ACTION_INSTALL_TTS_DATA = "android.speech.tts.engine.INSTALL_TTS_DATA";
        public static final java.lang.String ACTION_TTS_DATA_INSTALLED = "android.speech.tts.engine.TTS_DATA_INSTALLED";
        public static final java.lang.String ACTION_CHECK_TTS_DATA = "android.speech.tts.engine.CHECK_TTS_DATA";
        public static final java.lang.String ACTION_GET_SAMPLE_TEXT = "android.speech.tts.engine.GET_SAMPLE_TEXT";
        public static final java.lang.String EXTRA_SAMPLE_TEXT = "sampleText";
        public static final java.lang.String EXTRA_AVAILABLE_VOICES = "availableVoices";
        public static final java.lang.String EXTRA_UNAVAILABLE_VOICES = "unavailableVoices";
        @java.lang.Deprecated
        public static final java.lang.String EXTRA_VOICE_DATA_ROOT_DIRECTORY = "dataRoot";
        @java.lang.Deprecated
        public static final java.lang.String EXTRA_VOICE_DATA_FILES = "dataFiles";
        @java.lang.Deprecated
        public static final java.lang.String EXTRA_VOICE_DATA_FILES_INFO = "dataFilesInfo";
        @java.lang.Deprecated
        public static final java.lang.String EXTRA_CHECK_VOICE_DATA_FOR = "checkVoiceDataFor";
        @java.lang.Deprecated
        public static final java.lang.String EXTRA_TTS_DATA_INSTALLED = "dataInstalled";
        public static final java.lang.String KEY_PARAM_RATE = "rate";
        public static final java.lang.String KEY_PARAM_VOICE_NAME = "voiceName";
        public static final java.lang.String KEY_PARAM_LANGUAGE = "language";
        public static final java.lang.String KEY_PARAM_COUNTRY = "country";
        public static final java.lang.String KEY_PARAM_VARIANT = "variant";
        public static final java.lang.String KEY_PARAM_ENGINE = "engine";
        public static final java.lang.String KEY_PARAM_PITCH = "pitch";
        public static final java.lang.String KEY_PARAM_STREAM = "streamType";
        public static final java.lang.String KEY_PARAM_AUDIO_ATTRIBUTES = "audioAttributes";
        public static final java.lang.String KEY_PARAM_UTTERANCE_ID = "utteranceId";
        public static final java.lang.String KEY_PARAM_VOLUME = "volume";
        public static final java.lang.String KEY_PARAM_PAN = "pan";
        @java.lang.Deprecated
        public static final java.lang.String KEY_FEATURE_NETWORK_SYNTHESIS = "networkTts";
        @java.lang.Deprecated
        public static final java.lang.String KEY_FEATURE_EMBEDDED_SYNTHESIS = "embeddedTts";
        public static final java.lang.String KEY_PARAM_SESSION_ID = "sessionId";
        public static final java.lang.String KEY_FEATURE_NOT_INSTALLED = "notInstalled";
        public static final java.lang.String KEY_FEATURE_NETWORK_TIMEOUT_MS = "networkTimeoutMs";
        public static final java.lang.String KEY_FEATURE_NETWORK_RETRIES_COUNT = "networkRetriesCount";
        public Engine(android.speech.tts.TextToSpeech p0) {}
    }

    public static interface OnInitListener {
        public void onInit(int p0);
    }

    public static class EngineInfo {
        public java.lang.String name;
        public java.lang.String label;
        public int icon;
        public boolean system;
        public int priority;
        public EngineInfo() {}
        public java.lang.String toString() { return null; }
    }

    private static interface Action<R extends java.lang.Object> {
        public R run(android.speech.tts.ITextToSpeechService p0) throws android.os.RemoteException;
    }

    private abstract class Connection implements android.content.ServiceConnection {
        abstract boolean connect(java.lang.String p0);
        abstract void disconnect();
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public android.os.IBinder getCallerIdentity() { return null; }
        protected boolean clearServiceConnection() { return false; }
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        public boolean isEstablished() { return false; }
        public <R extends java.lang.Object> R runAction(android.speech.tts.TextToSpeech.Action<R> p0, R p1, java.lang.String p2, boolean p3, boolean p4) { return null; }

        private class SetupConnectionAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Integer> {
            protected java.lang.Integer doInBackground(java.lang.Void... p0) { return null; }
            protected void onPostExecute(java.lang.Integer p0) {}
        }
    }

    private class DirectConnection extends android.speech.tts.TextToSpeech.Connection {
        boolean connect(java.lang.String p0) { return false; }
        void disconnect() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Error {
    }

    private class SystemConnection extends android.speech.tts.TextToSpeech.Connection {
        boolean connect(java.lang.String p0) { return false; }
        void disconnect() {}
    }
}
