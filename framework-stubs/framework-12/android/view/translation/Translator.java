package android.view.translation;

@android.annotation.SuppressLint("NotCloseable")
public class Translator {
    private static final java.lang.String TAG = "Translator";
    private static boolean sDEBUG;
    private final java.lang.Object mLock = null;
    private int mId;
    private final android.content.Context mContext = null;
    private final android.view.translation.TranslationContext mTranslationContext = null;
    private final android.view.translation.TranslationManager mManager = null;
    private final android.os.Handler mHandler = null;
    private android.view.translation.ITranslationManager mSystemServerBinder;
    private android.view.translation.ITranslationDirectManager mDirectServiceBinder;
    private final android.view.translation.Translator.ServiceBinderReceiver mServiceBinderReceiver = null;
    private boolean mDestroyed;
    public static final java.lang.String EXTRA_SERVICE_BINDER = "binder";
    public static final java.lang.String EXTRA_SESSION_ID = "sessionId";
    public Translator(android.content.Context p0, android.view.translation.TranslationContext p1, int p2, android.view.translation.TranslationManager p3, android.os.Handler p4, android.view.translation.ITranslationManager p5, java.util.function.Consumer<android.view.translation.Translator> p6) {}
    public Translator(android.content.Context p0, android.view.translation.TranslationContext p1, int p2, android.view.translation.TranslationManager p3, android.os.Handler p4, android.view.translation.ITranslationManager p5) {}
    void start() {}
    boolean isSessionCreated() throws android.view.translation.Translator.ServiceBinderReceiver.TimeoutException { return false; }
    private int getNextRequestId() { return 0; }
    private void setServiceBinder(android.os.IBinder p0) {}
    public android.view.translation.TranslationContext getTranslationContext() { return null; }
    public int getTranslatorId() { return 0; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    @java.lang.Deprecated
    public void translate(android.view.translation.TranslationRequest p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.view.translation.TranslationResponse> p2) {}
    public void translate(android.view.translation.TranslationRequest p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.view.translation.TranslationResponse> p3) {}
    public void destroy() {}
    public boolean isDestroyed() { return false; }
    public void requestUiTranslate(android.view.translation.TranslationRequest p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.view.translation.TranslationResponse> p2) {}

    static class ServiceBinderReceiver extends com.android.internal.os.IResultReceiver.Stub {
        private final android.view.translation.Translator mTranslator = null;
        private final java.util.concurrent.CountDownLatch mLatch = null;
        private int mSessionId;
        private java.util.function.Consumer<android.view.translation.Translator> mCallback;
        ServiceBinderReceiver(android.view.translation.Translator p0, java.util.function.Consumer<android.view.translation.Translator> p1) { super(); }
        ServiceBinderReceiver(android.view.translation.Translator p0) { super(); }
        int getSessionStateResult() throws android.view.translation.Translator.ServiceBinderReceiver.TimeoutException { return 0; }
        public void send(int p0, android.os.Bundle p1) {}

        static final class TimeoutException extends java.lang.Exception {
            private TimeoutException(java.lang.String p0) { super(); }
        }
    }

    private static class TranslationResponseCallbackImpl extends android.service.translation.ITranslationCallback.Stub {
        private final java.util.function.Consumer<android.view.translation.TranslationResponse> mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        TranslationResponseCallbackImpl(java.util.function.Consumer<android.view.translation.TranslationResponse> p0, java.util.concurrent.Executor p1) { super(); }
        public void onTranslationResponse(android.view.translation.TranslationResponse p0) throws android.os.RemoteException {}
    }
}
