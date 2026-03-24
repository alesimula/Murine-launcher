package android.speech;

public abstract class RecognitionService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.speech.RecognitionService";
    public static final java.lang.String SERVICE_META_DATA = "android.speech";
    public RecognitionService() { super(); }
    protected abstract void onStartListening(android.content.Intent p0, android.speech.RecognitionService.Callback p1);
    protected abstract void onCancel(android.speech.RecognitionService.Callback p0);
    protected abstract void onStopListening(android.speech.RecognitionService.Callback p0);
    public void onCheckRecognitionSupport(android.content.Intent p0, android.speech.RecognitionService.SupportCallback p1) {}
    public void onCheckRecognitionSupport(android.content.Intent p0, android.content.AttributionSource p1, android.speech.RecognitionService.SupportCallback p2) {}
    public void onTriggerModelDownload(android.content.Intent p0) {}
    public void onTriggerModelDownload(android.content.Intent p0, android.content.AttributionSource p1) {}
    public void onTriggerModelDownload(android.content.Intent p0, android.content.AttributionSource p1, android.speech.ModelDownloadListener p2) {}
    @android.annotation.SuppressLint("MissingNullability")
    public android.content.Context createContext(android.content.ContextParams p0) { return null; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.SuppressLint("UnflaggedApi")
    public void onBindInternal() {}
    public void onDestroy() {}
    public int getMaxConcurrentSessionsCount() { return 0; }
    void finishDataDelivery(android.speech.RecognitionService.SessionState p0) {}

    public class Callback {
        public void beginningOfSpeech() throws android.os.RemoteException {}
        public void bufferReceived(byte[] p0) throws android.os.RemoteException {}
        public void endOfSpeech() throws android.os.RemoteException {}
        public void error(int p0) throws android.os.RemoteException {}
        public void partialResults(android.os.Bundle p0) throws android.os.RemoteException {}
        public void readyForSpeech(android.os.Bundle p0) throws android.os.RemoteException {}
        public void results(android.os.Bundle p0) throws android.os.RemoteException {}
        public void rmsChanged(float p0) throws android.os.RemoteException {}
        @android.annotation.SuppressLint({"CallbackMethodName", "RethrowRemoteException"})
        public void segmentResults(android.os.Bundle p0) throws android.os.RemoteException {}
        @android.annotation.SuppressLint({"CallbackMethodName", "RethrowRemoteException"})
        public void endOfSegmentedSession() throws android.os.RemoteException {}
        @android.annotation.SuppressLint("CallbackMethodName")
        public void languageDetection(android.os.Bundle p0) {}
        public int getCallingUid() { return 0; }
        @android.annotation.SuppressLint("CallbackMethodName")
        @android.annotation.NonNull
        public android.content.AttributionSource getCallingAttributionSource() { return null; }
        @android.annotation.NonNull
        android.content.Context getAttributionContextForCaller() { return null; }
    }

    private static class CheckRecognitionSupportArgs {
        public final android.content.Intent mIntent = null;
        public final android.speech.IRecognitionSupportCallback callback = null;
        public final android.content.AttributionSource mAttributionSource = null;
    }

    private static class ModelDownloadArgs {
        final android.content.Intent mIntent = null;
        final android.content.AttributionSource mAttributionSource = null;
        @android.annotation.Nullable
        final android.speech.IModelDownloadListener mListener = null;
    }

    private static final class RecognitionServiceBinder extends android.speech.IRecognitionService.Stub {
        public RecognitionServiceBinder(android.speech.RecognitionService p0) { super(); }
        public void startListening(android.content.Intent p0, android.speech.IRecognitionListener p1, android.content.AttributionSource p2) {}
        public void stopListening(android.speech.IRecognitionListener p0) {}
        public void cancel(android.speech.IRecognitionListener p0, boolean p1) {}
        public void checkRecognitionSupport(android.content.Intent p0, android.content.AttributionSource p1, android.speech.IRecognitionSupportCallback p2) {}
        public void triggerModelDownload(android.content.Intent p0, android.content.AttributionSource p1, android.speech.IModelDownloadListener p2) {}
        public void clearReference() {}
    }

    private static class SessionState {
        SessionState(android.speech.RecognitionService.Callback p0, boolean p1) {}
        SessionState(android.speech.RecognitionService.Callback p0) {}
        void reset() {}
    }

    private static class StartListeningArgs {
        public final android.content.Intent mIntent = null;
        public final android.speech.IRecognitionListener mListener = null;
        @android.annotation.NonNull
        public final android.content.AttributionSource mAttributionSource = null;
        public StartListeningArgs(android.content.Intent p0, android.speech.IRecognitionListener p1, android.content.AttributionSource p2) {}
    }

    public static class SupportCallback {
        public void onSupportResult(android.speech.RecognitionSupport p0) {}
        public void onError(int p0) {}
    }
}
