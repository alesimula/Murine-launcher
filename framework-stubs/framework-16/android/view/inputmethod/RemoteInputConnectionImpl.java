package android.view.inputmethod;

final class RemoteInputConnectionImpl extends com.android.internal.inputmethod.IRemoteInputConnection.Stub {
    RemoteInputConnectionImpl(android.os.Looper p0, android.view.inputmethod.InputConnection p1, android.view.inputmethod.InputMethodManager p2, android.view.View p3) { super(); }
    @android.annotation.Nullable
    public android.view.inputmethod.InputConnection getInputConnection() { return null; }
    public boolean hasPendingInvalidation() { return false; }
    public boolean isAssociatedWith(android.view.View p0) { return false; }
    public boolean resetHasPendingImmediateCursorAnchorInfoUpdate() { return false; }
    public boolean isCursorAnchorInfoMonitoring() { return false; }
    public void scheduleInvalidateInput() {}
    void scheduleInvalidateInput(boolean p0) {}
    public void deactivate() {}
    public void cancelCancellationSignal(android.os.IBinder p0) {}
    public void forgetCancellationSignal(android.os.IBinder p0) {}
    public java.lang.String toString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void dispatchReportFullscreenMode(boolean p0) {}
    public void getTextAfterCursor(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) {}
    public void getTextBeforeCursor(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) {}
    public void getSelectedText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, com.android.internal.infra.AndroidFuture p2) {}
    public void getSurroundingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, int p3, com.android.internal.infra.AndroidFuture p4) {}
    public void getCursorCapsMode(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, com.android.internal.infra.AndroidFuture p2) {}
    public void getExtractedText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.ExtractedTextRequest p1, int p2, com.android.internal.infra.AndroidFuture p3) {}
    public void commitText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2) {}
    public void commitTextWithTextAttribute(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2, android.view.inputmethod.TextAttribute p3) {}
    public void commitCompletion(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.CompletionInfo p1) {}
    public void commitCorrection(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.CorrectionInfo p1) {}
    public void setSelection(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) {}
    public void performEditorAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) {}
    public void performContextMenuAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) {}
    public void setComposingRegion(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) {}
    public void setComposingRegionWithTextAttribute(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, android.view.inputmethod.TextAttribute p3) {}
    public void setComposingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2) {}
    public void setComposingTextWithTextAttribute(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2, android.view.inputmethod.TextAttribute p3) {}
    public void finishComposingTextFromImm() {}
    public void finishComposingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0) {}
    public void sendKeyEvent(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.KeyEvent p1) {}
    public void clearMetaKeyStates(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) {}
    public void deleteSurroundingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) {}
    public void deleteSurroundingTextInCodePoints(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) {}
    public void beginBatchEdit(com.android.internal.inputmethod.InputConnectionCommandHeader p0) {}
    public void endBatchEdit(com.android.internal.inputmethod.InputConnectionCommandHeader p0) {}
    public void performSpellCheck(com.android.internal.inputmethod.InputConnectionCommandHeader p0) {}
    public void performPrivateCommand(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.String p1, android.os.Bundle p2) {}
    public void performHandwritingGesture(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.ParcelableHandwritingGesture p1, android.os.ResultReceiver p2) {}
    public void previewHandwritingGesture(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.ParcelableHandwritingGesture p1, android.os.IBinder p2) {}
    public void requestCursorUpdates(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) {}
    public void requestCursorUpdatesWithFilter(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, int p3, com.android.internal.infra.AndroidFuture p4) {}
    public void requestTextBoundsInfo(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.graphics.RectF p1, android.os.ResultReceiver p2) {}
    public void commitContent(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.InputContentInfo p1, int p2, android.os.Bundle p3, com.android.internal.infra.AndroidFuture p4) {}
    public void setImeConsumesInput(com.android.internal.inputmethod.InputConnectionCommandHeader p0, boolean p1) {}
    public void replaceText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, java.lang.CharSequence p3, int p4, android.view.inputmethod.TextAttribute p5) {}
    public com.android.internal.inputmethod.IRemoteAccessibilityInputConnection asIRemoteAccessibilityInputConnection() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface Dispatching {
        public boolean cancellable();
    }

    private static final class KnownAlwaysTrueEndBatchEditCache {
        static boolean contains(java.lang.Class<? extends android.view.inputmethod.InputConnection> p0) { return false; }
        static void add(java.lang.Class<? extends android.view.inputmethod.InputConnection> p0) {}
    }
}
