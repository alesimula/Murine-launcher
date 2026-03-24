package android.speech;

public class SpeechRecognizer {
    private static final boolean DBG = false;
    private static final java.lang.String TAG = "SpeechRecognizer";
    public static final java.lang.String RESULTS_RECOGNITION = "results_recognition";
    public static final java.lang.String CONFIDENCE_SCORES = "confidence_scores";
    public static final int ERROR_NETWORK_TIMEOUT = 1;
    public static final int ERROR_NETWORK = 2;
    public static final int ERROR_AUDIO = 3;
    public static final int ERROR_SERVER = 4;
    public static final int ERROR_CLIENT = 5;
    public static final int ERROR_SPEECH_TIMEOUT = 6;
    public static final int ERROR_NO_MATCH = 7;
    public static final int ERROR_RECOGNIZER_BUSY = 8;
    public static final int ERROR_INSUFFICIENT_PERMISSIONS = 9;
    private static final int MSG_START = 1;
    private static final int MSG_STOP = 2;
    private static final int MSG_CANCEL = 3;
    private static final int MSG_CHANGE_LISTENER = 4;
    private android.speech.IRecognitionService mService;
    private android.speech.SpeechRecognizer.Connection mConnection;
    private final android.content.Context mContext = null;
    private final android.content.ComponentName mServiceComponent = null;
    private android.os.Handler mHandler;
    private final java.util.Queue<android.os.Message> mPendingTasks = null;
    private final android.speech.SpeechRecognizer.InternalListener mListener = null;
    private SpeechRecognizer(android.content.Context p0, android.content.ComponentName p1) {}
    public static boolean isRecognitionAvailable(android.content.Context p0) { return false; }
    public static android.speech.SpeechRecognizer createSpeechRecognizer(android.content.Context p0) { return null; }
    public static android.speech.SpeechRecognizer createSpeechRecognizer(android.content.Context p0, android.content.ComponentName p1) { return null; }
    public void setRecognitionListener(android.speech.RecognitionListener p0) {}
    public void startListening(android.content.Intent p0) {}
    public void stopListening() {}
    public void cancel() {}
    private static void checkIsCalledFromMainThread() {}
    private void putMessage(android.os.Message p0) {}
    private void handleStartListening(android.content.Intent p0) {}
    private void handleStopMessage() {}
    private void handleCancelMessage() {}
    private boolean checkOpenConnection() { return false; }
    private void handleChangeListener(android.speech.RecognitionListener p0) {}
    public void destroy() {}

    private class Connection implements android.content.ServiceConnection {
        private Connection(android.speech.SpeechRecognizer p0) {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
    }

    private static class InternalListener extends android.speech.IRecognitionListener.Stub {
        private android.speech.RecognitionListener mInternalListener;
        private static final int MSG_BEGINNING_OF_SPEECH = 1;
        private static final int MSG_BUFFER_RECEIVED = 2;
        private static final int MSG_END_OF_SPEECH = 3;
        private static final int MSG_ERROR = 4;
        private static final int MSG_READY_FOR_SPEECH = 5;
        private static final int MSG_RESULTS = 6;
        private static final int MSG_PARTIAL_RESULTS = 7;
        private static final int MSG_RMS_CHANGED = 8;
        private static final int MSG_ON_EVENT = 9;
        private final android.os.Handler mInternalHandler = null;
        private InternalListener() { super(); }
        public void onBeginningOfSpeech() {}
        public void onBufferReceived(byte[] p0) {}
        public void onEndOfSpeech() {}
        public void onError(int p0) {}
        public void onReadyForSpeech(android.os.Bundle p0) {}
        public void onResults(android.os.Bundle p0) {}
        public void onPartialResults(android.os.Bundle p0) {}
        public void onRmsChanged(float p0) {}
        public void onEvent(int p0, android.os.Bundle p1) {}
    }
}
