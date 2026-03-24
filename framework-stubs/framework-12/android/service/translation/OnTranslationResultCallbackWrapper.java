package android.service.translation;

final class OnTranslationResultCallbackWrapper implements java.util.function.Consumer<android.view.translation.TranslationResponse> {
    private static final java.lang.String TAG = "OnTranslationResultCallback";
    private final android.service.translation.ITranslationCallback mCallback = null;
    private final java.util.concurrent.atomic.AtomicBoolean mCalled = null;
    public OnTranslationResultCallbackWrapper(android.service.translation.ITranslationCallback p0) {}
    public void accept(android.view.translation.TranslationResponse p0) {}
    private void assertNotCalled() {}
}
