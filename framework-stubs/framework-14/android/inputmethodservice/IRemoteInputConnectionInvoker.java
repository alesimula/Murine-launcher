package android.inputmethodservice;

final class IRemoteInputConnectionInvoker {
    public static android.inputmethodservice.IRemoteInputConnectionInvoker create(com.android.internal.inputmethod.IRemoteInputConnection p0) { return null; }
    public android.inputmethodservice.IRemoteInputConnectionInvoker cloneWithSessionId(int p0) { return null; }
    public boolean isSameConnection(com.android.internal.inputmethod.IRemoteInputConnection p0) { return false; }
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
    public void performHandwritingGesture(android.view.inputmethod.HandwritingGesture p0, java.util.concurrent.Executor p1, java.util.function.IntConsumer p2) {}
    public boolean previewHandwritingGesture(android.view.inputmethod.HandwritingGesture p0, android.os.CancellationSignal p1) { return false; }
    android.os.CancellationSignalBeamer.Sender.CloseableToken beam(android.os.CancellationSignal p0) { return null; }
    public com.android.internal.infra.AndroidFuture<java.lang.Boolean> requestCursorUpdates(int p0, int p1) { return null; }
    public com.android.internal.infra.AndroidFuture<java.lang.Boolean> requestCursorUpdates(int p0, int p1, int p2) { return null; }
    public void requestTextBoundsInfo(android.graphics.RectF p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.view.inputmethod.TextBoundsInfoResult> p2) {}
    public com.android.internal.infra.AndroidFuture<java.lang.Boolean> commitContent(android.view.inputmethod.InputContentInfo p0, int p1, android.os.Bundle p2) { return null; }
    public boolean setImeConsumesInput(boolean p0) { return false; }
    public boolean replaceText(int p0, int p1, java.lang.CharSequence p2, int p3, android.view.inputmethod.TextAttribute p4) { return false; }

    private static final class IntResultReceiver extends android.inputmethodservice.IRemoteInputConnectionInvoker.OnceResultReceiver<java.util.function.IntConsumer> {
        IntResultReceiver(java.util.concurrent.Executor p0, java.util.function.IntConsumer p1) { super(null, null); }
        protected void dispatch(java.util.concurrent.Executor p0, java.util.function.IntConsumer p1, int p2, android.os.Bundle p3) {}
    }

    private static abstract class OnceResultReceiver<C extends java.lang.Object> extends android.os.ResultReceiver {
        protected OnceResultReceiver(java.util.concurrent.Executor p0, C p1) { super((android.os.Handler)null); }
        protected final void onReceiveResult(int p0, android.os.Bundle p1) {}
        protected abstract void dispatch(java.util.concurrent.Executor p0, C p1, int p2, android.os.Bundle p3);
    }

    private static final class TextBoundsInfoResultReceiver extends android.inputmethodservice.IRemoteInputConnectionInvoker.OnceResultReceiver<java.util.function.Consumer<android.view.inputmethod.TextBoundsInfoResult>> {
        TextBoundsInfoResultReceiver(java.util.concurrent.Executor p0, java.util.function.Consumer<android.view.inputmethod.TextBoundsInfoResult> p1) { super(null, null); }
        protected void dispatch(java.util.concurrent.Executor p0, java.util.function.Consumer<android.view.inputmethod.TextBoundsInfoResult> p1, int p2, android.os.Bundle p3) {}
    }
}
