package android.inputmethodservice;

class IInputMethodSessionWrapper extends com.android.internal.view.IInputMethodSession.Stub implements com.android.internal.os.HandlerCaller.Callback {
    private static final java.lang.String TAG = "InputMethodWrapper";
    private static final int DO_DISPLAY_COMPLETIONS = 65;
    private static final int DO_UPDATE_EXTRACTED_TEXT = 67;
    private static final int DO_UPDATE_SELECTION = 90;
    private static final int DO_UPDATE_CURSOR = 95;
    private static final int DO_UPDATE_CURSOR_ANCHOR_INFO = 99;
    private static final int DO_APP_PRIVATE_COMMAND = 100;
    private static final int DO_TOGGLE_SOFT_INPUT = 105;
    private static final int DO_FINISH_SESSION = 110;
    private static final int DO_VIEW_CLICKED = 115;
    private static final int DO_NOTIFY_IME_HIDDEN = 120;
    private static final int DO_REMOVE_IME_SURFACE = 130;
    com.android.internal.os.HandlerCaller mCaller;
    android.view.inputmethod.InputMethodSession mInputMethodSession;
    android.view.InputChannel mChannel;
    android.inputmethodservice.IInputMethodSessionWrapper.ImeInputEventReceiver mReceiver;
    public IInputMethodSessionWrapper(android.content.Context p0, android.view.inputmethod.InputMethodSession p1, android.view.InputChannel p2) { super(); }
    public android.view.inputmethod.InputMethodSession getInternalInputMethodSession() { return null; }
    public void executeMessage(android.os.Message p0) {}
    private void doFinishSession() {}
    public void displayCompletions(android.view.inputmethod.CompletionInfo[] p0) {}
    public void updateExtractedText(int p0, android.view.inputmethod.ExtractedText p1) {}
    public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
    public void viewClicked(boolean p0) {}
    public void notifyImeHidden() {}
    public void removeImeSurface() {}
    public void updateCursor(android.graphics.Rect p0) {}
    public void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0) {}
    public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
    public void toggleSoftInput(int p0, int p1) {}
    public void finishSession() {}

    private final class ImeInputEventReceiver extends android.view.InputEventReceiver implements android.view.inputmethod.InputMethodSession.EventCallback {
        private final android.util.SparseArray<android.view.InputEvent> mPendingEvents = null;
        public ImeInputEventReceiver(android.inputmethodservice.IInputMethodSessionWrapper p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
        public void onInputEvent(android.view.InputEvent p0) {}
        public void finishedEvent(int p0, boolean p1) {}
    }
}
