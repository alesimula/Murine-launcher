package com.android.internal.widget;

public class EditableInputConnection extends android.view.inputmethod.BaseInputConnection {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "EditableInputConnection";
    private final android.widget.TextView mTextView = null;
    private int mBatchEditNesting;
    public EditableInputConnection(android.widget.TextView p0) { super((android.view.View)null, false); }
    public android.text.Editable getEditable() { return null; }
    public boolean beginBatchEdit() { return false; }
    public boolean endBatchEdit() { return false; }
    public void closeConnection() {}
    public boolean clearMetaKeyStates(int p0) { return false; }
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo p0) { return false; }
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo p0) { return false; }
    public boolean performEditorAction(int p0) { return false; }
    public boolean performContextMenuAction(int p0) { return false; }
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest p0, int p1) { return null; }
    public boolean performPrivateCommand(java.lang.String p0, android.os.Bundle p1) { return false; }
    public boolean commitText(java.lang.CharSequence p0, int p1) { return false; }
    public boolean requestCursorUpdates(int p0) { return false; }
}
