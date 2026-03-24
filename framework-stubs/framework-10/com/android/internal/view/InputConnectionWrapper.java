package com.android.internal.view;

public class InputConnectionWrapper implements android.view.inputmethod.InputConnection {
    private static final int MAX_WAIT_TIME_MILLIS = 2000;
    private final com.android.internal.view.IInputContext mIInputContext = null;
    private final java.lang.ref.WeakReference<android.inputmethodservice.AbstractInputMethodService> mInputMethodService = null;
    private final int mMissingMethods = 0;
    private final java.util.concurrent.atomic.AtomicBoolean mIsUnbindIssued = null;
    public InputConnectionWrapper(java.lang.ref.WeakReference<android.inputmethodservice.AbstractInputMethodService> p0, com.android.internal.view.IInputContext p1, int p2, java.util.concurrent.atomic.AtomicBoolean p3) {}
    public java.lang.CharSequence getTextAfterCursor(int p0, int p1) { return null; }
    public java.lang.CharSequence getTextBeforeCursor(int p0, int p1) { return null; }
    public java.lang.CharSequence getSelectedText(int p0) { return null; }
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
    public boolean performPrivateCommand(java.lang.String p0, android.os.Bundle p1) { return false; }
    public boolean requestCursorUpdates(int p0) { return false; }
    public android.os.Handler getHandler() { return null; }
    public void closeConnection() {}
    public boolean commitContent(android.view.inputmethod.InputContentInfo p0, int p1, android.os.Bundle p2) { return false; }
    private boolean isMethodMissing(int p0) { return false; }
    public java.lang.String toString() { return null; }

    static class InputContextCallback extends com.android.internal.view.IInputContextCallback.Stub {
        private static final java.lang.String TAG = "InputConnectionWrapper.ICC";
        public int mSeq;
        public boolean mHaveValue;
        public java.lang.CharSequence mTextBeforeCursor;
        public java.lang.CharSequence mTextAfterCursor;
        public java.lang.CharSequence mSelectedText;
        public android.view.inputmethod.ExtractedText mExtractedText;
        public int mCursorCapsMode;
        public boolean mRequestUpdateCursorAnchorInfoResult;
        public boolean mCommitContentResult;
        private static com.android.internal.view.InputConnectionWrapper.InputContextCallback sInstance;
        private static int sSequenceNumber;
        InputContextCallback() { super(); }
        @android.annotation.UnsupportedAppUsage
        private static com.android.internal.view.InputConnectionWrapper.InputContextCallback getInstance() { return null; }
        @android.annotation.UnsupportedAppUsage
        private void dispose() {}
        public void setTextBeforeCursor(java.lang.CharSequence p0, int p1) {}
        public void setTextAfterCursor(java.lang.CharSequence p0, int p1) {}
        public void setSelectedText(java.lang.CharSequence p0, int p1) {}
        public void setCursorCapsMode(int p0, int p1) {}
        public void setExtractedText(android.view.inputmethod.ExtractedText p0, int p1) {}
        public void setRequestUpdateCursorAnchorInfoResult(boolean p0, int p1) {}
        public void setCommitContentResult(boolean p0, int p1) {}
        void waitForResultLocked() {}
    }
}
