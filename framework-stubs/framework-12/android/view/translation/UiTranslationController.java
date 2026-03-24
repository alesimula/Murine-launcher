package android.view.translation;

public class UiTranslationController {
    public static final boolean DEBUG = Boolean.valueOf(false);
    private static final java.lang.String TAG = "UiTranslationController";
    private final android.app.Activity mActivity = null;
    private final android.content.Context mContext = null;
    private final java.lang.Object mLock = null;
    private final android.util.ArrayMap<android.util.Pair<android.view.translation.TranslationSpec, android.view.translation.TranslationSpec>, android.view.translation.Translator> mTranslators = null;
    private final android.util.ArrayMap<android.view.autofill.AutofillId, java.lang.ref.WeakReference<android.view.View>> mViews = null;
    private final android.util.ArraySet<android.view.autofill.AutofillId> mViewsToPadContent = null;
    private final android.os.HandlerThread mWorkerThread = null;
    private final android.os.Handler mWorkerHandler = null;
    private int mCurrentState;
    private android.util.ArraySet<android.view.autofill.AutofillId> mLastRequestAutofillIds;
    private static final int ANIMATION_DURATION_MILLIS = 250;
    public UiTranslationController(android.app.Activity p0, android.content.Context p1) {}
    public void updateUiTranslationState(int p0, android.view.translation.TranslationSpec p1, android.view.translation.TranslationSpec p2, java.util.List<android.view.autofill.AutofillId> p3, android.view.translation.UiTranslationSpec p4) {}
    public void onActivityDestroyed() {}
    private void notifyTranslationFinished(boolean p0) {}
    private void setLastRequestAutofillIdsLocked(java.util.List<android.view.autofill.AutofillId> p0) {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    private void dumpViewByTraversal(java.lang.String p0, java.io.PrintWriter p1) {}
    private void dumpChildren(android.view.ViewGroup p0, java.lang.String p1, java.io.PrintWriter p2) {}
    private void dumpViewInfo(android.view.View p0, java.lang.String p1, java.io.PrintWriter p2) {}
    public void onTranslationCompleted(android.view.translation.TranslationResponse p0) {}
    private void onVirtualViewTranslationCompleted(android.util.SparseArray<android.util.LongSparseArray<android.view.translation.ViewTranslationResponse>> p0) {}
    private void onTranslationCompleted(android.util.SparseArray<android.view.translation.ViewTranslationResponse> p0) {}
    private void createTranslatorAndStart(android.view.translation.TranslationSpec p0, android.view.translation.TranslationSpec p1, java.util.List<android.view.autofill.AutofillId> p2) {}
    private void sendTranslationRequest(android.view.translation.Translator p0, java.util.List<android.view.translation.ViewTranslationRequest> p1) {}
    private void onUiTranslationStarted(android.view.translation.Translator p0, java.util.List<android.view.autofill.AutofillId> p1) {}
    private android.util.SparseIntArray getRequestVirtualViewChildCount(java.util.List<android.view.autofill.AutofillId> p0) { return null; }
    private int[] getSupportedFormatsLocked() { return null; }
    private android.view.translation.TranslationCapability getTranslationCapability(android.view.translation.TranslationContext p0) { return null; }
    private void findViewsTraversalByAutofillIds(android.util.IntArray p0) {}
    private void findViewsTraversalByAutofillIds(android.view.ViewGroup p0, android.util.IntArray p1) {}
    private void addViewIfNeeded(android.util.IntArray p0, android.view.View p1) {}
    private void runForEachView(java.util.function.BiConsumer<android.view.View, android.view.translation.ViewTranslationCallback> p0) {}
    private android.view.translation.Translator createTranslatorIfNeeded(android.view.translation.TranslationSpec p0, android.view.translation.TranslationSpec p1) { return null; }
    private void destroyTranslators() {}
    public static java.lang.String stateToString(int p0) { return null; }
    private static java.lang.String sanitizedViewTranslationRequest(android.view.translation.ViewTranslationRequest p0) { return null; }
    private static java.lang.String sanitizedViewTranslationResponse(android.view.translation.ViewTranslationResponse p0) { return null; }
}
