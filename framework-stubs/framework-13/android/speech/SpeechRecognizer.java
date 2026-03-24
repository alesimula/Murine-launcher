package android.speech;

public class SpeechRecognizer {
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
    public static final int ERROR_TOO_MANY_REQUESTS = 10;
    public static final int ERROR_SERVER_DISCONNECTED = 11;
    public static final int ERROR_LANGUAGE_NOT_SUPPORTED = 12;
    public static final int ERROR_LANGUAGE_UNAVAILABLE = 13;
    public static final int ERROR_CANNOT_CHECK_SUPPORT = 14;
    public static boolean isRecognitionAvailable(android.content.Context p0) { return false; }
    public static boolean isOnDeviceRecognitionAvailable(android.content.Context p0) { return false; }
    public static android.speech.SpeechRecognizer createSpeechRecognizer(android.content.Context p0) { return null; }
    public static android.speech.SpeechRecognizer createSpeechRecognizer(android.content.Context p0, android.content.ComponentName p1) { return null; }
    public static android.speech.SpeechRecognizer createOnDeviceSpeechRecognizer(android.content.Context p0) { return null; }
    public static android.speech.SpeechRecognizer createOnDeviceTestingSpeechRecognizer(android.content.Context p0) { return null; }
    public void setRecognitionListener(android.speech.RecognitionListener p0) {}
    public void startListening(android.content.Intent p0) {}
    public void stopListening() {}
    public void cancel() {}
    public void checkRecognitionSupport(android.content.Intent p0, java.util.concurrent.Executor p1, android.speech.RecognitionSupportCallback p2) {}
    public void triggerModelDownload(android.content.Intent p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_SPEECH_RECOGNITION")
    public void setTemporaryOnDeviceRecognizer(android.content.ComponentName p0) {}
    public void destroy() {}

    private static class CheckRecognitionSupportArgs {
        final android.content.Intent mIntent = null;
        final java.util.concurrent.Executor mCallbackExecutor = null;
        final android.speech.RecognitionSupportCallback mCallback = null;
    }

    private static class InternalRecognitionListener extends android.speech.IRecognitionListener.Stub {
        public void onBeginningOfSpeech() {}
        public void onBufferReceived(byte[] p0) {}
        public void onEndOfSpeech() {}
        public void onError(int p0) {}
        public void onReadyForSpeech(android.os.Bundle p0) {}
        public void onResults(android.os.Bundle p0) {}
        public void onPartialResults(android.os.Bundle p0) {}
        public void onRmsChanged(float p0) {}
        public void onSegmentResults(android.os.Bundle p0) {}
        public void onEndOfSegmentedSession() {}
        public void onEvent(int p0, android.os.Bundle p1) {}
    }

    private static class InternalSupportCallback extends android.speech.IRecognitionSupportCallback.Stub {
        public void onSupportResult(android.speech.RecognitionSupport p0) throws android.os.RemoteException {}
        public void onError(int p0) throws android.os.RemoteException {}
    }

    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecognitionError {
    }
}
