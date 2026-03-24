package com.android.internal.inputmethod;

public final class IInputContextInvoker {
    public static com.android.internal.inputmethod.IInputContextInvoker create(com.android.internal.view.IInputContext p0) { return null; }
    public com.android.internal.inputmethod.IInputContextInvoker cloneWithSessionId(int p0) { return null; }
    public boolean isSameConnection(com.android.internal.view.IInputContext p0) { return false; }
    com.android.internal.inputmethod.InputConnectionCommandHeader createHeader() { return null; }
    public com.android.internal.infra.AndroidFuture<java.lang.CharSequence> getTextAfterCursor(int p0, int p1) { return null; }
    public com.android.internal.infra.AndroidFuture<java.lang.CharSequence> getTextBeforeCursor(int p0, int p1) { return null; }
    public com.android.internal.infra.AndroidFuture<java.lang.CharSequence> getSelectedText(int p0) { return null; }
    public com.android.internal.infra.AndroidFuture<android.view.inputmethod.SurroundingText> getSurroundingText(int p0, int p1, int p2) { return null; }
    public com.android.internal.infra.AndroidFuture<java.lang.Integer> getCursorCapsMode(int p0) { return null; }
    public com.android.internal.infra.AndroidFuture<android.view.inputmethod.ExtractedText> getExtractedText(android.view.inputmethod.ExtractedTextRequest p0, int p1) { return null; }
    public boolean commitText(java.lang.CharSequence p0, int p1) { return false; }
    public boolean commitText(java.lang.CharSequence p0, int p1, android.view.inputmethod.TextAttribute p2) { return false; }
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo p0) { return false; }
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo p0) { return false; }
    public boolean setSelection(int p0, int p1) { return false; }
    public boolean performEditorAction(int p0) { return false; }
    public boolean performContextMenuAction(int p0) { return false; }
    public boolean setComposingRegion(int p0, int p1) { return false; }
    public boolean setComposingRegion(int p0, int p1, android.view.inputmethod.TextAttribute p2) { return false; }
    public boolean setComposingText(java.lang.CharSequence p0, int p1) { return false; }
    public boolean setComposingText(java.lang.CharSequence p0, int p1, android.view.inputmethod.TextAttribute p2) { return false; }
    public boolean finishComposingText() { return false; }
    public boolean beginBatchEdit() { return false; }
    public boolean endBatchEdit() { return false; }
    public boolean sendKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean clearMetaKeyStates(int p0) { return false; }
    public boolean deleteSurroundingText(int p0, int p1) { return false; }
    public boolean deleteSurroundingTextInCodePoints(int p0, int p1) { return false; }
    public boolean performSpellCheck() { return false; }
    public boolean performPrivateCommand(java.lang.String p0, android.os.Bundle p1) { return false; }
    public com.android.internal.infra.AndroidFuture<java.lang.Boolean> requestCursorUpdates(int p0, int p1) { return null; }
    public com.android.internal.infra.AndroidFuture<java.lang.Boolean> requestCursorUpdates(int p0, int p1, int p2) { return null; }
    public com.android.internal.infra.AndroidFuture<java.lang.Boolean> commitContent(android.view.inputmethod.InputContentInfo p0, int p1, android.os.Bundle p2) { return null; }
    public boolean setImeConsumesInput(boolean p0) { return false; }
}
