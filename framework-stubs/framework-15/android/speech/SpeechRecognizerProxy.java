package android.speech;

class SpeechRecognizerProxy extends android.speech.SpeechRecognizer {
    SpeechRecognizerProxy(android.speech.SpeechRecognizer p0) { super(); }
    public void setRecognitionListener(android.speech.RecognitionListener p0) {}
    public void startListening(android.content.Intent p0) {}
    public void stopListening() {}
    public void cancel() {}
    public void destroy() {}
    public void checkRecognitionSupport(android.content.Intent p0, java.util.concurrent.Executor p1, android.speech.RecognitionSupportCallback p2) {}
    public void triggerModelDownload(android.content.Intent p0) {}
    public void triggerModelDownload(android.content.Intent p0, java.util.concurrent.Executor p1, android.speech.ModelDownloadListener p2) {}
    public void setTemporaryOnDeviceRecognizer(android.content.ComponentName p0) {}
    protected void finalize() throws java.lang.Throwable {}
}
