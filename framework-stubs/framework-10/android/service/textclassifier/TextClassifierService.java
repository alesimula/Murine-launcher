package android.service.textclassifier;

@android.annotation.SystemApi
public abstract class TextClassifierService extends android.app.Service {
    private static final java.lang.String LOG_TAG = "TextClassifierService";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.textclassifier.TextClassifierService";
    private static final java.lang.String KEY_RESULT = "key_result";
    private final android.os.Handler mMainThreadHandler = null;
    private final java.util.concurrent.ExecutorService mSingleThreadExecutor = null;
    private final android.service.textclassifier.ITextClassifierService.Stub mBinder = null;
    public TextClassifierService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onSuggestSelection(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextSelection.Request p1, android.os.CancellationSignal p2, android.service.textclassifier.TextClassifierService.Callback<android.view.textclassifier.TextSelection> p3);
    public abstract void onClassifyText(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextClassification.Request p1, android.os.CancellationSignal p2, android.service.textclassifier.TextClassifierService.Callback<android.view.textclassifier.TextClassification> p3);
    public abstract void onGenerateLinks(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextLinks.Request p1, android.os.CancellationSignal p2, android.service.textclassifier.TextClassifierService.Callback<android.view.textclassifier.TextLinks> p3);
    public void onDetectLanguage(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextLanguage.Request p1, android.os.CancellationSignal p2, android.service.textclassifier.TextClassifierService.Callback<android.view.textclassifier.TextLanguage> p3) {}
    public void onSuggestConversationActions(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.ConversationActions.Request p1, android.os.CancellationSignal p2, android.service.textclassifier.TextClassifierService.Callback<android.view.textclassifier.ConversationActions> p3) {}
    @java.lang.Deprecated
    public void onSelectionEvent(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.SelectionEvent p1) {}
    public void onTextClassifierEvent(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextClassifierEvent p1) {}
    public void onCreateTextClassificationSession(android.view.textclassifier.TextClassificationContext p0, android.view.textclassifier.TextClassificationSessionId p1) {}
    public void onDestroyTextClassificationSession(android.view.textclassifier.TextClassificationSessionId p0) {}
    @java.lang.Deprecated
    public final android.view.textclassifier.TextClassifier getLocalTextClassifier() { return null; }
    public static android.view.textclassifier.TextClassifier getDefaultTextClassifierImplementation(android.content.Context p0) { return null; }
    public static <T extends android.os.Parcelable> T getResponse(android.os.Bundle p0) { return null; }
    public static android.content.ComponentName getServiceComponentName(android.content.Context p0) { return null; }

    private static final class ProxyCallback<T extends android.os.Parcelable> implements android.service.textclassifier.TextClassifierService.Callback<T> {
        private java.lang.ref.WeakReference<android.service.textclassifier.ITextClassifierCallback> mTextClassifierCallback;
        private ProxyCallback(android.service.textclassifier.ITextClassifierCallback p0) {}
        public void onSuccess(T p0) {}
        public void onFailure(java.lang.CharSequence p0) {}
    }

    public static interface Callback<T extends java.lang.Object> {
        public void onSuccess(T p0);
        public void onFailure(java.lang.CharSequence p0);
    }
}
