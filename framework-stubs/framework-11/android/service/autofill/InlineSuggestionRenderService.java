package android.service.autofill;

@android.annotation.SystemApi
public abstract class InlineSuggestionRenderService extends android.app.Service {
    private static final java.lang.String TAG = "InlineSuggestionRenderService";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.autofill.InlineSuggestionRenderService";
    private final android.os.Handler mMainHandler = null;
    private android.service.autofill.IInlineSuggestionUiCallback mCallback;
    private final android.util.LruCache<android.service.autofill.InlineSuggestionRenderService.InlineSuggestionUiImpl, java.lang.Boolean> mActiveInlineSuggestions = null;
    public InlineSuggestionRenderService() { super(); }
    private android.util.Size measuredSize(android.view.View p0, int p1, int p2, android.util.Size p3, android.util.Size p4) { return null; }
    private void handleRenderSuggestion(android.service.autofill.IInlineSuggestionUiCallback p0, android.service.autofill.InlinePresentation p1, int p2, int p3, android.os.IBinder p4, int p5, int p6, int p7) {}
    private void handleGetInlineSuggestionsRendererInfo(android.os.RemoteCallback p0) {}
    private void handleDestroySuggestionViews(int p0, int p1) {}
    protected final void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public final void startIntentSender(android.content.IntentSender p0) {}
    public android.os.Bundle onGetInlineSuggestionsRendererInfo() { return null; }
    public android.view.View onRenderSuggestion(android.service.autofill.InlinePresentation p0, int p1, int p2) { return null; }

    private final class InlineSuggestionUiImpl {
        private android.view.SurfaceControlViewHost mViewHost;
        private final android.os.Handler mHandler = null;
        private final int mUserId = 0;
        private final int mSessionId = 0;
        InlineSuggestionUiImpl(android.service.autofill.InlineSuggestionRenderService p0, android.view.SurfaceControlViewHost p1, android.os.Handler p2, int p3, int p4) {}
        public void releaseSurfaceControlViewHost() {}
        public void getSurfacePackage(android.service.autofill.ISurfacePackageResultCallback p0) {}
    }

    private static final class InlineSuggestionUiWrapper extends android.service.autofill.IInlineSuggestionUi.Stub {
        private final java.lang.ref.WeakReference<android.service.autofill.InlineSuggestionRenderService.InlineSuggestionUiImpl> mUiImpl = null;
        InlineSuggestionUiWrapper(android.service.autofill.InlineSuggestionRenderService.InlineSuggestionUiImpl p0) { super(); }
        public void releaseSurfaceControlViewHost() {}
        public void getSurfacePackage(android.service.autofill.ISurfacePackageResultCallback p0) {}
    }
}
