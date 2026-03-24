package com.android.internal.inputmethod;

public final class EditableInputConnection extends android.view.inputmethod.BaseInputConnection implements android.view.inputmethod.DumpableInputConnection {
    public EditableInputConnection(android.widget.TextView p0) { super((android.view.View)null, false); }
    public android.text.Editable getEditable() { return null; }
    public boolean beginBatchEdit() { return false; }
    public boolean endBatchEdit() { return false; }
    public void endComposingRegionEditInternal() {}
    public void closeConnection() {}
    public boolean clearMetaKeyStates(int p0) { return false; }
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo p0) { return false; }
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo p0) { return false; }
    public boolean performEditorAction(int p0) { return false; }
    public boolean performContextMenuAction(int p0) { return false; }
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest p0, int p1) { return null; }
    public boolean performSpellCheck() { return false; }
    public boolean performPrivateCommand(java.lang.String p0, android.os.Bundle p1) { return false; }
    public boolean commitText(java.lang.CharSequence p0, int p1) { return false; }
    public boolean requestCursorUpdates(int p0, int p1) { return false; }
    public boolean requestCursorUpdates(int p0) { return false; }
    public void requestTextBoundsInfo(android.graphics.RectF p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.view.inputmethod.TextBoundsInfoResult> p2) {}
    public boolean setImeConsumesInput(boolean p0) { return false; }
    public void performHandwritingGesture(android.view.inputmethod.HandwritingGesture p0, java.util.concurrent.Executor p1, java.util.function.IntConsumer p2) {}
    public boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture p0, android.os.CancellationSignal p1) { return false; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
}
