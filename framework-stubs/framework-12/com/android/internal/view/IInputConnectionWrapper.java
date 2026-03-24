package com.android.internal.view;

public final class IInputConnectionWrapper extends com.android.internal.view.IInputContext.Stub {
    private static final java.lang.String TAG = "IInputConnectionWrapper";
    private static final boolean DEBUG = false;
    private static final int DO_GET_TEXT_AFTER_CURSOR = 10;
    private static final int DO_GET_TEXT_BEFORE_CURSOR = 20;
    private static final int DO_GET_SELECTED_TEXT = 25;
    private static final int DO_GET_CURSOR_CAPS_MODE = 30;
    private static final int DO_GET_EXTRACTED_TEXT = 40;
    private static final int DO_COMMIT_TEXT = 50;
    private static final int DO_COMMIT_COMPLETION = 55;
    private static final int DO_COMMIT_CORRECTION = 56;
    private static final int DO_SET_SELECTION = 57;
    private static final int DO_PERFORM_EDITOR_ACTION = 58;
    private static final int DO_PERFORM_CONTEXT_MENU_ACTION = 59;
    private static final int DO_SET_COMPOSING_TEXT = 60;
    private static final int DO_SET_COMPOSING_REGION = 63;
    private static final int DO_FINISH_COMPOSING_TEXT = 65;
    private static final int DO_SEND_KEY_EVENT = 70;
    private static final int DO_DELETE_SURROUNDING_TEXT = 80;
    private static final int DO_DELETE_SURROUNDING_TEXT_IN_CODE_POINTS = 81;
    private static final int DO_BEGIN_BATCH_EDIT = 90;
    private static final int DO_END_BATCH_EDIT = 95;
    private static final int DO_PERFORM_SPELL_CHECK = 110;
    private static final int DO_PERFORM_PRIVATE_COMMAND = 120;
    private static final int DO_CLEAR_META_KEY_STATES = 130;
    private static final int DO_REQUEST_UPDATE_CURSOR_ANCHOR_INFO = 140;
    private static final int DO_CLOSE_CONNECTION = 150;
    private static final int DO_COMMIT_CONTENT = 160;
    private static final int DO_GET_SURROUNDING_TEXT = 41;
    private static final int DO_SET_IME_CONSUMES_INPUT = 170;
    private android.view.inputmethod.InputConnection mInputConnection;
    private android.os.Looper mMainLooper;
    private android.os.Handler mH;
    private final java.lang.Object mLock = null;
    private boolean mFinished;
    private final android.view.inputmethod.InputMethodManager mParentInputMethodManager = null;
    private final java.lang.ref.WeakReference<android.view.View> mServedView = null;
    public IInputConnectionWrapper(android.os.Looper p0, android.view.inputmethod.InputConnection p1, android.view.inputmethod.InputMethodManager p2, android.view.View p3) { super(); }
    public android.view.inputmethod.InputConnection getInputConnection() { return null; }
    private boolean isFinished() { return false; }
    public boolean isActive() { return false; }
    public android.view.View getServedView() { return null; }
    public void deactivate() {}
    public java.lang.String toString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void getTextAfterCursor(int p0, int p1, com.android.internal.inputmethod.ICharSequenceResultCallback p2) {}
    public void getTextBeforeCursor(int p0, int p1, com.android.internal.inputmethod.ICharSequenceResultCallback p2) {}
    public void getSelectedText(int p0, com.android.internal.inputmethod.ICharSequenceResultCallback p1) {}
    public void getSurroundingText(int p0, int p1, int p2, com.android.internal.inputmethod.ISurroundingTextResultCallback p3) {}
    public void getCursorCapsMode(int p0, com.android.internal.inputmethod.IIntResultCallback p1) {}
    public void getExtractedText(android.view.inputmethod.ExtractedTextRequest p0, int p1, com.android.internal.inputmethod.IExtractedTextResultCallback p2) {}
    public void commitText(java.lang.CharSequence p0, int p1) {}
    public void commitCompletion(android.view.inputmethod.CompletionInfo p0) {}
    public void commitCorrection(android.view.inputmethod.CorrectionInfo p0) {}
    public void setSelection(int p0, int p1) {}
    public void performEditorAction(int p0) {}
    public void performContextMenuAction(int p0) {}
    public void setComposingRegion(int p0, int p1) {}
    public void setComposingText(java.lang.CharSequence p0, int p1) {}
    public void finishComposingText() {}
    public void sendKeyEvent(android.view.KeyEvent p0) {}
    public void clearMetaKeyStates(int p0) {}
    public void deleteSurroundingText(int p0, int p1) {}
    public void deleteSurroundingTextInCodePoints(int p0, int p1) {}
    public void beginBatchEdit() {}
    public void endBatchEdit() {}
    public void performSpellCheck() {}
    public void performPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
    public void requestUpdateCursorAnchorInfo(int p0, com.android.internal.inputmethod.IIntResultCallback p1) {}
    public void closeConnection() {}
    public void commitContent(android.view.inputmethod.InputContentInfo p0, int p1, android.os.Bundle p2, com.android.internal.inputmethod.IIntResultCallback p3) {}
    public void setImeConsumesInput(boolean p0) {}
    void dispatchMessage(android.os.Message p0) {}
    void executeMessage(android.os.Message p0) {}
    android.os.Message obtainMessage(int p0) { return null; }
    android.os.Message obtainMessageII(int p0, int p1, int p2) { return null; }
    android.os.Message obtainMessageO(int p0, java.lang.Object p1) { return null; }
    android.os.Message obtainMessageIO(int p0, int p1, java.lang.Object p2) { return null; }
    android.os.Message obtainMessageOO(int p0, java.lang.Object p1, java.lang.Object p2) { return null; }
    android.os.Message obtainMessageB(int p0, boolean p1) { return null; }

    class MyHandler extends android.os.Handler {
        MyHandler(com.android.internal.view.IInputConnectionWrapper p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
