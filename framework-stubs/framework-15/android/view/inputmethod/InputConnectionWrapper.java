package android.view.inputmethod;

public class InputConnectionWrapper implements android.view.inputmethod.InputConnection {
    final boolean mMutable = false;
    public InputConnectionWrapper(android.view.inputmethod.InputConnection p0, boolean p1) {}
    public void setTarget(android.view.inputmethod.InputConnection p0) {}
    @android.annotation.Nullable
    public java.lang.CharSequence getTextBeforeCursor(int p0, int p1) { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getTextAfterCursor(int p0, int p1) { return null; }
    public java.lang.CharSequence getSelectedText(int p0) { return null; }
    @android.annotation.Nullable
    public android.view.inputmethod.SurroundingText getSurroundingText(int p0, int p1, int p2) { return null; }
    public int getCursorCapsMode(int p0) { return 0; }
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest p0, int p1) { return null; }
    public boolean deleteSurroundingTextInCodePoints(int p0, int p1) { return false; }
    public boolean deleteSurroundingText(int p0, int p1) { return false; }
    public boolean setComposingText(java.lang.CharSequence p0, int p1) { return false; }
    public boolean setComposingText(java.lang.CharSequence p0, int p1, android.view.inputmethod.TextAttribute p2) { return false; }
    public boolean setComposingRegion(int p0, int p1) { return false; }
    public boolean setComposingRegion(int p0, int p1, android.view.inputmethod.TextAttribute p2) { return false; }
    public boolean finishComposingText() { return false; }
    public boolean commitText(java.lang.CharSequence p0, int p1) { return false; }
    public boolean commitText(java.lang.CharSequence p0, int p1, android.view.inputmethod.TextAttribute p2) { return false; }
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
    public void performHandwritingGesture(android.view.inputmethod.HandwritingGesture p0, java.util.concurrent.Executor p1, java.util.function.IntConsumer p2) {}
    public boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture p0, android.os.CancellationSignal p1) { return false; }
    public boolean requestCursorUpdates(int p0) { return false; }
    public boolean requestCursorUpdates(int p0, int p1) { return false; }
    public void requestTextBoundsInfo(android.graphics.RectF p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.view.inputmethod.TextBoundsInfoResult> p2) {}
    public android.os.Handler getHandler() { return null; }
    public void closeConnection() {}
    public boolean commitContent(android.view.inputmethod.InputContentInfo p0, int p1, android.os.Bundle p2) { return false; }
    public boolean setImeConsumesInput(boolean p0) { return false; }
    @android.annotation.Nullable
    public android.view.inputmethod.TextSnapshot takeSnapshot() { return null; }
    public boolean replaceText(int p0, int p1, java.lang.CharSequence p2, int p3, android.view.inputmethod.TextAttribute p4) { return false; }
}
