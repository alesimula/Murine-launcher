package android.speech;

public class SpeechRecognizer {
    public static final java.lang.String RESULTS_RECOGNITION = "results_recognition";
    public static final java.lang.String CONFIDENCE_SCORES = "confidence_scores";
    public static final java.lang.String RESULTS_ALTERNATIVES = "results_alternatives";
    public static final java.lang.String RECOGNITION_PARTS = "recognition_parts";
    public static final java.lang.String DETECTED_LANGUAGE = "detected_language";
    public static final java.lang.String LANGUAGE_DETECTION_CONFIDENCE_LEVEL = "language_detection_confidence_level";
    public static final int LANGUAGE_DETECTION_CONFIDENCE_LEVEL_UNKNOWN = 0;
    public static final int LANGUAGE_DETECTION_CONFIDENCE_LEVEL_NOT_CONFIDENT = 1;
    public static final int LANGUAGE_DETECTION_CONFIDENCE_LEVEL_CONFIDENT = 2;
    public static final int LANGUAGE_DETECTION_CONFIDENCE_LEVEL_HIGHLY_CONFIDENT = 3;
    public static final java.lang.String TOP_LOCALE_ALTERNATIVES = "top_locale_alternatives";
    public static final java.lang.String LANGUAGE_SWITCH_RESULT = "language_switch_result";
    public static final int LANGUAGE_SWITCH_RESULT_NOT_ATTEMPTED = 0;
    public static final int LANGUAGE_SWITCH_RESULT_SUCCEEDED = 1;
    public static final int LANGUAGE_SWITCH_RESULT_FAILED = 2;
    public static final int LANGUAGE_SWITCH_RESULT_SKIPPED_NO_MODEL = 3;
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
    public static final int ERROR_CANNOT_LISTEN_TO_DOWNLOAD_EVENTS = 15;
    SpeechRecognizer() {}
    public static boolean isRecognitionAvailable(android.content.Context p0) { return false; }
    public static boolean isOnDeviceRecognitionAvailable(android.content.Context p0) { return false; }
    public static android.speech.SpeechRecognizer createSpeechRecognizer(android.content.Context p0) { return null; }
    public static android.speech.SpeechRecognizer createSpeechRecognizer(android.content.Context p0, android.content.ComponentName p1) { return null; }
    @android.annotation.NonNull
    public static android.speech.SpeechRecognizer createOnDeviceSpeechRecognizer(android.content.Context p0) { return null; }
    @android.annotation.NonNull
    public static android.speech.SpeechRecognizer createOnDeviceTestingSpeechRecognizer(android.content.Context p0) { return null; }
    public void setRecognitionListener(android.speech.RecognitionListener p0) {}
    public void startListening(android.content.Intent p0) {}
    public void stopListening() {}
    public void cancel() {}
    public void checkRecognitionSupport(android.content.Intent p0, java.util.concurrent.Executor p1, android.speech.RecognitionSupportCallback p2) {}
    public void triggerModelDownload(android.content.Intent p0) {}
    public void triggerModelDownload(android.content.Intent p0, java.util.concurrent.Executor p1, android.speech.ModelDownloadListener p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_SPEECH_RECOGNITION")
    public void setTemporaryOnDeviceRecognizer(android.content.ComponentName p0) {}
    public void destroy() {}

    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LanguageDetectionConfidenceLevel {
    }

    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LanguageSwitchResult {
    }

    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecognitionError {
    }
}
