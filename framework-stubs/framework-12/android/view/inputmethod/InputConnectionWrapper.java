package android.view.inputmethod;

public class InputConnectionWrapper implements android.view.inputmethod.InputConnection {
    private android.view.inputmethod.InputConnection mTarget;
    final boolean mMutable = false;
    private int mMissingMethodFlags;
    public InputConnectionWrapper(android.view.inputmethod.InputConnection p0, boolean p1) {}
    public void setTarget(android.view.inputmethod.InputConnection p0) {}
    public int getMissingMethodFlags() { return 0; }
    public java.lang.CharSequence getTextBeforeCursor(int p0, int p1) { return null; }
    public java.lang.CharSequence getTextAfterCursor(int p0, int p1) { return null; }
    public java.lang.CharSequence getSelectedText(int p0) { return null; }
    public android.view.inputmethod.SurroundingText getSurroundingText(int p0, int p1, int p2) { return null; }
    public int getCursorCapsMode(int p0) { return 0; }
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest p0, int p1) { return null; }
    public boolean deleteSurroundingTextInCodePoints(int p0, int p1) { return false; }
    public boolean deleteSurroundingText(int p0, int p1) { return false; }
    public boolean setComposingText(java.lang.CharSequence p0, int p1) { return false; }
    public boolean setComposingRegion(int p0, int p1) { return false; }
    public boolean finishComposingText() { return false; }
    public boolean commitText(java.lang.CharSequence p0, int p1) { return false; }
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo p0) { return false; }
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo p0) { return false; }
    public boolean setSelection(int p0, int p1) { return false; }
    public boolean performEditorAction(int p0) { return false; }
    public boolean performContextMenuAction(int p0) { return false; }
    public boolean beginBatchEdit() { return false; }
    public boolean endBatchEdit() { return false; }
    public boolean sendKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean clearMetaKeyStates(int p0) { return false; }
    public boolean reportFullscreenMode(boolean p0) { return false; }
    public boolean performSpellCheck() { return false; }
    public boolean performPrivateCommand(java.lang.String p0, android.os.Bundle p1) { return false; }
    public boolean requestCursorUpdates(int p0) { return false; }
    public android.os.Handler getHandler() { return null; }
    public void closeConnection() {}
    public boolean commitContent(android.view.inputmethod.InputContentInfo p0, int p1, android.os.Bundle p2) { return false; }
    public boolean setImeConsumesInput(boolean p0) { return false; }
}
