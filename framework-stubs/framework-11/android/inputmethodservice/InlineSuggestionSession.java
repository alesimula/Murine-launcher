package android.inputmethodservice;

class InlineSuggestionSession {
    private static final java.lang.String TAG = "ImsInlineSuggestionSession";
    static final android.view.inputmethod.InlineSuggestionsResponse EMPTY_RESPONSE = null;
    private final android.os.Handler mMainThreadHandler = null;
    private final android.inputmethodservice.InlineSuggestionSessionController mInlineSuggestionSessionController = null;
    private final com.android.internal.view.InlineSuggestionsRequestInfo mRequestInfo = null;
    private final com.android.internal.view.IInlineSuggestionsRequestCallback mCallback = null;
    private final java.util.function.Function<android.os.Bundle, android.view.inputmethod.InlineSuggestionsRequest> mRequestSupplier = null;
    private final java.util.function.Supplier<android.os.IBinder> mHostInputTokenSupplier = null;
    private final java.util.function.Consumer<android.view.inputmethod.InlineSuggestionsResponse> mResponseConsumer = null;
    private java.lang.Boolean mPreviousResponseIsEmpty;
    private boolean mCallbackInvoked;
    private android.inputmethodservice.InlineSuggestionSession.InlineSuggestionsResponseCallbackImpl mResponseCallback;
    InlineSuggestionSession(com.android.internal.view.InlineSuggestionsRequestInfo p0, com.android.internal.view.IInlineSuggestionsRequestCallback p1, java.util.function.Function<android.os.Bundle, android.view.inputmethod.InlineSuggestionsRequest> p2, java.util.function.Supplier<android.os.IBinder> p3, java.util.function.Consumer<android.view.inputmethod.InlineSuggestionsResponse> p4, android.inputmethodservice.InlineSuggestionSessionController p5, android.os.Handler p6) {}
    com.android.internal.view.InlineSuggestionsRequestInfo getRequestInfo() { return null; }
    com.android.internal.view.IInlineSuggestionsRequestCallback getRequestCallback() { return null; }
    boolean shouldSendImeStatus() { return false; }
    boolean isCallbackInvoked() { return false; }
    void invalidate() {}
    void makeInlineSuggestionRequestUncheck() {}
    void handleOnInlineSuggestionsResponse(android.view.autofill.AutofillId p0, android.view.inputmethod.InlineSuggestionsResponse p1) {}
    void consumeInlineSuggestionsResponse(android.view.inputmethod.InlineSuggestionsResponse p0) {}

    private static final class InlineSuggestionsResponseCallbackImpl extends com.android.internal.view.IInlineSuggestionsResponseCallback.Stub {
        private final java.lang.ref.WeakReference<android.inputmethodservice.InlineSuggestionSession> mSession = null;
        private volatile boolean mInvalid;
        private InlineSuggestionsResponseCallbackImpl(android.inputmethodservice.InlineSuggestionSession p0) { super(); }
        void invalidate() {}
        public void onInlineSuggestionsResponse(android.view.autofill.AutofillId p0, android.view.inputmethod.InlineSuggestionsResponse p1) {}
    }
}
