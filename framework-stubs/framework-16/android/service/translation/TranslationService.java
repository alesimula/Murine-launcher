package android.service.translation;

@android.annotation.SystemApi
public abstract class TranslationService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.translation.TranslationService";
    public static final java.lang.String SERVICE_META_DATA = "android.translation_service";
    public TranslationService() { super(); }
    public void onCreate() {}
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onConnected() {}
    public void onDisconnected() {}
    public abstract void onCreateTranslationSession(android.view.translation.TranslationContext p0, int p1, java.util.function.Consumer<java.lang.Boolean> p2);
    @java.lang.Deprecated
    public void onCreateTranslationSession(android.view.translation.TranslationContext p0, int p1) {}
    public abstract void onFinishTranslationSession(int p0);
    @java.lang.Deprecated
    public void onTranslationRequest(android.view.translation.TranslationRequest p0, int p1, android.os.CancellationSignal p2, android.service.translation.TranslationService.OnTranslationResultCallback p3) {}
    public abstract void onTranslationRequest(android.view.translation.TranslationRequest p0, int p1, android.os.CancellationSignal p2, java.util.function.Consumer<android.view.translation.TranslationResponse> p3);
    public abstract void onTranslationCapabilitiesRequest(int p0, int p1, java.util.function.Consumer<java.util.Set<android.view.translation.TranslationCapability>> p2);
    public final void updateTranslationCapability(android.view.translation.TranslationCapability p0) {}

    @java.lang.Deprecated
    public static interface OnTranslationResultCallback {
        public void onTranslationSuccess(android.view.translation.TranslationResponse p0);
        @java.lang.Deprecated
        public void onError();
    }
}
