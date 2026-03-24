package android.inputmethodservice;

class InlineSuggestionSession {
    static final android.view.inputmethod.InlineSuggestionsResponse EMPTY_RESPONSE = null;
    InlineSuggestionSession(com.android.internal.inputmethod.InlineSuggestionsRequestInfo p0, com.android.internal.inputmethod.IInlineSuggestionsRequestCallback p1, java.util.function.Function<android.os.Bundle, android.view.inputmethod.InlineSuggestionsRequest> p2, java.util.function.Supplier<android.os.IBinder> p3, java.util.function.Consumer<android.view.inputmethod.InlineSuggestionsResponse> p4, android.inputmethodservice.InlineSuggestionSessionController p5, android.os.Handler p6) {}
    com.android.internal.inputmethod.InlineSuggestionsRequestInfo getRequestInfo() { return null; }
    com.android.internal.inputmethod.IInlineSuggestionsRequestCallback getRequestCallback() { return null; }
    boolean shouldSendImeStatus() { return false; }
    boolean isCallbackInvoked() { return false; }
    void invalidate() {}
    void makeInlineSuggestionRequestUncheck() {}
    void handleOnInlineSuggestionsResponse(android.view.autofill.AutofillId p0, android.view.inputmethod.InlineSuggestionsResponse p1) {}
    void consumeInlineSuggestionsResponse(android.view.inputmethod.InlineSuggestionsResponse p0) {}

    private static final class InlineSuggestionsResponseCallbackImpl extends com.android.internal.inputmethod.IInlineSuggestionsResponseCallback.Stub {
        void invalidate() {}
        public void onInlineSuggestionsResponse(android.view.autofill.AutofillId p0, android.view.inputmethod.InlineSuggestionsResponse p1) {}
    }
}
