package com.android.internal.view;

public class InputConnectionWrapper implements android.view.inputmethod.InputConnection {
    private static final java.lang.String TAG = "InputConnectionWrapper";
    private static final int MAX_WAIT_TIME_MILLIS = 2000;
    private final com.android.internal.view.IInputContext mIInputContext = null;
    private final java.lang.ref.WeakReference<android.inputmethodservice.AbstractInputMethodService> mInputMethodService = null;
    private final int mMissingMethods = 0;
    private final com.android.internal.inputmethod.CancellationGroup mCancellationGroup = null;
    public InputConnectionWrapper(java.lang.ref.WeakReference<android.inputmethodservice.AbstractInputMethodService> p0, com.android.internal.view.IInputContext p1, int p2, com.android.internal.inputmethod.CancellationGroup p3) {}
    public java.lang.CharSequence getTextAfterCursor(int p0, int p1) { return null; }
    public java.lang.CharSequence getTextBeforeCursor(int p0, int p1) { return null; }
    public java.lang.CharSequence getSelectedText(int p0) { return null; }
    public android.view.inputmethod.SurroundingText getSurroundingText(int p0, int p1, int p2) { return null; }
    public int getCursorCapsMode(int p0) { return 0; }
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest p0, int p1) { return null; }
    public boolean commitText(java.lang.CharSequence p0, int p1) { return false; }
    private void notifyUserActionIfNecessary() {}
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo p0) { return false; }
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo p0) { return false; }
    public boolean setSelection(int p0, int p1) { return false; }
    public boolean performEditorAction(int p0) { return false; }
    public boolean performContextMenuAction(int p0) { return false; }
    public boolean setComposingRegion(int p0, int p1) { return false; }
    public boolean setComposingText(java.lang.CharSequence p0, int p1) { return false; }
    public boolean finishComposingText() { return false; }
    public boolean beginBatchEdit() { return false; }
    public boolean endBatchEdit() { return false; }
    public boolean sendKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean clearMetaKeyStates(int p0) { return false; }
    public boolean deleteSurroundingText(int p0, int p1) { return false; }
    public boolean deleteSurroundingTextInCodePoints(int p0, int p1) { return false; }
    public boolean reportFullscreenMode(boolean p0) { return false; }
    public boolean performSpellCheck() { return false; }
    public boolean performPrivateCommand(java.lang.String p0, android.os.Bundle p1) { return false; }
    public boolean requestCursorUpdates(int p0) { return false; }
    public android.os.Handler getHandler() { return null; }
    public void closeConnection() {}
    public boolean commitContent(android.view.inputmethod.InputContentInfo p0, int p1, android.os.Bundle p2) { return false; }
    public boolean setImeConsumesInput(boolean p0) { return false; }
    private boolean isMethodMissing(int p0) { return false; }
    public java.lang.String toString() { return null; }
}
