package android.inputmethodservice;

class InlineSuggestionSessionController {
    InlineSuggestionSessionController(java.util.function.Function<android.os.Bundle, android.view.inputmethod.InlineSuggestionsRequest> p0, java.util.function.Supplier<android.os.IBinder> p1, java.util.function.Consumer<android.view.inputmethod.InlineSuggestionsResponse> p2) {}
    void onMakeInlineSuggestionsRequest(com.android.internal.inputmethod.InlineSuggestionsRequestInfo p0, com.android.internal.inputmethod.IInlineSuggestionsRequestCallback p1) {}
    void notifyOnStartInput(java.lang.String p0, android.view.autofill.AutofillId p1) {}
    void notifyOnShowInputRequested(boolean p0) {}
    void notifyOnStartInputView() {}
    void notifyOnFinishInputView() {}
    void notifyOnFinishInput() {}
    boolean match(com.android.internal.inputmethod.InlineSuggestionsRequestInfo p0) { return false; }
    boolean match(android.view.autofill.AutofillId p0) { return false; }
}
