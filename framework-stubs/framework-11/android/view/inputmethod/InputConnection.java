package android.view.inputmethod;

public interface InputConnection {
    public static final int GET_TEXT_WITH_STYLES = 1;
    public static final int GET_EXTRACTED_TEXT_MONITOR = 1;
    public static final int CURSOR_UPDATE_IMMEDIATE = 1;
    public static final int CURSOR_UPDATE_MONITOR = 2;
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;
    public java.lang.CharSequence getTextBeforeCursor(int p0, int p1);
    public java.lang.CharSequence getTextAfterCursor(int p0, int p1);
    public java.lang.CharSequence getSelectedText(int p0);
    public int getCursorCapsMode(int p0);
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest p0, int p1);
    public boolean deleteSurroundingText(int p0, int p1);
    public boolean deleteSurroundingTextInCodePoints(int p0, int p1);
    public boolean setComposingText(java.lang.CharSequence p0, int p1);
    public boolean setComposingRegion(int p0, int p1);
    public boolean finishComposingText();
    public boolean commitText(java.lang.CharSequence p0, int p1);
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo p0);
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo p0);
    public boolean setSelection(int p0, int p1);
    public boolean performEditorAction(int p0);
    public boolean performContextMenuAction(int p0);
    public boolean beginBatchEdit();
    public boolean endBatchEdit();
    public boolean sendKeyEvent(android.view.KeyEvent p0);
    public boolean clearMetaKeyStates(int p0);
    public boolean reportFullscreenMode(boolean p0);
    public boolean performPrivateCommand(java.lang.String p0, android.os.Bundle p1);
    public boolean requestCursorUpdates(int p0);
    public android.os.Handler getHandler();
    public void closeConnection();
    public boolean commitContent(android.view.inputmethod.InputContentInfo p0, int p1, android.os.Bundle p2);
}
