package android.view.translation;

@android.annotation.SuppressLint("NotCloseable")
public class Translator {
    public static final java.lang.String EXTRA_SERVICE_BINDER = "binder";
    public static final java.lang.String EXTRA_SESSION_ID = "sessionId";
    public Translator(android.content.Context p0, android.view.translation.TranslationContext p1, int p2, android.view.translation.TranslationManager p3, android.os.Handler p4, android.view.translation.ITranslationManager p5, java.util.function.Consumer<android.view.translation.Translator> p6) {}
    public Translator(android.content.Context p0, android.view.translation.TranslationContext p1, int p2, android.view.translation.TranslationManager p3, android.os.Handler p4, android.view.translation.ITranslationManager p5) {}
    void start() {}
    boolean isSessionCreated() throws android.view.translation.Translator.ServiceBinderReceiver.TimeoutException { return false; }
    public android.view.translation.TranslationContext getTranslationContext() { return null; }
    public int getTranslatorId() { return 0; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    @java.lang.Deprecated
    @android.annotation.Nullable
    public void translate(android.view.translation.TranslationRequest p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.view.translation.TranslationResponse> p2) {}
    @android.annotation.Nullable
    public void translate(android.view.translation.TranslationRequest p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.view.translation.TranslationResponse> p3) {}
    public void destroy() {}
    public boolean isDestroyed() { return false; }
    public void requestUiTranslate(android.view.translation.TranslationRequest p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.view.translation.TranslationResponse> p2) {}

    static class ServiceBinderReceiver extends com.android.internal.os.IResultReceiver.Stub {
        ServiceBinderReceiver(android.view.translation.Translator p0, java.util.function.Consumer<android.view.translation.Translator> p1) { super(); }
        ServiceBinderReceiver(android.view.translation.Translator p0) { super(); }
        int getSessionStateResult() throws android.view.translation.Translator.ServiceBinderReceiver.TimeoutException { return 0; }
        public void send(int p0, android.os.Bundle p1) {}

        static final class TimeoutException extends java.lang.Exception {
        }
    }

    private static class TranslationResponseCallbackImpl extends android.service.translation.ITranslationCallback.Stub {
        TranslationResponseCallbackImpl(java.util.function.Consumer<android.view.translation.TranslationResponse> p0, java.util.concurrent.Executor p1) { super(); }
        public void onTranslationResponse(android.view.translation.TranslationResponse p0) throws android.os.RemoteException {}
    }
}
