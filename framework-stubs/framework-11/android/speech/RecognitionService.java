package android.speech;

public abstract class RecognitionService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.speech.RecognitionService";
    public static final java.lang.String SERVICE_META_DATA = "android.speech";
    private static final java.lang.String TAG = "RecognitionService";
    private static final boolean DBG = false;
    private android.speech.RecognitionService.RecognitionServiceBinder mBinder;
    private android.speech.RecognitionService.Callback mCurrentCallback;
    private static final int MSG_START_LISTENING = 1;
    private static final int MSG_STOP_LISTENING = 2;
    private static final int MSG_CANCEL = 3;
    private static final int MSG_RESET = 4;
    private final android.os.Handler mHandler = null;
    public RecognitionService() { super(); }
    private void dispatchStartListening(android.content.Intent p0, android.speech.IRecognitionListener p1, int p2) {}
    private void dispatchStopListening(android.speech.IRecognitionListener p0) {}
    private void dispatchCancel(android.speech.IRecognitionListener p0) {}
    private void dispatchClearCallback() {}
    private boolean checkPermissions(android.speech.IRecognitionListener p0, boolean p1, java.lang.String p2, java.lang.String p3) { return false; }
    protected abstract void onStartListening(android.content.Intent p0, android.speech.RecognitionService.Callback p1);
    protected abstract void onCancel(android.speech.RecognitionService.Callback p0);
    protected abstract void onStopListening(android.speech.RecognitionService.Callback p0);
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onDestroy() {}

    public class Callback {
        private final android.speech.IRecognitionListener mListener = null;
        private final int mCallingUid = 0;
        private Callback(android.speech.RecognitionService p0, android.speech.IRecognitionListener p1, int p2) {}
        public void beginningOfSpeech() throws android.os.RemoteException {}
        public void bufferReceived(byte[] p0) throws android.os.RemoteException {}
        public void endOfSpeech() throws android.os.RemoteException {}
        public void error(int p0) throws android.os.RemoteException {}
        public void partialResults(android.os.Bundle p0) throws android.os.RemoteException {}
        public void readyForSpeech(android.os.Bundle p0) throws android.os.RemoteException {}
        public void results(android.os.Bundle p0) throws android.os.RemoteException {}
        public void rmsChanged(float p0) throws android.os.RemoteException {}
        public int getCallingUid() { return 0; }
    }

    private static final class RecognitionServiceBinder extends android.speech.IRecognitionService.Stub {
        private final java.lang.ref.WeakReference<android.speech.RecognitionService> mServiceRef = null;
        public RecognitionServiceBinder(android.speech.RecognitionService p0) { super(); }
        public void startListening(android.content.Intent p0, android.speech.IRecognitionListener p1, java.lang.String p2, java.lang.String p3) {}
        public void stopListening(android.speech.IRecognitionListener p0, java.lang.String p1, java.lang.String p2) {}
        public void cancel(android.speech.IRecognitionListener p0, java.lang.String p1, java.lang.String p2) {}
        public void clearReference() {}
    }

    private class StartListeningArgs {
        public final android.content.Intent mIntent = null;
        public final android.speech.IRecognitionListener mListener = null;
        public final int mCallingUid = 0;
        public StartListeningArgs(android.speech.RecognitionService p0, android.content.Intent p1, android.speech.IRecognitionListener p2, int p3) {}
    }
}
