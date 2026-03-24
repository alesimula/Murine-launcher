package android.service.autofill;

@android.annotation.SystemApi
public abstract class InlineSuggestionRenderService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.autofill.InlineSuggestionRenderService";
    public InlineSuggestionRenderService() { super(); }
    protected final void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public final void startIntentSender(android.content.IntentSender p0) {}
    public android.os.Bundle onGetInlineSuggestionsRendererInfo() { return null; }
    public android.view.View onRenderSuggestion(android.service.autofill.InlinePresentation p0, int p1, int p2) { return null; }

    private final class InlineSuggestionUiImpl {
        InlineSuggestionUiImpl(android.service.autofill.InlineSuggestionRenderService p0, android.view.SurfaceControlViewHost p1, android.os.Handler p2, int p3, int p4) {}
        public void releaseSurfaceControlViewHost() {}
        public void getSurfacePackage(android.service.autofill.ISurfacePackageResultCallback p0) {}
    }

    private static final class InlineSuggestionUiWrapper extends android.service.autofill.IInlineSuggestionUi.Stub {
        InlineSuggestionUiWrapper(android.service.autofill.InlineSuggestionRenderService.InlineSuggestionUiImpl p0) { super(); }
        public void releaseSurfaceControlViewHost() {}
        public void getSurfacePackage(android.service.autofill.ISurfacePackageResultCallback p0) {}
    }
}
