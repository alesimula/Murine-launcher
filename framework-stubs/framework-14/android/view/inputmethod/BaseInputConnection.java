package android.view.inputmethod;

public class BaseInputConnection implements android.view.inputmethod.InputConnection {
    static final java.lang.Object COMPOSING = null;
    protected final android.view.inputmethod.InputMethodManager mIMM = null;
    final android.view.View mTargetView = null;
    final boolean mFallbackMode = false;
    android.text.Editable mEditable;
    android.view.KeyCharacterMap mKeyCharacterMap;
    BaseInputConnection(android.view.inputmethod.InputMethodManager p0, boolean p1) {}
    public BaseInputConnection(android.view.View p0, boolean p1) {}
    public static final void removeComposingSpans(android.text.Spannable p0) {}
    public static void setComposingSpans(android.text.Spannable p0) {}
    public static void setComposingSpans(android.text.Spannable p0, int p1, int p2) {}
    public static int getComposingSpanStart(android.text.Spannable p0) { return 0; }
    public static int getComposingSpanEnd(android.text.Spannable p0) { return 0; }
    public android.text.Editable getEditable() { return null; }
    public boolean beginBatchEdit() { return false; }
    public boolean endBatchEdit() { return false; }
    public void endComposingRegionEditInternal() {}
    public void closeConnection() {}
    public boolean clearMetaKeyStates(int p0) { return false; }
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo p0) { return false; }
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo p0) { return false; }
    public boolean commitText(java.lang.CharSequence p0, int p1) { return false; }
    public boolean deleteSurroundingText(int p0, int p1) { return false; }
    public boolean deleteSurroundingTextInCodePoints(int p0, int p1) { return false; }
    public boolean finishComposingText() { return false; }
    public int getCursorCapsMode(int p0) { return 0; }
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest p0, int p1) { return null; }
    public java.lang.CharSequence getTextBeforeCursor(int p0, int p1) { return null; }
    public java.lang.CharSequence getSelectedText(int p0) { return null; }
    public java.lang.CharSequence getTextAfterCursor(int p0, int p1) { return null; }
    public android.view.inputmethod.SurroundingText getSurroundingText(int p0, int p1, int p2) { return null; }
    public boolean performEditorAction(int p0) { return false; }
    public boolean performContextMenuAction(int p0) { return false; }
    public boolean performPrivateCommand(java.lang.String p0, android.os.Bundle p1) { return false; }
    public boolean requestCursorUpdates(int p0) { return false; }
    public android.os.Handler getHandler() { return null; }
    public boolean setComposingText(java.lang.CharSequence p0, int p1) { return false; }
    public boolean setComposingRegion(int p0, int p1) { return false; }
    public boolean setSelection(int p0, int p1) { return false; }
    public boolean sendKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean reportFullscreenMode(boolean p0) { return false; }
    public boolean replaceText(int p0, int p1, java.lang.CharSequence p2, int p3, android.view.inputmethod.TextAttribute p4) { return false; }
    public boolean commitContent(android.view.inputmethod.InputContentInfo p0, int p1, android.os.Bundle p2) { return false; }
    public android.view.inputmethod.TextSnapshot takeSnapshot() { return null; }
}
