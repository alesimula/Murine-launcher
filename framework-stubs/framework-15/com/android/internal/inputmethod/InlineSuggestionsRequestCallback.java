package com.android.internal.inputmethod;

public interface InlineSuggestionsRequestCallback {
    public void onInlineSuggestionsUnsupported();
    public void onInlineSuggestionsRequest(android.view.inputmethod.InlineSuggestionsRequest p0, com.android.internal.inputmethod.IInlineSuggestionsResponseCallback p1);
    public void onInputMethodStartInput(android.view.autofill.AutofillId p0);
    public void onInputMethodShowInputRequested(boolean p0);
    public void onInputMethodStartInputView();
    public void onInputMethodFinishInputView();
    public void onInputMethodFinishInput();
    public void onInlineSuggestionsSessionInvalidated();
}
