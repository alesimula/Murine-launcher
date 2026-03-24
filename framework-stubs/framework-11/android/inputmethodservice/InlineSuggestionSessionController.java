package android.inputmethodservice;

class InlineSuggestionSessionController {
    private static final java.lang.String TAG = "InlineSuggestionSessionController";
    private final android.os.Handler mMainThreadHandler = null;
    private final java.util.function.Function<android.os.Bundle, android.view.inputmethod.InlineSuggestionsRequest> mRequestSupplier = null;
    private final java.util.function.Supplier<android.os.IBinder> mHostInputTokenSupplier = null;
    private final java.util.function.Consumer<android.view.inputmethod.InlineSuggestionsResponse> mResponseConsumer = null;
    private java.lang.String mImeClientPackageName;
    private android.view.autofill.AutofillId mImeClientFieldId;
    private boolean mImeInputStarted;
    private boolean mImeInputViewStarted;
    private android.inputmethodservice.InlineSuggestionSession mSession;
    InlineSuggestionSessionController(java.util.function.Function<android.os.Bundle, android.view.inputmethod.InlineSuggestionsRequest> p0, java.util.function.Supplier<android.os.IBinder> p1, java.util.function.Consumer<android.view.inputmethod.InlineSuggestionsResponse> p2) {}
    void onMakeInlineSuggestionsRequest(com.android.internal.view.InlineSuggestionsRequestInfo p0, com.android.internal.view.IInlineSuggestionsRequestCallback p1) {}
    void notifyOnStartInput(java.lang.String p0, android.view.autofill.AutofillId p1) {}
    void notifyOnShowInputRequested(boolean p0) {}
    void notifyOnStartInputView() {}
    void notifyOnFinishInputView() {}
    void notifyOnFinishInput() {}
    boolean match(com.android.internal.view.InlineSuggestionsRequestInfo p0) { return false; }
    boolean match(android.view.autofill.AutofillId p0) { return false; }
    private static boolean match(com.android.internal.view.InlineSuggestionsRequestInfo p0, java.lang.String p1, android.view.autofill.AutofillId p2) { return false; }
    private static boolean match(android.view.autofill.AutofillId p0, android.view.autofill.AutofillId p1) { return false; }
}
