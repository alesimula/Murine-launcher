package android.speech;

class SpeechRecognizerImpl extends android.speech.SpeechRecognizer {
    SpeechRecognizerImpl(android.content.Context p0, android.content.ComponentName p1) { super(); }
    SpeechRecognizerImpl(android.content.Context p0, boolean p1) { super(); }
    @android.annotation.NonNull
    static android.speech.SpeechRecognizerImpl lenientlyCreateOnDeviceSpeechRecognizer(android.content.Context p0) { return null; }
    public void setRecognitionListener(android.speech.RecognitionListener p0) {}
    public void startListening(android.content.Intent p0) {}
    public void stopListening() {}
    public void cancel() {}
    public void checkRecognitionSupport(android.content.Intent p0, java.util.concurrent.Executor p1, android.speech.RecognitionSupportCallback p2) {}
    public void triggerModelDownload(android.content.Intent p0) {}
    public void triggerModelDownload(android.content.Intent p0, java.util.concurrent.Executor p1, android.speech.ModelDownloadListener p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_SPEECH_RECOGNITION")
    public void setTemporaryOnDeviceRecognizer(android.content.ComponentName p0) {}
    static void checkIsCalledFromMainThread() {}
    public void destroy() {}

    private static class CheckRecognitionSupportArgs {
        final android.content.Intent mIntent = null;
        final java.util.concurrent.Executor mCallbackExecutor = null;
        final android.speech.RecognitionSupportCallback mCallback = null;
    }

    private static class InternalModelDownloadListener extends android.speech.IModelDownloadListener.Stub {
        public void onProgress(int p0) throws android.os.RemoteException {}
        public void onSuccess() throws android.os.RemoteException {}
        public void onScheduled() throws android.os.RemoteException {}
        public void onError(int p0) throws android.os.RemoteException {}
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
        public void onLanguageDetection(android.os.Bundle p0) {}
        public void onEvent(int p0, android.os.Bundle p1) {}
    }

    private static class InternalSupportCallback extends android.speech.IRecognitionSupportCallback.Stub {
        public void onSupportResult(android.speech.RecognitionSupport p0) throws android.os.RemoteException {}
        public void onError(int p0) throws android.os.RemoteException {}
    }

    private static class ModelDownloadListenerArgs {
        final android.content.Intent mIntent = null;
        final java.util.concurrent.Executor mExecutor = null;
        final android.speech.ModelDownloadListener mModelDownloadListener = null;
    }
}
